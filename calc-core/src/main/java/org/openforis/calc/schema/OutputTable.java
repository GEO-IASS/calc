package org.openforis.calc.schema;

import java.util.HashMap;
import java.util.Map;

import org.jooq.Field;
import org.openforis.calc.metadata.AoiHierarchyLevel;
import org.openforis.calc.metadata.BinaryVariable;
import org.openforis.calc.metadata.CategoricalVariable;
import org.openforis.calc.metadata.Entity;
import org.openforis.calc.metadata.QuantitativeVariable;

/**
 * 
 * @author G. Miceli
 * @author M. Togna
 * 
 */
public class OutputTable extends DataTable {

	private static final long serialVersionUID = 1L;
	private InputTable inputTable;
	private OutputTable parentTable;
	private Map<Field<?>, Field<?>> inputFields;
	
	OutputTable(Entity entity, OutputSchema schema, InputTable inputTable, OutputTable parentTable) {
		super(entity, entity.getDataTable(), schema);
		this.inputTable = inputTable;
		this.parentTable = parentTable;
		this.inputFields =  new HashMap<Field<?>, Field<?>>();
		createPrimaryKeyField();		
		addInputField(getIdField(), inputTable.getIdField());
		createCategoryValueFields(entity, false);
		createQuantityFields(false);
		createAoiIdFields();
		createCoordinateFields();
		createLocationField();
		createParentIdField();
	}

	private void addInputField(Field<?> outputField, Field<?> inputField) {
		if ( inputField != null && outputField != null ) {
			inputFields.put(outputField, inputField);
		}
	}

	@Override
	protected void createAoiIdField(AoiHierarchyLevel level, String fkColumn) {
		super.createAoiIdField(level, fkColumn);
		addInputField(getAoiIdField(level), inputTable.getAoiIdField(level));
	}
	
	@Override
	protected void createBinaryCategoryValueField(BinaryVariable var, String valueColumn) {
		super.createBinaryCategoryValueField(var, valueColumn);
		addInputField(getCategoryValueField(var), inputTable.getCategoryValueField(var));
	}
	
	@Override
	protected void createCategoryValueField(CategoricalVariable var, String valueColumn) {
		super.createCategoryValueField(var, valueColumn);
		addInputField(getCategoryValueField(var), inputTable.getCategoryValueField(var));
	}

	@Override
	protected void createQuantityField(QuantitativeVariable var, String valueColumn) {
		super.createQuantityField(var, valueColumn);
		addInputField(getQuantityField(var), inputTable.getQuantityField(var));
	}

	@Override
	protected void createCoordinateFields() {
		super.createCoordinateFields();
		addInputField(getXField(), inputTable.getXField());
		addInputField(getYField(), inputTable.getYField());
		addInputField(getSrsIdField(), inputTable.getSrsIdField());
	}

	@Override
	protected void createParentIdField() {
		super.createParentIdField();
		addInputField(getParentIdField(), inputTable.getParentIdField());
	}
	
	public InputTable getInputTable() {
		return inputTable;
	}

	public OutputTable getParentTable() {
		return parentTable;
	}

	public Field<?> getInputField(Field<?> outputField) {
		return inputFields.get(outputField);
	}
}
