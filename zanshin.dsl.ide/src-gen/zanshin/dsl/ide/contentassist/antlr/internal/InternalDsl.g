/*
 * generated by Xtext 2.10.0
 */
grammar InternalDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package zanshin.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package zanshin.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import zanshin.dsl.services.DslGrammarAccess;

}
@parser::members {
	private DslGrammarAccess grammarAccess;

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getDslAssignment()); }
		(rule__Model__DslAssignment)*
		{ after(grammarAccess.getModelAccess().getDslAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProject
entryRuleProject
:
{ before(grammarAccess.getProjectRule()); }
	 ruleProject
{ after(grammarAccess.getProjectRule()); } 
	 EOF 
;

// Rule Project
ruleProject 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProjectAccess().getGroup()); }
		(rule__Project__Group__0)
		{ after(grammarAccess.getProjectAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
		(rule__QualifiedName__Group__0)
		{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedNameWithWildcard
entryRuleQualifiedNameWithWildcard
:
{ before(grammarAccess.getQualifiedNameWithWildcardRule()); }
	 ruleQualifiedNameWithWildcard
{ after(grammarAccess.getQualifiedNameWithWildcardRule()); } 
	 EOF 
;

// Rule QualifiedNameWithWildcard
ruleQualifiedNameWithWildcard 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); }
		(rule__QualifiedNameWithWildcard__Group__0)
		{ after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getAlternatives()); }
		(rule__Type__Alternatives)
		{ after(grammarAccess.getTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSuccess
entryRuleSuccess
:
{ before(grammarAccess.getSuccessRule()); }
	 ruleSuccess
{ after(grammarAccess.getSuccessRule()); } 
	 EOF 
;

// Rule Success
ruleSuccess 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSuccessAccess().getGroup()); }
		(rule__Success__Group__0)
		{ after(grammarAccess.getSuccessAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFailure
entryRuleFailure
:
{ before(grammarAccess.getFailureRule()); }
	 ruleFailure
{ after(grammarAccess.getFailureRule()); } 
	 EOF 
;

// Rule Failure
ruleFailure 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFailureAccess().getGroup()); }
		(rule__Failure__Group__0)
		{ after(grammarAccess.getFailureAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTestQuantity
entryRuleTestQuantity
:
{ before(grammarAccess.getTestQuantityRule()); }
	 ruleTestQuantity
{ after(grammarAccess.getTestQuantityRule()); } 
	 EOF 
;

// Rule TestQuantity
ruleTestQuantity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTestQuantityAccess().getGroup()); }
		(rule__TestQuantity__Group__0)
		{ after(grammarAccess.getTestQuantityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScope
entryRuleScope
:
{ before(grammarAccess.getScopeRule()); }
	 ruleScope
{ after(grammarAccess.getScopeRule()); } 
	 EOF 
;

// Rule Scope
ruleScope 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScopeAccess().getGroup()); }
		(rule__Scope__Group__0)
		{ after(grammarAccess.getScopeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCommands
entryRuleCommands
:
{ before(grammarAccess.getCommandsRule()); }
	 ruleCommands
{ after(grammarAccess.getCommandsRule()); } 
	 EOF 
;

// Rule Commands
ruleCommands 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCommandsAccess().getTypeParserRuleCall()); }
		ruleType
		{ after(grammarAccess.getCommandsAccess().getTypeParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getSuccessParserRuleCall_0()); }
		ruleSuccess
		{ after(grammarAccess.getTypeAccess().getSuccessParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getFailureParserRuleCall_1()); }
		ruleFailure
		{ after(grammarAccess.getTypeAccess().getFailureParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Project__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Project__Group__0__Impl
	rule__Project__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Project__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProjectAccess().getProjectKeyword_0()); }
	'project'
	{ after(grammarAccess.getProjectAccess().getProjectKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Project__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Project__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Project__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProjectAccess().getImportedNamespaceAssignment_1()); }
	(rule__Project__ImportedNamespaceAssignment_1)
	{ after(grammarAccess.getProjectAccess().getImportedNamespaceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_0()); }
	RULE_STRING
	{ after(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
	(rule__QualifiedName__Group_1__0)*
	{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_1_1()); }
	RULE_STRING
	{ after(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedNameWithWildcard__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedNameWithWildcard__Group__0__Impl
	rule__QualifiedNameWithWildcard__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedNameWithWildcard__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); }
	ruleQualifiedName
	{ after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedNameWithWildcard__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedNameWithWildcard__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedNameWithWildcard__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); }
	('.*')?
	{ after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Success__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Success__Group__0__Impl
	rule__Success__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Success__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSuccessAccess().getSuccessKeyword_0()); }
	'Success'
	{ after(grammarAccess.getSuccessAccess().getSuccessKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Success__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Success__Group__1__Impl
	rule__Success__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Success__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSuccessAccess().getGroup_1()); }
	(rule__Success__Group_1__0)?
	{ after(grammarAccess.getSuccessAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Success__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Success__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Success__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSuccessAccess().getNameAssignment_2()); }
	(rule__Success__NameAssignment_2)
	{ after(grammarAccess.getSuccessAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Success__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Success__Group_1__0__Impl
	rule__Success__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Success__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSuccessAccess().getArrayAssignment_1_0()); }
	(rule__Success__ArrayAssignment_1_0)
	{ after(grammarAccess.getSuccessAccess().getArrayAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Success__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Success__Group_1__1__Impl
	rule__Success__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Success__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSuccessAccess().getLengthAssignment_1_1()); }
	(rule__Success__LengthAssignment_1_1)?
	{ after(grammarAccess.getSuccessAccess().getLengthAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Success__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Success__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Success__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSuccessAccess().getRightSquareBracketKeyword_1_2()); }
	']'
	{ after(grammarAccess.getSuccessAccess().getRightSquareBracketKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Failure__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Failure__Group__0__Impl
	rule__Failure__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Failure__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFailureAccess().getFailureKeyword_0()); }
	'Failure'
	{ after(grammarAccess.getFailureAccess().getFailureKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Failure__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Failure__Group__1__Impl
	rule__Failure__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Failure__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFailureAccess().getGroup_1()); }
	(rule__Failure__Group_1__0)?
	{ after(grammarAccess.getFailureAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Failure__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Failure__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Failure__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFailureAccess().getNameAssignment_2()); }
	(rule__Failure__NameAssignment_2)
	{ after(grammarAccess.getFailureAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Failure__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Failure__Group_1__0__Impl
	rule__Failure__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Failure__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFailureAccess().getArrayAssignment_1_0()); }
	(rule__Failure__ArrayAssignment_1_0)
	{ after(grammarAccess.getFailureAccess().getArrayAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Failure__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Failure__Group_1__1__Impl
	rule__Failure__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Failure__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFailureAccess().getLengthAssignment_1_1()); }
	(rule__Failure__LengthAssignment_1_1)?
	{ after(grammarAccess.getFailureAccess().getLengthAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Failure__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Failure__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Failure__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFailureAccess().getRightSquareBracketKeyword_1_2()); }
	']'
	{ after(grammarAccess.getFailureAccess().getRightSquareBracketKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TestQuantity__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TestQuantity__Group__0__Impl
	rule__TestQuantity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TestQuantity__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestQuantityAccess().getPartKeyword_0()); }
	'Part'
	{ after(grammarAccess.getTestQuantityAccess().getPartKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TestQuantity__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TestQuantity__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TestQuantity__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTestQuantityAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
	{ after(grammarAccess.getTestQuantityAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scope__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scope__Group__0__Impl
	rule__Scope__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scope__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScopeAccess().getProjectAssignment_0()); }
	(rule__Scope__ProjectAssignment_0)
	{ after(grammarAccess.getScopeAccess().getProjectAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scope__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scope__Group__1__Impl
	rule__Scope__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scope__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScopeAccess().getSimulationKeyword_1()); }
	'Simulation'
	{ after(grammarAccess.getScopeAccess().getSimulationKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scope__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scope__Group__2__Impl
	rule__Scope__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Scope__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScopeAccess().getNameAssignment_2()); }
	(rule__Scope__NameAssignment_2)
	{ after(grammarAccess.getScopeAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scope__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scope__Group__3__Impl
	rule__Scope__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Scope__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScopeAccess().getLengthAssignment_3()); }
	(rule__Scope__LengthAssignment_3)?
	{ after(grammarAccess.getScopeAccess().getLengthAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scope__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scope__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scope__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScopeAccess().getGroup_4()); }
	(rule__Scope__Group_4__0)*
	{ after(grammarAccess.getScopeAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scope__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scope__Group_4__0__Impl
	rule__Scope__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scope__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScopeAccess().getTestquantityAssignment_4_0()); }
	(rule__Scope__TestquantityAssignment_4_0)?
	{ after(grammarAccess.getScopeAccess().getTestquantityAssignment_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scope__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scope__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scope__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScopeAccess().getCommandsAssignment_4_1()); }
	(rule__Scope__CommandsAssignment_4_1)
	{ after(grammarAccess.getScopeAccess().getCommandsAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__DslAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getDslScopeParserRuleCall_0()); }
		ruleScope
		{ after(grammarAccess.getModelAccess().getDslScopeParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Project__ImportedNamespaceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProjectAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); }
		ruleQualifiedNameWithWildcard
		{ after(grammarAccess.getProjectAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Success__ArrayAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSuccessAccess().getArrayLeftSquareBracketKeyword_1_0_0()); }
		(
			{ before(grammarAccess.getSuccessAccess().getArrayLeftSquareBracketKeyword_1_0_0()); }
			'['
			{ after(grammarAccess.getSuccessAccess().getArrayLeftSquareBracketKeyword_1_0_0()); }
		)
		{ after(grammarAccess.getSuccessAccess().getArrayLeftSquareBracketKeyword_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Success__LengthAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSuccessAccess().getLengthINTTerminalRuleCall_1_1_0()); }
		RULE_INT
		{ after(grammarAccess.getSuccessAccess().getLengthINTTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Success__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSuccessAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getSuccessAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Failure__ArrayAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFailureAccess().getArrayLeftSquareBracketKeyword_1_0_0()); }
		(
			{ before(grammarAccess.getFailureAccess().getArrayLeftSquareBracketKeyword_1_0_0()); }
			'['
			{ after(grammarAccess.getFailureAccess().getArrayLeftSquareBracketKeyword_1_0_0()); }
		)
		{ after(grammarAccess.getFailureAccess().getArrayLeftSquareBracketKeyword_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Failure__LengthAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFailureAccess().getLengthINTTerminalRuleCall_1_1_0()); }
		RULE_INT
		{ after(grammarAccess.getFailureAccess().getLengthINTTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Failure__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFailureAccess().getNameSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getFailureAccess().getNameSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scope__ProjectAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScopeAccess().getProjectProjectParserRuleCall_0_0()); }
		ruleProject
		{ after(grammarAccess.getScopeAccess().getProjectProjectParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scope__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScopeAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getScopeAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scope__LengthAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScopeAccess().getLengthINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getScopeAccess().getLengthINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scope__TestquantityAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScopeAccess().getTestquantityTestQuantityParserRuleCall_4_0_0()); }
		ruleTestQuantity
		{ after(grammarAccess.getScopeAccess().getTestquantityTestQuantityParserRuleCall_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scope__CommandsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScopeAccess().getCommandsCommandsParserRuleCall_4_1_0()); }
		ruleCommands
		{ after(grammarAccess.getScopeAccess().getCommandsCommandsParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;