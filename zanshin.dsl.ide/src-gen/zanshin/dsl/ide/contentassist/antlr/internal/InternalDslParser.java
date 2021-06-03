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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'.'", "'.*'", "'Success'", "']'", "'Failure'", "'Part'", "'Simulation'", "'['"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }


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



    // $ANTLR start "entryRuleModel"
    // InternalDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleModel EOF )
            // InternalDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDsl.g:62:1: ruleModel : ( ( rule__Model__DslAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Model__DslAssignment )* ) )
            // InternalDsl.g:67:2: ( ( rule__Model__DslAssignment )* )
            {
            // InternalDsl.g:67:2: ( ( rule__Model__DslAssignment )* )
            // InternalDsl.g:68:3: ( rule__Model__DslAssignment )*
            {
             before(grammarAccess.getModelAccess().getDslAssignment()); 
            // InternalDsl.g:69:3: ( rule__Model__DslAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:69:4: rule__Model__DslAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__DslAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDslAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProject"
    // InternalDsl.g:78:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleProject EOF )
            // InternalDsl.g:80:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalDsl.g:87:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Project__Group__0 ) ) )
            // InternalDsl.g:92:2: ( ( rule__Project__Group__0 ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Project__Group__0 ) )
            // InternalDsl.g:93:3: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // InternalDsl.g:94:3: ( rule__Project__Group__0 )
            // InternalDsl.g:94:4: rule__Project__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDsl.g:103:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleQualifiedName EOF )
            // InternalDsl.g:105:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDsl.g:112:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__QualifiedName__Group__0 )
            // InternalDsl.g:119:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalDsl.g:128:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalDsl.g:130:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalDsl.g:137:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalDsl.g:144:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleType"
    // InternalDsl.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleType EOF )
            // InternalDsl.g:155:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDsl.g:162:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalDsl.g:167:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Type__Alternatives ) )
            // InternalDsl.g:168:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalDsl.g:169:3: ( rule__Type__Alternatives )
            // InternalDsl.g:169:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSuccess"
    // InternalDsl.g:178:1: entryRuleSuccess : ruleSuccess EOF ;
    public final void entryRuleSuccess() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleSuccess EOF )
            // InternalDsl.g:180:1: ruleSuccess EOF
            {
             before(grammarAccess.getSuccessRule()); 
            pushFollow(FOLLOW_1);
            ruleSuccess();

            state._fsp--;

             after(grammarAccess.getSuccessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSuccess"


    // $ANTLR start "ruleSuccess"
    // InternalDsl.g:187:1: ruleSuccess : ( ( rule__Success__Group__0 ) ) ;
    public final void ruleSuccess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Success__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__Success__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Success__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__Success__Group__0 )
            {
             before(grammarAccess.getSuccessAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__Success__Group__0 )
            // InternalDsl.g:194:4: rule__Success__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Success__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSuccessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSuccess"


    // $ANTLR start "entryRuleFailure"
    // InternalDsl.g:203:1: entryRuleFailure : ruleFailure EOF ;
    public final void entryRuleFailure() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleFailure EOF )
            // InternalDsl.g:205:1: ruleFailure EOF
            {
             before(grammarAccess.getFailureRule()); 
            pushFollow(FOLLOW_1);
            ruleFailure();

            state._fsp--;

             after(grammarAccess.getFailureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFailure"


    // $ANTLR start "ruleFailure"
    // InternalDsl.g:212:1: ruleFailure : ( ( rule__Failure__Group__0 ) ) ;
    public final void ruleFailure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__Failure__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__Failure__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__Failure__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__Failure__Group__0 )
            {
             before(grammarAccess.getFailureAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__Failure__Group__0 )
            // InternalDsl.g:219:4: rule__Failure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Failure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFailureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFailure"


    // $ANTLR start "entryRuleTestQuantity"
    // InternalDsl.g:228:1: entryRuleTestQuantity : ruleTestQuantity EOF ;
    public final void entryRuleTestQuantity() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleTestQuantity EOF )
            // InternalDsl.g:230:1: ruleTestQuantity EOF
            {
             before(grammarAccess.getTestQuantityRule()); 
            pushFollow(FOLLOW_1);
            ruleTestQuantity();

            state._fsp--;

             after(grammarAccess.getTestQuantityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTestQuantity"


    // $ANTLR start "ruleTestQuantity"
    // InternalDsl.g:237:1: ruleTestQuantity : ( ( rule__TestQuantity__Group__0 ) ) ;
    public final void ruleTestQuantity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__TestQuantity__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__TestQuantity__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__TestQuantity__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__TestQuantity__Group__0 )
            {
             before(grammarAccess.getTestQuantityAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__TestQuantity__Group__0 )
            // InternalDsl.g:244:4: rule__TestQuantity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TestQuantity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestQuantityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestQuantity"


    // $ANTLR start "entryRuleScope"
    // InternalDsl.g:253:1: entryRuleScope : ruleScope EOF ;
    public final void entryRuleScope() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleScope EOF )
            // InternalDsl.g:255:1: ruleScope EOF
            {
             before(grammarAccess.getScopeRule()); 
            pushFollow(FOLLOW_1);
            ruleScope();

            state._fsp--;

             after(grammarAccess.getScopeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalDsl.g:262:1: ruleScope : ( ( rule__Scope__Group__0 ) ) ;
    public final void ruleScope() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__Scope__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__Scope__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__Scope__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__Scope__Group__0 )
            {
             before(grammarAccess.getScopeAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__Scope__Group__0 )
            // InternalDsl.g:269:4: rule__Scope__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleCommands"
    // InternalDsl.g:278:1: entryRuleCommands : ruleCommands EOF ;
    public final void entryRuleCommands() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleCommands EOF )
            // InternalDsl.g:280:1: ruleCommands EOF
            {
             before(grammarAccess.getCommandsRule()); 
            pushFollow(FOLLOW_1);
            ruleCommands();

            state._fsp--;

             after(grammarAccess.getCommandsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // InternalDsl.g:287:1: ruleCommands : ( ruleType ) ;
    public final void ruleCommands() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ruleType ) )
            // InternalDsl.g:292:2: ( ruleType )
            {
            // InternalDsl.g:292:2: ( ruleType )
            // InternalDsl.g:293:3: ruleType
            {
             before(grammarAccess.getCommandsAccess().getTypeParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getCommandsAccess().getTypeParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommands"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalDsl.g:302:1: rule__Type__Alternatives : ( ( ruleSuccess ) | ( ruleFailure ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:306:1: ( ( ruleSuccess ) | ( ruleFailure ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:307:2: ( ruleSuccess )
                    {
                    // InternalDsl.g:307:2: ( ruleSuccess )
                    // InternalDsl.g:308:3: ruleSuccess
                    {
                     before(grammarAccess.getTypeAccess().getSuccessParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSuccess();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getSuccessParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:313:2: ( ruleFailure )
                    {
                    // InternalDsl.g:313:2: ( ruleFailure )
                    // InternalDsl.g:314:3: ruleFailure
                    {
                     before(grammarAccess.getTypeAccess().getFailureParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFailure();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getFailureParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Project__Group__0"
    // InternalDsl.g:323:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:327:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalDsl.g:328:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // InternalDsl.g:335:1: rule__Project__Group__0__Impl : ( 'project' ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:339:1: ( ( 'project' ) )
            // InternalDsl.g:340:1: ( 'project' )
            {
            // InternalDsl.g:340:1: ( 'project' )
            // InternalDsl.g:341:2: 'project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // InternalDsl.g:350:1: rule__Project__Group__1 : rule__Project__Group__1__Impl ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:354:1: ( rule__Project__Group__1__Impl )
            // InternalDsl.g:355:2: rule__Project__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // InternalDsl.g:361:1: rule__Project__Group__1__Impl : ( ( rule__Project__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:365:1: ( ( ( rule__Project__ImportedNamespaceAssignment_1 ) ) )
            // InternalDsl.g:366:1: ( ( rule__Project__ImportedNamespaceAssignment_1 ) )
            {
            // InternalDsl.g:366:1: ( ( rule__Project__ImportedNamespaceAssignment_1 ) )
            // InternalDsl.g:367:2: ( rule__Project__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getProjectAccess().getImportedNamespaceAssignment_1()); 
            // InternalDsl.g:368:2: ( rule__Project__ImportedNamespaceAssignment_1 )
            // InternalDsl.g:368:3: rule__Project__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Project__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalDsl.g:377:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:381:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalDsl.g:382:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalDsl.g:389:1: rule__QualifiedName__Group__0__Impl : ( RULE_STRING ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:393:1: ( ( RULE_STRING ) )
            // InternalDsl.g:394:1: ( RULE_STRING )
            {
            // InternalDsl.g:394:1: ( RULE_STRING )
            // InternalDsl.g:395:2: RULE_STRING
            {
             before(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalDsl.g:404:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:408:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalDsl.g:409:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalDsl.g:415:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:419:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalDsl.g:420:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalDsl.g:420:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalDsl.g:421:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalDsl.g:422:2: ( rule__QualifiedName__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:422:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalDsl.g:431:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:435:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalDsl.g:436:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalDsl.g:443:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:447:1: ( ( '.' ) )
            // InternalDsl.g:448:1: ( '.' )
            {
            // InternalDsl.g:448:1: ( '.' )
            // InternalDsl.g:449:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalDsl.g:458:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:462:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalDsl.g:463:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalDsl.g:469:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_STRING ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:473:1: ( ( RULE_STRING ) )
            // InternalDsl.g:474:1: ( RULE_STRING )
            {
            // InternalDsl.g:474:1: ( RULE_STRING )
            // InternalDsl.g:475:2: RULE_STRING
            {
             before(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_1_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalDsl.g:485:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:489:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalDsl.g:490:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalDsl.g:497:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:501:1: ( ( ruleQualifiedName ) )
            // InternalDsl.g:502:1: ( ruleQualifiedName )
            {
            // InternalDsl.g:502:1: ( ruleQualifiedName )
            // InternalDsl.g:503:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalDsl.g:512:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalDsl.g:517:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalDsl.g:523:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:527:1: ( ( ( '.*' )? ) )
            // InternalDsl.g:528:1: ( ( '.*' )? )
            {
            // InternalDsl.g:528:1: ( ( '.*' )? )
            // InternalDsl.g:529:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalDsl.g:530:2: ( '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:530:3: '.*'
                    {
                    match(input,13,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__Success__Group__0"
    // InternalDsl.g:539:1: rule__Success__Group__0 : rule__Success__Group__0__Impl rule__Success__Group__1 ;
    public final void rule__Success__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:543:1: ( rule__Success__Group__0__Impl rule__Success__Group__1 )
            // InternalDsl.g:544:2: rule__Success__Group__0__Impl rule__Success__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Success__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Success__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Success__Group__0"


    // $ANTLR start "rule__Success__Group__0__Impl"
    // InternalDsl.g:551:1: rule__Success__Group__0__Impl : ( 'Success' ) ;
    public final void rule__Success__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:555:1: ( ( 'Success' ) )
            // InternalDsl.g:556:1: ( 'Success' )
            {
            // InternalDsl.g:556:1: ( 'Success' )
            // InternalDsl.g:557:2: 'Success'
            {
             before(grammarAccess.getSuccessAccess().getSuccessKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSuccessAccess().getSuccessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Success__Group__0__Impl"


    // $ANTLR start "rule__Success__Group__1"
    // InternalDsl.g:566:1: rule__Success__Group__1 : rule__Success__Group__1__Impl rule__Success__Group__2 ;
    public final void rule__Success__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:570:1: ( rule__Success__Group__1__Impl rule__Success__Group__2 )
            // InternalDsl.g:571:2: rule__Success__Group__1__Impl rule__Success__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Success__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Success__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Success__Group__1"


    // $ANTLR start "rule__Success__Group__1__Impl"
    // InternalDsl.g:578:1: rule__Success__Group__1__Impl : ( ( rule__Success__Group_1__0 )? ) ;
    public final void rule__Success__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:582:1: ( ( ( rule__Success__Group_1__0 )? ) )
            // InternalDsl.g:583:1: ( ( rule__Success__Group_1__0 )? )
            {
            // InternalDsl.g:583:1: ( ( rule__Success__Group_1__0 )? )
            // InternalDsl.g:584:2: ( rule__Success__Group_1__0 )?
            {
             before(grammarAccess.getSuccessAccess().getGroup_1()); 
            // InternalDsl.g:585:2: ( rule__Success__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:585:3: rule__Success__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Success__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSuccessAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Success__Group__1__Impl"


    // $ANTLR start "rule__Success__Group__2"
    // InternalDsl.g:593:1: rule__Success__Group__2 : rule__Success__Group__2__Impl ;
    public final void rule__Success__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:597:1: ( rule__Success__Group__2__Impl )
            // InternalDsl.g:598:2: rule__Success__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Success__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Success__Group__2"


    // $ANTLR start "rule__Success__Group__2__Impl"
    // InternalDsl.g:604:1: rule__Success__Group__2__Impl : ( ( rule__Success__NameAssignment_2 ) ) ;
    public final void rule__Success__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:608:1: ( ( ( rule__Success__NameAssignment_2 ) ) )
            // InternalDsl.g:609:1: ( ( rule__Success__NameAssignment_2 ) )
            {
            // InternalDsl.g:609:1: ( ( rule__Success__NameAssignment_2 ) )
            // InternalDsl.g:610:2: ( rule__Success__NameAssignment_2 )
            {
             before(grammarAccess.getSuccessAccess().getNameAssignment_2()); 
            // InternalDsl.g:611:2: ( rule__Success__NameAssignment_2 )
            // InternalDsl.g:611:3: rule__Success__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Success__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSuccessAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Success__Group__2__Impl"


    // $ANTLR start "rule__Success__Group_1__0"
    // InternalDsl.g:620:1: rule__Success__Group_1__0 : rule__Success__Group_1__0__Impl rule__Success__Group_1__1 ;
    public final void rule__Success__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:624:1: ( rule__Success__Group_1__0__Impl rule__Success__Group_1__1 )
            // InternalDsl.g:625:2: rule__Success__Group_1__0__Impl rule__Success__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Success__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Success__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Success__Group_1__0"


    // $ANTLR start "rule__Success__Group_1__0__Impl"
    // InternalDsl.g:632:1: rule__Success__Group_1__0__Impl : ( ( rule__Success__ArrayAssignment_1_0 ) ) ;
    public final void rule__Success__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:636:1: ( ( ( rule__Success__ArrayAssignment_1_0 ) ) )
            // InternalDsl.g:637:1: ( ( rule__Success__ArrayAssignment_1_0 ) )
            {
            // InternalDsl.g:637:1: ( ( rule__Success__ArrayAssignment_1_0 ) )
            // InternalDsl.g:638:2: ( rule__Success__ArrayAssignment_1_0 )
            {
             before(grammarAccess.getSuccessAccess().getArrayAssignment_1_0()); 
            // InternalDsl.g:639:2: ( rule__Success__ArrayAssignment_1_0 )
            // InternalDsl.g:639:3: rule__Success__ArrayAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Success__ArrayAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSuccessAccess().getArrayAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Success__Group_1__0__Impl"


    // $ANTLR start "rule__Success__Group_1__1"
    // InternalDsl.g:647:1: rule__Success__Group_1__1 : rule__Success__Group_1__1__Impl rule__Success__Group_1__2 ;
    public final void rule__Success__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:651:1: ( rule__Success__Group_1__1__Impl rule__Success__Group_1__2 )
            // InternalDsl.g:652:2: rule__Success__Group_1__1__Impl rule__Success__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Success__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Success__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Success__Group_1__1"


    // $ANTLR start "rule__Success__Group_1__1__Impl"
    // InternalDsl.g:659:1: rule__Success__Group_1__1__Impl : ( ( rule__Success__LengthAssignment_1_1 )? ) ;
    public final void rule__Success__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:663:1: ( ( ( rule__Success__LengthAssignment_1_1 )? ) )
            // InternalDsl.g:664:1: ( ( rule__Success__LengthAssignment_1_1 )? )
            {
            // InternalDsl.g:664:1: ( ( rule__Success__LengthAssignment_1_1 )? )
            // InternalDsl.g:665:2: ( rule__Success__LengthAssignment_1_1 )?
            {
             before(grammarAccess.getSuccessAccess().getLengthAssignment_1_1()); 
            // InternalDsl.g:666:2: ( rule__Success__LengthAssignment_1_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:666:3: rule__Success__LengthAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Success__LengthAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSuccessAccess().getLengthAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Success__Group_1__1__Impl"


    // $ANTLR start "rule__Success__Group_1__2"
    // InternalDsl.g:674:1: rule__Success__Group_1__2 : rule__Success__Group_1__2__Impl ;
    public final void rule__Success__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:678:1: ( rule__Success__Group_1__2__Impl )
            // InternalDsl.g:679:2: rule__Success__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Success__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Success__Group_1__2"


    // $ANTLR start "rule__Success__Group_1__2__Impl"
    // InternalDsl.g:685:1: rule__Success__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Success__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:689:1: ( ( ']' ) )
            // InternalDsl.g:690:1: ( ']' )
            {
            // InternalDsl.g:690:1: ( ']' )
            // InternalDsl.g:691:2: ']'
            {
             before(grammarAccess.getSuccessAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSuccessAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Success__Group_1__2__Impl"


    // $ANTLR start "rule__Failure__Group__0"
    // InternalDsl.g:701:1: rule__Failure__Group__0 : rule__Failure__Group__0__Impl rule__Failure__Group__1 ;
    public final void rule__Failure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:705:1: ( rule__Failure__Group__0__Impl rule__Failure__Group__1 )
            // InternalDsl.g:706:2: rule__Failure__Group__0__Impl rule__Failure__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Failure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Failure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Failure__Group__0"


    // $ANTLR start "rule__Failure__Group__0__Impl"
    // InternalDsl.g:713:1: rule__Failure__Group__0__Impl : ( 'Failure' ) ;
    public final void rule__Failure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:717:1: ( ( 'Failure' ) )
            // InternalDsl.g:718:1: ( 'Failure' )
            {
            // InternalDsl.g:718:1: ( 'Failure' )
            // InternalDsl.g:719:2: 'Failure'
            {
             before(grammarAccess.getFailureAccess().getFailureKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFailureAccess().getFailureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Failure__Group__0__Impl"


    // $ANTLR start "rule__Failure__Group__1"
    // InternalDsl.g:728:1: rule__Failure__Group__1 : rule__Failure__Group__1__Impl rule__Failure__Group__2 ;
    public final void rule__Failure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:732:1: ( rule__Failure__Group__1__Impl rule__Failure__Group__2 )
            // InternalDsl.g:733:2: rule__Failure__Group__1__Impl rule__Failure__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Failure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Failure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Failure__Group__1"


    // $ANTLR start "rule__Failure__Group__1__Impl"
    // InternalDsl.g:740:1: rule__Failure__Group__1__Impl : ( ( rule__Failure__Group_1__0 )? ) ;
    public final void rule__Failure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:744:1: ( ( ( rule__Failure__Group_1__0 )? ) )
            // InternalDsl.g:745:1: ( ( rule__Failure__Group_1__0 )? )
            {
            // InternalDsl.g:745:1: ( ( rule__Failure__Group_1__0 )? )
            // InternalDsl.g:746:2: ( rule__Failure__Group_1__0 )?
            {
             before(grammarAccess.getFailureAccess().getGroup_1()); 
            // InternalDsl.g:747:2: ( rule__Failure__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:747:3: rule__Failure__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Failure__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFailureAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Failure__Group__1__Impl"


    // $ANTLR start "rule__Failure__Group__2"
    // InternalDsl.g:755:1: rule__Failure__Group__2 : rule__Failure__Group__2__Impl ;
    public final void rule__Failure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:759:1: ( rule__Failure__Group__2__Impl )
            // InternalDsl.g:760:2: rule__Failure__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Failure__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Failure__Group__2"


    // $ANTLR start "rule__Failure__Group__2__Impl"
    // InternalDsl.g:766:1: rule__Failure__Group__2__Impl : ( ( rule__Failure__NameAssignment_2 ) ) ;
    public final void rule__Failure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:770:1: ( ( ( rule__Failure__NameAssignment_2 ) ) )
            // InternalDsl.g:771:1: ( ( rule__Failure__NameAssignment_2 ) )
            {
            // InternalDsl.g:771:1: ( ( rule__Failure__NameAssignment_2 ) )
            // InternalDsl.g:772:2: ( rule__Failure__NameAssignment_2 )
            {
             before(grammarAccess.getFailureAccess().getNameAssignment_2()); 
            // InternalDsl.g:773:2: ( rule__Failure__NameAssignment_2 )
            // InternalDsl.g:773:3: rule__Failure__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Failure__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFailureAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Failure__Group__2__Impl"


    // $ANTLR start "rule__Failure__Group_1__0"
    // InternalDsl.g:782:1: rule__Failure__Group_1__0 : rule__Failure__Group_1__0__Impl rule__Failure__Group_1__1 ;
    public final void rule__Failure__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:786:1: ( rule__Failure__Group_1__0__Impl rule__Failure__Group_1__1 )
            // InternalDsl.g:787:2: rule__Failure__Group_1__0__Impl rule__Failure__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Failure__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Failure__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Failure__Group_1__0"


    // $ANTLR start "rule__Failure__Group_1__0__Impl"
    // InternalDsl.g:794:1: rule__Failure__Group_1__0__Impl : ( ( rule__Failure__ArrayAssignment_1_0 ) ) ;
    public final void rule__Failure__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:798:1: ( ( ( rule__Failure__ArrayAssignment_1_0 ) ) )
            // InternalDsl.g:799:1: ( ( rule__Failure__ArrayAssignment_1_0 ) )
            {
            // InternalDsl.g:799:1: ( ( rule__Failure__ArrayAssignment_1_0 ) )
            // InternalDsl.g:800:2: ( rule__Failure__ArrayAssignment_1_0 )
            {
             before(grammarAccess.getFailureAccess().getArrayAssignment_1_0()); 
            // InternalDsl.g:801:2: ( rule__Failure__ArrayAssignment_1_0 )
            // InternalDsl.g:801:3: rule__Failure__ArrayAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Failure__ArrayAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFailureAccess().getArrayAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Failure__Group_1__0__Impl"


    // $ANTLR start "rule__Failure__Group_1__1"
    // InternalDsl.g:809:1: rule__Failure__Group_1__1 : rule__Failure__Group_1__1__Impl rule__Failure__Group_1__2 ;
    public final void rule__Failure__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:813:1: ( rule__Failure__Group_1__1__Impl rule__Failure__Group_1__2 )
            // InternalDsl.g:814:2: rule__Failure__Group_1__1__Impl rule__Failure__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Failure__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Failure__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Failure__Group_1__1"


    // $ANTLR start "rule__Failure__Group_1__1__Impl"
    // InternalDsl.g:821:1: rule__Failure__Group_1__1__Impl : ( ( rule__Failure__LengthAssignment_1_1 )? ) ;
    public final void rule__Failure__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:825:1: ( ( ( rule__Failure__LengthAssignment_1_1 )? ) )
            // InternalDsl.g:826:1: ( ( rule__Failure__LengthAssignment_1_1 )? )
            {
            // InternalDsl.g:826:1: ( ( rule__Failure__LengthAssignment_1_1 )? )
            // InternalDsl.g:827:2: ( rule__Failure__LengthAssignment_1_1 )?
            {
             before(grammarAccess.getFailureAccess().getLengthAssignment_1_1()); 
            // InternalDsl.g:828:2: ( rule__Failure__LengthAssignment_1_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:828:3: rule__Failure__LengthAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Failure__LengthAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFailureAccess().getLengthAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Failure__Group_1__1__Impl"


    // $ANTLR start "rule__Failure__Group_1__2"
    // InternalDsl.g:836:1: rule__Failure__Group_1__2 : rule__Failure__Group_1__2__Impl ;
    public final void rule__Failure__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:840:1: ( rule__Failure__Group_1__2__Impl )
            // InternalDsl.g:841:2: rule__Failure__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Failure__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Failure__Group_1__2"


    // $ANTLR start "rule__Failure__Group_1__2__Impl"
    // InternalDsl.g:847:1: rule__Failure__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Failure__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:851:1: ( ( ']' ) )
            // InternalDsl.g:852:1: ( ']' )
            {
            // InternalDsl.g:852:1: ( ']' )
            // InternalDsl.g:853:2: ']'
            {
             before(grammarAccess.getFailureAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFailureAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Failure__Group_1__2__Impl"


    // $ANTLR start "rule__TestQuantity__Group__0"
    // InternalDsl.g:863:1: rule__TestQuantity__Group__0 : rule__TestQuantity__Group__0__Impl rule__TestQuantity__Group__1 ;
    public final void rule__TestQuantity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:867:1: ( rule__TestQuantity__Group__0__Impl rule__TestQuantity__Group__1 )
            // InternalDsl.g:868:2: rule__TestQuantity__Group__0__Impl rule__TestQuantity__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__TestQuantity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestQuantity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestQuantity__Group__0"


    // $ANTLR start "rule__TestQuantity__Group__0__Impl"
    // InternalDsl.g:875:1: rule__TestQuantity__Group__0__Impl : ( 'Part' ) ;
    public final void rule__TestQuantity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:879:1: ( ( 'Part' ) )
            // InternalDsl.g:880:1: ( 'Part' )
            {
            // InternalDsl.g:880:1: ( 'Part' )
            // InternalDsl.g:881:2: 'Part'
            {
             before(grammarAccess.getTestQuantityAccess().getPartKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTestQuantityAccess().getPartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestQuantity__Group__0__Impl"


    // $ANTLR start "rule__TestQuantity__Group__1"
    // InternalDsl.g:890:1: rule__TestQuantity__Group__1 : rule__TestQuantity__Group__1__Impl ;
    public final void rule__TestQuantity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:894:1: ( rule__TestQuantity__Group__1__Impl )
            // InternalDsl.g:895:2: rule__TestQuantity__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TestQuantity__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestQuantity__Group__1"


    // $ANTLR start "rule__TestQuantity__Group__1__Impl"
    // InternalDsl.g:901:1: rule__TestQuantity__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__TestQuantity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:905:1: ( ( RULE_INT ) )
            // InternalDsl.g:906:1: ( RULE_INT )
            {
            // InternalDsl.g:906:1: ( RULE_INT )
            // InternalDsl.g:907:2: RULE_INT
            {
             before(grammarAccess.getTestQuantityAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTestQuantityAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestQuantity__Group__1__Impl"


    // $ANTLR start "rule__Scope__Group__0"
    // InternalDsl.g:917:1: rule__Scope__Group__0 : rule__Scope__Group__0__Impl rule__Scope__Group__1 ;
    public final void rule__Scope__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:921:1: ( rule__Scope__Group__0__Impl rule__Scope__Group__1 )
            // InternalDsl.g:922:2: rule__Scope__Group__0__Impl rule__Scope__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Scope__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group__0"


    // $ANTLR start "rule__Scope__Group__0__Impl"
    // InternalDsl.g:929:1: rule__Scope__Group__0__Impl : ( ( rule__Scope__ProjectAssignment_0 ) ) ;
    public final void rule__Scope__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:933:1: ( ( ( rule__Scope__ProjectAssignment_0 ) ) )
            // InternalDsl.g:934:1: ( ( rule__Scope__ProjectAssignment_0 ) )
            {
            // InternalDsl.g:934:1: ( ( rule__Scope__ProjectAssignment_0 ) )
            // InternalDsl.g:935:2: ( rule__Scope__ProjectAssignment_0 )
            {
             before(grammarAccess.getScopeAccess().getProjectAssignment_0()); 
            // InternalDsl.g:936:2: ( rule__Scope__ProjectAssignment_0 )
            // InternalDsl.g:936:3: rule__Scope__ProjectAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Scope__ProjectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getProjectAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group__0__Impl"


    // $ANTLR start "rule__Scope__Group__1"
    // InternalDsl.g:944:1: rule__Scope__Group__1 : rule__Scope__Group__1__Impl rule__Scope__Group__2 ;
    public final void rule__Scope__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:948:1: ( rule__Scope__Group__1__Impl rule__Scope__Group__2 )
            // InternalDsl.g:949:2: rule__Scope__Group__1__Impl rule__Scope__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Scope__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group__1"


    // $ANTLR start "rule__Scope__Group__1__Impl"
    // InternalDsl.g:956:1: rule__Scope__Group__1__Impl : ( 'Simulation' ) ;
    public final void rule__Scope__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:960:1: ( ( 'Simulation' ) )
            // InternalDsl.g:961:1: ( 'Simulation' )
            {
            // InternalDsl.g:961:1: ( 'Simulation' )
            // InternalDsl.g:962:2: 'Simulation'
            {
             before(grammarAccess.getScopeAccess().getSimulationKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getScopeAccess().getSimulationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group__1__Impl"


    // $ANTLR start "rule__Scope__Group__2"
    // InternalDsl.g:971:1: rule__Scope__Group__2 : rule__Scope__Group__2__Impl rule__Scope__Group__3 ;
    public final void rule__Scope__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:975:1: ( rule__Scope__Group__2__Impl rule__Scope__Group__3 )
            // InternalDsl.g:976:2: rule__Scope__Group__2__Impl rule__Scope__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Scope__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group__2"


    // $ANTLR start "rule__Scope__Group__2__Impl"
    // InternalDsl.g:983:1: rule__Scope__Group__2__Impl : ( ( rule__Scope__NameAssignment_2 ) ) ;
    public final void rule__Scope__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:987:1: ( ( ( rule__Scope__NameAssignment_2 ) ) )
            // InternalDsl.g:988:1: ( ( rule__Scope__NameAssignment_2 ) )
            {
            // InternalDsl.g:988:1: ( ( rule__Scope__NameAssignment_2 ) )
            // InternalDsl.g:989:2: ( rule__Scope__NameAssignment_2 )
            {
             before(grammarAccess.getScopeAccess().getNameAssignment_2()); 
            // InternalDsl.g:990:2: ( rule__Scope__NameAssignment_2 )
            // InternalDsl.g:990:3: rule__Scope__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Scope__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group__2__Impl"


    // $ANTLR start "rule__Scope__Group__3"
    // InternalDsl.g:998:1: rule__Scope__Group__3 : rule__Scope__Group__3__Impl rule__Scope__Group__4 ;
    public final void rule__Scope__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1002:1: ( rule__Scope__Group__3__Impl rule__Scope__Group__4 )
            // InternalDsl.g:1003:2: rule__Scope__Group__3__Impl rule__Scope__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Scope__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group__3"


    // $ANTLR start "rule__Scope__Group__3__Impl"
    // InternalDsl.g:1010:1: rule__Scope__Group__3__Impl : ( ( rule__Scope__LengthAssignment_3 )? ) ;
    public final void rule__Scope__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1014:1: ( ( ( rule__Scope__LengthAssignment_3 )? ) )
            // InternalDsl.g:1015:1: ( ( rule__Scope__LengthAssignment_3 )? )
            {
            // InternalDsl.g:1015:1: ( ( rule__Scope__LengthAssignment_3 )? )
            // InternalDsl.g:1016:2: ( rule__Scope__LengthAssignment_3 )?
            {
             before(grammarAccess.getScopeAccess().getLengthAssignment_3()); 
            // InternalDsl.g:1017:2: ( rule__Scope__LengthAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:1017:3: rule__Scope__LengthAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scope__LengthAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScopeAccess().getLengthAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group__3__Impl"


    // $ANTLR start "rule__Scope__Group__4"
    // InternalDsl.g:1025:1: rule__Scope__Group__4 : rule__Scope__Group__4__Impl ;
    public final void rule__Scope__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1029:1: ( rule__Scope__Group__4__Impl )
            // InternalDsl.g:1030:2: rule__Scope__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group__4"


    // $ANTLR start "rule__Scope__Group__4__Impl"
    // InternalDsl.g:1036:1: rule__Scope__Group__4__Impl : ( ( rule__Scope__Group_4__0 )* ) ;
    public final void rule__Scope__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1040:1: ( ( ( rule__Scope__Group_4__0 )* ) )
            // InternalDsl.g:1041:1: ( ( rule__Scope__Group_4__0 )* )
            {
            // InternalDsl.g:1041:1: ( ( rule__Scope__Group_4__0 )* )
            // InternalDsl.g:1042:2: ( rule__Scope__Group_4__0 )*
            {
             before(grammarAccess.getScopeAccess().getGroup_4()); 
            // InternalDsl.g:1043:2: ( rule__Scope__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14||(LA10_0>=16 && LA10_0<=17)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:1043:3: rule__Scope__Group_4__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Scope__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getScopeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group__4__Impl"


    // $ANTLR start "rule__Scope__Group_4__0"
    // InternalDsl.g:1052:1: rule__Scope__Group_4__0 : rule__Scope__Group_4__0__Impl rule__Scope__Group_4__1 ;
    public final void rule__Scope__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1056:1: ( rule__Scope__Group_4__0__Impl rule__Scope__Group_4__1 )
            // InternalDsl.g:1057:2: rule__Scope__Group_4__0__Impl rule__Scope__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Scope__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_4__0"


    // $ANTLR start "rule__Scope__Group_4__0__Impl"
    // InternalDsl.g:1064:1: rule__Scope__Group_4__0__Impl : ( ( rule__Scope__TestquantityAssignment_4_0 )? ) ;
    public final void rule__Scope__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1068:1: ( ( ( rule__Scope__TestquantityAssignment_4_0 )? ) )
            // InternalDsl.g:1069:1: ( ( rule__Scope__TestquantityAssignment_4_0 )? )
            {
            // InternalDsl.g:1069:1: ( ( rule__Scope__TestquantityAssignment_4_0 )? )
            // InternalDsl.g:1070:2: ( rule__Scope__TestquantityAssignment_4_0 )?
            {
             before(grammarAccess.getScopeAccess().getTestquantityAssignment_4_0()); 
            // InternalDsl.g:1071:2: ( rule__Scope__TestquantityAssignment_4_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:1071:3: rule__Scope__TestquantityAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scope__TestquantityAssignment_4_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScopeAccess().getTestquantityAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_4__0__Impl"


    // $ANTLR start "rule__Scope__Group_4__1"
    // InternalDsl.g:1079:1: rule__Scope__Group_4__1 : rule__Scope__Group_4__1__Impl ;
    public final void rule__Scope__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1083:1: ( rule__Scope__Group_4__1__Impl )
            // InternalDsl.g:1084:2: rule__Scope__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_4__1"


    // $ANTLR start "rule__Scope__Group_4__1__Impl"
    // InternalDsl.g:1090:1: rule__Scope__Group_4__1__Impl : ( ( rule__Scope__CommandsAssignment_4_1 ) ) ;
    public final void rule__Scope__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1094:1: ( ( ( rule__Scope__CommandsAssignment_4_1 ) ) )
            // InternalDsl.g:1095:1: ( ( rule__Scope__CommandsAssignment_4_1 ) )
            {
            // InternalDsl.g:1095:1: ( ( rule__Scope__CommandsAssignment_4_1 ) )
            // InternalDsl.g:1096:2: ( rule__Scope__CommandsAssignment_4_1 )
            {
             before(grammarAccess.getScopeAccess().getCommandsAssignment_4_1()); 
            // InternalDsl.g:1097:2: ( rule__Scope__CommandsAssignment_4_1 )
            // InternalDsl.g:1097:3: rule__Scope__CommandsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Scope__CommandsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getCommandsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_4__1__Impl"


    // $ANTLR start "rule__Model__DslAssignment"
    // InternalDsl.g:1106:1: rule__Model__DslAssignment : ( ruleScope ) ;
    public final void rule__Model__DslAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1110:1: ( ( ruleScope ) )
            // InternalDsl.g:1111:2: ( ruleScope )
            {
            // InternalDsl.g:1111:2: ( ruleScope )
            // InternalDsl.g:1112:3: ruleScope
            {
             before(grammarAccess.getModelAccess().getDslScopeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleScope();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDslScopeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DslAssignment"


    // $ANTLR start "rule__Project__ImportedNamespaceAssignment_1"
    // InternalDsl.g:1121:1: rule__Project__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Project__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1125:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalDsl.g:1126:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalDsl.g:1126:2: ( ruleQualifiedNameWithWildcard )
            // InternalDsl.g:1127:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getProjectAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Success__ArrayAssignment_1_0"
    // InternalDsl.g:1136:1: rule__Success__ArrayAssignment_1_0 : ( ( '[' ) ) ;
    public final void rule__Success__ArrayAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1140:1: ( ( ( '[' ) ) )
            // InternalDsl.g:1141:2: ( ( '[' ) )
            {
            // InternalDsl.g:1141:2: ( ( '[' ) )
            // InternalDsl.g:1142:3: ( '[' )
            {
             before(grammarAccess.getSuccessAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            // InternalDsl.g:1143:3: ( '[' )
            // InternalDsl.g:1144:4: '['
            {
             before(grammarAccess.getSuccessAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSuccessAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }

             after(grammarAccess.getSuccessAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Success__ArrayAssignment_1_0"


    // $ANTLR start "rule__Success__LengthAssignment_1_1"
    // InternalDsl.g:1155:1: rule__Success__LengthAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Success__LengthAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1159:1: ( ( RULE_INT ) )
            // InternalDsl.g:1160:2: ( RULE_INT )
            {
            // InternalDsl.g:1160:2: ( RULE_INT )
            // InternalDsl.g:1161:3: RULE_INT
            {
             before(grammarAccess.getSuccessAccess().getLengthINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSuccessAccess().getLengthINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Success__LengthAssignment_1_1"


    // $ANTLR start "rule__Success__NameAssignment_2"
    // InternalDsl.g:1170:1: rule__Success__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Success__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1174:1: ( ( RULE_STRING ) )
            // InternalDsl.g:1175:2: ( RULE_STRING )
            {
            // InternalDsl.g:1175:2: ( RULE_STRING )
            // InternalDsl.g:1176:3: RULE_STRING
            {
             before(grammarAccess.getSuccessAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSuccessAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Success__NameAssignment_2"


    // $ANTLR start "rule__Failure__ArrayAssignment_1_0"
    // InternalDsl.g:1185:1: rule__Failure__ArrayAssignment_1_0 : ( ( '[' ) ) ;
    public final void rule__Failure__ArrayAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1189:1: ( ( ( '[' ) ) )
            // InternalDsl.g:1190:2: ( ( '[' ) )
            {
            // InternalDsl.g:1190:2: ( ( '[' ) )
            // InternalDsl.g:1191:3: ( '[' )
            {
             before(grammarAccess.getFailureAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            // InternalDsl.g:1192:3: ( '[' )
            // InternalDsl.g:1193:4: '['
            {
             before(grammarAccess.getFailureAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFailureAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }

             after(grammarAccess.getFailureAccess().getArrayLeftSquareBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Failure__ArrayAssignment_1_0"


    // $ANTLR start "rule__Failure__LengthAssignment_1_1"
    // InternalDsl.g:1204:1: rule__Failure__LengthAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Failure__LengthAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1208:1: ( ( RULE_INT ) )
            // InternalDsl.g:1209:2: ( RULE_INT )
            {
            // InternalDsl.g:1209:2: ( RULE_INT )
            // InternalDsl.g:1210:3: RULE_INT
            {
             before(grammarAccess.getFailureAccess().getLengthINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFailureAccess().getLengthINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Failure__LengthAssignment_1_1"


    // $ANTLR start "rule__Failure__NameAssignment_2"
    // InternalDsl.g:1219:1: rule__Failure__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Failure__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1223:1: ( ( RULE_STRING ) )
            // InternalDsl.g:1224:2: ( RULE_STRING )
            {
            // InternalDsl.g:1224:2: ( RULE_STRING )
            // InternalDsl.g:1225:3: RULE_STRING
            {
             before(grammarAccess.getFailureAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFailureAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Failure__NameAssignment_2"


    // $ANTLR start "rule__Scope__ProjectAssignment_0"
    // InternalDsl.g:1234:1: rule__Scope__ProjectAssignment_0 : ( ruleProject ) ;
    public final void rule__Scope__ProjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1238:1: ( ( ruleProject ) )
            // InternalDsl.g:1239:2: ( ruleProject )
            {
            // InternalDsl.g:1239:2: ( ruleProject )
            // InternalDsl.g:1240:3: ruleProject
            {
             before(grammarAccess.getScopeAccess().getProjectProjectParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getScopeAccess().getProjectProjectParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__ProjectAssignment_0"


    // $ANTLR start "rule__Scope__NameAssignment_2"
    // InternalDsl.g:1249:1: rule__Scope__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Scope__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1253:1: ( ( RULE_ID ) )
            // InternalDsl.g:1254:2: ( RULE_ID )
            {
            // InternalDsl.g:1254:2: ( RULE_ID )
            // InternalDsl.g:1255:3: RULE_ID
            {
             before(grammarAccess.getScopeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getScopeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__NameAssignment_2"


    // $ANTLR start "rule__Scope__LengthAssignment_3"
    // InternalDsl.g:1264:1: rule__Scope__LengthAssignment_3 : ( RULE_INT ) ;
    public final void rule__Scope__LengthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1268:1: ( ( RULE_INT ) )
            // InternalDsl.g:1269:2: ( RULE_INT )
            {
            // InternalDsl.g:1269:2: ( RULE_INT )
            // InternalDsl.g:1270:3: RULE_INT
            {
             before(grammarAccess.getScopeAccess().getLengthINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getScopeAccess().getLengthINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__LengthAssignment_3"


    // $ANTLR start "rule__Scope__TestquantityAssignment_4_0"
    // InternalDsl.g:1279:1: rule__Scope__TestquantityAssignment_4_0 : ( ruleTestQuantity ) ;
    public final void rule__Scope__TestquantityAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1283:1: ( ( ruleTestQuantity ) )
            // InternalDsl.g:1284:2: ( ruleTestQuantity )
            {
            // InternalDsl.g:1284:2: ( ruleTestQuantity )
            // InternalDsl.g:1285:3: ruleTestQuantity
            {
             before(grammarAccess.getScopeAccess().getTestquantityTestQuantityParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTestQuantity();

            state._fsp--;

             after(grammarAccess.getScopeAccess().getTestquantityTestQuantityParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__TestquantityAssignment_4_0"


    // $ANTLR start "rule__Scope__CommandsAssignment_4_1"
    // InternalDsl.g:1294:1: rule__Scope__CommandsAssignment_4_1 : ( ruleCommands ) ;
    public final void rule__Scope__CommandsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1298:1: ( ( ruleCommands ) )
            // InternalDsl.g:1299:2: ( ruleCommands )
            {
            // InternalDsl.g:1299:2: ( ruleCommands )
            // InternalDsl.g:1300:3: ruleCommands
            {
             before(grammarAccess.getScopeAccess().getCommandsCommandsParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommands();

            state._fsp--;

             after(grammarAccess.getScopeAccess().getCommandsCommandsParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__CommandsAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000034020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000034002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000034000L});

}