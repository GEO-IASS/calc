/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ErrorSettingsTable extends org.jooq.impl.TableImpl<org.openforis.calc.persistence.jooq.tables.records.ErrorSettingsRecord> {

	private static final long serialVersionUID = 167485871;

	/**
	 * The singleton instance of <code>calc.error_settings</code>
	 */
	public static final org.openforis.calc.persistence.jooq.tables.ErrorSettingsTable ERROR_SETTINGS = new org.openforis.calc.persistence.jooq.tables.ErrorSettingsTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.calc.persistence.jooq.tables.records.ErrorSettingsRecord> getRecordType() {
		return org.openforis.calc.persistence.jooq.tables.records.ErrorSettingsRecord.class;
	}

	/**
	 * The column <code>calc.error_settings.id</code>.
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.ErrorSettingsRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>calc.error_settings.workspace_id</code>.
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.ErrorSettingsRecord, java.lang.Long> WORKSPACE_ID = createField("workspace_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>calc.error_settings.parameters</code>.
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.ErrorSettingsRecord, org.openforis.calc.engine.ParameterMap> PARAMETERS = createField("parameters", org.jooq.impl.SQLDataType.CLOB.nullable(false).defaulted(true).asConvertedDataType(new org.openforis.calc.persistence.jooq.ParameterMapConverter()), this, "");

	/**
	 * The column <code>calc.error_settings.script</code>.
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.ErrorSettingsRecord, java.lang.String> SCRIPT = createField("script", org.jooq.impl.SQLDataType.CLOB.defaulted(true), this, "");

	/**
	 * Create a <code>calc.error_settings</code> table reference
	 */
	public ErrorSettingsTable() {
		this("error_settings", null);
	}

	/**
	 * Create an aliased <code>calc.error_settings</code> table reference
	 */
	public ErrorSettingsTable(java.lang.String alias) {
		this(alias, org.openforis.calc.persistence.jooq.tables.ErrorSettingsTable.ERROR_SETTINGS);
	}

	private ErrorSettingsTable(java.lang.String alias, org.jooq.Table<org.openforis.calc.persistence.jooq.tables.records.ErrorSettingsRecord> aliased) {
		this(alias, aliased, null);
	}

	private ErrorSettingsTable(java.lang.String alias, org.jooq.Table<org.openforis.calc.persistence.jooq.tables.records.ErrorSettingsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.openforis.calc.persistence.jooq.CalcSchema.CALC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.ErrorSettingsRecord, java.lang.Long> getIdentity() {
		return org.openforis.calc.persistence.jooq.Keys.IDENTITY_ERROR_SETTINGS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.ErrorSettingsRecord> getPrimaryKey() {
		return org.openforis.calc.persistence.jooq.Keys.ERROR_SETTINGS_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.ErrorSettingsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.ErrorSettingsRecord>>asList(org.openforis.calc.persistence.jooq.Keys.ERROR_SETTINGS_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.ErrorSettingsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.ErrorSettingsRecord, ?>>asList(org.openforis.calc.persistence.jooq.Keys.ERROR_SETTINGS__ERROR_SETTINGS_WORKSPACE_FK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.openforis.calc.persistence.jooq.tables.ErrorSettingsTable as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.ErrorSettingsTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.openforis.calc.persistence.jooq.tables.ErrorSettingsTable rename(java.lang.String name) {
		return new org.openforis.calc.persistence.jooq.tables.ErrorSettingsTable(name, null);
	}
}
