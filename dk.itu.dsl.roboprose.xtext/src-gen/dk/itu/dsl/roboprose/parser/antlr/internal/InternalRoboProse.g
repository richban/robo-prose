/*
 * generated by Xtext 2.12.0
 */
grammar InternalRoboProse;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package dk.itu.dsl.roboprose.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRoboProse
entryRuleRoboProse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRoboProseRule()); }
	iv_ruleRoboProse=ruleRoboProse
	{ $current=$iv_ruleRoboProse.current; }
	EOF;

// Rule RoboProse
ruleRoboProse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRoboProseAccess().getRoboProseAction_0(),
					$current);
			}
		)
		otherlv_1='My'
		{
			newLeafNode(otherlv_1, grammarAccess.getRoboProseAccess().getMyKeyword_1());
		}
		otherlv_2='robot'
		{
			newLeafNode(otherlv_2, grammarAccess.getRoboProseAccess().getRobotKeyword_2());
		}
		otherlv_3='should'
		{
			newLeafNode(otherlv_3, grammarAccess.getRoboProseAccess().getShouldKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRoboProseAccess().getMainMainParserRuleCall_4_0());
				}
				lv_main_4_0=ruleMain
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRoboProseRule());
					}
					set(
						$current,
						"main",
						lv_main_4_0,
						"dk.itu.dsl.roboprose.RoboProse.Main");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='.'
		{
			newLeafNode(otherlv_5, grammarAccess.getRoboProseAccess().getFullStopKeyword_5());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getRoboProseAccess().getListenersEventListenerParserRuleCall_6_0_0());
					}
					lv_listeners_6_0=ruleEventListener
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRoboProseRule());
						}
						add(
							$current,
							"listeners",
							lv_listeners_6_0,
							"dk.itu.dsl.roboprose.RoboProse.EventListener");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_7='.'
			{
				newLeafNode(otherlv_7, grammarAccess.getRoboProseAccess().getFullStopKeyword_6_1());
			}
		)*
	)
;

// Entry rule entryRuleMain
entryRuleMain returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMainRule()); }
	iv_ruleMain=ruleMain
	{ $current=$iv_ruleMain.current; }
	EOF;

// Rule Main
ruleMain returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getMainAccess().getActionsActionParserRuleCall_0_0());
				}
				lv_actions_0_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMainRule());
					}
					add(
						$current,
						"actions",
						lv_actions_0_0,
						"dk.itu.dsl.roboprose.RoboProse.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			{
				newCompositeNode(grammarAccess.getMainAccess().getActionDelimiterParserRuleCall_1_0());
			}
			ruleActionDelimiter
			{
				afterParserOrEnumRuleCall();
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMainAccess().getActionsActionParserRuleCall_1_1_0());
					}
					lv_actions_2_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMainRule());
						}
						add(
							$current,
							"actions",
							lv_actions_2_0,
							"dk.itu.dsl.roboprose.RoboProse.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleEventListener
entryRuleEventListener returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEventListenerRule()); }
	iv_ruleEventListener=ruleEventListener
	{ $current=$iv_ruleEventListener.current; }
	EOF;

// Rule EventListener
ruleEventListener returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='When'
			{
				newLeafNode(otherlv_0, grammarAccess.getEventListenerAccess().getWhenKeyword_0_0());
			}
			    |
			otherlv_1='when'
			{
				newLeafNode(otherlv_1, grammarAccess.getEventListenerAccess().getWhenKeyword_0_1());
			}
		)
		otherlv_2='it'
		{
			newLeafNode(otherlv_2, grammarAccess.getEventListenerAccess().getItKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEventListenerAccess().getEventEventParserRuleCall_2_0());
				}
				lv_event_3_0=ruleEvent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEventListenerRule());
					}
					set(
						$current,
						"event",
						lv_event_3_0,
						"dk.itu.dsl.roboprose.RoboProse.Event");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='it'
		{
			newLeafNode(otherlv_4, grammarAccess.getEventListenerAccess().getItKeyword_3());
		}
		otherlv_5='should'
		{
			newLeafNode(otherlv_5, grammarAccess.getEventListenerAccess().getShouldKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEventListenerAccess().getActionsActionParserRuleCall_5_0());
				}
				lv_actions_6_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEventListenerRule());
					}
					add(
						$current,
						"actions",
						lv_actions_6_0,
						"dk.itu.dsl.roboprose.RoboProse.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			{
				newCompositeNode(grammarAccess.getEventListenerAccess().getActionDelimiterParserRuleCall_6_0());
			}
			ruleActionDelimiter
			{
				afterParserOrEnumRuleCall();
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEventListenerAccess().getActionsActionParserRuleCall_6_1_0());
					}
					lv_actions_8_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEventListenerRule());
						}
						add(
							$current,
							"actions",
							lv_actions_8_0,
							"dk.itu.dsl.roboprose.RoboProse.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			otherlv_9='('
			{
				newLeafNode(otherlv_9, grammarAccess.getEventListenerAccess().getLeftParenthesisKeyword_7_0());
			}
			otherlv_10='but'
			{
				newLeafNode(otherlv_10, grammarAccess.getEventListenerAccess().getButKeyword_7_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEventListenerAccess().getSublistenersEventListenerParserRuleCall_7_2_0());
					}
					lv_sublisteners_11_0=ruleEventListener
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEventListenerRule());
						}
						add(
							$current,
							"sublisteners",
							lv_sublisteners_11_0,
							"dk.itu.dsl.roboprose.RoboProse.EventListener");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				{
					newCompositeNode(grammarAccess.getEventListenerAccess().getSublistenerDelimiterParserRuleCall_7_3_0());
				}
				ruleSublistenerDelimiter
				{
					afterParserOrEnumRuleCall();
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEventListenerAccess().getSublistenersEventListenerParserRuleCall_7_3_1_0());
						}
						lv_sublisteners_13_0=ruleEventListener
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEventListenerRule());
							}
							add(
								$current,
								"sublisteners",
								lv_sublisteners_13_0,
								"dk.itu.dsl.roboprose.RoboProse.EventListener");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_14=')'
			{
				newLeafNode(otherlv_14, grammarAccess.getEventListenerAccess().getRightParenthesisKeyword_7_4());
			}
		)?
	)
;

// Entry rule entryRuleSublistenerDelimiter
entryRuleSublistenerDelimiter returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSublistenerDelimiterRule()); }
	iv_ruleSublistenerDelimiter=ruleSublistenerDelimiter
	{ $current=$iv_ruleSublistenerDelimiter.current.getText(); }
	EOF;

// Rule SublistenerDelimiter
ruleSublistenerDelimiter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSublistenerDelimiterAccess().getFullStopKeyword_0());
		}
		kw='And'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getSublistenerDelimiterAccess().getAndKeyword_1());
		}
	)
;

// Entry rule entryRuleActionDelimiter
entryRuleActionDelimiter returns [String current=null]:
	{ newCompositeNode(grammarAccess.getActionDelimiterRule()); }
	iv_ruleActionDelimiter=ruleActionDelimiter
	{ $current=$iv_ruleActionDelimiter.current.getText(); }
	EOF;

// Rule ActionDelimiter
ruleActionDelimiter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				kw='and'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getAndKeyword_0_0_0());
				}
				kw='then'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getThenKeyword_0_0_1());
				}
			)
			    |
			(
				kw=','
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getCommaKeyword_0_1_0());
				}
				kw='then'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getThenKeyword_0_1_1());
				}
			)
			    |
			(
				kw='.'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getFullStopKeyword_0_2_0());
				}
				kw='Then'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getThenKeyword_0_2_1());
				}
			)
		)
		(
			kw='it'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getItKeyword_1_0());
			}
			kw='should'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getActionDelimiterAccess().getShouldKeyword_1_1());
			}
		)?
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getActionAccess().getMoveParserRuleCall_0());
		}
		this_Move_0=ruleMove
		{
			$current = $this_Move_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getTurnParserRuleCall_1());
		}
		this_Turn_1=ruleTurn
		{
			$current = $this_Turn_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getStopParserRuleCall_2());
		}
		this_Stop_2=ruleStop
		{
			$current = $this_Stop_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getRepeatParserRuleCall_3());
		}
		this_Repeat_3=ruleRepeat
		{
			$current = $this_Repeat_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEvent
entryRuleEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEventRule()); }
	iv_ruleEvent=ruleEvent
	{ $current=$iv_ruleEvent.current; }
	EOF;

// Rule Event
ruleEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEventAccess().getObstacleParserRuleCall_0());
		}
		this_Obstacle_0=ruleObstacle
		{
			$current = $this_Obstacle_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEventAccess().getTappedParserRuleCall_1());
		}
		this_Tapped_1=ruleTapped
		{
			$current = $this_Tapped_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMove
entryRuleMove returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMoveRule()); }
	iv_ruleMove=ruleMove
	{ $current=$iv_ruleMove.current; }
	EOF;

// Rule Move
ruleMove returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMoveAccess().getMoveAction_0(),
					$current);
			}
		)
		otherlv_1='move'
		{
			newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getMoveKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMoveAccess().getDirectionMOVE_DIRECTIONEnumRuleCall_2_0());
				}
				lv_direction_2_0=ruleMOVE_DIRECTION
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMoveRule());
					}
					set(
						$current,
						"direction",
						lv_direction_2_0,
						"dk.itu.dsl.roboprose.RoboProse.MOVE_DIRECTION");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				otherlv_3='for'
				{
					newLeafNode(otherlv_3, grammarAccess.getMoveAccess().getForKeyword_3_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMoveAccess().getDurationEFloatParserRuleCall_3_0_1_0());
						}
						lv_duration_4_0=ruleEFloat
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMoveRule());
							}
							set(
								$current,
								"duration",
								lv_duration_4_0,
								"dk.itu.dsl.roboprose.RoboProse.EFloat");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_5='seconds'
				{
					newLeafNode(otherlv_5, grammarAccess.getMoveAccess().getSecondsKeyword_3_0_2());
				}
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getMoveAccess().getIsRandomRANDOMEnumRuleCall_3_1_0());
					}
					lv_isRandom_6_0=ruleRANDOM
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMoveRule());
						}
						set(
							$current,
							"isRandom",
							lv_isRandom_6_0,
							"dk.itu.dsl.roboprose.RoboProse.RANDOM");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleTurn
entryRuleTurn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTurnRule()); }
	iv_ruleTurn=ruleTurn
	{ $current=$iv_ruleTurn.current; }
	EOF;

// Rule Turn
ruleTurn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTurnAccess().getTurnAction_0(),
					$current);
			}
		)
		otherlv_1='turn'
		{
			newLeafNode(otherlv_1, grammarAccess.getTurnAccess().getTurnKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTurnAccess().getDirectionTURN_DIRECTIONEnumRuleCall_2_0());
				}
				lv_direction_2_0=ruleTURN_DIRECTION
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTurnRule());
					}
					set(
						$current,
						"direction",
						lv_direction_2_0,
						"dk.itu.dsl.roboprose.RoboProse.TURN_DIRECTION");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				otherlv_3='for'
				{
					newLeafNode(otherlv_3, grammarAccess.getTurnAccess().getForKeyword_3_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTurnAccess().getDurationEFloatParserRuleCall_3_0_1_0());
						}
						lv_duration_4_0=ruleEFloat
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTurnRule());
							}
							set(
								$current,
								"duration",
								lv_duration_4_0,
								"dk.itu.dsl.roboprose.RoboProse.EFloat");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_5='seconds'
				{
					newLeafNode(otherlv_5, grammarAccess.getTurnAccess().getSecondsKeyword_3_0_2());
				}
			)
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getTurnAccess().getDegreesEFloatParserRuleCall_3_1_0_0());
						}
						lv_degrees_6_0=ruleEFloat
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTurnRule());
							}
							set(
								$current,
								"degrees",
								lv_degrees_6_0,
								"dk.itu.dsl.roboprose.RoboProse.EFloat");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_7='degrees'
				{
					newLeafNode(otherlv_7, grammarAccess.getTurnAccess().getDegreesKeyword_3_1_1());
				}
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getTurnAccess().getIsRandomRANDOMEnumRuleCall_3_2_0());
					}
					lv_isRandom_8_0=ruleRANDOM
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTurnRule());
						}
						set(
							$current,
							"isRandom",
							lv_isRandom_8_0,
							"dk.itu.dsl.roboprose.RoboProse.RANDOM");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleStop
entryRuleStop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStopRule()); }
	iv_ruleStop=ruleStop
	{ $current=$iv_ruleStop.current; }
	EOF;

// Rule Stop
ruleStop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStopAccess().getStopAction_0(),
					$current);
			}
		)
		otherlv_1='stop'
		{
			newLeafNode(otherlv_1, grammarAccess.getStopAccess().getStopKeyword_1());
		}
		(
			otherlv_2='for'
			{
				newLeafNode(otherlv_2, grammarAccess.getStopAccess().getForKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStopAccess().getDurationEFloatParserRuleCall_2_1_0());
					}
					lv_duration_3_0=ruleEFloat
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStopRule());
						}
						set(
							$current,
							"duration",
							lv_duration_3_0,
							"dk.itu.dsl.roboprose.RoboProse.EFloat");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_4='seconds'
			{
				newLeafNode(otherlv_4, grammarAccess.getStopAccess().getSecondsKeyword_2_2());
			}
		)?
	)
;

// Entry rule entryRuleRepeat
entryRuleRepeat returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRepeatRule()); }
	iv_ruleRepeat=ruleRepeat
	{ $current=$iv_ruleRepeat.current; }
	EOF;

// Rule Repeat
ruleRepeat returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRepeatAccess().getRepeatAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRepeatAccess().getShouldRepeatSHOULD_REPEATEnumRuleCall_1_0());
				}
				lv_shouldRepeat_1_0=ruleSHOULD_REPEAT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRepeatRule());
					}
					set(
						$current,
						"shouldRepeat",
						lv_shouldRepeat_1_0,
						"dk.itu.dsl.roboprose.RoboProse.SHOULD_REPEAT");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEFloat
entryRuleEFloat returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEFloatRule()); }
	iv_ruleEFloat=ruleEFloat
	{ $current=$iv_ruleEFloat.current.getText(); }
	EOF;

// Rule EFloat
ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
			}
		)?
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
			}
		)?
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
			}
		)?
		this_INT_3=RULE_INT
		{
			$current.merge(this_INT_3);
		}
		{
			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
		}
		(
			(
				kw='E'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
				}
				    |
				kw='e'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
				}
			)
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
				}
			)?
			this_INT_7=RULE_INT
			{
				$current.merge(this_INT_7);
			}
			{
				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
			}
		)?
	)
;

// Entry rule entryRuleObstacle
entryRuleObstacle returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObstacleRule()); }
	iv_ruleObstacle=ruleObstacle
	{ $current=$iv_ruleObstacle.current; }
	EOF;

// Rule Obstacle
ruleObstacle returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getObstacleAccess().getObstacleAction_0(),
					$current);
			}
		)
		otherlv_1='meets'
		{
			newLeafNode(otherlv_1, grammarAccess.getObstacleAccess().getMeetsKeyword_1());
		}
		otherlv_2='an'
		{
			newLeafNode(otherlv_2, grammarAccess.getObstacleAccess().getAnKeyword_2());
		}
		otherlv_3='obstacle'
		{
			newLeafNode(otherlv_3, grammarAccess.getObstacleAccess().getObstacleKeyword_3());
		}
	)
;

// Entry rule entryRuleTapped
entryRuleTapped returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTappedRule()); }
	iv_ruleTapped=ruleTapped
	{ $current=$iv_ruleTapped.current; }
	EOF;

// Rule Tapped
ruleTapped returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTappedAccess().getTappedAction_0(),
					$current);
			}
		)
		otherlv_1='is'
		{
			newLeafNode(otherlv_1, grammarAccess.getTappedAccess().getIsKeyword_1());
		}
		otherlv_2='tapped'
		{
			newLeafNode(otherlv_2, grammarAccess.getTappedAccess().getTappedKeyword_2());
		}
	)
;

// Rule MOVE_DIRECTION
ruleMOVE_DIRECTION returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='forwards'
			{
				$current = grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='forward'
			{
				$current = grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='backwards'
			{
				$current = grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='backward'
			{
				$current = grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='back'
			{
				$current = grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_4());
			}
		)
	)
;

// Rule TURN_DIRECTION
ruleTURN_DIRECTION returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='left'
			{
				$current = grammarAccess.getTURN_DIRECTIONAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTURN_DIRECTIONAccess().getLEFTEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='right'
			{
				$current = grammarAccess.getTURN_DIRECTIONAccess().getRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTURN_DIRECTIONAccess().getRIGHTEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule RANDOM
ruleRANDOM returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='randomly'
			{
				$current = grammarAccess.getRANDOMAccess().getRANDOMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getRANDOMAccess().getRANDOMEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='random'
			{
				$current = grammarAccess.getRANDOMAccess().getRANDOMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getRANDOMAccess().getRANDOMEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule SHOULD_REPEAT
ruleSHOULD_REPEAT returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='repeat'
		{
			$current = grammarAccess.getSHOULD_REPEATAccess().getDO_REPEATEnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getSHOULD_REPEATAccess().getDO_REPEATEnumLiteralDeclaration());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
