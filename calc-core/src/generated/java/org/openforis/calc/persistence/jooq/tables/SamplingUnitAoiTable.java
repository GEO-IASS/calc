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
public class SamplingUnitAoiTable extends org.jooq.impl.UpdatableTableImpl<org.openforis.calc.persistence.jooq.tables.records.SamplingUnitAoiRecord> {

	private static final long serialVersionUID = -1307591470;

	/**
	 * The singleton instance of calc.sampling_unit_aoi
	 */
	public static final org.openforis.calc.persistence.jooq.tables.SamplingUnitAoiTable SAMPLING_UNIT_AOI = new org.openforis.calc.persistence.jooq.tables.SamplingUnitAoiTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.calc.persistence.jooq.tables.records.SamplingUnitAoiRecord> getRecordType() {
		return org.openforis.calc.persistence.jooq.tables.records.SamplingUnitAoiRecord.class;
	}

	/**
	 * The table column <code>calc.sampling_unit_aoi.sampling_unit_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT sampling_unit_aoi__aoi_sampling_unit_fkey
	 * FOREIGN KEY (sampling_unit_id)
	 * REFERENCES calc.sampling_unit (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.SamplingUnitAoiRecord, java.lang.Integer> SAMPLING_UNIT_ID = createField("sampling_unit_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.sampling_unit_aoi.aoi_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT sampling_unit_aoi__sampling_unit_aoi_fkey
	 * FOREIGN KEY (aoi_id)
	 * REFERENCES calc.aoi (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.SamplingUnitAoiRecord, java.lang.Integer> AOI_ID = createField("aoi_id", org.jooq.impl.SQLDataType.INTEGER, this);

	public SamplingUnitAoiTable() {
		super("sampling_unit_aoi", org.openforis.calc.persistence.jooq.CalcTable.CALC);
	}

	public SamplingUnitAoiTable(java.lang.String alias) {
		super(alias, org.openforis.calc.persistence.jooq.CalcTable.CALC, org.openforis.calc.persistence.jooq.tables.SamplingUnitAoiTable.SAMPLING_UNIT_AOI);
	}

	@Override
	public org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.SamplingUnitAoiRecord> getMainKey() {
		return org.openforis.calc.persistence.jooq.Keys.SAMPLE_PLOT_AOI_PKEY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.SamplingUnitAoiRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.SamplingUnitAoiRecord>>asList(org.openforis.calc.persistence.jooq.Keys.SAMPLE_PLOT_AOI_PKEY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.SamplingUnitAoiRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.SamplingUnitAoiRecord, ?>>asList(org.openforis.calc.persistence.jooq.Keys.SAMPLING_UNIT_AOI__AOI_SAMPLING_UNIT_FKEY, org.openforis.calc.persistence.jooq.Keys.SAMPLING_UNIT_AOI__SAMPLING_UNIT_AOI_FKEY);
	}

	@Override
	public org.openforis.calc.persistence.jooq.tables.SamplingUnitAoiTable as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.SamplingUnitAoiTable(alias);
	}
}
