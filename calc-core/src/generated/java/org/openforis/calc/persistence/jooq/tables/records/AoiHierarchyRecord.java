/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable;


/**
 * A particular AOI hierarchy, such as "Administrative Units" or "Ecological 
 * Zones".
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AoiHierarchyRecord extends UpdatableRecordImpl<AoiHierarchyRecord> implements Record5<Integer, Integer, String, String, String> {

	private static final long serialVersionUID = 2122385798;

	/**
	 * Setter for <code>calc.aoi_hierarchy.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>calc.aoi_hierarchy.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>calc.aoi_hierarchy.workspace_id</code>.
	 */
	public void setWorkspaceId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>calc.aoi_hierarchy.workspace_id</code>.
	 */
	public Integer getWorkspaceId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>calc.aoi_hierarchy.name</code>.
	 */
	public void setName(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>calc.aoi_hierarchy.name</code>.
	 */
	public String getName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>calc.aoi_hierarchy.caption</code>.
	 */
	public void setCaption(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>calc.aoi_hierarchy.caption</code>.
	 */
	public String getCaption() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>calc.aoi_hierarchy.description</code>.
	 */
	public void setDescription(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>calc.aoi_hierarchy.description</code>.
	 */
	public String getDescription() {
		return (String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Integer, String, String, String> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Integer, String, String, String> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return AoiHierarchyTable.AOI_HIERARCHY.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return AoiHierarchyTable.AOI_HIERARCHY.WORKSPACE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return AoiHierarchyTable.AOI_HIERARCHY.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return AoiHierarchyTable.AOI_HIERARCHY.CAPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return AoiHierarchyTable.AOI_HIERARCHY.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getWorkspaceId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getCaption();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AoiHierarchyRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AoiHierarchyRecord value2(Integer value) {
		setWorkspaceId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AoiHierarchyRecord value3(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AoiHierarchyRecord value4(String value) {
		setCaption(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AoiHierarchyRecord value5(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AoiHierarchyRecord values(Integer value1, Integer value2, String value3, String value4, String value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AoiHierarchyRecord
	 */
	public AoiHierarchyRecord() {
		super(AoiHierarchyTable.AOI_HIERARCHY);
	}

	/**
	 * Create a detached, initialised AoiHierarchyRecord
	 */
	public AoiHierarchyRecord(Integer id, Integer workspaceId, String name, String caption, String description) {
		super(AoiHierarchyTable.AOI_HIERARCHY);

		setValue(0, id);
		setValue(1, workspaceId);
		setValue(2, name);
		setValue(3, caption);
		setValue(4, description);
	}
}
