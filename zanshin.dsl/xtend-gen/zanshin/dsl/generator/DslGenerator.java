/**
 * generated by Xtext 2.10.0
 */
package zanshin.dsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import zanshin.dsl.dsl.Commands;
import zanshin.dsl.dsl.Log;
import zanshin.dsl.dsl.Project;
import zanshin.dsl.dsl.Scope;
import zanshin.dsl.dsl.TestType;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class DslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Scope> _filter = Iterables.<Scope>filter(_iterable, Scope.class);
    for (final Scope e : _filter) {
      {
        Project _project = e.getProject();
        String _importedNamespace = _project.getImportedNamespace();
        String _replace = _importedNamespace.replace(" ", "");
        String projectName = _replace.replace("\"", "");
        InputOutput.<String>println(projectName);
        CharSequence _simulation = this.simulation(e);
        fsa.generateFile(
          (((("/" + projectName) + "/") + projectName) + ".java"), _simulation);
        CharSequence _TargetSystem = this.TargetSystem(e);
        fsa.generateFile(
          ((("/" + projectName) + "/SimulatedTargetSystem") + ".java"), _TargetSystem);
        String _firstUpper = StringExtensions.toFirstUpper(projectName);
        String _plus = ((("/" + projectName) + "/Abstract") + _firstUpper);
        String _plus_1 = (_plus + "Simulation");
        String _plus_2 = (_plus_1 + ".java");
        CharSequence _AbstractSimulation = this.AbstractSimulation(e);
        fsa.generateFile(_plus_2, _AbstractSimulation);
      }
    }
  }
  
  public CharSequence simulation(final Scope scope) {
    CharSequence _xblockexpression = null;
    {
      Project _project = scope.getProject();
      String _importedNamespace = _project.getImportedNamespace();
      String _replace = _importedNamespace.replace(" ", "");
      String projectName = _replace.replace("\"", "");
      String simulationName = scope.getName();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("//Command Size");
      _builder.newLine();
      {
        EList<Commands> _commands = scope.getCommands();
        int _size = _commands.size();
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
        for(final Integer i : _doubleDotLessThan) {
          EList<Commands> _commands_1 = scope.getCommands();
          Commands command = _commands_1.get((i).intValue());
          _builder.newLineIfNotEmpty();
          EList<Commands> _commands_2 = scope.getCommands();
          int _size_1 = _commands_2.size();
          _builder.append(_size_1, "");
          _builder.newLineIfNotEmpty();
          _builder.append("//Test Type Size");
          _builder.newLine();
          EList<TestType> _testtype = command.getTesttype();
          int _size_2 = _testtype.size();
          _builder.append(_size_2, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("package it.unitn.disi.zanshin.simulation.cases.");
      _builder.append(projectName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("import it.unitn.disi.zanshin.simulation.Logger;");
      _builder.newLine();
      _builder.append("import it.unitn.disi.zanshin.simulation.cases.SimulationPart;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public final class ");
      _builder.append(simulationName, "");
      _builder.append(" extends Abstract");
      String _firstUpper = StringExtensions.toFirstUpper(projectName);
      _builder.append(_firstUpper, "");
      _builder.append("Simulation {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private static final Logger log = new Logger(");
      _builder.append(simulationName, "\t");
      _builder.append(".class);");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/** @see it.unitn.disi.zanshin.simulation.cases.AbstractSimulation#doInit() */");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void doInit() throws Exception {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// Registers the ");
      _builder.append(projectName, "\t\t");
      _builder.append(" Simulation as target system in Zanshin.");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("registerTargetSystem();");
      _builder.newLine();
      {
        EList<Commands> _commands_3 = scope.getCommands();
        int _size_3 = _commands_3.size();
        ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_3, true);
        for(final Integer i_1 : _doubleDotLessThan_1) {
          _builder.append("\t\t");
          EList<Commands> _commands_4 = scope.getCommands();
          Commands commands = _commands_4.get((i_1).intValue());
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          int index = ((i_1).intValue() + 1);
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("// Adds the part ");
          _builder.append(index, "\t\t");
          _builder.append(" of the simulation to the list.");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("parts.add(new SimulationPart() {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("public void run() throws Exception {");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t\t");
          _builder.append("// Creates a user session, as if someone were using the ");
          _builder.append(projectName, "\t\t\t\t");
          _builder.append(".");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("\t\t");
          _builder.append("sessionId = zanshin.createUserSession(targetSystemId);");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t\t");
          _builder.append("log.info(\"Created a new user session with id: {0}\", sessionId); //$NON-NLS-1$");
          _builder.newLine();
          {
            Log _message = commands.getMessage();
            boolean _equals = Objects.equal(_message, null);
            if (_equals) {
              _builder.append("\t\t");
              _builder.append("\t\t");
              _builder.append("log.info(\"Empty Log\"); //$NON-NLS-1$");
              _builder.newLine();
            } else {
              _builder.append("\t\t");
              _builder.append("\t\t");
              _builder.append("log.info(\"");
              Log _message_1 = commands.getMessage();
              String _message_2 = _message_1.getMessage();
              _builder.append(_message_2, "\t\t\t\t");
              _builder.append("\"); //$NON-NLS-1$");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t\t");
          _builder.append("\t\t");
          EList<TestType> _testtype_1 = commands.getTesttype();
          TestType _get = _testtype_1.get((i_1).intValue());
          String simulationType = _get.getSimulationType();
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("\t\t");
          EList<TestType> _testtype_2 = commands.getTesttype();
          TestType _get_1 = _testtype_2.get((i_1).intValue());
          String requirement = _get_1.getName();
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t");
          _builder.append("\t\t");
          _builder.append("zanshin.logRequirementStart(targetSystemId, sessionId, ");
          _builder.append(requirement, "\t\t\t\t");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          {
            EList<TestType> _testtype_3 = commands.getTesttype();
            TestType _get_2 = _testtype_3.get((i_1).intValue());
            boolean _isArray = _get_2.isArray();
            if (_isArray) {
              {
                EList<TestType> _testtype_4 = commands.getTesttype();
                int _size_4 = _testtype_4.size();
                ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, _size_4, true);
                for(final Integer z : _doubleDotLessThan_2) {
                  _builder.append("\t\t");
                  _builder.append("\t\t");
                  _builder.append("zanshin.logRequirement");
                  _builder.append(simulationType, "\t\t\t\t");
                  _builder.append("(targetSystemId, sessionId, ");
                  _builder.append(requirement, "\t\t\t\t");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
            } else {
              _builder.append("\t\t");
              _builder.append("\t\t");
              _builder.append("zanshin.logRequirement");
              _builder.append(simulationType, "\t\t\t\t");
              _builder.append("(targetSystemId, sessionId, ");
              _builder.append(requirement, "\t\t\t\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t\t");
          _builder.append("\t\t");
          _builder.append("// Ends the user session.");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t\t");
          _builder.append("zanshin.disposeUserSession(targetSystemId, sessionId);");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("@Override");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("public boolean shouldWait() {");
          _builder.newLine();
          {
            int _length = scope.getLength();
            boolean _equals_1 = (index == _length);
            if (_equals_1) {
              _builder.append("\t\t");
              _builder.append("\t\t");
              _builder.append("return false;");
              _builder.newLine();
            } else {
              _builder.append("\t\t");
              _builder.append("\t\t");
              _builder.append("return true;");
              _builder.newLine();
            }
          }
          _builder.append("\t\t");
          _builder.append("\t");
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("});");
          _builder.newLine();
        }
      }
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence TargetSystem(final Scope scope) {
    CharSequence _xblockexpression = null;
    {
      Project _project = scope.getProject();
      String _importedNamespace = _project.getImportedNamespace();
      String _replace = _importedNamespace.replace(" ", "");
      String projectName = _replace.replace("\"", "");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package it.unitn.disi.zanshin.simulation.cases.");
      _builder.append(projectName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("import java.util.Map;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import it.unitn.disi.zanshin.simulation.SimulatedTargetSystem;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public class ");
      String _firstUpper = StringExtensions.toFirstUpper(projectName);
      _builder.append(_firstUpper, "");
      _builder.append("SimulatedTargetSystem extends SimulatedTargetSystem {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("/** The object in which the simulation thread is sleeping, and therefore used to \"wake it up\". */");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("private Object lock;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/** Constructor. */");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public ");
      String _firstUpper_1 = StringExtensions.toFirstUpper(projectName);
      _builder.append(_firstUpper_1, "\t");
      _builder.append("SimulatedTargetSystem(Object lock) {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("this.lock = lock;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/** @see it.unitn.disi.zanshin.simulation.SimulatedTargetSystem#initiate(java.lang.Long, java.lang.String) */");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void initiate(Long sessionId, String reqName) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("super.initiate(sessionId, reqName);");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// Initiate is the last command of the Retry strategy, thus we should notify the simulation to continue, as this");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("synchronized (lock) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("lock.notifyAll();");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/** @see it.unitn.disi.zanshin.simulation.SimulatedTargetSystem#abort(java.lang.Long, java.lang.String) */");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void abort(Long sessionId, String awreqName) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("super.abort(sessionId, awreqName);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// After two attempts of the Retry strategy, Zanshin replies with an Abort, also for the AR1 simulation.");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("synchronized (lock) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("lock.notifyAll();");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void applyConfig(Map<String, String> newConfig) {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("super.applyConfig(newConfig);");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// ApplyConfig is the last command of the Reconfiguration strategy, thus we should notify the simulation to");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// continue, as this strategy is selected to deal with failures of AR4.");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("synchronized (lock) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("lock.notifyAll();");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence AbstractSimulation(final Scope scope) {
    CharSequence _xblockexpression = null;
    {
      Project _project = scope.getProject();
      String _importedNamespace = _project.getImportedNamespace();
      String _replace = _importedNamespace.replace(" ", "");
      String projectName = _replace.replace("\"", "");
      String[] requirementsList = new String[500];
      int lastIndex = 0;
      EList<Commands> _commands = scope.getCommands();
      int _size = _commands.size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          EList<Commands> _commands_1 = scope.getCommands();
          Commands command = _commands_1.get((i).intValue());
          EList<TestType> _testtype = command.getTesttype();
          int _size_1 = _testtype.size();
          ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_1, true);
          for (final Integer j : _doubleDotLessThan_1) {
            if (((!((List<String>)Conversions.doWrapArray(requirementsList)).contains(command.getTesttype().get((j).intValue()).getName())) && ((i).intValue() < 500))) {
              EList<TestType> _testtype_1 = command.getTesttype();
              TestType _get = _testtype_1.get((j).intValue());
              String _name = _get.getName();
              requirementsList[lastIndex] = _name;
              lastIndex++;
            }
          }
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package it.unitn.disi.zanshin.simulation.cases.");
      _builder.append(projectName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("import it.unitn.disi.zanshin.simulation.Logger;");
      _builder.newLine();
      _builder.append("import it.unitn.disi.zanshin.simulation.SimulationUtils;");
      _builder.newLine();
      _builder.append("import it.unitn.disi.zanshin.simulation.cases.AbstractSimulation;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import java.io.IOException;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public abstract class Abstract");
      String _firstUpper = StringExtensions.toFirstUpper(projectName);
      _builder.append(_firstUpper, "");
      _builder.append("Simulation extends AbstractSimulation {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("private static final Logger log = new Logger(Abstract");
      String _firstUpper_1 = StringExtensions.toFirstUpper(projectName);
      _builder.append(_firstUpper_1, "\t");
      _builder.append("Simulation.class);");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected static final String BASE_PATH = Abstract");
      String _firstUpper_2 = StringExtensions.toFirstUpper(projectName);
      _builder.append(_firstUpper_2, "\t");
      _builder.append("Simulation.class.getPackage().getName().replace(\'.\', \'/\') + \'/\';");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected static final String META_MODEL_FILE_PATH = BASE_PATH + \"");
      _builder.append(projectName, "\t");
      _builder.append(".ecore\"; //$NON-NLS-1$");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected static final String MODEL_FILE_PATH = BASE_PATH + \"model.");
      _builder.append(projectName, "\t");
      _builder.append("\"; //$NON-NLS-1$");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      {
        for(final String requirement : requirementsList) {
          {
            boolean _notEquals = (!Objects.equal(requirement, null));
            if (_notEquals) {
              _builder.append("\t");
              String _replace_1 = requirement.replace("_", " ");
              String _firstUpper_3 = StringExtensions.toFirstUpper(_replace_1);
              String formatedRequeriment = _firstUpper_3.replace(" ", "");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("protected static final String ");
              _builder.append(requirement, "\t");
              _builder.append(" = \"");
              _builder.append(formatedRequeriment, "\t");
              _builder.append("\"; //$NON-NLS-1$");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.append("\t");
      _builder.append("protected static Object lock = new Object();");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected String targetSystemId;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected Long sessionId;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("protected void registerTargetSystem() throws IOException {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("// Registers the ");
      String _firstUpper_4 = StringExtensions.toFirstUpper(projectName);
      _builder.append(_firstUpper_4, "\t\t");
      _builder.append(" simulation as target system in Zanshin, if not already registered.");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("log.info(\"Registering the ");
      String _firstUpper_5 = StringExtensions.toFirstUpper(projectName);
      _builder.append(_firstUpper_5, "\t\t");
      _builder.append(" Simulation as a target system in Zanshin!!!\"); //$NON-NLS-1$");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("targetSystemId = SimulationUtils.registerTargetSystem(zanshin, new ");
      String _firstUpper_6 = StringExtensions.toFirstUpper(projectName);
      _builder.append(_firstUpper_6, "\t\t");
      _builder.append("SimulatedTargetSystem(lock), META_MODEL_FILE_PATH, MODEL_FILE_PATH);");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("log.info(\"Target system registered as: {0}\", targetSystemId); //$NON-NLS-1$");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("/** @see it.unitn.disi.zanshin.simulation.cases.Simulation#getLock() */");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@Override");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public Object getLock() {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("return lock;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
