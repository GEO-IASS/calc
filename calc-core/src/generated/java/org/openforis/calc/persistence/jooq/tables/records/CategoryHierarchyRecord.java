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
import org.openforis.calc.persistence.jooq.tables.CategoryHierarchyTable;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CategoryHierarchyRecord extends UpdatableRecordImpl<CategoryHierarchyRecord> implements Record5<Integer, String, String, String, Long> {

	private static final long serialVersionUID = 1894778181;

	/**
	 * Setter for <code>calc.category_hierarchy.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>calc.category_hierarchy.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>calc.category_hierarchy.name</code>.
	 */
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>calc.category_hierarchy.name</code>.
	 */
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>calc.category_hierarchy.caption</code>.
	 */
	public void setCaption(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>calc.category_hierarchy.caption</code>.
	 */
	public String getCaption() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>calc.category_hierarchy.description</code>.
	 */
	public void setDescription(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>calc.category_hierarchy.description</code>.
	 */
	public String getDescription() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>calc.category_hierarchy.category_id</code>.
	 */
	public void setCategoryId(Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>calc.category_hierarchy.category_id</code>.
	 */
	public Long getCategoryId() {
		return (Long) getValue(4);
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
	public Row5<Integer, String, String, String, Long> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, String, String, String, Long> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return CategoryHierarchyTable.CATEGORY_HIERARCHY.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return CategoryHierarchyTable.CATEGORY_HIERARCHY.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return CategoryHierarchyTable.CATEGORY_HIERARCHY.CAPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return CategoryHierarchyTable.CATEGORY_HIERARCHY.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field5() {
		return CategoryHierarchyTable.CATEGORY_HIERARCHY.CATEGORY_ID;
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
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getCaption();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value5() {
		return getCategoryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CategoryHierarchyRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CategoryHierarchyRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CategoryHierarchyRecord value3(String value) {
		setCaption(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CategoryHierarchyRecord value4(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CategoryHierarchyRecord value5(Long value) {
		setCategoryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CategoryHierarchyRecord values(Integer value1, String value2, String value3, String value4, Long value5) {
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
	 * Create a detached CategoryHierarchyRecord
	 */
	public CategoryHierarchyRecord() {
		super(CategoryHierarchyTable.CATEGORY_HIERARCHY);
	}

	/**
	 * Create a detached, initialised CategoryHierarchyRecord
	 */
	public CategoryHierarchyRecord(Integer id, String name, String caption, String description, Long categoryId) {
		super(CategoryHierarchyTable.CATEGORY_HIERARCHY);

		setValue(0, id);
		setValue(1, name);
		setValue(2, caption);
		setValue(3, description);
		setValue(4, categoryId);
	}
}
