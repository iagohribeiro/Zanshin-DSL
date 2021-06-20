/*
 * generated by Xtext 2.10.0
 */
package zanshin.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import zanshin.dsl.dsl.Scope
import java.util.Hashtable

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DslGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(e:resource.allContents.toIterable.filter(Scope)){
			var String projectName = e.project.importedNamespace.replace(" ", "").replace("\"","");

			fsa.generateFile(
		   		"/" + projectName + "/" + projectName + ".java", e.simulation
		   	);
			fsa.generateFile(
		   		 "/" + projectName + "/SimulatedTargetSystem" + ".java", e.TargetSystem
			);
			
			fsa.generateFile(
		   		 "/" + projectName + "/Abstract" + projectName.toFirstUpper + "Simulation" + ".java", e.AbstractSimulation
			);
		}
	}
	
 	def CharSequence simulation(Scope scope){
		var String projectName = scope.project.importedNamespace.replace(" ", "").replace("\"","");
		var String simulationName = scope.name;
		
		var Hashtable<String, Integer> elementsList= new Hashtable<String, Integer>();
		var Hashtable<String, Integer> repeatedElements= new Hashtable<String, Integer>();
		
		for (i:0 ..< scope.commands.size)
		{
			var commands = scope.commands.get(i)
			
			for (z:0 ..< commands.testtype.size)
			{
				var String requirementWithID = commands.testtype.get(z).name + (i+1)
				
				if(!elementsList.containsKey(requirementWithID))
				{
					elementsList.put(requirementWithID,z)
				}
				else
				{
					repeatedElements.put(requirementWithID,z)
				}
			}
		}
		
		'''
		package it.unitn.disi.zanshin.simulation.cases.�projectName�;
		
		import it.unitn.disi.zanshin.simulation.Logger;
		import it.unitn.disi.zanshin.simulation.cases.SimulationPart;
		
		public final class �simulationName� extends Abstract�projectName.toFirstUpper�Simulation {
			
			private static final Logger log = new Logger(�simulationName�.class);
			
			/** @see it.unitn.disi.zanshin.simulation.cases.AbstractSimulation#doInit() */
			@Override
			public void doInit() throws Exception {
				// Registers the �projectName� Simulation as target system in Zanshin.
				registerTargetSystem();
				�FOR i:0 ..< scope.commands.size�
				�var commands = scope.commands.get(i)�
				�var index = i+1�
				// Adds the part �index� of the simulation to the list.
				parts.add(new SimulationPart() {
					@Override
					public void run() throws Exception {
						// Creates a user session, as if someone were using the �projectName�.
						sessionId = zanshin.createUserSession(targetSystemId);
						log.info("Created a new user session with id: {0}", sessionId); //$NON-NLS-1$
						�IF commands.message == null�
						log.info("Empty Log"); //$NON-NLS-1$
						�ELSE�
						log.info("�commands.message.message�"); //$NON-NLS-1$
						�ENDIF�
						
					�FOR z:0 ..< commands.testtype.size�
					�var String simulationType = commands.testtype.get(z).simulationType�
					�var String requirement = commands.testtype.get(z).name�
					�var String requirementWithID = commands.testtype.get(z).name + (i+1)�
						�IF elementsList.containsKey(requirementWithID) && z <= elementsList.get(requirementWithID)�
						zanshin.logRequirementStart(targetSystemId, sessionId, �requirement�);
						�ENDIF�
						�IF commands.testtype.get(z).array�
						�FOR j:0 ..< commands.testtype.get(z).length�
						zanshin.logRequirement�simulationType�(targetSystemId, sessionId, �requirement�);
						�ENDFOR�
						�ELSE�
						zanshin.logRequirement�simulationType�(targetSystemId, sessionId, �requirement�);
						�ENDIF�
					�ENDFOR�
						
						// Ends the user session.
						zanshin.disposeUserSession(targetSystemId, sessionId);
					}
					@Override
					public boolean shouldWait() {
						�IF index == scope.length�
						return false;
						�ELSE�
						return true;
						�ENDIF�
					}
				});
				�ENDFOR�
			}
		}
		'''
	}
	
	def CharSequence TargetSystem(Scope scope){
		var String projectName = scope.project.importedNamespace.replace(" ", "").replace("\"","");
		'''
		package it.unitn.disi.zanshin.simulation.cases.�projectName�;
		
		import java.util.Map;
		
		import it.unitn.disi.zanshin.simulation.SimulatedTargetSystem;
		
		public class �projectName.toFirstUpper�SimulatedTargetSystem extends SimulatedTargetSystem {
			/** The object in which the simulation thread is sleeping, and therefore used to "wake it up". */
			private Object lock;
		
			/** Constructor. */
			public �projectName.toFirstUpper�SimulatedTargetSystem(Object lock) {
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
		'''
	}
	
	def CharSequence AbstractSimulation(Scope scope){
		var String projectName = scope.project.importedNamespace.replace(" ", "").replace("\"","");
		var String [] requirementsList = newArrayOfSize(500);
		var int lastIndex = 0;
		
		for (i:0 ..< scope.commands.size)
		{
			var command = scope.commands.get(i);
				
			for (j:0 ..< command.testtype.size)
			{
				if(!requirementsList.contains(command.testtype.get(j).name) && i < 500)
				{
					requirementsList.set(lastIndex,command.testtype.get(j).name);
					lastIndex++;
				}
			}
		}
		
		'''
		package it.unitn.disi.zanshin.simulation.cases.�projectName�;
		
		import it.unitn.disi.zanshin.simulation.Logger;
		import it.unitn.disi.zanshin.simulation.SimulationUtils;
		import it.unitn.disi.zanshin.simulation.cases.AbstractSimulation;
		
		import java.io.IOException;
		
		public abstract class Abstract�projectName.toFirstUpper�Simulation extends AbstractSimulation {
			private static final Logger log = new Logger(Abstract�projectName.toFirstUpper�Simulation.class);
		
			protected static final String BASE_PATH = Abstract�projectName.toFirstUpper�Simulation.class.getPackage().getName().replace('.', '/') + '/';
		
			protected static final String META_MODEL_FILE_PATH = BASE_PATH + "�projectName�.ecore"; //$NON-NLS-1$
		
			protected static final String MODEL_FILE_PATH = BASE_PATH + "model.�projectName�"; //$NON-NLS-1$
			
			�FOR requirement:requirementsList�
			�IF requirement != null�
			�var String formatedRequeriment = requirement.replace("_"," ").toFirstUpper.replace(" ","")�
			protected static final String �requirement� = "�formatedRequeriment�"; //$NON-NLS-1$
			�ENDIF�
			�ENDFOR�
			protected static Object lock = new Object();
		
			protected String targetSystemId;
		
			protected Long sessionId;
		
			protected void registerTargetSystem() throws IOException {
				// Registers the �projectName.toFirstUpper� simulation as target system in Zanshin, if not already registered.
				log.info("Registering the �projectName.toFirstUpper� Simulation as a target system in Zanshin!!!"); //$NON-NLS-1$
				targetSystemId = SimulationUtils.registerTargetSystem(zanshin, new �projectName.toFirstUpper�SimulatedTargetSystem(lock), META_MODEL_FILE_PATH, MODEL_FILE_PATH);
				log.info("Target system registered as: {0}", targetSystemId); //$NON-NLS-1$
			}
		
			/** @see it.unitn.disi.zanshin.simulation.cases.Simulation#getLock() */
			@Override
			public Object getLock() {
				return lock;
			}
		}
		'''
	}
}
