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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'.'", "'.*'", "'Success'", "'['", "']'", "'Failure'", "'Log'", "'Simulation'", "'Part'"
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
    public static final int T__20=20;

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




    // $ANTLR start "entryRuleModel"
    // InternalDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_dsl_0_0= ruleScope ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_dsl_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( (lv_dsl_0_0= ruleScope ) )* )
            // InternalDsl.g:78:2: ( (lv_dsl_0_0= ruleScope ) )*
            {
            // InternalDsl.g:78:2: ( (lv_dsl_0_0= ruleScope ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:79:3: (lv_dsl_0_0= ruleScope )
            	    {
            	    // InternalDsl.g:79:3: (lv_dsl_0_0= ruleScope )
            	    // InternalDsl.g:80:4: lv_dsl_0_0= ruleScope
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getDslScopeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_dsl_0_0=ruleScope();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"dsl",
            	    					lv_dsl_0_0,
            	    					"zanshin.dsl.Dsl.Scope");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProject"
    // InternalDsl.g:100:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalDsl.g:100:48: (iv_ruleProject= ruleProject EOF )
            // InternalDsl.g:101:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalDsl.g:107:1: ruleProject returns [EObject current=null] : (otherlv_0= 'project' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:113:2: ( (otherlv_0= 'project' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalDsl.g:114:2: (otherlv_0= 'project' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalDsl.g:114:2: (otherlv_0= 'project' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalDsl.g:115:3: otherlv_0= 'project' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
            		
            // InternalDsl.g:119:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalDsl.g:120:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalDsl.g:120:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalDsl.g:121:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"zanshin.dsl.Dsl.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDsl.g:142:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDsl.g:142:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDsl.g:143:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDsl.g:149:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING (kw= '.' this_STRING_2= RULE_STRING )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalDsl.g:155:2: ( (this_STRING_0= RULE_STRING (kw= '.' this_STRING_2= RULE_STRING )* ) )
            // InternalDsl.g:156:2: (this_STRING_0= RULE_STRING (kw= '.' this_STRING_2= RULE_STRING )* )
            {
            // InternalDsl.g:156:2: (this_STRING_0= RULE_STRING (kw= '.' this_STRING_2= RULE_STRING )* )
            // InternalDsl.g:157:3: this_STRING_0= RULE_STRING (kw= '.' this_STRING_2= RULE_STRING )*
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            			current.merge(this_STRING_0);
            		

            			newLeafNode(this_STRING_0, grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_0());
            		
            // InternalDsl.g:164:3: (kw= '.' this_STRING_2= RULE_STRING )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:165:4: kw= '.' this_STRING_2= RULE_STRING
            	    {
            	    kw=(Token)match(input,12,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_5); 

            	    				current.merge(this_STRING_2);
            	    			

            	    				newLeafNode(this_STRING_2, grammarAccess.getQualifiedNameAccess().getSTRINGTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalDsl.g:182:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalDsl.g:182:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalDsl.g:183:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalDsl.g:189:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:195:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalDsl.g:196:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalDsl.g:196:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalDsl.g:197:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:207:3: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:208:4: kw= '.*'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleTestType"
    // InternalDsl.g:218:1: entryRuleTestType returns [EObject current=null] : iv_ruleTestType= ruleTestType EOF ;
    public final EObject entryRuleTestType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestType = null;


        try {
            // InternalDsl.g:218:49: (iv_ruleTestType= ruleTestType EOF )
            // InternalDsl.g:219:2: iv_ruleTestType= ruleTestType EOF
            {
             newCompositeNode(grammarAccess.getTestTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestType=ruleTestType();

            state._fsp--;

             current =iv_ruleTestType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestType"


    // $ANTLR start "ruleTestType"
    // InternalDsl.g:225:1: ruleTestType returns [EObject current=null] : (this_Success_0= ruleSuccess | this_Failure_1= ruleFailure ) ;
    public final EObject ruleTestType() throws RecognitionException {
        EObject current = null;

        EObject this_Success_0 = null;

        EObject this_Failure_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:231:2: ( (this_Success_0= ruleSuccess | this_Failure_1= ruleFailure ) )
            // InternalDsl.g:232:2: (this_Success_0= ruleSuccess | this_Failure_1= ruleFailure )
            {
            // InternalDsl.g:232:2: (this_Success_0= ruleSuccess | this_Failure_1= ruleFailure )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:233:3: this_Success_0= ruleSuccess
                    {

                    			newCompositeNode(grammarAccess.getTestTypeAccess().getSuccessParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Success_0=ruleSuccess();

                    state._fsp--;


                    			current = this_Success_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:242:3: this_Failure_1= ruleFailure
                    {

                    			newCompositeNode(grammarAccess.getTestTypeAccess().getFailureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Failure_1=ruleFailure();

                    state._fsp--;


                    			current = this_Failure_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestType"


    // $ANTLR start "entryRuleSuccess"
    // InternalDsl.g:254:1: entryRuleSuccess returns [EObject current=null] : iv_ruleSuccess= ruleSuccess EOF ;
    public final EObject entryRuleSuccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuccess = null;


        try {
            // InternalDsl.g:254:48: (iv_ruleSuccess= ruleSuccess EOF )
            // InternalDsl.g:255:2: iv_ruleSuccess= ruleSuccess EOF
            {
             newCompositeNode(grammarAccess.getSuccessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuccess=ruleSuccess();

            state._fsp--;

             current =iv_ruleSuccess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuccess"


    // $ANTLR start "ruleSuccess"
    // InternalDsl.g:261:1: ruleSuccess returns [EObject current=null] : ( ( (lv_simulationType_0_0= 'Success' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleSuccess() throws RecognitionException {
        EObject current = null;

        Token lv_simulationType_0_0=null;
        Token lv_array_1_0=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalDsl.g:267:2: ( ( ( (lv_simulationType_0_0= 'Success' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) ) ) )
            // InternalDsl.g:268:2: ( ( (lv_simulationType_0_0= 'Success' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:268:2: ( ( (lv_simulationType_0_0= 'Success' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) ) )
            // InternalDsl.g:269:3: ( (lv_simulationType_0_0= 'Success' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) )
            {
            // InternalDsl.g:269:3: ( (lv_simulationType_0_0= 'Success' ) )
            // InternalDsl.g:270:4: (lv_simulationType_0_0= 'Success' )
            {
            // InternalDsl.g:270:4: (lv_simulationType_0_0= 'Success' )
            // InternalDsl.g:271:5: lv_simulationType_0_0= 'Success'
            {
            lv_simulationType_0_0=(Token)match(input,14,FOLLOW_7); 

            					newLeafNode(lv_simulationType_0_0, grammarAccess.getSuccessAccess().getSimulationTypeSuccessKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSuccessRule());
            					}
            					setWithLastConsumed(current, "simulationType", lv_simulationType_0_0, "Success");
            				

            }


            }

            // InternalDsl.g:283:3: ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:284:4: ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']'
                    {
                    // InternalDsl.g:284:4: ( (lv_array_1_0= '[' ) )
                    // InternalDsl.g:285:5: (lv_array_1_0= '[' )
                    {
                    // InternalDsl.g:285:5: (lv_array_1_0= '[' )
                    // InternalDsl.g:286:6: lv_array_1_0= '['
                    {
                    lv_array_1_0=(Token)match(input,15,FOLLOW_8); 

                    						newLeafNode(lv_array_1_0, grammarAccess.getSuccessAccess().getArrayLeftSquareBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSuccessRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    // InternalDsl.g:298:4: ( (lv_length_2_0= RULE_INT ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_INT) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalDsl.g:299:5: (lv_length_2_0= RULE_INT )
                            {
                            // InternalDsl.g:299:5: (lv_length_2_0= RULE_INT )
                            // InternalDsl.g:300:6: lv_length_2_0= RULE_INT
                            {
                            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

                            						newLeafNode(lv_length_2_0, grammarAccess.getSuccessAccess().getLengthINTTerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getSuccessRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"length",
                            							lv_length_2_0,
                            							"org.eclipse.xtext.common.Terminals.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSuccessAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalDsl.g:321:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalDsl.g:322:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalDsl.g:322:4: (lv_name_4_0= RULE_STRING )
            // InternalDsl.g:323:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getSuccessAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSuccessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuccess"


    // $ANTLR start "entryRuleFailure"
    // InternalDsl.g:343:1: entryRuleFailure returns [EObject current=null] : iv_ruleFailure= ruleFailure EOF ;
    public final EObject entryRuleFailure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFailure = null;


        try {
            // InternalDsl.g:343:48: (iv_ruleFailure= ruleFailure EOF )
            // InternalDsl.g:344:2: iv_ruleFailure= ruleFailure EOF
            {
             newCompositeNode(grammarAccess.getFailureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFailure=ruleFailure();

            state._fsp--;

             current =iv_ruleFailure; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFailure"


    // $ANTLR start "ruleFailure"
    // InternalDsl.g:350:1: ruleFailure returns [EObject current=null] : ( ( (lv_simulationType_0_0= 'Failure' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleFailure() throws RecognitionException {
        EObject current = null;

        Token lv_simulationType_0_0=null;
        Token lv_array_1_0=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalDsl.g:356:2: ( ( ( (lv_simulationType_0_0= 'Failure' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) ) ) )
            // InternalDsl.g:357:2: ( ( (lv_simulationType_0_0= 'Failure' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:357:2: ( ( (lv_simulationType_0_0= 'Failure' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) ) )
            // InternalDsl.g:358:3: ( (lv_simulationType_0_0= 'Failure' ) ) ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) )
            {
            // InternalDsl.g:358:3: ( (lv_simulationType_0_0= 'Failure' ) )
            // InternalDsl.g:359:4: (lv_simulationType_0_0= 'Failure' )
            {
            // InternalDsl.g:359:4: (lv_simulationType_0_0= 'Failure' )
            // InternalDsl.g:360:5: lv_simulationType_0_0= 'Failure'
            {
            lv_simulationType_0_0=(Token)match(input,17,FOLLOW_7); 

            					newLeafNode(lv_simulationType_0_0, grammarAccess.getFailureAccess().getSimulationTypeFailureKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFailureRule());
            					}
            					setWithLastConsumed(current, "simulationType", lv_simulationType_0_0, "Failure");
            				

            }


            }

            // InternalDsl.g:372:3: ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:373:4: ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']'
                    {
                    // InternalDsl.g:373:4: ( (lv_array_1_0= '[' ) )
                    // InternalDsl.g:374:5: (lv_array_1_0= '[' )
                    {
                    // InternalDsl.g:374:5: (lv_array_1_0= '[' )
                    // InternalDsl.g:375:6: lv_array_1_0= '['
                    {
                    lv_array_1_0=(Token)match(input,15,FOLLOW_8); 

                    						newLeafNode(lv_array_1_0, grammarAccess.getFailureAccess().getArrayLeftSquareBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFailureRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    // InternalDsl.g:387:4: ( (lv_length_2_0= RULE_INT ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_INT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalDsl.g:388:5: (lv_length_2_0= RULE_INT )
                            {
                            // InternalDsl.g:388:5: (lv_length_2_0= RULE_INT )
                            // InternalDsl.g:389:6: lv_length_2_0= RULE_INT
                            {
                            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_9); 

                            						newLeafNode(lv_length_2_0, grammarAccess.getFailureAccess().getLengthINTTerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFailureRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"length",
                            							lv_length_2_0,
                            							"org.eclipse.xtext.common.Terminals.INT");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getFailureAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalDsl.g:410:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalDsl.g:411:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalDsl.g:411:4: (lv_name_4_0= RULE_STRING )
            // InternalDsl.g:412:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getFailureAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFailureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFailure"


    // $ANTLR start "entryRuleLog"
    // InternalDsl.g:432:1: entryRuleLog returns [EObject current=null] : iv_ruleLog= ruleLog EOF ;
    public final EObject entryRuleLog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLog = null;


        try {
            // InternalDsl.g:432:44: (iv_ruleLog= ruleLog EOF )
            // InternalDsl.g:433:2: iv_ruleLog= ruleLog EOF
            {
             newCompositeNode(grammarAccess.getLogRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLog=ruleLog();

            state._fsp--;

             current =iv_ruleLog; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLog"


    // $ANTLR start "ruleLog"
    // InternalDsl.g:439:1: ruleLog returns [EObject current=null] : (otherlv_0= 'Log' ( (lv_message_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_message_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:445:2: ( (otherlv_0= 'Log' ( (lv_message_1_0= RULE_STRING ) ) ) )
            // InternalDsl.g:446:2: (otherlv_0= 'Log' ( (lv_message_1_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:446:2: (otherlv_0= 'Log' ( (lv_message_1_0= RULE_STRING ) ) )
            // InternalDsl.g:447:3: otherlv_0= 'Log' ( (lv_message_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLogAccess().getLogKeyword_0());
            		
            // InternalDsl.g:451:3: ( (lv_message_1_0= RULE_STRING ) )
            // InternalDsl.g:452:4: (lv_message_1_0= RULE_STRING )
            {
            // InternalDsl.g:452:4: (lv_message_1_0= RULE_STRING )
            // InternalDsl.g:453:5: lv_message_1_0= RULE_STRING
            {
            lv_message_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_message_1_0, grammarAccess.getLogAccess().getMessageSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogRule());
            					}
            					setWithLastConsumed(
            						current,
            						"message",
            						lv_message_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLog"


    // $ANTLR start "entryRuleScope"
    // InternalDsl.g:473:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalDsl.g:473:46: (iv_ruleScope= ruleScope EOF )
            // InternalDsl.g:474:2: iv_ruleScope= ruleScope EOF
            {
             newCompositeNode(grammarAccess.getScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScope=ruleScope();

            state._fsp--;

             current =iv_ruleScope; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalDsl.g:480:1: ruleScope returns [EObject current=null] : ( ( (lv_project_0_0= ruleProject ) ) ( ( ( (lv_simulation_1_0= 'Simulation' ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_length_3_0= RULE_INT ) )? )? ( (lv_commands_4_0= rulecommandBlock ) )+ )* ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token lv_simulation_1_0=null;
        Token lv_name_2_0=null;
        Token lv_length_3_0=null;
        EObject lv_project_0_0 = null;

        EObject lv_commands_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:486:2: ( ( ( (lv_project_0_0= ruleProject ) ) ( ( ( (lv_simulation_1_0= 'Simulation' ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_length_3_0= RULE_INT ) )? )? ( (lv_commands_4_0= rulecommandBlock ) )+ )* ) )
            // InternalDsl.g:487:2: ( ( (lv_project_0_0= ruleProject ) ) ( ( ( (lv_simulation_1_0= 'Simulation' ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_length_3_0= RULE_INT ) )? )? ( (lv_commands_4_0= rulecommandBlock ) )+ )* )
            {
            // InternalDsl.g:487:2: ( ( (lv_project_0_0= ruleProject ) ) ( ( ( (lv_simulation_1_0= 'Simulation' ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_length_3_0= RULE_INT ) )? )? ( (lv_commands_4_0= rulecommandBlock ) )+ )* )
            // InternalDsl.g:488:3: ( (lv_project_0_0= ruleProject ) ) ( ( ( (lv_simulation_1_0= 'Simulation' ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_length_3_0= RULE_INT ) )? )? ( (lv_commands_4_0= rulecommandBlock ) )+ )*
            {
            // InternalDsl.g:488:3: ( (lv_project_0_0= ruleProject ) )
            // InternalDsl.g:489:4: (lv_project_0_0= ruleProject )
            {
            // InternalDsl.g:489:4: (lv_project_0_0= ruleProject )
            // InternalDsl.g:490:5: lv_project_0_0= ruleProject
            {

            					newCompositeNode(grammarAccess.getScopeAccess().getProjectProjectParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_project_0_0=ruleProject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScopeRule());
            					}
            					set(
            						current,
            						"project",
            						lv_project_0_0,
            						"zanshin.dsl.Dsl.Project");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:507:3: ( ( ( (lv_simulation_1_0= 'Simulation' ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_length_3_0= RULE_INT ) )? )? ( (lv_commands_4_0= rulecommandBlock ) )+ )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14||(LA12_0>=17 && LA12_0<=20)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:508:4: ( ( (lv_simulation_1_0= 'Simulation' ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_length_3_0= RULE_INT ) )? )? ( (lv_commands_4_0= rulecommandBlock ) )+
            	    {
            	    // InternalDsl.g:508:4: ( ( (lv_simulation_1_0= 'Simulation' ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_length_3_0= RULE_INT ) )? )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==19) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalDsl.g:509:5: ( (lv_simulation_1_0= 'Simulation' ) ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_length_3_0= RULE_INT ) )?
            	            {
            	            // InternalDsl.g:509:5: ( (lv_simulation_1_0= 'Simulation' ) )
            	            // InternalDsl.g:510:6: (lv_simulation_1_0= 'Simulation' )
            	            {
            	            // InternalDsl.g:510:6: (lv_simulation_1_0= 'Simulation' )
            	            // InternalDsl.g:511:7: lv_simulation_1_0= 'Simulation'
            	            {
            	            lv_simulation_1_0=(Token)match(input,19,FOLLOW_11); 

            	            							newLeafNode(lv_simulation_1_0, grammarAccess.getScopeAccess().getSimulationSimulationKeyword_1_0_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getScopeRule());
            	            							}
            	            							addWithLastConsumed(current, "simulation", lv_simulation_1_0, "Simulation");
            	            						

            	            }


            	            }

            	            // InternalDsl.g:523:5: ( (lv_name_2_0= RULE_ID ) )
            	            // InternalDsl.g:524:6: (lv_name_2_0= RULE_ID )
            	            {
            	            // InternalDsl.g:524:6: (lv_name_2_0= RULE_ID )
            	            // InternalDsl.g:525:7: lv_name_2_0= RULE_ID
            	            {
            	            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            	            							newLeafNode(lv_name_2_0, grammarAccess.getScopeAccess().getNameIDTerminalRuleCall_1_0_1_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getScopeRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"name",
            	            								lv_name_2_0,
            	            								"org.eclipse.xtext.common.Terminals.ID");
            	            						

            	            }


            	            }

            	            // InternalDsl.g:541:5: ( (lv_length_3_0= RULE_INT ) )?
            	            int alt9=2;
            	            int LA9_0 = input.LA(1);

            	            if ( (LA9_0==RULE_INT) ) {
            	                alt9=1;
            	            }
            	            switch (alt9) {
            	                case 1 :
            	                    // InternalDsl.g:542:6: (lv_length_3_0= RULE_INT )
            	                    {
            	                    // InternalDsl.g:542:6: (lv_length_3_0= RULE_INT )
            	                    // InternalDsl.g:543:7: lv_length_3_0= RULE_INT
            	                    {
            	                    lv_length_3_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            	                    							newLeafNode(lv_length_3_0, grammarAccess.getScopeAccess().getLengthINTTerminalRuleCall_1_0_2_0());
            	                    						

            	                    							if (current==null) {
            	                    								current = createModelElement(grammarAccess.getScopeRule());
            	                    							}
            	                    							addWithLastConsumed(
            	                    								current,
            	                    								"length",
            	                    								lv_length_3_0,
            	                    								"org.eclipse.xtext.common.Terminals.INT");
            	                    						

            	                    }


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDsl.g:560:4: ( (lv_commands_4_0= rulecommandBlock ) )+
            	    int cnt11=0;
            	    loop11:
            	    do {
            	        int alt11=2;
            	        switch ( input.LA(1) ) {
            	        case 20:
            	            {
            	            alt11=1;
            	            }
            	            break;
            	        case 14:
            	            {
            	            alt11=1;
            	            }
            	            break;
            	        case 17:
            	            {
            	            alt11=1;
            	            }
            	            break;
            	        case 18:
            	            {
            	            alt11=1;
            	            }
            	            break;

            	        }

            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalDsl.g:561:5: (lv_commands_4_0= rulecommandBlock )
            	    	    {
            	    	    // InternalDsl.g:561:5: (lv_commands_4_0= rulecommandBlock )
            	    	    // InternalDsl.g:562:6: lv_commands_4_0= rulecommandBlock
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getScopeAccess().getCommandsCommandBlockParserRuleCall_1_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_commands_4_0=rulecommandBlock();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getScopeRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"commands",
            	    	    							lv_commands_4_0,
            	    	    							"zanshin.dsl.Dsl.commandBlock");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt11 >= 1 ) break loop11;
            	                EarlyExitException eee =
            	                    new EarlyExitException(11, input);
            	                throw eee;
            	        }
            	        cnt11++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRulecommandBlock"
    // InternalDsl.g:584:1: entryRulecommandBlock returns [EObject current=null] : iv_rulecommandBlock= rulecommandBlock EOF ;
    public final EObject entryRulecommandBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecommandBlock = null;


        try {
            // InternalDsl.g:584:53: (iv_rulecommandBlock= rulecommandBlock EOF )
            // InternalDsl.g:585:2: iv_rulecommandBlock= rulecommandBlock EOF
            {
             newCompositeNode(grammarAccess.getCommandBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecommandBlock=rulecommandBlock();

            state._fsp--;

             current =iv_rulecommandBlock; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecommandBlock"


    // $ANTLR start "rulecommandBlock"
    // InternalDsl.g:591:1: rulecommandBlock returns [EObject current=null] : ( (otherlv_0= 'Part' )? ( (lv_testtype_1_0= ruleTestType ) )* ( (lv_message_2_0= ruleLog ) )+ ) ;
    public final EObject rulecommandBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_testtype_1_0 = null;

        EObject lv_message_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:597:2: ( ( (otherlv_0= 'Part' )? ( (lv_testtype_1_0= ruleTestType ) )* ( (lv_message_2_0= ruleLog ) )+ ) )
            // InternalDsl.g:598:2: ( (otherlv_0= 'Part' )? ( (lv_testtype_1_0= ruleTestType ) )* ( (lv_message_2_0= ruleLog ) )+ )
            {
            // InternalDsl.g:598:2: ( (otherlv_0= 'Part' )? ( (lv_testtype_1_0= ruleTestType ) )* ( (lv_message_2_0= ruleLog ) )+ )
            // InternalDsl.g:599:3: (otherlv_0= 'Part' )? ( (lv_testtype_1_0= ruleTestType ) )* ( (lv_message_2_0= ruleLog ) )+
            {
            // InternalDsl.g:599:3: (otherlv_0= 'Part' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:600:4: otherlv_0= 'Part'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getCommandBlockAccess().getPartKeyword_0());
                    			

                    }
                    break;

            }

            // InternalDsl.g:605:3: ( (lv_testtype_1_0= ruleTestType ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14||LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:606:4: (lv_testtype_1_0= ruleTestType )
            	    {
            	    // InternalDsl.g:606:4: (lv_testtype_1_0= ruleTestType )
            	    // InternalDsl.g:607:5: lv_testtype_1_0= ruleTestType
            	    {

            	    					newCompositeNode(grammarAccess.getCommandBlockAccess().getTesttypeTestTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_testtype_1_0=ruleTestType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCommandBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"testtype",
            	    						lv_testtype_1_0,
            	    						"zanshin.dsl.Dsl.TestType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalDsl.g:624:3: ( (lv_message_2_0= ruleLog ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDsl.g:625:4: (lv_message_2_0= ruleLog )
            	    {
            	    // InternalDsl.g:625:4: (lv_message_2_0= ruleLog )
            	    // InternalDsl.g:626:5: lv_message_2_0= ruleLog
            	    {

            	    					newCompositeNode(grammarAccess.getCommandBlockAccess().getMessageLogParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_message_2_0=ruleLog();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCommandBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"message",
            	    						lv_message_2_0,
            	    						"zanshin.dsl.Dsl.Log");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecommandBlock"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001E4002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001E4020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000001E4000L});

}