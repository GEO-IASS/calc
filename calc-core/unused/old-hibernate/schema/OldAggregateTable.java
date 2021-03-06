package org.openforis.calc.schema;

import static org.jooq.impl.SQLDataType.INTEGER;

import java.math.BigDecimal;
import java.util.HashMap;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.TableField;
import org.openforis.calc.metadata.AoiLevel;
import org.openforis.calc.metadata.BinaryVariable;
import org.openforis.calc.metadata.CategoricalVariable;
import org.openforis.calc.metadata.Entity;
import org.openforis.calc.metadata.MultiwayVariable;
import org.openforis.calc.metadata.VariableAggregate;

/**
 * 
 * @author G. Miceli
 * @author M. Togna
 * 
 */
public class OldAggregateTable extends OldFactTable {

	private static final long serialVersionUID = 1L;
	private static final String TABLE_NAME_FORMAT = "_%s_%s_stratum_agg";
	private static final String AGG_FACT_CNT_COLUMN = "_agg_cnt";
	
	private AoiLevel aoiHierarchyLevel;
	private TableField<Record, Integer> aggregateFactCountField;
	private OldFactTable sourceFactTable;

	OldAggregateTable(OldFactTable factTable, AoiLevel level) {
		super(factTable.getEntity(), getName(factTable, level), factTable.getSchema(), factTable, null);
		this.aoiHierarchyLevel = level;
		this.sourceFactTable = factTable;
		
//		dimensionIdFields = new HashMap<CategoricalVariable<?>, Field<Integer>>();
		measureFields = new HashMap<VariableAggregate, Field<BigDecimal>>();
		
		Entity entity = factTable.getEntity();
		
		createDimensionFieldsRecursive(entity);
		createStratumIdField();
		createAoiIdFields(level);
		createMeasureFields(entity);
		createAggregateFactCountField();
	}

	private static String getName(DataTable factTable, AoiLevel level) {
		String entityName = factTable.getEntity().getName();
		String levelName = level.getName();
		return String.format(TABLE_NAME_FORMAT, entityName, levelName);
	}

	public AoiLevel getAoiHierarchyLevel() {
		return aoiHierarchyLevel;
	}

	private void createAggregateFactCountField() {
		aggregateFactCountField = createField(AGG_FACT_CNT_COLUMN, INTEGER, this);
	}

	@Override
	protected void createBinaryCategoryValueField(BinaryVariable var, String valueColumn) {
		if ( var.isDisaggregate() ) {
			super.createBinaryCategoryValueField(var, valueColumn);
		}
	}
	
	@Override
	protected void createCategoryValueField(MultiwayVariable var, String valueColumn) {
		if ( var.isDisaggregate() ) {
			super.createCategoryValueField(var, valueColumn);
		}
	}
	
//	@Override
//	protected void createDimensionIdField(CategoricalVariable<?> var) {
//		if ( var.isDisaggregate() ) {
//			super.createDimensionIdField(var);
//		}
//	}
	
	public TableField<Record, Integer> getAggregateFactCountField() {
		return aggregateFactCountField;
	}

	public OldFactTable getSourceFactTable() {
		return sourceFactTable;
	}
}
