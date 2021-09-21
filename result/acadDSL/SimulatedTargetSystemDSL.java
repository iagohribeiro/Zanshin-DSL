package it.unitn.disi.zanshin.simulation.cases.acad;

import java.util.Map;

import it.unitn.disi.zanshin.simulation.SimulatedTargetSystem;

public class AcadSimulatedTargetSystem extends SimulatedTargetSystem {
	/** The object in which the simulation thread is sleeping, and therefore used to "wake it up". */
	private Object lock;

	/** Constructor. */
	public AcadSimulatedTargetSystem(Object lock) {
		this.lock = lock;
	}

	/** @see it.unitn.disi.zanshin.simulation.SimulatedTargetSystem#initiate(java.lang.Long, java.lang.String) */
	@Override
	public void initiate(Long sessionId, String reqName) {
		super.initiate(sessionId, reqName);

		// Initiate is the last command of the Retry strategy, thus we should notify the simulation to continue, as this
		synchronized (lock) {
			lock.notifyAll();
		}
	}

	/** @see it.unitn.disi.zanshin.simulation.SimulatedTargetSystem#abort(java.lang.Long, java.lang.String) */
	@Override
	public void abort(Long sessionId, String awreqName) {
		super.abort(sessionId, awreqName);
		
		// After two attempts of the Retry strategy, Zanshin replies with an Abort, also for the AR1 simulation.
		synchronized (lock) {
			lock.notifyAll();
		}
	}
	
	public void applyConfig(Map<String, String> newConfig) {
		super.applyConfig(newConfig);
		
		// ApplyConfig is the last command of the Reconfiguration strategy, thus we should notify the simulation to
		// continue, as this strategy is selected to deal with failures of AR4.
		synchronized (lock) {
			lock.notifyAll();
		}		
	}
}
