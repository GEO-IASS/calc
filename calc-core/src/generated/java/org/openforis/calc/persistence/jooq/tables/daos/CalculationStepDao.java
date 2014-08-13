/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables.daos;

import org.openforis.calc.chain.CalculationStep;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CalculationStepDao extends org.jooq.impl.DAOImpl<org.openforis.calc.persistence.jooq.tables.records.CalculationStepRecord, CalculationStep, java.lang.Integer> {

	/**
	 * Create a new CalculationStepDao without any configuration
	 */
	public CalculationStepDao() {
		super(org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP, CalculationStep.class);
	}

	/**
	 * Create a new CalculationStepDao with an attached configuration
	 */
	public CalculationStepDao(org.jooq.Configuration configuration) {
		super(org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP, CalculationStep.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(CalculationStep object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<CalculationStep> fetchById(java.lang.Integer... values) {
		return fetch(org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public CalculationStep fetchOneById(java.lang.Integer value) {
		return fetchOne(org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.ID, value);
	}

	/**
	 * Fetch records that have <code>chain_id IN (values)</code>
	 */
	public java.util.List<CalculationStep> fetchByChainId(java.lang.Integer... values) {
		return fetch(org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.CHAIN_ID, values);
	}

	/**
	 * Fetch records that have <code>step_no IN (values)</code>
	 */
	public java.util.List<CalculationStep> fetchByStepNo(java.lang.Integer... values) {
		return fetch(org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.STEP_NO, values);
	}

	/**
	 * Fetch records that have <code>module_name IN (values)</code>
	 */
	public java.util.List<CalculationStep> fetchByModuleName(java.lang.String... values) {
		return fetch(org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.MODULE_NAME, values);
	}

	/**
	 * Fetch records that have <code>module_version IN (values)</code>
	 */
	public java.util.List<CalculationStep> fetchByModuleVersion(java.lang.String... values) {
		return fetch(org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.MODULE_VERSION, values);
	}

	/**
	 * Fetch records that have <code>operation_name IN (values)</code>
	 */
	public java.util.List<CalculationStep> fetchByOperationName(java.lang.String... values) {
		return fetch(org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.OPERATION_NAME, values);
	}

	/**
	 * Fetch records that have <code>script IN (values)</code>
	 */
	public java.util.List<CalculationStep> fetchByScript(java.lang.String... values) {
		return fetch(org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.SCRIPT, values);
	}

	/**
	 * Fetch records that have <code>parameters IN (values)</code>
	 */
	public java.util.List<CalculationStep> fetchByParameters(org.openforis.calc.engine.ParameterMap... values) {
		return fetch(org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.PARAMETERS, values);
	}

	/**
	 * Fetch records that have <code>caption IN (values)</code>
	 */
	public java.util.List<CalculationStep> fetchByCaption(java.lang.String... values) {
		return fetch(org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.CAPTION, values);
	}

	/**
	 * Fetch records that have <code>description IN (values)</code>
	 */
	public java.util.List<CalculationStep> fetchByDescription(java.lang.String... values) {
		return fetch(org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.DESCRIPTION, values);
	}

	/**
	 * Fetch records that have <code>output_variable_id IN (values)</code>
	 */
	public java.util.List<CalculationStep> fetchByOutputVariableId(java.lang.Integer... values) {
		return fetch(org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.OUTPUT_VARIABLE_ID, values);
	}

	/**
	 * Fetch records that have <code>type IN (values)</code>
	 */
	public java.util.List<CalculationStep> fetchByType(org.openforis.calc.chain.CalculationStep.Type... values) {
		return fetch(org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.TYPE, values);
	}

	/**
	 * Fetch records that have <code>equation_list_id IN (values)</code>
	 */
	public java.util.List<CalculationStep> fetchByEquationListId(java.lang.Long... values) {
		return fetch(org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.EQUATION_LIST_ID, values);
	}

	/**
	 * Fetch records that have <code>aggregate_parameters IN (values)</code>
	 */
	public java.util.List<CalculationStep> fetchByAggregateParameters(org.openforis.calc.engine.ParameterMap... values) {
		return fetch(org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.AGGREGATE_PARAMETERS, values);
	}
}
