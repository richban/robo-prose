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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'My'", "'robot'", "'should'", "'.'", "'When'", "'when'", "'it'", "'('", "'but'", "')'", "'And'", "'and'", "'then'", "','", "'Then'", "'move'", "'for'", "'second'", "'seconds'", "'turn'", "'degrees'", "'stop'", "'randomly'", "'random'", "'repeat'", "'start'", "'over'", "'wait'", "'-'", "'E'", "'e'", "'meets'", "'an'", "'obstacle'", "'is'", "'tapped'", "'forwards'", "'forward'", "'backwards'", "'backward'", "'back'", "'left'", "'right'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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
    // InternalRoboProse.g:158:1: ruleMain returns [EObject current=null] : ( ( (lv_actions_0_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) ) )* ( ruleActionDelimiter ( (lv_ending_4_0= ruleEnding ) ) )? ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_0_0 = null;

        EObject lv_actions_2_0 = null;

        EObject lv_ending_4_0 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:164:2: ( ( ( (lv_actions_0_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) ) )* ( ruleActionDelimiter ( (lv_ending_4_0= ruleEnding ) ) )? ) )
            // InternalRoboProse.g:165:2: ( ( (lv_actions_0_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) ) )* ( ruleActionDelimiter ( (lv_ending_4_0= ruleEnding ) ) )? )
            {
            // InternalRoboProse.g:165:2: ( ( (lv_actions_0_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) ) )* ( ruleActionDelimiter ( (lv_ending_4_0= ruleEnding ) ) )? )
            // InternalRoboProse.g:166:3: ( (lv_actions_0_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) ) )* ( ruleActionDelimiter ( (lv_ending_4_0= ruleEnding ) ) )?
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
                alt2 = dfa2.predict(input);
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

            // InternalRoboProse.g:213:3: ( ruleActionDelimiter ( (lv_ending_4_0= ruleEnding ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22||LA3_0==24) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==25) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // InternalRoboProse.g:214:4: ruleActionDelimiter ( (lv_ending_4_0= ruleEnding ) )
                    {

                    				newCompositeNode(grammarAccess.getMainAccess().getActionDelimiterParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_9);
                    ruleActionDelimiter();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalRoboProse.g:221:4: ( (lv_ending_4_0= ruleEnding ) )
                    // InternalRoboProse.g:222:5: (lv_ending_4_0= ruleEnding )
                    {
                    // InternalRoboProse.g:222:5: (lv_ending_4_0= ruleEnding )
                    // InternalRoboProse.g:223:6: lv_ending_4_0= ruleEnding
                    {

                    						newCompositeNode(grammarAccess.getMainAccess().getEndingEndingParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_ending_4_0=ruleEnding();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMainRule());
                    						}
                    						set(
                    							current,
                    							"ending",
                    							lv_ending_4_0,
                    							"dk.itu.dsl.roboprose.RoboProse.Ending");
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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleEventListener"
    // InternalRoboProse.g:245:1: entryRuleEventListener returns [EObject current=null] : iv_ruleEventListener= ruleEventListener EOF ;
    public final EObject entryRuleEventListener() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventListener = null;


        try {
            // InternalRoboProse.g:245:54: (iv_ruleEventListener= ruleEventListener EOF )
            // InternalRoboProse.g:246:2: iv_ruleEventListener= ruleEventListener EOF
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
    // InternalRoboProse.g:252:1: ruleEventListener returns [EObject current=null] : ( (otherlv_0= 'When' | otherlv_1= 'when' ) otherlv_2= 'it' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'it' otherlv_5= 'should' ( (lv_actions_6_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) ) )* ( ruleActionDelimiter ( (lv_ending_10_0= ruleEnding ) ) )? (otherlv_11= '(' otherlv_12= 'but' ( (lv_sublisteners_13_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_15_0= ruleEventListener ) ) )* otherlv_16= ')' )? ) ;
    public final EObject ruleEventListener() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_16=null;
        EObject lv_event_3_0 = null;

        EObject lv_actions_6_0 = null;

        EObject lv_actions_8_0 = null;

        EObject lv_ending_10_0 = null;

        EObject lv_sublisteners_13_0 = null;

        EObject lv_sublisteners_15_0 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:258:2: ( ( (otherlv_0= 'When' | otherlv_1= 'when' ) otherlv_2= 'it' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'it' otherlv_5= 'should' ( (lv_actions_6_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) ) )* ( ruleActionDelimiter ( (lv_ending_10_0= ruleEnding ) ) )? (otherlv_11= '(' otherlv_12= 'but' ( (lv_sublisteners_13_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_15_0= ruleEventListener ) ) )* otherlv_16= ')' )? ) )
            // InternalRoboProse.g:259:2: ( (otherlv_0= 'When' | otherlv_1= 'when' ) otherlv_2= 'it' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'it' otherlv_5= 'should' ( (lv_actions_6_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) ) )* ( ruleActionDelimiter ( (lv_ending_10_0= ruleEnding ) ) )? (otherlv_11= '(' otherlv_12= 'but' ( (lv_sublisteners_13_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_15_0= ruleEventListener ) ) )* otherlv_16= ')' )? )
            {
            // InternalRoboProse.g:259:2: ( (otherlv_0= 'When' | otherlv_1= 'when' ) otherlv_2= 'it' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'it' otherlv_5= 'should' ( (lv_actions_6_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) ) )* ( ruleActionDelimiter ( (lv_ending_10_0= ruleEnding ) ) )? (otherlv_11= '(' otherlv_12= 'but' ( (lv_sublisteners_13_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_15_0= ruleEventListener ) ) )* otherlv_16= ')' )? )
            // InternalRoboProse.g:260:3: (otherlv_0= 'When' | otherlv_1= 'when' ) otherlv_2= 'it' ( (lv_event_3_0= ruleEvent ) ) otherlv_4= 'it' otherlv_5= 'should' ( (lv_actions_6_0= ruleAction ) ) ( ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) ) )* ( ruleActionDelimiter ( (lv_ending_10_0= ruleEnding ) ) )? (otherlv_11= '(' otherlv_12= 'but' ( (lv_sublisteners_13_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_15_0= ruleEventListener ) ) )* otherlv_16= ')' )?
            {
            // InternalRoboProse.g:260:3: (otherlv_0= 'When' | otherlv_1= 'when' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRoboProse.g:261:4: otherlv_0= 'When'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getEventListenerAccess().getWhenKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:266:4: otherlv_1= 'when'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getEventListenerAccess().getWhenKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getEventListenerAccess().getItKeyword_1());
            		
            // InternalRoboProse.g:275:3: ( (lv_event_3_0= ruleEvent ) )
            // InternalRoboProse.g:276:4: (lv_event_3_0= ruleEvent )
            {
            // InternalRoboProse.g:276:4: (lv_event_3_0= ruleEvent )
            // InternalRoboProse.g:277:5: lv_event_3_0= ruleEvent
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

            otherlv_4=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getEventListenerAccess().getItKeyword_3());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getEventListenerAccess().getShouldKeyword_4());
            		
            // InternalRoboProse.g:302:3: ( (lv_actions_6_0= ruleAction ) )
            // InternalRoboProse.g:303:4: (lv_actions_6_0= ruleAction )
            {
            // InternalRoboProse.g:303:4: (lv_actions_6_0= ruleAction )
            // InternalRoboProse.g:304:5: lv_actions_6_0= ruleAction
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

            // InternalRoboProse.g:321:3: ( ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) ) )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalRoboProse.g:322:4: ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) )
            	    {

            	    				newCompositeNode(grammarAccess.getEventListenerAccess().getActionDelimiterParserRuleCall_6_0());
            	    			
            	    pushFollow(FOLLOW_5);
            	    ruleActionDelimiter();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalRoboProse.g:329:4: ( (lv_actions_8_0= ruleAction ) )
            	    // InternalRoboProse.g:330:5: (lv_actions_8_0= ruleAction )
            	    {
            	    // InternalRoboProse.g:330:5: (lv_actions_8_0= ruleAction )
            	    // InternalRoboProse.g:331:6: lv_actions_8_0= ruleAction
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
            	    break loop5;
                }
            } while (true);

            // InternalRoboProse.g:349:3: ( ruleActionDelimiter ( (lv_ending_10_0= ruleEnding ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22||LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==25) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalRoboProse.g:350:4: ruleActionDelimiter ( (lv_ending_10_0= ruleEnding ) )
                    {

                    				newCompositeNode(grammarAccess.getEventListenerAccess().getActionDelimiterParserRuleCall_7_0());
                    			
                    pushFollow(FOLLOW_9);
                    ruleActionDelimiter();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalRoboProse.g:357:4: ( (lv_ending_10_0= ruleEnding ) )
                    // InternalRoboProse.g:358:5: (lv_ending_10_0= ruleEnding )
                    {
                    // InternalRoboProse.g:358:5: (lv_ending_10_0= ruleEnding )
                    // InternalRoboProse.g:359:6: lv_ending_10_0= ruleEnding
                    {

                    						newCompositeNode(grammarAccess.getEventListenerAccess().getEndingEndingParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_ending_10_0=ruleEnding();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventListenerRule());
                    						}
                    						set(
                    							current,
                    							"ending",
                    							lv_ending_10_0,
                    							"dk.itu.dsl.roboprose.RoboProse.Ending");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRoboProse.g:377:3: (otherlv_11= '(' otherlv_12= 'but' ( (lv_sublisteners_13_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_15_0= ruleEventListener ) ) )* otherlv_16= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRoboProse.g:378:4: otherlv_11= '(' otherlv_12= 'but' ( (lv_sublisteners_13_0= ruleEventListener ) ) ( ruleSublistenerDelimiter ( (lv_sublisteners_15_0= ruleEventListener ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getEventListenerAccess().getLeftParenthesisKeyword_8_0());
                    			
                    otherlv_12=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_12, grammarAccess.getEventListenerAccess().getButKeyword_8_1());
                    			
                    // InternalRoboProse.g:386:4: ( (lv_sublisteners_13_0= ruleEventListener ) )
                    // InternalRoboProse.g:387:5: (lv_sublisteners_13_0= ruleEventListener )
                    {
                    // InternalRoboProse.g:387:5: (lv_sublisteners_13_0= ruleEventListener )
                    // InternalRoboProse.g:388:6: lv_sublisteners_13_0= ruleEventListener
                    {

                    						newCompositeNode(grammarAccess.getEventListenerAccess().getSublistenersEventListenerParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    // InternalRoboProse.g:405:4: ( ruleSublistenerDelimiter ( (lv_sublisteners_15_0= ruleEventListener ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRoboProse.g:406:5: ruleSublistenerDelimiter ( (lv_sublisteners_15_0= ruleEventListener ) )
                    	    {

                    	    					newCompositeNode(grammarAccess.getEventListenerAccess().getSublistenerDelimiterParserRuleCall_8_3_0());
                    	    				
                    	    pushFollow(FOLLOW_15);
                    	    ruleSublistenerDelimiter();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				
                    	    // InternalRoboProse.g:413:5: ( (lv_sublisteners_15_0= ruleEventListener ) )
                    	    // InternalRoboProse.g:414:6: (lv_sublisteners_15_0= ruleEventListener )
                    	    {
                    	    // InternalRoboProse.g:414:6: (lv_sublisteners_15_0= ruleEventListener )
                    	    // InternalRoboProse.g:415:7: lv_sublisteners_15_0= ruleEventListener
                    	    {

                    	    							newCompositeNode(grammarAccess.getEventListenerAccess().getSublistenersEventListenerParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_sublisteners_15_0=ruleEventListener();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEventListenerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sublisteners",
                    	    								lv_sublisteners_15_0,
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

                    otherlv_16=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getEventListenerAccess().getRightParenthesisKeyword_8_4());
                    			

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
    // InternalRoboProse.g:442:1: entryRuleSublistenerDelimiter returns [String current=null] : iv_ruleSublistenerDelimiter= ruleSublistenerDelimiter EOF ;
    public final String entryRuleSublistenerDelimiter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSublistenerDelimiter = null;


        try {
            // InternalRoboProse.g:442:60: (iv_ruleSublistenerDelimiter= ruleSublistenerDelimiter EOF )
            // InternalRoboProse.g:443:2: iv_ruleSublistenerDelimiter= ruleSublistenerDelimiter EOF
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
    // InternalRoboProse.g:449:1: ruleSublistenerDelimiter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' kw= 'And' ) ;
    public final AntlrDatatypeRuleToken ruleSublistenerDelimiter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRoboProse.g:455:2: ( (kw= '.' kw= 'And' ) )
            // InternalRoboProse.g:456:2: (kw= '.' kw= 'And' )
            {
            // InternalRoboProse.g:456:2: (kw= '.' kw= 'And' )
            // InternalRoboProse.g:457:3: kw= '.' kw= 'And'
            {
            kw=(Token)match(input,14,FOLLOW_17); 

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
    // InternalRoboProse.g:471:1: entryRuleActionDelimiter returns [String current=null] : iv_ruleActionDelimiter= ruleActionDelimiter EOF ;
    public final String entryRuleActionDelimiter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActionDelimiter = null;


        try {
            // InternalRoboProse.g:471:55: (iv_ruleActionDelimiter= ruleActionDelimiter EOF )
            // InternalRoboProse.g:472:2: iv_ruleActionDelimiter= ruleActionDelimiter EOF
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
    // InternalRoboProse.g:478:1: ruleActionDelimiter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'and' (kw= 'then' )? ) | (kw= ',' (kw= 'and' )? (kw= 'then' )? ) | (kw= '.' kw= 'Then' ) ) (kw= 'it' kw= 'should' )? ) ;
    public final AntlrDatatypeRuleToken ruleActionDelimiter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRoboProse.g:484:2: ( ( ( (kw= 'and' (kw= 'then' )? ) | (kw= ',' (kw= 'and' )? (kw= 'then' )? ) | (kw= '.' kw= 'Then' ) ) (kw= 'it' kw= 'should' )? ) )
            // InternalRoboProse.g:485:2: ( ( (kw= 'and' (kw= 'then' )? ) | (kw= ',' (kw= 'and' )? (kw= 'then' )? ) | (kw= '.' kw= 'Then' ) ) (kw= 'it' kw= 'should' )? )
            {
            // InternalRoboProse.g:485:2: ( ( (kw= 'and' (kw= 'then' )? ) | (kw= ',' (kw= 'and' )? (kw= 'then' )? ) | (kw= '.' kw= 'Then' ) ) (kw= 'it' kw= 'should' )? )
            // InternalRoboProse.g:486:3: ( (kw= 'and' (kw= 'then' )? ) | (kw= ',' (kw= 'and' )? (kw= 'then' )? ) | (kw= '.' kw= 'Then' ) ) (kw= 'it' kw= 'should' )?
            {
            // InternalRoboProse.g:486:3: ( (kw= 'and' (kw= 'then' )? ) | (kw= ',' (kw= 'and' )? (kw= 'then' )? ) | (kw= '.' kw= 'Then' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 14:
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
                    // InternalRoboProse.g:487:4: (kw= 'and' (kw= 'then' )? )
                    {
                    // InternalRoboProse.g:487:4: (kw= 'and' (kw= 'then' )? )
                    // InternalRoboProse.g:488:5: kw= 'and' (kw= 'then' )?
                    {
                    kw=(Token)match(input,22,FOLLOW_18); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getAndKeyword_0_0_0());
                    				
                    // InternalRoboProse.g:493:5: (kw= 'then' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==23) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRoboProse.g:494:6: kw= 'then'
                            {
                            kw=(Token)match(input,23,FOLLOW_19); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getThenKeyword_0_0_1());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:502:4: (kw= ',' (kw= 'and' )? (kw= 'then' )? )
                    {
                    // InternalRoboProse.g:502:4: (kw= ',' (kw= 'and' )? (kw= 'then' )? )
                    // InternalRoboProse.g:503:5: kw= ',' (kw= 'and' )? (kw= 'then' )?
                    {
                    kw=(Token)match(input,24,FOLLOW_20); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getCommaKeyword_0_1_0());
                    				
                    // InternalRoboProse.g:508:5: (kw= 'and' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==22) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalRoboProse.g:509:6: kw= 'and'
                            {
                            kw=(Token)match(input,22,FOLLOW_18); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getAndKeyword_0_1_1());
                            					

                            }
                            break;

                    }

                    // InternalRoboProse.g:515:5: (kw= 'then' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==23) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalRoboProse.g:516:6: kw= 'then'
                            {
                            kw=(Token)match(input,23,FOLLOW_19); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getThenKeyword_0_1_2());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRoboProse.g:524:4: (kw= '.' kw= 'Then' )
                    {
                    // InternalRoboProse.g:524:4: (kw= '.' kw= 'Then' )
                    // InternalRoboProse.g:525:5: kw= '.' kw= 'Then'
                    {
                    kw=(Token)match(input,14,FOLLOW_21); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getFullStopKeyword_0_2_0());
                    				
                    kw=(Token)match(input,25,FOLLOW_19); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getThenKeyword_0_2_1());
                    				

                    }


                    }
                    break;

            }

            // InternalRoboProse.g:537:3: (kw= 'it' kw= 'should' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRoboProse.g:538:4: kw= 'it' kw= 'should'
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
    // InternalRoboProse.g:553:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalRoboProse.g:553:47: (iv_ruleAction= ruleAction EOF )
            // InternalRoboProse.g:554:2: iv_ruleAction= ruleAction EOF
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
    // InternalRoboProse.g:560:1: ruleAction returns [EObject current=null] : (this_Move_0= ruleMove | this_Turn_1= ruleTurn | this_Stop_2= ruleStop ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Move_0 = null;

        EObject this_Turn_1 = null;

        EObject this_Stop_2 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:566:2: ( (this_Move_0= ruleMove | this_Turn_1= ruleTurn | this_Stop_2= ruleStop ) )
            // InternalRoboProse.g:567:2: (this_Move_0= ruleMove | this_Turn_1= ruleTurn | this_Stop_2= ruleStop )
            {
            // InternalRoboProse.g:567:2: (this_Move_0= ruleMove | this_Turn_1= ruleTurn | this_Stop_2= ruleStop )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt14=1;
                }
                break;
            case 30:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalRoboProse.g:568:3: this_Move_0= ruleMove
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
                    // InternalRoboProse.g:577:3: this_Turn_1= ruleTurn
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
                    // InternalRoboProse.g:586:3: this_Stop_2= ruleStop
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


    // $ANTLR start "entryRuleEnding"
    // InternalRoboProse.g:598:1: entryRuleEnding returns [EObject current=null] : iv_ruleEnding= ruleEnding EOF ;
    public final EObject entryRuleEnding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnding = null;


        try {
            // InternalRoboProse.g:598:47: (iv_ruleEnding= ruleEnding EOF )
            // InternalRoboProse.g:599:2: iv_ruleEnding= ruleEnding EOF
            {
             newCompositeNode(grammarAccess.getEndingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnding=ruleEnding();

            state._fsp--;

             current =iv_ruleEnding; 
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
    // $ANTLR end "entryRuleEnding"


    // $ANTLR start "ruleEnding"
    // InternalRoboProse.g:605:1: ruleEnding returns [EObject current=null] : (this_Repeat_0= ruleRepeat | this_StartOver_1= ruleStartOver | this_Wait_2= ruleWait ) ;
    public final EObject ruleEnding() throws RecognitionException {
        EObject current = null;

        EObject this_Repeat_0 = null;

        EObject this_StartOver_1 = null;

        EObject this_Wait_2 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:611:2: ( (this_Repeat_0= ruleRepeat | this_StartOver_1= ruleStartOver | this_Wait_2= ruleWait ) )
            // InternalRoboProse.g:612:2: (this_Repeat_0= ruleRepeat | this_StartOver_1= ruleStartOver | this_Wait_2= ruleWait )
            {
            // InternalRoboProse.g:612:2: (this_Repeat_0= ruleRepeat | this_StartOver_1= ruleStartOver | this_Wait_2= ruleWait )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt15=1;
                }
                break;
            case 36:
                {
                alt15=2;
                }
                break;
            case 38:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalRoboProse.g:613:3: this_Repeat_0= ruleRepeat
                    {

                    			newCompositeNode(grammarAccess.getEndingAccess().getRepeatParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Repeat_0=ruleRepeat();

                    state._fsp--;


                    			current = this_Repeat_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:622:3: this_StartOver_1= ruleStartOver
                    {

                    			newCompositeNode(grammarAccess.getEndingAccess().getStartOverParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StartOver_1=ruleStartOver();

                    state._fsp--;


                    			current = this_StartOver_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRoboProse.g:631:3: this_Wait_2= ruleWait
                    {

                    			newCompositeNode(grammarAccess.getEndingAccess().getWaitParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wait_2=ruleWait();

                    state._fsp--;


                    			current = this_Wait_2;
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
    // $ANTLR end "ruleEnding"


    // $ANTLR start "entryRuleEvent"
    // InternalRoboProse.g:643:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalRoboProse.g:643:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalRoboProse.g:644:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalRoboProse.g:650:1: ruleEvent returns [EObject current=null] : (this_Obstacle_0= ruleObstacle | this_Tapped_1= ruleTapped ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_Obstacle_0 = null;

        EObject this_Tapped_1 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:656:2: ( (this_Obstacle_0= ruleObstacle | this_Tapped_1= ruleTapped ) )
            // InternalRoboProse.g:657:2: (this_Obstacle_0= ruleObstacle | this_Tapped_1= ruleTapped )
            {
            // InternalRoboProse.g:657:2: (this_Obstacle_0= ruleObstacle | this_Tapped_1= ruleTapped )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==42) ) {
                alt16=1;
            }
            else if ( (LA16_0==45) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRoboProse.g:658:3: this_Obstacle_0= ruleObstacle
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
                    // InternalRoboProse.g:667:3: this_Tapped_1= ruleTapped
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
    // InternalRoboProse.g:679:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalRoboProse.g:679:45: (iv_ruleMove= ruleMove EOF )
            // InternalRoboProse.g:680:2: iv_ruleMove= ruleMove EOF
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
    // InternalRoboProse.g:686:1: ruleMove returns [EObject current=null] : ( () otherlv_1= 'move' ( (lv_direction_2_0= ruleMOVE_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) (otherlv_5= 'second' | otherlv_6= 'seconds' ) ) | ( (lv_isRandom_7_0= ruleRANDOM ) ) )? ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_direction_2_0 = null;

        AntlrDatatypeRuleToken lv_duration_4_0 = null;

        AntlrDatatypeRuleToken lv_isRandom_7_0 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:692:2: ( ( () otherlv_1= 'move' ( (lv_direction_2_0= ruleMOVE_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) (otherlv_5= 'second' | otherlv_6= 'seconds' ) ) | ( (lv_isRandom_7_0= ruleRANDOM ) ) )? ) )
            // InternalRoboProse.g:693:2: ( () otherlv_1= 'move' ( (lv_direction_2_0= ruleMOVE_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) (otherlv_5= 'second' | otherlv_6= 'seconds' ) ) | ( (lv_isRandom_7_0= ruleRANDOM ) ) )? )
            {
            // InternalRoboProse.g:693:2: ( () otherlv_1= 'move' ( (lv_direction_2_0= ruleMOVE_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) (otherlv_5= 'second' | otherlv_6= 'seconds' ) ) | ( (lv_isRandom_7_0= ruleRANDOM ) ) )? )
            // InternalRoboProse.g:694:3: () otherlv_1= 'move' ( (lv_direction_2_0= ruleMOVE_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) (otherlv_5= 'second' | otherlv_6= 'seconds' ) ) | ( (lv_isRandom_7_0= ruleRANDOM ) ) )?
            {
            // InternalRoboProse.g:694:3: ()
            // InternalRoboProse.g:695:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveAccess().getMoveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getMoveKeyword_1());
            		
            // InternalRoboProse.g:705:3: ( (lv_direction_2_0= ruleMOVE_DIRECTION ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=47 && LA17_0<=51)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRoboProse.g:706:4: (lv_direction_2_0= ruleMOVE_DIRECTION )
                    {
                    // InternalRoboProse.g:706:4: (lv_direction_2_0= ruleMOVE_DIRECTION )
                    // InternalRoboProse.g:707:5: lv_direction_2_0= ruleMOVE_DIRECTION
                    {

                    					newCompositeNode(grammarAccess.getMoveAccess().getDirectionMOVE_DIRECTIONEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_23);
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

            // InternalRoboProse.g:724:3: ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) (otherlv_5= 'second' | otherlv_6= 'seconds' ) ) | ( (lv_isRandom_7_0= ruleRANDOM ) ) )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=33 && LA19_0<=34)) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // InternalRoboProse.g:725:4: (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) (otherlv_5= 'second' | otherlv_6= 'seconds' ) )
                    {
                    // InternalRoboProse.g:725:4: (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) (otherlv_5= 'second' | otherlv_6= 'seconds' ) )
                    // InternalRoboProse.g:726:5: otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) (otherlv_5= 'second' | otherlv_6= 'seconds' )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_24); 

                    					newLeafNode(otherlv_3, grammarAccess.getMoveAccess().getForKeyword_3_0_0());
                    				
                    // InternalRoboProse.g:730:5: ( (lv_duration_4_0= ruleEFloat ) )
                    // InternalRoboProse.g:731:6: (lv_duration_4_0= ruleEFloat )
                    {
                    // InternalRoboProse.g:731:6: (lv_duration_4_0= ruleEFloat )
                    // InternalRoboProse.g:732:7: lv_duration_4_0= ruleEFloat
                    {

                    							newCompositeNode(grammarAccess.getMoveAccess().getDurationEFloatParserRuleCall_3_0_1_0());
                    						
                    pushFollow(FOLLOW_25);
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

                    // InternalRoboProse.g:749:5: (otherlv_5= 'second' | otherlv_6= 'seconds' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==28) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==29) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalRoboProse.g:750:6: otherlv_5= 'second'
                            {
                            otherlv_5=(Token)match(input,28,FOLLOW_2); 

                            						newLeafNode(otherlv_5, grammarAccess.getMoveAccess().getSecondKeyword_3_0_2_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalRoboProse.g:755:6: otherlv_6= 'seconds'
                            {
                            otherlv_6=(Token)match(input,29,FOLLOW_2); 

                            						newLeafNode(otherlv_6, grammarAccess.getMoveAccess().getSecondsKeyword_3_0_2_1());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:762:4: ( (lv_isRandom_7_0= ruleRANDOM ) )
                    {
                    // InternalRoboProse.g:762:4: ( (lv_isRandom_7_0= ruleRANDOM ) )
                    // InternalRoboProse.g:763:5: (lv_isRandom_7_0= ruleRANDOM )
                    {
                    // InternalRoboProse.g:763:5: (lv_isRandom_7_0= ruleRANDOM )
                    // InternalRoboProse.g:764:6: lv_isRandom_7_0= ruleRANDOM
                    {

                    						newCompositeNode(grammarAccess.getMoveAccess().getIsRandomRANDOMParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_isRandom_7_0=ruleRANDOM();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoveRule());
                    						}
                    						set(
                    							current,
                    							"isRandom",
                    							true,
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
    // InternalRoboProse.g:786:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalRoboProse.g:786:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalRoboProse.g:787:2: iv_ruleTurn= ruleTurn EOF
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
    // InternalRoboProse.g:793:1: ruleTurn returns [EObject current=null] : ( () otherlv_1= 'turn' ( (lv_direction_2_0= ruleTURN_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) (otherlv_5= 'second' | otherlv_6= 'seconds' ) ) | ( ( (lv_degrees_7_0= ruleEFloat ) ) otherlv_8= 'degrees' ) | ( (lv_isRandom_9_0= ruleRANDOM ) ) )? ) ;
    public final EObject ruleTurn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_direction_2_0 = null;

        AntlrDatatypeRuleToken lv_duration_4_0 = null;

        AntlrDatatypeRuleToken lv_degrees_7_0 = null;

        AntlrDatatypeRuleToken lv_isRandom_9_0 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:799:2: ( ( () otherlv_1= 'turn' ( (lv_direction_2_0= ruleTURN_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) (otherlv_5= 'second' | otherlv_6= 'seconds' ) ) | ( ( (lv_degrees_7_0= ruleEFloat ) ) otherlv_8= 'degrees' ) | ( (lv_isRandom_9_0= ruleRANDOM ) ) )? ) )
            // InternalRoboProse.g:800:2: ( () otherlv_1= 'turn' ( (lv_direction_2_0= ruleTURN_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) (otherlv_5= 'second' | otherlv_6= 'seconds' ) ) | ( ( (lv_degrees_7_0= ruleEFloat ) ) otherlv_8= 'degrees' ) | ( (lv_isRandom_9_0= ruleRANDOM ) ) )? )
            {
            // InternalRoboProse.g:800:2: ( () otherlv_1= 'turn' ( (lv_direction_2_0= ruleTURN_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) (otherlv_5= 'second' | otherlv_6= 'seconds' ) ) | ( ( (lv_degrees_7_0= ruleEFloat ) ) otherlv_8= 'degrees' ) | ( (lv_isRandom_9_0= ruleRANDOM ) ) )? )
            // InternalRoboProse.g:801:3: () otherlv_1= 'turn' ( (lv_direction_2_0= ruleTURN_DIRECTION ) )? ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) (otherlv_5= 'second' | otherlv_6= 'seconds' ) ) | ( ( (lv_degrees_7_0= ruleEFloat ) ) otherlv_8= 'degrees' ) | ( (lv_isRandom_9_0= ruleRANDOM ) ) )?
            {
            // InternalRoboProse.g:801:3: ()
            // InternalRoboProse.g:802:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTurnAccess().getTurnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnAccess().getTurnKeyword_1());
            		
            // InternalRoboProse.g:812:3: ( (lv_direction_2_0= ruleTURN_DIRECTION ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=52 && LA20_0<=53)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRoboProse.g:813:4: (lv_direction_2_0= ruleTURN_DIRECTION )
                    {
                    // InternalRoboProse.g:813:4: (lv_direction_2_0= ruleTURN_DIRECTION )
                    // InternalRoboProse.g:814:5: lv_direction_2_0= ruleTURN_DIRECTION
                    {

                    					newCompositeNode(grammarAccess.getTurnAccess().getDirectionTURN_DIRECTIONEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_27);
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

            // InternalRoboProse.g:831:3: ( (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) (otherlv_5= 'second' | otherlv_6= 'seconds' ) ) | ( ( (lv_degrees_7_0= ruleEFloat ) ) otherlv_8= 'degrees' ) | ( (lv_isRandom_9_0= ruleRANDOM ) ) )?
            int alt22=4;
            switch ( input.LA(1) ) {
                case 27:
                    {
                    alt22=1;
                    }
                    break;
                case RULE_INT:
                case 39:
                    {
                    alt22=2;
                    }
                    break;
                case 14:
                    {
                    int LA22_3 = input.LA(2);

                    if ( (LA22_3==RULE_INT) ) {
                        alt22=2;
                    }
                    }
                    break;
                case 33:
                case 34:
                    {
                    alt22=3;
                    }
                    break;
            }

            switch (alt22) {
                case 1 :
                    // InternalRoboProse.g:832:4: (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) (otherlv_5= 'second' | otherlv_6= 'seconds' ) )
                    {
                    // InternalRoboProse.g:832:4: (otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) (otherlv_5= 'second' | otherlv_6= 'seconds' ) )
                    // InternalRoboProse.g:833:5: otherlv_3= 'for' ( (lv_duration_4_0= ruleEFloat ) ) (otherlv_5= 'second' | otherlv_6= 'seconds' )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_24); 

                    					newLeafNode(otherlv_3, grammarAccess.getTurnAccess().getForKeyword_3_0_0());
                    				
                    // InternalRoboProse.g:837:5: ( (lv_duration_4_0= ruleEFloat ) )
                    // InternalRoboProse.g:838:6: (lv_duration_4_0= ruleEFloat )
                    {
                    // InternalRoboProse.g:838:6: (lv_duration_4_0= ruleEFloat )
                    // InternalRoboProse.g:839:7: lv_duration_4_0= ruleEFloat
                    {

                    							newCompositeNode(grammarAccess.getTurnAccess().getDurationEFloatParserRuleCall_3_0_1_0());
                    						
                    pushFollow(FOLLOW_25);
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

                    // InternalRoboProse.g:856:5: (otherlv_5= 'second' | otherlv_6= 'seconds' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==28) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==29) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalRoboProse.g:857:6: otherlv_5= 'second'
                            {
                            otherlv_5=(Token)match(input,28,FOLLOW_2); 

                            						newLeafNode(otherlv_5, grammarAccess.getTurnAccess().getSecondKeyword_3_0_2_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalRoboProse.g:862:6: otherlv_6= 'seconds'
                            {
                            otherlv_6=(Token)match(input,29,FOLLOW_2); 

                            						newLeafNode(otherlv_6, grammarAccess.getTurnAccess().getSecondsKeyword_3_0_2_1());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:869:4: ( ( (lv_degrees_7_0= ruleEFloat ) ) otherlv_8= 'degrees' )
                    {
                    // InternalRoboProse.g:869:4: ( ( (lv_degrees_7_0= ruleEFloat ) ) otherlv_8= 'degrees' )
                    // InternalRoboProse.g:870:5: ( (lv_degrees_7_0= ruleEFloat ) ) otherlv_8= 'degrees'
                    {
                    // InternalRoboProse.g:870:5: ( (lv_degrees_7_0= ruleEFloat ) )
                    // InternalRoboProse.g:871:6: (lv_degrees_7_0= ruleEFloat )
                    {
                    // InternalRoboProse.g:871:6: (lv_degrees_7_0= ruleEFloat )
                    // InternalRoboProse.g:872:7: lv_degrees_7_0= ruleEFloat
                    {

                    							newCompositeNode(grammarAccess.getTurnAccess().getDegreesEFloatParserRuleCall_3_1_0_0());
                    						
                    pushFollow(FOLLOW_28);
                    lv_degrees_7_0=ruleEFloat();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTurnRule());
                    							}
                    							set(
                    								current,
                    								"degrees",
                    								lv_degrees_7_0,
                    								"dk.itu.dsl.roboprose.RoboProse.EFloat");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_8=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(otherlv_8, grammarAccess.getTurnAccess().getDegreesKeyword_3_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalRoboProse.g:895:4: ( (lv_isRandom_9_0= ruleRANDOM ) )
                    {
                    // InternalRoboProse.g:895:4: ( (lv_isRandom_9_0= ruleRANDOM ) )
                    // InternalRoboProse.g:896:5: (lv_isRandom_9_0= ruleRANDOM )
                    {
                    // InternalRoboProse.g:896:5: (lv_isRandom_9_0= ruleRANDOM )
                    // InternalRoboProse.g:897:6: lv_isRandom_9_0= ruleRANDOM
                    {

                    						newCompositeNode(grammarAccess.getTurnAccess().getIsRandomRANDOMParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_isRandom_9_0=ruleRANDOM();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTurnRule());
                    						}
                    						set(
                    							current,
                    							"isRandom",
                    							true,
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
    // InternalRoboProse.g:919:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // InternalRoboProse.g:919:45: (iv_ruleStop= ruleStop EOF )
            // InternalRoboProse.g:920:2: iv_ruleStop= ruleStop EOF
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
    // InternalRoboProse.g:926:1: ruleStop returns [EObject current=null] : ( () otherlv_1= 'stop' (otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds' )? ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_duration_3_0 = null;



        	enterRule();

        try {
            // InternalRoboProse.g:932:2: ( ( () otherlv_1= 'stop' (otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds' )? ) )
            // InternalRoboProse.g:933:2: ( () otherlv_1= 'stop' (otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds' )? )
            {
            // InternalRoboProse.g:933:2: ( () otherlv_1= 'stop' (otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds' )? )
            // InternalRoboProse.g:934:3: () otherlv_1= 'stop' (otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds' )?
            {
            // InternalRoboProse.g:934:3: ()
            // InternalRoboProse.g:935:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStopAccess().getStopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getStopAccess().getStopKeyword_1());
            		
            // InternalRoboProse.g:945:3: (otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRoboProse.g:946:4: otherlv_2= 'for' ( (lv_duration_3_0= ruleEFloat ) ) otherlv_4= 'seconds'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getStopAccess().getForKeyword_2_0());
                    			
                    // InternalRoboProse.g:950:4: ( (lv_duration_3_0= ruleEFloat ) )
                    // InternalRoboProse.g:951:5: (lv_duration_3_0= ruleEFloat )
                    {
                    // InternalRoboProse.g:951:5: (lv_duration_3_0= ruleEFloat )
                    // InternalRoboProse.g:952:6: lv_duration_3_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getStopAccess().getDurationEFloatParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_4=(Token)match(input,29,FOLLOW_2); 

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


    // $ANTLR start "entryRuleRANDOM"
    // InternalRoboProse.g:978:1: entryRuleRANDOM returns [String current=null] : iv_ruleRANDOM= ruleRANDOM EOF ;
    public final String entryRuleRANDOM() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRANDOM = null;


        try {
            // InternalRoboProse.g:978:46: (iv_ruleRANDOM= ruleRANDOM EOF )
            // InternalRoboProse.g:979:2: iv_ruleRANDOM= ruleRANDOM EOF
            {
             newCompositeNode(grammarAccess.getRANDOMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRANDOM=ruleRANDOM();

            state._fsp--;

             current =iv_ruleRANDOM.getText(); 
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
    // $ANTLR end "entryRuleRANDOM"


    // $ANTLR start "ruleRANDOM"
    // InternalRoboProse.g:985:1: ruleRANDOM returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'randomly' | kw= 'random' ) ;
    public final AntlrDatatypeRuleToken ruleRANDOM() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRoboProse.g:991:2: ( (kw= 'randomly' | kw= 'random' ) )
            // InternalRoboProse.g:992:2: (kw= 'randomly' | kw= 'random' )
            {
            // InternalRoboProse.g:992:2: (kw= 'randomly' | kw= 'random' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            else if ( (LA24_0==34) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalRoboProse.g:993:3: kw= 'randomly'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRANDOMAccess().getRandomlyKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:999:3: kw= 'random'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRANDOMAccess().getRandomKeyword_1());
                    		

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


    // $ANTLR start "entryRuleRepeat"
    // InternalRoboProse.g:1008:1: entryRuleRepeat returns [EObject current=null] : iv_ruleRepeat= ruleRepeat EOF ;
    public final EObject entryRuleRepeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeat = null;


        try {
            // InternalRoboProse.g:1008:47: (iv_ruleRepeat= ruleRepeat EOF )
            // InternalRoboProse.g:1009:2: iv_ruleRepeat= ruleRepeat EOF
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
    // InternalRoboProse.g:1015:1: ruleRepeat returns [EObject current=null] : ( () otherlv_1= 'repeat' ) ;
    public final EObject ruleRepeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoboProse.g:1021:2: ( ( () otherlv_1= 'repeat' ) )
            // InternalRoboProse.g:1022:2: ( () otherlv_1= 'repeat' )
            {
            // InternalRoboProse.g:1022:2: ( () otherlv_1= 'repeat' )
            // InternalRoboProse.g:1023:3: () otherlv_1= 'repeat'
            {
            // InternalRoboProse.g:1023:3: ()
            // InternalRoboProse.g:1024:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepeatAccess().getRepeatAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRepeatAccess().getRepeatKeyword_1());
            		

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


    // $ANTLR start "entryRuleStartOver"
    // InternalRoboProse.g:1038:1: entryRuleStartOver returns [EObject current=null] : iv_ruleStartOver= ruleStartOver EOF ;
    public final EObject entryRuleStartOver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartOver = null;


        try {
            // InternalRoboProse.g:1038:50: (iv_ruleStartOver= ruleStartOver EOF )
            // InternalRoboProse.g:1039:2: iv_ruleStartOver= ruleStartOver EOF
            {
             newCompositeNode(grammarAccess.getStartOverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartOver=ruleStartOver();

            state._fsp--;

             current =iv_ruleStartOver; 
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
    // $ANTLR end "entryRuleStartOver"


    // $ANTLR start "ruleStartOver"
    // InternalRoboProse.g:1045:1: ruleStartOver returns [EObject current=null] : ( () otherlv_1= 'start' otherlv_2= 'over' ) ;
    public final EObject ruleStartOver() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRoboProse.g:1051:2: ( ( () otherlv_1= 'start' otherlv_2= 'over' ) )
            // InternalRoboProse.g:1052:2: ( () otherlv_1= 'start' otherlv_2= 'over' )
            {
            // InternalRoboProse.g:1052:2: ( () otherlv_1= 'start' otherlv_2= 'over' )
            // InternalRoboProse.g:1053:3: () otherlv_1= 'start' otherlv_2= 'over'
            {
            // InternalRoboProse.g:1053:3: ()
            // InternalRoboProse.g:1054:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStartOverAccess().getStartOverAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getStartOverAccess().getStartKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getStartOverAccess().getOverKeyword_2());
            		

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
    // $ANTLR end "ruleStartOver"


    // $ANTLR start "entryRuleWait"
    // InternalRoboProse.g:1072:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalRoboProse.g:1072:45: (iv_ruleWait= ruleWait EOF )
            // InternalRoboProse.g:1073:2: iv_ruleWait= ruleWait EOF
            {
             newCompositeNode(grammarAccess.getWaitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWait=ruleWait();

            state._fsp--;

             current =iv_ruleWait; 
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
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // InternalRoboProse.g:1079:1: ruleWait returns [EObject current=null] : ( () otherlv_1= 'wait' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoboProse.g:1085:2: ( ( () otherlv_1= 'wait' ) )
            // InternalRoboProse.g:1086:2: ( () otherlv_1= 'wait' )
            {
            // InternalRoboProse.g:1086:2: ( () otherlv_1= 'wait' )
            // InternalRoboProse.g:1087:3: () otherlv_1= 'wait'
            {
            // InternalRoboProse.g:1087:3: ()
            // InternalRoboProse.g:1088:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWaitAccess().getWaitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getWaitKeyword_1());
            		

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
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleEFloat"
    // InternalRoboProse.g:1102:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalRoboProse.g:1102:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalRoboProse.g:1103:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalRoboProse.g:1109:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalRoboProse.g:1115:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalRoboProse.g:1116:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalRoboProse.g:1116:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalRoboProse.g:1117:3: (kw= '-' )? (this_INT_1= RULE_INT )? (kw= '.' )? this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalRoboProse.g:1117:3: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRoboProse.g:1118:4: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalRoboProse.g:1124:3: (this_INT_1= RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RULE_INT||LA26_1==14) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalRoboProse.g:1125:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_32); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalRoboProse.g:1133:3: (kw= '.' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==14) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRoboProse.g:1134:4: kw= '.'
                    {
                    kw=(Token)match(input,14,FOLLOW_33); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
                    			

                    }
                    break;

            }

            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_34); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalRoboProse.g:1147:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=40 && LA30_0<=41)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRoboProse.g:1148:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalRoboProse.g:1148:4: (kw= 'E' | kw= 'e' )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==40) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==41) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalRoboProse.g:1149:5: kw= 'E'
                            {
                            kw=(Token)match(input,40,FOLLOW_35); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalRoboProse.g:1155:5: kw= 'e'
                            {
                            kw=(Token)match(input,41,FOLLOW_35); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalRoboProse.g:1161:4: (kw= '-' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==39) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalRoboProse.g:1162:5: kw= '-'
                            {
                            kw=(Token)match(input,39,FOLLOW_33); 

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
    // InternalRoboProse.g:1180:1: entryRuleObstacle returns [EObject current=null] : iv_ruleObstacle= ruleObstacle EOF ;
    public final EObject entryRuleObstacle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObstacle = null;


        try {
            // InternalRoboProse.g:1180:49: (iv_ruleObstacle= ruleObstacle EOF )
            // InternalRoboProse.g:1181:2: iv_ruleObstacle= ruleObstacle EOF
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
    // InternalRoboProse.g:1187:1: ruleObstacle returns [EObject current=null] : ( () otherlv_1= 'meets' otherlv_2= 'an' otherlv_3= 'obstacle' ) ;
    public final EObject ruleObstacle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRoboProse.g:1193:2: ( ( () otherlv_1= 'meets' otherlv_2= 'an' otherlv_3= 'obstacle' ) )
            // InternalRoboProse.g:1194:2: ( () otherlv_1= 'meets' otherlv_2= 'an' otherlv_3= 'obstacle' )
            {
            // InternalRoboProse.g:1194:2: ( () otherlv_1= 'meets' otherlv_2= 'an' otherlv_3= 'obstacle' )
            // InternalRoboProse.g:1195:3: () otherlv_1= 'meets' otherlv_2= 'an' otherlv_3= 'obstacle'
            {
            // InternalRoboProse.g:1195:3: ()
            // InternalRoboProse.g:1196:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObstacleAccess().getObstacleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getObstacleAccess().getMeetsKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getObstacleAccess().getAnKeyword_2());
            		
            otherlv_3=(Token)match(input,44,FOLLOW_2); 

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
    // InternalRoboProse.g:1218:1: entryRuleTapped returns [EObject current=null] : iv_ruleTapped= ruleTapped EOF ;
    public final EObject entryRuleTapped() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTapped = null;


        try {
            // InternalRoboProse.g:1218:47: (iv_ruleTapped= ruleTapped EOF )
            // InternalRoboProse.g:1219:2: iv_ruleTapped= ruleTapped EOF
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
    // InternalRoboProse.g:1225:1: ruleTapped returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'tapped' ) ;
    public final EObject ruleTapped() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRoboProse.g:1231:2: ( ( () otherlv_1= 'is' otherlv_2= 'tapped' ) )
            // InternalRoboProse.g:1232:2: ( () otherlv_1= 'is' otherlv_2= 'tapped' )
            {
            // InternalRoboProse.g:1232:2: ( () otherlv_1= 'is' otherlv_2= 'tapped' )
            // InternalRoboProse.g:1233:3: () otherlv_1= 'is' otherlv_2= 'tapped'
            {
            // InternalRoboProse.g:1233:3: ()
            // InternalRoboProse.g:1234:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTappedAccess().getTappedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getTappedAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,46,FOLLOW_2); 

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
    // InternalRoboProse.g:1252:1: ruleMOVE_DIRECTION returns [Enumerator current=null] : ( (enumLiteral_0= 'forwards' ) | (enumLiteral_1= 'forward' ) | (enumLiteral_2= 'backwards' ) | (enumLiteral_3= 'backward' ) | (enumLiteral_4= 'back' ) ) ;
    public final Enumerator ruleMOVE_DIRECTION() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRoboProse.g:1258:2: ( ( (enumLiteral_0= 'forwards' ) | (enumLiteral_1= 'forward' ) | (enumLiteral_2= 'backwards' ) | (enumLiteral_3= 'backward' ) | (enumLiteral_4= 'back' ) ) )
            // InternalRoboProse.g:1259:2: ( (enumLiteral_0= 'forwards' ) | (enumLiteral_1= 'forward' ) | (enumLiteral_2= 'backwards' ) | (enumLiteral_3= 'backward' ) | (enumLiteral_4= 'back' ) )
            {
            // InternalRoboProse.g:1259:2: ( (enumLiteral_0= 'forwards' ) | (enumLiteral_1= 'forward' ) | (enumLiteral_2= 'backwards' ) | (enumLiteral_3= 'backward' ) | (enumLiteral_4= 'back' ) )
            int alt31=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt31=1;
                }
                break;
            case 48:
                {
                alt31=2;
                }
                break;
            case 49:
                {
                alt31=3;
                }
                break;
            case 50:
                {
                alt31=4;
                }
                break;
            case 51:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalRoboProse.g:1260:3: (enumLiteral_0= 'forwards' )
                    {
                    // InternalRoboProse.g:1260:3: (enumLiteral_0= 'forwards' )
                    // InternalRoboProse.g:1261:4: enumLiteral_0= 'forwards'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:1268:3: (enumLiteral_1= 'forward' )
                    {
                    // InternalRoboProse.g:1268:3: (enumLiteral_1= 'forward' )
                    // InternalRoboProse.g:1269:4: enumLiteral_1= 'forward'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRoboProse.g:1276:3: (enumLiteral_2= 'backwards' )
                    {
                    // InternalRoboProse.g:1276:3: (enumLiteral_2= 'backwards' )
                    // InternalRoboProse.g:1277:4: enumLiteral_2= 'backwards'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRoboProse.g:1284:3: (enumLiteral_3= 'backward' )
                    {
                    // InternalRoboProse.g:1284:3: (enumLiteral_3= 'backward' )
                    // InternalRoboProse.g:1285:4: enumLiteral_3= 'backward'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRoboProse.g:1292:3: (enumLiteral_4= 'back' )
                    {
                    // InternalRoboProse.g:1292:3: (enumLiteral_4= 'back' )
                    // InternalRoboProse.g:1293:4: enumLiteral_4= 'back'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_2); 

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
    // InternalRoboProse.g:1303:1: ruleTURN_DIRECTION returns [Enumerator current=null] : ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) ;
    public final Enumerator ruleTURN_DIRECTION() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRoboProse.g:1309:2: ( ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) ) )
            // InternalRoboProse.g:1310:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            {
            // InternalRoboProse.g:1310:2: ( (enumLiteral_0= 'left' ) | (enumLiteral_1= 'right' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==52) ) {
                alt32=1;
            }
            else if ( (LA32_0==53) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalRoboProse.g:1311:3: (enumLiteral_0= 'left' )
                    {
                    // InternalRoboProse.g:1311:3: (enumLiteral_0= 'left' )
                    // InternalRoboProse.g:1312:4: enumLiteral_0= 'left'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTURN_DIRECTIONAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTURN_DIRECTIONAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:1319:3: (enumLiteral_1= 'right' )
                    {
                    // InternalRoboProse.g:1319:3: (enumLiteral_1= 'right' )
                    // InternalRoboProse.g:1320:4: enumLiteral_1= 'right'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

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

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\2\uffff\1\4\10\uffff";
    static final String dfa_3s = "\1\16\2\21\1\17\1\uffff\1\21\1\15\1\uffff\3\21\1\32";
    static final String dfa_4s = "\1\30\2\46\1\31\1\uffff\1\46\1\15\1\uffff\4\46";
    static final String dfa_5s = "\4\uffff\1\2\2\uffff\1\1\4\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\7\uffff\1\1\1\uffff\1\2",
            "\1\6\5\uffff\1\5\2\uffff\1\7\3\uffff\1\7\1\uffff\1\7\2\uffff\2\4\1\uffff\1\4",
            "\1\6\4\uffff\1\10\1\11\2\uffff\1\7\3\uffff\1\7\1\uffff\1\7\2\uffff\2\4\1\uffff\1\4",
            "\2\4\10\uffff\1\12",
            "",
            "\1\6\10\uffff\1\7\3\uffff\1\7\1\uffff\1\7\2\uffff\2\4\1\uffff\1\4",
            "\1\13",
            "",
            "\1\6\5\uffff\1\11\2\uffff\1\7\3\uffff\1\7\1\uffff\1\7\2\uffff\2\4\1\uffff\1\4",
            "\1\6\10\uffff\1\7\3\uffff\1\7\1\uffff\1\7\2\uffff\2\4\1\uffff\1\4",
            "\1\6\10\uffff\1\7\3\uffff\1\7\1\uffff\1\7\2\uffff\2\4\1\uffff\1\4",
            "\1\7\3\uffff\1\7\1\uffff\1\7\2\uffff\2\4\1\uffff\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 185:3: ( ruleActionDelimiter ( (lv_actions_2_0= ruleAction ) ) )*";
        }
    }
    static final String[] dfa_8s = {
            "\1\3\3\uffff\1\4\1\uffff\1\4\1\uffff\1\1\1\uffff\1\2",
            "\1\6\5\uffff\1\5\2\uffff\1\7\3\uffff\1\7\1\uffff\1\7\2\uffff\2\4\1\uffff\1\4",
            "\1\6\4\uffff\1\10\1\11\2\uffff\1\7\3\uffff\1\7\1\uffff\1\7\2\uffff\2\4\1\uffff\1\4",
            "\2\4\4\uffff\1\4\3\uffff\1\12",
            "",
            "\1\6\10\uffff\1\7\3\uffff\1\7\1\uffff\1\7\2\uffff\2\4\1\uffff\1\4",
            "\1\13",
            "",
            "\1\6\5\uffff\1\11\2\uffff\1\7\3\uffff\1\7\1\uffff\1\7\2\uffff\2\4\1\uffff\1\4",
            "\1\6\10\uffff\1\7\3\uffff\1\7\1\uffff\1\7\2\uffff\2\4\1\uffff\1\4",
            "\1\6\10\uffff\1\7\3\uffff\1\7\1\uffff\1\7\2\uffff\2\4\1\uffff\1\4",
            "\1\7\3\uffff\1\7\1\uffff\1\7\2\uffff\2\4\1\uffff\1\4"
    };
    static final short[][] dfa_8 = unpackEncodedStringArray(dfa_8s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_8;
        }
        public String getDescription() {
            return "()* loopback of 321:3: ( ruleActionDelimiter ( (lv_actions_8_0= ruleAction ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000144000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001404002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000005800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001444002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000820002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000C20002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000F800608000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000608000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000004010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0030008608004012L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008608004012L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});

}