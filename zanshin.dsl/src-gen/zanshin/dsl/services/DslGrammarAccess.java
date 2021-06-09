/*
 * generated by Xtext 2.10.0
 */
package zanshin.dsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class DslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "zanshin.dsl.Dsl.Model");
		private final Assignment cDslAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cDslScopeParserRuleCall_0 = (RuleCall)cDslAssignment.eContents().get(0);
		
		//Model:
		//	dsl+=Scope*;
		@Override public ParserRule getRule() { return rule; }
		
		//dsl+=Scope*
		public Assignment getDslAssignment() { return cDslAssignment; }
		
		//Scope
		public RuleCall getDslScopeParserRuleCall_0() { return cDslScopeParserRuleCall_0; }
	}
	public class ProjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "zanshin.dsl.Dsl.Project");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProjectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//Project:
		//	'project' importedNamespace=QualifiedNameWithWildcard;
		@Override public ParserRule getRule() { return rule; }
		
		//'project' importedNamespace=QualifiedNameWithWildcard
		public Group getGroup() { return cGroup; }
		
		//'project'
		public Keyword getProjectKeyword_0() { return cProjectKeyword_0; }
		
		//importedNamespace=QualifiedNameWithWildcard
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }
		
		//QualifiedNameWithWildcard
		public RuleCall getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0() { return cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "zanshin.dsl.Dsl.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	STRING ('.' STRING)*;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING ('.' STRING)*
		public Group getGroup() { return cGroup; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//('.' STRING)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1_1() { return cSTRINGTerminalRuleCall_1_1; }
	}
	public class QualifiedNameWithWildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "zanshin.dsl.Dsl.QualifiedNameWithWildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QualifiedNameWithWildcard:
		//	QualifiedName '.*'?;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '.*'?
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//'.*'?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "zanshin.dsl.Dsl.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSuccessParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFailureParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Type:
		//	Success | Failure;
		@Override public ParserRule getRule() { return rule; }
		
		//Success | Failure
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Success
		public RuleCall getSuccessParserRuleCall_0() { return cSuccessParserRuleCall_0; }
		
		//Failure
		public RuleCall getFailureParserRuleCall_1() { return cFailureParserRuleCall_1; }
	}
	public class SuccessElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "zanshin.dsl.Dsl.Success");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSimulationTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cSimulationTypeSuccessKeyword_0_0 = (Keyword)cSimulationTypeAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cArrayAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final Keyword cArrayLeftSquareBracketKeyword_1_0_0 = (Keyword)cArrayAssignment_1_0.eContents().get(0);
		private final Assignment cLengthAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cLengthINTTerminalRuleCall_1_1_0 = (RuleCall)cLengthAssignment_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Success:
		//	simulationType='Success' (array?='[' length=INT? ']')? name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//simulationType='Success' (array?='[' length=INT? ']')? name=STRING
		public Group getGroup() { return cGroup; }
		
		//simulationType='Success'
		public Assignment getSimulationTypeAssignment_0() { return cSimulationTypeAssignment_0; }
		
		//'Success'
		public Keyword getSimulationTypeSuccessKeyword_0_0() { return cSimulationTypeSuccessKeyword_0_0; }
		
		//(array?='[' length=INT? ']')?
		public Group getGroup_1() { return cGroup_1; }
		
		//array?='['
		public Assignment getArrayAssignment_1_0() { return cArrayAssignment_1_0; }
		
		//'['
		public Keyword getArrayLeftSquareBracketKeyword_1_0_0() { return cArrayLeftSquareBracketKeyword_1_0_0; }
		
		//length=INT?
		public Assignment getLengthAssignment_1_1() { return cLengthAssignment_1_1; }
		
		//INT
		public RuleCall getLengthINTTerminalRuleCall_1_1_0() { return cLengthINTTerminalRuleCall_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_2() { return cRightSquareBracketKeyword_1_2; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
	}
	public class FailureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "zanshin.dsl.Dsl.Failure");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSimulationTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cSimulationTypeFailureKeyword_0_0 = (Keyword)cSimulationTypeAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cArrayAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final Keyword cArrayLeftSquareBracketKeyword_1_0_0 = (Keyword)cArrayAssignment_1_0.eContents().get(0);
		private final Assignment cLengthAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cLengthINTTerminalRuleCall_1_1_0 = (RuleCall)cLengthAssignment_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Failure:
		//	simulationType='Failure' (array?='[' length=INT? ']')? name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//simulationType='Failure' (array?='[' length=INT? ']')? name=STRING
		public Group getGroup() { return cGroup; }
		
		//simulationType='Failure'
		public Assignment getSimulationTypeAssignment_0() { return cSimulationTypeAssignment_0; }
		
		//'Failure'
		public Keyword getSimulationTypeFailureKeyword_0_0() { return cSimulationTypeFailureKeyword_0_0; }
		
		//(array?='[' length=INT? ']')?
		public Group getGroup_1() { return cGroup_1; }
		
		//array?='['
		public Assignment getArrayAssignment_1_0() { return cArrayAssignment_1_0; }
		
		//'['
		public Keyword getArrayLeftSquareBracketKeyword_1_0_0() { return cArrayLeftSquareBracketKeyword_1_0_0; }
		
		//length=INT?
		public Assignment getLengthAssignment_1_1() { return cLengthAssignment_1_1; }
		
		//INT
		public RuleCall getLengthINTTerminalRuleCall_1_1_0() { return cLengthINTTerminalRuleCall_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_2() { return cRightSquareBracketKeyword_1_2; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
	}
	public class TestQuantityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "zanshin.dsl.Dsl.TestQuantity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPartKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNumberAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNumberINTTerminalRuleCall_1_0 = (RuleCall)cNumberAssignment_1.eContents().get(0);
		
		//TestQuantity:
		//	'Part' number=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'Part' number=INT
		public Group getGroup() { return cGroup; }
		
		//'Part'
		public Keyword getPartKeyword_0() { return cPartKeyword_0; }
		
		//number=INT
		public Assignment getNumberAssignment_1() { return cNumberAssignment_1; }
		
		//INT
		public RuleCall getNumberINTTerminalRuleCall_1_0() { return cNumberINTTerminalRuleCall_1_0; }
	}
	public class LogElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "zanshin.dsl.Dsl.Log");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLogKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cMessageAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMessageSTRINGTerminalRuleCall_1_0 = (RuleCall)cMessageAssignment_1.eContents().get(0);
		
		//Log:
		//	'Log' message=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'Log' message=STRING
		public Group getGroup() { return cGroup; }
		
		//'Log'
		public Keyword getLogKeyword_0() { return cLogKeyword_0; }
		
		//message=STRING
		public Assignment getMessageAssignment_1() { return cMessageAssignment_1; }
		
		//STRING
		public RuleCall getMessageSTRINGTerminalRuleCall_1_0() { return cMessageSTRINGTerminalRuleCall_1_0; }
	}
	public class ScopeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "zanshin.dsl.Dsl.Scope");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cProjectAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cProjectProjectParserRuleCall_0_0 = (RuleCall)cProjectAssignment_0.eContents().get(0);
		private final Keyword cSimulationKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cLengthAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLengthINTTerminalRuleCall_3_0 = (RuleCall)cLengthAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Assignment cTestquantityAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final RuleCall cTestquantityTestQuantityParserRuleCall_4_0_0 = (RuleCall)cTestquantityAssignment_4_0.eContents().get(0);
		private final Assignment cCommandsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cCommandsCommandsParserRuleCall_4_1_0 = (RuleCall)cCommandsAssignment_4_1.eContents().get(0);
		private final Assignment cMessageAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cMessageLogParserRuleCall_4_2_0 = (RuleCall)cMessageAssignment_4_2.eContents().get(0);
		
		//Scope:
		//	project=Project
		//	'Simulation' name=ID length=INT? (testquantity+=TestQuantity?
		//	commands+=Commands message+=Log?)*;
		@Override public ParserRule getRule() { return rule; }
		
		//project=Project 'Simulation' name=ID length=INT? (testquantity+=TestQuantity? commands+=Commands message+=Log?)*
		public Group getGroup() { return cGroup; }
		
		//project=Project
		public Assignment getProjectAssignment_0() { return cProjectAssignment_0; }
		
		//Project
		public RuleCall getProjectProjectParserRuleCall_0_0() { return cProjectProjectParserRuleCall_0_0; }
		
		//'Simulation'
		public Keyword getSimulationKeyword_1() { return cSimulationKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//length=INT?
		public Assignment getLengthAssignment_3() { return cLengthAssignment_3; }
		
		//INT
		public RuleCall getLengthINTTerminalRuleCall_3_0() { return cLengthINTTerminalRuleCall_3_0; }
		
		//(testquantity+=TestQuantity? commands+=Commands message+=Log?)*
		public Group getGroup_4() { return cGroup_4; }
		
		//testquantity+=TestQuantity?
		public Assignment getTestquantityAssignment_4_0() { return cTestquantityAssignment_4_0; }
		
		//TestQuantity
		public RuleCall getTestquantityTestQuantityParserRuleCall_4_0_0() { return cTestquantityTestQuantityParserRuleCall_4_0_0; }
		
		//commands+=Commands
		public Assignment getCommandsAssignment_4_1() { return cCommandsAssignment_4_1; }
		
		//Commands
		public RuleCall getCommandsCommandsParserRuleCall_4_1_0() { return cCommandsCommandsParserRuleCall_4_1_0; }
		
		//message+=Log?
		public Assignment getMessageAssignment_4_2() { return cMessageAssignment_4_2; }
		
		//Log
		public RuleCall getMessageLogParserRuleCall_4_2_0() { return cMessageLogParserRuleCall_4_2_0; }
	}
	public class CommandsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "zanshin.dsl.Dsl.Commands");
		private final Assignment cTypeAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTypeTypeParserRuleCall_0 = (RuleCall)cTypeAssignment.eContents().get(0);
		
		//Commands:
		//	type=Type;
		@Override public ParserRule getRule() { return rule; }
		
		//type=Type
		public Assignment getTypeAssignment() { return cTypeAssignment; }
		
		//Type
		public RuleCall getTypeTypeParserRuleCall_0() { return cTypeTypeParserRuleCall_0; }
	}
	
	
	private final ModelElements pModel;
	private final ProjectElements pProject;
	private final QualifiedNameElements pQualifiedName;
	private final QualifiedNameWithWildcardElements pQualifiedNameWithWildcard;
	private final TypeElements pType;
	private final SuccessElements pSuccess;
	private final FailureElements pFailure;
	private final TestQuantityElements pTestQuantity;
	private final LogElements pLog;
	private final ScopeElements pScope;
	private final CommandsElements pCommands;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pProject = new ProjectElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pQualifiedNameWithWildcard = new QualifiedNameWithWildcardElements();
		this.pType = new TypeElements();
		this.pSuccess = new SuccessElements();
		this.pFailure = new FailureElements();
		this.pTestQuantity = new TestQuantityElements();
		this.pLog = new LogElements();
		this.pScope = new ScopeElements();
		this.pCommands = new CommandsElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("zanshin.dsl.Dsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	dsl+=Scope*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Project:
	//	'project' importedNamespace=QualifiedNameWithWildcard;
	public ProjectElements getProjectAccess() {
		return pProject;
	}
	
	public ParserRule getProjectRule() {
		return getProjectAccess().getRule();
	}
	
	//QualifiedName:
	//	STRING ('.' STRING)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//QualifiedNameWithWildcard:
	//	QualifiedName '.*'?;
	public QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return pQualifiedNameWithWildcard;
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}
	
	//Type:
	//	Success | Failure;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//Success:
	//	simulationType='Success' (array?='[' length=INT? ']')? name=STRING;
	public SuccessElements getSuccessAccess() {
		return pSuccess;
	}
	
	public ParserRule getSuccessRule() {
		return getSuccessAccess().getRule();
	}
	
	//Failure:
	//	simulationType='Failure' (array?='[' length=INT? ']')? name=STRING;
	public FailureElements getFailureAccess() {
		return pFailure;
	}
	
	public ParserRule getFailureRule() {
		return getFailureAccess().getRule();
	}
	
	//TestQuantity:
	//	'Part' number=INT;
	public TestQuantityElements getTestQuantityAccess() {
		return pTestQuantity;
	}
	
	public ParserRule getTestQuantityRule() {
		return getTestQuantityAccess().getRule();
	}
	
	//Log:
	//	'Log' message=STRING;
	public LogElements getLogAccess() {
		return pLog;
	}
	
	public ParserRule getLogRule() {
		return getLogAccess().getRule();
	}
	
	//Scope:
	//	project=Project
	//	'Simulation' name=ID length=INT? (testquantity+=TestQuantity?
	//	commands+=Commands message+=Log?)*;
	public ScopeElements getScopeAccess() {
		return pScope;
	}
	
	public ParserRule getScopeRule() {
		return getScopeAccess().getRule();
	}
	
	//Commands:
	//	type=Type;
	public CommandsElements getCommandsAccess() {
		return pCommands;
	}
	
	public ParserRule getCommandsRule() {
		return getCommandsAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
