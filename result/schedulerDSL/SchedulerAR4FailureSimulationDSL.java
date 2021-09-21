package it.unitn.disi.zanshin.simulation.cases.scheduler;

import it.unitn.disi.zanshin.simulation.Logger;
import it.unitn.disi.zanshin.simulation.cases.SimulationPart;

public final class SchedulerAR4FailureSimulation extends AbstractSchedulerSimulation {
	
	private static final Logger log = new Logger(SchedulerAR4FailureSimulation.class);
	
	/** @see it.unitn.disi.zanshin.simulation.cases.AbstractSimulation#doInit() */
	@Override
	public void doInit() throws Exception {
		// Registers the scheduler Simulation as target system in Zanshin.
		registerTargetSystem();
		// Adds the part 1 of the simulation to the list.
		parts.add(new SimulationPart() {
			@Override
			public void run() throws Exception {
				log.info("The system aborts! Today is not a good day to schedule meetings..."); //$NON-NLS-1$
				
			}
			@Override
			public boolean shouldWait() {
				return true;
			}
		});
		// Adds the part 2 of the simulation to the list.
		parts.add(new SimulationPart() {
			@Override
			public void run() throws Exception {
				// Creates a user session, as if someone were using the scheduler.
				sessionId = zanshin.createUserSession(targetSystemId);
				log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$
				log.info("No rooms available and both partner and hotels fail!"); //$NON-NLS-1$
				
				zanshin.logRequirementStart(targetSystemId, sessionId, D_LOCAL_AVAIL);
				zanshin.logRequirementFailure(targetSystemId, sessionId, D_LOCAL_AVAIL);
				zanshin.logRequirementStart(targetSystemId, sessionId, T_CALL_PARTNER);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_CALL_PARTNER);
				zanshin.logRequirementStart(targetSystemId, sessionId, T_CALL_HOTEL);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_CALL_HOTEL);
				
				// Ends the user session.
				zanshin.disposeUserSession(targetSystemId, sessionId);
			}
			@Override
			public boolean shouldWait() {
				return true;
			}
		});
		// Adds the part 3 of the simulation to the list.
		parts.add(new SimulationPart() {
			@Override
			public void run() throws Exception {
				// Creates a user session, as if someone were using the scheduler.
				sessionId = zanshin.createUserSession(targetSystemId);
				log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$
				log.info("No rooms available and both partner and hotels fail!"); //$NON-NLS-1$
				
				zanshin.logRequirementStart(targetSystemId, sessionId, D_LOCAL_AVAIL);
				zanshin.logRequirementFailure(targetSystemId, sessionId, D_LOCAL_AVAIL);
				zanshin.logRequirementStart(targetSystemId, sessionId, T_CALL_PARTNER);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_CALL_PARTNER);
				zanshin.logRequirementStart(targetSystemId, sessionId, T_CALL_HOTEL);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_CALL_HOTEL);
				
				// Ends the user session.
				zanshin.disposeUserSession(targetSystemId, sessionId);
			}
			@Override
			public boolean shouldWait() {
				return false;
			}
		});
	}
}
