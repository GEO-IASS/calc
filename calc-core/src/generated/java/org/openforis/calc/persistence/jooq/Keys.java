/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>calc</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.AoiRecord, java.lang.Integer> IDENTITY_AOI = Identities0.IDENTITY_AOI;
	public static final org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.AoiHierarchyRecord, java.lang.Integer> IDENTITY_AOI_HIERARCHY = Identities0.IDENTITY_AOI_HIERARCHY;
	public static final org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.AoiLevelRecord, java.lang.Integer> IDENTITY_AOI_LEVEL = Identities0.IDENTITY_AOI_LEVEL;
	public static final org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.CalculationStepRecord, java.lang.Integer> IDENTITY_CALCULATION_STEP = Identities0.IDENTITY_CALCULATION_STEP;
	public static final org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.EntityRecord, java.lang.Integer> IDENTITY_ENTITY = Identities0.IDENTITY_ENTITY;
	public static final org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.EquationRecord, java.lang.Long> IDENTITY_EQUATION = Identities0.IDENTITY_EQUATION;
	public static final org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.EquationListRecord, java.lang.Long> IDENTITY_EQUATION_LIST = Identities0.IDENTITY_EQUATION_LIST;
	public static final org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.ProcessingChainRecord, java.lang.Integer> IDENTITY_PROCESSING_CHAIN = Identities0.IDENTITY_PROCESSING_CHAIN;
	public static final org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.SamplingDesignRecord, java.lang.Integer> IDENTITY_SAMPLING_DESIGN = Identities0.IDENTITY_SAMPLING_DESIGN;
	public static final org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.StratumRecord, java.lang.Integer> IDENTITY_STRATUM = Identities0.IDENTITY_STRATUM;
	public static final org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.VariableRecord, java.lang.Integer> IDENTITY_VARIABLE = Identities0.IDENTITY_VARIABLE;
	public static final org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.VariableAggregateRecord, java.lang.Integer> IDENTITY_VARIABLE_AGGREGATE = Identities0.IDENTITY_VARIABLE_AGGREGATE;
	public static final org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord, java.lang.Integer> IDENTITY_WORKSPACE = Identities0.IDENTITY_WORKSPACE;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.AoiRecord> AOI_PKEY = UniqueKeys0.AOI_PKEY;
	public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.AoiHierarchyRecord> AOI_HIERARCHY_PKEY = UniqueKeys0.AOI_HIERARCHY_PKEY;
	public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.AoiHierarchyRecord> AOI_HIERARCHY_NAME = UniqueKeys0.AOI_HIERARCHY_NAME;
	public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.AoiLevelRecord> AOI_HIERARCHY_LEVEL_PKEY = UniqueKeys0.AOI_HIERARCHY_LEVEL_PKEY;
	public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.AoiLevelRecord> AOI_LEVEL_HIERARCHY_NAME_KEY = UniqueKeys0.AOI_LEVEL_HIERARCHY_NAME_KEY;
	public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.AoiLevelRecord> AOI_LEVEL_HIERARCHY_RANK_KEY = UniqueKeys0.AOI_LEVEL_HIERARCHY_RANK_KEY;
	public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.CalculationStepRecord> CALCULATION_STEP_PKEY = UniqueKeys0.CALCULATION_STEP_PKEY;
	public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.EntityRecord> ENTITY_PKEY = UniqueKeys0.ENTITY_PKEY;
	public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.EntityRecord> ENTITY_WORKSPACE_ID_NAME_KEY = UniqueKeys0.ENTITY_WORKSPACE_ID_NAME_KEY;
	public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.EquationRecord> EQUATION_PKEY = UniqueKeys0.EQUATION_PKEY;
	public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.EquationListRecord> EQUATION_LIST_PKEY = UniqueKeys0.EQUATION_LIST_PKEY;
	public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.ProcessingChainRecord> PROCESSING_CHAIN_PKEY = UniqueKeys0.PROCESSING_CHAIN_PKEY;
	public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.SamplingDesignRecord> PKEY = UniqueKeys0.PKEY;
	public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.StratumRecord> STRATUM_PKEY = UniqueKeys0.STRATUM_PKEY;
	public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.StratumRecord> STRATUM_STRATUM_NO_WORKSPACE_ID_KEY = UniqueKeys0.STRATUM_STRATUM_NO_WORKSPACE_ID_KEY;
	public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.VariableRecord> VARIABLE_PKEY = UniqueKeys0.VARIABLE_PKEY;
	public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.VariableAggregateRecord> VARIABLE_AGGREGATE_PKEY = UniqueKeys0.VARIABLE_AGGREGATE_PKEY;
	public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord> WORKSPACE_PKEY = UniqueKeys0.WORKSPACE_PKEY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.AoiRecord, org.openforis.calc.persistence.jooq.tables.records.AoiLevelRecord> AOI__AOI_LEVEL_FKEY = ForeignKeys0.AOI__AOI_LEVEL_FKEY;
	public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.AoiRecord, org.openforis.calc.persistence.jooq.tables.records.AoiRecord> AOI__AOI_PARENT_FKEY = ForeignKeys0.AOI__AOI_PARENT_FKEY;
	public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.AoiHierarchyRecord, org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord> AOI_HIERARCHY__AOI_HIERARCHY_WORKSPACE_FKEY = ForeignKeys0.AOI_HIERARCHY__AOI_HIERARCHY_WORKSPACE_FKEY;
	public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.AoiLevelRecord, org.openforis.calc.persistence.jooq.tables.records.AoiHierarchyRecord> AOI_LEVEL__AOI_LEVEL_HIERARCHY_FKEY = ForeignKeys0.AOI_LEVEL__AOI_LEVEL_HIERARCHY_FKEY;
	public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.CalculationStepRecord, org.openforis.calc.persistence.jooq.tables.records.ProcessingChainRecord> CALCULATION_STEP__CALCULATION_STEP_PROCESSING_CHAIN_FKEY = ForeignKeys0.CALCULATION_STEP__CALCULATION_STEP_PROCESSING_CHAIN_FKEY;
	public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.CalculationStepRecord, org.openforis.calc.persistence.jooq.tables.records.VariableRecord> CALCULATION_STEP__CALCULATION_STEP_VARIABLE_FKEY = ForeignKeys0.CALCULATION_STEP__CALCULATION_STEP_VARIABLE_FKEY;
	public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.CalculationStepRecord, org.openforis.calc.persistence.jooq.tables.records.EquationListRecord> CALCULATION_STEP__CALCULATION_STEP_EQUATION_LIST_FK = ForeignKeys0.CALCULATION_STEP__CALCULATION_STEP_EQUATION_LIST_FK;
	public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.EntityRecord, org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord> ENTITY__ENTITY_WORKSPACE_FKEY = ForeignKeys0.ENTITY__ENTITY_WORKSPACE_FKEY;
	public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.EntityRecord, org.openforis.calc.persistence.jooq.tables.records.EntityRecord> ENTITY__ENTITY_PARENT_FKEY = ForeignKeys0.ENTITY__ENTITY_PARENT_FKEY;
	public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.EquationRecord, org.openforis.calc.persistence.jooq.tables.records.EquationListRecord> EQUATION__EQUATION_EQUATION_LIST_FK = ForeignKeys0.EQUATION__EQUATION_EQUATION_LIST_FK;
	public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.EquationListRecord, org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord> EQUATION_LIST__EQUATION_LIST_WORKSPACE_FK = ForeignKeys0.EQUATION_LIST__EQUATION_LIST_WORKSPACE_FK;
	public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.ProcessingChainRecord, org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord> PROCESSING_CHAIN__PROCESSING_CHAIN_WORKSPACE_FKEY = ForeignKeys0.PROCESSING_CHAIN__PROCESSING_CHAIN_WORKSPACE_FKEY;
	public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.SamplingDesignRecord, org.openforis.calc.persistence.jooq.tables.records.EntityRecord> SAMPLING_DESIGN__SAMPLING_DESIGN_SAMPLING_UNIT_FKEY = ForeignKeys0.SAMPLING_DESIGN__SAMPLING_DESIGN_SAMPLING_UNIT_FKEY;
	public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.SamplingDesignRecord, org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord> SAMPLING_DESIGN__SAMPLING_DESIGN_WORKPSACE_FK = ForeignKeys0.SAMPLING_DESIGN__SAMPLING_DESIGN_WORKPSACE_FK;
	public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.StratumRecord, org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord> STRATUM__STRATUM_WORKSPACE_FKEY = ForeignKeys0.STRATUM__STRATUM_WORKSPACE_FKEY;
	public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.VariableRecord, org.openforis.calc.persistence.jooq.tables.records.EntityRecord> VARIABLE__VARIABLE_ENTITY_FKEY = ForeignKeys0.VARIABLE__VARIABLE_ENTITY_FKEY;
	public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.VariableRecord, org.openforis.calc.persistence.jooq.tables.records.VariableRecord> VARIABLE__VARIABLE_VARIABLE_PER_HA_FKEY = ForeignKeys0.VARIABLE__VARIABLE_VARIABLE_PER_HA_FKEY;
	public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.VariableAggregateRecord, org.openforis.calc.persistence.jooq.tables.records.VariableRecord> VARIABLE_AGGREGATE__VARIABLE_AGGREGATE_VARIABLE_FKEY = ForeignKeys0.VARIABLE_AGGREGATE__VARIABLE_AGGREGATE_VARIABLE_FKEY;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.AoiRecord, java.lang.Integer> IDENTITY_AOI = createIdentity(org.openforis.calc.persistence.jooq.tables.AoiTable.AOI, org.openforis.calc.persistence.jooq.tables.AoiTable.AOI.ID);
		public static org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.AoiHierarchyRecord, java.lang.Integer> IDENTITY_AOI_HIERARCHY = createIdentity(org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY, org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY.ID);
		public static org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.AoiLevelRecord, java.lang.Integer> IDENTITY_AOI_LEVEL = createIdentity(org.openforis.calc.persistence.jooq.tables.AoiLevelTable.AOI_LEVEL, org.openforis.calc.persistence.jooq.tables.AoiLevelTable.AOI_LEVEL.ID);
		public static org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.CalculationStepRecord, java.lang.Integer> IDENTITY_CALCULATION_STEP = createIdentity(org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP, org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.ID);
		public static org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.EntityRecord, java.lang.Integer> IDENTITY_ENTITY = createIdentity(org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY, org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY.ID);
		public static org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.EquationRecord, java.lang.Long> IDENTITY_EQUATION = createIdentity(org.openforis.calc.persistence.jooq.tables.EquationTable.EQUATION, org.openforis.calc.persistence.jooq.tables.EquationTable.EQUATION.ID);
		public static org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.EquationListRecord, java.lang.Long> IDENTITY_EQUATION_LIST = createIdentity(org.openforis.calc.persistence.jooq.tables.EquationListTable.EQUATION_LIST, org.openforis.calc.persistence.jooq.tables.EquationListTable.EQUATION_LIST.ID);
		public static org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.ProcessingChainRecord, java.lang.Integer> IDENTITY_PROCESSING_CHAIN = createIdentity(org.openforis.calc.persistence.jooq.tables.ProcessingChainTable.PROCESSING_CHAIN, org.openforis.calc.persistence.jooq.tables.ProcessingChainTable.PROCESSING_CHAIN.ID);
		public static org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.SamplingDesignRecord, java.lang.Integer> IDENTITY_SAMPLING_DESIGN = createIdentity(org.openforis.calc.persistence.jooq.tables.SamplingDesignTable.SAMPLING_DESIGN, org.openforis.calc.persistence.jooq.tables.SamplingDesignTable.SAMPLING_DESIGN.ID);
		public static org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.StratumRecord, java.lang.Integer> IDENTITY_STRATUM = createIdentity(org.openforis.calc.persistence.jooq.tables.StratumTable.STRATUM, org.openforis.calc.persistence.jooq.tables.StratumTable.STRATUM.ID);
		public static org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.VariableRecord, java.lang.Integer> IDENTITY_VARIABLE = createIdentity(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE, org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.ID);
		public static org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.VariableAggregateRecord, java.lang.Integer> IDENTITY_VARIABLE_AGGREGATE = createIdentity(org.openforis.calc.persistence.jooq.tables.VariableAggregateTable.VARIABLE_AGGREGATE, org.openforis.calc.persistence.jooq.tables.VariableAggregateTable.VARIABLE_AGGREGATE.ID);
		public static org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord, java.lang.Integer> IDENTITY_WORKSPACE = createIdentity(org.openforis.calc.persistence.jooq.tables.WorkspaceTable.WORKSPACE, org.openforis.calc.persistence.jooq.tables.WorkspaceTable.WORKSPACE.ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.AoiRecord> AOI_PKEY = createUniqueKey(org.openforis.calc.persistence.jooq.tables.AoiTable.AOI, org.openforis.calc.persistence.jooq.tables.AoiTable.AOI.ID);
		public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.AoiHierarchyRecord> AOI_HIERARCHY_PKEY = createUniqueKey(org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY, org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY.ID);
		public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.AoiHierarchyRecord> AOI_HIERARCHY_NAME = createUniqueKey(org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY, org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY.WORKSPACE_ID, org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY.NAME);
		public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.AoiLevelRecord> AOI_HIERARCHY_LEVEL_PKEY = createUniqueKey(org.openforis.calc.persistence.jooq.tables.AoiLevelTable.AOI_LEVEL, org.openforis.calc.persistence.jooq.tables.AoiLevelTable.AOI_LEVEL.ID);
		public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.AoiLevelRecord> AOI_LEVEL_HIERARCHY_NAME_KEY = createUniqueKey(org.openforis.calc.persistence.jooq.tables.AoiLevelTable.AOI_LEVEL, org.openforis.calc.persistence.jooq.tables.AoiLevelTable.AOI_LEVEL.AOI_HIERARCHY_ID, org.openforis.calc.persistence.jooq.tables.AoiLevelTable.AOI_LEVEL.NAME);
		public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.AoiLevelRecord> AOI_LEVEL_HIERARCHY_RANK_KEY = createUniqueKey(org.openforis.calc.persistence.jooq.tables.AoiLevelTable.AOI_LEVEL, org.openforis.calc.persistence.jooq.tables.AoiLevelTable.AOI_LEVEL.AOI_HIERARCHY_ID, org.openforis.calc.persistence.jooq.tables.AoiLevelTable.AOI_LEVEL.RANK);
		public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.CalculationStepRecord> CALCULATION_STEP_PKEY = createUniqueKey(org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP, org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.ID);
		public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.EntityRecord> ENTITY_PKEY = createUniqueKey(org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY, org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY.ID);
		public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.EntityRecord> ENTITY_WORKSPACE_ID_NAME_KEY = createUniqueKey(org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY, org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY.WORKSPACE_ID, org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY.NAME);
		public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.EquationRecord> EQUATION_PKEY = createUniqueKey(org.openforis.calc.persistence.jooq.tables.EquationTable.EQUATION, org.openforis.calc.persistence.jooq.tables.EquationTable.EQUATION.ID);
		public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.EquationListRecord> EQUATION_LIST_PKEY = createUniqueKey(org.openforis.calc.persistence.jooq.tables.EquationListTable.EQUATION_LIST, org.openforis.calc.persistence.jooq.tables.EquationListTable.EQUATION_LIST.ID);
		public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.ProcessingChainRecord> PROCESSING_CHAIN_PKEY = createUniqueKey(org.openforis.calc.persistence.jooq.tables.ProcessingChainTable.PROCESSING_CHAIN, org.openforis.calc.persistence.jooq.tables.ProcessingChainTable.PROCESSING_CHAIN.ID);
		public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.SamplingDesignRecord> PKEY = createUniqueKey(org.openforis.calc.persistence.jooq.tables.SamplingDesignTable.SAMPLING_DESIGN, org.openforis.calc.persistence.jooq.tables.SamplingDesignTable.SAMPLING_DESIGN.ID);
		public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.StratumRecord> STRATUM_PKEY = createUniqueKey(org.openforis.calc.persistence.jooq.tables.StratumTable.STRATUM, org.openforis.calc.persistence.jooq.tables.StratumTable.STRATUM.ID);
		public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.StratumRecord> STRATUM_STRATUM_NO_WORKSPACE_ID_KEY = createUniqueKey(org.openforis.calc.persistence.jooq.tables.StratumTable.STRATUM, org.openforis.calc.persistence.jooq.tables.StratumTable.STRATUM.STRATUM_NO, org.openforis.calc.persistence.jooq.tables.StratumTable.STRATUM.WORKSPACE_ID);
		public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.VariableRecord> VARIABLE_PKEY = createUniqueKey(org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE, org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.ID);
		public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.VariableAggregateRecord> VARIABLE_AGGREGATE_PKEY = createUniqueKey(org.openforis.calc.persistence.jooq.tables.VariableAggregateTable.VARIABLE_AGGREGATE, org.openforis.calc.persistence.jooq.tables.VariableAggregateTable.VARIABLE_AGGREGATE.ID);
		public static final org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord> WORKSPACE_PKEY = createUniqueKey(org.openforis.calc.persistence.jooq.tables.WorkspaceTable.WORKSPACE, org.openforis.calc.persistence.jooq.tables.WorkspaceTable.WORKSPACE.ID);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.AoiRecord, org.openforis.calc.persistence.jooq.tables.records.AoiLevelRecord> AOI__AOI_LEVEL_FKEY = createForeignKey(org.openforis.calc.persistence.jooq.Keys.AOI_HIERARCHY_LEVEL_PKEY, org.openforis.calc.persistence.jooq.tables.AoiTable.AOI, org.openforis.calc.persistence.jooq.tables.AoiTable.AOI.AOI_LEVEL_ID);
		public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.AoiRecord, org.openforis.calc.persistence.jooq.tables.records.AoiRecord> AOI__AOI_PARENT_FKEY = createForeignKey(org.openforis.calc.persistence.jooq.Keys.AOI_PKEY, org.openforis.calc.persistence.jooq.tables.AoiTable.AOI, org.openforis.calc.persistence.jooq.tables.AoiTable.AOI.PARENT_AOI_ID);
		public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.AoiHierarchyRecord, org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord> AOI_HIERARCHY__AOI_HIERARCHY_WORKSPACE_FKEY = createForeignKey(org.openforis.calc.persistence.jooq.Keys.WORKSPACE_PKEY, org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY, org.openforis.calc.persistence.jooq.tables.AoiHierarchyTable.AOI_HIERARCHY.WORKSPACE_ID);
		public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.AoiLevelRecord, org.openforis.calc.persistence.jooq.tables.records.AoiHierarchyRecord> AOI_LEVEL__AOI_LEVEL_HIERARCHY_FKEY = createForeignKey(org.openforis.calc.persistence.jooq.Keys.AOI_HIERARCHY_PKEY, org.openforis.calc.persistence.jooq.tables.AoiLevelTable.AOI_LEVEL, org.openforis.calc.persistence.jooq.tables.AoiLevelTable.AOI_LEVEL.AOI_HIERARCHY_ID);
		public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.CalculationStepRecord, org.openforis.calc.persistence.jooq.tables.records.ProcessingChainRecord> CALCULATION_STEP__CALCULATION_STEP_PROCESSING_CHAIN_FKEY = createForeignKey(org.openforis.calc.persistence.jooq.Keys.PROCESSING_CHAIN_PKEY, org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP, org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.CHAIN_ID);
		public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.CalculationStepRecord, org.openforis.calc.persistence.jooq.tables.records.VariableRecord> CALCULATION_STEP__CALCULATION_STEP_VARIABLE_FKEY = createForeignKey(org.openforis.calc.persistence.jooq.Keys.VARIABLE_PKEY, org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP, org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.OUTPUT_VARIABLE_ID);
		public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.CalculationStepRecord, org.openforis.calc.persistence.jooq.tables.records.EquationListRecord> CALCULATION_STEP__CALCULATION_STEP_EQUATION_LIST_FK = createForeignKey(org.openforis.calc.persistence.jooq.Keys.EQUATION_LIST_PKEY, org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP, org.openforis.calc.persistence.jooq.tables.CalculationStepTable.CALCULATION_STEP.EQUATION_LIST_ID);
		public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.EntityRecord, org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord> ENTITY__ENTITY_WORKSPACE_FKEY = createForeignKey(org.openforis.calc.persistence.jooq.Keys.WORKSPACE_PKEY, org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY, org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY.WORKSPACE_ID);
		public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.EntityRecord, org.openforis.calc.persistence.jooq.tables.records.EntityRecord> ENTITY__ENTITY_PARENT_FKEY = createForeignKey(org.openforis.calc.persistence.jooq.Keys.ENTITY_PKEY, org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY, org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY.PARENT_ENTITY_ID);
		public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.EquationRecord, org.openforis.calc.persistence.jooq.tables.records.EquationListRecord> EQUATION__EQUATION_EQUATION_LIST_FK = createForeignKey(org.openforis.calc.persistence.jooq.Keys.EQUATION_LIST_PKEY, org.openforis.calc.persistence.jooq.tables.EquationTable.EQUATION, org.openforis.calc.persistence.jooq.tables.EquationTable.EQUATION.LIST_ID);
		public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.EquationListRecord, org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord> EQUATION_LIST__EQUATION_LIST_WORKSPACE_FK = createForeignKey(org.openforis.calc.persistence.jooq.Keys.WORKSPACE_PKEY, org.openforis.calc.persistence.jooq.tables.EquationListTable.EQUATION_LIST, org.openforis.calc.persistence.jooq.tables.EquationListTable.EQUATION_LIST.WORKSPACE_ID);
		public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.ProcessingChainRecord, org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord> PROCESSING_CHAIN__PROCESSING_CHAIN_WORKSPACE_FKEY = createForeignKey(org.openforis.calc.persistence.jooq.Keys.WORKSPACE_PKEY, org.openforis.calc.persistence.jooq.tables.ProcessingChainTable.PROCESSING_CHAIN, org.openforis.calc.persistence.jooq.tables.ProcessingChainTable.PROCESSING_CHAIN.WORKSPACE_ID);
		public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.SamplingDesignRecord, org.openforis.calc.persistence.jooq.tables.records.EntityRecord> SAMPLING_DESIGN__SAMPLING_DESIGN_SAMPLING_UNIT_FKEY = createForeignKey(org.openforis.calc.persistence.jooq.Keys.ENTITY_PKEY, org.openforis.calc.persistence.jooq.tables.SamplingDesignTable.SAMPLING_DESIGN, org.openforis.calc.persistence.jooq.tables.SamplingDesignTable.SAMPLING_DESIGN.SAMPLING_UNIT_ID);
		public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.SamplingDesignRecord, org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord> SAMPLING_DESIGN__SAMPLING_DESIGN_WORKPSACE_FK = createForeignKey(org.openforis.calc.persistence.jooq.Keys.WORKSPACE_PKEY, org.openforis.calc.persistence.jooq.tables.SamplingDesignTable.SAMPLING_DESIGN, org.openforis.calc.persistence.jooq.tables.SamplingDesignTable.SAMPLING_DESIGN.WORKSPACE_ID);
		public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.StratumRecord, org.openforis.calc.persistence.jooq.tables.records.WorkspaceRecord> STRATUM__STRATUM_WORKSPACE_FKEY = createForeignKey(org.openforis.calc.persistence.jooq.Keys.WORKSPACE_PKEY, org.openforis.calc.persistence.jooq.tables.StratumTable.STRATUM, org.openforis.calc.persistence.jooq.tables.StratumTable.STRATUM.WORKSPACE_ID);
		public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.VariableRecord, org.openforis.calc.persistence.jooq.tables.records.EntityRecord> VARIABLE__VARIABLE_ENTITY_FKEY = createForeignKey(org.openforis.calc.persistence.jooq.Keys.ENTITY_PKEY, org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE, org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.ENTITY_ID);
		public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.VariableRecord, org.openforis.calc.persistence.jooq.tables.records.VariableRecord> VARIABLE__VARIABLE_VARIABLE_PER_HA_FKEY = createForeignKey(org.openforis.calc.persistence.jooq.Keys.VARIABLE_PKEY, org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE, org.openforis.calc.persistence.jooq.tables.VariableTable.VARIABLE.VARIABLE_PER_HA_ID);
		public static final org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.VariableAggregateRecord, org.openforis.calc.persistence.jooq.tables.records.VariableRecord> VARIABLE_AGGREGATE__VARIABLE_AGGREGATE_VARIABLE_FKEY = createForeignKey(org.openforis.calc.persistence.jooq.Keys.VARIABLE_PKEY, org.openforis.calc.persistence.jooq.tables.VariableAggregateTable.VARIABLE_AGGREGATE, org.openforis.calc.persistence.jooq.tables.VariableAggregateTable.VARIABLE_AGGREGATE.VARIABLE_ID);
	}
}
