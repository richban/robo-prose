package dk.itu.dsl.roboprose.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.itu.dsl.roboprose.services.RoboProseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRoboProseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_INT", "RULE_WS", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'My'", "'robot'", "'should'", "'.'", "'When'", "'when'", "'it'", "'('", "'but'", "')'", "'and'", "'then'", "','", "'Then'", "'move'", "'for'", "'seconds'", "'turn'", "'degrees'", "'stop'", "'-'", "'E'", "'e'", "'meets'", "'an'", "'obstacle'", "'is'", "'tapped'", "'forwards'", "'forward'", "'backwards'", "'backward'", "'back'", "'left'", "'right'", "'randomly'", "'random'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NEWLINE=4;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=6;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRoboProseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRoboProseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRoboProseParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRoboProse.g"; }



     	private RoboProseGrammarAccess grammarAccess;

        public InternalRoboProseParser(TokenStream input, RoboProseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RoboProse";
       	}

       	@Override
       	protected RoboProseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoboProse"
    // InternalRoboProse.g:65:1: entryRuleRoboProse returns [EObject current=null] : iv_ruleRoboProse= ruleRoboProse EOF ;
    public final EObject entryRuleRoboProse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoboProse = null;


        try {
            // InternalRoboProse.g:65:50: (iv_ruleRoboProse= ruleRoboProse EOF )
            // InternalRoboProse.g:66:2: iv_ruleRoboProse= ruleRoboProse EOF
            {
             newCompositeNode(grammarAccess.getRoboProseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoboProse=ruleRoboProse();

            state._fsp--;

             current =iv_ruleRoboProse; 
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
    // $ANTLR end "entryRuleRoboProse"


    // $ANTLR start "ruleRoboProse"
    // InternalRoboProse.g:72:1: ruleRoboProse returns [EObject current=null] : ( () (otherlv_1= 'My' otherlv_2= 'robot' otherlv_3= 'should' ( (lv_main_4_0= ruleMain ) ) ruleParagraphDelimiter )? ( ( (lv_listeners_6_0= ruleEventListener ) ) ( ruleParagraphDelimiter ( (lv_listeners_8_0= ruleEventListener ) ) )* otherlv_9= '.' )? ) ;
    public final EObject ruleRoboProse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_9=null;
        EObject lv_main_4_0 = null;

        EObject lv_listeners_6_0 = null;

        EObject lv_listeners_8_0 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:78:2: ( ( () (otherlv_1= 'My' otherlv_2= 'robot' otherlv_3= 'should' ( (lv_main_4_0= ruleMain ) ) ruleParagraphDelimiter )? ( ( (lv_listeners_6_0= ruleEventListener ) ) ( ruleParagraphDelimiter ( (lv_listeners_8_0= ruleEventListener ) ) )* otherlv_9= '.' )? ) )
            // InternalRoboProse.g:79:2: ( () (otherlv_1= 'My' otherlv_2= 'robot' otherlv_3= 'should' ( (lv_main_4_0= ruleMain ) ) ruleParagraphDelimiter )? ( ( (lv_listeners_6_0= ruleEventListener ) ) ( ruleParagraphDelimiter ( (lv_listeners_8_0= ruleEventListener ) ) )* otherlv_9= '.' )? )
            {
            // InternalRoboProse.g:79:2: ( () (otherlv_1= 'My' otherlv_2= 'robot' otherlv_3= 'should' ( (lv_main_4_0= ruleMain ) ) ruleParagraphDelimiter )? ( ( (lv_listeners_6_0= ruleEventListener ) ) ( ruleParagraphDelimiter ( (lv_listeners_8_0= ruleEventListener ) ) )* otherlv_9= '.' )? )
            // InternalRoboProse.g:80:3: () (otherlv_1= 'My' otherlv_2= 'robot' otherlv_3= 'should' ( (lv_main_4_0= ruleMain ) ) ruleParagraphDelimiter )? ( ( (lv_listeners_6_0= ruleEventListener ) ) ( ruleParagraphDelimiter ( (lv_listeners_8_0= ruleEventListener ) ) )* otherlv_9= '.' )?
            {
            // InternalRoboProse.g:80:3: ()
            // InternalRoboProse.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoboProseAccess().getRoboProseAction_0(),
            					current);
            			

            }

            // InternalRoboProse.g:87:3: (otherlv_1= 'My' otherlv_2= 'robot' otherlv_3= 'should' ( (lv_main_4_0= ruleMain ) ) ruleParagraphDelimiter )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRoboProse.g:88:4: otherlv_1= 'My' otherlv_2= 'robot' otherlv_3= 'should' ( (lv_main_4_0= ruleMain ) ) ruleParagraphDelimiter
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getRoboProseAccess().getMyKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getRoboProseAccess().getRobotKeyword_1_1());
                    			
                    otherlv_3=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRoboProseAccess().getShouldKeyword_1_2());
                    			
                    // InternalRoboProse.g:100:4: ( (lv_main_4_0= ruleMain ) )
                    // InternalRoboProse.g:101:5: (lv_main_4_0= ruleMain )
                    {
                    // InternalRoboProse.g:101:5: (lv_main_4_0= ruleMain )
                    // InternalRoboProse.g:102:6: lv_main_4_0= ruleMain
                    {

                    						newCompositeNode(grammarAccess.getRoboProseAccess().getMainMainParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_main_4_0=ruleMain();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoboProseRule());
                    						}
                    						set(
                    							current,
                    							"main",
                    							lv_main_4_0,
                    							"dk.itu.dsl.roboprose.RoboProse.Main");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    				newCompositeNode(grammarAccess.getRoboProseAccess().getParagraphDelimiterParserRuleCall_1_4());
                    			
                    pushFollow(FOLLOW_7);
                    ruleParagraphDelimiter();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalRoboProse.g:127:3: ( ( (lv_listeners_6_0= ruleEventListener ) ) ( ruleParagraphDelimiter ( (lv_listeners_8_0= ruleEventListener ) ) )* otherlv_9= '.' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=16 && LA3_0<=17)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRoboProse.g:128:4: ( (lv_listeners_6_0= ruleEventListener ) ) ( ruleParagraphDelimiter ( (lv_listeners_8_0= ruleEventListener ) ) )* otherlv_9= '.'
                    {
                    // InternalRoboProse.g:128:4: ( (lv_listeners_6_0= ruleEventListener ) )
                    // InternalRoboProse.g:129:5: (lv_listeners_6_0= ruleEventListener )
                    {
                    // InternalRoboProse.g:129:5: (lv_listeners_6_0= ruleEventListener )
                    // InternalRoboProse.g:130:6: lv_listeners_6_0= ruleEventListener
                    {

                    						newCompositeNode(grammarAccess.getRoboProseAccess().getListenersEventListenerParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_listeners_6_0=ruleEventListener();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoboProseRule());
                    						}
                    						add(
                    							current,
                    							"listeners",
                    							lv_listeners_6_0,
                    							"dk.itu.dsl.roboprose.RoboProse.EventListener");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRoboProse.g:147:4: ( ruleParagraphDelimiter ( (lv_listeners_8_0= ruleEventListener ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            int LA2_1 = input.LA(2);

                            if ( (LA2_1==RULE_NEWLINE) ) {
                                alt2=1;
                            }


                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalRoboProse.g:148:5: ruleParagraphDelimiter ( (lv_listeners_8_0= ruleEventListener ) )
                    	    {

                    	    					newCompositeNode(grammarAccess.getRoboProseAccess().getParagraphDelimiterParserRuleCall_2_1_0());
                    	    				
                    	    pushFollow(FOLLOW_8);
                    	    ruleParagraphDelimiter();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    // InternalRoboProse.g:155:5: ( (lv_listeners_8_0= ruleEventListener ) )
                    	    // InternalRoboProse.g:156:6: (lv_listeners_8_0= ruleEventListener )
                    	    {
                    	    // InternalRoboProse.g:156:6: (lv_listeners_8_0= ruleEventListener )
                    	    // InternalRoboProse.g:157:7: lv_listeners_8_0= ruleEventListener
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoboProseAccess().getListenersEventListenerParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_listeners_8_0=ruleEventListener();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoboProseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"listeners",
                    	    								lv_listeners_8_0,
                    	    								"dk.itu.dsl.roboprose.RoboProse.EventListener");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getRoboProseAccess().getFullStopKeyword_2_2());
                    			

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
    // $ANTLR end "ruleRoboProse"


    // $ANTLR start "entryRuleMain"
    // InternalRoboProse.g:184:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalRoboProse.g:184:45: (iv_ruleMain= ruleMain EOF )
            // InternalRoboProse.g:185:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalRoboProse.g:191:1: ruleMain returns [EObject current=null] : ( ( (lv_actions_0_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) ) )* ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_0_0 = null;

        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:197:2: ( ( ( (lv_actions_0_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) ) )* ) )
            // InternalRoboProse.g:198:2: ( ( (lv_actions_0_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) ) )* )
            {
            // InternalRoboProse.g:198:2: ( ( (lv_actions_0_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) ) )* )
            // InternalRoboProse.g:199:3: ( (lv_actions_0_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) ) )*
            {
            // InternalRoboProse.g:199:3: ( (lv_actions_0_0= ruleAction ) )
            // InternalRoboProse.g:200:4: (lv_actions_0_0= ruleAction )
            {
            // InternalRoboProse.g:200:4: (lv_actions_0_0= ruleAction )
            // InternalRoboProse.g:201:5: lv_actions_0_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getMainAccess().getActionsActionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_actions_0_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_0_0,
            						"dk.itu.dsl.roboprose.RoboProse.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRoboProse.g:218:3: ( ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==25) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==22||LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRoboProse.g:219:4: ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) )
            	    {

            	    				newCompositeNode(grammarAccess.getMainAccess().getActionDelimiterParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_5);
            	    ruleActionDelimiter();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalRoboProse.g:226:4: ( (lv_actions_2_0= ruleAction ) )
            	    // InternalRoboProse.g:227:5: (lv_actions_2_0= ruleAction )
            	    {
            	    // InternalRoboProse.g:227:5: (lv_actions_2_0= ruleAction )
            	    // InternalRoboProse.g:228:6: lv_actions_2_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getMainAccess().getActionsActionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_actions_2_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMainRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_2_0,
            	    							"dk.itu.dsl.roboprose.RoboProse.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleEventListener"
    // InternalRoboProse.g:250:1: entryRuleEventListener returns [EObject current=null] : iv_ruleEventListener= ruleEventListener EOF ;
    public final EObject entryRuleEventListener() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventListener = null;


        try {
            // InternalRoboProse.g:250:54: (iv_ruleEventListener= ruleEventListener EOF )
            // InternalRoboProse.g:251:2: iv_ruleEventListener= ruleEventListener EOF
            {
             newCompositeNode(grammarAccess.getEventListenerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventListener=ruleEventListener();

            state._fsp--;

             current =iv_ruleEventListener; 
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
    // $ANTLR end "entryRuleEventListener"


    // $ANTLR start "ruleEventListener"
    // InternalRoboProse.g:257:1: ruleEventListener returns [EObject current=null] : ( (otherlv_0= 'When' | otherlv_1= 'when' ) otherlv_2= 'it' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'it' otherlv_5= 'should' ( (lv_actions_6_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) ) )* (otherlv_9= '(' otherlv_10= 'but' ( (lv_sublisteners_11_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_13_0= ruleEventListener ) ) )* otherlv_14= ')' )? ) ;
    public final EObject ruleEventListener() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_14=null;
        EObject lv_event_3_0 = null;

        EObject lv_actions_6_0 = null;

        EObject lv_actions_8_0 = null;

        EObject lv_sublisteners_11_0 = null;

        EObject lv_sublisteners_13_0 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:263:2: ( ( (otherlv_0= 'When' | otherlv_1= 'when' ) otherlv_2= 'it' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'it' otherlv_5= 'should' ( (lv_actions_6_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) ) )* (otherlv_9= '(' otherlv_10= 'but' ( (lv_sublisteners_11_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_13_0= ruleEventListener ) ) )* otherlv_14= ')' )? ) )
            // InternalRoboProse.g:264:2: ( (otherlv_0= 'When' | otherlv_1= 'when' ) otherlv_2= 'it' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'it' otherlv_5= 'should' ( (lv_actions_6_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) ) )* (otherlv_9= '(' otherlv_10= 'but' ( (lv_sublisteners_11_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_13_0= ruleEventListener ) ) )* otherlv_14= ')' )? )
            {
            // InternalRoboProse.g:264:2: ( (otherlv_0= 'When' | otherlv_1= 'when' ) otherlv_2= 'it' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'it' otherlv_5= 'should' ( (lv_actions_6_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) ) )* (otherlv_9= '(' otherlv_10= 'but' ( (lv_sublisteners_11_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_13_0= ruleEventListener ) ) )* otherlv_14= ')' )? )
            // InternalRoboProse.g:265:3: (otherlv_0= 'When' | otherlv_1= 'when' ) otherlv_2= 'it' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'it' otherlv_5= 'should' ( (lv_actions_6_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) ) )* (otherlv_9= '(' otherlv_10= 'but' ( (lv_sublisteners_11_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_13_0= ruleEventListener ) ) )* otherlv_14= ')' )?
            {
            // InternalRoboProse.g:265:3: (otherlv_0= 'When' | otherlv_1= 'when' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoboProse.g:266:4: otherlv_0= 'When'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getEventListenerAccess().getWhenKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:271:4: otherlv_1= 'when'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getEventListenerAccess().getWhenKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getEventListenerAccess().getItKeyword_1());
            		
            // InternalRoboProse.g:280:3: ( (lv_event_3_0= ruleEvent ) )
            // InternalRoboProse.g:281:4: (lv_event_3_0= ruleEvent )
            {
            // InternalRoboProse.g:281:4: (lv_event_3_0= ruleEvent )
            // InternalRoboProse.g:282:5: lv_event_3_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getEventListenerAccess().getEventEventParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_event_3_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventListenerRule());
            					}
            					set(
            						current,
            						"event",
            						lv_event_3_0,
            						"dk.itu.dsl.roboprose.RoboProse.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getEventListenerAccess().getItKeyword_3());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getEventListenerAccess().getShouldKeyword_4());
            		
            // InternalRoboProse.g:307:3: ( (lv_actions_6_0= ruleAction ) )
            // InternalRoboProse.g:308:4: (lv_actions_6_0= ruleAction )
            {
            // InternalRoboProse.g:308:4: (lv_actions_6_0= ruleAction )
            // InternalRoboProse.g:309:5: lv_actions_6_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getEventListenerAccess().getActionsActionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_actions_6_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventListenerRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_6_0,
            						"dk.itu.dsl.roboprose.RoboProse.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRoboProse.g:326:3: ( ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==25) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==22||LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRoboProse.g:327:4: ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) )
            	    {

            	    				newCompositeNode(grammarAccess.getEventListenerAccess().getActionDelimiterParserRuleCall_6_0());
            	    			
            	    pushFollow(FOLLOW_5);
            	    ruleActionDelimiter();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalRoboProse.g:334:4: ( (lv_actions_8_0= ruleAction ) )
            	    // InternalRoboProse.g:335:5: (lv_actions_8_0= ruleAction )
            	    {
            	    // InternalRoboProse.g:335:5: (lv_actions_8_0= ruleAction )
            	    // InternalRoboProse.g:336:6: lv_actions_8_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getEventListenerAccess().getActionsActionParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_actions_8_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEventListenerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_8_0,
            	    							"dk.itu.dsl.roboprose.RoboProse.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalRoboProse.g:354:3: (otherlv_9= '(' otherlv_10= 'but' ( (lv_sublisteners_11_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_13_0= ruleEventListener ) ) )* otherlv_14= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRoboProse.g:355:4: otherlv_9= '(' otherlv_10= 'but' ( (lv_sublisteners_11_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_13_0= ruleEventListener ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getEventListenerAccess().getLeftParenthesisKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getEventListenerAccess().getButKeyword_7_1());
                    			
                    // InternalRoboProse.g:363:4: ( (lv_sublisteners_11_0= ruleEventListener ) )
                    // InternalRoboProse.g:364:5: (lv_sublisteners_11_0= ruleEventListener )
                    {
                    // InternalRoboProse.g:364:5: (lv_sublisteners_11_0= ruleEventListener )
                    // InternalRoboProse.g:365:6: lv_sublisteners_11_0= ruleEventListener
                    {

                    						newCompositeNode(grammarAccess.getEventListenerAccess().getSublistenersEventListenerParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_sublisteners_11_0=ruleEventListener();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventListenerRule());
                    						}
                    						add(
                    							current,
                    							"sublisteners",
                    							lv_sublisteners_11_0,
                    							"dk.itu.dsl.roboprose.RoboProse.EventListener");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRoboProse.g:382:4: ( ruleSublistenerDelimiter ( (lv_sublisteners_13_0= ruleEventListener ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRoboProse.g:383:5: ruleSublistenerDelimiter ( (lv_sublisteners_13_0= ruleEventListener ) )
                    	    {

                    	    					newCompositeNode(grammarAccess.getEventListenerAccess().getSublistenerDelimiterParserRuleCall_7_3_0());
                    	    				
                    	    pushFollow(FOLLOW_8);
                    	    ruleSublistenerDelimiter();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    // InternalRoboProse.g:390:5: ( (lv_sublisteners_13_0= ruleEventListener ) )
                    	    // InternalRoboProse.g:391:6: (lv_sublisteners_13_0= ruleEventListener )
                    	    {
                    	    // InternalRoboProse.g:391:6: (lv_sublisteners_13_0= ruleEventListener )
                    	    // InternalRoboProse.g:392:7: lv_sublisteners_13_0= ruleEventListener
                    	    {

                    	    							newCompositeNode(grammarAccess.getEventListenerAccess().getSublistenersEventListenerParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_sublisteners_13_0=ruleEventListener();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEventListenerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sublisteners",
                    	    								lv_sublisteners_13_0,
                    	    								"dk.itu.dsl.roboprose.RoboProse.EventListener");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getEventListenerAccess().getRightParenthesisKeyword_7_4());
                    			

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
    // $ANTLR end "ruleEventListener"


    // $ANTLR start "entryRuleSublistenerDelimiter"
    // InternalRoboProse.g:419:1: entryRuleSublistenerDelimiter returns [String current=null] : iv_ruleSublistenerDelimiter= ruleSublistenerDelimiter EOF ;
    public final String entryRuleSublistenerDelimiter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSublistenerDelimiter = null;


        try {
            // InternalRoboProse.g:419:60: (iv_ruleSublistenerDelimiter= ruleSublistenerDelimiter EOF )
            // InternalRoboProse.g:420:2: iv_ruleSublistenerDelimiter= ruleSublistenerDelimiter EOF
            {
             newCompositeNode(grammarAccess.getSublistenerDelimiterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSublistenerDelimiter=ruleSublistenerDelimiter();

            state._fsp--;

             current =iv_ruleSublistenerDelimiter.getText(); 
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
    // $ANTLR end "entryRuleSublistenerDelimiter"


    // $ANTLR start "ruleSublistenerDelimiter"
    // InternalRoboProse.g:426:1: ruleSublistenerDelimiter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.' ;
    public final AntlrDatatypeRuleToken ruleSublistenerDelimiter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRoboProse.g:432:2: (kw= '.' )
            // InternalRoboProse.g:433:2: kw= '.'
            {
            kw=(Token)match(input,15,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getSublistenerDelimiterAccess().getFullStopKeyword());
            	

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
    // $ANTLR end "ruleSublistenerDelimiter"


    // $ANTLR start "entryRuleActionDelimiter"
    // InternalRoboProse.g:441:1: entryRuleActionDelimiter returns [String current=null] : iv_ruleActionDelimiter= ruleActionDelimiter EOF ;
    public final String entryRuleActionDelimiter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActionDelimiter = null;


        try {
            // InternalRoboProse.g:441:55: (iv_ruleActionDelimiter= ruleActionDelimiter EOF )
            // InternalRoboProse.g:442:2: iv_ruleActionDelimiter= ruleActionDelimiter EOF
            {
             newCompositeNode(grammarAccess.getActionDelimiterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionDelimiter=ruleActionDelimiter();

            state._fsp--;

             current =iv_ruleActionDelimiter.getText(); 
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
    // $ANTLR end "entryRuleActionDelimiter"


    // $ANTLR start "ruleActionDelimiter"
    // InternalRoboProse.g:448:1: ruleActionDelimiter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'and' kw= 'then' ) | (kw= ',' kw= 'then' ) | (kw= '.' kw= 'Then' ) ) (kw= 'it' kw= 'should' )? ) ;
    public final AntlrDatatypeRuleToken ruleActionDelimiter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRoboProse.g:454:2: ( ( ( (kw= 'and' kw= 'then' ) | (kw= ',' kw= 'then' ) | (kw= '.' kw= 'Then' ) ) (kw= 'it' kw= 'should' )? ) )
            // InternalRoboProse.g:455:2: ( ( (kw= 'and' kw= 'then' ) | (kw= ',' kw= 'then' ) | (kw= '.' kw= 'Then' ) ) (kw= 'it' kw= 'should' )? )
            {
            // InternalRoboProse.g:455:2: ( ( (kw= 'and' kw= 'then' ) | (kw= ',' kw= 'then' ) | (kw= '.' kw= 'Then' ) ) (kw= 'it' kw= 'should' )? )
            // InternalRoboProse.g:456:3: ( (kw= 'and' kw= 'then' ) | (kw= ',' kw= 'then' ) | (kw= '.' kw= 'Then' ) ) (kw= 'it' kw= 'should' )?
            {
            // InternalRoboProse.g:456:3: ( (kw= 'and' kw= 'then' ) | (kw= ',' kw= 'then' ) | (kw= '.' kw= 'Then' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 15:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRoboProse.g:457:4: (kw= 'and' kw= 'then' )
                    {
                    // InternalRoboProse.g:457:4: (kw= 'and' kw= 'then' )
                    // InternalRoboProse.g:458:5: kw= 'and' kw= 'then'
                    {
                    kw=(Token)match(input,22,FOLLOW_15); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getAndKeyword_0_0_0());
                    				
                    kw=(Token)match(input,23,FOLLOW_16); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getThenKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:470:4: (kw= ',' kw= 'then' )
                    {
                    // InternalRoboProse.g:470:4: (kw= ',' kw= 'then' )
                    // InternalRoboProse.g:471:5: kw= ',' kw= 'then'
                    {
                    kw=(Token)match(input,24,FOLLOW_15); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getCommaKeyword_0_1_0());
                    				
                    kw=(Token)match(input,23,FOLLOW_16); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getThenKeyword_0_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalRoboProse.g:483:4: (kw= '.' kw= 'Then' )
                    {
                    // InternalRoboProse.g:483:4: (kw= '.' kw= 'Then' )
                    // InternalRoboProse.g:484:5: kw= '.' kw= 'Then'
                    {
                    kw=(Token)match(input,15,FOLLOW_17); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getFullStopKeyword_0_2_0());
                    				
                    kw=(Token)match(input,25,FOLLOW_16); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getThenKeyword_0_2_1());
                    				

                    }


                    }
                    break;

            }

            // InternalRoboProse.g:496:3: (kw= 'it' kw= 'should' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRoboProse.g:497:4: kw= 'it' kw= 'should'
                    {
                    kw=(Token)match(input,18,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getItKeyword_1_0());
                    			
                    kw=(Token)match(input,14,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getShouldKeyword_1_1());
                    			

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
    // $ANTLR end "ruleActionDelimiter"


    // $ANTLR start "entryRuleParagraphDelimiter"
    // InternalRoboProse.g:512:1: entryRuleParagraphDelimiter returns [String current=null] : iv_ruleParagraphDelimiter= ruleParagraphDelimiter EOF ;
    public final String entryRuleParagraphDelimiter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParagraphDelimiter = null;


        try {
            // InternalRoboProse.g:512:58: (iv_ruleParagraphDelimiter= ruleParagraphDelimiter EOF )
            // InternalRoboProse.g:513:2: iv_ruleParagraphDelimiter= ruleParagraphDelimiter EOF
            {
             newCompositeNode(grammarAccess.getParagraphDelimiterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParagraphDelimiter=ruleParagraphDelimiter();

            state._fsp--;

             current =iv_ruleParagraphDelimiter.getText(); 
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
    // $ANTLR end "entryRuleParagraphDelimiter"


    // $ANTLR start "ruleParagraphDelimiter"
    // InternalRoboProse.g:519:1: ruleParagraphDelimiter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' this_NEWLINE_1= RULE_NEWLINE (this_NEWLINE_2= RULE_NEWLINE )+ ) ;
    public final AntlrDatatypeRuleToken ruleParagraphDelimiter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NEWLINE_1=null;
        Token this_NEWLINE_2=null;


        	enterRule();

        try {
            // InternalRoboProse.g:525:2: ( (kw= '.' this_NEWLINE_1= RULE_NEWLINE (this_NEWLINE_2= RULE_NEWLINE )+ ) )
            // InternalRoboProse.g:526:2: (kw= '.' this_NEWLINE_1= RULE_NEWLINE (this_NEWLINE_2= RULE_NEWLINE )+ )
            {
            // InternalRoboProse.g:526:2: (kw= '.' this_NEWLINE_1= RULE_NEWLINE (this_NEWLINE_2= RULE_NEWLINE )+ )
            // InternalRoboProse.g:527:3: kw= '.' this_NEWLINE_1= RULE_NEWLINE (this_NEWLINE_2= RULE_NEWLINE )+
            {
            kw=(Token)match(input,15,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getParagraphDelimiterAccess().getFullStopKeyword_0());
            		
            this_NEWLINE_1=(Token)match(input,RULE_NEWLINE,FOLLOW_18); 

            			current.merge(this_NEWLINE_1);
            		

            			newLeafNode(this_NEWLINE_1, grammarAccess.getParagraphDelimiterAccess().getNEWLINETerminalRuleCall_1());
            		
            // InternalRoboProse.g:539:3: (this_NEWLINE_2= RULE_NEWLINE )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_NEWLINE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRoboProse.g:540:4: this_NEWLINE_2= RULE_NEWLINE
            	    {
            	    this_NEWLINE_2=(Token)match(input,RULE_NEWLINE,FOLLOW_19); 

            	    				current.merge(this_NEWLINE_2);
            	    			

            	    				newLeafNode(this_NEWLINE_2, grammarAccess.getParagraphDelimiterAccess().getNEWLINETerminalRuleCall_2());
            	    			

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
    // $ANTLR end "ruleParagraphDelimiter"


    // $ANTLR start "entryRuleAction"
    // InternalRoboProse.g:552:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalRoboProse.g:552:47: (iv_ruleAction= ruleAction EOF )
            // InternalRoboProse.g:553:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalRoboProse.g:559:1: ruleAction returns [EObject current=null] : (this_Move_0= ruleMove | this_Turn_1= ruleTurn | this_Stop_2= ruleStop ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Move_0 = null;

        EObject this_Turn_1 = null;

        EObject this_Stop_2 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:565:2: ( (this_Move_0= ruleMove | this_Turn_1= ruleTurn | this_Stop_2= ruleStop ) )
            // InternalRoboProse.g:566:2: (this_Move_0= ruleMove | this_Turn_1= ruleTurn | this_Stop_2= ruleStop )
            {
            // InternalRoboProse.g:566:2: (this_Move_0= ruleMove | this_Turn_1= ruleTurn | this_Stop_2= ruleStop )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalRoboProse.g:567:3: this_Move_0= ruleMove
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getMoveParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Move_0=ruleMove();

                    state._fsp--;


                    			current = this_Move_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:576:3: this_Turn_1= ruleTurn
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getTurnParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Turn_1=ruleTurn();

                    state._fsp--;


                    			current = this_Turn_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRoboProse.g:585:3: this_Stop_2= ruleStop
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getStopParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Stop_2=ruleStop();

                    state._fsp--;


                    			current = this_Stop_2;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleEvent"
    // InternalRoboProse.g:597:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalRoboProse.g:597:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalRoboProse.g:598:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalRoboProse.g:604:1: ruleEvent returns [EObject current=null] : (this_Obstacle_0= ruleObstacle | this_Tapped_1= ruleTapped ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_Obstacle_0 = null;

        EObject this_Tapped_1 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:610:2: ( (this_Obstacle_0= ruleObstacle | this_Tapped_1= ruleTapped ) )
            // InternalRoboProse.g:611:2: (this_Obstacle_0= ruleObstacle | this_Tapped_1= ruleTapped )
            {
            // InternalRoboProse.g:611:2: (this_Obstacle_0= ruleObstacle | this_Tapped_1= ruleTapped )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            else if ( (LA13_0==38) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRoboProse.g:612:3: this_Obstacle_0= ruleObstacle
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getObstacleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Obstacle_0=ruleObstacle();

                    state._fsp--;


                    			current = this_Obstacle_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:621:3: this_Tapped_1= ruleTapped
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getTappedParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tapped_1=ruleTapped();

                    state._fsp--;


                    			current = this_Tapped_1;
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleMove"
    // InternalRoboProse.g:633:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalRoboProse.g:633:45: (iv_ruleMove= ruleMove EOF )
            // InternalRoboProse.g:634:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalRoboProse.g:640:1: ruleMove returns [EObject current=null] : ( () otherlv_1= 'move' ( (lv_direction_2_0= ruleMOVE_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( (lv_isRandom_6_0= ruleRANDOM ) ) )? ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_direction_2_0 = null;

        AntlrDatatypeRuleToken lv_duration_4_0 = null;

        Enumerator lv_isRandom_6_0 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:646:2: ( ( () otherlv_1= 'move' ( (lv_direction_2_0= ruleMOVE_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( (lv_isRandom_6_0= ruleRANDOM ) ) )? ) )
            // InternalRoboProse.g:647:2: ( () otherlv_1= 'move' ( (lv_direction_2_0= ruleMOVE_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( (lv_isRandom_6_0= ruleRANDOM ) ) )? )
            {
            // InternalRoboProse.g:647:2: ( () otherlv_1= 'move' ( (lv_direction_2_0= ruleMOVE_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( (lv_isRandom_6_0= ruleRANDOM ) ) )? )
            // InternalRoboProse.g:648:3: () otherlv_1= 'move' ( (lv_direction_2_0= ruleMOVE_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( (lv_isRandom_6_0= ruleRANDOM ) ) )?
            {
            // InternalRoboProse.g:648:3: ()
            // InternalRoboProse.g:649:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveAccess().getMoveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getMoveKeyword_1());
            		
            // InternalRoboProse.g:659:3: ( (lv_direction_2_0= ruleMOVE_DIRECTION ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=40 && LA14_0<=44)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRoboProse.g:660:4: (lv_direction_2_0= ruleMOVE_DIRECTION )
                    {
                    // InternalRoboProse.g:660:4: (lv_direction_2_0= ruleMOVE_DIRECTION )
                    // InternalRoboProse.g:661:5: lv_direction_2_0= ruleMOVE_DIRECTION
                    {

                    					newCompositeNode(grammarAccess.getMoveAccess().getDirectionMOVE_DIRECTIONEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_direction_2_0=ruleMOVE_DIRECTION();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMoveRule());
                    					}
                    					set(
                    						current,
                    						"direction",
                    						lv_direction_2_0,
                    						"dk.itu.dsl.roboprose.RoboProse.MOVE_DIRECTION");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalRoboProse.g:678:3: ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( (lv_isRandom_6_0= ruleRANDOM ) ) )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=47 && LA15_0<=48)) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // InternalRoboProse.g:679:4: (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' )
                    {
                    // InternalRoboProse.g:679:4: (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' )
                    // InternalRoboProse.g:680:5: otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_22); 

                    					newLeafNode(otherlv_3, grammarAccess.getMoveAccess().getForKeyword_3_0_0());
                    				
                    // InternalRoboProse.g:684:5: ( (lv_duration_4_0= ruleEFloat ) )
                    // InternalRoboProse.g:685:6: (lv_duration_4_0= ruleEFloat )
                    {
                    // InternalRoboProse.g:685:6: (lv_duration_4_0= ruleEFloat )
                    // InternalRoboProse.g:686:7: lv_duration_4_0= ruleEFloat
                    {

                    							newCompositeNode(grammarAccess.getMoveAccess().getDurationEFloatParserRuleCall_3_0_1_0());
                    						
                    pushFollow(FOLLOW_23);
                    lv_duration_4_0=ruleEFloat();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMoveRule());
                    							}
                    							set(
                    								current,
                    								"duration",
                    								lv_duration_4_0,
                    								"dk.itu.dsl.roboprose.RoboProse.EFloat");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getMoveAccess().getSecondsKeyword_3_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:709:4: ( (lv_isRandom_6_0= ruleRANDOM ) )
                    {
                    // InternalRoboProse.g:709:4: ( (lv_isRandom_6_0= ruleRANDOM ) )
                    // InternalRoboProse.g:710:5: (lv_isRandom_6_0= ruleRANDOM )
                    {
                    // InternalRoboProse.g:710:5: (lv_isRandom_6_0= ruleRANDOM )
                    // InternalRoboProse.g:711:6: lv_isRandom_6_0= ruleRANDOM
                    {

                    						newCompositeNode(grammarAccess.getMoveAccess().getIsRandomRANDOMEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_isRandom_6_0=ruleRANDOM();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoveRule());
                    						}
                    						set(
                    							current,
                    							"isRandom",
                    							lv_isRandom_6_0,
                    							"dk.itu.dsl.roboprose.RoboProse.RANDOM");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleTurn"
    // InternalRoboProse.g:733:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalRoboProse.g:733:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalRoboProse.g:734:2: iv_ruleTurn= ruleTurn EOF
            {
             newCompositeNode(grammarAccess.getTurnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurn=ruleTurn();

            state._fsp--;

             current =iv_ruleTurn; 
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
    // $ANTLR end "entryRuleTurn"


    // $ANTLR start "ruleTurn"
    // InternalRoboProse.g:740:1: ruleTurn returns [EObject current=null] : ( () otherlv_1= 'turn' ( (lv_direction_2_0= ruleTURN_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( ( (lv_degrees_6_0= ruleEFloat ) ) otherlv_7= 'degrees' ) | ( (lv_isRandom_8_0= ruleRANDOM ) ) )? ) ;
    public final EObject ruleTurn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_direction_2_0 = null;

        AntlrDatatypeRuleToken lv_duration_4_0 = null;

        AntlrDatatypeRuleToken lv_degrees_6_0 = null;

        Enumerator lv_isRandom_8_0 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:746:2: ( ( () otherlv_1= 'turn' ( (lv_direction_2_0= ruleTURN_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( ( (lv_degrees_6_0= ruleEFloat ) ) otherlv_7= 'degrees' ) | ( (lv_isRandom_8_0= ruleRANDOM ) ) )? ) )
            // InternalRoboProse.g:747:2: ( () otherlv_1= 'turn' ( (lv_direction_2_0= ruleTURN_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( ( (lv_degrees_6_0= ruleEFloat ) ) otherlv_7= 'degrees' ) | ( (lv_isRandom_8_0= ruleRANDOM ) ) )? )
            {
            // InternalRoboProse.g:747:2: ( () otherlv_1= 'turn' ( (lv_direction_2_0= ruleTURN_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( ( (lv_degrees_6_0= ruleEFloat ) ) otherlv_7= 'degrees' ) | ( (lv_isRandom_8_0= ruleRANDOM ) ) )? )
            // InternalRoboProse.g:748:3: () otherlv_1= 'turn' ( (lv_direction_2_0= ruleTURN_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( ( (lv_degrees_6_0= ruleEFloat ) ) otherlv_7= 'degrees' ) | ( (lv_isRandom_8_0= ruleRANDOM ) ) )?
            {
            // InternalRoboProse.g:748:3: ()
            // InternalRoboProse.g:749:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTurnAccess().getTurnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnAccess().getTurnKeyword_1());
            		
            // InternalRoboProse.g:759:3: ( (lv_direction_2_0= ruleTURN_DIRECTION ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=45 && LA16_0<=46)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRoboProse.g:760:4: (lv_direction_2_0= ruleTURN_DIRECTION )
                    {
                    // InternalRoboProse.g:760:4: (lv_direction_2_0= ruleTURN_DIRECTION )
                    // InternalRoboProse.g:761:5: lv_direction_2_0= ruleTURN_DIRECTION
                    {

                    					newCompositeNode(grammarAccess.getTurnAccess().getDirectionTURN_DIRECTIONEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_25);
                    lv_direction_2_0=ruleTURN_DIRECTION();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTurnRule());
                    					}
                    					set(
                    						current,
                    						"direction",
                    						lv_direction_2_0,
                    						"dk.itu.dsl.roboprose.RoboProse.TURN_DIRECTION");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalRoboProse.g:778:3: ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( ( (lv_degrees_6_0= ruleEFloat ) ) otherlv_7= 'degrees' ) | ( (lv_isRandom_8_0= ruleRANDOM ) ) )?
            int alt17=4;
            switch ( input.LA(1) ) {
                case 27:
                    {
                    alt17=1;
                    }
                    break;
                case RULE_INT:
                case 32:
                    {
                    alt17=2;
                    }
                    break;
                case 15:
                    {
                    int LA17_3 = input.LA(2);

                    if ( (LA17_3==RULE_INT) ) {
                        alt17=2;
                    }
                    }
                    break;
                case 47:
                case 48:
                    {
                    alt17=3;
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // InternalRoboProse.g:779:4: (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' )
                    {
                    // InternalRoboProse.g:779:4: (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' )
                    // InternalRoboProse.g:780:5: otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_22); 

                    					newLeafNode(otherlv_3, grammarAccess.getTurnAccess().getForKeyword_3_0_0());
                    				
                    // InternalRoboProse.g:784:5: ( (lv_duration_4_0= ruleEFloat ) )
                    // InternalRoboProse.g:785:6: (lv_duration_4_0= ruleEFloat )
                    {
                    // InternalRoboProse.g:785:6: (lv_duration_4_0= ruleEFloat )
                    // InternalRoboProse.g:786:7: lv_duration_4_0= ruleEFloat
                    {

                    							newCompositeNode(grammarAccess.getTurnAccess().getDurationEFloatParserRuleCall_3_0_1_0());
                    						
                    pushFollow(FOLLOW_23);
                    lv_duration_4_0=ruleEFloat();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTurnRule());
                    							}
                    							set(
                    								current,
                    								"duration",
                    								lv_duration_4_0,
                    								"dk.itu.dsl.roboprose.RoboProse.EFloat");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getTurnAccess().getSecondsKeyword_3_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:809:4: ( ( (lv_degrees_6_0= ruleEFloat ) ) otherlv_7= 'degrees' )
                    {
                    // InternalRoboProse.g:809:4: ( ( (lv_degrees_6_0= ruleEFloat ) ) otherlv_7= 'degrees' )
                    // InternalRoboProse.g:810:5: ( (lv_degrees_6_0= ruleEFloat ) ) otherlv_7= 'degrees'
                    {
                    // InternalRoboProse.g:810:5: ( (lv_degrees_6_0= ruleEFloat ) )
                    // InternalRoboProse.g:811:6: (lv_degrees_6_0= ruleEFloat )
                    {
                    // InternalRoboProse.g:811:6: (lv_degrees_6_0= ruleEFloat )
                    // InternalRoboProse.g:812:7: lv_degrees_6_0= ruleEFloat
                    {

                    							newCompositeNode(grammarAccess.getTurnAccess().getDegreesEFloatParserRuleCall_3_1_0_0());
                    						
                    pushFollow(FOLLOW_26);
                    lv_degrees_6_0=ruleEFloat();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTurnRule());
                    							}
                    							set(
                    								current,
                    								"degrees",
                    								lv_degrees_6_0,
                    								"dk.itu.dsl.roboprose.RoboProse.EFloat");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getTurnAccess().getDegreesKeyword_3_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalRoboProse.g:835:4: ( (lv_isRandom_8_0= ruleRANDOM ) )
                    {
                    // InternalRoboProse.g:835:4: ( (lv_isRandom_8_0= ruleRANDOM ) )
                    // InternalRoboProse.g:836:5: (lv_isRandom_8_0= ruleRANDOM )
                    {
                    // InternalRoboProse.g:836:5: (lv_isRandom_8_0= ruleRANDOM )
                    // InternalRoboProse.g:837:6: lv_isRandom_8_0= ruleRANDOM
                    {

                    						newCompositeNode(grammarAccess.getTurnAccess().getIsRandomRANDOMEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_isRandom_8_0=ruleRANDOM();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTurnRule());
                    						}
                    						set(
                    							current,
                    							"isRandom",
                    							lv_isRandom_8_0,
                    							"dk.itu.dsl.roboprose.RoboProse.RANDOM");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleTurn"


    // $ANTLR start "entryRuleStop"
    // InternalRoboProse.g:859:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // InternalRoboProse.g:859:45: (iv_ruleStop= ruleStop EOF )
            // InternalRoboProse.g:860:2: iv_ruleStop= ruleStop EOF
            {
             newCompositeNode(grammarAccess.getStopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStop=ruleStop();

            state._fsp--;

             current =iv_ruleStop; 
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
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // InternalRoboProse.g:866:1: ruleStop returns [EObject current=null] : ( () otherlv_1= 'stop' (otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds' )? ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_duration_3_0 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:872:2: ( ( () otherlv_1= 'stop' (otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds' )? ) )
            // InternalRoboProse.g:873:2: ( () otherlv_1= 'stop' (otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds' )? )
            {
            // InternalRoboProse.g:873:2: ( () otherlv_1= 'stop' (otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds' )? )
            // InternalRoboProse.g:874:3: () otherlv_1= 'stop' (otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds' )?
            {
            // InternalRoboProse.g:874:3: ()
            // InternalRoboProse.g:875:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStopAccess().getStopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getStopAccess().getStopKeyword_1());
            		
            // InternalRoboProse.g:885:3: (otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRoboProse.g:886:4: otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getStopAccess().getForKeyword_2_0());
                    			
                    // InternalRoboProse.g:890:4: ( (lv_duration_3_0= ruleEFloat ) )
                    // InternalRoboProse.g:891:5: (lv_duration_3_0= ruleEFloat )
                    {
                    // InternalRoboProse.g:891:5: (lv_duration_3_0= ruleEFloat )
                    // InternalRoboProse.g:892:6: lv_duration_3_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getStopAccess().getDurationEFloatParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_duration_3_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStopRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_3_0,
                    							"dk.itu.dsl.roboprose.RoboProse.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getStopAccess().getSecondsKeyword_2_2());
                    			

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
    // $ANTLR end "ruleStop"


    // $ANTLR start "entryRuleEFloat"
    // InternalRoboProse.g:918:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalRoboProse.g:918:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalRoboProse.g:919:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalRoboProse.g:925:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalRoboProse.g:931:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalRoboProse.g:932:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalRoboProse.g:932:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalRoboProse.g:933:3: (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalRoboProse.g:933:3: (kw= '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRoboProse.g:934:4: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_28); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalRoboProse.g:940:3: (this_INT_1= RULE_INT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_INT||LA20_1==15) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalRoboProse.g:941:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_28); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalRoboProse.g:949:3: (kw= '.' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRoboProse.g:950:4: kw= '.'
                    {
                    kw=(Token)match(input,15,FOLLOW_29); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
                    			

                    }
                    break;

            }

            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_30); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalRoboProse.g:963:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=33 && LA24_0<=34)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRoboProse.g:964:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalRoboProse.g:964:4: (kw= 'E' | kw= 'e' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==33) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==34) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalRoboProse.g:965:5: kw= 'E'
                            {
                            kw=(Token)match(input,33,FOLLOW_31); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalRoboProse.g:971:5: kw= 'e'
                            {
                            kw=(Token)match(input,34,FOLLOW_31); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalRoboProse.g:977:4: (kw= '-' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==32) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalRoboProse.g:978:5: kw= '-'
                            {
                            kw=(Token)match(input,32,FOLLOW_29); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleObstacle"
    // InternalRoboProse.g:996:1: entryRuleObstacle returns [EObject current=null] : iv_ruleObstacle= ruleObstacle EOF ;
    public final EObject entryRuleObstacle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacle = null;


        try {
            // InternalRoboProse.g:996:49: (iv_ruleObstacle= ruleObstacle EOF )
            // InternalRoboProse.g:997:2: iv_ruleObstacle= ruleObstacle EOF
            {
             newCompositeNode(grammarAccess.getObstacleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObstacle=ruleObstacle();

            state._fsp--;

             current =iv_ruleObstacle; 
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
    // $ANTLR end "entryRuleObstacle"


    // $ANTLR start "ruleObstacle"
    // InternalRoboProse.g:1003:1: ruleObstacle returns [EObject current=null] : ( () otherlv_1= 'meets' otherlv_2= 'an' otherlv_3= 'obstacle' ) ;
    public final EObject ruleObstacle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRoboProse.g:1009:2: ( ( () otherlv_1= 'meets' otherlv_2= 'an' otherlv_3= 'obstacle' ) )
            // InternalRoboProse.g:1010:2: ( () otherlv_1= 'meets' otherlv_2= 'an' otherlv_3= 'obstacle' )
            {
            // InternalRoboProse.g:1010:2: ( () otherlv_1= 'meets' otherlv_2= 'an' otherlv_3= 'obstacle' )
            // InternalRoboProse.g:1011:3: () otherlv_1= 'meets' otherlv_2= 'an' otherlv_3= 'obstacle'
            {
            // InternalRoboProse.g:1011:3: ()
            // InternalRoboProse.g:1012:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObstacleAccess().getObstacleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getObstacleAccess().getMeetsKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getObstacleAccess().getAnKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getObstacleAccess().getObstacleKeyword_3());
            		

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
    // $ANTLR end "ruleObstacle"


    // $ANTLR start "entryRuleTapped"
    // InternalRoboProse.g:1034:1: entryRuleTapped returns [EObject current=null] : iv_ruleTapped= ruleTapped EOF ;
    public final EObject entryRuleTapped() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTapped = null;


        try {
            // InternalRoboProse.g:1034:47: (iv_ruleTapped= ruleTapped EOF )
            // InternalRoboProse.g:1035:2: iv_ruleTapped= ruleTapped EOF
            {
             newCompositeNode(grammarAccess.getTappedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTapped=ruleTapped();

            state._fsp--;

             current =iv_ruleTapped; 
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
    // $ANTLR end "entryRuleTapped"


    // $ANTLR start "ruleTapped"
    // InternalRoboProse.g:1041:1: ruleTapped returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'tapped' ) ;
    public final EObject ruleTapped() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRoboProse.g:1047:2: ( ( () otherlv_1= 'is' otherlv_2= 'tapped' ) )
            // InternalRoboProse.g:1048:2: ( () otherlv_1= 'is' otherlv_2= 'tapped' )
            {
            // InternalRoboProse.g:1048:2: ( () otherlv_1= 'is' otherlv_2= 'tapped' )
            // InternalRoboProse.g:1049:3: () otherlv_1= 'is' otherlv_2= 'tapped'
            {
            // InternalRoboProse.g:1049:3: ()
            // InternalRoboProse.g:1050:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTappedAccess().getTappedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getTappedAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTappedAccess().getTappedKeyword_2());
            		

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
    // $ANTLR end "ruleTapped"


    // $ANTLR start "ruleMOVE_DIRECTION"
    // InternalRoboProse.g:1068:1: ruleMOVE_DIRECTION returns [Enumerator current=null] : ( (enumLiteral_0= 'forwards' ) | (enumLiteral_1= 'forward' ) | (enumLiteral_2= 'backwards' ) | (enumLiteral_3= 'backward' ) | (enumLiteral_4= 'back' ) ) ;
    public final Enumerator ruleMOVE_DIRECTION() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRoboProse.g:1074:2: ( ( (enumLiteral_0= 'forwards' ) | (enumLiteral_1= 'forward' ) | (enumLiteral_2= 'backwards' ) | (enumLiteral_3= 'backward' ) | (enumLiteral_4= 'back' ) ) )
            // InternalRoboProse.g:1075:2: ( (enumLiteral_0= 'forwards' ) | (enumLiteral_1= 'forward' ) | (enumLiteral_2= 'backwards' ) | (enumLiteral_3= 'backward' ) | (enumLiteral_4= 'back' ) )
            {
            // InternalRoboProse.g:1075:2: ( (enumLiteral_0= 'forwards' ) | (enumLiteral_1= 'forward' ) | (enumLiteral_2= 'backwards' ) | (enumLiteral_3= 'backward' ) | (enumLiteral_4= 'back' ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt25=1;
                }
                break;
            case 41:
                {
                alt25=2;
                }
                break;
            case 42:
                {
                alt25=3;
                }
                break;
            case 43:
                {
                alt25=4;
                }
                break;
            case 44:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalRoboProse.g:1076:3: (enumLiteral_0= 'forwards' )
                    {
                    // InternalRoboProse.g:1076:3: (enumLiteral_0= 'forwards' )
                    // InternalRoboProse.g:1077:4: enumLiteral_0= 'forwards'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:1084:3: (enumLiteral_1= 'forward' )
                    {
                    // InternalRoboProse.g:1084:3: (enumLiteral_1= 'forward' )
                    // InternalRoboProse.g:1085:4: enumLiteral_1= 'forward'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRoboProse.g:1092:3: (enumLiteral_2= 'backwards' )
                    {
                    // InternalRoboProse.g:1092:3: (enumLiteral_2= 'backwards' )
                    // InternalRoboProse.g:1093:4: enumLiteral_2= 'backwards'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRoboProse.g:1100:3: (enumLiteral_3= 'backward' )
                    {
                    // InternalRoboProse.g:1100:3: (enumLiteral_3= 'backward' )
                    // InternalRoboProse.g:1101:4: enumLiteral_3= 'backward'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRoboProse.g:1108:3: (enumLiteral_4= 'back' )
                    {
                    // InternalRoboProse.g:1108:3: (enumLiteral_4= 'back' )
                    // InternalRoboProse.g:1109:4: enumLiteral_4= 'back'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_4());
                    			

                    }


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
    // $ANTLR end "ruleMOVE_DIRECTION"


    // $ANTLR start "ruleTURN_DIRECTION"
    // InternalRoboProse.g:1119:1: ruleTURN_DIRECTION returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) ;
    public final Enumerator ruleTURN_DIRECTION() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRoboProse.g:1125:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) )
            // InternalRoboProse.g:1126:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            {
            // InternalRoboProse.g:1126:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            else if ( (LA26_0==46) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalRoboProse.g:1127:3: (enumLiteral_0= 'left' )
                    {
                    // InternalRoboProse.g:1127:3: (enumLiteral_0= 'left' )
                    // InternalRoboProse.g:1128:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTURN_DIRECTIONAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTURN_DIRECTIONAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:1135:3: (enumLiteral_1= 'right' )
                    {
                    // InternalRoboProse.g:1135:3: (enumLiteral_1= 'right' )
                    // InternalRoboProse.g:1136:4: enumLiteral_1= 'right'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTURN_DIRECTIONAccess().getRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTURN_DIRECTIONAccess().getRIGHTEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleTURN_DIRECTION"


    // $ANTLR start "ruleRANDOM"
    // InternalRoboProse.g:1146:1: ruleRANDOM returns [Enumerator current=null] : ( (enumLiteral_0= 'randomly' ) | (enumLiteral_1= 'random' ) ) ;
    public final Enumerator ruleRANDOM() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRoboProse.g:1152:2: ( ( (enumLiteral_0= 'randomly' ) | (enumLiteral_1= 'random' ) ) )
            // InternalRoboProse.g:1153:2: ( (enumLiteral_0= 'randomly' ) | (enumLiteral_1= 'random' ) )
            {
            // InternalRoboProse.g:1153:2: ( (enumLiteral_0= 'randomly' ) | (enumLiteral_1= 'random' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==47) ) {
                alt27=1;
            }
            else if ( (LA27_0==48) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalRoboProse.g:1154:3: (enumLiteral_0= 'randomly' )
                    {
                    // InternalRoboProse.g:1154:3: (enumLiteral_0= 'randomly' )
                    // InternalRoboProse.g:1155:4: enumLiteral_0= 'randomly'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getRANDOMAccess().getRANDOMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRANDOMAccess().getRANDOMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:1162:3: (enumLiteral_1= 'random' )
                    {
                    // InternalRoboProse.g:1162:3: (enumLiteral_1= 'random' )
                    // InternalRoboProse.g:1163:4: enumLiteral_1= 'random'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getRANDOMAccess().getRANDOMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRANDOMAccess().getRANDOMEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleRANDOM"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000A4000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001408002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001488002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00019F0008000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001800008000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100008020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001E00108008022L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001800108008022L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});

}