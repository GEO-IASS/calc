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
public class AoiHierarchyRecord extends org.jooq.impl.UpdatableRecordImpl<org.openforis.calc.persistence.jooq.tables.records.AoiHierarchyRecord> {

	private static final long serialVersionUID = -1447591255;

	/**
	 * The table column <code>calc.aoi_hierarchy.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY.ID, value);
	}

	/**
	 * The table column <code>calc.aoi_hierarchy.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY.ID);
	}

	/**
	 * The table column <code>calc.aoi_hierarchy.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.openforis.calc.persistence.jooq.tables.records.AoiLevelRecord> fetchAoiLevelTableList() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.AoiLevelTable.AOI_LEVEL)
			.where(org.openforis.calc.persistence.jooq.tables.AoiLevelTable.AOI_LEVEL.AOI_HIERARCHY_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY.ID)))
			.fetch();
	}

	/**
	 * The table column <code>calc.aoi_hierarchy.workspace_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT aoi_hierarchy__aoi_hierarchy_workspace_fkey
	 * FOREIGN KEY (workspace_id)
	 * REFERENCES calc.workspace (id)
	 * </pre></code>
	 */
	public void setWorkspaceId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY.WORKSPACE_ID, value);
	}

	/**
	 * The table column <code>calc.aoi_hierarchy.workspace_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT aoi_hierarchy__aoi_hierarchy_workspace_fkey
	 * FOREIGN KEY (workspace_id)
	 * REFERENCES calc.workspace (id)
	 * </pre></code>
	 */
	public java.lang.Integer getWorkspaceId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY.WORKSPACE_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord 
	 * WorkspaceRecord}
	 */
	public void setWorkspaceId(org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY.WORKSPACE_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY.WORKSPACE_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.WorkspaceTable.WORKSPACE.ID));
		}
	}

	/**
	 * The table column <code>calc.aoi_hierarchy.workspace_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT aoi_hierarchy__aoi_hierarchy_workspace_fkey
	 * FOREIGN KEY (workspace_id)
	 * REFERENCES calc.workspace (id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord fetchWorkspaceTable() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.WorkspaceTable.WORKSPACE)
			.where(org.openforis.calc.persistence.jooq.tables.WorkspaceTable.WORKSPACE.ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY.WORKSPACE_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.aoi_hierarchy.caption</code>
	 */
	public void setCaption(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY.CAPTION, value);
	}

	/**
	 * The table column <code>calc.aoi_hierarchy.caption</code>
	 */
	public java.lang.String getCaption() {
		return getValue(org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY.CAPTION);
	}

	/**
	 * The table column <code>calc.aoi_hierarchy.description</code>
	 */
	public void setDescription(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY.DESCRIPTION, value);
	}

	/**
	 * The table column <code>calc.aoi_hierarchy.description</code>
	 */
	public java.lang.String getDescription() {
		return getValue(org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY.DESCRIPTION);
	}

	/**
	 * Create a detached AoiHierarchyRecord
	 */
	public AoiHierarchyRecord() {
		super(org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY);
	}
}
