/*
 * generated by Xtext 2.10.0
 */
grammar InternalDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package zanshin.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package zanshin.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import zanshin.dsl.services.DslGrammarAccess;

}

@parser::members {

 	private DslGrammarAccess grammarAccess;

    public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected DslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getDslScopeParserRuleCall_0());
			}
			lv_dsl_0_0=ruleScope
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"dsl",
					lv_dsl_0_0,
					"zanshin.dsl.Dsl.Scope");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleProject
entryRuleProject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProjectRule()); }
	iv_ruleProject=ruleProject
	{ $current=$iv_ruleProject.current; }
	EOF;

// Rule Project
ruleProject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='project'
		{
			newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProjectAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
				}
				lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProjectRule());
					}
					set(
						$current,
						"importedNamespace",
						lv_importedNamespace_1_0,
						"zanshin.dsl.Dsl.QualifiedNameWithWildcard");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_STRING_2=RULE_STRING
			{
				$current.merge(this_STRING_2);
			}
			{
				newLeafNode(this_STRING_2, grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleQualifiedNameWithWildcard
entryRuleQualifiedNameWithWildcard returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); }
	iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard
	{ $current=$iv_ruleQualifiedNameWithWildcard.current.getText(); }
	EOF;

// Rule QualifiedNameWithWildcard
ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
		}
		this_QualifiedName_0=ruleQualifiedName
		{
			$current.merge(this_QualifiedName_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='.*'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTypeAccess().getSuccessParserRuleCall_0());
		}
		this_Success_0=ruleSuccess
		{
			$current = $this_Success_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getFailureParserRuleCall_1());
		}
		this_Failure_1=ruleFailure
		{
			$current = $this_Failure_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSuccess
entryRuleSuccess returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSuccessRule()); }
	iv_ruleSuccess=ruleSuccess
	{ $current=$iv_ruleSuccess.current; }
	EOF;

// Rule Success
ruleSuccess returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_simulationType_0_0='Success'
				{
					newLeafNode(lv_simulationType_0_0, grammarAccess.getSuccessAccess().getSimulationTypeSuccessKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSuccessRule());
					}
					setWithLastConsumed($current, "simulationType", lv_simulationType_0_0, "Success");
				}
			)
		)
		(
			(
				(
					lv_array_1_0='['
					{
						newLeafNode(lv_array_1_0, grammarAccess.getSuccessAccess().getArrayLeftSquareBracketKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSuccessRule());
						}
						setWithLastConsumed($current, "array", true, "[");
					}
				)
			)
			(
				(
					lv_length_2_0=RULE_INT
					{
						newLeafNode(lv_length_2_0, grammarAccess.getSuccessAccess().getLengthINTTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSuccessRule());
						}
						setWithLastConsumed(
							$current,
							"length",
							lv_length_2_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)?
			otherlv_3=']'
			{
				newLeafNode(otherlv_3, grammarAccess.getSuccessAccess().getRightSquareBracketKeyword_1_2());
			}
		)?
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getSuccessAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSuccessRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleFailure
entryRuleFailure returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFailureRule()); }
	iv_ruleFailure=ruleFailure
	{ $current=$iv_ruleFailure.current; }
	EOF;

// Rule Failure
ruleFailure returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_simulationType_0_0='Failure'
				{
					newLeafNode(lv_simulationType_0_0, grammarAccess.getFailureAccess().getSimulationTypeFailureKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFailureRule());
					}
					setWithLastConsumed($current, "simulationType", lv_simulationType_0_0, "Failure");
				}
			)
		)
		(
			(
				(
					lv_array_1_0='['
					{
						newLeafNode(lv_array_1_0, grammarAccess.getFailureAccess().getArrayLeftSquareBracketKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFailureRule());
						}
						setWithLastConsumed($current, "array", true, "[");
					}
				)
			)
			(
				(
					lv_length_2_0=RULE_INT
					{
						newLeafNode(lv_length_2_0, grammarAccess.getFailureAccess().getLengthINTTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFailureRule());
						}
						setWithLastConsumed(
							$current,
							"length",
							lv_length_2_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)?
			otherlv_3=']'
			{
				newLeafNode(otherlv_3, grammarAccess.getFailureAccess().getRightSquareBracketKeyword_1_2());
			}
		)?
		(
			(
				lv_name_4_0=RULE_STRING
				{
					newLeafNode(lv_name_4_0, grammarAccess.getFailureAccess().getNameSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFailureRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleTestQuantity
entryRuleTestQuantity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestQuantityRule()); }
	iv_ruleTestQuantity=ruleTestQuantity
	{ $current=$iv_ruleTestQuantity.current; }
	EOF;

// Rule TestQuantity
ruleTestQuantity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Part'
		{
			newLeafNode(otherlv_0, grammarAccess.getTestQuantityAccess().getPartKeyword_0());
		}
		(
			(
				lv_number_1_0=RULE_INT
				{
					newLeafNode(lv_number_1_0, grammarAccess.getTestQuantityAccess().getNumberINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTestQuantityRule());
					}
					setWithLastConsumed(
						$current,
						"number",
						lv_number_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleScope
entryRuleScope returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScopeRule()); }
	iv_ruleScope=ruleScope
	{ $current=$iv_ruleScope.current; }
	EOF;

// Rule Scope
ruleScope returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getScopeAccess().getProjectProjectParserRuleCall_0_0());
				}
				lv_project_0_0=ruleProject
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScopeRule());
					}
					set(
						$current,
						"project",
						lv_project_0_0,
						"zanshin.dsl.Dsl.Project");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='Simulation'
		{
			newLeafNode(otherlv_1, grammarAccess.getScopeAccess().getSimulationKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getScopeAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScopeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_length_3_0=RULE_INT
				{
					newLeafNode(lv_length_3_0, grammarAccess.getScopeAccess().getLengthINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScopeRule());
					}
					setWithLastConsumed(
						$current,
						"length",
						lv_length_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getScopeAccess().getTestquantityTestQuantityParserRuleCall_4_0_0());
					}
					lv_testquantity_4_0=ruleTestQuantity
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getScopeRule());
						}
						add(
							$current,
							"testquantity",
							lv_testquantity_4_0,
							"zanshin.dsl.Dsl.TestQuantity");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getScopeAccess().getCommandsCommandsParserRuleCall_4_1_0());
					}
					lv_commands_5_0=ruleCommands
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getScopeRule());
						}
						add(
							$current,
							"commands",
							lv_commands_5_0,
							"zanshin.dsl.Dsl.Commands");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleCommands
entryRuleCommands returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommandsRule()); }
	iv_ruleCommands=ruleCommands
	{ $current=$iv_ruleCommands.current; }
	EOF;

// Rule Commands
ruleCommands returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getCommandsAccess().getTypeTypeParserRuleCall_0());
			}
			lv_type_0_0=ruleType
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getCommandsRule());
				}
				set(
					$current,
					"type",
					lv_type_0_0,
					"zanshin.dsl.Dsl.Type");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
