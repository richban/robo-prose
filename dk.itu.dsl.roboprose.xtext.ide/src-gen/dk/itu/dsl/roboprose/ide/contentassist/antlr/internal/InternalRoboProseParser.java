package dk.itu.dsl.roboprose.ide.contentassist.antlr.internal;

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
import dk.itu.dsl.roboprose.services.RoboProseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRoboProseParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_INT", "RULE_WS", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'.'", "'When'", "'when'", "'E'", "'e'", "'forwards'", "'forward'", "'backwards'", "'backward'", "'back'", "'left'", "'right'", "'randomly'", "'random'", "'My'", "'robot'", "'should'", "'it'", "'('", "'but'", "')'", "'and'", "'then'", "','", "'Then'", "'move'", "'for'", "'seconds'", "'turn'", "'degrees'", "'stop'", "'-'", "'meets'", "'an'", "'obstacle'", "'is'", "'tapped'"
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

    	public void setGrammarAccess(RoboProseGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRoboProse"
    // InternalRoboProse.g:53:1: entryRuleRoboProse : ruleRoboProse EOF ;
    public final void entryRuleRoboProse() throws RecognitionException {
        try {
            // InternalRoboProse.g:54:1: ( ruleRoboProse EOF )
            // InternalRoboProse.g:55:1: ruleRoboProse EOF
            {
             before(grammarAccess.getRoboProseRule()); 
            pushFollow(FOLLOW_1);
            ruleRoboProse();

            state._fsp--;

             after(grammarAccess.getRoboProseRule()); 
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
    // $ANTLR end "entryRuleRoboProse"


    // $ANTLR start "ruleRoboProse"
    // InternalRoboProse.g:62:1: ruleRoboProse : ( ( rule__RoboProse__Group__0 ) ) ;
    public final void ruleRoboProse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:66:2: ( ( ( rule__RoboProse__Group__0 ) ) )
            // InternalRoboProse.g:67:2: ( ( rule__RoboProse__Group__0 ) )
            {
            // InternalRoboProse.g:67:2: ( ( rule__RoboProse__Group__0 ) )
            // InternalRoboProse.g:68:3: ( rule__RoboProse__Group__0 )
            {
             before(grammarAccess.getRoboProseAccess().getGroup()); 
            // InternalRoboProse.g:69:3: ( rule__RoboProse__Group__0 )
            // InternalRoboProse.g:69:4: rule__RoboProse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RoboProse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoboProseAccess().getGroup()); 

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
    // $ANTLR end "ruleRoboProse"


    // $ANTLR start "entryRuleMain"
    // InternalRoboProse.g:78:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // InternalRoboProse.g:79:1: ( ruleMain EOF )
            // InternalRoboProse.g:80:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getMainRule()); 
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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalRoboProse.g:87:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:91:2: ( ( ( rule__Main__Group__0 ) ) )
            // InternalRoboProse.g:92:2: ( ( rule__Main__Group__0 ) )
            {
            // InternalRoboProse.g:92:2: ( ( rule__Main__Group__0 ) )
            // InternalRoboProse.g:93:3: ( rule__Main__Group__0 )
            {
             before(grammarAccess.getMainAccess().getGroup()); 
            // InternalRoboProse.g:94:3: ( rule__Main__Group__0 )
            // InternalRoboProse.g:94:4: rule__Main__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getGroup()); 

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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleEventListener"
    // InternalRoboProse.g:103:1: entryRuleEventListener : ruleEventListener EOF ;
    public final void entryRuleEventListener() throws RecognitionException {
        try {
            // InternalRoboProse.g:104:1: ( ruleEventListener EOF )
            // InternalRoboProse.g:105:1: ruleEventListener EOF
            {
             before(grammarAccess.getEventListenerRule()); 
            pushFollow(FOLLOW_1);
            ruleEventListener();

            state._fsp--;

             after(grammarAccess.getEventListenerRule()); 
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
    // $ANTLR end "entryRuleEventListener"


    // $ANTLR start "ruleEventListener"
    // InternalRoboProse.g:112:1: ruleEventListener : ( ( rule__EventListener__Group__0 ) ) ;
    public final void ruleEventListener() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:116:2: ( ( ( rule__EventListener__Group__0 ) ) )
            // InternalRoboProse.g:117:2: ( ( rule__EventListener__Group__0 ) )
            {
            // InternalRoboProse.g:117:2: ( ( rule__EventListener__Group__0 ) )
            // InternalRoboProse.g:118:3: ( rule__EventListener__Group__0 )
            {
             before(grammarAccess.getEventListenerAccess().getGroup()); 
            // InternalRoboProse.g:119:3: ( rule__EventListener__Group__0 )
            // InternalRoboProse.g:119:4: rule__EventListener__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventListener__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventListenerAccess().getGroup()); 

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
    // $ANTLR end "ruleEventListener"


    // $ANTLR start "entryRuleSublistenerDelimiter"
    // InternalRoboProse.g:128:1: entryRuleSublistenerDelimiter : ruleSublistenerDelimiter EOF ;
    public final void entryRuleSublistenerDelimiter() throws RecognitionException {
        try {
            // InternalRoboProse.g:129:1: ( ruleSublistenerDelimiter EOF )
            // InternalRoboProse.g:130:1: ruleSublistenerDelimiter EOF
            {
             before(grammarAccess.getSublistenerDelimiterRule()); 
            pushFollow(FOLLOW_1);
            ruleSublistenerDelimiter();

            state._fsp--;

             after(grammarAccess.getSublistenerDelimiterRule()); 
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
    // $ANTLR end "entryRuleSublistenerDelimiter"


    // $ANTLR start "ruleSublistenerDelimiter"
    // InternalRoboProse.g:137:1: ruleSublistenerDelimiter : ( '.' ) ;
    public final void ruleSublistenerDelimiter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:141:2: ( ( '.' ) )
            // InternalRoboProse.g:142:2: ( '.' )
            {
            // InternalRoboProse.g:142:2: ( '.' )
            // InternalRoboProse.g:143:3: '.'
            {
             before(grammarAccess.getSublistenerDelimiterAccess().getFullStopKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSublistenerDelimiterAccess().getFullStopKeyword()); 

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
    // $ANTLR end "ruleSublistenerDelimiter"


    // $ANTLR start "entryRuleActionDelimiter"
    // InternalRoboProse.g:153:1: entryRuleActionDelimiter : ruleActionDelimiter EOF ;
    public final void entryRuleActionDelimiter() throws RecognitionException {
        try {
            // InternalRoboProse.g:154:1: ( ruleActionDelimiter EOF )
            // InternalRoboProse.g:155:1: ruleActionDelimiter EOF
            {
             before(grammarAccess.getActionDelimiterRule()); 
            pushFollow(FOLLOW_1);
            ruleActionDelimiter();

            state._fsp--;

             after(grammarAccess.getActionDelimiterRule()); 
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
    // $ANTLR end "entryRuleActionDelimiter"


    // $ANTLR start "ruleActionDelimiter"
    // InternalRoboProse.g:162:1: ruleActionDelimiter : ( ( rule__ActionDelimiter__Group__0 ) ) ;
    public final void ruleActionDelimiter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:166:2: ( ( ( rule__ActionDelimiter__Group__0 ) ) )
            // InternalRoboProse.g:167:2: ( ( rule__ActionDelimiter__Group__0 ) )
            {
            // InternalRoboProse.g:167:2: ( ( rule__ActionDelimiter__Group__0 ) )
            // InternalRoboProse.g:168:3: ( rule__ActionDelimiter__Group__0 )
            {
             before(grammarAccess.getActionDelimiterAccess().getGroup()); 
            // InternalRoboProse.g:169:3: ( rule__ActionDelimiter__Group__0 )
            // InternalRoboProse.g:169:4: rule__ActionDelimiter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActionDelimiter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionDelimiterAccess().getGroup()); 

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
    // $ANTLR end "ruleActionDelimiter"


    // $ANTLR start "entryRuleParagraphDelimiter"
    // InternalRoboProse.g:178:1: entryRuleParagraphDelimiter : ruleParagraphDelimiter EOF ;
    public final void entryRuleParagraphDelimiter() throws RecognitionException {
        try {
            // InternalRoboProse.g:179:1: ( ruleParagraphDelimiter EOF )
            // InternalRoboProse.g:180:1: ruleParagraphDelimiter EOF
            {
             before(grammarAccess.getParagraphDelimiterRule()); 
            pushFollow(FOLLOW_1);
            ruleParagraphDelimiter();

            state._fsp--;

             after(grammarAccess.getParagraphDelimiterRule()); 
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
    // $ANTLR end "entryRuleParagraphDelimiter"


    // $ANTLR start "ruleParagraphDelimiter"
    // InternalRoboProse.g:187:1: ruleParagraphDelimiter : ( ( rule__ParagraphDelimiter__Group__0 ) ) ;
    public final void ruleParagraphDelimiter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:191:2: ( ( ( rule__ParagraphDelimiter__Group__0 ) ) )
            // InternalRoboProse.g:192:2: ( ( rule__ParagraphDelimiter__Group__0 ) )
            {
            // InternalRoboProse.g:192:2: ( ( rule__ParagraphDelimiter__Group__0 ) )
            // InternalRoboProse.g:193:3: ( rule__ParagraphDelimiter__Group__0 )
            {
             before(grammarAccess.getParagraphDelimiterAccess().getGroup()); 
            // InternalRoboProse.g:194:3: ( rule__ParagraphDelimiter__Group__0 )
            // InternalRoboProse.g:194:4: rule__ParagraphDelimiter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParagraphDelimiter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParagraphDelimiterAccess().getGroup()); 

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
    // $ANTLR end "ruleParagraphDelimiter"


    // $ANTLR start "entryRuleAction"
    // InternalRoboProse.g:203:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalRoboProse.g:204:1: ( ruleAction EOF )
            // InternalRoboProse.g:205:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalRoboProse.g:212:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:216:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalRoboProse.g:217:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalRoboProse.g:217:2: ( ( rule__Action__Alternatives ) )
            // InternalRoboProse.g:218:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalRoboProse.g:219:3: ( rule__Action__Alternatives )
            // InternalRoboProse.g:219:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleEvent"
    // InternalRoboProse.g:228:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalRoboProse.g:229:1: ( ruleEvent EOF )
            // InternalRoboProse.g:230:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalRoboProse.g:237:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:241:2: ( ( ( rule__Event__Alternatives ) ) )
            // InternalRoboProse.g:242:2: ( ( rule__Event__Alternatives ) )
            {
            // InternalRoboProse.g:242:2: ( ( rule__Event__Alternatives ) )
            // InternalRoboProse.g:243:3: ( rule__Event__Alternatives )
            {
             before(grammarAccess.getEventAccess().getAlternatives()); 
            // InternalRoboProse.g:244:3: ( rule__Event__Alternatives )
            // InternalRoboProse.g:244:4: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Event__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleMove"
    // InternalRoboProse.g:253:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalRoboProse.g:254:1: ( ruleMove EOF )
            // InternalRoboProse.g:255:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalRoboProse.g:262:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:266:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalRoboProse.g:267:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalRoboProse.g:267:2: ( ( rule__Move__Group__0 ) )
            // InternalRoboProse.g:268:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalRoboProse.g:269:3: ( rule__Move__Group__0 )
            // InternalRoboProse.g:269:4: rule__Move__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

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
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleTurn"
    // InternalRoboProse.g:278:1: entryRuleTurn : ruleTurn EOF ;
    public final void entryRuleTurn() throws RecognitionException {
        try {
            // InternalRoboProse.g:279:1: ( ruleTurn EOF )
            // InternalRoboProse.g:280:1: ruleTurn EOF
            {
             before(grammarAccess.getTurnRule()); 
            pushFollow(FOLLOW_1);
            ruleTurn();

            state._fsp--;

             after(grammarAccess.getTurnRule()); 
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
    // $ANTLR end "entryRuleTurn"


    // $ANTLR start "ruleTurn"
    // InternalRoboProse.g:287:1: ruleTurn : ( ( rule__Turn__Group__0 ) ) ;
    public final void ruleTurn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:291:2: ( ( ( rule__Turn__Group__0 ) ) )
            // InternalRoboProse.g:292:2: ( ( rule__Turn__Group__0 ) )
            {
            // InternalRoboProse.g:292:2: ( ( rule__Turn__Group__0 ) )
            // InternalRoboProse.g:293:3: ( rule__Turn__Group__0 )
            {
             before(grammarAccess.getTurnAccess().getGroup()); 
            // InternalRoboProse.g:294:3: ( rule__Turn__Group__0 )
            // InternalRoboProse.g:294:4: rule__Turn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Turn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnAccess().getGroup()); 

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
    // $ANTLR end "ruleTurn"


    // $ANTLR start "entryRuleStop"
    // InternalRoboProse.g:303:1: entryRuleStop : ruleStop EOF ;
    public final void entryRuleStop() throws RecognitionException {
        try {
            // InternalRoboProse.g:304:1: ( ruleStop EOF )
            // InternalRoboProse.g:305:1: ruleStop EOF
            {
             before(grammarAccess.getStopRule()); 
            pushFollow(FOLLOW_1);
            ruleStop();

            state._fsp--;

             after(grammarAccess.getStopRule()); 
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
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // InternalRoboProse.g:312:1: ruleStop : ( ( rule__Stop__Group__0 ) ) ;
    public final void ruleStop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:316:2: ( ( ( rule__Stop__Group__0 ) ) )
            // InternalRoboProse.g:317:2: ( ( rule__Stop__Group__0 ) )
            {
            // InternalRoboProse.g:317:2: ( ( rule__Stop__Group__0 ) )
            // InternalRoboProse.g:318:3: ( rule__Stop__Group__0 )
            {
             before(grammarAccess.getStopAccess().getGroup()); 
            // InternalRoboProse.g:319:3: ( rule__Stop__Group__0 )
            // InternalRoboProse.g:319:4: rule__Stop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Stop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStopAccess().getGroup()); 

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
    // $ANTLR end "ruleStop"


    // $ANTLR start "entryRuleEFloat"
    // InternalRoboProse.g:328:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalRoboProse.g:329:1: ( ruleEFloat EOF )
            // InternalRoboProse.g:330:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalRoboProse.g:337:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:341:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalRoboProse.g:342:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalRoboProse.g:342:2: ( ( rule__EFloat__Group__0 ) )
            // InternalRoboProse.g:343:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalRoboProse.g:344:3: ( rule__EFloat__Group__0 )
            // InternalRoboProse.g:344:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleObstacle"
    // InternalRoboProse.g:353:1: entryRuleObstacle : ruleObstacle EOF ;
    public final void entryRuleObstacle() throws RecognitionException {
        try {
            // InternalRoboProse.g:354:1: ( ruleObstacle EOF )
            // InternalRoboProse.g:355:1: ruleObstacle EOF
            {
             before(grammarAccess.getObstacleRule()); 
            pushFollow(FOLLOW_1);
            ruleObstacle();

            state._fsp--;

             after(grammarAccess.getObstacleRule()); 
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
    // $ANTLR end "entryRuleObstacle"


    // $ANTLR start "ruleObstacle"
    // InternalRoboProse.g:362:1: ruleObstacle : ( ( rule__Obstacle__Group__0 ) ) ;
    public final void ruleObstacle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:366:2: ( ( ( rule__Obstacle__Group__0 ) ) )
            // InternalRoboProse.g:367:2: ( ( rule__Obstacle__Group__0 ) )
            {
            // InternalRoboProse.g:367:2: ( ( rule__Obstacle__Group__0 ) )
            // InternalRoboProse.g:368:3: ( rule__Obstacle__Group__0 )
            {
             before(grammarAccess.getObstacleAccess().getGroup()); 
            // InternalRoboProse.g:369:3: ( rule__Obstacle__Group__0 )
            // InternalRoboProse.g:369:4: rule__Obstacle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObstacleAccess().getGroup()); 

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
    // $ANTLR end "ruleObstacle"


    // $ANTLR start "entryRuleTapped"
    // InternalRoboProse.g:378:1: entryRuleTapped : ruleTapped EOF ;
    public final void entryRuleTapped() throws RecognitionException {
        try {
            // InternalRoboProse.g:379:1: ( ruleTapped EOF )
            // InternalRoboProse.g:380:1: ruleTapped EOF
            {
             before(grammarAccess.getTappedRule()); 
            pushFollow(FOLLOW_1);
            ruleTapped();

            state._fsp--;

             after(grammarAccess.getTappedRule()); 
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
    // $ANTLR end "entryRuleTapped"


    // $ANTLR start "ruleTapped"
    // InternalRoboProse.g:387:1: ruleTapped : ( ( rule__Tapped__Group__0 ) ) ;
    public final void ruleTapped() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:391:2: ( ( ( rule__Tapped__Group__0 ) ) )
            // InternalRoboProse.g:392:2: ( ( rule__Tapped__Group__0 ) )
            {
            // InternalRoboProse.g:392:2: ( ( rule__Tapped__Group__0 ) )
            // InternalRoboProse.g:393:3: ( rule__Tapped__Group__0 )
            {
             before(grammarAccess.getTappedAccess().getGroup()); 
            // InternalRoboProse.g:394:3: ( rule__Tapped__Group__0 )
            // InternalRoboProse.g:394:4: rule__Tapped__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tapped__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTappedAccess().getGroup()); 

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
    // $ANTLR end "ruleTapped"


    // $ANTLR start "ruleMOVE_DIRECTION"
    // InternalRoboProse.g:403:1: ruleMOVE_DIRECTION : ( ( rule__MOVE_DIRECTION__Alternatives ) ) ;
    public final void ruleMOVE_DIRECTION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:407:1: ( ( ( rule__MOVE_DIRECTION__Alternatives ) ) )
            // InternalRoboProse.g:408:2: ( ( rule__MOVE_DIRECTION__Alternatives ) )
            {
            // InternalRoboProse.g:408:2: ( ( rule__MOVE_DIRECTION__Alternatives ) )
            // InternalRoboProse.g:409:3: ( rule__MOVE_DIRECTION__Alternatives )
            {
             before(grammarAccess.getMOVE_DIRECTIONAccess().getAlternatives()); 
            // InternalRoboProse.g:410:3: ( rule__MOVE_DIRECTION__Alternatives )
            // InternalRoboProse.g:410:4: rule__MOVE_DIRECTION__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MOVE_DIRECTION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMOVE_DIRECTIONAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMOVE_DIRECTION"


    // $ANTLR start "ruleTURN_DIRECTION"
    // InternalRoboProse.g:419:1: ruleTURN_DIRECTION : ( ( rule__TURN_DIRECTION__Alternatives ) ) ;
    public final void ruleTURN_DIRECTION() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:423:1: ( ( ( rule__TURN_DIRECTION__Alternatives ) ) )
            // InternalRoboProse.g:424:2: ( ( rule__TURN_DIRECTION__Alternatives ) )
            {
            // InternalRoboProse.g:424:2: ( ( rule__TURN_DIRECTION__Alternatives ) )
            // InternalRoboProse.g:425:3: ( rule__TURN_DIRECTION__Alternatives )
            {
             before(grammarAccess.getTURN_DIRECTIONAccess().getAlternatives()); 
            // InternalRoboProse.g:426:3: ( rule__TURN_DIRECTION__Alternatives )
            // InternalRoboProse.g:426:4: rule__TURN_DIRECTION__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TURN_DIRECTION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTURN_DIRECTIONAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTURN_DIRECTION"


    // $ANTLR start "ruleRANDOM"
    // InternalRoboProse.g:435:1: ruleRANDOM : ( ( rule__RANDOM__Alternatives ) ) ;
    public final void ruleRANDOM() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:439:1: ( ( ( rule__RANDOM__Alternatives ) ) )
            // InternalRoboProse.g:440:2: ( ( rule__RANDOM__Alternatives ) )
            {
            // InternalRoboProse.g:440:2: ( ( rule__RANDOM__Alternatives ) )
            // InternalRoboProse.g:441:3: ( rule__RANDOM__Alternatives )
            {
             before(grammarAccess.getRANDOMAccess().getAlternatives()); 
            // InternalRoboProse.g:442:3: ( rule__RANDOM__Alternatives )
            // InternalRoboProse.g:442:4: rule__RANDOM__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RANDOM__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRANDOMAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRANDOM"


    // $ANTLR start "rule__EventListener__Alternatives_0"
    // InternalRoboProse.g:450:1: rule__EventListener__Alternatives_0 : ( ( 'When' ) | ( 'when' ) );
    public final void rule__EventListener__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:454:1: ( ( 'When' ) | ( 'when' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRoboProse.g:455:2: ( 'When' )
                    {
                    // InternalRoboProse.g:455:2: ( 'When' )
                    // InternalRoboProse.g:456:3: 'When'
                    {
                     before(grammarAccess.getEventListenerAccess().getWhenKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEventListenerAccess().getWhenKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:461:2: ( 'when' )
                    {
                    // InternalRoboProse.g:461:2: ( 'when' )
                    // InternalRoboProse.g:462:3: 'when'
                    {
                     before(grammarAccess.getEventListenerAccess().getWhenKeyword_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEventListenerAccess().getWhenKeyword_0_1()); 

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
    // $ANTLR end "rule__EventListener__Alternatives_0"


    // $ANTLR start "rule__ActionDelimiter__Alternatives_0"
    // InternalRoboProse.g:471:1: rule__ActionDelimiter__Alternatives_0 : ( ( ( rule__ActionDelimiter__Group_0_0__0 ) ) | ( ( rule__ActionDelimiter__Group_0_1__0 ) ) | ( ( rule__ActionDelimiter__Group_0_2__0 ) ) );
    public final void rule__ActionDelimiter__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:475:1: ( ( ( rule__ActionDelimiter__Group_0_0__0 ) ) | ( ( rule__ActionDelimiter__Group_0_1__0 ) ) | ( ( rule__ActionDelimiter__Group_0_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt2=1;
                }
                break;
            case 35:
                {
                alt2=2;
                }
                break;
            case 12:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRoboProse.g:476:2: ( ( rule__ActionDelimiter__Group_0_0__0 ) )
                    {
                    // InternalRoboProse.g:476:2: ( ( rule__ActionDelimiter__Group_0_0__0 ) )
                    // InternalRoboProse.g:477:3: ( rule__ActionDelimiter__Group_0_0__0 )
                    {
                     before(grammarAccess.getActionDelimiterAccess().getGroup_0_0()); 
                    // InternalRoboProse.g:478:3: ( rule__ActionDelimiter__Group_0_0__0 )
                    // InternalRoboProse.g:478:4: rule__ActionDelimiter__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActionDelimiter__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionDelimiterAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:482:2: ( ( rule__ActionDelimiter__Group_0_1__0 ) )
                    {
                    // InternalRoboProse.g:482:2: ( ( rule__ActionDelimiter__Group_0_1__0 ) )
                    // InternalRoboProse.g:483:3: ( rule__ActionDelimiter__Group_0_1__0 )
                    {
                     before(grammarAccess.getActionDelimiterAccess().getGroup_0_1()); 
                    // InternalRoboProse.g:484:3: ( rule__ActionDelimiter__Group_0_1__0 )
                    // InternalRoboProse.g:484:4: rule__ActionDelimiter__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActionDelimiter__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionDelimiterAccess().getGroup_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoboProse.g:488:2: ( ( rule__ActionDelimiter__Group_0_2__0 ) )
                    {
                    // InternalRoboProse.g:488:2: ( ( rule__ActionDelimiter__Group_0_2__0 ) )
                    // InternalRoboProse.g:489:3: ( rule__ActionDelimiter__Group_0_2__0 )
                    {
                     before(grammarAccess.getActionDelimiterAccess().getGroup_0_2()); 
                    // InternalRoboProse.g:490:3: ( rule__ActionDelimiter__Group_0_2__0 )
                    // InternalRoboProse.g:490:4: rule__ActionDelimiter__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActionDelimiter__Group_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionDelimiterAccess().getGroup_0_2()); 

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
    // $ANTLR end "rule__ActionDelimiter__Alternatives_0"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalRoboProse.g:498:1: rule__Action__Alternatives : ( ( ruleMove ) | ( ruleTurn ) | ( ruleStop ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:502:1: ( ( ruleMove ) | ( ruleTurn ) | ( ruleStop ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt3=1;
                }
                break;
            case 40:
                {
                alt3=2;
                }
                break;
            case 42:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRoboProse.g:503:2: ( ruleMove )
                    {
                    // InternalRoboProse.g:503:2: ( ruleMove )
                    // InternalRoboProse.g:504:3: ruleMove
                    {
                     before(grammarAccess.getActionAccess().getMoveParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getMoveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:509:2: ( ruleTurn )
                    {
                    // InternalRoboProse.g:509:2: ( ruleTurn )
                    // InternalRoboProse.g:510:3: ruleTurn
                    {
                     before(grammarAccess.getActionAccess().getTurnParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTurn();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getTurnParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoboProse.g:515:2: ( ruleStop )
                    {
                    // InternalRoboProse.g:515:2: ( ruleStop )
                    // InternalRoboProse.g:516:3: ruleStop
                    {
                     before(grammarAccess.getActionAccess().getStopParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStop();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getStopParserRuleCall_2()); 

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
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__Event__Alternatives"
    // InternalRoboProse.g:525:1: rule__Event__Alternatives : ( ( ruleObstacle ) | ( ruleTapped ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:529:1: ( ( ruleObstacle ) | ( ruleTapped ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==44) ) {
                alt4=1;
            }
            else if ( (LA4_0==47) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRoboProse.g:530:2: ( ruleObstacle )
                    {
                    // InternalRoboProse.g:530:2: ( ruleObstacle )
                    // InternalRoboProse.g:531:3: ruleObstacle
                    {
                     before(grammarAccess.getEventAccess().getObstacleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleObstacle();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getObstacleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:536:2: ( ruleTapped )
                    {
                    // InternalRoboProse.g:536:2: ( ruleTapped )
                    // InternalRoboProse.g:537:3: ruleTapped
                    {
                     before(grammarAccess.getEventAccess().getTappedParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTapped();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getTappedParserRuleCall_1()); 

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
    // $ANTLR end "rule__Event__Alternatives"


    // $ANTLR start "rule__Move__Alternatives_3"
    // InternalRoboProse.g:546:1: rule__Move__Alternatives_3 : ( ( ( rule__Move__Group_3_0__0 ) ) | ( ( rule__Move__IsRandomAssignment_3_1 ) ) );
    public final void rule__Move__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:550:1: ( ( ( rule__Move__Group_3_0__0 ) ) | ( ( rule__Move__IsRandomAssignment_3_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==38) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=24 && LA5_0<=25)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoboProse.g:551:2: ( ( rule__Move__Group_3_0__0 ) )
                    {
                    // InternalRoboProse.g:551:2: ( ( rule__Move__Group_3_0__0 ) )
                    // InternalRoboProse.g:552:3: ( rule__Move__Group_3_0__0 )
                    {
                     before(grammarAccess.getMoveAccess().getGroup_3_0()); 
                    // InternalRoboProse.g:553:3: ( rule__Move__Group_3_0__0 )
                    // InternalRoboProse.g:553:4: rule__Move__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Move__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMoveAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:557:2: ( ( rule__Move__IsRandomAssignment_3_1 ) )
                    {
                    // InternalRoboProse.g:557:2: ( ( rule__Move__IsRandomAssignment_3_1 ) )
                    // InternalRoboProse.g:558:3: ( rule__Move__IsRandomAssignment_3_1 )
                    {
                     before(grammarAccess.getMoveAccess().getIsRandomAssignment_3_1()); 
                    // InternalRoboProse.g:559:3: ( rule__Move__IsRandomAssignment_3_1 )
                    // InternalRoboProse.g:559:4: rule__Move__IsRandomAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Move__IsRandomAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMoveAccess().getIsRandomAssignment_3_1()); 

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
    // $ANTLR end "rule__Move__Alternatives_3"


    // $ANTLR start "rule__Turn__Alternatives_3"
    // InternalRoboProse.g:567:1: rule__Turn__Alternatives_3 : ( ( ( rule__Turn__Group_3_0__0 ) ) | ( ( rule__Turn__Group_3_1__0 ) ) | ( ( rule__Turn__IsRandomAssignment_3_2 ) ) );
    public final void rule__Turn__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:571:1: ( ( ( rule__Turn__Group_3_0__0 ) ) | ( ( rule__Turn__Group_3_1__0 ) ) | ( ( rule__Turn__IsRandomAssignment_3_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
            case 12:
            case 43:
                {
                alt6=2;
                }
                break;
            case 24:
            case 25:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRoboProse.g:572:2: ( ( rule__Turn__Group_3_0__0 ) )
                    {
                    // InternalRoboProse.g:572:2: ( ( rule__Turn__Group_3_0__0 ) )
                    // InternalRoboProse.g:573:3: ( rule__Turn__Group_3_0__0 )
                    {
                     before(grammarAccess.getTurnAccess().getGroup_3_0()); 
                    // InternalRoboProse.g:574:3: ( rule__Turn__Group_3_0__0 )
                    // InternalRoboProse.g:574:4: rule__Turn__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Turn__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTurnAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:578:2: ( ( rule__Turn__Group_3_1__0 ) )
                    {
                    // InternalRoboProse.g:578:2: ( ( rule__Turn__Group_3_1__0 ) )
                    // InternalRoboProse.g:579:3: ( rule__Turn__Group_3_1__0 )
                    {
                     before(grammarAccess.getTurnAccess().getGroup_3_1()); 
                    // InternalRoboProse.g:580:3: ( rule__Turn__Group_3_1__0 )
                    // InternalRoboProse.g:580:4: rule__Turn__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Turn__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTurnAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoboProse.g:584:2: ( ( rule__Turn__IsRandomAssignment_3_2 ) )
                    {
                    // InternalRoboProse.g:584:2: ( ( rule__Turn__IsRandomAssignment_3_2 ) )
                    // InternalRoboProse.g:585:3: ( rule__Turn__IsRandomAssignment_3_2 )
                    {
                     before(grammarAccess.getTurnAccess().getIsRandomAssignment_3_2()); 
                    // InternalRoboProse.g:586:3: ( rule__Turn__IsRandomAssignment_3_2 )
                    // InternalRoboProse.g:586:4: rule__Turn__IsRandomAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Turn__IsRandomAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTurnAccess().getIsRandomAssignment_3_2()); 

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
    // $ANTLR end "rule__Turn__Alternatives_3"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalRoboProse.g:594:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:598:1: ( ( 'E' ) | ( 'e' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRoboProse.g:599:2: ( 'E' )
                    {
                    // InternalRoboProse.g:599:2: ( 'E' )
                    // InternalRoboProse.g:600:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:605:2: ( 'e' )
                    {
                    // InternalRoboProse.g:605:2: ( 'e' )
                    // InternalRoboProse.g:606:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__MOVE_DIRECTION__Alternatives"
    // InternalRoboProse.g:615:1: rule__MOVE_DIRECTION__Alternatives : ( ( ( 'forwards' ) ) | ( ( 'forward' ) ) | ( ( 'backwards' ) ) | ( ( 'backward' ) ) | ( ( 'back' ) ) );
    public final void rule__MOVE_DIRECTION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:619:1: ( ( ( 'forwards' ) ) | ( ( 'forward' ) ) | ( ( 'backwards' ) ) | ( ( 'backward' ) ) | ( ( 'back' ) ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            case 20:
                {
                alt8=4;
                }
                break;
            case 21:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRoboProse.g:620:2: ( ( 'forwards' ) )
                    {
                    // InternalRoboProse.g:620:2: ( ( 'forwards' ) )
                    // InternalRoboProse.g:621:3: ( 'forwards' )
                    {
                     before(grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_0()); 
                    // InternalRoboProse.g:622:3: ( 'forwards' )
                    // InternalRoboProse.g:622:4: 'forwards'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:626:2: ( ( 'forward' ) )
                    {
                    // InternalRoboProse.g:626:2: ( ( 'forward' ) )
                    // InternalRoboProse.g:627:3: ( 'forward' )
                    {
                     before(grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_1()); 
                    // InternalRoboProse.g:628:3: ( 'forward' )
                    // InternalRoboProse.g:628:4: 'forward'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoboProse.g:632:2: ( ( 'backwards' ) )
                    {
                    // InternalRoboProse.g:632:2: ( ( 'backwards' ) )
                    // InternalRoboProse.g:633:3: ( 'backwards' )
                    {
                     before(grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_2()); 
                    // InternalRoboProse.g:634:3: ( 'backwards' )
                    // InternalRoboProse.g:634:4: 'backwards'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRoboProse.g:638:2: ( ( 'backward' ) )
                    {
                    // InternalRoboProse.g:638:2: ( ( 'backward' ) )
                    // InternalRoboProse.g:639:3: ( 'backward' )
                    {
                     before(grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_3()); 
                    // InternalRoboProse.g:640:3: ( 'backward' )
                    // InternalRoboProse.g:640:4: 'backward'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRoboProse.g:644:2: ( ( 'back' ) )
                    {
                    // InternalRoboProse.g:644:2: ( ( 'back' ) )
                    // InternalRoboProse.g:645:3: ( 'back' )
                    {
                     before(grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_4()); 
                    // InternalRoboProse.g:646:3: ( 'back' )
                    // InternalRoboProse.g:646:4: 'back'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__MOVE_DIRECTION__Alternatives"


    // $ANTLR start "rule__TURN_DIRECTION__Alternatives"
    // InternalRoboProse.g:654:1: rule__TURN_DIRECTION__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__TURN_DIRECTION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:658:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRoboProse.g:659:2: ( ( 'left' ) )
                    {
                    // InternalRoboProse.g:659:2: ( ( 'left' ) )
                    // InternalRoboProse.g:660:3: ( 'left' )
                    {
                     before(grammarAccess.getTURN_DIRECTIONAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalRoboProse.g:661:3: ( 'left' )
                    // InternalRoboProse.g:661:4: 'left'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTURN_DIRECTIONAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:665:2: ( ( 'right' ) )
                    {
                    // InternalRoboProse.g:665:2: ( ( 'right' ) )
                    // InternalRoboProse.g:666:3: ( 'right' )
                    {
                     before(grammarAccess.getTURN_DIRECTIONAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalRoboProse.g:667:3: ( 'right' )
                    // InternalRoboProse.g:667:4: 'right'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getTURN_DIRECTIONAccess().getRIGHTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__TURN_DIRECTION__Alternatives"


    // $ANTLR start "rule__RANDOM__Alternatives"
    // InternalRoboProse.g:675:1: rule__RANDOM__Alternatives : ( ( ( 'randomly' ) ) | ( ( 'random' ) ) );
    public final void rule__RANDOM__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:679:1: ( ( ( 'randomly' ) ) | ( ( 'random' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRoboProse.g:680:2: ( ( 'randomly' ) )
                    {
                    // InternalRoboProse.g:680:2: ( ( 'randomly' ) )
                    // InternalRoboProse.g:681:3: ( 'randomly' )
                    {
                     before(grammarAccess.getRANDOMAccess().getRANDOMEnumLiteralDeclaration_0()); 
                    // InternalRoboProse.g:682:3: ( 'randomly' )
                    // InternalRoboProse.g:682:4: 'randomly'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getRANDOMAccess().getRANDOMEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:686:2: ( ( 'random' ) )
                    {
                    // InternalRoboProse.g:686:2: ( ( 'random' ) )
                    // InternalRoboProse.g:687:3: ( 'random' )
                    {
                     before(grammarAccess.getRANDOMAccess().getRANDOMEnumLiteralDeclaration_1()); 
                    // InternalRoboProse.g:688:3: ( 'random' )
                    // InternalRoboProse.g:688:4: 'random'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getRANDOMAccess().getRANDOMEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__RANDOM__Alternatives"


    // $ANTLR start "rule__RoboProse__Group__0"
    // InternalRoboProse.g:696:1: rule__RoboProse__Group__0 : rule__RoboProse__Group__0__Impl rule__RoboProse__Group__1 ;
    public final void rule__RoboProse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:700:1: ( rule__RoboProse__Group__0__Impl rule__RoboProse__Group__1 )
            // InternalRoboProse.g:701:2: rule__RoboProse__Group__0__Impl rule__RoboProse__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RoboProse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoboProse__Group__1();

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
    // $ANTLR end "rule__RoboProse__Group__0"


    // $ANTLR start "rule__RoboProse__Group__0__Impl"
    // InternalRoboProse.g:708:1: rule__RoboProse__Group__0__Impl : ( () ) ;
    public final void rule__RoboProse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:712:1: ( ( () ) )
            // InternalRoboProse.g:713:1: ( () )
            {
            // InternalRoboProse.g:713:1: ( () )
            // InternalRoboProse.g:714:2: ()
            {
             before(grammarAccess.getRoboProseAccess().getRoboProseAction_0()); 
            // InternalRoboProse.g:715:2: ()
            // InternalRoboProse.g:715:3: 
            {
            }

             after(grammarAccess.getRoboProseAccess().getRoboProseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoboProse__Group__0__Impl"


    // $ANTLR start "rule__RoboProse__Group__1"
    // InternalRoboProse.g:723:1: rule__RoboProse__Group__1 : rule__RoboProse__Group__1__Impl rule__RoboProse__Group__2 ;
    public final void rule__RoboProse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:727:1: ( rule__RoboProse__Group__1__Impl rule__RoboProse__Group__2 )
            // InternalRoboProse.g:728:2: rule__RoboProse__Group__1__Impl rule__RoboProse__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RoboProse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoboProse__Group__2();

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
    // $ANTLR end "rule__RoboProse__Group__1"


    // $ANTLR start "rule__RoboProse__Group__1__Impl"
    // InternalRoboProse.g:735:1: rule__RoboProse__Group__1__Impl : ( ( rule__RoboProse__Group_1__0 )? ) ;
    public final void rule__RoboProse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:739:1: ( ( ( rule__RoboProse__Group_1__0 )? ) )
            // InternalRoboProse.g:740:1: ( ( rule__RoboProse__Group_1__0 )? )
            {
            // InternalRoboProse.g:740:1: ( ( rule__RoboProse__Group_1__0 )? )
            // InternalRoboProse.g:741:2: ( rule__RoboProse__Group_1__0 )?
            {
             before(grammarAccess.getRoboProseAccess().getGroup_1()); 
            // InternalRoboProse.g:742:2: ( rule__RoboProse__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRoboProse.g:742:3: rule__RoboProse__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RoboProse__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoboProseAccess().getGroup_1()); 

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
    // $ANTLR end "rule__RoboProse__Group__1__Impl"


    // $ANTLR start "rule__RoboProse__Group__2"
    // InternalRoboProse.g:750:1: rule__RoboProse__Group__2 : rule__RoboProse__Group__2__Impl ;
    public final void rule__RoboProse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:754:1: ( rule__RoboProse__Group__2__Impl )
            // InternalRoboProse.g:755:2: rule__RoboProse__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoboProse__Group__2__Impl();

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
    // $ANTLR end "rule__RoboProse__Group__2"


    // $ANTLR start "rule__RoboProse__Group__2__Impl"
    // InternalRoboProse.g:761:1: rule__RoboProse__Group__2__Impl : ( ( rule__RoboProse__Group_2__0 )? ) ;
    public final void rule__RoboProse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:765:1: ( ( ( rule__RoboProse__Group_2__0 )? ) )
            // InternalRoboProse.g:766:1: ( ( rule__RoboProse__Group_2__0 )? )
            {
            // InternalRoboProse.g:766:1: ( ( rule__RoboProse__Group_2__0 )? )
            // InternalRoboProse.g:767:2: ( rule__RoboProse__Group_2__0 )?
            {
             before(grammarAccess.getRoboProseAccess().getGroup_2()); 
            // InternalRoboProse.g:768:2: ( rule__RoboProse__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=13 && LA12_0<=14)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRoboProse.g:768:3: rule__RoboProse__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RoboProse__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoboProseAccess().getGroup_2()); 

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
    // $ANTLR end "rule__RoboProse__Group__2__Impl"


    // $ANTLR start "rule__RoboProse__Group_1__0"
    // InternalRoboProse.g:777:1: rule__RoboProse__Group_1__0 : rule__RoboProse__Group_1__0__Impl rule__RoboProse__Group_1__1 ;
    public final void rule__RoboProse__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:781:1: ( rule__RoboProse__Group_1__0__Impl rule__RoboProse__Group_1__1 )
            // InternalRoboProse.g:782:2: rule__RoboProse__Group_1__0__Impl rule__RoboProse__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__RoboProse__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoboProse__Group_1__1();

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
    // $ANTLR end "rule__RoboProse__Group_1__0"


    // $ANTLR start "rule__RoboProse__Group_1__0__Impl"
    // InternalRoboProse.g:789:1: rule__RoboProse__Group_1__0__Impl : ( 'My' ) ;
    public final void rule__RoboProse__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:793:1: ( ( 'My' ) )
            // InternalRoboProse.g:794:1: ( 'My' )
            {
            // InternalRoboProse.g:794:1: ( 'My' )
            // InternalRoboProse.g:795:2: 'My'
            {
             before(grammarAccess.getRoboProseAccess().getMyKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRoboProseAccess().getMyKeyword_1_0()); 

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
    // $ANTLR end "rule__RoboProse__Group_1__0__Impl"


    // $ANTLR start "rule__RoboProse__Group_1__1"
    // InternalRoboProse.g:804:1: rule__RoboProse__Group_1__1 : rule__RoboProse__Group_1__1__Impl rule__RoboProse__Group_1__2 ;
    public final void rule__RoboProse__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:808:1: ( rule__RoboProse__Group_1__1__Impl rule__RoboProse__Group_1__2 )
            // InternalRoboProse.g:809:2: rule__RoboProse__Group_1__1__Impl rule__RoboProse__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__RoboProse__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoboProse__Group_1__2();

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
    // $ANTLR end "rule__RoboProse__Group_1__1"


    // $ANTLR start "rule__RoboProse__Group_1__1__Impl"
    // InternalRoboProse.g:816:1: rule__RoboProse__Group_1__1__Impl : ( 'robot' ) ;
    public final void rule__RoboProse__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:820:1: ( ( 'robot' ) )
            // InternalRoboProse.g:821:1: ( 'robot' )
            {
            // InternalRoboProse.g:821:1: ( 'robot' )
            // InternalRoboProse.g:822:2: 'robot'
            {
             before(grammarAccess.getRoboProseAccess().getRobotKeyword_1_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRoboProseAccess().getRobotKeyword_1_1()); 

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
    // $ANTLR end "rule__RoboProse__Group_1__1__Impl"


    // $ANTLR start "rule__RoboProse__Group_1__2"
    // InternalRoboProse.g:831:1: rule__RoboProse__Group_1__2 : rule__RoboProse__Group_1__2__Impl rule__RoboProse__Group_1__3 ;
    public final void rule__RoboProse__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:835:1: ( rule__RoboProse__Group_1__2__Impl rule__RoboProse__Group_1__3 )
            // InternalRoboProse.g:836:2: rule__RoboProse__Group_1__2__Impl rule__RoboProse__Group_1__3
            {
            pushFollow(FOLLOW_6);
            rule__RoboProse__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoboProse__Group_1__3();

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
    // $ANTLR end "rule__RoboProse__Group_1__2"


    // $ANTLR start "rule__RoboProse__Group_1__2__Impl"
    // InternalRoboProse.g:843:1: rule__RoboProse__Group_1__2__Impl : ( 'should' ) ;
    public final void rule__RoboProse__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:847:1: ( ( 'should' ) )
            // InternalRoboProse.g:848:1: ( 'should' )
            {
            // InternalRoboProse.g:848:1: ( 'should' )
            // InternalRoboProse.g:849:2: 'should'
            {
             before(grammarAccess.getRoboProseAccess().getShouldKeyword_1_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRoboProseAccess().getShouldKeyword_1_2()); 

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
    // $ANTLR end "rule__RoboProse__Group_1__2__Impl"


    // $ANTLR start "rule__RoboProse__Group_1__3"
    // InternalRoboProse.g:858:1: rule__RoboProse__Group_1__3 : rule__RoboProse__Group_1__3__Impl rule__RoboProse__Group_1__4 ;
    public final void rule__RoboProse__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:862:1: ( rule__RoboProse__Group_1__3__Impl rule__RoboProse__Group_1__4 )
            // InternalRoboProse.g:863:2: rule__RoboProse__Group_1__3__Impl rule__RoboProse__Group_1__4
            {
            pushFollow(FOLLOW_7);
            rule__RoboProse__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoboProse__Group_1__4();

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
    // $ANTLR end "rule__RoboProse__Group_1__3"


    // $ANTLR start "rule__RoboProse__Group_1__3__Impl"
    // InternalRoboProse.g:870:1: rule__RoboProse__Group_1__3__Impl : ( ( rule__RoboProse__MainAssignment_1_3 ) ) ;
    public final void rule__RoboProse__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:874:1: ( ( ( rule__RoboProse__MainAssignment_1_3 ) ) )
            // InternalRoboProse.g:875:1: ( ( rule__RoboProse__MainAssignment_1_3 ) )
            {
            // InternalRoboProse.g:875:1: ( ( rule__RoboProse__MainAssignment_1_3 ) )
            // InternalRoboProse.g:876:2: ( rule__RoboProse__MainAssignment_1_3 )
            {
             before(grammarAccess.getRoboProseAccess().getMainAssignment_1_3()); 
            // InternalRoboProse.g:877:2: ( rule__RoboProse__MainAssignment_1_3 )
            // InternalRoboProse.g:877:3: rule__RoboProse__MainAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__RoboProse__MainAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getRoboProseAccess().getMainAssignment_1_3()); 

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
    // $ANTLR end "rule__RoboProse__Group_1__3__Impl"


    // $ANTLR start "rule__RoboProse__Group_1__4"
    // InternalRoboProse.g:885:1: rule__RoboProse__Group_1__4 : rule__RoboProse__Group_1__4__Impl ;
    public final void rule__RoboProse__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:889:1: ( rule__RoboProse__Group_1__4__Impl )
            // InternalRoboProse.g:890:2: rule__RoboProse__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoboProse__Group_1__4__Impl();

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
    // $ANTLR end "rule__RoboProse__Group_1__4"


    // $ANTLR start "rule__RoboProse__Group_1__4__Impl"
    // InternalRoboProse.g:896:1: rule__RoboProse__Group_1__4__Impl : ( ruleParagraphDelimiter ) ;
    public final void rule__RoboProse__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:900:1: ( ( ruleParagraphDelimiter ) )
            // InternalRoboProse.g:901:1: ( ruleParagraphDelimiter )
            {
            // InternalRoboProse.g:901:1: ( ruleParagraphDelimiter )
            // InternalRoboProse.g:902:2: ruleParagraphDelimiter
            {
             before(grammarAccess.getRoboProseAccess().getParagraphDelimiterParserRuleCall_1_4()); 
            pushFollow(FOLLOW_2);
            ruleParagraphDelimiter();

            state._fsp--;

             after(grammarAccess.getRoboProseAccess().getParagraphDelimiterParserRuleCall_1_4()); 

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
    // $ANTLR end "rule__RoboProse__Group_1__4__Impl"


    // $ANTLR start "rule__RoboProse__Group_2__0"
    // InternalRoboProse.g:912:1: rule__RoboProse__Group_2__0 : rule__RoboProse__Group_2__0__Impl rule__RoboProse__Group_2__1 ;
    public final void rule__RoboProse__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:916:1: ( rule__RoboProse__Group_2__0__Impl rule__RoboProse__Group_2__1 )
            // InternalRoboProse.g:917:2: rule__RoboProse__Group_2__0__Impl rule__RoboProse__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__RoboProse__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoboProse__Group_2__1();

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
    // $ANTLR end "rule__RoboProse__Group_2__0"


    // $ANTLR start "rule__RoboProse__Group_2__0__Impl"
    // InternalRoboProse.g:924:1: rule__RoboProse__Group_2__0__Impl : ( ( rule__RoboProse__ListenersAssignment_2_0 ) ) ;
    public final void rule__RoboProse__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:928:1: ( ( ( rule__RoboProse__ListenersAssignment_2_0 ) ) )
            // InternalRoboProse.g:929:1: ( ( rule__RoboProse__ListenersAssignment_2_0 ) )
            {
            // InternalRoboProse.g:929:1: ( ( rule__RoboProse__ListenersAssignment_2_0 ) )
            // InternalRoboProse.g:930:2: ( rule__RoboProse__ListenersAssignment_2_0 )
            {
             before(grammarAccess.getRoboProseAccess().getListenersAssignment_2_0()); 
            // InternalRoboProse.g:931:2: ( rule__RoboProse__ListenersAssignment_2_0 )
            // InternalRoboProse.g:931:3: rule__RoboProse__ListenersAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__RoboProse__ListenersAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRoboProseAccess().getListenersAssignment_2_0()); 

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
    // $ANTLR end "rule__RoboProse__Group_2__0__Impl"


    // $ANTLR start "rule__RoboProse__Group_2__1"
    // InternalRoboProse.g:939:1: rule__RoboProse__Group_2__1 : rule__RoboProse__Group_2__1__Impl rule__RoboProse__Group_2__2 ;
    public final void rule__RoboProse__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:943:1: ( rule__RoboProse__Group_2__1__Impl rule__RoboProse__Group_2__2 )
            // InternalRoboProse.g:944:2: rule__RoboProse__Group_2__1__Impl rule__RoboProse__Group_2__2
            {
            pushFollow(FOLLOW_7);
            rule__RoboProse__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoboProse__Group_2__2();

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
    // $ANTLR end "rule__RoboProse__Group_2__1"


    // $ANTLR start "rule__RoboProse__Group_2__1__Impl"
    // InternalRoboProse.g:951:1: rule__RoboProse__Group_2__1__Impl : ( ( rule__RoboProse__Group_2_1__0 )* ) ;
    public final void rule__RoboProse__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:955:1: ( ( ( rule__RoboProse__Group_2_1__0 )* ) )
            // InternalRoboProse.g:956:1: ( ( rule__RoboProse__Group_2_1__0 )* )
            {
            // InternalRoboProse.g:956:1: ( ( rule__RoboProse__Group_2_1__0 )* )
            // InternalRoboProse.g:957:2: ( rule__RoboProse__Group_2_1__0 )*
            {
             before(grammarAccess.getRoboProseAccess().getGroup_2_1()); 
            // InternalRoboProse.g:958:2: ( rule__RoboProse__Group_2_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==RULE_NEWLINE) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalRoboProse.g:958:3: rule__RoboProse__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RoboProse__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRoboProseAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__RoboProse__Group_2__1__Impl"


    // $ANTLR start "rule__RoboProse__Group_2__2"
    // InternalRoboProse.g:966:1: rule__RoboProse__Group_2__2 : rule__RoboProse__Group_2__2__Impl ;
    public final void rule__RoboProse__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:970:1: ( rule__RoboProse__Group_2__2__Impl )
            // InternalRoboProse.g:971:2: rule__RoboProse__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoboProse__Group_2__2__Impl();

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
    // $ANTLR end "rule__RoboProse__Group_2__2"


    // $ANTLR start "rule__RoboProse__Group_2__2__Impl"
    // InternalRoboProse.g:977:1: rule__RoboProse__Group_2__2__Impl : ( '.' ) ;
    public final void rule__RoboProse__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:981:1: ( ( '.' ) )
            // InternalRoboProse.g:982:1: ( '.' )
            {
            // InternalRoboProse.g:982:1: ( '.' )
            // InternalRoboProse.g:983:2: '.'
            {
             before(grammarAccess.getRoboProseAccess().getFullStopKeyword_2_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRoboProseAccess().getFullStopKeyword_2_2()); 

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
    // $ANTLR end "rule__RoboProse__Group_2__2__Impl"


    // $ANTLR start "rule__RoboProse__Group_2_1__0"
    // InternalRoboProse.g:993:1: rule__RoboProse__Group_2_1__0 : rule__RoboProse__Group_2_1__0__Impl rule__RoboProse__Group_2_1__1 ;
    public final void rule__RoboProse__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:997:1: ( rule__RoboProse__Group_2_1__0__Impl rule__RoboProse__Group_2_1__1 )
            // InternalRoboProse.g:998:2: rule__RoboProse__Group_2_1__0__Impl rule__RoboProse__Group_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__RoboProse__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RoboProse__Group_2_1__1();

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
    // $ANTLR end "rule__RoboProse__Group_2_1__0"


    // $ANTLR start "rule__RoboProse__Group_2_1__0__Impl"
    // InternalRoboProse.g:1005:1: rule__RoboProse__Group_2_1__0__Impl : ( ruleParagraphDelimiter ) ;
    public final void rule__RoboProse__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1009:1: ( ( ruleParagraphDelimiter ) )
            // InternalRoboProse.g:1010:1: ( ruleParagraphDelimiter )
            {
            // InternalRoboProse.g:1010:1: ( ruleParagraphDelimiter )
            // InternalRoboProse.g:1011:2: ruleParagraphDelimiter
            {
             before(grammarAccess.getRoboProseAccess().getParagraphDelimiterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParagraphDelimiter();

            state._fsp--;

             after(grammarAccess.getRoboProseAccess().getParagraphDelimiterParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__RoboProse__Group_2_1__0__Impl"


    // $ANTLR start "rule__RoboProse__Group_2_1__1"
    // InternalRoboProse.g:1020:1: rule__RoboProse__Group_2_1__1 : rule__RoboProse__Group_2_1__1__Impl ;
    public final void rule__RoboProse__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1024:1: ( rule__RoboProse__Group_2_1__1__Impl )
            // InternalRoboProse.g:1025:2: rule__RoboProse__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RoboProse__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__RoboProse__Group_2_1__1"


    // $ANTLR start "rule__RoboProse__Group_2_1__1__Impl"
    // InternalRoboProse.g:1031:1: rule__RoboProse__Group_2_1__1__Impl : ( ( rule__RoboProse__ListenersAssignment_2_1_1 ) ) ;
    public final void rule__RoboProse__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1035:1: ( ( ( rule__RoboProse__ListenersAssignment_2_1_1 ) ) )
            // InternalRoboProse.g:1036:1: ( ( rule__RoboProse__ListenersAssignment_2_1_1 ) )
            {
            // InternalRoboProse.g:1036:1: ( ( rule__RoboProse__ListenersAssignment_2_1_1 ) )
            // InternalRoboProse.g:1037:2: ( rule__RoboProse__ListenersAssignment_2_1_1 )
            {
             before(grammarAccess.getRoboProseAccess().getListenersAssignment_2_1_1()); 
            // InternalRoboProse.g:1038:2: ( rule__RoboProse__ListenersAssignment_2_1_1 )
            // InternalRoboProse.g:1038:3: rule__RoboProse__ListenersAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RoboProse__ListenersAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRoboProseAccess().getListenersAssignment_2_1_1()); 

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
    // $ANTLR end "rule__RoboProse__Group_2_1__1__Impl"


    // $ANTLR start "rule__Main__Group__0"
    // InternalRoboProse.g:1047:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1051:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalRoboProse.g:1052:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Main__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__1();

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
    // $ANTLR end "rule__Main__Group__0"


    // $ANTLR start "rule__Main__Group__0__Impl"
    // InternalRoboProse.g:1059:1: rule__Main__Group__0__Impl : ( ( rule__Main__ActionsAssignment_0 ) ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1063:1: ( ( ( rule__Main__ActionsAssignment_0 ) ) )
            // InternalRoboProse.g:1064:1: ( ( rule__Main__ActionsAssignment_0 ) )
            {
            // InternalRoboProse.g:1064:1: ( ( rule__Main__ActionsAssignment_0 ) )
            // InternalRoboProse.g:1065:2: ( rule__Main__ActionsAssignment_0 )
            {
             before(grammarAccess.getMainAccess().getActionsAssignment_0()); 
            // InternalRoboProse.g:1066:2: ( rule__Main__ActionsAssignment_0 )
            // InternalRoboProse.g:1066:3: rule__Main__ActionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Main__ActionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getActionsAssignment_0()); 

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
    // $ANTLR end "rule__Main__Group__0__Impl"


    // $ANTLR start "rule__Main__Group__1"
    // InternalRoboProse.g:1074:1: rule__Main__Group__1 : rule__Main__Group__1__Impl ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1078:1: ( rule__Main__Group__1__Impl )
            // InternalRoboProse.g:1079:2: rule__Main__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__1__Impl();

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
    // $ANTLR end "rule__Main__Group__1"


    // $ANTLR start "rule__Main__Group__1__Impl"
    // InternalRoboProse.g:1085:1: rule__Main__Group__1__Impl : ( ( rule__Main__Group_1__0 )* ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1089:1: ( ( ( rule__Main__Group_1__0 )* ) )
            // InternalRoboProse.g:1090:1: ( ( rule__Main__Group_1__0 )* )
            {
            // InternalRoboProse.g:1090:1: ( ( rule__Main__Group_1__0 )* )
            // InternalRoboProse.g:1091:2: ( rule__Main__Group_1__0 )*
            {
             before(grammarAccess.getMainAccess().getGroup_1()); 
            // InternalRoboProse.g:1092:2: ( rule__Main__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==12) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==36) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==33||LA14_0==35) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRoboProse.g:1092:3: rule__Main__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Main__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMainAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Main__Group__1__Impl"


    // $ANTLR start "rule__Main__Group_1__0"
    // InternalRoboProse.g:1101:1: rule__Main__Group_1__0 : rule__Main__Group_1__0__Impl rule__Main__Group_1__1 ;
    public final void rule__Main__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1105:1: ( rule__Main__Group_1__0__Impl rule__Main__Group_1__1 )
            // InternalRoboProse.g:1106:2: rule__Main__Group_1__0__Impl rule__Main__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Main__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group_1__1();

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
    // $ANTLR end "rule__Main__Group_1__0"


    // $ANTLR start "rule__Main__Group_1__0__Impl"
    // InternalRoboProse.g:1113:1: rule__Main__Group_1__0__Impl : ( ruleActionDelimiter ) ;
    public final void rule__Main__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1117:1: ( ( ruleActionDelimiter ) )
            // InternalRoboProse.g:1118:1: ( ruleActionDelimiter )
            {
            // InternalRoboProse.g:1118:1: ( ruleActionDelimiter )
            // InternalRoboProse.g:1119:2: ruleActionDelimiter
            {
             before(grammarAccess.getMainAccess().getActionDelimiterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActionDelimiter();

            state._fsp--;

             after(grammarAccess.getMainAccess().getActionDelimiterParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Main__Group_1__0__Impl"


    // $ANTLR start "rule__Main__Group_1__1"
    // InternalRoboProse.g:1128:1: rule__Main__Group_1__1 : rule__Main__Group_1__1__Impl ;
    public final void rule__Main__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1132:1: ( rule__Main__Group_1__1__Impl )
            // InternalRoboProse.g:1133:2: rule__Main__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group_1__1__Impl();

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
    // $ANTLR end "rule__Main__Group_1__1"


    // $ANTLR start "rule__Main__Group_1__1__Impl"
    // InternalRoboProse.g:1139:1: rule__Main__Group_1__1__Impl : ( ( rule__Main__ActionsAssignment_1_1 ) ) ;
    public final void rule__Main__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1143:1: ( ( ( rule__Main__ActionsAssignment_1_1 ) ) )
            // InternalRoboProse.g:1144:1: ( ( rule__Main__ActionsAssignment_1_1 ) )
            {
            // InternalRoboProse.g:1144:1: ( ( rule__Main__ActionsAssignment_1_1 ) )
            // InternalRoboProse.g:1145:2: ( rule__Main__ActionsAssignment_1_1 )
            {
             before(grammarAccess.getMainAccess().getActionsAssignment_1_1()); 
            // InternalRoboProse.g:1146:2: ( rule__Main__ActionsAssignment_1_1 )
            // InternalRoboProse.g:1146:3: rule__Main__ActionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Main__ActionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getActionsAssignment_1_1()); 

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
    // $ANTLR end "rule__Main__Group_1__1__Impl"


    // $ANTLR start "rule__EventListener__Group__0"
    // InternalRoboProse.g:1155:1: rule__EventListener__Group__0 : rule__EventListener__Group__0__Impl rule__EventListener__Group__1 ;
    public final void rule__EventListener__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1159:1: ( rule__EventListener__Group__0__Impl rule__EventListener__Group__1 )
            // InternalRoboProse.g:1160:2: rule__EventListener__Group__0__Impl rule__EventListener__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EventListener__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventListener__Group__1();

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
    // $ANTLR end "rule__EventListener__Group__0"


    // $ANTLR start "rule__EventListener__Group__0__Impl"
    // InternalRoboProse.g:1167:1: rule__EventListener__Group__0__Impl : ( ( rule__EventListener__Alternatives_0 ) ) ;
    public final void rule__EventListener__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1171:1: ( ( ( rule__EventListener__Alternatives_0 ) ) )
            // InternalRoboProse.g:1172:1: ( ( rule__EventListener__Alternatives_0 ) )
            {
            // InternalRoboProse.g:1172:1: ( ( rule__EventListener__Alternatives_0 ) )
            // InternalRoboProse.g:1173:2: ( rule__EventListener__Alternatives_0 )
            {
             before(grammarAccess.getEventListenerAccess().getAlternatives_0()); 
            // InternalRoboProse.g:1174:2: ( rule__EventListener__Alternatives_0 )
            // InternalRoboProse.g:1174:3: rule__EventListener__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__EventListener__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getEventListenerAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__EventListener__Group__0__Impl"


    // $ANTLR start "rule__EventListener__Group__1"
    // InternalRoboProse.g:1182:1: rule__EventListener__Group__1 : rule__EventListener__Group__1__Impl rule__EventListener__Group__2 ;
    public final void rule__EventListener__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1186:1: ( rule__EventListener__Group__1__Impl rule__EventListener__Group__2 )
            // InternalRoboProse.g:1187:2: rule__EventListener__Group__1__Impl rule__EventListener__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__EventListener__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventListener__Group__2();

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
    // $ANTLR end "rule__EventListener__Group__1"


    // $ANTLR start "rule__EventListener__Group__1__Impl"
    // InternalRoboProse.g:1194:1: rule__EventListener__Group__1__Impl : ( 'it' ) ;
    public final void rule__EventListener__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1198:1: ( ( 'it' ) )
            // InternalRoboProse.g:1199:1: ( 'it' )
            {
            // InternalRoboProse.g:1199:1: ( 'it' )
            // InternalRoboProse.g:1200:2: 'it'
            {
             before(grammarAccess.getEventListenerAccess().getItKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEventListenerAccess().getItKeyword_1()); 

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
    // $ANTLR end "rule__EventListener__Group__1__Impl"


    // $ANTLR start "rule__EventListener__Group__2"
    // InternalRoboProse.g:1209:1: rule__EventListener__Group__2 : rule__EventListener__Group__2__Impl rule__EventListener__Group__3 ;
    public final void rule__EventListener__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1213:1: ( rule__EventListener__Group__2__Impl rule__EventListener__Group__3 )
            // InternalRoboProse.g:1214:2: rule__EventListener__Group__2__Impl rule__EventListener__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__EventListener__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventListener__Group__3();

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
    // $ANTLR end "rule__EventListener__Group__2"


    // $ANTLR start "rule__EventListener__Group__2__Impl"
    // InternalRoboProse.g:1221:1: rule__EventListener__Group__2__Impl : ( ( rule__EventListener__EventAssignment_2 ) ) ;
    public final void rule__EventListener__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1225:1: ( ( ( rule__EventListener__EventAssignment_2 ) ) )
            // InternalRoboProse.g:1226:1: ( ( rule__EventListener__EventAssignment_2 ) )
            {
            // InternalRoboProse.g:1226:1: ( ( rule__EventListener__EventAssignment_2 ) )
            // InternalRoboProse.g:1227:2: ( rule__EventListener__EventAssignment_2 )
            {
             before(grammarAccess.getEventListenerAccess().getEventAssignment_2()); 
            // InternalRoboProse.g:1228:2: ( rule__EventListener__EventAssignment_2 )
            // InternalRoboProse.g:1228:3: rule__EventListener__EventAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EventListener__EventAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventListenerAccess().getEventAssignment_2()); 

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
    // $ANTLR end "rule__EventListener__Group__2__Impl"


    // $ANTLR start "rule__EventListener__Group__3"
    // InternalRoboProse.g:1236:1: rule__EventListener__Group__3 : rule__EventListener__Group__3__Impl rule__EventListener__Group__4 ;
    public final void rule__EventListener__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1240:1: ( rule__EventListener__Group__3__Impl rule__EventListener__Group__4 )
            // InternalRoboProse.g:1241:2: rule__EventListener__Group__3__Impl rule__EventListener__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__EventListener__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventListener__Group__4();

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
    // $ANTLR end "rule__EventListener__Group__3"


    // $ANTLR start "rule__EventListener__Group__3__Impl"
    // InternalRoboProse.g:1248:1: rule__EventListener__Group__3__Impl : ( 'it' ) ;
    public final void rule__EventListener__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1252:1: ( ( 'it' ) )
            // InternalRoboProse.g:1253:1: ( 'it' )
            {
            // InternalRoboProse.g:1253:1: ( 'it' )
            // InternalRoboProse.g:1254:2: 'it'
            {
             before(grammarAccess.getEventListenerAccess().getItKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEventListenerAccess().getItKeyword_3()); 

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
    // $ANTLR end "rule__EventListener__Group__3__Impl"


    // $ANTLR start "rule__EventListener__Group__4"
    // InternalRoboProse.g:1263:1: rule__EventListener__Group__4 : rule__EventListener__Group__4__Impl rule__EventListener__Group__5 ;
    public final void rule__EventListener__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1267:1: ( rule__EventListener__Group__4__Impl rule__EventListener__Group__5 )
            // InternalRoboProse.g:1268:2: rule__EventListener__Group__4__Impl rule__EventListener__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__EventListener__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventListener__Group__5();

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
    // $ANTLR end "rule__EventListener__Group__4"


    // $ANTLR start "rule__EventListener__Group__4__Impl"
    // InternalRoboProse.g:1275:1: rule__EventListener__Group__4__Impl : ( 'should' ) ;
    public final void rule__EventListener__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1279:1: ( ( 'should' ) )
            // InternalRoboProse.g:1280:1: ( 'should' )
            {
            // InternalRoboProse.g:1280:1: ( 'should' )
            // InternalRoboProse.g:1281:2: 'should'
            {
             before(grammarAccess.getEventListenerAccess().getShouldKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEventListenerAccess().getShouldKeyword_4()); 

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
    // $ANTLR end "rule__EventListener__Group__4__Impl"


    // $ANTLR start "rule__EventListener__Group__5"
    // InternalRoboProse.g:1290:1: rule__EventListener__Group__5 : rule__EventListener__Group__5__Impl rule__EventListener__Group__6 ;
    public final void rule__EventListener__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1294:1: ( rule__EventListener__Group__5__Impl rule__EventListener__Group__6 )
            // InternalRoboProse.g:1295:2: rule__EventListener__Group__5__Impl rule__EventListener__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__EventListener__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventListener__Group__6();

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
    // $ANTLR end "rule__EventListener__Group__5"


    // $ANTLR start "rule__EventListener__Group__5__Impl"
    // InternalRoboProse.g:1302:1: rule__EventListener__Group__5__Impl : ( ( rule__EventListener__ActionsAssignment_5 ) ) ;
    public final void rule__EventListener__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1306:1: ( ( ( rule__EventListener__ActionsAssignment_5 ) ) )
            // InternalRoboProse.g:1307:1: ( ( rule__EventListener__ActionsAssignment_5 ) )
            {
            // InternalRoboProse.g:1307:1: ( ( rule__EventListener__ActionsAssignment_5 ) )
            // InternalRoboProse.g:1308:2: ( rule__EventListener__ActionsAssignment_5 )
            {
             before(grammarAccess.getEventListenerAccess().getActionsAssignment_5()); 
            // InternalRoboProse.g:1309:2: ( rule__EventListener__ActionsAssignment_5 )
            // InternalRoboProse.g:1309:3: rule__EventListener__ActionsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__EventListener__ActionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEventListenerAccess().getActionsAssignment_5()); 

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
    // $ANTLR end "rule__EventListener__Group__5__Impl"


    // $ANTLR start "rule__EventListener__Group__6"
    // InternalRoboProse.g:1317:1: rule__EventListener__Group__6 : rule__EventListener__Group__6__Impl rule__EventListener__Group__7 ;
    public final void rule__EventListener__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1321:1: ( rule__EventListener__Group__6__Impl rule__EventListener__Group__7 )
            // InternalRoboProse.g:1322:2: rule__EventListener__Group__6__Impl rule__EventListener__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__EventListener__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventListener__Group__7();

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
    // $ANTLR end "rule__EventListener__Group__6"


    // $ANTLR start "rule__EventListener__Group__6__Impl"
    // InternalRoboProse.g:1329:1: rule__EventListener__Group__6__Impl : ( ( rule__EventListener__Group_6__0 )* ) ;
    public final void rule__EventListener__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1333:1: ( ( ( rule__EventListener__Group_6__0 )* ) )
            // InternalRoboProse.g:1334:1: ( ( rule__EventListener__Group_6__0 )* )
            {
            // InternalRoboProse.g:1334:1: ( ( rule__EventListener__Group_6__0 )* )
            // InternalRoboProse.g:1335:2: ( rule__EventListener__Group_6__0 )*
            {
             before(grammarAccess.getEventListenerAccess().getGroup_6()); 
            // InternalRoboProse.g:1336:2: ( rule__EventListener__Group_6__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==12) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==36) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==33||LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRoboProse.g:1336:3: rule__EventListener__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__EventListener__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getEventListenerAccess().getGroup_6()); 

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
    // $ANTLR end "rule__EventListener__Group__6__Impl"


    // $ANTLR start "rule__EventListener__Group__7"
    // InternalRoboProse.g:1344:1: rule__EventListener__Group__7 : rule__EventListener__Group__7__Impl ;
    public final void rule__EventListener__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1348:1: ( rule__EventListener__Group__7__Impl )
            // InternalRoboProse.g:1349:2: rule__EventListener__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventListener__Group__7__Impl();

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
    // $ANTLR end "rule__EventListener__Group__7"


    // $ANTLR start "rule__EventListener__Group__7__Impl"
    // InternalRoboProse.g:1355:1: rule__EventListener__Group__7__Impl : ( ( rule__EventListener__Group_7__0 )? ) ;
    public final void rule__EventListener__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1359:1: ( ( ( rule__EventListener__Group_7__0 )? ) )
            // InternalRoboProse.g:1360:1: ( ( rule__EventListener__Group_7__0 )? )
            {
            // InternalRoboProse.g:1360:1: ( ( rule__EventListener__Group_7__0 )? )
            // InternalRoboProse.g:1361:2: ( rule__EventListener__Group_7__0 )?
            {
             before(grammarAccess.getEventListenerAccess().getGroup_7()); 
            // InternalRoboProse.g:1362:2: ( rule__EventListener__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRoboProse.g:1362:3: rule__EventListener__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventListener__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventListenerAccess().getGroup_7()); 

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
    // $ANTLR end "rule__EventListener__Group__7__Impl"


    // $ANTLR start "rule__EventListener__Group_6__0"
    // InternalRoboProse.g:1371:1: rule__EventListener__Group_6__0 : rule__EventListener__Group_6__0__Impl rule__EventListener__Group_6__1 ;
    public final void rule__EventListener__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1375:1: ( rule__EventListener__Group_6__0__Impl rule__EventListener__Group_6__1 )
            // InternalRoboProse.g:1376:2: rule__EventListener__Group_6__0__Impl rule__EventListener__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__EventListener__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventListener__Group_6__1();

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
    // $ANTLR end "rule__EventListener__Group_6__0"


    // $ANTLR start "rule__EventListener__Group_6__0__Impl"
    // InternalRoboProse.g:1383:1: rule__EventListener__Group_6__0__Impl : ( ruleActionDelimiter ) ;
    public final void rule__EventListener__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1387:1: ( ( ruleActionDelimiter ) )
            // InternalRoboProse.g:1388:1: ( ruleActionDelimiter )
            {
            // InternalRoboProse.g:1388:1: ( ruleActionDelimiter )
            // InternalRoboProse.g:1389:2: ruleActionDelimiter
            {
             before(grammarAccess.getEventListenerAccess().getActionDelimiterParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleActionDelimiter();

            state._fsp--;

             after(grammarAccess.getEventListenerAccess().getActionDelimiterParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__EventListener__Group_6__0__Impl"


    // $ANTLR start "rule__EventListener__Group_6__1"
    // InternalRoboProse.g:1398:1: rule__EventListener__Group_6__1 : rule__EventListener__Group_6__1__Impl ;
    public final void rule__EventListener__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1402:1: ( rule__EventListener__Group_6__1__Impl )
            // InternalRoboProse.g:1403:2: rule__EventListener__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventListener__Group_6__1__Impl();

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
    // $ANTLR end "rule__EventListener__Group_6__1"


    // $ANTLR start "rule__EventListener__Group_6__1__Impl"
    // InternalRoboProse.g:1409:1: rule__EventListener__Group_6__1__Impl : ( ( rule__EventListener__ActionsAssignment_6_1 ) ) ;
    public final void rule__EventListener__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1413:1: ( ( ( rule__EventListener__ActionsAssignment_6_1 ) ) )
            // InternalRoboProse.g:1414:1: ( ( rule__EventListener__ActionsAssignment_6_1 ) )
            {
            // InternalRoboProse.g:1414:1: ( ( rule__EventListener__ActionsAssignment_6_1 ) )
            // InternalRoboProse.g:1415:2: ( rule__EventListener__ActionsAssignment_6_1 )
            {
             before(grammarAccess.getEventListenerAccess().getActionsAssignment_6_1()); 
            // InternalRoboProse.g:1416:2: ( rule__EventListener__ActionsAssignment_6_1 )
            // InternalRoboProse.g:1416:3: rule__EventListener__ActionsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__EventListener__ActionsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getEventListenerAccess().getActionsAssignment_6_1()); 

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
    // $ANTLR end "rule__EventListener__Group_6__1__Impl"


    // $ANTLR start "rule__EventListener__Group_7__0"
    // InternalRoboProse.g:1425:1: rule__EventListener__Group_7__0 : rule__EventListener__Group_7__0__Impl rule__EventListener__Group_7__1 ;
    public final void rule__EventListener__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1429:1: ( rule__EventListener__Group_7__0__Impl rule__EventListener__Group_7__1 )
            // InternalRoboProse.g:1430:2: rule__EventListener__Group_7__0__Impl rule__EventListener__Group_7__1
            {
            pushFollow(FOLLOW_15);
            rule__EventListener__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventListener__Group_7__1();

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
    // $ANTLR end "rule__EventListener__Group_7__0"


    // $ANTLR start "rule__EventListener__Group_7__0__Impl"
    // InternalRoboProse.g:1437:1: rule__EventListener__Group_7__0__Impl : ( '(' ) ;
    public final void rule__EventListener__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1441:1: ( ( '(' ) )
            // InternalRoboProse.g:1442:1: ( '(' )
            {
            // InternalRoboProse.g:1442:1: ( '(' )
            // InternalRoboProse.g:1443:2: '('
            {
             before(grammarAccess.getEventListenerAccess().getLeftParenthesisKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEventListenerAccess().getLeftParenthesisKeyword_7_0()); 

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
    // $ANTLR end "rule__EventListener__Group_7__0__Impl"


    // $ANTLR start "rule__EventListener__Group_7__1"
    // InternalRoboProse.g:1452:1: rule__EventListener__Group_7__1 : rule__EventListener__Group_7__1__Impl rule__EventListener__Group_7__2 ;
    public final void rule__EventListener__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1456:1: ( rule__EventListener__Group_7__1__Impl rule__EventListener__Group_7__2 )
            // InternalRoboProse.g:1457:2: rule__EventListener__Group_7__1__Impl rule__EventListener__Group_7__2
            {
            pushFollow(FOLLOW_9);
            rule__EventListener__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventListener__Group_7__2();

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
    // $ANTLR end "rule__EventListener__Group_7__1"


    // $ANTLR start "rule__EventListener__Group_7__1__Impl"
    // InternalRoboProse.g:1464:1: rule__EventListener__Group_7__1__Impl : ( 'but' ) ;
    public final void rule__EventListener__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1468:1: ( ( 'but' ) )
            // InternalRoboProse.g:1469:1: ( 'but' )
            {
            // InternalRoboProse.g:1469:1: ( 'but' )
            // InternalRoboProse.g:1470:2: 'but'
            {
             before(grammarAccess.getEventListenerAccess().getButKeyword_7_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEventListenerAccess().getButKeyword_7_1()); 

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
    // $ANTLR end "rule__EventListener__Group_7__1__Impl"


    // $ANTLR start "rule__EventListener__Group_7__2"
    // InternalRoboProse.g:1479:1: rule__EventListener__Group_7__2 : rule__EventListener__Group_7__2__Impl rule__EventListener__Group_7__3 ;
    public final void rule__EventListener__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1483:1: ( rule__EventListener__Group_7__2__Impl rule__EventListener__Group_7__3 )
            // InternalRoboProse.g:1484:2: rule__EventListener__Group_7__2__Impl rule__EventListener__Group_7__3
            {
            pushFollow(FOLLOW_16);
            rule__EventListener__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventListener__Group_7__3();

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
    // $ANTLR end "rule__EventListener__Group_7__2"


    // $ANTLR start "rule__EventListener__Group_7__2__Impl"
    // InternalRoboProse.g:1491:1: rule__EventListener__Group_7__2__Impl : ( ( rule__EventListener__SublistenersAssignment_7_2 ) ) ;
    public final void rule__EventListener__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1495:1: ( ( ( rule__EventListener__SublistenersAssignment_7_2 ) ) )
            // InternalRoboProse.g:1496:1: ( ( rule__EventListener__SublistenersAssignment_7_2 ) )
            {
            // InternalRoboProse.g:1496:1: ( ( rule__EventListener__SublistenersAssignment_7_2 ) )
            // InternalRoboProse.g:1497:2: ( rule__EventListener__SublistenersAssignment_7_2 )
            {
             before(grammarAccess.getEventListenerAccess().getSublistenersAssignment_7_2()); 
            // InternalRoboProse.g:1498:2: ( rule__EventListener__SublistenersAssignment_7_2 )
            // InternalRoboProse.g:1498:3: rule__EventListener__SublistenersAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__EventListener__SublistenersAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getEventListenerAccess().getSublistenersAssignment_7_2()); 

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
    // $ANTLR end "rule__EventListener__Group_7__2__Impl"


    // $ANTLR start "rule__EventListener__Group_7__3"
    // InternalRoboProse.g:1506:1: rule__EventListener__Group_7__3 : rule__EventListener__Group_7__3__Impl rule__EventListener__Group_7__4 ;
    public final void rule__EventListener__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1510:1: ( rule__EventListener__Group_7__3__Impl rule__EventListener__Group_7__4 )
            // InternalRoboProse.g:1511:2: rule__EventListener__Group_7__3__Impl rule__EventListener__Group_7__4
            {
            pushFollow(FOLLOW_16);
            rule__EventListener__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventListener__Group_7__4();

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
    // $ANTLR end "rule__EventListener__Group_7__3"


    // $ANTLR start "rule__EventListener__Group_7__3__Impl"
    // InternalRoboProse.g:1518:1: rule__EventListener__Group_7__3__Impl : ( ( rule__EventListener__Group_7_3__0 )* ) ;
    public final void rule__EventListener__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1522:1: ( ( ( rule__EventListener__Group_7_3__0 )* ) )
            // InternalRoboProse.g:1523:1: ( ( rule__EventListener__Group_7_3__0 )* )
            {
            // InternalRoboProse.g:1523:1: ( ( rule__EventListener__Group_7_3__0 )* )
            // InternalRoboProse.g:1524:2: ( rule__EventListener__Group_7_3__0 )*
            {
             before(grammarAccess.getEventListenerAccess().getGroup_7_3()); 
            // InternalRoboProse.g:1525:2: ( rule__EventListener__Group_7_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==12) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRoboProse.g:1525:3: rule__EventListener__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__EventListener__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getEventListenerAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__EventListener__Group_7__3__Impl"


    // $ANTLR start "rule__EventListener__Group_7__4"
    // InternalRoboProse.g:1533:1: rule__EventListener__Group_7__4 : rule__EventListener__Group_7__4__Impl ;
    public final void rule__EventListener__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1537:1: ( rule__EventListener__Group_7__4__Impl )
            // InternalRoboProse.g:1538:2: rule__EventListener__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventListener__Group_7__4__Impl();

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
    // $ANTLR end "rule__EventListener__Group_7__4"


    // $ANTLR start "rule__EventListener__Group_7__4__Impl"
    // InternalRoboProse.g:1544:1: rule__EventListener__Group_7__4__Impl : ( ')' ) ;
    public final void rule__EventListener__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1548:1: ( ( ')' ) )
            // InternalRoboProse.g:1549:1: ( ')' )
            {
            // InternalRoboProse.g:1549:1: ( ')' )
            // InternalRoboProse.g:1550:2: ')'
            {
             before(grammarAccess.getEventListenerAccess().getRightParenthesisKeyword_7_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEventListenerAccess().getRightParenthesisKeyword_7_4()); 

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
    // $ANTLR end "rule__EventListener__Group_7__4__Impl"


    // $ANTLR start "rule__EventListener__Group_7_3__0"
    // InternalRoboProse.g:1560:1: rule__EventListener__Group_7_3__0 : rule__EventListener__Group_7_3__0__Impl rule__EventListener__Group_7_3__1 ;
    public final void rule__EventListener__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1564:1: ( rule__EventListener__Group_7_3__0__Impl rule__EventListener__Group_7_3__1 )
            // InternalRoboProse.g:1565:2: rule__EventListener__Group_7_3__0__Impl rule__EventListener__Group_7_3__1
            {
            pushFollow(FOLLOW_9);
            rule__EventListener__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventListener__Group_7_3__1();

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
    // $ANTLR end "rule__EventListener__Group_7_3__0"


    // $ANTLR start "rule__EventListener__Group_7_3__0__Impl"
    // InternalRoboProse.g:1572:1: rule__EventListener__Group_7_3__0__Impl : ( ruleSublistenerDelimiter ) ;
    public final void rule__EventListener__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1576:1: ( ( ruleSublistenerDelimiter ) )
            // InternalRoboProse.g:1577:1: ( ruleSublistenerDelimiter )
            {
            // InternalRoboProse.g:1577:1: ( ruleSublistenerDelimiter )
            // InternalRoboProse.g:1578:2: ruleSublistenerDelimiter
            {
             before(grammarAccess.getEventListenerAccess().getSublistenerDelimiterParserRuleCall_7_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSublistenerDelimiter();

            state._fsp--;

             after(grammarAccess.getEventListenerAccess().getSublistenerDelimiterParserRuleCall_7_3_0()); 

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
    // $ANTLR end "rule__EventListener__Group_7_3__0__Impl"


    // $ANTLR start "rule__EventListener__Group_7_3__1"
    // InternalRoboProse.g:1587:1: rule__EventListener__Group_7_3__1 : rule__EventListener__Group_7_3__1__Impl ;
    public final void rule__EventListener__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1591:1: ( rule__EventListener__Group_7_3__1__Impl )
            // InternalRoboProse.g:1592:2: rule__EventListener__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventListener__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__EventListener__Group_7_3__1"


    // $ANTLR start "rule__EventListener__Group_7_3__1__Impl"
    // InternalRoboProse.g:1598:1: rule__EventListener__Group_7_3__1__Impl : ( ( rule__EventListener__SublistenersAssignment_7_3_1 ) ) ;
    public final void rule__EventListener__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1602:1: ( ( ( rule__EventListener__SublistenersAssignment_7_3_1 ) ) )
            // InternalRoboProse.g:1603:1: ( ( rule__EventListener__SublistenersAssignment_7_3_1 ) )
            {
            // InternalRoboProse.g:1603:1: ( ( rule__EventListener__SublistenersAssignment_7_3_1 ) )
            // InternalRoboProse.g:1604:2: ( rule__EventListener__SublistenersAssignment_7_3_1 )
            {
             before(grammarAccess.getEventListenerAccess().getSublistenersAssignment_7_3_1()); 
            // InternalRoboProse.g:1605:2: ( rule__EventListener__SublistenersAssignment_7_3_1 )
            // InternalRoboProse.g:1605:3: rule__EventListener__SublistenersAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EventListener__SublistenersAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEventListenerAccess().getSublistenersAssignment_7_3_1()); 

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
    // $ANTLR end "rule__EventListener__Group_7_3__1__Impl"


    // $ANTLR start "rule__ActionDelimiter__Group__0"
    // InternalRoboProse.g:1614:1: rule__ActionDelimiter__Group__0 : rule__ActionDelimiter__Group__0__Impl rule__ActionDelimiter__Group__1 ;
    public final void rule__ActionDelimiter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1618:1: ( rule__ActionDelimiter__Group__0__Impl rule__ActionDelimiter__Group__1 )
            // InternalRoboProse.g:1619:2: rule__ActionDelimiter__Group__0__Impl rule__ActionDelimiter__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ActionDelimiter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionDelimiter__Group__1();

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
    // $ANTLR end "rule__ActionDelimiter__Group__0"


    // $ANTLR start "rule__ActionDelimiter__Group__0__Impl"
    // InternalRoboProse.g:1626:1: rule__ActionDelimiter__Group__0__Impl : ( ( rule__ActionDelimiter__Alternatives_0 ) ) ;
    public final void rule__ActionDelimiter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1630:1: ( ( ( rule__ActionDelimiter__Alternatives_0 ) ) )
            // InternalRoboProse.g:1631:1: ( ( rule__ActionDelimiter__Alternatives_0 ) )
            {
            // InternalRoboProse.g:1631:1: ( ( rule__ActionDelimiter__Alternatives_0 ) )
            // InternalRoboProse.g:1632:2: ( rule__ActionDelimiter__Alternatives_0 )
            {
             before(grammarAccess.getActionDelimiterAccess().getAlternatives_0()); 
            // InternalRoboProse.g:1633:2: ( rule__ActionDelimiter__Alternatives_0 )
            // InternalRoboProse.g:1633:3: rule__ActionDelimiter__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ActionDelimiter__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getActionDelimiterAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__ActionDelimiter__Group__0__Impl"


    // $ANTLR start "rule__ActionDelimiter__Group__1"
    // InternalRoboProse.g:1641:1: rule__ActionDelimiter__Group__1 : rule__ActionDelimiter__Group__1__Impl ;
    public final void rule__ActionDelimiter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1645:1: ( rule__ActionDelimiter__Group__1__Impl )
            // InternalRoboProse.g:1646:2: rule__ActionDelimiter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionDelimiter__Group__1__Impl();

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
    // $ANTLR end "rule__ActionDelimiter__Group__1"


    // $ANTLR start "rule__ActionDelimiter__Group__1__Impl"
    // InternalRoboProse.g:1652:1: rule__ActionDelimiter__Group__1__Impl : ( ( rule__ActionDelimiter__Group_1__0 )? ) ;
    public final void rule__ActionDelimiter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1656:1: ( ( ( rule__ActionDelimiter__Group_1__0 )? ) )
            // InternalRoboProse.g:1657:1: ( ( rule__ActionDelimiter__Group_1__0 )? )
            {
            // InternalRoboProse.g:1657:1: ( ( rule__ActionDelimiter__Group_1__0 )? )
            // InternalRoboProse.g:1658:2: ( rule__ActionDelimiter__Group_1__0 )?
            {
             before(grammarAccess.getActionDelimiterAccess().getGroup_1()); 
            // InternalRoboProse.g:1659:2: ( rule__ActionDelimiter__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRoboProse.g:1659:3: rule__ActionDelimiter__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActionDelimiter__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionDelimiterAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ActionDelimiter__Group__1__Impl"


    // $ANTLR start "rule__ActionDelimiter__Group_0_0__0"
    // InternalRoboProse.g:1668:1: rule__ActionDelimiter__Group_0_0__0 : rule__ActionDelimiter__Group_0_0__0__Impl rule__ActionDelimiter__Group_0_0__1 ;
    public final void rule__ActionDelimiter__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1672:1: ( rule__ActionDelimiter__Group_0_0__0__Impl rule__ActionDelimiter__Group_0_0__1 )
            // InternalRoboProse.g:1673:2: rule__ActionDelimiter__Group_0_0__0__Impl rule__ActionDelimiter__Group_0_0__1
            {
            pushFollow(FOLLOW_17);
            rule__ActionDelimiter__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionDelimiter__Group_0_0__1();

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
    // $ANTLR end "rule__ActionDelimiter__Group_0_0__0"


    // $ANTLR start "rule__ActionDelimiter__Group_0_0__0__Impl"
    // InternalRoboProse.g:1680:1: rule__ActionDelimiter__Group_0_0__0__Impl : ( 'and' ) ;
    public final void rule__ActionDelimiter__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1684:1: ( ( 'and' ) )
            // InternalRoboProse.g:1685:1: ( 'and' )
            {
            // InternalRoboProse.g:1685:1: ( 'and' )
            // InternalRoboProse.g:1686:2: 'and'
            {
             before(grammarAccess.getActionDelimiterAccess().getAndKeyword_0_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getActionDelimiterAccess().getAndKeyword_0_0_0()); 

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
    // $ANTLR end "rule__ActionDelimiter__Group_0_0__0__Impl"


    // $ANTLR start "rule__ActionDelimiter__Group_0_0__1"
    // InternalRoboProse.g:1695:1: rule__ActionDelimiter__Group_0_0__1 : rule__ActionDelimiter__Group_0_0__1__Impl ;
    public final void rule__ActionDelimiter__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1699:1: ( rule__ActionDelimiter__Group_0_0__1__Impl )
            // InternalRoboProse.g:1700:2: rule__ActionDelimiter__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionDelimiter__Group_0_0__1__Impl();

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
    // $ANTLR end "rule__ActionDelimiter__Group_0_0__1"


    // $ANTLR start "rule__ActionDelimiter__Group_0_0__1__Impl"
    // InternalRoboProse.g:1706:1: rule__ActionDelimiter__Group_0_0__1__Impl : ( 'then' ) ;
    public final void rule__ActionDelimiter__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1710:1: ( ( 'then' ) )
            // InternalRoboProse.g:1711:1: ( 'then' )
            {
            // InternalRoboProse.g:1711:1: ( 'then' )
            // InternalRoboProse.g:1712:2: 'then'
            {
             before(grammarAccess.getActionDelimiterAccess().getThenKeyword_0_0_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getActionDelimiterAccess().getThenKeyword_0_0_1()); 

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
    // $ANTLR end "rule__ActionDelimiter__Group_0_0__1__Impl"


    // $ANTLR start "rule__ActionDelimiter__Group_0_1__0"
    // InternalRoboProse.g:1722:1: rule__ActionDelimiter__Group_0_1__0 : rule__ActionDelimiter__Group_0_1__0__Impl rule__ActionDelimiter__Group_0_1__1 ;
    public final void rule__ActionDelimiter__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1726:1: ( rule__ActionDelimiter__Group_0_1__0__Impl rule__ActionDelimiter__Group_0_1__1 )
            // InternalRoboProse.g:1727:2: rule__ActionDelimiter__Group_0_1__0__Impl rule__ActionDelimiter__Group_0_1__1
            {
            pushFollow(FOLLOW_17);
            rule__ActionDelimiter__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionDelimiter__Group_0_1__1();

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
    // $ANTLR end "rule__ActionDelimiter__Group_0_1__0"


    // $ANTLR start "rule__ActionDelimiter__Group_0_1__0__Impl"
    // InternalRoboProse.g:1734:1: rule__ActionDelimiter__Group_0_1__0__Impl : ( ',' ) ;
    public final void rule__ActionDelimiter__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1738:1: ( ( ',' ) )
            // InternalRoboProse.g:1739:1: ( ',' )
            {
            // InternalRoboProse.g:1739:1: ( ',' )
            // InternalRoboProse.g:1740:2: ','
            {
             before(grammarAccess.getActionDelimiterAccess().getCommaKeyword_0_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getActionDelimiterAccess().getCommaKeyword_0_1_0()); 

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
    // $ANTLR end "rule__ActionDelimiter__Group_0_1__0__Impl"


    // $ANTLR start "rule__ActionDelimiter__Group_0_1__1"
    // InternalRoboProse.g:1749:1: rule__ActionDelimiter__Group_0_1__1 : rule__ActionDelimiter__Group_0_1__1__Impl ;
    public final void rule__ActionDelimiter__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1753:1: ( rule__ActionDelimiter__Group_0_1__1__Impl )
            // InternalRoboProse.g:1754:2: rule__ActionDelimiter__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionDelimiter__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__ActionDelimiter__Group_0_1__1"


    // $ANTLR start "rule__ActionDelimiter__Group_0_1__1__Impl"
    // InternalRoboProse.g:1760:1: rule__ActionDelimiter__Group_0_1__1__Impl : ( 'then' ) ;
    public final void rule__ActionDelimiter__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1764:1: ( ( 'then' ) )
            // InternalRoboProse.g:1765:1: ( 'then' )
            {
            // InternalRoboProse.g:1765:1: ( 'then' )
            // InternalRoboProse.g:1766:2: 'then'
            {
             before(grammarAccess.getActionDelimiterAccess().getThenKeyword_0_1_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getActionDelimiterAccess().getThenKeyword_0_1_1()); 

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
    // $ANTLR end "rule__ActionDelimiter__Group_0_1__1__Impl"


    // $ANTLR start "rule__ActionDelimiter__Group_0_2__0"
    // InternalRoboProse.g:1776:1: rule__ActionDelimiter__Group_0_2__0 : rule__ActionDelimiter__Group_0_2__0__Impl rule__ActionDelimiter__Group_0_2__1 ;
    public final void rule__ActionDelimiter__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1780:1: ( rule__ActionDelimiter__Group_0_2__0__Impl rule__ActionDelimiter__Group_0_2__1 )
            // InternalRoboProse.g:1781:2: rule__ActionDelimiter__Group_0_2__0__Impl rule__ActionDelimiter__Group_0_2__1
            {
            pushFollow(FOLLOW_18);
            rule__ActionDelimiter__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionDelimiter__Group_0_2__1();

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
    // $ANTLR end "rule__ActionDelimiter__Group_0_2__0"


    // $ANTLR start "rule__ActionDelimiter__Group_0_2__0__Impl"
    // InternalRoboProse.g:1788:1: rule__ActionDelimiter__Group_0_2__0__Impl : ( '.' ) ;
    public final void rule__ActionDelimiter__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1792:1: ( ( '.' ) )
            // InternalRoboProse.g:1793:1: ( '.' )
            {
            // InternalRoboProse.g:1793:1: ( '.' )
            // InternalRoboProse.g:1794:2: '.'
            {
             before(grammarAccess.getActionDelimiterAccess().getFullStopKeyword_0_2_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActionDelimiterAccess().getFullStopKeyword_0_2_0()); 

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
    // $ANTLR end "rule__ActionDelimiter__Group_0_2__0__Impl"


    // $ANTLR start "rule__ActionDelimiter__Group_0_2__1"
    // InternalRoboProse.g:1803:1: rule__ActionDelimiter__Group_0_2__1 : rule__ActionDelimiter__Group_0_2__1__Impl ;
    public final void rule__ActionDelimiter__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1807:1: ( rule__ActionDelimiter__Group_0_2__1__Impl )
            // InternalRoboProse.g:1808:2: rule__ActionDelimiter__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionDelimiter__Group_0_2__1__Impl();

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
    // $ANTLR end "rule__ActionDelimiter__Group_0_2__1"


    // $ANTLR start "rule__ActionDelimiter__Group_0_2__1__Impl"
    // InternalRoboProse.g:1814:1: rule__ActionDelimiter__Group_0_2__1__Impl : ( 'Then' ) ;
    public final void rule__ActionDelimiter__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1818:1: ( ( 'Then' ) )
            // InternalRoboProse.g:1819:1: ( 'Then' )
            {
            // InternalRoboProse.g:1819:1: ( 'Then' )
            // InternalRoboProse.g:1820:2: 'Then'
            {
             before(grammarAccess.getActionDelimiterAccess().getThenKeyword_0_2_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getActionDelimiterAccess().getThenKeyword_0_2_1()); 

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
    // $ANTLR end "rule__ActionDelimiter__Group_0_2__1__Impl"


    // $ANTLR start "rule__ActionDelimiter__Group_1__0"
    // InternalRoboProse.g:1830:1: rule__ActionDelimiter__Group_1__0 : rule__ActionDelimiter__Group_1__0__Impl rule__ActionDelimiter__Group_1__1 ;
    public final void rule__ActionDelimiter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1834:1: ( rule__ActionDelimiter__Group_1__0__Impl rule__ActionDelimiter__Group_1__1 )
            // InternalRoboProse.g:1835:2: rule__ActionDelimiter__Group_1__0__Impl rule__ActionDelimiter__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__ActionDelimiter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionDelimiter__Group_1__1();

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
    // $ANTLR end "rule__ActionDelimiter__Group_1__0"


    // $ANTLR start "rule__ActionDelimiter__Group_1__0__Impl"
    // InternalRoboProse.g:1842:1: rule__ActionDelimiter__Group_1__0__Impl : ( 'it' ) ;
    public final void rule__ActionDelimiter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1846:1: ( ( 'it' ) )
            // InternalRoboProse.g:1847:1: ( 'it' )
            {
            // InternalRoboProse.g:1847:1: ( 'it' )
            // InternalRoboProse.g:1848:2: 'it'
            {
             before(grammarAccess.getActionDelimiterAccess().getItKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getActionDelimiterAccess().getItKeyword_1_0()); 

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
    // $ANTLR end "rule__ActionDelimiter__Group_1__0__Impl"


    // $ANTLR start "rule__ActionDelimiter__Group_1__1"
    // InternalRoboProse.g:1857:1: rule__ActionDelimiter__Group_1__1 : rule__ActionDelimiter__Group_1__1__Impl ;
    public final void rule__ActionDelimiter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1861:1: ( rule__ActionDelimiter__Group_1__1__Impl )
            // InternalRoboProse.g:1862:2: rule__ActionDelimiter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionDelimiter__Group_1__1__Impl();

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
    // $ANTLR end "rule__ActionDelimiter__Group_1__1"


    // $ANTLR start "rule__ActionDelimiter__Group_1__1__Impl"
    // InternalRoboProse.g:1868:1: rule__ActionDelimiter__Group_1__1__Impl : ( 'should' ) ;
    public final void rule__ActionDelimiter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1872:1: ( ( 'should' ) )
            // InternalRoboProse.g:1873:1: ( 'should' )
            {
            // InternalRoboProse.g:1873:1: ( 'should' )
            // InternalRoboProse.g:1874:2: 'should'
            {
             before(grammarAccess.getActionDelimiterAccess().getShouldKeyword_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getActionDelimiterAccess().getShouldKeyword_1_1()); 

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
    // $ANTLR end "rule__ActionDelimiter__Group_1__1__Impl"


    // $ANTLR start "rule__ParagraphDelimiter__Group__0"
    // InternalRoboProse.g:1884:1: rule__ParagraphDelimiter__Group__0 : rule__ParagraphDelimiter__Group__0__Impl rule__ParagraphDelimiter__Group__1 ;
    public final void rule__ParagraphDelimiter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1888:1: ( rule__ParagraphDelimiter__Group__0__Impl rule__ParagraphDelimiter__Group__1 )
            // InternalRoboProse.g:1889:2: rule__ParagraphDelimiter__Group__0__Impl rule__ParagraphDelimiter__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ParagraphDelimiter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParagraphDelimiter__Group__1();

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
    // $ANTLR end "rule__ParagraphDelimiter__Group__0"


    // $ANTLR start "rule__ParagraphDelimiter__Group__0__Impl"
    // InternalRoboProse.g:1896:1: rule__ParagraphDelimiter__Group__0__Impl : ( '.' ) ;
    public final void rule__ParagraphDelimiter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1900:1: ( ( '.' ) )
            // InternalRoboProse.g:1901:1: ( '.' )
            {
            // InternalRoboProse.g:1901:1: ( '.' )
            // InternalRoboProse.g:1902:2: '.'
            {
             before(grammarAccess.getParagraphDelimiterAccess().getFullStopKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getParagraphDelimiterAccess().getFullStopKeyword_0()); 

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
    // $ANTLR end "rule__ParagraphDelimiter__Group__0__Impl"


    // $ANTLR start "rule__ParagraphDelimiter__Group__1"
    // InternalRoboProse.g:1911:1: rule__ParagraphDelimiter__Group__1 : rule__ParagraphDelimiter__Group__1__Impl rule__ParagraphDelimiter__Group__2 ;
    public final void rule__ParagraphDelimiter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1915:1: ( rule__ParagraphDelimiter__Group__1__Impl rule__ParagraphDelimiter__Group__2 )
            // InternalRoboProse.g:1916:2: rule__ParagraphDelimiter__Group__1__Impl rule__ParagraphDelimiter__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__ParagraphDelimiter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParagraphDelimiter__Group__2();

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
    // $ANTLR end "rule__ParagraphDelimiter__Group__1"


    // $ANTLR start "rule__ParagraphDelimiter__Group__1__Impl"
    // InternalRoboProse.g:1923:1: rule__ParagraphDelimiter__Group__1__Impl : ( RULE_NEWLINE ) ;
    public final void rule__ParagraphDelimiter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1927:1: ( ( RULE_NEWLINE ) )
            // InternalRoboProse.g:1928:1: ( RULE_NEWLINE )
            {
            // InternalRoboProse.g:1928:1: ( RULE_NEWLINE )
            // InternalRoboProse.g:1929:2: RULE_NEWLINE
            {
             before(grammarAccess.getParagraphDelimiterAccess().getNEWLINETerminalRuleCall_1()); 
            match(input,RULE_NEWLINE,FOLLOW_2); 
             after(grammarAccess.getParagraphDelimiterAccess().getNEWLINETerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ParagraphDelimiter__Group__1__Impl"


    // $ANTLR start "rule__ParagraphDelimiter__Group__2"
    // InternalRoboProse.g:1938:1: rule__ParagraphDelimiter__Group__2 : rule__ParagraphDelimiter__Group__2__Impl ;
    public final void rule__ParagraphDelimiter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1942:1: ( rule__ParagraphDelimiter__Group__2__Impl )
            // InternalRoboProse.g:1943:2: rule__ParagraphDelimiter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParagraphDelimiter__Group__2__Impl();

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
    // $ANTLR end "rule__ParagraphDelimiter__Group__2"


    // $ANTLR start "rule__ParagraphDelimiter__Group__2__Impl"
    // InternalRoboProse.g:1949:1: rule__ParagraphDelimiter__Group__2__Impl : ( ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* ) ) ;
    public final void rule__ParagraphDelimiter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1953:1: ( ( ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* ) ) )
            // InternalRoboProse.g:1954:1: ( ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* ) )
            {
            // InternalRoboProse.g:1954:1: ( ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* ) )
            // InternalRoboProse.g:1955:2: ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* )
            {
            // InternalRoboProse.g:1955:2: ( ( RULE_NEWLINE ) )
            // InternalRoboProse.g:1956:3: ( RULE_NEWLINE )
            {
             before(grammarAccess.getParagraphDelimiterAccess().getNEWLINETerminalRuleCall_2()); 
            // InternalRoboProse.g:1957:3: ( RULE_NEWLINE )
            // InternalRoboProse.g:1957:4: RULE_NEWLINE
            {
            match(input,RULE_NEWLINE,FOLLOW_20); 

            }

             after(grammarAccess.getParagraphDelimiterAccess().getNEWLINETerminalRuleCall_2()); 

            }

            // InternalRoboProse.g:1960:2: ( ( RULE_NEWLINE )* )
            // InternalRoboProse.g:1961:3: ( RULE_NEWLINE )*
            {
             before(grammarAccess.getParagraphDelimiterAccess().getNEWLINETerminalRuleCall_2()); 
            // InternalRoboProse.g:1962:3: ( RULE_NEWLINE )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_NEWLINE) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRoboProse.g:1962:4: RULE_NEWLINE
            	    {
            	    match(input,RULE_NEWLINE,FOLLOW_20); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getParagraphDelimiterAccess().getNEWLINETerminalRuleCall_2()); 

            }


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
    // $ANTLR end "rule__ParagraphDelimiter__Group__2__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // InternalRoboProse.g:1972:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1976:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalRoboProse.g:1977:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__1();

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
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // InternalRoboProse.g:1984:1: rule__Move__Group__0__Impl : ( () ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1988:1: ( ( () ) )
            // InternalRoboProse.g:1989:1: ( () )
            {
            // InternalRoboProse.g:1989:1: ( () )
            // InternalRoboProse.g:1990:2: ()
            {
             before(grammarAccess.getMoveAccess().getMoveAction_0()); 
            // InternalRoboProse.g:1991:2: ()
            // InternalRoboProse.g:1991:3: 
            {
            }

             after(grammarAccess.getMoveAccess().getMoveAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // InternalRoboProse.g:1999:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2003:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // InternalRoboProse.g:2004:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__2();

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
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // InternalRoboProse.g:2011:1: rule__Move__Group__1__Impl : ( 'move' ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2015:1: ( ( 'move' ) )
            // InternalRoboProse.g:2016:1: ( 'move' )
            {
            // InternalRoboProse.g:2016:1: ( 'move' )
            // InternalRoboProse.g:2017:2: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getMoveKeyword_1()); 

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
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__2"
    // InternalRoboProse.g:2026:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2030:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // InternalRoboProse.g:2031:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__3();

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
    // $ANTLR end "rule__Move__Group__2"


    // $ANTLR start "rule__Move__Group__2__Impl"
    // InternalRoboProse.g:2038:1: rule__Move__Group__2__Impl : ( ( rule__Move__DirectionAssignment_2 )? ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2042:1: ( ( ( rule__Move__DirectionAssignment_2 )? ) )
            // InternalRoboProse.g:2043:1: ( ( rule__Move__DirectionAssignment_2 )? )
            {
            // InternalRoboProse.g:2043:1: ( ( rule__Move__DirectionAssignment_2 )? )
            // InternalRoboProse.g:2044:2: ( rule__Move__DirectionAssignment_2 )?
            {
             before(grammarAccess.getMoveAccess().getDirectionAssignment_2()); 
            // InternalRoboProse.g:2045:2: ( rule__Move__DirectionAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=17 && LA20_0<=21)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRoboProse.g:2045:3: rule__Move__DirectionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Move__DirectionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoveAccess().getDirectionAssignment_2()); 

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
    // $ANTLR end "rule__Move__Group__2__Impl"


    // $ANTLR start "rule__Move__Group__3"
    // InternalRoboProse.g:2053:1: rule__Move__Group__3 : rule__Move__Group__3__Impl ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2057:1: ( rule__Move__Group__3__Impl )
            // InternalRoboProse.g:2058:2: rule__Move__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__3__Impl();

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
    // $ANTLR end "rule__Move__Group__3"


    // $ANTLR start "rule__Move__Group__3__Impl"
    // InternalRoboProse.g:2064:1: rule__Move__Group__3__Impl : ( ( rule__Move__Alternatives_3 )? ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2068:1: ( ( ( rule__Move__Alternatives_3 )? ) )
            // InternalRoboProse.g:2069:1: ( ( rule__Move__Alternatives_3 )? )
            {
            // InternalRoboProse.g:2069:1: ( ( rule__Move__Alternatives_3 )? )
            // InternalRoboProse.g:2070:2: ( rule__Move__Alternatives_3 )?
            {
             before(grammarAccess.getMoveAccess().getAlternatives_3()); 
            // InternalRoboProse.g:2071:2: ( rule__Move__Alternatives_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=24 && LA21_0<=25)||LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRoboProse.g:2071:3: rule__Move__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Move__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoveAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Move__Group__3__Impl"


    // $ANTLR start "rule__Move__Group_3_0__0"
    // InternalRoboProse.g:2080:1: rule__Move__Group_3_0__0 : rule__Move__Group_3_0__0__Impl rule__Move__Group_3_0__1 ;
    public final void rule__Move__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2084:1: ( rule__Move__Group_3_0__0__Impl rule__Move__Group_3_0__1 )
            // InternalRoboProse.g:2085:2: rule__Move__Group_3_0__0__Impl rule__Move__Group_3_0__1
            {
            pushFollow(FOLLOW_23);
            rule__Move__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_3_0__1();

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
    // $ANTLR end "rule__Move__Group_3_0__0"


    // $ANTLR start "rule__Move__Group_3_0__0__Impl"
    // InternalRoboProse.g:2092:1: rule__Move__Group_3_0__0__Impl : ( 'for' ) ;
    public final void rule__Move__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2096:1: ( ( 'for' ) )
            // InternalRoboProse.g:2097:1: ( 'for' )
            {
            // InternalRoboProse.g:2097:1: ( 'for' )
            // InternalRoboProse.g:2098:2: 'for'
            {
             before(grammarAccess.getMoveAccess().getForKeyword_3_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getForKeyword_3_0_0()); 

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
    // $ANTLR end "rule__Move__Group_3_0__0__Impl"


    // $ANTLR start "rule__Move__Group_3_0__1"
    // InternalRoboProse.g:2107:1: rule__Move__Group_3_0__1 : rule__Move__Group_3_0__1__Impl rule__Move__Group_3_0__2 ;
    public final void rule__Move__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2111:1: ( rule__Move__Group_3_0__1__Impl rule__Move__Group_3_0__2 )
            // InternalRoboProse.g:2112:2: rule__Move__Group_3_0__1__Impl rule__Move__Group_3_0__2
            {
            pushFollow(FOLLOW_24);
            rule__Move__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_3_0__2();

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
    // $ANTLR end "rule__Move__Group_3_0__1"


    // $ANTLR start "rule__Move__Group_3_0__1__Impl"
    // InternalRoboProse.g:2119:1: rule__Move__Group_3_0__1__Impl : ( ( rule__Move__DurationAssignment_3_0_1 ) ) ;
    public final void rule__Move__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2123:1: ( ( ( rule__Move__DurationAssignment_3_0_1 ) ) )
            // InternalRoboProse.g:2124:1: ( ( rule__Move__DurationAssignment_3_0_1 ) )
            {
            // InternalRoboProse.g:2124:1: ( ( rule__Move__DurationAssignment_3_0_1 ) )
            // InternalRoboProse.g:2125:2: ( rule__Move__DurationAssignment_3_0_1 )
            {
             before(grammarAccess.getMoveAccess().getDurationAssignment_3_0_1()); 
            // InternalRoboProse.g:2126:2: ( rule__Move__DurationAssignment_3_0_1 )
            // InternalRoboProse.g:2126:3: rule__Move__DurationAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Move__DurationAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getDurationAssignment_3_0_1()); 

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
    // $ANTLR end "rule__Move__Group_3_0__1__Impl"


    // $ANTLR start "rule__Move__Group_3_0__2"
    // InternalRoboProse.g:2134:1: rule__Move__Group_3_0__2 : rule__Move__Group_3_0__2__Impl ;
    public final void rule__Move__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2138:1: ( rule__Move__Group_3_0__2__Impl )
            // InternalRoboProse.g:2139:2: rule__Move__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group_3_0__2__Impl();

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
    // $ANTLR end "rule__Move__Group_3_0__2"


    // $ANTLR start "rule__Move__Group_3_0__2__Impl"
    // InternalRoboProse.g:2145:1: rule__Move__Group_3_0__2__Impl : ( 'seconds' ) ;
    public final void rule__Move__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2149:1: ( ( 'seconds' ) )
            // InternalRoboProse.g:2150:1: ( 'seconds' )
            {
            // InternalRoboProse.g:2150:1: ( 'seconds' )
            // InternalRoboProse.g:2151:2: 'seconds'
            {
             before(grammarAccess.getMoveAccess().getSecondsKeyword_3_0_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getSecondsKeyword_3_0_2()); 

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
    // $ANTLR end "rule__Move__Group_3_0__2__Impl"


    // $ANTLR start "rule__Turn__Group__0"
    // InternalRoboProse.g:2161:1: rule__Turn__Group__0 : rule__Turn__Group__0__Impl rule__Turn__Group__1 ;
    public final void rule__Turn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2165:1: ( rule__Turn__Group__0__Impl rule__Turn__Group__1 )
            // InternalRoboProse.g:2166:2: rule__Turn__Group__0__Impl rule__Turn__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Turn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Turn__Group__1();

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
    // $ANTLR end "rule__Turn__Group__0"


    // $ANTLR start "rule__Turn__Group__0__Impl"
    // InternalRoboProse.g:2173:1: rule__Turn__Group__0__Impl : ( () ) ;
    public final void rule__Turn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2177:1: ( ( () ) )
            // InternalRoboProse.g:2178:1: ( () )
            {
            // InternalRoboProse.g:2178:1: ( () )
            // InternalRoboProse.g:2179:2: ()
            {
             before(grammarAccess.getTurnAccess().getTurnAction_0()); 
            // InternalRoboProse.g:2180:2: ()
            // InternalRoboProse.g:2180:3: 
            {
            }

             after(grammarAccess.getTurnAccess().getTurnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Turn__Group__0__Impl"


    // $ANTLR start "rule__Turn__Group__1"
    // InternalRoboProse.g:2188:1: rule__Turn__Group__1 : rule__Turn__Group__1__Impl rule__Turn__Group__2 ;
    public final void rule__Turn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2192:1: ( rule__Turn__Group__1__Impl rule__Turn__Group__2 )
            // InternalRoboProse.g:2193:2: rule__Turn__Group__1__Impl rule__Turn__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Turn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Turn__Group__2();

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
    // $ANTLR end "rule__Turn__Group__1"


    // $ANTLR start "rule__Turn__Group__1__Impl"
    // InternalRoboProse.g:2200:1: rule__Turn__Group__1__Impl : ( 'turn' ) ;
    public final void rule__Turn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2204:1: ( ( 'turn' ) )
            // InternalRoboProse.g:2205:1: ( 'turn' )
            {
            // InternalRoboProse.g:2205:1: ( 'turn' )
            // InternalRoboProse.g:2206:2: 'turn'
            {
             before(grammarAccess.getTurnAccess().getTurnKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTurnAccess().getTurnKeyword_1()); 

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
    // $ANTLR end "rule__Turn__Group__1__Impl"


    // $ANTLR start "rule__Turn__Group__2"
    // InternalRoboProse.g:2215:1: rule__Turn__Group__2 : rule__Turn__Group__2__Impl rule__Turn__Group__3 ;
    public final void rule__Turn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2219:1: ( rule__Turn__Group__2__Impl rule__Turn__Group__3 )
            // InternalRoboProse.g:2220:2: rule__Turn__Group__2__Impl rule__Turn__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Turn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Turn__Group__3();

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
    // $ANTLR end "rule__Turn__Group__2"


    // $ANTLR start "rule__Turn__Group__2__Impl"
    // InternalRoboProse.g:2227:1: rule__Turn__Group__2__Impl : ( ( rule__Turn__DirectionAssignment_2 )? ) ;
    public final void rule__Turn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2231:1: ( ( ( rule__Turn__DirectionAssignment_2 )? ) )
            // InternalRoboProse.g:2232:1: ( ( rule__Turn__DirectionAssignment_2 )? )
            {
            // InternalRoboProse.g:2232:1: ( ( rule__Turn__DirectionAssignment_2 )? )
            // InternalRoboProse.g:2233:2: ( rule__Turn__DirectionAssignment_2 )?
            {
             before(grammarAccess.getTurnAccess().getDirectionAssignment_2()); 
            // InternalRoboProse.g:2234:2: ( rule__Turn__DirectionAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=22 && LA22_0<=23)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRoboProse.g:2234:3: rule__Turn__DirectionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Turn__DirectionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTurnAccess().getDirectionAssignment_2()); 

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
    // $ANTLR end "rule__Turn__Group__2__Impl"


    // $ANTLR start "rule__Turn__Group__3"
    // InternalRoboProse.g:2242:1: rule__Turn__Group__3 : rule__Turn__Group__3__Impl ;
    public final void rule__Turn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2246:1: ( rule__Turn__Group__3__Impl )
            // InternalRoboProse.g:2247:2: rule__Turn__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Turn__Group__3__Impl();

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
    // $ANTLR end "rule__Turn__Group__3"


    // $ANTLR start "rule__Turn__Group__3__Impl"
    // InternalRoboProse.g:2253:1: rule__Turn__Group__3__Impl : ( ( rule__Turn__Alternatives_3 )? ) ;
    public final void rule__Turn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2257:1: ( ( ( rule__Turn__Alternatives_3 )? ) )
            // InternalRoboProse.g:2258:1: ( ( rule__Turn__Alternatives_3 )? )
            {
            // InternalRoboProse.g:2258:1: ( ( rule__Turn__Alternatives_3 )? )
            // InternalRoboProse.g:2259:2: ( rule__Turn__Alternatives_3 )?
            {
             before(grammarAccess.getTurnAccess().getAlternatives_3()); 
            // InternalRoboProse.g:2260:2: ( rule__Turn__Alternatives_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT||(LA23_0>=24 && LA23_0<=25)||LA23_0==38||LA23_0==43) ) {
                alt23=1;
            }
            else if ( (LA23_0==12) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==RULE_INT) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalRoboProse.g:2260:3: rule__Turn__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Turn__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTurnAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Turn__Group__3__Impl"


    // $ANTLR start "rule__Turn__Group_3_0__0"
    // InternalRoboProse.g:2269:1: rule__Turn__Group_3_0__0 : rule__Turn__Group_3_0__0__Impl rule__Turn__Group_3_0__1 ;
    public final void rule__Turn__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2273:1: ( rule__Turn__Group_3_0__0__Impl rule__Turn__Group_3_0__1 )
            // InternalRoboProse.g:2274:2: rule__Turn__Group_3_0__0__Impl rule__Turn__Group_3_0__1
            {
            pushFollow(FOLLOW_23);
            rule__Turn__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Turn__Group_3_0__1();

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
    // $ANTLR end "rule__Turn__Group_3_0__0"


    // $ANTLR start "rule__Turn__Group_3_0__0__Impl"
    // InternalRoboProse.g:2281:1: rule__Turn__Group_3_0__0__Impl : ( 'for' ) ;
    public final void rule__Turn__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2285:1: ( ( 'for' ) )
            // InternalRoboProse.g:2286:1: ( 'for' )
            {
            // InternalRoboProse.g:2286:1: ( 'for' )
            // InternalRoboProse.g:2287:2: 'for'
            {
             before(grammarAccess.getTurnAccess().getForKeyword_3_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTurnAccess().getForKeyword_3_0_0()); 

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
    // $ANTLR end "rule__Turn__Group_3_0__0__Impl"


    // $ANTLR start "rule__Turn__Group_3_0__1"
    // InternalRoboProse.g:2296:1: rule__Turn__Group_3_0__1 : rule__Turn__Group_3_0__1__Impl rule__Turn__Group_3_0__2 ;
    public final void rule__Turn__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2300:1: ( rule__Turn__Group_3_0__1__Impl rule__Turn__Group_3_0__2 )
            // InternalRoboProse.g:2301:2: rule__Turn__Group_3_0__1__Impl rule__Turn__Group_3_0__2
            {
            pushFollow(FOLLOW_24);
            rule__Turn__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Turn__Group_3_0__2();

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
    // $ANTLR end "rule__Turn__Group_3_0__1"


    // $ANTLR start "rule__Turn__Group_3_0__1__Impl"
    // InternalRoboProse.g:2308:1: rule__Turn__Group_3_0__1__Impl : ( ( rule__Turn__DurationAssignment_3_0_1 ) ) ;
    public final void rule__Turn__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2312:1: ( ( ( rule__Turn__DurationAssignment_3_0_1 ) ) )
            // InternalRoboProse.g:2313:1: ( ( rule__Turn__DurationAssignment_3_0_1 ) )
            {
            // InternalRoboProse.g:2313:1: ( ( rule__Turn__DurationAssignment_3_0_1 ) )
            // InternalRoboProse.g:2314:2: ( rule__Turn__DurationAssignment_3_0_1 )
            {
             before(grammarAccess.getTurnAccess().getDurationAssignment_3_0_1()); 
            // InternalRoboProse.g:2315:2: ( rule__Turn__DurationAssignment_3_0_1 )
            // InternalRoboProse.g:2315:3: rule__Turn__DurationAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Turn__DurationAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTurnAccess().getDurationAssignment_3_0_1()); 

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
    // $ANTLR end "rule__Turn__Group_3_0__1__Impl"


    // $ANTLR start "rule__Turn__Group_3_0__2"
    // InternalRoboProse.g:2323:1: rule__Turn__Group_3_0__2 : rule__Turn__Group_3_0__2__Impl ;
    public final void rule__Turn__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2327:1: ( rule__Turn__Group_3_0__2__Impl )
            // InternalRoboProse.g:2328:2: rule__Turn__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Turn__Group_3_0__2__Impl();

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
    // $ANTLR end "rule__Turn__Group_3_0__2"


    // $ANTLR start "rule__Turn__Group_3_0__2__Impl"
    // InternalRoboProse.g:2334:1: rule__Turn__Group_3_0__2__Impl : ( 'seconds' ) ;
    public final void rule__Turn__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2338:1: ( ( 'seconds' ) )
            // InternalRoboProse.g:2339:1: ( 'seconds' )
            {
            // InternalRoboProse.g:2339:1: ( 'seconds' )
            // InternalRoboProse.g:2340:2: 'seconds'
            {
             before(grammarAccess.getTurnAccess().getSecondsKeyword_3_0_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTurnAccess().getSecondsKeyword_3_0_2()); 

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
    // $ANTLR end "rule__Turn__Group_3_0__2__Impl"


    // $ANTLR start "rule__Turn__Group_3_1__0"
    // InternalRoboProse.g:2350:1: rule__Turn__Group_3_1__0 : rule__Turn__Group_3_1__0__Impl rule__Turn__Group_3_1__1 ;
    public final void rule__Turn__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2354:1: ( rule__Turn__Group_3_1__0__Impl rule__Turn__Group_3_1__1 )
            // InternalRoboProse.g:2355:2: rule__Turn__Group_3_1__0__Impl rule__Turn__Group_3_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Turn__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Turn__Group_3_1__1();

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
    // $ANTLR end "rule__Turn__Group_3_1__0"


    // $ANTLR start "rule__Turn__Group_3_1__0__Impl"
    // InternalRoboProse.g:2362:1: rule__Turn__Group_3_1__0__Impl : ( ( rule__Turn__DegreesAssignment_3_1_0 ) ) ;
    public final void rule__Turn__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2366:1: ( ( ( rule__Turn__DegreesAssignment_3_1_0 ) ) )
            // InternalRoboProse.g:2367:1: ( ( rule__Turn__DegreesAssignment_3_1_0 ) )
            {
            // InternalRoboProse.g:2367:1: ( ( rule__Turn__DegreesAssignment_3_1_0 ) )
            // InternalRoboProse.g:2368:2: ( rule__Turn__DegreesAssignment_3_1_0 )
            {
             before(grammarAccess.getTurnAccess().getDegreesAssignment_3_1_0()); 
            // InternalRoboProse.g:2369:2: ( rule__Turn__DegreesAssignment_3_1_0 )
            // InternalRoboProse.g:2369:3: rule__Turn__DegreesAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Turn__DegreesAssignment_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTurnAccess().getDegreesAssignment_3_1_0()); 

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
    // $ANTLR end "rule__Turn__Group_3_1__0__Impl"


    // $ANTLR start "rule__Turn__Group_3_1__1"
    // InternalRoboProse.g:2377:1: rule__Turn__Group_3_1__1 : rule__Turn__Group_3_1__1__Impl ;
    public final void rule__Turn__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2381:1: ( rule__Turn__Group_3_1__1__Impl )
            // InternalRoboProse.g:2382:2: rule__Turn__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Turn__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Turn__Group_3_1__1"


    // $ANTLR start "rule__Turn__Group_3_1__1__Impl"
    // InternalRoboProse.g:2388:1: rule__Turn__Group_3_1__1__Impl : ( 'degrees' ) ;
    public final void rule__Turn__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2392:1: ( ( 'degrees' ) )
            // InternalRoboProse.g:2393:1: ( 'degrees' )
            {
            // InternalRoboProse.g:2393:1: ( 'degrees' )
            // InternalRoboProse.g:2394:2: 'degrees'
            {
             before(grammarAccess.getTurnAccess().getDegreesKeyword_3_1_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTurnAccess().getDegreesKeyword_3_1_1()); 

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
    // $ANTLR end "rule__Turn__Group_3_1__1__Impl"


    // $ANTLR start "rule__Stop__Group__0"
    // InternalRoboProse.g:2404:1: rule__Stop__Group__0 : rule__Stop__Group__0__Impl rule__Stop__Group__1 ;
    public final void rule__Stop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2408:1: ( rule__Stop__Group__0__Impl rule__Stop__Group__1 )
            // InternalRoboProse.g:2409:2: rule__Stop__Group__0__Impl rule__Stop__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Stop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stop__Group__1();

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
    // $ANTLR end "rule__Stop__Group__0"


    // $ANTLR start "rule__Stop__Group__0__Impl"
    // InternalRoboProse.g:2416:1: rule__Stop__Group__0__Impl : ( () ) ;
    public final void rule__Stop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2420:1: ( ( () ) )
            // InternalRoboProse.g:2421:1: ( () )
            {
            // InternalRoboProse.g:2421:1: ( () )
            // InternalRoboProse.g:2422:2: ()
            {
             before(grammarAccess.getStopAccess().getStopAction_0()); 
            // InternalRoboProse.g:2423:2: ()
            // InternalRoboProse.g:2423:3: 
            {
            }

             after(grammarAccess.getStopAccess().getStopAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__0__Impl"


    // $ANTLR start "rule__Stop__Group__1"
    // InternalRoboProse.g:2431:1: rule__Stop__Group__1 : rule__Stop__Group__1__Impl rule__Stop__Group__2 ;
    public final void rule__Stop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2435:1: ( rule__Stop__Group__1__Impl rule__Stop__Group__2 )
            // InternalRoboProse.g:2436:2: rule__Stop__Group__1__Impl rule__Stop__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Stop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stop__Group__2();

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
    // $ANTLR end "rule__Stop__Group__1"


    // $ANTLR start "rule__Stop__Group__1__Impl"
    // InternalRoboProse.g:2443:1: rule__Stop__Group__1__Impl : ( 'stop' ) ;
    public final void rule__Stop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2447:1: ( ( 'stop' ) )
            // InternalRoboProse.g:2448:1: ( 'stop' )
            {
            // InternalRoboProse.g:2448:1: ( 'stop' )
            // InternalRoboProse.g:2449:2: 'stop'
            {
             before(grammarAccess.getStopAccess().getStopKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getStopAccess().getStopKeyword_1()); 

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
    // $ANTLR end "rule__Stop__Group__1__Impl"


    // $ANTLR start "rule__Stop__Group__2"
    // InternalRoboProse.g:2458:1: rule__Stop__Group__2 : rule__Stop__Group__2__Impl ;
    public final void rule__Stop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2462:1: ( rule__Stop__Group__2__Impl )
            // InternalRoboProse.g:2463:2: rule__Stop__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stop__Group__2__Impl();

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
    // $ANTLR end "rule__Stop__Group__2"


    // $ANTLR start "rule__Stop__Group__2__Impl"
    // InternalRoboProse.g:2469:1: rule__Stop__Group__2__Impl : ( ( rule__Stop__Group_2__0 )? ) ;
    public final void rule__Stop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2473:1: ( ( ( rule__Stop__Group_2__0 )? ) )
            // InternalRoboProse.g:2474:1: ( ( rule__Stop__Group_2__0 )? )
            {
            // InternalRoboProse.g:2474:1: ( ( rule__Stop__Group_2__0 )? )
            // InternalRoboProse.g:2475:2: ( rule__Stop__Group_2__0 )?
            {
             before(grammarAccess.getStopAccess().getGroup_2()); 
            // InternalRoboProse.g:2476:2: ( rule__Stop__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRoboProse.g:2476:3: rule__Stop__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Stop__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStopAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Stop__Group__2__Impl"


    // $ANTLR start "rule__Stop__Group_2__0"
    // InternalRoboProse.g:2485:1: rule__Stop__Group_2__0 : rule__Stop__Group_2__0__Impl rule__Stop__Group_2__1 ;
    public final void rule__Stop__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2489:1: ( rule__Stop__Group_2__0__Impl rule__Stop__Group_2__1 )
            // InternalRoboProse.g:2490:2: rule__Stop__Group_2__0__Impl rule__Stop__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__Stop__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stop__Group_2__1();

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
    // $ANTLR end "rule__Stop__Group_2__0"


    // $ANTLR start "rule__Stop__Group_2__0__Impl"
    // InternalRoboProse.g:2497:1: rule__Stop__Group_2__0__Impl : ( 'for' ) ;
    public final void rule__Stop__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2501:1: ( ( 'for' ) )
            // InternalRoboProse.g:2502:1: ( 'for' )
            {
            // InternalRoboProse.g:2502:1: ( 'for' )
            // InternalRoboProse.g:2503:2: 'for'
            {
             before(grammarAccess.getStopAccess().getForKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStopAccess().getForKeyword_2_0()); 

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
    // $ANTLR end "rule__Stop__Group_2__0__Impl"


    // $ANTLR start "rule__Stop__Group_2__1"
    // InternalRoboProse.g:2512:1: rule__Stop__Group_2__1 : rule__Stop__Group_2__1__Impl rule__Stop__Group_2__2 ;
    public final void rule__Stop__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2516:1: ( rule__Stop__Group_2__1__Impl rule__Stop__Group_2__2 )
            // InternalRoboProse.g:2517:2: rule__Stop__Group_2__1__Impl rule__Stop__Group_2__2
            {
            pushFollow(FOLLOW_24);
            rule__Stop__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stop__Group_2__2();

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
    // $ANTLR end "rule__Stop__Group_2__1"


    // $ANTLR start "rule__Stop__Group_2__1__Impl"
    // InternalRoboProse.g:2524:1: rule__Stop__Group_2__1__Impl : ( ( rule__Stop__DurationAssignment_2_1 ) ) ;
    public final void rule__Stop__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2528:1: ( ( ( rule__Stop__DurationAssignment_2_1 ) ) )
            // InternalRoboProse.g:2529:1: ( ( rule__Stop__DurationAssignment_2_1 ) )
            {
            // InternalRoboProse.g:2529:1: ( ( rule__Stop__DurationAssignment_2_1 ) )
            // InternalRoboProse.g:2530:2: ( rule__Stop__DurationAssignment_2_1 )
            {
             before(grammarAccess.getStopAccess().getDurationAssignment_2_1()); 
            // InternalRoboProse.g:2531:2: ( rule__Stop__DurationAssignment_2_1 )
            // InternalRoboProse.g:2531:3: rule__Stop__DurationAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Stop__DurationAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStopAccess().getDurationAssignment_2_1()); 

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
    // $ANTLR end "rule__Stop__Group_2__1__Impl"


    // $ANTLR start "rule__Stop__Group_2__2"
    // InternalRoboProse.g:2539:1: rule__Stop__Group_2__2 : rule__Stop__Group_2__2__Impl ;
    public final void rule__Stop__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2543:1: ( rule__Stop__Group_2__2__Impl )
            // InternalRoboProse.g:2544:2: rule__Stop__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stop__Group_2__2__Impl();

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
    // $ANTLR end "rule__Stop__Group_2__2"


    // $ANTLR start "rule__Stop__Group_2__2__Impl"
    // InternalRoboProse.g:2550:1: rule__Stop__Group_2__2__Impl : ( 'seconds' ) ;
    public final void rule__Stop__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2554:1: ( ( 'seconds' ) )
            // InternalRoboProse.g:2555:1: ( 'seconds' )
            {
            // InternalRoboProse.g:2555:1: ( 'seconds' )
            // InternalRoboProse.g:2556:2: 'seconds'
            {
             before(grammarAccess.getStopAccess().getSecondsKeyword_2_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStopAccess().getSecondsKeyword_2_2()); 

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
    // $ANTLR end "rule__Stop__Group_2__2__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalRoboProse.g:2566:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2570:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalRoboProse.g:2571:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

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
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalRoboProse.g:2578:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2582:1: ( ( ( '-' )? ) )
            // InternalRoboProse.g:2583:1: ( ( '-' )? )
            {
            // InternalRoboProse.g:2583:1: ( ( '-' )? )
            // InternalRoboProse.g:2584:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalRoboProse.g:2585:2: ( '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRoboProse.g:2585:3: '-'
                    {
                    match(input,43,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalRoboProse.g:2593:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2597:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalRoboProse.g:2598:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

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
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalRoboProse.g:2605:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2609:1: ( ( ( RULE_INT )? ) )
            // InternalRoboProse.g:2610:1: ( ( RULE_INT )? )
            {
            // InternalRoboProse.g:2610:1: ( ( RULE_INT )? )
            // InternalRoboProse.g:2611:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalRoboProse.g:2612:2: ( RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RULE_INT||LA26_1==12) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalRoboProse.g:2612:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalRoboProse.g:2620:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2624:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalRoboProse.g:2625:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

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
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalRoboProse.g:2632:1: rule__EFloat__Group__2__Impl : ( ( '.' )? ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2636:1: ( ( ( '.' )? ) )
            // InternalRoboProse.g:2637:1: ( ( '.' )? )
            {
            // InternalRoboProse.g:2637:1: ( ( '.' )? )
            // InternalRoboProse.g:2638:2: ( '.' )?
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            // InternalRoboProse.g:2639:2: ( '.' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==12) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRoboProse.g:2639:3: '.'
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalRoboProse.g:2647:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2651:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalRoboProse.g:2652:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

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
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalRoboProse.g:2659:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2663:1: ( ( RULE_INT ) )
            // InternalRoboProse.g:2664:1: ( RULE_INT )
            {
            // InternalRoboProse.g:2664:1: ( RULE_INT )
            // InternalRoboProse.g:2665:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalRoboProse.g:2674:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2678:1: ( rule__EFloat__Group__4__Impl )
            // InternalRoboProse.g:2679:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

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
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalRoboProse.g:2685:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2689:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalRoboProse.g:2690:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalRoboProse.g:2690:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalRoboProse.g:2691:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalRoboProse.g:2692:2: ( rule__EFloat__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=15 && LA28_0<=16)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRoboProse.g:2692:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalRoboProse.g:2701:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2705:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalRoboProse.g:2706:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_30);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

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
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalRoboProse.g:2713:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2717:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalRoboProse.g:2718:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalRoboProse.g:2718:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalRoboProse.g:2719:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalRoboProse.g:2720:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalRoboProse.g:2720:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalRoboProse.g:2728:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2732:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalRoboProse.g:2733:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_30);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

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
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalRoboProse.g:2740:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2744:1: ( ( ( '-' )? ) )
            // InternalRoboProse.g:2745:1: ( ( '-' )? )
            {
            // InternalRoboProse.g:2745:1: ( ( '-' )? )
            // InternalRoboProse.g:2746:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalRoboProse.g:2747:2: ( '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRoboProse.g:2747:3: '-'
                    {
                    match(input,43,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalRoboProse.g:2755:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2759:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalRoboProse.g:2760:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

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
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalRoboProse.g:2766:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2770:1: ( ( RULE_INT ) )
            // InternalRoboProse.g:2771:1: ( RULE_INT )
            {
            // InternalRoboProse.g:2771:1: ( RULE_INT )
            // InternalRoboProse.g:2772:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__Obstacle__Group__0"
    // InternalRoboProse.g:2782:1: rule__Obstacle__Group__0 : rule__Obstacle__Group__0__Impl rule__Obstacle__Group__1 ;
    public final void rule__Obstacle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2786:1: ( rule__Obstacle__Group__0__Impl rule__Obstacle__Group__1 )
            // InternalRoboProse.g:2787:2: rule__Obstacle__Group__0__Impl rule__Obstacle__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Obstacle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__1();

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
    // $ANTLR end "rule__Obstacle__Group__0"


    // $ANTLR start "rule__Obstacle__Group__0__Impl"
    // InternalRoboProse.g:2794:1: rule__Obstacle__Group__0__Impl : ( () ) ;
    public final void rule__Obstacle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2798:1: ( ( () ) )
            // InternalRoboProse.g:2799:1: ( () )
            {
            // InternalRoboProse.g:2799:1: ( () )
            // InternalRoboProse.g:2800:2: ()
            {
             before(grammarAccess.getObstacleAccess().getObstacleAction_0()); 
            // InternalRoboProse.g:2801:2: ()
            // InternalRoboProse.g:2801:3: 
            {
            }

             after(grammarAccess.getObstacleAccess().getObstacleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obstacle__Group__0__Impl"


    // $ANTLR start "rule__Obstacle__Group__1"
    // InternalRoboProse.g:2809:1: rule__Obstacle__Group__1 : rule__Obstacle__Group__1__Impl rule__Obstacle__Group__2 ;
    public final void rule__Obstacle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2813:1: ( rule__Obstacle__Group__1__Impl rule__Obstacle__Group__2 )
            // InternalRoboProse.g:2814:2: rule__Obstacle__Group__1__Impl rule__Obstacle__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Obstacle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__2();

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
    // $ANTLR end "rule__Obstacle__Group__1"


    // $ANTLR start "rule__Obstacle__Group__1__Impl"
    // InternalRoboProse.g:2821:1: rule__Obstacle__Group__1__Impl : ( 'meets' ) ;
    public final void rule__Obstacle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2825:1: ( ( 'meets' ) )
            // InternalRoboProse.g:2826:1: ( 'meets' )
            {
            // InternalRoboProse.g:2826:1: ( 'meets' )
            // InternalRoboProse.g:2827:2: 'meets'
            {
             before(grammarAccess.getObstacleAccess().getMeetsKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getObstacleAccess().getMeetsKeyword_1()); 

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
    // $ANTLR end "rule__Obstacle__Group__1__Impl"


    // $ANTLR start "rule__Obstacle__Group__2"
    // InternalRoboProse.g:2836:1: rule__Obstacle__Group__2 : rule__Obstacle__Group__2__Impl rule__Obstacle__Group__3 ;
    public final void rule__Obstacle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2840:1: ( rule__Obstacle__Group__2__Impl rule__Obstacle__Group__3 )
            // InternalRoboProse.g:2841:2: rule__Obstacle__Group__2__Impl rule__Obstacle__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Obstacle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__3();

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
    // $ANTLR end "rule__Obstacle__Group__2"


    // $ANTLR start "rule__Obstacle__Group__2__Impl"
    // InternalRoboProse.g:2848:1: rule__Obstacle__Group__2__Impl : ( 'an' ) ;
    public final void rule__Obstacle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2852:1: ( ( 'an' ) )
            // InternalRoboProse.g:2853:1: ( 'an' )
            {
            // InternalRoboProse.g:2853:1: ( 'an' )
            // InternalRoboProse.g:2854:2: 'an'
            {
             before(grammarAccess.getObstacleAccess().getAnKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getObstacleAccess().getAnKeyword_2()); 

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
    // $ANTLR end "rule__Obstacle__Group__2__Impl"


    // $ANTLR start "rule__Obstacle__Group__3"
    // InternalRoboProse.g:2863:1: rule__Obstacle__Group__3 : rule__Obstacle__Group__3__Impl ;
    public final void rule__Obstacle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2867:1: ( rule__Obstacle__Group__3__Impl )
            // InternalRoboProse.g:2868:2: rule__Obstacle__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Obstacle__Group__3__Impl();

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
    // $ANTLR end "rule__Obstacle__Group__3"


    // $ANTLR start "rule__Obstacle__Group__3__Impl"
    // InternalRoboProse.g:2874:1: rule__Obstacle__Group__3__Impl : ( 'obstacle' ) ;
    public final void rule__Obstacle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2878:1: ( ( 'obstacle' ) )
            // InternalRoboProse.g:2879:1: ( 'obstacle' )
            {
            // InternalRoboProse.g:2879:1: ( 'obstacle' )
            // InternalRoboProse.g:2880:2: 'obstacle'
            {
             before(grammarAccess.getObstacleAccess().getObstacleKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getObstacleAccess().getObstacleKeyword_3()); 

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
    // $ANTLR end "rule__Obstacle__Group__3__Impl"


    // $ANTLR start "rule__Tapped__Group__0"
    // InternalRoboProse.g:2890:1: rule__Tapped__Group__0 : rule__Tapped__Group__0__Impl rule__Tapped__Group__1 ;
    public final void rule__Tapped__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2894:1: ( rule__Tapped__Group__0__Impl rule__Tapped__Group__1 )
            // InternalRoboProse.g:2895:2: rule__Tapped__Group__0__Impl rule__Tapped__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Tapped__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tapped__Group__1();

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
    // $ANTLR end "rule__Tapped__Group__0"


    // $ANTLR start "rule__Tapped__Group__0__Impl"
    // InternalRoboProse.g:2902:1: rule__Tapped__Group__0__Impl : ( () ) ;
    public final void rule__Tapped__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2906:1: ( ( () ) )
            // InternalRoboProse.g:2907:1: ( () )
            {
            // InternalRoboProse.g:2907:1: ( () )
            // InternalRoboProse.g:2908:2: ()
            {
             before(grammarAccess.getTappedAccess().getTappedAction_0()); 
            // InternalRoboProse.g:2909:2: ()
            // InternalRoboProse.g:2909:3: 
            {
            }

             after(grammarAccess.getTappedAccess().getTappedAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tapped__Group__0__Impl"


    // $ANTLR start "rule__Tapped__Group__1"
    // InternalRoboProse.g:2917:1: rule__Tapped__Group__1 : rule__Tapped__Group__1__Impl rule__Tapped__Group__2 ;
    public final void rule__Tapped__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2921:1: ( rule__Tapped__Group__1__Impl rule__Tapped__Group__2 )
            // InternalRoboProse.g:2922:2: rule__Tapped__Group__1__Impl rule__Tapped__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Tapped__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tapped__Group__2();

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
    // $ANTLR end "rule__Tapped__Group__1"


    // $ANTLR start "rule__Tapped__Group__1__Impl"
    // InternalRoboProse.g:2929:1: rule__Tapped__Group__1__Impl : ( 'is' ) ;
    public final void rule__Tapped__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2933:1: ( ( 'is' ) )
            // InternalRoboProse.g:2934:1: ( 'is' )
            {
            // InternalRoboProse.g:2934:1: ( 'is' )
            // InternalRoboProse.g:2935:2: 'is'
            {
             before(grammarAccess.getTappedAccess().getIsKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTappedAccess().getIsKeyword_1()); 

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
    // $ANTLR end "rule__Tapped__Group__1__Impl"


    // $ANTLR start "rule__Tapped__Group__2"
    // InternalRoboProse.g:2944:1: rule__Tapped__Group__2 : rule__Tapped__Group__2__Impl ;
    public final void rule__Tapped__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2948:1: ( rule__Tapped__Group__2__Impl )
            // InternalRoboProse.g:2949:2: rule__Tapped__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tapped__Group__2__Impl();

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
    // $ANTLR end "rule__Tapped__Group__2"


    // $ANTLR start "rule__Tapped__Group__2__Impl"
    // InternalRoboProse.g:2955:1: rule__Tapped__Group__2__Impl : ( 'tapped' ) ;
    public final void rule__Tapped__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2959:1: ( ( 'tapped' ) )
            // InternalRoboProse.g:2960:1: ( 'tapped' )
            {
            // InternalRoboProse.g:2960:1: ( 'tapped' )
            // InternalRoboProse.g:2961:2: 'tapped'
            {
             before(grammarAccess.getTappedAccess().getTappedKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTappedAccess().getTappedKeyword_2()); 

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
    // $ANTLR end "rule__Tapped__Group__2__Impl"


    // $ANTLR start "rule__RoboProse__MainAssignment_1_3"
    // InternalRoboProse.g:2971:1: rule__RoboProse__MainAssignment_1_3 : ( ruleMain ) ;
    public final void rule__RoboProse__MainAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2975:1: ( ( ruleMain ) )
            // InternalRoboProse.g:2976:2: ( ruleMain )
            {
            // InternalRoboProse.g:2976:2: ( ruleMain )
            // InternalRoboProse.g:2977:3: ruleMain
            {
             before(grammarAccess.getRoboProseAccess().getMainMainParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getRoboProseAccess().getMainMainParserRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__RoboProse__MainAssignment_1_3"


    // $ANTLR start "rule__RoboProse__ListenersAssignment_2_0"
    // InternalRoboProse.g:2986:1: rule__RoboProse__ListenersAssignment_2_0 : ( ruleEventListener ) ;
    public final void rule__RoboProse__ListenersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2990:1: ( ( ruleEventListener ) )
            // InternalRoboProse.g:2991:2: ( ruleEventListener )
            {
            // InternalRoboProse.g:2991:2: ( ruleEventListener )
            // InternalRoboProse.g:2992:3: ruleEventListener
            {
             before(grammarAccess.getRoboProseAccess().getListenersEventListenerParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEventListener();

            state._fsp--;

             after(grammarAccess.getRoboProseAccess().getListenersEventListenerParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__RoboProse__ListenersAssignment_2_0"


    // $ANTLR start "rule__RoboProse__ListenersAssignment_2_1_1"
    // InternalRoboProse.g:3001:1: rule__RoboProse__ListenersAssignment_2_1_1 : ( ruleEventListener ) ;
    public final void rule__RoboProse__ListenersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3005:1: ( ( ruleEventListener ) )
            // InternalRoboProse.g:3006:2: ( ruleEventListener )
            {
            // InternalRoboProse.g:3006:2: ( ruleEventListener )
            // InternalRoboProse.g:3007:3: ruleEventListener
            {
             before(grammarAccess.getRoboProseAccess().getListenersEventListenerParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEventListener();

            state._fsp--;

             after(grammarAccess.getRoboProseAccess().getListenersEventListenerParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__RoboProse__ListenersAssignment_2_1_1"


    // $ANTLR start "rule__Main__ActionsAssignment_0"
    // InternalRoboProse.g:3016:1: rule__Main__ActionsAssignment_0 : ( ruleAction ) ;
    public final void rule__Main__ActionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3020:1: ( ( ruleAction ) )
            // InternalRoboProse.g:3021:2: ( ruleAction )
            {
            // InternalRoboProse.g:3021:2: ( ruleAction )
            // InternalRoboProse.g:3022:3: ruleAction
            {
             before(grammarAccess.getMainAccess().getActionsActionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getMainAccess().getActionsActionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Main__ActionsAssignment_0"


    // $ANTLR start "rule__Main__ActionsAssignment_1_1"
    // InternalRoboProse.g:3031:1: rule__Main__ActionsAssignment_1_1 : ( ruleAction ) ;
    public final void rule__Main__ActionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3035:1: ( ( ruleAction ) )
            // InternalRoboProse.g:3036:2: ( ruleAction )
            {
            // InternalRoboProse.g:3036:2: ( ruleAction )
            // InternalRoboProse.g:3037:3: ruleAction
            {
             before(grammarAccess.getMainAccess().getActionsActionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getMainAccess().getActionsActionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Main__ActionsAssignment_1_1"


    // $ANTLR start "rule__EventListener__EventAssignment_2"
    // InternalRoboProse.g:3046:1: rule__EventListener__EventAssignment_2 : ( ruleEvent ) ;
    public final void rule__EventListener__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3050:1: ( ( ruleEvent ) )
            // InternalRoboProse.g:3051:2: ( ruleEvent )
            {
            // InternalRoboProse.g:3051:2: ( ruleEvent )
            // InternalRoboProse.g:3052:3: ruleEvent
            {
             before(grammarAccess.getEventListenerAccess().getEventEventParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventListenerAccess().getEventEventParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__EventListener__EventAssignment_2"


    // $ANTLR start "rule__EventListener__ActionsAssignment_5"
    // InternalRoboProse.g:3061:1: rule__EventListener__ActionsAssignment_5 : ( ruleAction ) ;
    public final void rule__EventListener__ActionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3065:1: ( ( ruleAction ) )
            // InternalRoboProse.g:3066:2: ( ruleAction )
            {
            // InternalRoboProse.g:3066:2: ( ruleAction )
            // InternalRoboProse.g:3067:3: ruleAction
            {
             before(grammarAccess.getEventListenerAccess().getActionsActionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getEventListenerAccess().getActionsActionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__EventListener__ActionsAssignment_5"


    // $ANTLR start "rule__EventListener__ActionsAssignment_6_1"
    // InternalRoboProse.g:3076:1: rule__EventListener__ActionsAssignment_6_1 : ( ruleAction ) ;
    public final void rule__EventListener__ActionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3080:1: ( ( ruleAction ) )
            // InternalRoboProse.g:3081:2: ( ruleAction )
            {
            // InternalRoboProse.g:3081:2: ( ruleAction )
            // InternalRoboProse.g:3082:3: ruleAction
            {
             before(grammarAccess.getEventListenerAccess().getActionsActionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getEventListenerAccess().getActionsActionParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__EventListener__ActionsAssignment_6_1"


    // $ANTLR start "rule__EventListener__SublistenersAssignment_7_2"
    // InternalRoboProse.g:3091:1: rule__EventListener__SublistenersAssignment_7_2 : ( ruleEventListener ) ;
    public final void rule__EventListener__SublistenersAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3095:1: ( ( ruleEventListener ) )
            // InternalRoboProse.g:3096:2: ( ruleEventListener )
            {
            // InternalRoboProse.g:3096:2: ( ruleEventListener )
            // InternalRoboProse.g:3097:3: ruleEventListener
            {
             before(grammarAccess.getEventListenerAccess().getSublistenersEventListenerParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEventListener();

            state._fsp--;

             after(grammarAccess.getEventListenerAccess().getSublistenersEventListenerParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__EventListener__SublistenersAssignment_7_2"


    // $ANTLR start "rule__EventListener__SublistenersAssignment_7_3_1"
    // InternalRoboProse.g:3106:1: rule__EventListener__SublistenersAssignment_7_3_1 : ( ruleEventListener ) ;
    public final void rule__EventListener__SublistenersAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3110:1: ( ( ruleEventListener ) )
            // InternalRoboProse.g:3111:2: ( ruleEventListener )
            {
            // InternalRoboProse.g:3111:2: ( ruleEventListener )
            // InternalRoboProse.g:3112:3: ruleEventListener
            {
             before(grammarAccess.getEventListenerAccess().getSublistenersEventListenerParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEventListener();

            state._fsp--;

             after(grammarAccess.getEventListenerAccess().getSublistenersEventListenerParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__EventListener__SublistenersAssignment_7_3_1"


    // $ANTLR start "rule__Move__DirectionAssignment_2"
    // InternalRoboProse.g:3121:1: rule__Move__DirectionAssignment_2 : ( ruleMOVE_DIRECTION ) ;
    public final void rule__Move__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3125:1: ( ( ruleMOVE_DIRECTION ) )
            // InternalRoboProse.g:3126:2: ( ruleMOVE_DIRECTION )
            {
            // InternalRoboProse.g:3126:2: ( ruleMOVE_DIRECTION )
            // InternalRoboProse.g:3127:3: ruleMOVE_DIRECTION
            {
             before(grammarAccess.getMoveAccess().getDirectionMOVE_DIRECTIONEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMOVE_DIRECTION();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getDirectionMOVE_DIRECTIONEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Move__DirectionAssignment_2"


    // $ANTLR start "rule__Move__DurationAssignment_3_0_1"
    // InternalRoboProse.g:3136:1: rule__Move__DurationAssignment_3_0_1 : ( ruleEFloat ) ;
    public final void rule__Move__DurationAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3140:1: ( ( ruleEFloat ) )
            // InternalRoboProse.g:3141:2: ( ruleEFloat )
            {
            // InternalRoboProse.g:3141:2: ( ruleEFloat )
            // InternalRoboProse.g:3142:3: ruleEFloat
            {
             before(grammarAccess.getMoveAccess().getDurationEFloatParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getDurationEFloatParserRuleCall_3_0_1_0()); 

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
    // $ANTLR end "rule__Move__DurationAssignment_3_0_1"


    // $ANTLR start "rule__Move__IsRandomAssignment_3_1"
    // InternalRoboProse.g:3151:1: rule__Move__IsRandomAssignment_3_1 : ( ruleRANDOM ) ;
    public final void rule__Move__IsRandomAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3155:1: ( ( ruleRANDOM ) )
            // InternalRoboProse.g:3156:2: ( ruleRANDOM )
            {
            // InternalRoboProse.g:3156:2: ( ruleRANDOM )
            // InternalRoboProse.g:3157:3: ruleRANDOM
            {
             before(grammarAccess.getMoveAccess().getIsRandomRANDOMEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRANDOM();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getIsRandomRANDOMEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Move__IsRandomAssignment_3_1"


    // $ANTLR start "rule__Turn__DirectionAssignment_2"
    // InternalRoboProse.g:3166:1: rule__Turn__DirectionAssignment_2 : ( ruleTURN_DIRECTION ) ;
    public final void rule__Turn__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3170:1: ( ( ruleTURN_DIRECTION ) )
            // InternalRoboProse.g:3171:2: ( ruleTURN_DIRECTION )
            {
            // InternalRoboProse.g:3171:2: ( ruleTURN_DIRECTION )
            // InternalRoboProse.g:3172:3: ruleTURN_DIRECTION
            {
             before(grammarAccess.getTurnAccess().getDirectionTURN_DIRECTIONEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTURN_DIRECTION();

            state._fsp--;

             after(grammarAccess.getTurnAccess().getDirectionTURN_DIRECTIONEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Turn__DirectionAssignment_2"


    // $ANTLR start "rule__Turn__DurationAssignment_3_0_1"
    // InternalRoboProse.g:3181:1: rule__Turn__DurationAssignment_3_0_1 : ( ruleEFloat ) ;
    public final void rule__Turn__DurationAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3185:1: ( ( ruleEFloat ) )
            // InternalRoboProse.g:3186:2: ( ruleEFloat )
            {
            // InternalRoboProse.g:3186:2: ( ruleEFloat )
            // InternalRoboProse.g:3187:3: ruleEFloat
            {
             before(grammarAccess.getTurnAccess().getDurationEFloatParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getTurnAccess().getDurationEFloatParserRuleCall_3_0_1_0()); 

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
    // $ANTLR end "rule__Turn__DurationAssignment_3_0_1"


    // $ANTLR start "rule__Turn__DegreesAssignment_3_1_0"
    // InternalRoboProse.g:3196:1: rule__Turn__DegreesAssignment_3_1_0 : ( ruleEFloat ) ;
    public final void rule__Turn__DegreesAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3200:1: ( ( ruleEFloat ) )
            // InternalRoboProse.g:3201:2: ( ruleEFloat )
            {
            // InternalRoboProse.g:3201:2: ( ruleEFloat )
            // InternalRoboProse.g:3202:3: ruleEFloat
            {
             before(grammarAccess.getTurnAccess().getDegreesEFloatParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getTurnAccess().getDegreesEFloatParserRuleCall_3_1_0_0()); 

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
    // $ANTLR end "rule__Turn__DegreesAssignment_3_1_0"


    // $ANTLR start "rule__Turn__IsRandomAssignment_3_2"
    // InternalRoboProse.g:3211:1: rule__Turn__IsRandomAssignment_3_2 : ( ruleRANDOM ) ;
    public final void rule__Turn__IsRandomAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3215:1: ( ( ruleRANDOM ) )
            // InternalRoboProse.g:3216:2: ( ruleRANDOM )
            {
            // InternalRoboProse.g:3216:2: ( ruleRANDOM )
            // InternalRoboProse.g:3217:3: ruleRANDOM
            {
             before(grammarAccess.getTurnAccess().getIsRandomRANDOMEnumRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRANDOM();

            state._fsp--;

             after(grammarAccess.getTurnAccess().getIsRandomRANDOMEnumRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Turn__IsRandomAssignment_3_2"


    // $ANTLR start "rule__Stop__DurationAssignment_2_1"
    // InternalRoboProse.g:3226:1: rule__Stop__DurationAssignment_2_1 : ( ruleEFloat ) ;
    public final void rule__Stop__DurationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3230:1: ( ( ruleEFloat ) )
            // InternalRoboProse.g:3231:2: ( ruleEFloat )
            {
            // InternalRoboProse.g:3231:2: ( ruleEFloat )
            // InternalRoboProse.g:3232:3: ruleEFloat
            {
             before(grammarAccess.getStopAccess().getDurationEFloatParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getStopAccess().getDurationEFloatParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Stop__DurationAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004006000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000052000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000A00001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000A00001002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000900000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000A40001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000040033E0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000001020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000084003C01020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});

}