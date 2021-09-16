package it.unitn.disi.zanshin.simulation.cases.acad;

import it.unitn.disi.zanshin.simulation.Logger;
import it.unitn.disi.zanshin.simulation.SimulationUtils;
import it.unitn.disi.zanshin.simulation.cases.AbstractSimulation;

import java.io.IOException;

public abstract class AbstractAcadSimulation extends AbstractSimulation {
	private static final Logger log = new Logger(AbstractAcadSimulation.class);

	protected static final String BASE_PATH = AbstractAcadSimulation.class.getPackage().getName().replace('.', '/') + '/';

	protected static final String META_MODEL_FILE_PATH = BASE_PATH + "acad.ecore"; //$NON-NLS-1$

	protected static final String MODEL_FILE_PATH = BASE_PATH + "model.acad"; //$NON-NLS-1$
	
	protected static final String Q_DISPATCH = "QDISPATCH"; //$NON-NLS-1$
	protected static final String T_DISPATCH = "TDISPATCH"; //$NON-NLS-1$
	protected static final String A_DISPATCH = "ADISPATCH"; //$NON-NLS-1$
	protected static final String B_DISPATCH = "BDISPATCH"; //$NON-NLS-1$
	protected static final String C_DISPATCH = "CDISPATCH"; //$NON-NLS-1$
	protected static Object lock = new Object();

	protected String targetSystemId;

	protected Long sessionId;

	protected void registerTargetSystem() throws IOException {
		// Registers the Acad simulation as target system in Zanshin, if not already registered.
		log.info("Registering the Acad Simulation as a target system in Zanshin!!!"); //$NON-NLS-1$
		targetSystemId = SimulationUtils.registerTargetSystem(zanshin, new AcadSimulatedTargetSystem(lock), META_MODEL_FILE_PATH, MODEL_FILE_PATH);
		log.info("Target system registered as: {0}", targetSystemId); //$NON-NLS-1$
	}

	/** @see it.unitn.disi.zanshin.simulation.cases.Simulation#getLock() */
	@Override
	public Object getLock() {
		return lock;
	}
}
