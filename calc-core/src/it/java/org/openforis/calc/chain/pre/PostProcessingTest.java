package org.openforis.calc.chain.pre;

import javax.sql.DataSource;

import org.junit.Test;
import org.openforis.calc.chain.post.AssignDimensionIdsTask;
import org.openforis.calc.chain.post.CalculateExpansionFactorsTask;
import org.openforis.calc.chain.post.CreateAggregateTablesTask;
import org.openforis.calc.chain.post.CreateFactTablesTask;
import org.openforis.calc.chain.post.PublishRolapSchemaTask;
import org.openforis.calc.engine.CalculationEngine;
import org.openforis.calc.engine.Job;
import org.openforis.calc.engine.TaskManager;
import org.openforis.calc.engine.Workspace;
import org.openforis.calc.engine.WorkspaceDao;
import org.openforis.calc.engine.WorkspaceLockedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

/**
 * 
 * @author G. Miceli
 * 
 */
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class PostProcessingTest extends
		AbstractTransactionalJUnit4SpringContextTests {
	@Autowired
	private TaskManager taskManager;
	@Autowired
	private WorkspaceDao workspaceDao;
	@Autowired
	private DataSource userDataSource;

	@Test
	public void testRun() throws WorkspaceLockedException {
		Workspace ws = workspaceDao.find(1);
		Job job = taskManager.createUserJob(ws);
//		job.addTasks(taskManager.createTasks(CalculationEngine.POSTPROCESSING_TASKS));
//		job.addTask(taskManager.createTask(CreateFactTablesTask.class));
//		job.addTask(taskManager.createTask(AssignDimensionIdsTask.class));
//		job.addTask(taskManager.createTask(CalculateExpansionFactorsTask.class));
//		job.addTask(taskManager.createTask(CreateAggregateTablesTask.class));
//		job.addTask(taskManager.createTask(PublishRolapSchemaTask.class));

		taskManager.startJob(job);
		job.waitFor(5000);
	}
}
