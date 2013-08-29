/**
 * 
 */
package org.openforis.calc.schema;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openforis.calc.engine.Workspace;
import org.openforis.calc.metadata.AoiHierarchy;
import org.openforis.calc.metadata.AoiHierarchyLevel;
import org.openforis.calc.metadata.CategoricalVariable;
import org.openforis.calc.metadata.Entity;
import org.openforis.calc.metadata.Variable;

/**
 * @author G. Miceli
 * @author M. Togna
 * 
 */
public class OutputSchema extends RelationalSchema {

	private static final long serialVersionUID = 1L;

	private Workspace workspace;
	private InputSchema inputSchema;
	private StratumDimensionTable stratumDimensionTable;
	private ExpansionFactorTable expansionFactorTable;
	private Map<Entity, OutputTable> outputTables;
	private Map<Entity, FactTable> factTables;
	private Map<CategoricalVariable, CategoryDimensionTable> categoryDimensionTables;
	private Map<AoiHierarchyLevel, AoiDimensionTable> aoiDimensionTables;
	private List<AggregateTable> aggregateTables;

	public OutputSchema(Workspace workspace, InputSchema inputSchema) {
		super(workspace.getOutputSchema());
		this.workspace = workspace;
		this.inputSchema = inputSchema;
		initCategoryDimensionTables();
		initStratumDimensionTable();
		initAoiDimensionTables();
		initOutputTables();
		initExpansionFactorTable();
		initFactTables();
	}

	private void initExpansionFactorTable() {
		this.expansionFactorTable = new ExpansionFactorTable(this);
	}

	private void initCategoryDimensionTables() {
		this.categoryDimensionTables = new HashMap<CategoricalVariable, CategoryDimensionTable>();
		List<Entity> entities = workspace.getEntities();
		for ( Entity entity : entities ) {
			// Add dimensions for categorical variables
			List<Variable> variables = entity.getVariables();
			for ( Variable var : variables ) {
				if ( var instanceof CategoricalVariable ) {
					CategoryDimensionTable table = new CategoryDimensionTable(this, (CategoricalVariable) var);
					addTable(table);
					categoryDimensionTables.put((CategoricalVariable) var, table);
				}
			}
		}
	}

	private void initFactTables() {
		this.factTables = new HashMap<Entity, FactTable>();
		this.aggregateTables = new ArrayList<AggregateTable>();
		List<Entity> entities = workspace.getEntities();
		for ( Entity entity : entities ) {
			initFactTables(entity, null);
		}		
	}

	/**
	 * Recursively initialize fact tables
	 */
	private void initFactTables(Entity entity, FactTable parentFact) {
		if ( entity.isUnitOfAnalysis() ) {
			OutputTable outputTable = outputTables.get(entity);
			FactTable factTable = new FactTable(entity, this, outputTable, parentFact);
			addTable(factTable);
			factTables.put(entity, factTable);
			
			// Create children fact tables
			List<Entity> children = entity.getChildren();
			for (Entity child : children) {
				initFactTables(child, factTable);
			}

			if ( entity.isSamplingUnit() ) {
				initAggregateTables(factTable);
			}
		}
	}

	private void initAggregateTables(FactTable factTable) {
		List<AoiHierarchy> aoiHierarchies = workspace.getAoiHierarchies();
		for (AoiHierarchy aoiHierarchy : aoiHierarchies) {
			List<AoiHierarchyLevel> levels = aoiHierarchy.getLevels();
			for (AoiHierarchyLevel level : levels) {
				AggregateTable aggregateTable = new AggregateTable(factTable, level);
				aggregateTables.add(aggregateTable);
			}
		}
	}
	
	private void initStratumDimensionTable() {
		this.stratumDimensionTable = new StratumDimensionTable(this);
	}

	private void initOutputTables() {
		this.outputTables = new HashMap<Entity, OutputTable>();
		Collection<Entity> entities = workspace.getRootEntities();
		for ( Entity entity : entities ) {
			initOutputTables(entity, null);
		}
	}

	/**
	 * Recursively add tables for each entity
	 */
	private void initOutputTables(Entity entity, OutputTable parentTable) {
		InputTable inputTable = inputSchema.getDataTable(entity);
		OutputTable outputTable = new OutputTable(entity, this, inputTable, parentTable);
		addTable(outputTable);
		outputTables.put(entity, outputTable);
		
		List<Entity> children = entity.getChildren();
		for (Entity child : children) {
			initOutputTables(child, outputTable);
		}
	}

	private void initAoiDimensionTables() {
		this.aoiDimensionTables = new HashMap<AoiHierarchyLevel, AoiDimensionTable>();
		List<AoiHierarchy> aoiHierarchies = workspace.getAoiHierarchies();
		for ( AoiHierarchy aoiHierarchy : aoiHierarchies ) {
			List<AoiHierarchyLevel> levels = aoiHierarchy.getLevels();
			for ( AoiHierarchyLevel level : levels ) {
				AoiDimensionTable table = new AoiDimensionTable(this, level);
				addTable(table);
				aoiDimensionTables.put(level, table);
			}
		}
	}

	public Workspace getWorkspace() {
		return workspace;
	}

	public InputSchema getInputSchema() {
		return inputSchema;
	}

	public StratumDimensionTable getStratumDimensionTable() {
		return stratumDimensionTable;
	}

	public Collection<OutputTable> getOutputTables() {
		return Collections.unmodifiableCollection(outputTables.values());
	}

	public Collection<CategoryDimensionTable> getCategoryDimensionTables() {
		return Collections.unmodifiableCollection(categoryDimensionTables.values());
	}

	public Collection<AoiDimensionTable> getAoiDimensionTables() {
		return Collections.unmodifiableCollection(aoiDimensionTables.values());
	}
	
	public AoiDimensionTable getAoiDimensionTable(AoiHierarchyLevel aoiHierarchyLevel) {
		return aoiDimensionTables.get(aoiHierarchyLevel);
	}

	public CategoryDimensionTable getCategoryDimensionTable(CategoricalVariable variable) {
		return categoryDimensionTables.get(variable);
	}

	public Collection<FactTable> getFactTables() {
		return Collections.unmodifiableCollection(factTables.values());
	}
	
	public ExpansionFactorTable getExpansionFactorTable() {
		return expansionFactorTable;
	}
	
	public List<AggregateTable> getAggregateTables() {
		return Collections.unmodifiableList(aggregateTables);
	}
}
