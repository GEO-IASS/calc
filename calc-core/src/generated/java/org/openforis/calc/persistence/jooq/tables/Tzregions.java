/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Tzregions extends org.jooq.impl.UpdatableTableImpl<org.openforis.calc.persistence.jooq.tables.records.TzregionsRecord> {

	private static final long serialVersionUID = -716601062;

	/**
	 * The singleton instance of calc.tzregions
	 */
	public static final org.openforis.calc.persistence.jooq.tables.Tzregions TZREGIONS = new org.openforis.calc.persistence.jooq.tables.Tzregions();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.calc.persistence.jooq.tables.records.TzregionsRecord> getRecordType() {
		return org.openforis.calc.persistence.jooq.tables.records.TzregionsRecord.class;
	}

	/**
	 * The table column <code>calc.tzregions.gid</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.TzregionsRecord, java.lang.Integer> GID = createField("gid", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.tzregions.cat</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.TzregionsRecord, java.lang.Long> CAT = createField("cat", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>calc.tzregions.dn</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.TzregionsRecord, java.lang.Long> DN = createField("dn", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>calc.tzregions.reg_name</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.TzregionsRecord, java.lang.String> REG_NAME = createField("reg_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.tzregions.land_prop</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.TzregionsRecord, java.math.BigDecimal> LAND_PROP = createField("land_prop", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The table column <code>calc.tzregions.total_area</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.TzregionsRecord, java.math.BigDecimal> TOTAL_AREA = createField("total_area", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The table column <code>calc.tzregions.geom</code>
	 * <p>
	 * The SQL type of this item (USER-DEFINED, geometry) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.TzregionsRecord, java.lang.Object> GEOM = createField("geom", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("USER-DEFINED"), this);

	public Tzregions() {
		super("tzregions", org.openforis.calc.persistence.jooq.Calc.CALC);
	}

	public Tzregions(java.lang.String alias) {
		super(alias, org.openforis.calc.persistence.jooq.Calc.CALC, org.openforis.calc.persistence.jooq.tables.Tzregions.TZREGIONS);
	}

	@Override
	public org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.TzregionsRecord, java.lang.Integer> getIdentity() {
		return org.openforis.calc.persistence.jooq.Keys.IDENTITY_TZREGIONS;
	}

	@Override
	public org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.TzregionsRecord> getMainKey() {
		return org.openforis.calc.persistence.jooq.Keys.TZREGIONS_PKEY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.TzregionsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.TzregionsRecord>>asList(org.openforis.calc.persistence.jooq.Keys.TZREGIONS_PKEY);
	}

	@Override
	public org.openforis.calc.persistence.jooq.tables.Tzregions as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.Tzregions(alias);
	}
}