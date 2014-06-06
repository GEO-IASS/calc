/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CategoryRecord extends org.jooq.impl.UpdatableRecordImpl<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long, java.lang.String> {

	private static final long serialVersionUID = -1059172001;

	/**
	 * Setter for <code>calc.category.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>calc.category.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>calc.category.original_id</code>.
	 */
	public void setOriginalId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>calc.category.original_id</code>.
	 */
	public java.lang.Integer getOriginalId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>calc.category.caption</code>.
	 */
	public void setCaption(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>calc.category.caption</code>.
	 */
	public java.lang.String getCaption() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>calc.category.description</code>.
	 */
	public void setDescription(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>calc.category.description</code>.
	 */
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>calc.category.workspace_id</code>.
	 */
	public void setWorkspaceId(java.lang.Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>calc.category.workspace_id</code>.
	 */
	public java.lang.Long getWorkspaceId() {
		return (java.lang.Long) getValue(4);
	}

	/**
	 * Setter for <code>calc.category.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>calc.category.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long, java.lang.String> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long, java.lang.String> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.openforis.calc.persistence.jooq.tables.CategoryTable.CATEGORY.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.openforis.calc.persistence.jooq.tables.CategoryTable.CATEGORY.ORIGINAL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.openforis.calc.persistence.jooq.tables.CategoryTable.CATEGORY.CAPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.openforis.calc.persistence.jooq.tables.CategoryTable.CATEGORY.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field5() {
		return org.openforis.calc.persistence.jooq.tables.CategoryTable.CATEGORY.WORKSPACE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.openforis.calc.persistence.jooq.tables.CategoryTable.CATEGORY.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getOriginalId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getCaption();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value5() {
		return getWorkspaceId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CategoryRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CategoryRecord value2(java.lang.Integer value) {
		setOriginalId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CategoryRecord value3(java.lang.String value) {
		setCaption(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CategoryRecord value4(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CategoryRecord value5(java.lang.Long value) {
		setWorkspaceId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CategoryRecord value6(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CategoryRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.String value3, java.lang.String value4, java.lang.Long value5, java.lang.String value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CategoryRecord
	 */
	public CategoryRecord() {
		super(org.openforis.calc.persistence.jooq.tables.CategoryTable.CATEGORY);
	}

	/**
	 * Create a detached, initialised CategoryRecord
	 */
	public CategoryRecord(java.lang.Integer id, java.lang.Integer originalId, java.lang.String caption, java.lang.String description, java.lang.Long workspaceId, java.lang.String name) {
		super(org.openforis.calc.persistence.jooq.tables.CategoryTable.CATEGORY);

		setValue(0, id);
		setValue(1, originalId);
		setValue(2, caption);
		setValue(3, description);
		setValue(4, workspaceId);
		setValue(5, name);
	}
}