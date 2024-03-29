/*
 * generated by Xtext 2.10.0
 */
package zanshin.dsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import zanshin.dsl.ide.contentassist.antlr.internal.InternalDslParser;
import zanshin.dsl.services.DslGrammarAccess;

public class DslParser extends AbstractContentAssistParser {

	@Inject
	private DslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDslParser createParser() {
		InternalDslParser result = new InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTestTypeAccess().getAlternatives(), "rule__TestType__Alternatives");
					put(grammarAccess.getProjectAccess().getGroup(), "rule__Project__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getSuccessAccess().getGroup(), "rule__Success__Group__0");
					put(grammarAccess.getSuccessAccess().getGroup_1(), "rule__Success__Group_1__0");
					put(grammarAccess.getFailureAccess().getGroup(), "rule__Failure__Group__0");
					put(grammarAccess.getFailureAccess().getGroup_1(), "rule__Failure__Group_1__0");
					put(grammarAccess.getLogAccess().getGroup(), "rule__Log__Group__0");
					put(grammarAccess.getScopeAccess().getGroup(), "rule__Scope__Group__0");
					put(grammarAccess.getScopeAccess().getGroup_1(), "rule__Scope__Group_1__0");
					put(grammarAccess.getScopeAccess().getGroup_1_0(), "rule__Scope__Group_1_0__0");
					put(grammarAccess.getCommandBlockAccess().getGroup(), "rule__CommandBlock__Group__0");
					put(grammarAccess.getModelAccess().getDslAssignment(), "rule__Model__DslAssignment");
					put(grammarAccess.getProjectAccess().getImportedNamespaceAssignment_1(), "rule__Project__ImportedNamespaceAssignment_1");
					put(grammarAccess.getSuccessAccess().getSimulationTypeAssignment_0(), "rule__Success__SimulationTypeAssignment_0");
					put(grammarAccess.getSuccessAccess().getArrayAssignment_1_0(), "rule__Success__ArrayAssignment_1_0");
					put(grammarAccess.getSuccessAccess().getLengthAssignment_1_1(), "rule__Success__LengthAssignment_1_1");
					put(grammarAccess.getSuccessAccess().getNameAssignment_2(), "rule__Success__NameAssignment_2");
					put(grammarAccess.getFailureAccess().getSimulationTypeAssignment_0(), "rule__Failure__SimulationTypeAssignment_0");
					put(grammarAccess.getFailureAccess().getArrayAssignment_1_0(), "rule__Failure__ArrayAssignment_1_0");
					put(grammarAccess.getFailureAccess().getLengthAssignment_1_1(), "rule__Failure__LengthAssignment_1_1");
					put(grammarAccess.getFailureAccess().getNameAssignment_2(), "rule__Failure__NameAssignment_2");
					put(grammarAccess.getLogAccess().getMessageAssignment_1(), "rule__Log__MessageAssignment_1");
					put(grammarAccess.getScopeAccess().getProjectAssignment_0(), "rule__Scope__ProjectAssignment_0");
					put(grammarAccess.getScopeAccess().getSimulationAssignment_1_0_0(), "rule__Scope__SimulationAssignment_1_0_0");
					put(grammarAccess.getScopeAccess().getNameAssignment_1_0_1(), "rule__Scope__NameAssignment_1_0_1");
					put(grammarAccess.getScopeAccess().getLengthAssignment_1_0_2(), "rule__Scope__LengthAssignment_1_0_2");
					put(grammarAccess.getScopeAccess().getCommandsAssignment_1_1(), "rule__Scope__CommandsAssignment_1_1");
					put(grammarAccess.getCommandBlockAccess().getTesttypeAssignment_1(), "rule__CommandBlock__TesttypeAssignment_1");
					put(grammarAccess.getCommandBlockAccess().getMessageAssignment_2(), "rule__CommandBlock__MessageAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalDslParser typedParser = (InternalDslParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
