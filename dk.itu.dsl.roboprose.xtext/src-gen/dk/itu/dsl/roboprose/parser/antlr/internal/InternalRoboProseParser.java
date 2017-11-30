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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'My'", "'robot'", "'should'", "'.'", "'When'", "'when'", "'it'", "'('", "'but'", "')'", "'And'", "'and'", "'then'", "','", "'Then'", "'move'", "'for'", "'seconds'", "'turn'", "'degrees'", "'stop'", "'-'", "'E'", "'e'", "'meets'", "'an'", "'obstacle'", "'is'", "'tapped'", "'forwards'", "'forward'", "'backwards'", "'backward'", "'back'", "'left'", "'right'", "'randomly'", "'random'", "'repeat'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
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
    // InternalRoboProse.g:72:1: ruleRoboProse returns [EObject current=null] : ( () otherlv_1= 'My' otherlv_2= 'robot' otherlv_3= 'should' ( (lv_main_4_0= ruleMain ) ) otherlv_5= '.' ( ( (lv_listeners_6_0= ruleEventListener ) ) otherlv_7= '.' )* ) ;
    public final EObject ruleRoboProse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_main_4_0 = null;

        EObject lv_listeners_6_0 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:78:2: ( ( () otherlv_1= 'My' otherlv_2= 'robot' otherlv_3= 'should' ( (lv_main_4_0= ruleMain ) ) otherlv_5= '.' ( ( (lv_listeners_6_0= ruleEventListener ) ) otherlv_7= '.' )* ) )
            // InternalRoboProse.g:79:2: ( () otherlv_1= 'My' otherlv_2= 'robot' otherlv_3= 'should' ( (lv_main_4_0= ruleMain ) ) otherlv_5= '.' ( ( (lv_listeners_6_0= ruleEventListener ) ) otherlv_7= '.' )* )
            {
            // InternalRoboProse.g:79:2: ( () otherlv_1= 'My' otherlv_2= 'robot' otherlv_3= 'should' ( (lv_main_4_0= ruleMain ) ) otherlv_5= '.' ( ( (lv_listeners_6_0= ruleEventListener ) ) otherlv_7= '.' )* )
            // InternalRoboProse.g:80:3: () otherlv_1= 'My' otherlv_2= 'robot' otherlv_3= 'should' ( (lv_main_4_0= ruleMain ) ) otherlv_5= '.' ( ( (lv_listeners_6_0= ruleEventListener ) ) otherlv_7= '.' )*
            {
            // InternalRoboProse.g:80:3: ()
            // InternalRoboProse.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRoboProseAccess().getRoboProseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRoboProseAccess().getMyKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRoboProseAccess().getRobotKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRoboProseAccess().getShouldKeyword_3());
            		
            // InternalRoboProse.g:99:3: ( (lv_main_4_0= ruleMain ) )
            // InternalRoboProse.g:100:4: (lv_main_4_0= ruleMain )
            {
            // InternalRoboProse.g:100:4: (lv_main_4_0= ruleMain )
            // InternalRoboProse.g:101:5: lv_main_4_0= ruleMain
            {

            					newCompositeNode(grammarAccess.getRoboProseAccess().getMainMainParserRuleCall_4_0());
            				
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

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getRoboProseAccess().getFullStopKeyword_5());
            		
            // InternalRoboProse.g:122:3: ( ( (lv_listeners_6_0= ruleEventListener ) ) otherlv_7= '.' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRoboProse.g:123:4: ( (lv_listeners_6_0= ruleEventListener ) ) otherlv_7= '.'
            	    {
            	    // InternalRoboProse.g:123:4: ( (lv_listeners_6_0= ruleEventListener ) )
            	    // InternalRoboProse.g:124:5: (lv_listeners_6_0= ruleEventListener )
            	    {
            	    // InternalRoboProse.g:124:5: (lv_listeners_6_0= ruleEventListener )
            	    // InternalRoboProse.g:125:6: lv_listeners_6_0= ruleEventListener
            	    {

            	    						newCompositeNode(grammarAccess.getRoboProseAccess().getListenersEventListenerParserRuleCall_6_0_0());
            	    					
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

            	    otherlv_7=(Token)match(input,14,FOLLOW_7); 

            	    				newLeafNode(otherlv_7, grammarAccess.getRoboProseAccess().getFullStopKeyword_6_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleRoboProse"


    // $ANTLR start "entryRuleMain"
    // InternalRoboProse.g:151:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalRoboProse.g:151:45: (iv_ruleMain= ruleMain EOF )
            // InternalRoboProse.g:152:2: iv_ruleMain= ruleMain EOF
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
    // InternalRoboProse.g:158:1: ruleMain returns [EObject current=null] : ( ( (lv_actions_0_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) ) )* ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_0_0 = null;

        EObject lv_actions_2_0 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:164:2: ( ( ( (lv_actions_0_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) ) )* ) )
            // InternalRoboProse.g:165:2: ( ( (lv_actions_0_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) ) )* )
            {
            // InternalRoboProse.g:165:2: ( ( (lv_actions_0_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) ) )* )
            // InternalRoboProse.g:166:3: ( (lv_actions_0_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) ) )*
            {
            // InternalRoboProse.g:166:3: ( (lv_actions_0_0= ruleAction ) )
            // InternalRoboProse.g:167:4: (lv_actions_0_0= ruleAction )
            {
            // InternalRoboProse.g:167:4: (lv_actions_0_0= ruleAction )
            // InternalRoboProse.g:168:5: lv_actions_0_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getMainAccess().getActionsActionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalRoboProse.g:185:3: ( ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==25) ) {
                        alt2=1;
                    }


                }
                else if ( (LA2_0==22||LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRoboProse.g:186:4: ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) )
            	    {

            	    				newCompositeNode(grammarAccess.getMainAccess().getActionDelimiterParserRuleCall_1_0());
            	    			
            	    pushFollow(FOLLOW_5);
            	    ruleActionDelimiter();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalRoboProse.g:193:4: ( (lv_actions_2_0= ruleAction ) )
            	    // InternalRoboProse.g:194:5: (lv_actions_2_0= ruleAction )
            	    {
            	    // InternalRoboProse.g:194:5: (lv_actions_2_0= ruleAction )
            	    // InternalRoboProse.g:195:6: lv_actions_2_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getMainAccess().getActionsActionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleEventListener"
    // InternalRoboProse.g:217:1: entryRuleEventListener returns [EObject current=null] : iv_ruleEventListener= ruleEventListener EOF ;
    public final EObject entryRuleEventListener() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventListener = null;


        try {
            // InternalRoboProse.g:217:54: (iv_ruleEventListener= ruleEventListener EOF )
            // InternalRoboProse.g:218:2: iv_ruleEventListener= ruleEventListener EOF
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
    // InternalRoboProse.g:224:1: ruleEventListener returns [EObject current=null] : ( (otherlv_0= 'When' | otherlv_1= 'when' ) otherlv_2= 'it' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'it' otherlv_5= 'should' ( (lv_actions_6_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) ) )* (otherlv_9= '(' otherlv_10= 'but' ( (lv_sublisteners_11_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_13_0= ruleEventListener ) ) )* otherlv_14= ')' )? ) ;
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
            // InternalRoboProse.g:230:2: ( ( (otherlv_0= 'When' | otherlv_1= 'when' ) otherlv_2= 'it' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'it' otherlv_5= 'should' ( (lv_actions_6_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) ) )* (otherlv_9= '(' otherlv_10= 'but' ( (lv_sublisteners_11_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_13_0= ruleEventListener ) ) )* otherlv_14= ')' )? ) )
            // InternalRoboProse.g:231:2: ( (otherlv_0= 'When' | otherlv_1= 'when' ) otherlv_2= 'it' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'it' otherlv_5= 'should' ( (lv_actions_6_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) ) )* (otherlv_9= '(' otherlv_10= 'but' ( (lv_sublisteners_11_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_13_0= ruleEventListener ) ) )* otherlv_14= ')' )? )
            {
            // InternalRoboProse.g:231:2: ( (otherlv_0= 'When' | otherlv_1= 'when' ) otherlv_2= 'it' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'it' otherlv_5= 'should' ( (lv_actions_6_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) ) )* (otherlv_9= '(' otherlv_10= 'but' ( (lv_sublisteners_11_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_13_0= ruleEventListener ) ) )* otherlv_14= ')' )? )
            // InternalRoboProse.g:232:3: (otherlv_0= 'When' | otherlv_1= 'when' ) otherlv_2= 'it' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'it' otherlv_5= 'should' ( (lv_actions_6_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) ) )* (otherlv_9= '(' otherlv_10= 'but' ( (lv_sublisteners_11_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_13_0= ruleEventListener ) ) )* otherlv_14= ')' )?
            {
            // InternalRoboProse.g:232:3: (otherlv_0= 'When' | otherlv_1= 'when' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRoboProse.g:233:4: otherlv_0= 'When'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getEventListenerAccess().getWhenKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:238:4: otherlv_1= 'when'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getEventListenerAccess().getWhenKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getEventListenerAccess().getItKeyword_1());
            		
            // InternalRoboProse.g:247:3: ( (lv_event_3_0= ruleEvent ) )
            // InternalRoboProse.g:248:4: (lv_event_3_0= ruleEvent )
            {
            // InternalRoboProse.g:248:4: (lv_event_3_0= ruleEvent )
            // InternalRoboProse.g:249:5: lv_event_3_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getEventListenerAccess().getEventEventParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_4=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getEventListenerAccess().getItKeyword_3());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getEventListenerAccess().getShouldKeyword_4());
            		
            // InternalRoboProse.g:274:3: ( (lv_actions_6_0= ruleAction ) )
            // InternalRoboProse.g:275:4: (lv_actions_6_0= ruleAction )
            {
            // InternalRoboProse.g:275:4: (lv_actions_6_0= ruleAction )
            // InternalRoboProse.g:276:5: lv_actions_6_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getEventListenerAccess().getActionsActionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalRoboProse.g:293:3: ( ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==25) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==22||LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRoboProse.g:294:4: ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) )
            	    {

            	    				newCompositeNode(grammarAccess.getEventListenerAccess().getActionDelimiterParserRuleCall_6_0());
            	    			
            	    pushFollow(FOLLOW_5);
            	    ruleActionDelimiter();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalRoboProse.g:301:4: ( (lv_actions_8_0= ruleAction ) )
            	    // InternalRoboProse.g:302:5: (lv_actions_8_0= ruleAction )
            	    {
            	    // InternalRoboProse.g:302:5: (lv_actions_8_0= ruleAction )
            	    // InternalRoboProse.g:303:6: lv_actions_8_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getEventListenerAccess().getActionsActionParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
            	    break loop4;
                }
            } while (true);

            // InternalRoboProse.g:321:3: (otherlv_9= '(' otherlv_10= 'but' ( (lv_sublisteners_11_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_13_0= ruleEventListener ) ) )* otherlv_14= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoboProse.g:322:4: otherlv_9= '(' otherlv_10= 'but' ( (lv_sublisteners_11_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_13_0= ruleEventListener ) ) )* otherlv_14= ')'
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getEventListenerAccess().getLeftParenthesisKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getEventListenerAccess().getButKeyword_7_1());
                    			
                    // InternalRoboProse.g:330:4: ( (lv_sublisteners_11_0= ruleEventListener ) )
                    // InternalRoboProse.g:331:5: (lv_sublisteners_11_0= ruleEventListener )
                    {
                    // InternalRoboProse.g:331:5: (lv_sublisteners_11_0= ruleEventListener )
                    // InternalRoboProse.g:332:6: lv_sublisteners_11_0= ruleEventListener
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

                    // InternalRoboProse.g:349:4: ( ruleSublistenerDelimiter ( (lv_sublisteners_13_0= ruleEventListener ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRoboProse.g:350:5: ruleSublistenerDelimiter ( (lv_sublisteners_13_0= ruleEventListener ) )
                    	    {

                    	    					newCompositeNode(grammarAccess.getEventListenerAccess().getSublistenerDelimiterParserRuleCall_7_3_0());
                    	    				
                    	    pushFollow(FOLLOW_13);
                    	    ruleSublistenerDelimiter();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    // InternalRoboProse.g:357:5: ( (lv_sublisteners_13_0= ruleEventListener ) )
                    	    // InternalRoboProse.g:358:6: (lv_sublisteners_13_0= ruleEventListener )
                    	    {
                    	    // InternalRoboProse.g:358:6: (lv_sublisteners_13_0= ruleEventListener )
                    	    // InternalRoboProse.g:359:7: lv_sublisteners_13_0= ruleEventListener
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
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,20,FOLLOW_2); 

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
    // InternalRoboProse.g:386:1: entryRuleSublistenerDelimiter returns [String current=null] : iv_ruleSublistenerDelimiter= ruleSublistenerDelimiter EOF ;
    public final String entryRuleSublistenerDelimiter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSublistenerDelimiter = null;


        try {
            // InternalRoboProse.g:386:60: (iv_ruleSublistenerDelimiter= ruleSublistenerDelimiter EOF )
            // InternalRoboProse.g:387:2: iv_ruleSublistenerDelimiter= ruleSublistenerDelimiter EOF
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
    // InternalRoboProse.g:393:1: ruleSublistenerDelimiter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' kw= 'And' ) ;
    public final AntlrDatatypeRuleToken ruleSublistenerDelimiter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRoboProse.g:399:2: ( (kw= '.' kw= 'And' ) )
            // InternalRoboProse.g:400:2: (kw= '.' kw= 'And' )
            {
            // InternalRoboProse.g:400:2: (kw= '.' kw= 'And' )
            // InternalRoboProse.g:401:3: kw= '.' kw= 'And'
            {
            kw=(Token)match(input,14,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSublistenerDelimiterAccess().getFullStopKeyword_0());
            		
            kw=(Token)match(input,21,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSublistenerDelimiterAccess().getAndKeyword_1());
            		

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
    // $ANTLR end "ruleSublistenerDelimiter"


    // $ANTLR start "entryRuleActionDelimiter"
    // InternalRoboProse.g:415:1: entryRuleActionDelimiter returns [String current=null] : iv_ruleActionDelimiter= ruleActionDelimiter EOF ;
    public final String entryRuleActionDelimiter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActionDelimiter = null;


        try {
            // InternalRoboProse.g:415:55: (iv_ruleActionDelimiter= ruleActionDelimiter EOF )
            // InternalRoboProse.g:416:2: iv_ruleActionDelimiter= ruleActionDelimiter EOF
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
    // InternalRoboProse.g:422:1: ruleActionDelimiter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'and' kw= 'then' ) | (kw= ',' kw= 'then' ) | (kw= '.' kw= 'Then' ) ) (kw= 'it' kw= 'should' )? ) ;
    public final AntlrDatatypeRuleToken ruleActionDelimiter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRoboProse.g:428:2: ( ( ( (kw= 'and' kw= 'then' ) | (kw= ',' kw= 'then' ) | (kw= '.' kw= 'Then' ) ) (kw= 'it' kw= 'should' )? ) )
            // InternalRoboProse.g:429:2: ( ( (kw= 'and' kw= 'then' ) | (kw= ',' kw= 'then' ) | (kw= '.' kw= 'Then' ) ) (kw= 'it' kw= 'should' )? )
            {
            // InternalRoboProse.g:429:2: ( ( (kw= 'and' kw= 'then' ) | (kw= ',' kw= 'then' ) | (kw= '.' kw= 'Then' ) ) (kw= 'it' kw= 'should' )? )
            // InternalRoboProse.g:430:3: ( (kw= 'and' kw= 'then' ) | (kw= ',' kw= 'then' ) | (kw= '.' kw= 'Then' ) ) (kw= 'it' kw= 'should' )?
            {
            // InternalRoboProse.g:430:3: ( (kw= 'and' kw= 'then' ) | (kw= ',' kw= 'then' ) | (kw= '.' kw= 'Then' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRoboProse.g:431:4: (kw= 'and' kw= 'then' )
                    {
                    // InternalRoboProse.g:431:4: (kw= 'and' kw= 'then' )
                    // InternalRoboProse.g:432:5: kw= 'and' kw= 'then'
                    {
                    kw=(Token)match(input,22,FOLLOW_16); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getAndKeyword_0_0_0());
                    				
                    kw=(Token)match(input,23,FOLLOW_17); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getThenKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:444:4: (kw= ',' kw= 'then' )
                    {
                    // InternalRoboProse.g:444:4: (kw= ',' kw= 'then' )
                    // InternalRoboProse.g:445:5: kw= ',' kw= 'then'
                    {
                    kw=(Token)match(input,24,FOLLOW_16); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getCommaKeyword_0_1_0());
                    				
                    kw=(Token)match(input,23,FOLLOW_17); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getThenKeyword_0_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalRoboProse.g:457:4: (kw= '.' kw= 'Then' )
                    {
                    // InternalRoboProse.g:457:4: (kw= '.' kw= 'Then' )
                    // InternalRoboProse.g:458:5: kw= '.' kw= 'Then'
                    {
                    kw=(Token)match(input,14,FOLLOW_18); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getFullStopKeyword_0_2_0());
                    				
                    kw=(Token)match(input,25,FOLLOW_17); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getThenKeyword_0_2_1());
                    				

                    }


                    }
                    break;

            }

            // InternalRoboProse.g:470:3: (kw= 'it' kw= 'should' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRoboProse.g:471:4: kw= 'it' kw= 'should'
                    {
                    kw=(Token)match(input,17,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getItKeyword_1_0());
                    			
                    kw=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAction"
    // InternalRoboProse.g:486:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalRoboProse.g:486:47: (iv_ruleAction= ruleAction EOF )
            // InternalRoboProse.g:487:2: iv_ruleAction= ruleAction EOF
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
    // InternalRoboProse.g:493:1: ruleAction returns [EObject current=null] : (this_Move_0= ruleMove | this_Turn_1= ruleTurn | this_Stop_2= ruleStop | this_Repeat_3= ruleRepeat ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Move_0 = null;

        EObject this_Turn_1 = null;

        EObject this_Stop_2 = null;

        EObject this_Repeat_3 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:499:2: ( (this_Move_0= ruleMove | this_Turn_1= ruleTurn | this_Stop_2= ruleStop | this_Repeat_3= ruleRepeat ) )
            // InternalRoboProse.g:500:2: (this_Move_0= ruleMove | this_Turn_1= ruleTurn | this_Stop_2= ruleStop | this_Repeat_3= ruleRepeat )
            {
            // InternalRoboProse.g:500:2: (this_Move_0= ruleMove | this_Turn_1= ruleTurn | this_Stop_2= ruleStop | this_Repeat_3= ruleRepeat )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case 29:
                {
                alt9=2;
                }
                break;
            case 31:
                {
                alt9=3;
                }
                break;
            case 49:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRoboProse.g:501:3: this_Move_0= ruleMove
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
                    // InternalRoboProse.g:510:3: this_Turn_1= ruleTurn
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
                    // InternalRoboProse.g:519:3: this_Stop_2= ruleStop
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getStopParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Stop_2=ruleStop();

                    state._fsp--;


                    			current = this_Stop_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRoboProse.g:528:3: this_Repeat_3= ruleRepeat
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getRepeatParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Repeat_3=ruleRepeat();

                    state._fsp--;


                    			current = this_Repeat_3;
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
    // InternalRoboProse.g:540:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalRoboProse.g:540:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalRoboProse.g:541:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalRoboProse.g:547:1: ruleEvent returns [EObject current=null] : (this_Obstacle_0= ruleObstacle | this_Tapped_1= ruleTapped ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_Obstacle_0 = null;

        EObject this_Tapped_1 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:553:2: ( (this_Obstacle_0= ruleObstacle | this_Tapped_1= ruleTapped ) )
            // InternalRoboProse.g:554:2: (this_Obstacle_0= ruleObstacle | this_Tapped_1= ruleTapped )
            {
            // InternalRoboProse.g:554:2: (this_Obstacle_0= ruleObstacle | this_Tapped_1= ruleTapped )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            else if ( (LA10_0==38) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRoboProse.g:555:3: this_Obstacle_0= ruleObstacle
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
                    // InternalRoboProse.g:564:3: this_Tapped_1= ruleTapped
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
    // InternalRoboProse.g:576:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalRoboProse.g:576:45: (iv_ruleMove= ruleMove EOF )
            // InternalRoboProse.g:577:2: iv_ruleMove= ruleMove EOF
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
    // InternalRoboProse.g:583:1: ruleMove returns [EObject current=null] : ( () otherlv_1= 'move' ( (lv_direction_2_0= ruleMOVE_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( (lv_isRandom_6_0= ruleRANDOM ) ) )? ) ;
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
            // InternalRoboProse.g:589:2: ( ( () otherlv_1= 'move' ( (lv_direction_2_0= ruleMOVE_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( (lv_isRandom_6_0= ruleRANDOM ) ) )? ) )
            // InternalRoboProse.g:590:2: ( () otherlv_1= 'move' ( (lv_direction_2_0= ruleMOVE_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( (lv_isRandom_6_0= ruleRANDOM ) ) )? )
            {
            // InternalRoboProse.g:590:2: ( () otherlv_1= 'move' ( (lv_direction_2_0= ruleMOVE_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( (lv_isRandom_6_0= ruleRANDOM ) ) )? )
            // InternalRoboProse.g:591:3: () otherlv_1= 'move' ( (lv_direction_2_0= ruleMOVE_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( (lv_isRandom_6_0= ruleRANDOM ) ) )?
            {
            // InternalRoboProse.g:591:3: ()
            // InternalRoboProse.g:592:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveAccess().getMoveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getMoveKeyword_1());
            		
            // InternalRoboProse.g:602:3: ( (lv_direction_2_0= ruleMOVE_DIRECTION ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=40 && LA11_0<=44)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRoboProse.g:603:4: (lv_direction_2_0= ruleMOVE_DIRECTION )
                    {
                    // InternalRoboProse.g:603:4: (lv_direction_2_0= ruleMOVE_DIRECTION )
                    // InternalRoboProse.g:604:5: lv_direction_2_0= ruleMOVE_DIRECTION
                    {

                    					newCompositeNode(grammarAccess.getMoveAccess().getDirectionMOVE_DIRECTIONEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_20);
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

            // InternalRoboProse.g:621:3: ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( (lv_isRandom_6_0= ruleRANDOM ) ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=47 && LA12_0<=48)) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // InternalRoboProse.g:622:4: (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' )
                    {
                    // InternalRoboProse.g:622:4: (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' )
                    // InternalRoboProse.g:623:5: otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_21); 

                    					newLeafNode(otherlv_3, grammarAccess.getMoveAccess().getForKeyword_3_0_0());
                    				
                    // InternalRoboProse.g:627:5: ( (lv_duration_4_0= ruleEFloat ) )
                    // InternalRoboProse.g:628:6: (lv_duration_4_0= ruleEFloat )
                    {
                    // InternalRoboProse.g:628:6: (lv_duration_4_0= ruleEFloat )
                    // InternalRoboProse.g:629:7: lv_duration_4_0= ruleEFloat
                    {

                    							newCompositeNode(grammarAccess.getMoveAccess().getDurationEFloatParserRuleCall_3_0_1_0());
                    						
                    pushFollow(FOLLOW_22);
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
                    // InternalRoboProse.g:652:4: ( (lv_isRandom_6_0= ruleRANDOM ) )
                    {
                    // InternalRoboProse.g:652:4: ( (lv_isRandom_6_0= ruleRANDOM ) )
                    // InternalRoboProse.g:653:5: (lv_isRandom_6_0= ruleRANDOM )
                    {
                    // InternalRoboProse.g:653:5: (lv_isRandom_6_0= ruleRANDOM )
                    // InternalRoboProse.g:654:6: lv_isRandom_6_0= ruleRANDOM
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
    // InternalRoboProse.g:676:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalRoboProse.g:676:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalRoboProse.g:677:2: iv_ruleTurn= ruleTurn EOF
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
    // InternalRoboProse.g:683:1: ruleTurn returns [EObject current=null] : ( () otherlv_1= 'turn' ( (lv_direction_2_0= ruleTURN_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( ( (lv_degrees_6_0= ruleEFloat ) ) otherlv_7= 'degrees' ) | ( (lv_isRandom_8_0= ruleRANDOM ) ) )? ) ;
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
            // InternalRoboProse.g:689:2: ( ( () otherlv_1= 'turn' ( (lv_direction_2_0= ruleTURN_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( ( (lv_degrees_6_0= ruleEFloat ) ) otherlv_7= 'degrees' ) | ( (lv_isRandom_8_0= ruleRANDOM ) ) )? ) )
            // InternalRoboProse.g:690:2: ( () otherlv_1= 'turn' ( (lv_direction_2_0= ruleTURN_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( ( (lv_degrees_6_0= ruleEFloat ) ) otherlv_7= 'degrees' ) | ( (lv_isRandom_8_0= ruleRANDOM ) ) )? )
            {
            // InternalRoboProse.g:690:2: ( () otherlv_1= 'turn' ( (lv_direction_2_0= ruleTURN_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( ( (lv_degrees_6_0= ruleEFloat ) ) otherlv_7= 'degrees' ) | ( (lv_isRandom_8_0= ruleRANDOM ) ) )? )
            // InternalRoboProse.g:691:3: () otherlv_1= 'turn' ( (lv_direction_2_0= ruleTURN_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( ( (lv_degrees_6_0= ruleEFloat ) ) otherlv_7= 'degrees' ) | ( (lv_isRandom_8_0= ruleRANDOM ) ) )?
            {
            // InternalRoboProse.g:691:3: ()
            // InternalRoboProse.g:692:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTurnAccess().getTurnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnAccess().getTurnKeyword_1());
            		
            // InternalRoboProse.g:702:3: ( (lv_direction_2_0= ruleTURN_DIRECTION ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=45 && LA13_0<=46)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRoboProse.g:703:4: (lv_direction_2_0= ruleTURN_DIRECTION )
                    {
                    // InternalRoboProse.g:703:4: (lv_direction_2_0= ruleTURN_DIRECTION )
                    // InternalRoboProse.g:704:5: lv_direction_2_0= ruleTURN_DIRECTION
                    {

                    					newCompositeNode(grammarAccess.getTurnAccess().getDirectionTURN_DIRECTIONEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_24);
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

            // InternalRoboProse.g:721:3: ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' ) | ( ( (lv_degrees_6_0= ruleEFloat ) ) otherlv_7= 'degrees' ) | ( (lv_isRandom_8_0= ruleRANDOM ) ) )?
            int alt14=4;
            switch ( input.LA(1) ) {
                case 27:
                    {
                    alt14=1;
                    }
                    break;
                case RULE_INT:
                case 32:
                    {
                    alt14=2;
                    }
                    break;
                case 14:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (LA14_3==RULE_INT) ) {
                        alt14=2;
                    }
                    }
                    break;
                case 47:
                case 48:
                    {
                    alt14=3;
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // InternalRoboProse.g:722:4: (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' )
                    {
                    // InternalRoboProse.g:722:4: (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds' )
                    // InternalRoboProse.g:723:5: otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) otherlv_5= 'seconds'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_21); 

                    					newLeafNode(otherlv_3, grammarAccess.getTurnAccess().getForKeyword_3_0_0());
                    				
                    // InternalRoboProse.g:727:5: ( (lv_duration_4_0= ruleEFloat ) )
                    // InternalRoboProse.g:728:6: (lv_duration_4_0= ruleEFloat )
                    {
                    // InternalRoboProse.g:728:6: (lv_duration_4_0= ruleEFloat )
                    // InternalRoboProse.g:729:7: lv_duration_4_0= ruleEFloat
                    {

                    							newCompositeNode(grammarAccess.getTurnAccess().getDurationEFloatParserRuleCall_3_0_1_0());
                    						
                    pushFollow(FOLLOW_22);
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
                    // InternalRoboProse.g:752:4: ( ( (lv_degrees_6_0= ruleEFloat ) ) otherlv_7= 'degrees' )
                    {
                    // InternalRoboProse.g:752:4: ( ( (lv_degrees_6_0= ruleEFloat ) ) otherlv_7= 'degrees' )
                    // InternalRoboProse.g:753:5: ( (lv_degrees_6_0= ruleEFloat ) ) otherlv_7= 'degrees'
                    {
                    // InternalRoboProse.g:753:5: ( (lv_degrees_6_0= ruleEFloat ) )
                    // InternalRoboProse.g:754:6: (lv_degrees_6_0= ruleEFloat )
                    {
                    // InternalRoboProse.g:754:6: (lv_degrees_6_0= ruleEFloat )
                    // InternalRoboProse.g:755:7: lv_degrees_6_0= ruleEFloat
                    {

                    							newCompositeNode(grammarAccess.getTurnAccess().getDegreesEFloatParserRuleCall_3_1_0_0());
                    						
                    pushFollow(FOLLOW_25);
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
                    // InternalRoboProse.g:778:4: ( (lv_isRandom_8_0= ruleRANDOM ) )
                    {
                    // InternalRoboProse.g:778:4: ( (lv_isRandom_8_0= ruleRANDOM ) )
                    // InternalRoboProse.g:779:5: (lv_isRandom_8_0= ruleRANDOM )
                    {
                    // InternalRoboProse.g:779:5: (lv_isRandom_8_0= ruleRANDOM )
                    // InternalRoboProse.g:780:6: lv_isRandom_8_0= ruleRANDOM
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
    // InternalRoboProse.g:802:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // InternalRoboProse.g:802:45: (iv_ruleStop= ruleStop EOF )
            // InternalRoboProse.g:803:2: iv_ruleStop= ruleStop EOF
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
    // InternalRoboProse.g:809:1: ruleStop returns [EObject current=null] : ( () otherlv_1= 'stop' (otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds' )? ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_duration_3_0 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:815:2: ( ( () otherlv_1= 'stop' (otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds' )? ) )
            // InternalRoboProse.g:816:2: ( () otherlv_1= 'stop' (otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds' )? )
            {
            // InternalRoboProse.g:816:2: ( () otherlv_1= 'stop' (otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds' )? )
            // InternalRoboProse.g:817:3: () otherlv_1= 'stop' (otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds' )?
            {
            // InternalRoboProse.g:817:3: ()
            // InternalRoboProse.g:818:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStopAccess().getStopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getStopAccess().getStopKeyword_1());
            		
            // InternalRoboProse.g:828:3: (otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRoboProse.g:829:4: otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getStopAccess().getForKeyword_2_0());
                    			
                    // InternalRoboProse.g:833:4: ( (lv_duration_3_0= ruleEFloat ) )
                    // InternalRoboProse.g:834:5: (lv_duration_3_0= ruleEFloat )
                    {
                    // InternalRoboProse.g:834:5: (lv_duration_3_0= ruleEFloat )
                    // InternalRoboProse.g:835:6: lv_duration_3_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getStopAccess().getDurationEFloatParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_22);
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


    // $ANTLR start "entryRuleRepeat"
    // InternalRoboProse.g:861:1: entryRuleRepeat returns [EObject current=null] : iv_ruleRepeat= ruleRepeat EOF ;
    public final EObject entryRuleRepeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeat = null;


        try {
            // InternalRoboProse.g:861:47: (iv_ruleRepeat= ruleRepeat EOF )
            // InternalRoboProse.g:862:2: iv_ruleRepeat= ruleRepeat EOF
            {
             newCompositeNode(grammarAccess.getRepeatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepeat=ruleRepeat();

            state._fsp--;

             current =iv_ruleRepeat; 
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
    // $ANTLR end "entryRuleRepeat"


    // $ANTLR start "ruleRepeat"
    // InternalRoboProse.g:868:1: ruleRepeat returns [EObject current=null] : ( () ( (lv_shouldRepeat_1_0= ruleSHOULD_REPEAT ) ) ) ;
    public final EObject ruleRepeat() throws RecognitionException {
        EObject current = null;

        Enumerator lv_shouldRepeat_1_0 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:874:2: ( ( () ( (lv_shouldRepeat_1_0= ruleSHOULD_REPEAT ) ) ) )
            // InternalRoboProse.g:875:2: ( () ( (lv_shouldRepeat_1_0= ruleSHOULD_REPEAT ) ) )
            {
            // InternalRoboProse.g:875:2: ( () ( (lv_shouldRepeat_1_0= ruleSHOULD_REPEAT ) ) )
            // InternalRoboProse.g:876:3: () ( (lv_shouldRepeat_1_0= ruleSHOULD_REPEAT ) )
            {
            // InternalRoboProse.g:876:3: ()
            // InternalRoboProse.g:877:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepeatAccess().getRepeatAction_0(),
            					current);
            			

            }

            // InternalRoboProse.g:883:3: ( (lv_shouldRepeat_1_0= ruleSHOULD_REPEAT ) )
            // InternalRoboProse.g:884:4: (lv_shouldRepeat_1_0= ruleSHOULD_REPEAT )
            {
            // InternalRoboProse.g:884:4: (lv_shouldRepeat_1_0= ruleSHOULD_REPEAT )
            // InternalRoboProse.g:885:5: lv_shouldRepeat_1_0= ruleSHOULD_REPEAT
            {

            					newCompositeNode(grammarAccess.getRepeatAccess().getShouldRepeatSHOULD_REPEATEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_shouldRepeat_1_0=ruleSHOULD_REPEAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatRule());
            					}
            					set(
            						current,
            						"shouldRepeat",
            						lv_shouldRepeat_1_0,
            						"dk.itu.dsl.roboprose.RoboProse.SHOULD_REPEAT");
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
    // $ANTLR end "ruleRepeat"


    // $ANTLR start "entryRuleEFloat"
    // InternalRoboProse.g:906:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalRoboProse.g:906:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalRoboProse.g:907:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalRoboProse.g:913:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalRoboProse.g:919:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalRoboProse.g:920:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalRoboProse.g:920:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalRoboProse.g:921:3: (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalRoboProse.g:921:3: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRoboProse.g:922:4: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_27); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalRoboProse.g:928:3: (this_INT_1= RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_INT||LA17_1==14) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalRoboProse.g:929:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_27); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalRoboProse.g:937:3: (kw= '.' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRoboProse.g:938:4: kw= '.'
                    {
                    kw=(Token)match(input,14,FOLLOW_28); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
                    			

                    }
                    break;

            }

            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_29); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalRoboProse.g:951:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=33 && LA21_0<=34)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRoboProse.g:952:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalRoboProse.g:952:4: (kw= 'E' | kw= 'e' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==33) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==34) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalRoboProse.g:953:5: kw= 'E'
                            {
                            kw=(Token)match(input,33,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalRoboProse.g:959:5: kw= 'e'
                            {
                            kw=(Token)match(input,34,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalRoboProse.g:965:4: (kw= '-' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==32) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalRoboProse.g:966:5: kw= '-'
                            {
                            kw=(Token)match(input,32,FOLLOW_28); 

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
    // InternalRoboProse.g:984:1: entryRuleObstacle returns [EObject current=null] : iv_ruleObstacle= ruleObstacle EOF ;
    public final EObject entryRuleObstacle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacle = null;


        try {
            // InternalRoboProse.g:984:49: (iv_ruleObstacle= ruleObstacle EOF )
            // InternalRoboProse.g:985:2: iv_ruleObstacle= ruleObstacle EOF
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
    // InternalRoboProse.g:991:1: ruleObstacle returns [EObject current=null] : ( () otherlv_1= 'meets' otherlv_2= 'an' otherlv_3= 'obstacle' ) ;
    public final EObject ruleObstacle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRoboProse.g:997:2: ( ( () otherlv_1= 'meets' otherlv_2= 'an' otherlv_3= 'obstacle' ) )
            // InternalRoboProse.g:998:2: ( () otherlv_1= 'meets' otherlv_2= 'an' otherlv_3= 'obstacle' )
            {
            // InternalRoboProse.g:998:2: ( () otherlv_1= 'meets' otherlv_2= 'an' otherlv_3= 'obstacle' )
            // InternalRoboProse.g:999:3: () otherlv_1= 'meets' otherlv_2= 'an' otherlv_3= 'obstacle'
            {
            // InternalRoboProse.g:999:3: ()
            // InternalRoboProse.g:1000:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObstacleAccess().getObstacleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getObstacleAccess().getMeetsKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_32); 

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
    // InternalRoboProse.g:1022:1: entryRuleTapped returns [EObject current=null] : iv_ruleTapped= ruleTapped EOF ;
    public final EObject entryRuleTapped() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTapped = null;


        try {
            // InternalRoboProse.g:1022:47: (iv_ruleTapped= ruleTapped EOF )
            // InternalRoboProse.g:1023:2: iv_ruleTapped= ruleTapped EOF
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
    // InternalRoboProse.g:1029:1: ruleTapped returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'tapped' ) ;
    public final EObject ruleTapped() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRoboProse.g:1035:2: ( ( () otherlv_1= 'is' otherlv_2= 'tapped' ) )
            // InternalRoboProse.g:1036:2: ( () otherlv_1= 'is' otherlv_2= 'tapped' )
            {
            // InternalRoboProse.g:1036:2: ( () otherlv_1= 'is' otherlv_2= 'tapped' )
            // InternalRoboProse.g:1037:3: () otherlv_1= 'is' otherlv_2= 'tapped'
            {
            // InternalRoboProse.g:1037:3: ()
            // InternalRoboProse.g:1038:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTappedAccess().getTappedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_33); 

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
    // InternalRoboProse.g:1056:1: ruleMOVE_DIRECTION returns [Enumerator current=null] : ( (enumLiteral_0= 'forwards' ) | (enumLiteral_1= 'forward' ) | (enumLiteral_2= 'backwards' ) | (enumLiteral_3= 'backward' ) | (enumLiteral_4= 'back' ) ) ;
    public final Enumerator ruleMOVE_DIRECTION() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRoboProse.g:1062:2: ( ( (enumLiteral_0= 'forwards' ) | (enumLiteral_1= 'forward' ) | (enumLiteral_2= 'backwards' ) | (enumLiteral_3= 'backward' ) | (enumLiteral_4= 'back' ) ) )
            // InternalRoboProse.g:1063:2: ( (enumLiteral_0= 'forwards' ) | (enumLiteral_1= 'forward' ) | (enumLiteral_2= 'backwards' ) | (enumLiteral_3= 'backward' ) | (enumLiteral_4= 'back' ) )
            {
            // InternalRoboProse.g:1063:2: ( (enumLiteral_0= 'forwards' ) | (enumLiteral_1= 'forward' ) | (enumLiteral_2= 'backwards' ) | (enumLiteral_3= 'backward' ) | (enumLiteral_4= 'back' ) )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt22=1;
                }
                break;
            case 41:
                {
                alt22=2;
                }
                break;
            case 42:
                {
                alt22=3;
                }
                break;
            case 43:
                {
                alt22=4;
                }
                break;
            case 44:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalRoboProse.g:1064:3: (enumLiteral_0= 'forwards' )
                    {
                    // InternalRoboProse.g:1064:3: (enumLiteral_0= 'forwards' )
                    // InternalRoboProse.g:1065:4: enumLiteral_0= 'forwards'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:1072:3: (enumLiteral_1= 'forward' )
                    {
                    // InternalRoboProse.g:1072:3: (enumLiteral_1= 'forward' )
                    // InternalRoboProse.g:1073:4: enumLiteral_1= 'forward'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRoboProse.g:1080:3: (enumLiteral_2= 'backwards' )
                    {
                    // InternalRoboProse.g:1080:3: (enumLiteral_2= 'backwards' )
                    // InternalRoboProse.g:1081:4: enumLiteral_2= 'backwards'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRoboProse.g:1088:3: (enumLiteral_3= 'backward' )
                    {
                    // InternalRoboProse.g:1088:3: (enumLiteral_3= 'backward' )
                    // InternalRoboProse.g:1089:4: enumLiteral_3= 'backward'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRoboProse.g:1096:3: (enumLiteral_4= 'back' )
                    {
                    // InternalRoboProse.g:1096:3: (enumLiteral_4= 'back' )
                    // InternalRoboProse.g:1097:4: enumLiteral_4= 'back'
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
    // InternalRoboProse.g:1107:1: ruleTURN_DIRECTION returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) ;
    public final Enumerator ruleTURN_DIRECTION() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRoboProse.g:1113:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) )
            // InternalRoboProse.g:1114:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            {
            // InternalRoboProse.g:1114:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            else if ( (LA23_0==46) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalRoboProse.g:1115:3: (enumLiteral_0= 'left' )
                    {
                    // InternalRoboProse.g:1115:3: (enumLiteral_0= 'left' )
                    // InternalRoboProse.g:1116:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTURN_DIRECTIONAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTURN_DIRECTIONAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:1123:3: (enumLiteral_1= 'right' )
                    {
                    // InternalRoboProse.g:1123:3: (enumLiteral_1= 'right' )
                    // InternalRoboProse.g:1124:4: enumLiteral_1= 'right'
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
    // InternalRoboProse.g:1134:1: ruleRANDOM returns [Enumerator current=null] : ( (enumLiteral_0= 'randomly' ) | (enumLiteral_1= 'random' ) ) ;
    public final Enumerator ruleRANDOM() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRoboProse.g:1140:2: ( ( (enumLiteral_0= 'randomly' ) | (enumLiteral_1= 'random' ) ) )
            // InternalRoboProse.g:1141:2: ( (enumLiteral_0= 'randomly' ) | (enumLiteral_1= 'random' ) )
            {
            // InternalRoboProse.g:1141:2: ( (enumLiteral_0= 'randomly' ) | (enumLiteral_1= 'random' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==47) ) {
                alt24=1;
            }
            else if ( (LA24_0==48) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalRoboProse.g:1142:3: (enumLiteral_0= 'randomly' )
                    {
                    // InternalRoboProse.g:1142:3: (enumLiteral_0= 'randomly' )
                    // InternalRoboProse.g:1143:4: enumLiteral_0= 'randomly'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getRANDOMAccess().getRANDOMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRANDOMAccess().getRANDOMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:1150:3: (enumLiteral_1= 'random' )
                    {
                    // InternalRoboProse.g:1150:3: (enumLiteral_1= 'random' )
                    // InternalRoboProse.g:1151:4: enumLiteral_1= 'random'
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


    // $ANTLR start "ruleSHOULD_REPEAT"
    // InternalRoboProse.g:1161:1: ruleSHOULD_REPEAT returns [Enumerator current=null] : (enumLiteral_0= 'repeat' ) ;
    public final Enumerator ruleSHOULD_REPEAT() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalRoboProse.g:1167:2: ( (enumLiteral_0= 'repeat' ) )
            // InternalRoboProse.g:1168:2: (enumLiteral_0= 'repeat' )
            {
            // InternalRoboProse.g:1168:2: (enumLiteral_0= 'repeat' )
            // InternalRoboProse.g:1169:3: enumLiteral_0= 'repeat'
            {
            enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

            			current = grammarAccess.getSHOULD_REPEATAccess().getDO_REPEATEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getSHOULD_REPEATAccess().getDO_REPEATEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleSHOULD_REPEAT"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00020000A4000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001404002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001444002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00019F0008000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001800008000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100004010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001E00108004012L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001800108004012L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});

}