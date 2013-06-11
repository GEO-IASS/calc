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
public class CategoryGroupTable extends org.jooq.impl.TableImpl<org.openforis.calc.persistence.jooq.tables.records.CategoryGroupRecord> {

	private static final long serialVersionUID = 692172585;

	/**
	 * The singleton instance of calc.category_group
	 */
	public static final org.openforis.calc.persistence.jooq.tables.CategoryGroupTable CATEGORY_GROUP = new org.openforis.calc.persistence.jooq.tables.CategoryGroupTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.calc.persistence.jooq.tables.records.CategoryGroupRecord> getRecordType() {
		return org.openforis.calc.persistence.jooq.tables.records.CategoryGroupRecord.class;
	}

	/**
	 * The table column <code>calc.category_group.group_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT category_group__category_group_fkey
	 * FOREIGN KEY (group_id)
	 * REFERENCES calc.group (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.CategoryGroupRecord, java.lang.Integer> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.category_group.category_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT category_group__group_category_fkey
	 * FOREIGN KEY (category_id)
	 * REFERENCES calc.category (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.CategoryGroupRecord, java.lang.Integer> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.INTEGER, this);

	public CategoryGroupTable() {
		super("category_group", org.openforis.calc.persistence.jooq.CalcTable.CALC);
	}

	public CategoryGroupTable(java.lang.String alias) {
		super(alias, org.openforis.calc.persistence.jooq.CalcTable.CALC, org.openforis.calc.persistence.jooq.tables.CategoryGroupTable.CATEGORY_GROUP);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.CategoryGroupRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.CategoryGroupRecord, ?>>asList(org.openforis.calc.persistence.jooq.Keys.CATEGORY_GROUP__CATEGORY_GROUP_FKEY, org.openforis.calc.persistence.jooq.Keys.CATEGORY_GROUP__GROUP_CATEGORY_FKEY);
	}

	@Override
	public org.openforis.calc.persistence.jooq.tables.CategoryGroupTable as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.CategoryGroupTable(alias);
	}
}
