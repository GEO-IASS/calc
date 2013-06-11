/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class GroupRecord extends org.jooq.impl.UpdatableRecordImpl<org.openforis.calc.persistence.jooq.tables.records.GroupRecord> {

	private static final long serialVersionUID = -1561806960;

	/**
	 * The table column <code>calc.group.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.ID, value);
	}

	/**
	 * The table column <code>calc.group.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.ID);
	}

	/**
	 * The table column <code>calc.group.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.openforis.calc.persistence.jooq.tables.records.CategoryGroupRecord> fetchCategoryGroupTableList() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.CategoryGroupTable.CATEGORY_GROUP)
			.where(org.openforis.calc.persistence.jooq.tables.CategoryGroupTable.CATEGORY_GROUP.GROUP_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.ID)))
			.fetch();
	}

	/**
	 * The table column <code>calc.group.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.openforis.calc.persistence.jooq.tables.records.GroupRecord> fetchGroupTableList() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP)
			.where(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.PARENT_GROUP_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.ID)))
			.fetch();
	}

	/**
	 * The table column <code>calc.group.level_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT group__group_level_fkey
	 * FOREIGN KEY (level_id)
	 * REFERENCES calc.hierarchy_level (id)
	 * </pre></code>
	 */
	public void setLevelId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.LEVEL_ID, value);
	}

	/**
	 * The table column <code>calc.group.level_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT group__group_level_fkey
	 * FOREIGN KEY (level_id)
	 * REFERENCES calc.hierarchy_level (id)
	 * </pre></code>
	 */
	public java.lang.Integer getLevelId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.LEVEL_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.HierarchyLevelRecord 
	 * HierarchyLevelRecord}
	 */
	public void setLevelId(org.openforis.calc.persistence.jooq.tables.records.HierarchyLevelRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.LEVEL_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.LEVEL_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.HierarchyLevelTable.HIERARCHY_LEVEL.ID));
		}
	}

	/**
	 * The table column <code>calc.group.level_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT group__group_level_fkey
	 * FOREIGN KEY (level_id)
	 * REFERENCES calc.hierarchy_level (id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.HierarchyLevelRecord fetchHierarchyLevelTable() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.HierarchyLevelTable.HIERARCHY_LEVEL)
			.where(org.openforis.calc.persistence.jooq.tables.HierarchyLevelTable.HIERARCHY_LEVEL.ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.LEVEL_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.group.parent_group_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT group__parent_group_fkey
	 * FOREIGN KEY (parent_group_id)
	 * REFERENCES calc.group (id)
	 * </pre></code>
	 */
	public void setParentGroupId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.PARENT_GROUP_ID, value);
	}

	/**
	 * The table column <code>calc.group.parent_group_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT group__parent_group_fkey
	 * FOREIGN KEY (parent_group_id)
	 * REFERENCES calc.group (id)
	 * </pre></code>
	 */
	public java.lang.Integer getParentGroupId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.PARENT_GROUP_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.GroupRecord 
	 * GroupRecord}
	 */
	public void setParentGroupId(org.openforis.calc.persistence.jooq.tables.records.GroupRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.PARENT_GROUP_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.PARENT_GROUP_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.ID));
		}
	}

	/**
	 * The table column <code>calc.group.parent_group_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT group__parent_group_fkey
	 * FOREIGN KEY (parent_group_id)
	 * REFERENCES calc.group (id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.GroupRecord fetchGroupTable() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP)
			.where(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.PARENT_GROUP_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.group.code</code>
	 */
	public void setCode(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.CODE, value);
	}

	/**
	 * The table column <code>calc.group.code</code>
	 */
	public java.lang.String getCode() {
		return getValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.CODE);
	}

	/**
	 * The table column <code>calc.group.caption</code>
	 */
	public void setCaption(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.CAPTION, value);
	}

	/**
	 * The table column <code>calc.group.caption</code>
	 */
	public java.lang.String getCaption() {
		return getValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.CAPTION);
	}

	/**
	 * The table column <code>calc.group.description</code>
	 */
	public void setDescription(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.DESCRIPTION, value);
	}

	/**
	 * The table column <code>calc.group.description</code>
	 */
	public java.lang.String getDescription() {
		return getValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.DESCRIPTION);
	}

	/**
	 * The table column <code>calc.group.sort_order</code>
	 */
	public void setSortOrder(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.SORT_ORDER, value);
	}

	/**
	 * The table column <code>calc.group.sort_order</code>
	 */
	public java.lang.Integer getSortOrder() {
		return getValue(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP.SORT_ORDER);
	}

	/**
	 * Create a detached GroupRecord
	 */
	public GroupRecord() {
		super(org.openforis.calc.persistence.jooq.tables.GroupTable.GROUP);
	}
}
