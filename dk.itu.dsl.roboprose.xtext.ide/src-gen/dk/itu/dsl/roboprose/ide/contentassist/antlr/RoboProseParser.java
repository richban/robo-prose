/*
 * generated by Xtext 2.12.0
 */
package dk.itu.dsl.roboprose.ide.contentassist.antlr;

import com.google.inject.Inject;
import dk.itu.dsl.roboprose.ide.contentassist.antlr.internal.InternalRoboProseParser;
import dk.itu.dsl.roboprose.services.RoboProseGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class RoboProseParser extends AbstractContentAssistParser {

	@Inject
	private RoboProseGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalRoboProseParser createParser() {
		InternalRoboProseParser result = new InternalRoboProseParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEventListenerAccess().getAlternatives_0(), "rule__EventListener__Alternatives_0");
					put(grammarAccess.getActionDelimiterAccess().getAlternatives_0(), "rule__ActionDelimiter__Alternatives_0");
					put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
					put(grammarAccess.getEndingAccess().getAlternatives(), "rule__Ending__Alternatives");
					put(grammarAccess.getEventAccess().getAlternatives(), "rule__Event__Alternatives");
					put(grammarAccess.getMoveAccess().getAlternatives_3(), "rule__Move__Alternatives_3");
					put(grammarAccess.getMoveAccess().getAlternatives_3_0_2(), "rule__Move__Alternatives_3_0_2");
					put(grammarAccess.getTurnAccess().getAlternatives_3(), "rule__Turn__Alternatives_3");
					put(grammarAccess.getTurnAccess().getAlternatives_3_0_2(), "rule__Turn__Alternatives_3_0_2");
					put(grammarAccess.getRANDOMAccess().getAlternatives(), "rule__RANDOM__Alternatives");
					put(grammarAccess.getEFloatAccess().getAlternatives_4_0(), "rule__EFloat__Alternatives_4_0");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getMOVE_DIRECTIONAccess().getAlternatives(), "rule__MOVE_DIRECTION__Alternatives");
					put(grammarAccess.getTURN_DIRECTIONAccess().getAlternatives(), "rule__TURN_DIRECTION__Alternatives");
					put(grammarAccess.getRoboProseAccess().getGroup(), "rule__RoboProse__Group__0");
					put(grammarAccess.getRoboProseAccess().getGroup_6(), "rule__RoboProse__Group_6__0");
					put(grammarAccess.getMainAccess().getGroup(), "rule__Main__Group__0");
					put(grammarAccess.getMainAccess().getGroup_1(), "rule__Main__Group_1__0");
					put(grammarAccess.getMainAccess().getGroup_2(), "rule__Main__Group_2__0");
					put(grammarAccess.getEventListenerAccess().getGroup(), "rule__EventListener__Group__0");
					put(grammarAccess.getEventListenerAccess().getGroup_6(), "rule__EventListener__Group_6__0");
					put(grammarAccess.getEventListenerAccess().getGroup_7(), "rule__EventListener__Group_7__0");
					put(grammarAccess.getEventListenerAccess().getGroup_8(), "rule__EventListener__Group_8__0");
					put(grammarAccess.getEventListenerAccess().getGroup_8_3(), "rule__EventListener__Group_8_3__0");
					put(grammarAccess.getSublistenerDelimiterAccess().getGroup(), "rule__SublistenerDelimiter__Group__0");
					put(grammarAccess.getActionDelimiterAccess().getGroup(), "rule__ActionDelimiter__Group__0");
					put(grammarAccess.getActionDelimiterAccess().getGroup_0_0(), "rule__ActionDelimiter__Group_0_0__0");
					put(grammarAccess.getActionDelimiterAccess().getGroup_0_1(), "rule__ActionDelimiter__Group_0_1__0");
					put(grammarAccess.getActionDelimiterAccess().getGroup_0_2(), "rule__ActionDelimiter__Group_0_2__0");
					put(grammarAccess.getActionDelimiterAccess().getGroup_1(), "rule__ActionDelimiter__Group_1__0");
					put(grammarAccess.getMoveAccess().getGroup(), "rule__Move__Group__0");
					put(grammarAccess.getMoveAccess().getGroup_3_0(), "rule__Move__Group_3_0__0");
					put(grammarAccess.getTurnAccess().getGroup(), "rule__Turn__Group__0");
					put(grammarAccess.getTurnAccess().getGroup_3_0(), "rule__Turn__Group_3_0__0");
					put(grammarAccess.getTurnAccess().getGroup_3_1(), "rule__Turn__Group_3_1__0");
					put(grammarAccess.getStopAccess().getGroup(), "rule__Stop__Group__0");
					put(grammarAccess.getStopAccess().getGroup_2(), "rule__Stop__Group_2__0");
					put(grammarAccess.getRepeatAccess().getGroup(), "rule__Repeat__Group__0");
					put(grammarAccess.getStartOverAccess().getGroup(), "rule__StartOver__Group__0");
					put(grammarAccess.getWaitAccess().getGroup(), "rule__Wait__Group__0");
					put(grammarAccess.getEFloatAccess().getGroup(), "rule__EFloat__Group__0");
					put(grammarAccess.getEFloatAccess().getGroup_4(), "rule__EFloat__Group_4__0");
					put(grammarAccess.getObstacleAccess().getGroup(), "rule__Obstacle__Group__0");
					put(grammarAccess.getTappedAccess().getGroup(), "rule__Tapped__Group__0");
					put(grammarAccess.getRoboProseAccess().getMainAssignment_4(), "rule__RoboProse__MainAssignment_4");
					put(grammarAccess.getRoboProseAccess().getListenersAssignment_6_0(), "rule__RoboProse__ListenersAssignment_6_0");
					put(grammarAccess.getMainAccess().getActionsAssignment_0(), "rule__Main__ActionsAssignment_0");
					put(grammarAccess.getMainAccess().getActionsAssignment_1_1(), "rule__Main__ActionsAssignment_1_1");
					put(grammarAccess.getMainAccess().getEndingAssignment_2_1(), "rule__Main__EndingAssignment_2_1");
					put(grammarAccess.getEventListenerAccess().getEventAssignment_2(), "rule__EventListener__EventAssignment_2");
					put(grammarAccess.getEventListenerAccess().getActionsAssignment_5(), "rule__EventListener__ActionsAssignment_5");
					put(grammarAccess.getEventListenerAccess().getActionsAssignment_6_1(), "rule__EventListener__ActionsAssignment_6_1");
					put(grammarAccess.getEventListenerAccess().getEndingAssignment_7_1(), "rule__EventListener__EndingAssignment_7_1");
					put(grammarAccess.getEventListenerAccess().getSublistenersAssignment_8_2(), "rule__EventListener__SublistenersAssignment_8_2");
					put(grammarAccess.getEventListenerAccess().getSublistenersAssignment_8_3_1(), "rule__EventListener__SublistenersAssignment_8_3_1");
					put(grammarAccess.getMoveAccess().getDirectionAssignment_2(), "rule__Move__DirectionAssignment_2");
					put(grammarAccess.getMoveAccess().getDurationAssignment_3_0_1(), "rule__Move__DurationAssignment_3_0_1");
					put(grammarAccess.getMoveAccess().getIsRandomAssignment_3_1(), "rule__Move__IsRandomAssignment_3_1");
					put(grammarAccess.getTurnAccess().getDirectionAssignment_2(), "rule__Turn__DirectionAssignment_2");
					put(grammarAccess.getTurnAccess().getDurationAssignment_3_0_1(), "rule__Turn__DurationAssignment_3_0_1");
					put(grammarAccess.getTurnAccess().getDegreesAssignment_3_1_0(), "rule__Turn__DegreesAssignment_3_1_0");
					put(grammarAccess.getTurnAccess().getIsRandomAssignment_3_2(), "rule__Turn__IsRandomAssignment_3_2");
					put(grammarAccess.getStopAccess().getDurationAssignment_2_1(), "rule__Stop__DurationAssignment_2_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RoboProseGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RoboProseGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
