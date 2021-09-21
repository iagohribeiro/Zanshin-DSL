package it.unitn.disi.zanshin.simulation.cases.acad;

import it.unitn.disi.zanshin.simulation.Logger;
import it.unitn.disi.zanshin.simulation.cases.SimulationPart;

public final class AcadAR15FailureSimulation extends AbstractAcadSimulation {
	
	private static final Logger log = new Logger(AcadAR15FailureSimulation.class);
	
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
				log.info("Staff member tries to Input Emergency Information but it fails!"); //$NON-NLS-1$
				
				zanshin.logRequirementStart(targetSystemId, sessionId, T_INPUT_INFO);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_INPUT_INFO);
				
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
				log.info("In the 2nd try, Input Emergency Information suceeeds, but Detect Caller Location fails!"); //$NON-NLS-1$
				
				zanshin.logRequirementStart(targetSystemId, sessionId, T_INPUT_INFO);
				zanshin.logRequirementSuccess(targetSystemId, sessionId, T_INPUT_INFO);
				zanshin.logRequirementStart(targetSystemId, sessionId, T_DETECT_LOC);
				zanshin.logRequirementFailure(targetSystemId, sessionId, T_DETECT_LOC);
				
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
				log.info("OK. Ending user session..."); //$NON-NLS-1$
				
			}
			@Override
			public boolean shouldWait() {
				return false;
			}
		});
	}
}
