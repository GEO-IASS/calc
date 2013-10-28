package org.openforis.calc.chain.post;

import static org.openforis.calc.mondrian.Rolap.DATA_TYPE_NUMERIC;
import static org.openforis.calc.mondrian.Rolap.DIMENSION_TYPE_STANDARD;
import static org.openforis.calc.mondrian.Rolap.NUMBER_FORMAT_STRING;
import static org.openforis.calc.mondrian.Rolap.createAggForeignKey;
import static org.openforis.calc.mondrian.Rolap.createAggLevel;
import static org.openforis.calc.mondrian.Rolap.createAggMeasure;
import static org.openforis.calc.mondrian.Rolap.createAggregateName;
import static org.openforis.calc.mondrian.Rolap.createCube;
import static org.openforis.calc.mondrian.Rolap.createDimensionUsage;
import static org.openforis.calc.mondrian.Rolap.createLevel;
import static org.openforis.calc.mondrian.Rolap.createMeasure;
import static org.openforis.calc.mondrian.Rolap.createSchema;
import static org.openforis.calc.mondrian.Rolap.createSharedDimension;
import static org.openforis.calc.mondrian.Rolap.createSqlView;
import static org.openforis.calc.mondrian.Rolap.createTable;

import java.io.File;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.jooq.Field;
import org.openforis.calc.engine.Task;
import org.openforis.calc.mondrian.DimensionUsage;
import org.openforis.calc.mondrian.Hierarchy;
import org.openforis.calc.mondrian.Hierarchy.Level;
import org.openforis.calc.mondrian.Schema;
import org.openforis.calc.mondrian.Schema.Cube;
import org.openforis.calc.mondrian.Schema.Cube.Measure;
import org.openforis.calc.mondrian.SharedDimension;
import org.openforis.calc.mondrian.Table;
import org.openforis.calc.mondrian.Table.AggName;
import org.openforis.calc.mondrian.Table.AggName.AggForeignKey;
import org.openforis.calc.mondrian.Table.AggName.AggLevel;
import org.openforis.calc.mondrian.Table.AggName.AggMeasure;
import org.openforis.calc.mondrian.View;
import org.openforis.calc.schema.AoiDimension;
import org.openforis.calc.schema.CategoryDimension;
import org.openforis.calc.schema.Dimension;
import org.openforis.calc.schema.RolapSchema;
import org.openforis.calc.schema.StratumDimension;
import org.springframework.beans.factory.annotation.Value;

/**
 * 
 * Task responsible for generating the rolap schema (using classes generated from mondrian 3.5.0 schema
 * https://github.com/pentaho/mondrian/blob/3.5.0-R/lib/mondrian.xsd)
 * 
 * @author M. Togna
 * 
 */
public class PublishRolapSchemaTask extends Task {

	@Value("${calc.rolapSchemaOutputFile}")
	private String rolapSchemaOutputFile;

	@Override
	protected void execute() throws Throwable {
		RolapSchema rolapSchema = getRolapSchema();

		// create schema
		Schema schema = createSchema(rolapSchema.getName());

		// create stratum dimension
		createStratumDimension(rolapSchema, schema);

		// create aoi dimensions
		createAoiDimensions(rolapSchema, schema);

		// create shared dimensions
		createSharedDimensions(rolapSchema, schema);

		// create cubes for each fact table
		createCubes(rolapSchema, schema);

		JAXBContext jaxbContext = JAXBContext.newInstance(Schema.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty("jaxb.formatted.output", true);

		File f = new File(rolapSchemaOutputFile);
		if ( f.exists() ) {
			f.delete();
		}
		marshaller.marshal(schema, f);

	}

	private void createCubes(RolapSchema rolapSchema, Schema schema) {
		List<org.openforis.calc.schema.Cube> cubes = rolapSchema.getCubes();
		for ( org.openforis.calc.schema.Cube rolapCube : cubes ) {

			Cube cube = createCube(rolapCube.getName());
			schema.getCube().add(cube);

			// add table to cube
			Table table = createTable(rolapCube.getSchema(), rolapCube.getTable());
			cube.setTable(table);

			// add agg names to table
			createAggNames(rolapCube, table);

			// add members to cube
			createCubeMembers(rolapCube, cube);

		}
	}

	private void createCubeMembers(org.openforis.calc.schema.Cube rolapCube, Cube cube) {
		// add stratum dimension usage
		Field<Integer> stratumField = rolapCube.getStratumIdField();
		DimensionUsage stratumDimUsage = createDimensionUsage(rolapCube.getStratumDimension().getName(), stratumField.getName());
		cube.getDimensionUsageOrDimension().add(stratumDimUsage);

		// add aoi dimension usages
		Map<AoiDimension, Field<Integer>> aoiDimensionUsages = rolapCube.getAoiDimensionUsages();
		for ( AoiDimension aoiDimension : aoiDimensionUsages.keySet() ) {
			Field<Integer> field = aoiDimensionUsages.get(aoiDimension);
			DimensionUsage dim = createDimensionUsage(aoiDimension.getName(), field.getName());
			cube.getDimensionUsageOrDimension().add(dim);
		}

		// add dimension usages
		Map<Dimension, Field<Integer>> dimensionUsages = rolapCube.getDimensionUsages();
		for ( Dimension dimension : dimensionUsages.keySet() ) {
			Field<Integer> field = dimensionUsages.get(dimension);

			DimensionUsage dim = createDimensionUsage(dimension.getName(), field.getName());
			cube.getDimensionUsageOrDimension().add(dim);
		}

		// add measures
		Map<org.openforis.calc.schema.Measure, Field<BigDecimal>> measures = rolapCube.getMeasures();
		for ( org.openforis.calc.schema.Measure measure : measures.keySet() ) {
			Field<BigDecimal> field = measures.get(measure);
			Measure m = createMeasure(measure.getName(), measure.getCaption(), field.getName(), measure.getAggregator(), DATA_TYPE_NUMERIC, NUMBER_FORMAT_STRING);

			cube.getMeasure().add(m);
		}
	}

	private void createAggNames(org.openforis.calc.schema.Cube rolapCube, Table table) {
		int approxRowCnt = 100;
		List<org.openforis.calc.schema.Cube.AggName> aggNames = rolapCube.getAggNames();
		for ( org.openforis.calc.schema.Cube.AggName aggName : aggNames ) {
			AggName aggTable = createAggregateName(aggName.getName(), approxRowCnt);
			table.getAggTable().add(aggTable);

			for ( org.openforis.calc.schema.Cube.AggForeignKey aggForeignKey : aggName.getAggForeignKeys() ) {
				AggForeignKey aggFK = createAggForeignKey(aggForeignKey.getFactColumn(), aggForeignKey.getAggColumn());
				aggTable.getAggForeignKey().add(aggFK);
			}

			for ( org.openforis.calc.schema.Cube.AggMeasure aggMeasure : aggName.getAggMeasures() ) {
				AggMeasure aggM = createAggMeasure(aggMeasure.getName(), aggMeasure.getColumn());
				aggTable.getAggMeasure().add(aggM);
			}

			for ( org.openforis.calc.schema.Cube.AggLevel aggLevel : aggName.getAggLevels() ) {
				AggLevel aggL = createAggLevel(aggLevel.getHierarchy(), aggLevel.getName(), aggLevel.getColumn());
				aggTable.getAggLevel().add(aggL);
			}
			approxRowCnt += 100;
		}
	}

	private void createSharedDimensions(RolapSchema rolapSchema, Schema schema) {
		Collection<CategoryDimension> sharedDimensions = rolapSchema.getSharedDimensions();
		for ( CategoryDimension categoryDimension : sharedDimensions ) {
			SharedDimension dim = createDimension(categoryDimension);
			schema.getDimension().add(dim);
		}
	}

	private void createAoiDimensions(RolapSchema rolapSchema, Schema schema) {
		List<AoiDimension> aoiDimensions = rolapSchema.getAoiDimensions();
		for ( AoiDimension aoiDimension : aoiDimensions ) {
			SharedDimension dim = createAoiDimension(aoiDimension);
			schema.getDimension().add(dim);
		}
	}

	private void createStratumDimension(RolapSchema rolapSchema, Schema schema) {
		StratumDimension stratumDimension = rolapSchema.getStratumDimension();
		SharedDimension stratumSharedDimension = createDimension(stratumDimension);
		schema.getDimension().add(stratumSharedDimension);
	}

	private SharedDimension createDimension(Dimension dimension) {
		org.openforis.calc.schema.Hierarchy hierarchy = dimension.getHierarchy();
		org.openforis.calc.schema.Hierarchy.Table table = hierarchy.getTable();
		org.openforis.calc.schema.Hierarchy.Level level = hierarchy.getLevels().get(0);

		SharedDimension dim = createSharedDimension(dimension.getName(), table.getName(), table.getSchema(), level.getColumn(), level.getNameColumn());
		return dim;
	}

	private SharedDimension createAoiDimension(AoiDimension aoiDimension) {
		org.openforis.calc.schema.Hierarchy hierarchy = aoiDimension.getHierarchy();
		org.openforis.calc.schema.Hierarchy.View view = hierarchy.getView();

		SharedDimension dim = new SharedDimension();
		dim.setName(aoiDimension.getName());
		dim.setType(DIMENSION_TYPE_STANDARD);
		// ? dim.setCaption(hierarchy.get)

		Hierarchy h = new Hierarchy();
		h.setName(hierarchy.getName());
		h.setHasAll(false);

		List<org.openforis.calc.schema.Hierarchy.Level> levels = hierarchy.getLevels();
		for ( org.openforis.calc.schema.Hierarchy.Level level : levels ) {
			Level l = createLevel(level.getName(), level.getColumn(), level.getNameColumn());
			h.getLevel().add(l);
		}

		View v = createSqlView(view.getAlias(), view.getSql());
		h.setView(v);

		dim.getHierarchy().add(h);

		return dim;
	}

}
