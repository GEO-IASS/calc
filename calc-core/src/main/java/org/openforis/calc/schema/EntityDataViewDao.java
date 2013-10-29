/**
 * 
 */
package org.openforis.calc.schema;

import java.util.ArrayList;
import java.util.List;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SelectQuery;
import org.openforis.calc.engine.DataRecord;
import org.openforis.calc.engine.DataRecordVisitor;
import org.openforis.calc.engine.Workspace;
import org.openforis.calc.metadata.Entity;
import org.openforis.calc.persistence.jooq.AbstractJooqDao;
import org.springframework.stereotype.Repository;

/**
 * @author Mino Togna
 * 
 */
@Repository
public class EntityDataViewDao extends AbstractJooqDao {

	public long count(Entity entity){
		EntityDataView view = getDataView(entity.getWorkspace(), entity);
		Long count = psql().selectCount().from(view).fetchOne(0, Long.class);
		return count;
	}
	
	public List<DataRecord> query(Workspace workspace, Integer offset, Integer numberOfRows, Entity entity, String... fields) {
		return query(null, workspace, offset, numberOfRows, entity, false, fields);
	}
	
	public List<DataRecord> query(Workspace workspace, Integer offset, Integer numberOfRows, Entity entity, boolean excludeNull, String... fields) {
		return query(null, workspace, offset, numberOfRows, entity, excludeNull, fields);
	}
	public List<DataRecord> query(DataRecordVisitor visitor, Workspace workspace, Integer offset, Integer numberOfRows, Entity entity, String... fields){
		return query(visitor, workspace, offset, numberOfRows, entity, false, fields);
	}
	
	public List<DataRecord> query(DataRecordVisitor visitor, Workspace workspace, Integer offset, Integer numberOfRows, Entity entity, boolean excludeNull, String... fields) {
		if (fields == null || fields.length == 0) {
			throw new IllegalArgumentException("fields must be specifed");
		}

		List<DataRecord> records = new ArrayList<DataRecord>();

		EntityDataView view = getDataView(workspace, entity);

		// prepare query
		SelectQuery<Record> select = psql().selectQuery();
		select.addFrom(view);
		select.addSelect(view.getIdField());
		for (String field : fields) {
			Field<?> f = view.field(field);
			select.addSelect(f);
			if(excludeNull){
				select.addConditions(f.isNotNull());
			}
		}
		// add order by id -- important?!
		select.addOrderBy( view.getIdField() );
		
		// add offset to query
		if (offset != null && numberOfRows != null) {
			select.addLimit(offset, numberOfRows);
		} else if (offset == null && numberOfRows != null) {
			select.addLimit(0, numberOfRows);
		} else if (offset != null && numberOfRows == null) {
			select.addLimit(offset);
		}
		
		// execute the query
		Result<Record> result = select.fetch();

		// process results
		for (Record record : result) {
			Long id = record.getValue(view.getIdField().getName(), Long.class);
			DataRecord dataRecord = new DataRecord(id);
			for (String field : fields) {
				Object value = record.getValue(field);
				dataRecord.add(field, value);
			}
			if (visitor != null) {
				visitor.visit(dataRecord);
			}
			records.add(dataRecord);
		}
		return records;
	}

	private EntityDataView getDataView(Workspace workspace, Entity entity) {
		Schemas schemas = new Schemas(workspace);
		EntityDataView view = schemas.getInputSchema().getDataView(entity);
		return view;
	}

}