package it.unitn.disi.zanshin.simulation.cases.acad;

import it.unitn.disi.zanshin.simulation.Logger;
import it.unitn.disi.zanshin.simulation.cases.SimulationPart;

public final class AcadAR04FailureSimulation extends AbstractAcadSimulation {
	
	private static final Logger log = new Logger(AcadAR04FailureSimulation.class);
	
	/** @see it.unitn.disi.zanshin.simulation.cases.AbstractSimulation#doInit() */
	@Override
	public void doInit() throws Exception {
		// Registers the acad Simulation as target system in Zanshin.
		registerTargetSystem();
		// Adds the part 1 of the simulation to the list.
		parts.add(new SimulationPart() {
			@Override
			public void run() throws Exception {
				// Creates a user session, as if someone were using the acad.
				sessionId = zanshin.createUserSession(targetSystemId);
				log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$
				log.info("Current incident took more than 3 minutes to dispatch!"); //$NON-NLS-1$
				
				zanshin.logRequirementStart(targetSystemId, sessionId, A_DISPATCH);
				zanshin.logRequirementFailure(targetSystemId, sessionId, A_DISPATCH);
				
				// Ends the user session.
				zanshin.disposeUserSession(targetSystemId, sessionId);
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
				// Creates a user session, as if someone were using the acad.
				sessionId = zanshin.createUserSession(targetSystemId);
				log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$
				log.info("First adaptation attempt was not enough, dispatch is still took more than 3 minutes in another incident!"); //$NON-NLS-1$
				
				zanshin.logRequirementStart(targetSystemId, sessionId, B_DISPATCH);
				zanshin.logRequirementFailure(targetSystemId, sessionId, B_DISPATCH);
				zanshin.logRequirementStart(targetSystemId, sessionId, C_DISPATCH);
				zanshin.logRequirementFailure(targetSystemId, sessionId, C_DISPATCH);
				
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
				log.info("OK, for a third incident dispatching now took less than 3 minutes!"); //$NON-NLS-1$
				
			}
			@Override
			public boolean shouldWait() {
				return false;
			}
		});
	}
}
