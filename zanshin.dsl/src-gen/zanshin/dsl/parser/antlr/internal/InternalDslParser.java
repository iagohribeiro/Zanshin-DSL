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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'.'", "'.*'", "'Success'", "'['", "']'", "'Failure'", "'Part'", "'Simulation'"
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


    // $ANTLR start "entryRuleType"
    // InternalDsl.g:218:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalDsl.g:218:45: (iv_ruleType= ruleType EOF )
            // InternalDsl.g:219:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDsl.g:225:1: ruleType returns [EObject current=null] : (this_Success_0= ruleSuccess | this_Failure_1= ruleFailure ) ;
    public final EObject ruleType() throws RecognitionException {
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

                    			newCompositeNode(grammarAccess.getTypeAccess().getSuccessParserRuleCall_0());
                    		
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

                    			newCompositeNode(grammarAccess.getTypeAccess().getFailureParserRuleCall_1());
                    		
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
    // $ANTLR end "ruleType"


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
    // InternalDsl.g:261:1: ruleSuccess returns [EObject current=null] : (otherlv_0= 'Success' ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleSuccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_array_1_0=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalDsl.g:267:2: ( (otherlv_0= 'Success' ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) ) ) )
            // InternalDsl.g:268:2: (otherlv_0= 'Success' ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:268:2: (otherlv_0= 'Success' ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) ) )
            // InternalDsl.g:269:3: otherlv_0= 'Success' ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSuccessAccess().getSuccessKeyword_0());
            		
            // InternalDsl.g:273:3: ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:274:4: ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']'
                    {
                    // InternalDsl.g:274:4: ( (lv_array_1_0= '[' ) )
                    // InternalDsl.g:275:5: (lv_array_1_0= '[' )
                    {
                    // InternalDsl.g:275:5: (lv_array_1_0= '[' )
                    // InternalDsl.g:276:6: lv_array_1_0= '['
                    {
                    lv_array_1_0=(Token)match(input,15,FOLLOW_8); 

                    						newLeafNode(lv_array_1_0, grammarAccess.getSuccessAccess().getArrayLeftSquareBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSuccessRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    // InternalDsl.g:288:4: ( (lv_length_2_0= RULE_INT ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_INT) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalDsl.g:289:5: (lv_length_2_0= RULE_INT )
                            {
                            // InternalDsl.g:289:5: (lv_length_2_0= RULE_INT )
                            // InternalDsl.g:290:6: lv_length_2_0= RULE_INT
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

            // InternalDsl.g:311:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalDsl.g:312:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalDsl.g:312:4: (lv_name_4_0= RULE_STRING )
            // InternalDsl.g:313:5: lv_name_4_0= RULE_STRING
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
    // InternalDsl.g:333:1: entryRuleFailure returns [EObject current=null] : iv_ruleFailure= ruleFailure EOF ;
    public final EObject entryRuleFailure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFailure = null;


        try {
            // InternalDsl.g:333:48: (iv_ruleFailure= ruleFailure EOF )
            // InternalDsl.g:334:2: iv_ruleFailure= ruleFailure EOF
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
    // InternalDsl.g:340:1: ruleFailure returns [EObject current=null] : (otherlv_0= 'Failure' ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleFailure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_array_1_0=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalDsl.g:346:2: ( (otherlv_0= 'Failure' ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) ) ) )
            // InternalDsl.g:347:2: (otherlv_0= 'Failure' ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:347:2: (otherlv_0= 'Failure' ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) ) )
            // InternalDsl.g:348:3: otherlv_0= 'Failure' ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )? ( (lv_name_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFailureAccess().getFailureKeyword_0());
            		
            // InternalDsl.g:352:3: ( ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:353:4: ( (lv_array_1_0= '[' ) ) ( (lv_length_2_0= RULE_INT ) )? otherlv_3= ']'
                    {
                    // InternalDsl.g:353:4: ( (lv_array_1_0= '[' ) )
                    // InternalDsl.g:354:5: (lv_array_1_0= '[' )
                    {
                    // InternalDsl.g:354:5: (lv_array_1_0= '[' )
                    // InternalDsl.g:355:6: lv_array_1_0= '['
                    {
                    lv_array_1_0=(Token)match(input,15,FOLLOW_8); 

                    						newLeafNode(lv_array_1_0, grammarAccess.getFailureAccess().getArrayLeftSquareBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFailureRule());
                    						}
                    						setWithLastConsumed(current, "array", true, "[");
                    					

                    }


                    }

                    // InternalDsl.g:367:4: ( (lv_length_2_0= RULE_INT ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_INT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalDsl.g:368:5: (lv_length_2_0= RULE_INT )
                            {
                            // InternalDsl.g:368:5: (lv_length_2_0= RULE_INT )
                            // InternalDsl.g:369:6: lv_length_2_0= RULE_INT
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

            // InternalDsl.g:390:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalDsl.g:391:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalDsl.g:391:4: (lv_name_4_0= RULE_STRING )
            // InternalDsl.g:392:5: lv_name_4_0= RULE_STRING
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


    // $ANTLR start "entryRuleTestQuantity"
    // InternalDsl.g:412:1: entryRuleTestQuantity returns [String current=null] : iv_ruleTestQuantity= ruleTestQuantity EOF ;
    public final String entryRuleTestQuantity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTestQuantity = null;


        try {
            // InternalDsl.g:412:52: (iv_ruleTestQuantity= ruleTestQuantity EOF )
            // InternalDsl.g:413:2: iv_ruleTestQuantity= ruleTestQuantity EOF
            {
             newCompositeNode(grammarAccess.getTestQuantityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestQuantity=ruleTestQuantity();

            state._fsp--;

             current =iv_ruleTestQuantity.getText(); 
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
    // $ANTLR end "entryRuleTestQuantity"


    // $ANTLR start "ruleTestQuantity"
    // InternalDsl.g:419:1: ruleTestQuantity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Part' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleTestQuantity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDsl.g:425:2: ( (kw= 'Part' this_INT_1= RULE_INT ) )
            // InternalDsl.g:426:2: (kw= 'Part' this_INT_1= RULE_INT )
            {
            // InternalDsl.g:426:2: (kw= 'Part' this_INT_1= RULE_INT )
            // InternalDsl.g:427:3: kw= 'Part' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,18,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTestQuantityAccess().getPartKeyword_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getTestQuantityAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleTestQuantity"


    // $ANTLR start "entryRuleScope"
    // InternalDsl.g:443:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalDsl.g:443:46: (iv_ruleScope= ruleScope EOF )
            // InternalDsl.g:444:2: iv_ruleScope= ruleScope EOF
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
    // InternalDsl.g:450:1: ruleScope returns [EObject current=null] : ( ( (lv_project_0_0= ruleProject ) ) otherlv_1= 'Simulation' ( (lv_name_2_0= RULE_ID ) ) ( (lv_length_3_0= RULE_INT ) )? ( ( (lv_testquantity_4_0= ruleTestQuantity ) )? ( (lv_commands_5_0= ruleCommands ) ) )* ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_length_3_0=null;
        EObject lv_project_0_0 = null;

        AntlrDatatypeRuleToken lv_testquantity_4_0 = null;

        EObject lv_commands_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:456:2: ( ( ( (lv_project_0_0= ruleProject ) ) otherlv_1= 'Simulation' ( (lv_name_2_0= RULE_ID ) ) ( (lv_length_3_0= RULE_INT ) )? ( ( (lv_testquantity_4_0= ruleTestQuantity ) )? ( (lv_commands_5_0= ruleCommands ) ) )* ) )
            // InternalDsl.g:457:2: ( ( (lv_project_0_0= ruleProject ) ) otherlv_1= 'Simulation' ( (lv_name_2_0= RULE_ID ) ) ( (lv_length_3_0= RULE_INT ) )? ( ( (lv_testquantity_4_0= ruleTestQuantity ) )? ( (lv_commands_5_0= ruleCommands ) ) )* )
            {
            // InternalDsl.g:457:2: ( ( (lv_project_0_0= ruleProject ) ) otherlv_1= 'Simulation' ( (lv_name_2_0= RULE_ID ) ) ( (lv_length_3_0= RULE_INT ) )? ( ( (lv_testquantity_4_0= ruleTestQuantity ) )? ( (lv_commands_5_0= ruleCommands ) ) )* )
            // InternalDsl.g:458:3: ( (lv_project_0_0= ruleProject ) ) otherlv_1= 'Simulation' ( (lv_name_2_0= RULE_ID ) ) ( (lv_length_3_0= RULE_INT ) )? ( ( (lv_testquantity_4_0= ruleTestQuantity ) )? ( (lv_commands_5_0= ruleCommands ) ) )*
            {
            // InternalDsl.g:458:3: ( (lv_project_0_0= ruleProject ) )
            // InternalDsl.g:459:4: (lv_project_0_0= ruleProject )
            {
            // InternalDsl.g:459:4: (lv_project_0_0= ruleProject )
            // InternalDsl.g:460:5: lv_project_0_0= ruleProject
            {

            					newCompositeNode(grammarAccess.getScopeAccess().getProjectProjectParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getScopeAccess().getSimulationKeyword_1());
            		
            // InternalDsl.g:481:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:482:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:482:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:483:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_2_0, grammarAccess.getScopeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScopeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:499:3: ( (lv_length_3_0= RULE_INT ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:500:4: (lv_length_3_0= RULE_INT )
                    {
                    // InternalDsl.g:500:4: (lv_length_3_0= RULE_INT )
                    // InternalDsl.g:501:5: lv_length_3_0= RULE_INT
                    {
                    lv_length_3_0=(Token)match(input,RULE_INT,FOLLOW_14); 

                    					newLeafNode(lv_length_3_0, grammarAccess.getScopeAccess().getLengthINTTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getScopeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"length",
                    						lv_length_3_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:517:3: ( ( (lv_testquantity_4_0= ruleTestQuantity ) )? ( (lv_commands_5_0= ruleCommands ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14||(LA11_0>=17 && LA11_0<=18)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:518:4: ( (lv_testquantity_4_0= ruleTestQuantity ) )? ( (lv_commands_5_0= ruleCommands ) )
            	    {
            	    // InternalDsl.g:518:4: ( (lv_testquantity_4_0= ruleTestQuantity ) )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==18) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalDsl.g:519:5: (lv_testquantity_4_0= ruleTestQuantity )
            	            {
            	            // InternalDsl.g:519:5: (lv_testquantity_4_0= ruleTestQuantity )
            	            // InternalDsl.g:520:6: lv_testquantity_4_0= ruleTestQuantity
            	            {

            	            						newCompositeNode(grammarAccess.getScopeAccess().getTestquantityTestQuantityParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_15);
            	            lv_testquantity_4_0=ruleTestQuantity();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getScopeRule());
            	            						}
            	            						add(
            	            							current,
            	            							"testquantity",
            	            							lv_testquantity_4_0,
            	            							"zanshin.dsl.Dsl.TestQuantity");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDsl.g:537:4: ( (lv_commands_5_0= ruleCommands ) )
            	    // InternalDsl.g:538:5: (lv_commands_5_0= ruleCommands )
            	    {
            	    // InternalDsl.g:538:5: (lv_commands_5_0= ruleCommands )
            	    // InternalDsl.g:539:6: lv_commands_5_0= ruleCommands
            	    {

            	    						newCompositeNode(grammarAccess.getScopeAccess().getCommandsCommandsParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_commands_5_0=ruleCommands();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScopeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"commands",
            	    							lv_commands_5_0,
            	    							"zanshin.dsl.Dsl.Commands");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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


    // $ANTLR start "entryRuleCommands"
    // InternalDsl.g:561:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // InternalDsl.g:561:49: (iv_ruleCommands= ruleCommands EOF )
            // InternalDsl.g:562:2: iv_ruleCommands= ruleCommands EOF
            {
             newCompositeNode(grammarAccess.getCommandsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommands=ruleCommands();

            state._fsp--;

             current =iv_ruleCommands; 
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
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // InternalDsl.g:568:1: ruleCommands returns [EObject current=null] : this_Type_0= ruleType ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:574:2: (this_Type_0= ruleType )
            // InternalDsl.g:575:2: this_Type_0= ruleType
            {

            		newCompositeNode(grammarAccess.getCommandsAccess().getTypeParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Type_0=ruleType();

            state._fsp--;


            		current = this_Type_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleCommands"

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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000064022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000064002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000064000L});

}