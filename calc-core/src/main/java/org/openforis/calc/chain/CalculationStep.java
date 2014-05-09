package org.openforis.calc.chain;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.openforis.calc.engine.CalculationException;
import org.openforis.calc.engine.ParameterHashMap;
import org.openforis.calc.engine.ParameterMap;
import org.openforis.calc.engine.Workspace;
import org.openforis.calc.json.ParameterMapJsonSerializer;
import org.openforis.calc.metadata.CategoricalVariable;
import org.openforis.calc.metadata.Entity;
import org.openforis.calc.metadata.Equation;
import org.openforis.calc.metadata.EquationList;
import org.openforis.calc.metadata.Variable;
import org.openforis.calc.persistence.jooq.tables.pojos.CalculationStepBase;
import org.openforis.calc.r.RScript;
import org.openforis.calc.r.RVariable;
import org.openforis.calc.r.SetValue;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * A single user-defined step in a {@link ProcessingChain}
 * 
 * @author G. Miceli
 * @author S. Ricci
 * 
 */
public class CalculationStep extends CalculationStepBase {

	private static final long serialVersionUID = 1L;

	public static final String VARIABLE_PATTERN = "\\$(.+?)\\$";

	public enum Type {
		SCRIPT , EQUATION
	}
	
	@JsonIgnore
	private Variable<?> outputVariable;

	@JsonIgnore
	private ProcessingChain processingChain;


	public CalculationStep() {
		setParameters( new ParameterHashMap() );
	}

//	public Integer getOutputEntityId() {
//		return outputVariable == null ? null : outputVariable.getEntity().getId();
//	}

	public ProcessingChain getProcessingChain() {
		return this.processingChain;
	}

	public Variable<?> getOutputVariable() {
		return this.outputVariable;
	}

	public void setOutputVariable(Variable<?> outputVariable) {
		this.outputVariable = outputVariable;
		setOutputVariableId(outputVariable == null ? null: outputVariable.getId());
	}
	
	public Integer getOutputEntityId() {
		return outputVariable == null ? null: outputVariable.getEntityId();
	}
	
	public void setProcessingChain(ProcessingChain chain) {
		this.processingChain = chain;
		this.setChainId( chain == null ? null: chain.getId() );
	}

	@Override
	public String toString() {
		return String.format( "#%d: %s:%s:%s", getStepNo(), getModuleName(), getOperationName(), getModuleVersion() );
	}

	public RScript getRScript() {
		Variable<?> outputVariable = this.getOutputVariable();
		Entity entity = outputVariable.getEntity();
		return new RScript().rScript( getScript(), entity.getHierarchyVariables() );
	}

	/**
	 * Convenience method. left here for backwards compatibility. Use
	 * getRScript().getVariables() to get variables from script
	 * 
	 * @return
	 */
	@Deprecated
	public Set<String> getInputVariables() {
		return getRScript().getVariables();
	}

	public Set<String> getVariables() {
		Set<String> variables = getInputVariables();
		variables.add(getOutputVariable().getName());
		return variables;
	}
	
	@Override
	@JsonSerialize(using = ParameterMapJsonSerializer.class)
	public ParameterMap getParameters() {
		return super.getParameters();
	}

	public void setRScriptFromEquation() {
		Workspace workspace = getProcessingChain().getWorkspace();
		
		Variable<?> outputVariable = getOutputVariable();
		Entity entity = outputVariable.getEntity();
		RVariable rOutputVariable = r().variable( entity.getName(), outputVariable.getName() );
	
		EquationList equationList = workspace.getEquationListById( getEquationListId() );
		Iterator<Equation> iterator = equationList.getEquations().iterator();
		RScript rScript = getNextREquation(iterator, rOutputVariable);
		
		SetValue setValue = r().setValue( rOutputVariable, rScript );
		
		String script = setValue.toString();
		this.setScript( script  );
	}
	
	private RScript getNextREquation(Iterator<Equation> iterator, RVariable rOutputVariable) {
		
		Equation eq = iterator.next();
		
		String code = eq.getCode();
		String condition = eq.getCondition();
		
		StringBuffer sbCondition = new StringBuffer();
		RScript rCondition = null;
		if( StringUtils.isNotBlank( code ) || StringUtils.isNotBlank( condition)  ) {
			if(StringUtils.isNotBlank( code )) {
				sbCondition.append( rOutputVariable.toString() );
				sbCondition.append( " == " );
				if( getOutputVariable() instanceof CategoricalVariable ){
					sbCondition.append( "'" );
				}
				sbCondition.append( code );
				if( getOutputVariable() instanceof CategoricalVariable ){
					sbCondition.append( "'" );
				}
			}
			
			if(StringUtils.isNotBlank( condition )) {
				if( sbCondition.length() > 0 ) {
					sbCondition.append( " & " );
				}
				
				String expr = replaceVariables(condition);
				sbCondition.append( expr );
			}
			
			rCondition = r().rScript( sbCondition.toString() );
		}
		
		String equation = eq.getEquation();
		equation = replaceVariables(equation);
		RScript rEquation = r().rScript(equation);
		
		RScript rScript = null;
		if( iterator.hasNext() ) {
			if( rCondition == null ){
				throw new CalculationException( "Equation " + equation + " has neither code nor condition set" );
			}
			rScript = r().ifElse( rCondition, rEquation, getNextREquation(iterator, rOutputVariable) );
		} else {
			rScript = rEquation;
		}
		return rScript;
	}

	String replaceVariables( String string ) {
		Entity entity = outputVariable.getEntity();
		RVariable entityDf = r().variable( entity.getName() );

		String script = string;
		
		List<ParameterMap> varParams = getParameters().getList("variables");
		for (ParameterMap varParam : varParams) {
			Integer variableId = varParam.getInteger("variableId");
			Variable<?> variable = entity.getWorkspace().getVariableById(variableId);
			
			RVariable rVariable = r().variable( entityDf , variable.getName() );

			String equationVariable = varParam.getString( "equationVariable" );
			String rVar = rVariable.toString();
			rVar = rVar.replaceAll("\\$", "\\\\\\$");
			script = script.replaceAll( "\\b" + equationVariable + "\\b", rVar );
		}
		
		return script;
	}
	public static void main(String[] args) {
		String equationVariable = "dbh";
		String rVar = "tree$\"plot_no\"";
//		String rVar = "tree\\$plot_no";
		rVar = rVar.replaceAll("\\$", "\\\\\\$");
		String script = "0.0001 * dbh^2.032 * h^0.66";
		System.out.println(rVar);
		script = script.replaceAll( "\\b" + equationVariable + "\\b", rVar );
		System.out.println( script );
	}
	// 
	private RScript r() {
		return new RScript();
	}
	
//	public Type getType() {
////		String string = getParameters().getString( "type" );
////		Type type = Type.valueOf( string );
////		return type;
//		return Type.SCRIPT;
//	}
	
}