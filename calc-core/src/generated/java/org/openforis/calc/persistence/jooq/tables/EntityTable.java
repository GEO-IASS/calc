/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EntityTable extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1937150147;

	/**
	 * The singleton instance of <code>calc.entity</code>
	 */
	public static final org.openforis.calc.persistence.jooq.tables.EntityTable ENTITY = new org.openforis.calc.persistence.jooq.tables.EntityTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>calc.entity.id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>calc.entity.workspace_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> WORKSPACE_ID = createField("workspace_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>calc.entity.parent_entity_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> PARENT_ENTITY_ID = createField("parent_entity_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>calc.entity.name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>calc.entity.data_table</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DATA_TABLE = createField("data_table", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>calc.entity.x_column</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> X_COLUMN = createField("x_column", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>calc.entity.y_column</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> Y_COLUMN = createField("y_column", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>calc.entity.srs_column</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SRS_COLUMN = createField("srs_column", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>calc.entity.location_column</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> LOCATION_COLUMN = createField("location_column", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>calc.entity.input</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> INPUT = createField("input", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>calc.entity.override</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> OVERRIDE = createField("override", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>calc.entity.id_column</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ID_COLUMN = createField("id_column", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>calc.entity.parent_id_column</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PARENT_ID_COLUMN = createField("parent_id_column", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>calc.entity.sampling_unit</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> SAMPLING_UNIT = createField("sampling_unit", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>calc.entity.unit_of_analysis</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Boolean> UNIT_OF_ANALYSIS = createField("unit_of_analysis", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The column <code>calc.entity.cluster_variable_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> CLUSTER_VARIABLE_ID = createField("cluster_variable_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>calc.entity.unit_no_variable_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> UNIT_NO_VARIABLE_ID = createField("unit_no_variable_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>calc.entity.original_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> ORIGINAL_ID = createField("original_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>calc.entity.caption</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CAPTION = createField("caption", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>calc.entity.description</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this);

	/**
	 * The column <code>calc.entity.sort_order</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> SORT_ORDER = createField("sort_order", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>calc.entity</code> table reference
	 */
	public EntityTable() {
		super("entity", org.openforis.calc.persistence.jooq.CalcSchema.CALC);
	}

	/**
	 * Create an aliased <code>calc.entity</code> table reference
	 */
	public EntityTable(java.lang.String alias) {
		super(alias, org.openforis.calc.persistence.jooq.CalcSchema.CALC, org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.Record, java.lang.Integer> getIdentity() {
		return org.openforis.calc.persistence.jooq.Keys.IDENTITY_ENTITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.Record> getPrimaryKey() {
		return org.openforis.calc.persistence.jooq.Keys.ENTITY_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.Record>>asList(org.openforis.calc.persistence.jooq.Keys.ENTITY_PKEY, org.openforis.calc.persistence.jooq.Keys.ENTITY_WORKSPACE_ID_NAME_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.Record, ?>>asList(org.openforis.calc.persistence.jooq.Keys.ENTITY__ENTITY_WORKSPACE_FKEY, org.openforis.calc.persistence.jooq.Keys.ENTITY__ENTITY_PARENT_FKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.openforis.calc.persistence.jooq.tables.EntityTable as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.EntityTable(alias);
	}
}
