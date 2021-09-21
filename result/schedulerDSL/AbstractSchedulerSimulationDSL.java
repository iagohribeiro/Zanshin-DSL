package it.unitn.disi.zanshin.simulation.cases.scheduler;

import it.unitn.disi.zanshin.simulation.Logger;
import it.unitn.disi.zanshin.simulation.SimulationUtils;
import it.unitn.disi.zanshin.simulation.cases.AbstractSimulation;

import java.io.IOException;

public abstract class AbstractSchedulerSimulation extends AbstractSimulation {
	private static final Logger log = new Logger(AbstractSchedulerSimulation.class);

	protected static final String BASE_PATH = AbstractSchedulerSimulation.class.getPackage().getName().replace('.', '/') + '/';

	protected static final String META_MODEL_FILE_PATH = BASE_PATH + "scheduler.ecore"; //$NON-NLS-1$

	protected static final String MODEL_FILE_PATH = BASE_PATH + "model.scheduler"; //$NON-NLS-1$
	
	protected static final String T_CHARACT_MEET = "T_CHARACT_MEET"; //$NON-NLS-1$
	protected static final String D_LOCAL_AVAIL = "D_LOCAL_AVAIL"; //$NON-NLS-1$
	protected static final String T_CALL_PARTNER = "T_CALL_PARTNER"; //$NON-NLS-1$
	protected static final String T_CALL_HOTEL = "T_CALL_HOTEL"; //$NON-NLS-1$
	protected static Object lock = new Object();

	protected String targetSystemId;

	protected Long sessionId;

	protected void registerTargetSystem() throws IOException {
		// Registers the Scheduler simulation as target system in Zanshin, if not already registered.
		log.info("Registering the Scheduler Simulation as a target system in Zanshin!!!"); //$NON-NLS-1$
		targetSystemId = SimulationUtils.registerTargetSystem(zanshin, new SchedulerSimulatedTargetSystem(lock), META_MODEL_FILE_PATH, MODEL_FILE_PATH);
		log.info("Target system registered as: {0}", targetSystemId); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.simulation.cases.Simulation#getLock() */
	@Override
	public Object getLock() {
		return lock;
	}
}
