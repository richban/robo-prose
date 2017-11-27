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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_INT", "RULE_WS", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'.'", "'When'", "'when'", "'E'", "'e'", "'forwards'", "'forward'", "'backwards'", "'backward'", "'back'", "'left'", "'right'", "'My'", "'robot'", "'should'", "'it'", "'('", "'but'", "')'", "'and'", "'then'", "','", "'Then'", "'move'", "'for'", "'seconds'", "'turn'", "'degrees'", "'stop'", "'-'", "'meets'", "'an'", "'obstacle'", "'is'", "'tapped'"
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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


    // $ANTLR start "rule__EventListener__Alternatives_0"
    // InternalRoboProse.g:434:1: rule__EventListener__Alternatives_0 : ( ( 'When' ) | ( 'when' ) );
    public final void rule__EventListener__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:438:1: ( ( 'When' ) | ( 'when' ) )
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
                    // InternalRoboProse.g:439:2: ( 'When' )
                    {
                    // InternalRoboProse.g:439:2: ( 'When' )
                    // InternalRoboProse.g:440:3: 'When'
                    {
                     before(grammarAccess.getEventListenerAccess().getWhenKeyword_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEventListenerAccess().getWhenKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:445:2: ( 'when' )
                    {
                    // InternalRoboProse.g:445:2: ( 'when' )
                    // InternalRoboProse.g:446:3: 'when'
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
    // InternalRoboProse.g:455:1: rule__ActionDelimiter__Alternatives_0 : ( ( ( rule__ActionDelimiter__Group_0_0__0 ) ) | ( ( rule__ActionDelimiter__Group_0_1__0 ) ) | ( ( rule__ActionDelimiter__Group_0_2__0 ) ) );
    public final void rule__ActionDelimiter__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:459:1: ( ( ( rule__ActionDelimiter__Group_0_0__0 ) ) | ( ( rule__ActionDelimiter__Group_0_1__0 ) ) | ( ( rule__ActionDelimiter__Group_0_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt2=1;
                }
                break;
            case 33:
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
                    // InternalRoboProse.g:460:2: ( ( rule__ActionDelimiter__Group_0_0__0 ) )
                    {
                    // InternalRoboProse.g:460:2: ( ( rule__ActionDelimiter__Group_0_0__0 ) )
                    // InternalRoboProse.g:461:3: ( rule__ActionDelimiter__Group_0_0__0 )
                    {
                     before(grammarAccess.getActionDelimiterAccess().getGroup_0_0()); 
                    // InternalRoboProse.g:462:3: ( rule__ActionDelimiter__Group_0_0__0 )
                    // InternalRoboProse.g:462:4: rule__ActionDelimiter__Group_0_0__0
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
                    // InternalRoboProse.g:466:2: ( ( rule__ActionDelimiter__Group_0_1__0 ) )
                    {
                    // InternalRoboProse.g:466:2: ( ( rule__ActionDelimiter__Group_0_1__0 ) )
                    // InternalRoboProse.g:467:3: ( rule__ActionDelimiter__Group_0_1__0 )
                    {
                     before(grammarAccess.getActionDelimiterAccess().getGroup_0_1()); 
                    // InternalRoboProse.g:468:3: ( rule__ActionDelimiter__Group_0_1__0 )
                    // InternalRoboProse.g:468:4: rule__ActionDelimiter__Group_0_1__0
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
                    // InternalRoboProse.g:472:2: ( ( rule__ActionDelimiter__Group_0_2__0 ) )
                    {
                    // InternalRoboProse.g:472:2: ( ( rule__ActionDelimiter__Group_0_2__0 ) )
                    // InternalRoboProse.g:473:3: ( rule__ActionDelimiter__Group_0_2__0 )
                    {
                     before(grammarAccess.getActionDelimiterAccess().getGroup_0_2()); 
                    // InternalRoboProse.g:474:3: ( rule__ActionDelimiter__Group_0_2__0 )
                    // InternalRoboProse.g:474:4: rule__ActionDelimiter__Group_0_2__0
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
    // InternalRoboProse.g:482:1: rule__Action__Alternatives : ( ( ruleMove ) | ( ruleTurn ) | ( ruleStop ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:486:1: ( ( ruleMove ) | ( ruleTurn ) | ( ruleStop ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt3=1;
                }
                break;
            case 38:
                {
                alt3=2;
                }
                break;
            case 40:
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
                    // InternalRoboProse.g:487:2: ( ruleMove )
                    {
                    // InternalRoboProse.g:487:2: ( ruleMove )
                    // InternalRoboProse.g:488:3: ruleMove
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
                    // InternalRoboProse.g:493:2: ( ruleTurn )
                    {
                    // InternalRoboProse.g:493:2: ( ruleTurn )
                    // InternalRoboProse.g:494:3: ruleTurn
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
                    // InternalRoboProse.g:499:2: ( ruleStop )
                    {
                    // InternalRoboProse.g:499:2: ( ruleStop )
                    // InternalRoboProse.g:500:3: ruleStop
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
    // InternalRoboProse.g:509:1: rule__Event__Alternatives : ( ( ruleObstacle ) | ( ruleTapped ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:513:1: ( ( ruleObstacle ) | ( ruleTapped ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==42) ) {
                alt4=1;
            }
            else if ( (LA4_0==45) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRoboProse.g:514:2: ( ruleObstacle )
                    {
                    // InternalRoboProse.g:514:2: ( ruleObstacle )
                    // InternalRoboProse.g:515:3: ruleObstacle
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
                    // InternalRoboProse.g:520:2: ( ruleTapped )
                    {
                    // InternalRoboProse.g:520:2: ( ruleTapped )
                    // InternalRoboProse.g:521:3: ruleTapped
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


    // $ANTLR start "rule__Turn__Alternatives_3"
    // InternalRoboProse.g:530:1: rule__Turn__Alternatives_3 : ( ( ( rule__Turn__Group_3_0__0 ) ) | ( ( rule__Turn__Group_3_1__0 ) ) );
    public final void rule__Turn__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:534:1: ( ( ( rule__Turn__Group_3_0__0 ) ) | ( ( rule__Turn__Group_3_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT||LA5_0==12||LA5_0==41) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoboProse.g:535:2: ( ( rule__Turn__Group_3_0__0 ) )
                    {
                    // InternalRoboProse.g:535:2: ( ( rule__Turn__Group_3_0__0 ) )
                    // InternalRoboProse.g:536:3: ( rule__Turn__Group_3_0__0 )
                    {
                     before(grammarAccess.getTurnAccess().getGroup_3_0()); 
                    // InternalRoboProse.g:537:3: ( rule__Turn__Group_3_0__0 )
                    // InternalRoboProse.g:537:4: rule__Turn__Group_3_0__0
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
                    // InternalRoboProse.g:541:2: ( ( rule__Turn__Group_3_1__0 ) )
                    {
                    // InternalRoboProse.g:541:2: ( ( rule__Turn__Group_3_1__0 ) )
                    // InternalRoboProse.g:542:3: ( rule__Turn__Group_3_1__0 )
                    {
                     before(grammarAccess.getTurnAccess().getGroup_3_1()); 
                    // InternalRoboProse.g:543:3: ( rule__Turn__Group_3_1__0 )
                    // InternalRoboProse.g:543:4: rule__Turn__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Turn__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTurnAccess().getGroup_3_1()); 

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
    // InternalRoboProse.g:551:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:555:1: ( ( 'E' ) | ( 'e' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoboProse.g:556:2: ( 'E' )
                    {
                    // InternalRoboProse.g:556:2: ( 'E' )
                    // InternalRoboProse.g:557:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:562:2: ( 'e' )
                    {
                    // InternalRoboProse.g:562:2: ( 'e' )
                    // InternalRoboProse.g:563:3: 'e'
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
    // InternalRoboProse.g:572:1: rule__MOVE_DIRECTION__Alternatives : ( ( ( 'forwards' ) ) | ( ( 'forward' ) ) | ( ( 'backwards' ) ) | ( ( 'backward' ) ) | ( ( 'back' ) ) );
    public final void rule__MOVE_DIRECTION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:576:1: ( ( ( 'forwards' ) ) | ( ( 'forward' ) ) | ( ( 'backwards' ) ) | ( ( 'backward' ) ) | ( ( 'back' ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRoboProse.g:577:2: ( ( 'forwards' ) )
                    {
                    // InternalRoboProse.g:577:2: ( ( 'forwards' ) )
                    // InternalRoboProse.g:578:3: ( 'forwards' )
                    {
                     before(grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_0()); 
                    // InternalRoboProse.g:579:3: ( 'forwards' )
                    // InternalRoboProse.g:579:4: 'forwards'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:583:2: ( ( 'forward' ) )
                    {
                    // InternalRoboProse.g:583:2: ( ( 'forward' ) )
                    // InternalRoboProse.g:584:3: ( 'forward' )
                    {
                     before(grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_1()); 
                    // InternalRoboProse.g:585:3: ( 'forward' )
                    // InternalRoboProse.g:585:4: 'forward'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getMOVE_DIRECTIONAccess().getFORWARDSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoboProse.g:589:2: ( ( 'backwards' ) )
                    {
                    // InternalRoboProse.g:589:2: ( ( 'backwards' ) )
                    // InternalRoboProse.g:590:3: ( 'backwards' )
                    {
                     before(grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_2()); 
                    // InternalRoboProse.g:591:3: ( 'backwards' )
                    // InternalRoboProse.g:591:4: 'backwards'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRoboProse.g:595:2: ( ( 'backward' ) )
                    {
                    // InternalRoboProse.g:595:2: ( ( 'backward' ) )
                    // InternalRoboProse.g:596:3: ( 'backward' )
                    {
                     before(grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_3()); 
                    // InternalRoboProse.g:597:3: ( 'backward' )
                    // InternalRoboProse.g:597:4: 'backward'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRoboProse.g:601:2: ( ( 'back' ) )
                    {
                    // InternalRoboProse.g:601:2: ( ( 'back' ) )
                    // InternalRoboProse.g:602:3: ( 'back' )
                    {
                     before(grammarAccess.getMOVE_DIRECTIONAccess().getBACKWARDSEnumLiteralDeclaration_4()); 
                    // InternalRoboProse.g:603:3: ( 'back' )
                    // InternalRoboProse.g:603:4: 'back'
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
    // InternalRoboProse.g:611:1: rule__TURN_DIRECTION__Alternatives : ( ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__TURN_DIRECTION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:615:1: ( ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRoboProse.g:616:2: ( ( 'left' ) )
                    {
                    // InternalRoboProse.g:616:2: ( ( 'left' ) )
                    // InternalRoboProse.g:617:3: ( 'left' )
                    {
                     before(grammarAccess.getTURN_DIRECTIONAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalRoboProse.g:618:3: ( 'left' )
                    // InternalRoboProse.g:618:4: 'left'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTURN_DIRECTIONAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboProse.g:622:2: ( ( 'right' ) )
                    {
                    // InternalRoboProse.g:622:2: ( ( 'right' ) )
                    // InternalRoboProse.g:623:3: ( 'right' )
                    {
                     before(grammarAccess.getTURN_DIRECTIONAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalRoboProse.g:624:3: ( 'right' )
                    // InternalRoboProse.g:624:4: 'right'
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


    // $ANTLR start "rule__RoboProse__Group__0"
    // InternalRoboProse.g:632:1: rule__RoboProse__Group__0 : rule__RoboProse__Group__0__Impl rule__RoboProse__Group__1 ;
    public final void rule__RoboProse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:636:1: ( rule__RoboProse__Group__0__Impl rule__RoboProse__Group__1 )
            // InternalRoboProse.g:637:2: rule__RoboProse__Group__0__Impl rule__RoboProse__Group__1
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
    // InternalRoboProse.g:644:1: rule__RoboProse__Group__0__Impl : ( () ) ;
    public final void rule__RoboProse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:648:1: ( ( () ) )
            // InternalRoboProse.g:649:1: ( () )
            {
            // InternalRoboProse.g:649:1: ( () )
            // InternalRoboProse.g:650:2: ()
            {
             before(grammarAccess.getRoboProseAccess().getRoboProseAction_0()); 
            // InternalRoboProse.g:651:2: ()
            // InternalRoboProse.g:651:3: 
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
    // InternalRoboProse.g:659:1: rule__RoboProse__Group__1 : rule__RoboProse__Group__1__Impl rule__RoboProse__Group__2 ;
    public final void rule__RoboProse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:663:1: ( rule__RoboProse__Group__1__Impl rule__RoboProse__Group__2 )
            // InternalRoboProse.g:664:2: rule__RoboProse__Group__1__Impl rule__RoboProse__Group__2
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
    // InternalRoboProse.g:671:1: rule__RoboProse__Group__1__Impl : ( ( rule__RoboProse__Group_1__0 )? ) ;
    public final void rule__RoboProse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:675:1: ( ( ( rule__RoboProse__Group_1__0 )? ) )
            // InternalRoboProse.g:676:1: ( ( rule__RoboProse__Group_1__0 )? )
            {
            // InternalRoboProse.g:676:1: ( ( rule__RoboProse__Group_1__0 )? )
            // InternalRoboProse.g:677:2: ( rule__RoboProse__Group_1__0 )?
            {
             before(grammarAccess.getRoboProseAccess().getGroup_1()); 
            // InternalRoboProse.g:678:2: ( rule__RoboProse__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRoboProse.g:678:3: rule__RoboProse__Group_1__0
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
    // InternalRoboProse.g:686:1: rule__RoboProse__Group__2 : rule__RoboProse__Group__2__Impl ;
    public final void rule__RoboProse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:690:1: ( rule__RoboProse__Group__2__Impl )
            // InternalRoboProse.g:691:2: rule__RoboProse__Group__2__Impl
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
    // InternalRoboProse.g:697:1: rule__RoboProse__Group__2__Impl : ( ( rule__RoboProse__Group_2__0 )? ) ;
    public final void rule__RoboProse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:701:1: ( ( ( rule__RoboProse__Group_2__0 )? ) )
            // InternalRoboProse.g:702:1: ( ( rule__RoboProse__Group_2__0 )? )
            {
            // InternalRoboProse.g:702:1: ( ( rule__RoboProse__Group_2__0 )? )
            // InternalRoboProse.g:703:2: ( rule__RoboProse__Group_2__0 )?
            {
             before(grammarAccess.getRoboProseAccess().getGroup_2()); 
            // InternalRoboProse.g:704:2: ( rule__RoboProse__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=13 && LA10_0<=14)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRoboProse.g:704:3: rule__RoboProse__Group_2__0
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
    // InternalRoboProse.g:713:1: rule__RoboProse__Group_1__0 : rule__RoboProse__Group_1__0__Impl rule__RoboProse__Group_1__1 ;
    public final void rule__RoboProse__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:717:1: ( rule__RoboProse__Group_1__0__Impl rule__RoboProse__Group_1__1 )
            // InternalRoboProse.g:718:2: rule__RoboProse__Group_1__0__Impl rule__RoboProse__Group_1__1
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
    // InternalRoboProse.g:725:1: rule__RoboProse__Group_1__0__Impl : ( 'My' ) ;
    public final void rule__RoboProse__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:729:1: ( ( 'My' ) )
            // InternalRoboProse.g:730:1: ( 'My' )
            {
            // InternalRoboProse.g:730:1: ( 'My' )
            // InternalRoboProse.g:731:2: 'My'
            {
             before(grammarAccess.getRoboProseAccess().getMyKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRoboProse.g:740:1: rule__RoboProse__Group_1__1 : rule__RoboProse__Group_1__1__Impl rule__RoboProse__Group_1__2 ;
    public final void rule__RoboProse__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:744:1: ( rule__RoboProse__Group_1__1__Impl rule__RoboProse__Group_1__2 )
            // InternalRoboProse.g:745:2: rule__RoboProse__Group_1__1__Impl rule__RoboProse__Group_1__2
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
    // InternalRoboProse.g:752:1: rule__RoboProse__Group_1__1__Impl : ( 'robot' ) ;
    public final void rule__RoboProse__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:756:1: ( ( 'robot' ) )
            // InternalRoboProse.g:757:1: ( 'robot' )
            {
            // InternalRoboProse.g:757:1: ( 'robot' )
            // InternalRoboProse.g:758:2: 'robot'
            {
             before(grammarAccess.getRoboProseAccess().getRobotKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRoboProse.g:767:1: rule__RoboProse__Group_1__2 : rule__RoboProse__Group_1__2__Impl rule__RoboProse__Group_1__3 ;
    public final void rule__RoboProse__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:771:1: ( rule__RoboProse__Group_1__2__Impl rule__RoboProse__Group_1__3 )
            // InternalRoboProse.g:772:2: rule__RoboProse__Group_1__2__Impl rule__RoboProse__Group_1__3
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
    // InternalRoboProse.g:779:1: rule__RoboProse__Group_1__2__Impl : ( 'should' ) ;
    public final void rule__RoboProse__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:783:1: ( ( 'should' ) )
            // InternalRoboProse.g:784:1: ( 'should' )
            {
            // InternalRoboProse.g:784:1: ( 'should' )
            // InternalRoboProse.g:785:2: 'should'
            {
             before(grammarAccess.getRoboProseAccess().getShouldKeyword_1_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRoboProse.g:794:1: rule__RoboProse__Group_1__3 : rule__RoboProse__Group_1__3__Impl rule__RoboProse__Group_1__4 ;
    public final void rule__RoboProse__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:798:1: ( rule__RoboProse__Group_1__3__Impl rule__RoboProse__Group_1__4 )
            // InternalRoboProse.g:799:2: rule__RoboProse__Group_1__3__Impl rule__RoboProse__Group_1__4
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
    // InternalRoboProse.g:806:1: rule__RoboProse__Group_1__3__Impl : ( ( rule__RoboProse__MainAssignment_1_3 ) ) ;
    public final void rule__RoboProse__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:810:1: ( ( ( rule__RoboProse__MainAssignment_1_3 ) ) )
            // InternalRoboProse.g:811:1: ( ( rule__RoboProse__MainAssignment_1_3 ) )
            {
            // InternalRoboProse.g:811:1: ( ( rule__RoboProse__MainAssignment_1_3 ) )
            // InternalRoboProse.g:812:2: ( rule__RoboProse__MainAssignment_1_3 )
            {
             before(grammarAccess.getRoboProseAccess().getMainAssignment_1_3()); 
            // InternalRoboProse.g:813:2: ( rule__RoboProse__MainAssignment_1_3 )
            // InternalRoboProse.g:813:3: rule__RoboProse__MainAssignment_1_3
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
    // InternalRoboProse.g:821:1: rule__RoboProse__Group_1__4 : rule__RoboProse__Group_1__4__Impl ;
    public final void rule__RoboProse__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:825:1: ( rule__RoboProse__Group_1__4__Impl )
            // InternalRoboProse.g:826:2: rule__RoboProse__Group_1__4__Impl
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
    // InternalRoboProse.g:832:1: rule__RoboProse__Group_1__4__Impl : ( ruleParagraphDelimiter ) ;
    public final void rule__RoboProse__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:836:1: ( ( ruleParagraphDelimiter ) )
            // InternalRoboProse.g:837:1: ( ruleParagraphDelimiter )
            {
            // InternalRoboProse.g:837:1: ( ruleParagraphDelimiter )
            // InternalRoboProse.g:838:2: ruleParagraphDelimiter
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
    // InternalRoboProse.g:848:1: rule__RoboProse__Group_2__0 : rule__RoboProse__Group_2__0__Impl rule__RoboProse__Group_2__1 ;
    public final void rule__RoboProse__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:852:1: ( rule__RoboProse__Group_2__0__Impl rule__RoboProse__Group_2__1 )
            // InternalRoboProse.g:853:2: rule__RoboProse__Group_2__0__Impl rule__RoboProse__Group_2__1
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
    // InternalRoboProse.g:860:1: rule__RoboProse__Group_2__0__Impl : ( ( rule__RoboProse__ListenersAssignment_2_0 ) ) ;
    public final void rule__RoboProse__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:864:1: ( ( ( rule__RoboProse__ListenersAssignment_2_0 ) ) )
            // InternalRoboProse.g:865:1: ( ( rule__RoboProse__ListenersAssignment_2_0 ) )
            {
            // InternalRoboProse.g:865:1: ( ( rule__RoboProse__ListenersAssignment_2_0 ) )
            // InternalRoboProse.g:866:2: ( rule__RoboProse__ListenersAssignment_2_0 )
            {
             before(grammarAccess.getRoboProseAccess().getListenersAssignment_2_0()); 
            // InternalRoboProse.g:867:2: ( rule__RoboProse__ListenersAssignment_2_0 )
            // InternalRoboProse.g:867:3: rule__RoboProse__ListenersAssignment_2_0
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
    // InternalRoboProse.g:875:1: rule__RoboProse__Group_2__1 : rule__RoboProse__Group_2__1__Impl rule__RoboProse__Group_2__2 ;
    public final void rule__RoboProse__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:879:1: ( rule__RoboProse__Group_2__1__Impl rule__RoboProse__Group_2__2 )
            // InternalRoboProse.g:880:2: rule__RoboProse__Group_2__1__Impl rule__RoboProse__Group_2__2
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
    // InternalRoboProse.g:887:1: rule__RoboProse__Group_2__1__Impl : ( ( rule__RoboProse__Group_2_1__0 )* ) ;
    public final void rule__RoboProse__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:891:1: ( ( ( rule__RoboProse__Group_2_1__0 )* ) )
            // InternalRoboProse.g:892:1: ( ( rule__RoboProse__Group_2_1__0 )* )
            {
            // InternalRoboProse.g:892:1: ( ( rule__RoboProse__Group_2_1__0 )* )
            // InternalRoboProse.g:893:2: ( rule__RoboProse__Group_2_1__0 )*
            {
             before(grammarAccess.getRoboProseAccess().getGroup_2_1()); 
            // InternalRoboProse.g:894:2: ( rule__RoboProse__Group_2_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==12) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_NEWLINE) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalRoboProse.g:894:3: rule__RoboProse__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RoboProse__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalRoboProse.g:902:1: rule__RoboProse__Group_2__2 : rule__RoboProse__Group_2__2__Impl ;
    public final void rule__RoboProse__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:906:1: ( rule__RoboProse__Group_2__2__Impl )
            // InternalRoboProse.g:907:2: rule__RoboProse__Group_2__2__Impl
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
    // InternalRoboProse.g:913:1: rule__RoboProse__Group_2__2__Impl : ( '.' ) ;
    public final void rule__RoboProse__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:917:1: ( ( '.' ) )
            // InternalRoboProse.g:918:1: ( '.' )
            {
            // InternalRoboProse.g:918:1: ( '.' )
            // InternalRoboProse.g:919:2: '.'
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
    // InternalRoboProse.g:929:1: rule__RoboProse__Group_2_1__0 : rule__RoboProse__Group_2_1__0__Impl rule__RoboProse__Group_2_1__1 ;
    public final void rule__RoboProse__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:933:1: ( rule__RoboProse__Group_2_1__0__Impl rule__RoboProse__Group_2_1__1 )
            // InternalRoboProse.g:934:2: rule__RoboProse__Group_2_1__0__Impl rule__RoboProse__Group_2_1__1
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
    // InternalRoboProse.g:941:1: rule__RoboProse__Group_2_1__0__Impl : ( ruleParagraphDelimiter ) ;
    public final void rule__RoboProse__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:945:1: ( ( ruleParagraphDelimiter ) )
            // InternalRoboProse.g:946:1: ( ruleParagraphDelimiter )
            {
            // InternalRoboProse.g:946:1: ( ruleParagraphDelimiter )
            // InternalRoboProse.g:947:2: ruleParagraphDelimiter
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
    // InternalRoboProse.g:956:1: rule__RoboProse__Group_2_1__1 : rule__RoboProse__Group_2_1__1__Impl ;
    public final void rule__RoboProse__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:960:1: ( rule__RoboProse__Group_2_1__1__Impl )
            // InternalRoboProse.g:961:2: rule__RoboProse__Group_2_1__1__Impl
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
    // InternalRoboProse.g:967:1: rule__RoboProse__Group_2_1__1__Impl : ( ( rule__RoboProse__ListenersAssignment_2_1_1 ) ) ;
    public final void rule__RoboProse__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:971:1: ( ( ( rule__RoboProse__ListenersAssignment_2_1_1 ) ) )
            // InternalRoboProse.g:972:1: ( ( rule__RoboProse__ListenersAssignment_2_1_1 ) )
            {
            // InternalRoboProse.g:972:1: ( ( rule__RoboProse__ListenersAssignment_2_1_1 ) )
            // InternalRoboProse.g:973:2: ( rule__RoboProse__ListenersAssignment_2_1_1 )
            {
             before(grammarAccess.getRoboProseAccess().getListenersAssignment_2_1_1()); 
            // InternalRoboProse.g:974:2: ( rule__RoboProse__ListenersAssignment_2_1_1 )
            // InternalRoboProse.g:974:3: rule__RoboProse__ListenersAssignment_2_1_1
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
    // InternalRoboProse.g:983:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:987:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalRoboProse.g:988:2: rule__Main__Group__0__Impl rule__Main__Group__1
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
    // InternalRoboProse.g:995:1: rule__Main__Group__0__Impl : ( ( rule__Main__ActionsAssignment_0 ) ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:999:1: ( ( ( rule__Main__ActionsAssignment_0 ) ) )
            // InternalRoboProse.g:1000:1: ( ( rule__Main__ActionsAssignment_0 ) )
            {
            // InternalRoboProse.g:1000:1: ( ( rule__Main__ActionsAssignment_0 ) )
            // InternalRoboProse.g:1001:2: ( rule__Main__ActionsAssignment_0 )
            {
             before(grammarAccess.getMainAccess().getActionsAssignment_0()); 
            // InternalRoboProse.g:1002:2: ( rule__Main__ActionsAssignment_0 )
            // InternalRoboProse.g:1002:3: rule__Main__ActionsAssignment_0
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
    // InternalRoboProse.g:1010:1: rule__Main__Group__1 : rule__Main__Group__1__Impl ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1014:1: ( rule__Main__Group__1__Impl )
            // InternalRoboProse.g:1015:2: rule__Main__Group__1__Impl
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
    // InternalRoboProse.g:1021:1: rule__Main__Group__1__Impl : ( ( rule__Main__Group_1__0 )* ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1025:1: ( ( ( rule__Main__Group_1__0 )* ) )
            // InternalRoboProse.g:1026:1: ( ( rule__Main__Group_1__0 )* )
            {
            // InternalRoboProse.g:1026:1: ( ( rule__Main__Group_1__0 )* )
            // InternalRoboProse.g:1027:2: ( rule__Main__Group_1__0 )*
            {
             before(grammarAccess.getMainAccess().getGroup_1()); 
            // InternalRoboProse.g:1028:2: ( rule__Main__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==12) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==34) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==31||LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRoboProse.g:1028:3: rule__Main__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Main__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalRoboProse.g:1037:1: rule__Main__Group_1__0 : rule__Main__Group_1__0__Impl rule__Main__Group_1__1 ;
    public final void rule__Main__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1041:1: ( rule__Main__Group_1__0__Impl rule__Main__Group_1__1 )
            // InternalRoboProse.g:1042:2: rule__Main__Group_1__0__Impl rule__Main__Group_1__1
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
    // InternalRoboProse.g:1049:1: rule__Main__Group_1__0__Impl : ( ruleActionDelimiter ) ;
    public final void rule__Main__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1053:1: ( ( ruleActionDelimiter ) )
            // InternalRoboProse.g:1054:1: ( ruleActionDelimiter )
            {
            // InternalRoboProse.g:1054:1: ( ruleActionDelimiter )
            // InternalRoboProse.g:1055:2: ruleActionDelimiter
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
    // InternalRoboProse.g:1064:1: rule__Main__Group_1__1 : rule__Main__Group_1__1__Impl ;
    public final void rule__Main__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1068:1: ( rule__Main__Group_1__1__Impl )
            // InternalRoboProse.g:1069:2: rule__Main__Group_1__1__Impl
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
    // InternalRoboProse.g:1075:1: rule__Main__Group_1__1__Impl : ( ( rule__Main__ActionsAssignment_1_1 ) ) ;
    public final void rule__Main__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1079:1: ( ( ( rule__Main__ActionsAssignment_1_1 ) ) )
            // InternalRoboProse.g:1080:1: ( ( rule__Main__ActionsAssignment_1_1 ) )
            {
            // InternalRoboProse.g:1080:1: ( ( rule__Main__ActionsAssignment_1_1 ) )
            // InternalRoboProse.g:1081:2: ( rule__Main__ActionsAssignment_1_1 )
            {
             before(grammarAccess.getMainAccess().getActionsAssignment_1_1()); 
            // InternalRoboProse.g:1082:2: ( rule__Main__ActionsAssignment_1_1 )
            // InternalRoboProse.g:1082:3: rule__Main__ActionsAssignment_1_1
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
    // InternalRoboProse.g:1091:1: rule__EventListener__Group__0 : rule__EventListener__Group__0__Impl rule__EventListener__Group__1 ;
    public final void rule__EventListener__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1095:1: ( rule__EventListener__Group__0__Impl rule__EventListener__Group__1 )
            // InternalRoboProse.g:1096:2: rule__EventListener__Group__0__Impl rule__EventListener__Group__1
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
    // InternalRoboProse.g:1103:1: rule__EventListener__Group__0__Impl : ( ( rule__EventListener__Alternatives_0 ) ) ;
    public final void rule__EventListener__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1107:1: ( ( ( rule__EventListener__Alternatives_0 ) ) )
            // InternalRoboProse.g:1108:1: ( ( rule__EventListener__Alternatives_0 ) )
            {
            // InternalRoboProse.g:1108:1: ( ( rule__EventListener__Alternatives_0 ) )
            // InternalRoboProse.g:1109:2: ( rule__EventListener__Alternatives_0 )
            {
             before(grammarAccess.getEventListenerAccess().getAlternatives_0()); 
            // InternalRoboProse.g:1110:2: ( rule__EventListener__Alternatives_0 )
            // InternalRoboProse.g:1110:3: rule__EventListener__Alternatives_0
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
    // InternalRoboProse.g:1118:1: rule__EventListener__Group__1 : rule__EventListener__Group__1__Impl rule__EventListener__Group__2 ;
    public final void rule__EventListener__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1122:1: ( rule__EventListener__Group__1__Impl rule__EventListener__Group__2 )
            // InternalRoboProse.g:1123:2: rule__EventListener__Group__1__Impl rule__EventListener__Group__2
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
    // InternalRoboProse.g:1130:1: rule__EventListener__Group__1__Impl : ( 'it' ) ;
    public final void rule__EventListener__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1134:1: ( ( 'it' ) )
            // InternalRoboProse.g:1135:1: ( 'it' )
            {
            // InternalRoboProse.g:1135:1: ( 'it' )
            // InternalRoboProse.g:1136:2: 'it'
            {
             before(grammarAccess.getEventListenerAccess().getItKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRoboProse.g:1145:1: rule__EventListener__Group__2 : rule__EventListener__Group__2__Impl rule__EventListener__Group__3 ;
    public final void rule__EventListener__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1149:1: ( rule__EventListener__Group__2__Impl rule__EventListener__Group__3 )
            // InternalRoboProse.g:1150:2: rule__EventListener__Group__2__Impl rule__EventListener__Group__3
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
    // InternalRoboProse.g:1157:1: rule__EventListener__Group__2__Impl : ( ( rule__EventListener__EventAssignment_2 ) ) ;
    public final void rule__EventListener__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1161:1: ( ( ( rule__EventListener__EventAssignment_2 ) ) )
            // InternalRoboProse.g:1162:1: ( ( rule__EventListener__EventAssignment_2 ) )
            {
            // InternalRoboProse.g:1162:1: ( ( rule__EventListener__EventAssignment_2 ) )
            // InternalRoboProse.g:1163:2: ( rule__EventListener__EventAssignment_2 )
            {
             before(grammarAccess.getEventListenerAccess().getEventAssignment_2()); 
            // InternalRoboProse.g:1164:2: ( rule__EventListener__EventAssignment_2 )
            // InternalRoboProse.g:1164:3: rule__EventListener__EventAssignment_2
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
    // InternalRoboProse.g:1172:1: rule__EventListener__Group__3 : rule__EventListener__Group__3__Impl rule__EventListener__Group__4 ;
    public final void rule__EventListener__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1176:1: ( rule__EventListener__Group__3__Impl rule__EventListener__Group__4 )
            // InternalRoboProse.g:1177:2: rule__EventListener__Group__3__Impl rule__EventListener__Group__4
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
    // InternalRoboProse.g:1184:1: rule__EventListener__Group__3__Impl : ( 'it' ) ;
    public final void rule__EventListener__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1188:1: ( ( 'it' ) )
            // InternalRoboProse.g:1189:1: ( 'it' )
            {
            // InternalRoboProse.g:1189:1: ( 'it' )
            // InternalRoboProse.g:1190:2: 'it'
            {
             before(grammarAccess.getEventListenerAccess().getItKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRoboProse.g:1199:1: rule__EventListener__Group__4 : rule__EventListener__Group__4__Impl rule__EventListener__Group__5 ;
    public final void rule__EventListener__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1203:1: ( rule__EventListener__Group__4__Impl rule__EventListener__Group__5 )
            // InternalRoboProse.g:1204:2: rule__EventListener__Group__4__Impl rule__EventListener__Group__5
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
    // InternalRoboProse.g:1211:1: rule__EventListener__Group__4__Impl : ( 'should' ) ;
    public final void rule__EventListener__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1215:1: ( ( 'should' ) )
            // InternalRoboProse.g:1216:1: ( 'should' )
            {
            // InternalRoboProse.g:1216:1: ( 'should' )
            // InternalRoboProse.g:1217:2: 'should'
            {
             before(grammarAccess.getEventListenerAccess().getShouldKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRoboProse.g:1226:1: rule__EventListener__Group__5 : rule__EventListener__Group__5__Impl rule__EventListener__Group__6 ;
    public final void rule__EventListener__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1230:1: ( rule__EventListener__Group__5__Impl rule__EventListener__Group__6 )
            // InternalRoboProse.g:1231:2: rule__EventListener__Group__5__Impl rule__EventListener__Group__6
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
    // InternalRoboProse.g:1238:1: rule__EventListener__Group__5__Impl : ( ( rule__EventListener__ActionsAssignment_5 ) ) ;
    public final void rule__EventListener__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1242:1: ( ( ( rule__EventListener__ActionsAssignment_5 ) ) )
            // InternalRoboProse.g:1243:1: ( ( rule__EventListener__ActionsAssignment_5 ) )
            {
            // InternalRoboProse.g:1243:1: ( ( rule__EventListener__ActionsAssignment_5 ) )
            // InternalRoboProse.g:1244:2: ( rule__EventListener__ActionsAssignment_5 )
            {
             before(grammarAccess.getEventListenerAccess().getActionsAssignment_5()); 
            // InternalRoboProse.g:1245:2: ( rule__EventListener__ActionsAssignment_5 )
            // InternalRoboProse.g:1245:3: rule__EventListener__ActionsAssignment_5
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
    // InternalRoboProse.g:1253:1: rule__EventListener__Group__6 : rule__EventListener__Group__6__Impl rule__EventListener__Group__7 ;
    public final void rule__EventListener__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1257:1: ( rule__EventListener__Group__6__Impl rule__EventListener__Group__7 )
            // InternalRoboProse.g:1258:2: rule__EventListener__Group__6__Impl rule__EventListener__Group__7
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
    // InternalRoboProse.g:1265:1: rule__EventListener__Group__6__Impl : ( ( rule__EventListener__Group_6__0 )* ) ;
    public final void rule__EventListener__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1269:1: ( ( ( rule__EventListener__Group_6__0 )* ) )
            // InternalRoboProse.g:1270:1: ( ( rule__EventListener__Group_6__0 )* )
            {
            // InternalRoboProse.g:1270:1: ( ( rule__EventListener__Group_6__0 )* )
            // InternalRoboProse.g:1271:2: ( rule__EventListener__Group_6__0 )*
            {
             before(grammarAccess.getEventListenerAccess().getGroup_6()); 
            // InternalRoboProse.g:1272:2: ( rule__EventListener__Group_6__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==34) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==31||LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRoboProse.g:1272:3: rule__EventListener__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__EventListener__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalRoboProse.g:1280:1: rule__EventListener__Group__7 : rule__EventListener__Group__7__Impl ;
    public final void rule__EventListener__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1284:1: ( rule__EventListener__Group__7__Impl )
            // InternalRoboProse.g:1285:2: rule__EventListener__Group__7__Impl
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
    // InternalRoboProse.g:1291:1: rule__EventListener__Group__7__Impl : ( ( rule__EventListener__Group_7__0 )? ) ;
    public final void rule__EventListener__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1295:1: ( ( ( rule__EventListener__Group_7__0 )? ) )
            // InternalRoboProse.g:1296:1: ( ( rule__EventListener__Group_7__0 )? )
            {
            // InternalRoboProse.g:1296:1: ( ( rule__EventListener__Group_7__0 )? )
            // InternalRoboProse.g:1297:2: ( rule__EventListener__Group_7__0 )?
            {
             before(grammarAccess.getEventListenerAccess().getGroup_7()); 
            // InternalRoboProse.g:1298:2: ( rule__EventListener__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRoboProse.g:1298:3: rule__EventListener__Group_7__0
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
    // InternalRoboProse.g:1307:1: rule__EventListener__Group_6__0 : rule__EventListener__Group_6__0__Impl rule__EventListener__Group_6__1 ;
    public final void rule__EventListener__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1311:1: ( rule__EventListener__Group_6__0__Impl rule__EventListener__Group_6__1 )
            // InternalRoboProse.g:1312:2: rule__EventListener__Group_6__0__Impl rule__EventListener__Group_6__1
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
    // InternalRoboProse.g:1319:1: rule__EventListener__Group_6__0__Impl : ( ruleActionDelimiter ) ;
    public final void rule__EventListener__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1323:1: ( ( ruleActionDelimiter ) )
            // InternalRoboProse.g:1324:1: ( ruleActionDelimiter )
            {
            // InternalRoboProse.g:1324:1: ( ruleActionDelimiter )
            // InternalRoboProse.g:1325:2: ruleActionDelimiter
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
    // InternalRoboProse.g:1334:1: rule__EventListener__Group_6__1 : rule__EventListener__Group_6__1__Impl ;
    public final void rule__EventListener__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1338:1: ( rule__EventListener__Group_6__1__Impl )
            // InternalRoboProse.g:1339:2: rule__EventListener__Group_6__1__Impl
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
    // InternalRoboProse.g:1345:1: rule__EventListener__Group_6__1__Impl : ( ( rule__EventListener__ActionsAssignment_6_1 ) ) ;
    public final void rule__EventListener__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1349:1: ( ( ( rule__EventListener__ActionsAssignment_6_1 ) ) )
            // InternalRoboProse.g:1350:1: ( ( rule__EventListener__ActionsAssignment_6_1 ) )
            {
            // InternalRoboProse.g:1350:1: ( ( rule__EventListener__ActionsAssignment_6_1 ) )
            // InternalRoboProse.g:1351:2: ( rule__EventListener__ActionsAssignment_6_1 )
            {
             before(grammarAccess.getEventListenerAccess().getActionsAssignment_6_1()); 
            // InternalRoboProse.g:1352:2: ( rule__EventListener__ActionsAssignment_6_1 )
            // InternalRoboProse.g:1352:3: rule__EventListener__ActionsAssignment_6_1
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
    // InternalRoboProse.g:1361:1: rule__EventListener__Group_7__0 : rule__EventListener__Group_7__0__Impl rule__EventListener__Group_7__1 ;
    public final void rule__EventListener__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1365:1: ( rule__EventListener__Group_7__0__Impl rule__EventListener__Group_7__1 )
            // InternalRoboProse.g:1366:2: rule__EventListener__Group_7__0__Impl rule__EventListener__Group_7__1
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
    // InternalRoboProse.g:1373:1: rule__EventListener__Group_7__0__Impl : ( '(' ) ;
    public final void rule__EventListener__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1377:1: ( ( '(' ) )
            // InternalRoboProse.g:1378:1: ( '(' )
            {
            // InternalRoboProse.g:1378:1: ( '(' )
            // InternalRoboProse.g:1379:2: '('
            {
             before(grammarAccess.getEventListenerAccess().getLeftParenthesisKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalRoboProse.g:1388:1: rule__EventListener__Group_7__1 : rule__EventListener__Group_7__1__Impl rule__EventListener__Group_7__2 ;
    public final void rule__EventListener__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1392:1: ( rule__EventListener__Group_7__1__Impl rule__EventListener__Group_7__2 )
            // InternalRoboProse.g:1393:2: rule__EventListener__Group_7__1__Impl rule__EventListener__Group_7__2
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
    // InternalRoboProse.g:1400:1: rule__EventListener__Group_7__1__Impl : ( 'but' ) ;
    public final void rule__EventListener__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1404:1: ( ( 'but' ) )
            // InternalRoboProse.g:1405:1: ( 'but' )
            {
            // InternalRoboProse.g:1405:1: ( 'but' )
            // InternalRoboProse.g:1406:2: 'but'
            {
             before(grammarAccess.getEventListenerAccess().getButKeyword_7_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRoboProse.g:1415:1: rule__EventListener__Group_7__2 : rule__EventListener__Group_7__2__Impl rule__EventListener__Group_7__3 ;
    public final void rule__EventListener__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1419:1: ( rule__EventListener__Group_7__2__Impl rule__EventListener__Group_7__3 )
            // InternalRoboProse.g:1420:2: rule__EventListener__Group_7__2__Impl rule__EventListener__Group_7__3
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
    // InternalRoboProse.g:1427:1: rule__EventListener__Group_7__2__Impl : ( ( rule__EventListener__SublistenersAssignment_7_2 ) ) ;
    public final void rule__EventListener__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1431:1: ( ( ( rule__EventListener__SublistenersAssignment_7_2 ) ) )
            // InternalRoboProse.g:1432:1: ( ( rule__EventListener__SublistenersAssignment_7_2 ) )
            {
            // InternalRoboProse.g:1432:1: ( ( rule__EventListener__SublistenersAssignment_7_2 ) )
            // InternalRoboProse.g:1433:2: ( rule__EventListener__SublistenersAssignment_7_2 )
            {
             before(grammarAccess.getEventListenerAccess().getSublistenersAssignment_7_2()); 
            // InternalRoboProse.g:1434:2: ( rule__EventListener__SublistenersAssignment_7_2 )
            // InternalRoboProse.g:1434:3: rule__EventListener__SublistenersAssignment_7_2
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
    // InternalRoboProse.g:1442:1: rule__EventListener__Group_7__3 : rule__EventListener__Group_7__3__Impl rule__EventListener__Group_7__4 ;
    public final void rule__EventListener__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1446:1: ( rule__EventListener__Group_7__3__Impl rule__EventListener__Group_7__4 )
            // InternalRoboProse.g:1447:2: rule__EventListener__Group_7__3__Impl rule__EventListener__Group_7__4
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
    // InternalRoboProse.g:1454:1: rule__EventListener__Group_7__3__Impl : ( ( rule__EventListener__Group_7_3__0 )* ) ;
    public final void rule__EventListener__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1458:1: ( ( ( rule__EventListener__Group_7_3__0 )* ) )
            // InternalRoboProse.g:1459:1: ( ( rule__EventListener__Group_7_3__0 )* )
            {
            // InternalRoboProse.g:1459:1: ( ( rule__EventListener__Group_7_3__0 )* )
            // InternalRoboProse.g:1460:2: ( rule__EventListener__Group_7_3__0 )*
            {
             before(grammarAccess.getEventListenerAccess().getGroup_7_3()); 
            // InternalRoboProse.g:1461:2: ( rule__EventListener__Group_7_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==12) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRoboProse.g:1461:3: rule__EventListener__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__EventListener__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalRoboProse.g:1469:1: rule__EventListener__Group_7__4 : rule__EventListener__Group_7__4__Impl ;
    public final void rule__EventListener__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1473:1: ( rule__EventListener__Group_7__4__Impl )
            // InternalRoboProse.g:1474:2: rule__EventListener__Group_7__4__Impl
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
    // InternalRoboProse.g:1480:1: rule__EventListener__Group_7__4__Impl : ( ')' ) ;
    public final void rule__EventListener__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1484:1: ( ( ')' ) )
            // InternalRoboProse.g:1485:1: ( ')' )
            {
            // InternalRoboProse.g:1485:1: ( ')' )
            // InternalRoboProse.g:1486:2: ')'
            {
             before(grammarAccess.getEventListenerAccess().getRightParenthesisKeyword_7_4()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRoboProse.g:1496:1: rule__EventListener__Group_7_3__0 : rule__EventListener__Group_7_3__0__Impl rule__EventListener__Group_7_3__1 ;
    public final void rule__EventListener__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1500:1: ( rule__EventListener__Group_7_3__0__Impl rule__EventListener__Group_7_3__1 )
            // InternalRoboProse.g:1501:2: rule__EventListener__Group_7_3__0__Impl rule__EventListener__Group_7_3__1
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
    // InternalRoboProse.g:1508:1: rule__EventListener__Group_7_3__0__Impl : ( ruleSublistenerDelimiter ) ;
    public final void rule__EventListener__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1512:1: ( ( ruleSublistenerDelimiter ) )
            // InternalRoboProse.g:1513:1: ( ruleSublistenerDelimiter )
            {
            // InternalRoboProse.g:1513:1: ( ruleSublistenerDelimiter )
            // InternalRoboProse.g:1514:2: ruleSublistenerDelimiter
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
    // InternalRoboProse.g:1523:1: rule__EventListener__Group_7_3__1 : rule__EventListener__Group_7_3__1__Impl ;
    public final void rule__EventListener__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1527:1: ( rule__EventListener__Group_7_3__1__Impl )
            // InternalRoboProse.g:1528:2: rule__EventListener__Group_7_3__1__Impl
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
    // InternalRoboProse.g:1534:1: rule__EventListener__Group_7_3__1__Impl : ( ( rule__EventListener__SublistenersAssignment_7_3_1 ) ) ;
    public final void rule__EventListener__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1538:1: ( ( ( rule__EventListener__SublistenersAssignment_7_3_1 ) ) )
            // InternalRoboProse.g:1539:1: ( ( rule__EventListener__SublistenersAssignment_7_3_1 ) )
            {
            // InternalRoboProse.g:1539:1: ( ( rule__EventListener__SublistenersAssignment_7_3_1 ) )
            // InternalRoboProse.g:1540:2: ( rule__EventListener__SublistenersAssignment_7_3_1 )
            {
             before(grammarAccess.getEventListenerAccess().getSublistenersAssignment_7_3_1()); 
            // InternalRoboProse.g:1541:2: ( rule__EventListener__SublistenersAssignment_7_3_1 )
            // InternalRoboProse.g:1541:3: rule__EventListener__SublistenersAssignment_7_3_1
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
    // InternalRoboProse.g:1550:1: rule__ActionDelimiter__Group__0 : rule__ActionDelimiter__Group__0__Impl rule__ActionDelimiter__Group__1 ;
    public final void rule__ActionDelimiter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1554:1: ( rule__ActionDelimiter__Group__0__Impl rule__ActionDelimiter__Group__1 )
            // InternalRoboProse.g:1555:2: rule__ActionDelimiter__Group__0__Impl rule__ActionDelimiter__Group__1
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
    // InternalRoboProse.g:1562:1: rule__ActionDelimiter__Group__0__Impl : ( ( rule__ActionDelimiter__Alternatives_0 ) ) ;
    public final void rule__ActionDelimiter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1566:1: ( ( ( rule__ActionDelimiter__Alternatives_0 ) ) )
            // InternalRoboProse.g:1567:1: ( ( rule__ActionDelimiter__Alternatives_0 ) )
            {
            // InternalRoboProse.g:1567:1: ( ( rule__ActionDelimiter__Alternatives_0 ) )
            // InternalRoboProse.g:1568:2: ( rule__ActionDelimiter__Alternatives_0 )
            {
             before(grammarAccess.getActionDelimiterAccess().getAlternatives_0()); 
            // InternalRoboProse.g:1569:2: ( rule__ActionDelimiter__Alternatives_0 )
            // InternalRoboProse.g:1569:3: rule__ActionDelimiter__Alternatives_0
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
    // InternalRoboProse.g:1577:1: rule__ActionDelimiter__Group__1 : rule__ActionDelimiter__Group__1__Impl ;
    public final void rule__ActionDelimiter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1581:1: ( rule__ActionDelimiter__Group__1__Impl )
            // InternalRoboProse.g:1582:2: rule__ActionDelimiter__Group__1__Impl
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
    // InternalRoboProse.g:1588:1: rule__ActionDelimiter__Group__1__Impl : ( ( rule__ActionDelimiter__Group_1__0 )? ) ;
    public final void rule__ActionDelimiter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1592:1: ( ( ( rule__ActionDelimiter__Group_1__0 )? ) )
            // InternalRoboProse.g:1593:1: ( ( rule__ActionDelimiter__Group_1__0 )? )
            {
            // InternalRoboProse.g:1593:1: ( ( rule__ActionDelimiter__Group_1__0 )? )
            // InternalRoboProse.g:1594:2: ( rule__ActionDelimiter__Group_1__0 )?
            {
             before(grammarAccess.getActionDelimiterAccess().getGroup_1()); 
            // InternalRoboProse.g:1595:2: ( rule__ActionDelimiter__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRoboProse.g:1595:3: rule__ActionDelimiter__Group_1__0
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
    // InternalRoboProse.g:1604:1: rule__ActionDelimiter__Group_0_0__0 : rule__ActionDelimiter__Group_0_0__0__Impl rule__ActionDelimiter__Group_0_0__1 ;
    public final void rule__ActionDelimiter__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1608:1: ( rule__ActionDelimiter__Group_0_0__0__Impl rule__ActionDelimiter__Group_0_0__1 )
            // InternalRoboProse.g:1609:2: rule__ActionDelimiter__Group_0_0__0__Impl rule__ActionDelimiter__Group_0_0__1
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
    // InternalRoboProse.g:1616:1: rule__ActionDelimiter__Group_0_0__0__Impl : ( 'and' ) ;
    public final void rule__ActionDelimiter__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1620:1: ( ( 'and' ) )
            // InternalRoboProse.g:1621:1: ( 'and' )
            {
            // InternalRoboProse.g:1621:1: ( 'and' )
            // InternalRoboProse.g:1622:2: 'and'
            {
             before(grammarAccess.getActionDelimiterAccess().getAndKeyword_0_0_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRoboProse.g:1631:1: rule__ActionDelimiter__Group_0_0__1 : rule__ActionDelimiter__Group_0_0__1__Impl ;
    public final void rule__ActionDelimiter__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1635:1: ( rule__ActionDelimiter__Group_0_0__1__Impl )
            // InternalRoboProse.g:1636:2: rule__ActionDelimiter__Group_0_0__1__Impl
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
    // InternalRoboProse.g:1642:1: rule__ActionDelimiter__Group_0_0__1__Impl : ( 'then' ) ;
    public final void rule__ActionDelimiter__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1646:1: ( ( 'then' ) )
            // InternalRoboProse.g:1647:1: ( 'then' )
            {
            // InternalRoboProse.g:1647:1: ( 'then' )
            // InternalRoboProse.g:1648:2: 'then'
            {
             before(grammarAccess.getActionDelimiterAccess().getThenKeyword_0_0_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRoboProse.g:1658:1: rule__ActionDelimiter__Group_0_1__0 : rule__ActionDelimiter__Group_0_1__0__Impl rule__ActionDelimiter__Group_0_1__1 ;
    public final void rule__ActionDelimiter__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1662:1: ( rule__ActionDelimiter__Group_0_1__0__Impl rule__ActionDelimiter__Group_0_1__1 )
            // InternalRoboProse.g:1663:2: rule__ActionDelimiter__Group_0_1__0__Impl rule__ActionDelimiter__Group_0_1__1
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
    // InternalRoboProse.g:1670:1: rule__ActionDelimiter__Group_0_1__0__Impl : ( ',' ) ;
    public final void rule__ActionDelimiter__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1674:1: ( ( ',' ) )
            // InternalRoboProse.g:1675:1: ( ',' )
            {
            // InternalRoboProse.g:1675:1: ( ',' )
            // InternalRoboProse.g:1676:2: ','
            {
             before(grammarAccess.getActionDelimiterAccess().getCommaKeyword_0_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRoboProse.g:1685:1: rule__ActionDelimiter__Group_0_1__1 : rule__ActionDelimiter__Group_0_1__1__Impl ;
    public final void rule__ActionDelimiter__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1689:1: ( rule__ActionDelimiter__Group_0_1__1__Impl )
            // InternalRoboProse.g:1690:2: rule__ActionDelimiter__Group_0_1__1__Impl
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
    // InternalRoboProse.g:1696:1: rule__ActionDelimiter__Group_0_1__1__Impl : ( 'then' ) ;
    public final void rule__ActionDelimiter__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1700:1: ( ( 'then' ) )
            // InternalRoboProse.g:1701:1: ( 'then' )
            {
            // InternalRoboProse.g:1701:1: ( 'then' )
            // InternalRoboProse.g:1702:2: 'then'
            {
             before(grammarAccess.getActionDelimiterAccess().getThenKeyword_0_1_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRoboProse.g:1712:1: rule__ActionDelimiter__Group_0_2__0 : rule__ActionDelimiter__Group_0_2__0__Impl rule__ActionDelimiter__Group_0_2__1 ;
    public final void rule__ActionDelimiter__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1716:1: ( rule__ActionDelimiter__Group_0_2__0__Impl rule__ActionDelimiter__Group_0_2__1 )
            // InternalRoboProse.g:1717:2: rule__ActionDelimiter__Group_0_2__0__Impl rule__ActionDelimiter__Group_0_2__1
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
    // InternalRoboProse.g:1724:1: rule__ActionDelimiter__Group_0_2__0__Impl : ( '.' ) ;
    public final void rule__ActionDelimiter__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1728:1: ( ( '.' ) )
            // InternalRoboProse.g:1729:1: ( '.' )
            {
            // InternalRoboProse.g:1729:1: ( '.' )
            // InternalRoboProse.g:1730:2: '.'
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
    // InternalRoboProse.g:1739:1: rule__ActionDelimiter__Group_0_2__1 : rule__ActionDelimiter__Group_0_2__1__Impl ;
    public final void rule__ActionDelimiter__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1743:1: ( rule__ActionDelimiter__Group_0_2__1__Impl )
            // InternalRoboProse.g:1744:2: rule__ActionDelimiter__Group_0_2__1__Impl
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
    // InternalRoboProse.g:1750:1: rule__ActionDelimiter__Group_0_2__1__Impl : ( 'Then' ) ;
    public final void rule__ActionDelimiter__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1754:1: ( ( 'Then' ) )
            // InternalRoboProse.g:1755:1: ( 'Then' )
            {
            // InternalRoboProse.g:1755:1: ( 'Then' )
            // InternalRoboProse.g:1756:2: 'Then'
            {
             before(grammarAccess.getActionDelimiterAccess().getThenKeyword_0_2_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRoboProse.g:1766:1: rule__ActionDelimiter__Group_1__0 : rule__ActionDelimiter__Group_1__0__Impl rule__ActionDelimiter__Group_1__1 ;
    public final void rule__ActionDelimiter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1770:1: ( rule__ActionDelimiter__Group_1__0__Impl rule__ActionDelimiter__Group_1__1 )
            // InternalRoboProse.g:1771:2: rule__ActionDelimiter__Group_1__0__Impl rule__ActionDelimiter__Group_1__1
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
    // InternalRoboProse.g:1778:1: rule__ActionDelimiter__Group_1__0__Impl : ( 'it' ) ;
    public final void rule__ActionDelimiter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1782:1: ( ( 'it' ) )
            // InternalRoboProse.g:1783:1: ( 'it' )
            {
            // InternalRoboProse.g:1783:1: ( 'it' )
            // InternalRoboProse.g:1784:2: 'it'
            {
             before(grammarAccess.getActionDelimiterAccess().getItKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRoboProse.g:1793:1: rule__ActionDelimiter__Group_1__1 : rule__ActionDelimiter__Group_1__1__Impl ;
    public final void rule__ActionDelimiter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1797:1: ( rule__ActionDelimiter__Group_1__1__Impl )
            // InternalRoboProse.g:1798:2: rule__ActionDelimiter__Group_1__1__Impl
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
    // InternalRoboProse.g:1804:1: rule__ActionDelimiter__Group_1__1__Impl : ( 'should' ) ;
    public final void rule__ActionDelimiter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1808:1: ( ( 'should' ) )
            // InternalRoboProse.g:1809:1: ( 'should' )
            {
            // InternalRoboProse.g:1809:1: ( 'should' )
            // InternalRoboProse.g:1810:2: 'should'
            {
             before(grammarAccess.getActionDelimiterAccess().getShouldKeyword_1_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRoboProse.g:1820:1: rule__ParagraphDelimiter__Group__0 : rule__ParagraphDelimiter__Group__0__Impl rule__ParagraphDelimiter__Group__1 ;
    public final void rule__ParagraphDelimiter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1824:1: ( rule__ParagraphDelimiter__Group__0__Impl rule__ParagraphDelimiter__Group__1 )
            // InternalRoboProse.g:1825:2: rule__ParagraphDelimiter__Group__0__Impl rule__ParagraphDelimiter__Group__1
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
    // InternalRoboProse.g:1832:1: rule__ParagraphDelimiter__Group__0__Impl : ( '.' ) ;
    public final void rule__ParagraphDelimiter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1836:1: ( ( '.' ) )
            // InternalRoboProse.g:1837:1: ( '.' )
            {
            // InternalRoboProse.g:1837:1: ( '.' )
            // InternalRoboProse.g:1838:2: '.'
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
    // InternalRoboProse.g:1847:1: rule__ParagraphDelimiter__Group__1 : rule__ParagraphDelimiter__Group__1__Impl rule__ParagraphDelimiter__Group__2 ;
    public final void rule__ParagraphDelimiter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1851:1: ( rule__ParagraphDelimiter__Group__1__Impl rule__ParagraphDelimiter__Group__2 )
            // InternalRoboProse.g:1852:2: rule__ParagraphDelimiter__Group__1__Impl rule__ParagraphDelimiter__Group__2
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
    // InternalRoboProse.g:1859:1: rule__ParagraphDelimiter__Group__1__Impl : ( RULE_NEWLINE ) ;
    public final void rule__ParagraphDelimiter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1863:1: ( ( RULE_NEWLINE ) )
            // InternalRoboProse.g:1864:1: ( RULE_NEWLINE )
            {
            // InternalRoboProse.g:1864:1: ( RULE_NEWLINE )
            // InternalRoboProse.g:1865:2: RULE_NEWLINE
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
    // InternalRoboProse.g:1874:1: rule__ParagraphDelimiter__Group__2 : rule__ParagraphDelimiter__Group__2__Impl ;
    public final void rule__ParagraphDelimiter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1878:1: ( rule__ParagraphDelimiter__Group__2__Impl )
            // InternalRoboProse.g:1879:2: rule__ParagraphDelimiter__Group__2__Impl
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
    // InternalRoboProse.g:1885:1: rule__ParagraphDelimiter__Group__2__Impl : ( ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* ) ) ;
    public final void rule__ParagraphDelimiter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1889:1: ( ( ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* ) ) )
            // InternalRoboProse.g:1890:1: ( ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* ) )
            {
            // InternalRoboProse.g:1890:1: ( ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* ) )
            // InternalRoboProse.g:1891:2: ( ( RULE_NEWLINE ) ) ( ( RULE_NEWLINE )* )
            {
            // InternalRoboProse.g:1891:2: ( ( RULE_NEWLINE ) )
            // InternalRoboProse.g:1892:3: ( RULE_NEWLINE )
            {
             before(grammarAccess.getParagraphDelimiterAccess().getNEWLINETerminalRuleCall_2()); 
            // InternalRoboProse.g:1893:3: ( RULE_NEWLINE )
            // InternalRoboProse.g:1893:4: RULE_NEWLINE
            {
            match(input,RULE_NEWLINE,FOLLOW_20); 

            }

             after(grammarAccess.getParagraphDelimiterAccess().getNEWLINETerminalRuleCall_2()); 

            }

            // InternalRoboProse.g:1896:2: ( ( RULE_NEWLINE )* )
            // InternalRoboProse.g:1897:3: ( RULE_NEWLINE )*
            {
             before(grammarAccess.getParagraphDelimiterAccess().getNEWLINETerminalRuleCall_2()); 
            // InternalRoboProse.g:1898:3: ( RULE_NEWLINE )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_NEWLINE) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRoboProse.g:1898:4: RULE_NEWLINE
            	    {
            	    match(input,RULE_NEWLINE,FOLLOW_20); 

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalRoboProse.g:1908:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1912:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalRoboProse.g:1913:2: rule__Move__Group__0__Impl rule__Move__Group__1
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
    // InternalRoboProse.g:1920:1: rule__Move__Group__0__Impl : ( () ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1924:1: ( ( () ) )
            // InternalRoboProse.g:1925:1: ( () )
            {
            // InternalRoboProse.g:1925:1: ( () )
            // InternalRoboProse.g:1926:2: ()
            {
             before(grammarAccess.getMoveAccess().getMoveAction_0()); 
            // InternalRoboProse.g:1927:2: ()
            // InternalRoboProse.g:1927:3: 
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
    // InternalRoboProse.g:1935:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1939:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // InternalRoboProse.g:1940:2: rule__Move__Group__1__Impl rule__Move__Group__2
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
    // InternalRoboProse.g:1947:1: rule__Move__Group__1__Impl : ( 'move' ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1951:1: ( ( 'move' ) )
            // InternalRoboProse.g:1952:1: ( 'move' )
            {
            // InternalRoboProse.g:1952:1: ( 'move' )
            // InternalRoboProse.g:1953:2: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalRoboProse.g:1962:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1966:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // InternalRoboProse.g:1967:2: rule__Move__Group__2__Impl rule__Move__Group__3
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
    // InternalRoboProse.g:1974:1: rule__Move__Group__2__Impl : ( ( rule__Move__DirectionAssignment_2 )? ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1978:1: ( ( ( rule__Move__DirectionAssignment_2 )? ) )
            // InternalRoboProse.g:1979:1: ( ( rule__Move__DirectionAssignment_2 )? )
            {
            // InternalRoboProse.g:1979:1: ( ( rule__Move__DirectionAssignment_2 )? )
            // InternalRoboProse.g:1980:2: ( rule__Move__DirectionAssignment_2 )?
            {
             before(grammarAccess.getMoveAccess().getDirectionAssignment_2()); 
            // InternalRoboProse.g:1981:2: ( rule__Move__DirectionAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=17 && LA18_0<=21)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRoboProse.g:1981:3: rule__Move__DirectionAssignment_2
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
    // InternalRoboProse.g:1989:1: rule__Move__Group__3 : rule__Move__Group__3__Impl ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:1993:1: ( rule__Move__Group__3__Impl )
            // InternalRoboProse.g:1994:2: rule__Move__Group__3__Impl
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
    // InternalRoboProse.g:2000:1: rule__Move__Group__3__Impl : ( ( rule__Move__Group_3__0 )? ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2004:1: ( ( ( rule__Move__Group_3__0 )? ) )
            // InternalRoboProse.g:2005:1: ( ( rule__Move__Group_3__0 )? )
            {
            // InternalRoboProse.g:2005:1: ( ( rule__Move__Group_3__0 )? )
            // InternalRoboProse.g:2006:2: ( rule__Move__Group_3__0 )?
            {
             before(grammarAccess.getMoveAccess().getGroup_3()); 
            // InternalRoboProse.g:2007:2: ( rule__Move__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRoboProse.g:2007:3: rule__Move__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Move__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoveAccess().getGroup_3()); 

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


    // $ANTLR start "rule__Move__Group_3__0"
    // InternalRoboProse.g:2016:1: rule__Move__Group_3__0 : rule__Move__Group_3__0__Impl rule__Move__Group_3__1 ;
    public final void rule__Move__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2020:1: ( rule__Move__Group_3__0__Impl rule__Move__Group_3__1 )
            // InternalRoboProse.g:2021:2: rule__Move__Group_3__0__Impl rule__Move__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__Move__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_3__1();

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
    // $ANTLR end "rule__Move__Group_3__0"


    // $ANTLR start "rule__Move__Group_3__0__Impl"
    // InternalRoboProse.g:2028:1: rule__Move__Group_3__0__Impl : ( 'for' ) ;
    public final void rule__Move__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2032:1: ( ( 'for' ) )
            // InternalRoboProse.g:2033:1: ( 'for' )
            {
            // InternalRoboProse.g:2033:1: ( 'for' )
            // InternalRoboProse.g:2034:2: 'for'
            {
             before(grammarAccess.getMoveAccess().getForKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getForKeyword_3_0()); 

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
    // $ANTLR end "rule__Move__Group_3__0__Impl"


    // $ANTLR start "rule__Move__Group_3__1"
    // InternalRoboProse.g:2043:1: rule__Move__Group_3__1 : rule__Move__Group_3__1__Impl rule__Move__Group_3__2 ;
    public final void rule__Move__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2047:1: ( rule__Move__Group_3__1__Impl rule__Move__Group_3__2 )
            // InternalRoboProse.g:2048:2: rule__Move__Group_3__1__Impl rule__Move__Group_3__2
            {
            pushFollow(FOLLOW_24);
            rule__Move__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_3__2();

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
    // $ANTLR end "rule__Move__Group_3__1"


    // $ANTLR start "rule__Move__Group_3__1__Impl"
    // InternalRoboProse.g:2055:1: rule__Move__Group_3__1__Impl : ( ( rule__Move__DurationAssignment_3_1 ) ) ;
    public final void rule__Move__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2059:1: ( ( ( rule__Move__DurationAssignment_3_1 ) ) )
            // InternalRoboProse.g:2060:1: ( ( rule__Move__DurationAssignment_3_1 ) )
            {
            // InternalRoboProse.g:2060:1: ( ( rule__Move__DurationAssignment_3_1 ) )
            // InternalRoboProse.g:2061:2: ( rule__Move__DurationAssignment_3_1 )
            {
             before(grammarAccess.getMoveAccess().getDurationAssignment_3_1()); 
            // InternalRoboProse.g:2062:2: ( rule__Move__DurationAssignment_3_1 )
            // InternalRoboProse.g:2062:3: rule__Move__DurationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Move__DurationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getDurationAssignment_3_1()); 

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
    // $ANTLR end "rule__Move__Group_3__1__Impl"


    // $ANTLR start "rule__Move__Group_3__2"
    // InternalRoboProse.g:2070:1: rule__Move__Group_3__2 : rule__Move__Group_3__2__Impl ;
    public final void rule__Move__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2074:1: ( rule__Move__Group_3__2__Impl )
            // InternalRoboProse.g:2075:2: rule__Move__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group_3__2__Impl();

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
    // $ANTLR end "rule__Move__Group_3__2"


    // $ANTLR start "rule__Move__Group_3__2__Impl"
    // InternalRoboProse.g:2081:1: rule__Move__Group_3__2__Impl : ( 'seconds' ) ;
    public final void rule__Move__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2085:1: ( ( 'seconds' ) )
            // InternalRoboProse.g:2086:1: ( 'seconds' )
            {
            // InternalRoboProse.g:2086:1: ( 'seconds' )
            // InternalRoboProse.g:2087:2: 'seconds'
            {
             before(grammarAccess.getMoveAccess().getSecondsKeyword_3_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getSecondsKeyword_3_2()); 

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
    // $ANTLR end "rule__Move__Group_3__2__Impl"


    // $ANTLR start "rule__Turn__Group__0"
    // InternalRoboProse.g:2097:1: rule__Turn__Group__0 : rule__Turn__Group__0__Impl rule__Turn__Group__1 ;
    public final void rule__Turn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2101:1: ( rule__Turn__Group__0__Impl rule__Turn__Group__1 )
            // InternalRoboProse.g:2102:2: rule__Turn__Group__0__Impl rule__Turn__Group__1
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
    // InternalRoboProse.g:2109:1: rule__Turn__Group__0__Impl : ( () ) ;
    public final void rule__Turn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2113:1: ( ( () ) )
            // InternalRoboProse.g:2114:1: ( () )
            {
            // InternalRoboProse.g:2114:1: ( () )
            // InternalRoboProse.g:2115:2: ()
            {
             before(grammarAccess.getTurnAccess().getTurnAction_0()); 
            // InternalRoboProse.g:2116:2: ()
            // InternalRoboProse.g:2116:3: 
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
    // InternalRoboProse.g:2124:1: rule__Turn__Group__1 : rule__Turn__Group__1__Impl rule__Turn__Group__2 ;
    public final void rule__Turn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2128:1: ( rule__Turn__Group__1__Impl rule__Turn__Group__2 )
            // InternalRoboProse.g:2129:2: rule__Turn__Group__1__Impl rule__Turn__Group__2
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
    // InternalRoboProse.g:2136:1: rule__Turn__Group__1__Impl : ( 'turn' ) ;
    public final void rule__Turn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2140:1: ( ( 'turn' ) )
            // InternalRoboProse.g:2141:1: ( 'turn' )
            {
            // InternalRoboProse.g:2141:1: ( 'turn' )
            // InternalRoboProse.g:2142:2: 'turn'
            {
             before(grammarAccess.getTurnAccess().getTurnKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRoboProse.g:2151:1: rule__Turn__Group__2 : rule__Turn__Group__2__Impl rule__Turn__Group__3 ;
    public final void rule__Turn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2155:1: ( rule__Turn__Group__2__Impl rule__Turn__Group__3 )
            // InternalRoboProse.g:2156:2: rule__Turn__Group__2__Impl rule__Turn__Group__3
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
    // InternalRoboProse.g:2163:1: rule__Turn__Group__2__Impl : ( ( rule__Turn__DirectionAssignment_2 )? ) ;
    public final void rule__Turn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2167:1: ( ( ( rule__Turn__DirectionAssignment_2 )? ) )
            // InternalRoboProse.g:2168:1: ( ( rule__Turn__DirectionAssignment_2 )? )
            {
            // InternalRoboProse.g:2168:1: ( ( rule__Turn__DirectionAssignment_2 )? )
            // InternalRoboProse.g:2169:2: ( rule__Turn__DirectionAssignment_2 )?
            {
             before(grammarAccess.getTurnAccess().getDirectionAssignment_2()); 
            // InternalRoboProse.g:2170:2: ( rule__Turn__DirectionAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=22 && LA20_0<=23)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRoboProse.g:2170:3: rule__Turn__DirectionAssignment_2
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
    // InternalRoboProse.g:2178:1: rule__Turn__Group__3 : rule__Turn__Group__3__Impl ;
    public final void rule__Turn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2182:1: ( rule__Turn__Group__3__Impl )
            // InternalRoboProse.g:2183:2: rule__Turn__Group__3__Impl
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
    // InternalRoboProse.g:2189:1: rule__Turn__Group__3__Impl : ( ( rule__Turn__Alternatives_3 )? ) ;
    public final void rule__Turn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2193:1: ( ( ( rule__Turn__Alternatives_3 )? ) )
            // InternalRoboProse.g:2194:1: ( ( rule__Turn__Alternatives_3 )? )
            {
            // InternalRoboProse.g:2194:1: ( ( rule__Turn__Alternatives_3 )? )
            // InternalRoboProse.g:2195:2: ( rule__Turn__Alternatives_3 )?
            {
             before(grammarAccess.getTurnAccess().getAlternatives_3()); 
            // InternalRoboProse.g:2196:2: ( rule__Turn__Alternatives_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT||LA21_0==36||LA21_0==41) ) {
                alt21=1;
            }
            else if ( (LA21_0==12) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==RULE_INT) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalRoboProse.g:2196:3: rule__Turn__Alternatives_3
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
    // InternalRoboProse.g:2205:1: rule__Turn__Group_3_0__0 : rule__Turn__Group_3_0__0__Impl rule__Turn__Group_3_0__1 ;
    public final void rule__Turn__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2209:1: ( rule__Turn__Group_3_0__0__Impl rule__Turn__Group_3_0__1 )
            // InternalRoboProse.g:2210:2: rule__Turn__Group_3_0__0__Impl rule__Turn__Group_3_0__1
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
    // InternalRoboProse.g:2217:1: rule__Turn__Group_3_0__0__Impl : ( 'for' ) ;
    public final void rule__Turn__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2221:1: ( ( 'for' ) )
            // InternalRoboProse.g:2222:1: ( 'for' )
            {
            // InternalRoboProse.g:2222:1: ( 'for' )
            // InternalRoboProse.g:2223:2: 'for'
            {
             before(grammarAccess.getTurnAccess().getForKeyword_3_0_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRoboProse.g:2232:1: rule__Turn__Group_3_0__1 : rule__Turn__Group_3_0__1__Impl rule__Turn__Group_3_0__2 ;
    public final void rule__Turn__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2236:1: ( rule__Turn__Group_3_0__1__Impl rule__Turn__Group_3_0__2 )
            // InternalRoboProse.g:2237:2: rule__Turn__Group_3_0__1__Impl rule__Turn__Group_3_0__2
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
    // InternalRoboProse.g:2244:1: rule__Turn__Group_3_0__1__Impl : ( ( rule__Turn__DurationAssignment_3_0_1 ) ) ;
    public final void rule__Turn__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2248:1: ( ( ( rule__Turn__DurationAssignment_3_0_1 ) ) )
            // InternalRoboProse.g:2249:1: ( ( rule__Turn__DurationAssignment_3_0_1 ) )
            {
            // InternalRoboProse.g:2249:1: ( ( rule__Turn__DurationAssignment_3_0_1 ) )
            // InternalRoboProse.g:2250:2: ( rule__Turn__DurationAssignment_3_0_1 )
            {
             before(grammarAccess.getTurnAccess().getDurationAssignment_3_0_1()); 
            // InternalRoboProse.g:2251:2: ( rule__Turn__DurationAssignment_3_0_1 )
            // InternalRoboProse.g:2251:3: rule__Turn__DurationAssignment_3_0_1
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
    // InternalRoboProse.g:2259:1: rule__Turn__Group_3_0__2 : rule__Turn__Group_3_0__2__Impl ;
    public final void rule__Turn__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2263:1: ( rule__Turn__Group_3_0__2__Impl )
            // InternalRoboProse.g:2264:2: rule__Turn__Group_3_0__2__Impl
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
    // InternalRoboProse.g:2270:1: rule__Turn__Group_3_0__2__Impl : ( 'seconds' ) ;
    public final void rule__Turn__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2274:1: ( ( 'seconds' ) )
            // InternalRoboProse.g:2275:1: ( 'seconds' )
            {
            // InternalRoboProse.g:2275:1: ( 'seconds' )
            // InternalRoboProse.g:2276:2: 'seconds'
            {
             before(grammarAccess.getTurnAccess().getSecondsKeyword_3_0_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRoboProse.g:2286:1: rule__Turn__Group_3_1__0 : rule__Turn__Group_3_1__0__Impl rule__Turn__Group_3_1__1 ;
    public final void rule__Turn__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2290:1: ( rule__Turn__Group_3_1__0__Impl rule__Turn__Group_3_1__1 )
            // InternalRoboProse.g:2291:2: rule__Turn__Group_3_1__0__Impl rule__Turn__Group_3_1__1
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
    // InternalRoboProse.g:2298:1: rule__Turn__Group_3_1__0__Impl : ( ( rule__Turn__DegreesAssignment_3_1_0 ) ) ;
    public final void rule__Turn__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2302:1: ( ( ( rule__Turn__DegreesAssignment_3_1_0 ) ) )
            // InternalRoboProse.g:2303:1: ( ( rule__Turn__DegreesAssignment_3_1_0 ) )
            {
            // InternalRoboProse.g:2303:1: ( ( rule__Turn__DegreesAssignment_3_1_0 ) )
            // InternalRoboProse.g:2304:2: ( rule__Turn__DegreesAssignment_3_1_0 )
            {
             before(grammarAccess.getTurnAccess().getDegreesAssignment_3_1_0()); 
            // InternalRoboProse.g:2305:2: ( rule__Turn__DegreesAssignment_3_1_0 )
            // InternalRoboProse.g:2305:3: rule__Turn__DegreesAssignment_3_1_0
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
    // InternalRoboProse.g:2313:1: rule__Turn__Group_3_1__1 : rule__Turn__Group_3_1__1__Impl ;
    public final void rule__Turn__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2317:1: ( rule__Turn__Group_3_1__1__Impl )
            // InternalRoboProse.g:2318:2: rule__Turn__Group_3_1__1__Impl
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
    // InternalRoboProse.g:2324:1: rule__Turn__Group_3_1__1__Impl : ( 'degrees' ) ;
    public final void rule__Turn__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2328:1: ( ( 'degrees' ) )
            // InternalRoboProse.g:2329:1: ( 'degrees' )
            {
            // InternalRoboProse.g:2329:1: ( 'degrees' )
            // InternalRoboProse.g:2330:2: 'degrees'
            {
             before(grammarAccess.getTurnAccess().getDegreesKeyword_3_1_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRoboProse.g:2340:1: rule__Stop__Group__0 : rule__Stop__Group__0__Impl rule__Stop__Group__1 ;
    public final void rule__Stop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2344:1: ( rule__Stop__Group__0__Impl rule__Stop__Group__1 )
            // InternalRoboProse.g:2345:2: rule__Stop__Group__0__Impl rule__Stop__Group__1
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
    // InternalRoboProse.g:2352:1: rule__Stop__Group__0__Impl : ( () ) ;
    public final void rule__Stop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2356:1: ( ( () ) )
            // InternalRoboProse.g:2357:1: ( () )
            {
            // InternalRoboProse.g:2357:1: ( () )
            // InternalRoboProse.g:2358:2: ()
            {
             before(grammarAccess.getStopAccess().getStopAction_0()); 
            // InternalRoboProse.g:2359:2: ()
            // InternalRoboProse.g:2359:3: 
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
    // InternalRoboProse.g:2367:1: rule__Stop__Group__1 : rule__Stop__Group__1__Impl rule__Stop__Group__2 ;
    public final void rule__Stop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2371:1: ( rule__Stop__Group__1__Impl rule__Stop__Group__2 )
            // InternalRoboProse.g:2372:2: rule__Stop__Group__1__Impl rule__Stop__Group__2
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
    // InternalRoboProse.g:2379:1: rule__Stop__Group__1__Impl : ( 'stop' ) ;
    public final void rule__Stop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2383:1: ( ( 'stop' ) )
            // InternalRoboProse.g:2384:1: ( 'stop' )
            {
            // InternalRoboProse.g:2384:1: ( 'stop' )
            // InternalRoboProse.g:2385:2: 'stop'
            {
             before(grammarAccess.getStopAccess().getStopKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalRoboProse.g:2394:1: rule__Stop__Group__2 : rule__Stop__Group__2__Impl ;
    public final void rule__Stop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2398:1: ( rule__Stop__Group__2__Impl )
            // InternalRoboProse.g:2399:2: rule__Stop__Group__2__Impl
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
    // InternalRoboProse.g:2405:1: rule__Stop__Group__2__Impl : ( ( rule__Stop__Group_2__0 )? ) ;
    public final void rule__Stop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2409:1: ( ( ( rule__Stop__Group_2__0 )? ) )
            // InternalRoboProse.g:2410:1: ( ( rule__Stop__Group_2__0 )? )
            {
            // InternalRoboProse.g:2410:1: ( ( rule__Stop__Group_2__0 )? )
            // InternalRoboProse.g:2411:2: ( rule__Stop__Group_2__0 )?
            {
             before(grammarAccess.getStopAccess().getGroup_2()); 
            // InternalRoboProse.g:2412:2: ( rule__Stop__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRoboProse.g:2412:3: rule__Stop__Group_2__0
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
    // InternalRoboProse.g:2421:1: rule__Stop__Group_2__0 : rule__Stop__Group_2__0__Impl rule__Stop__Group_2__1 ;
    public final void rule__Stop__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2425:1: ( rule__Stop__Group_2__0__Impl rule__Stop__Group_2__1 )
            // InternalRoboProse.g:2426:2: rule__Stop__Group_2__0__Impl rule__Stop__Group_2__1
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
    // InternalRoboProse.g:2433:1: rule__Stop__Group_2__0__Impl : ( 'for' ) ;
    public final void rule__Stop__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2437:1: ( ( 'for' ) )
            // InternalRoboProse.g:2438:1: ( 'for' )
            {
            // InternalRoboProse.g:2438:1: ( 'for' )
            // InternalRoboProse.g:2439:2: 'for'
            {
             before(grammarAccess.getStopAccess().getForKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRoboProse.g:2448:1: rule__Stop__Group_2__1 : rule__Stop__Group_2__1__Impl rule__Stop__Group_2__2 ;
    public final void rule__Stop__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2452:1: ( rule__Stop__Group_2__1__Impl rule__Stop__Group_2__2 )
            // InternalRoboProse.g:2453:2: rule__Stop__Group_2__1__Impl rule__Stop__Group_2__2
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
    // InternalRoboProse.g:2460:1: rule__Stop__Group_2__1__Impl : ( ( rule__Stop__DurationAssignment_2_1 ) ) ;
    public final void rule__Stop__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2464:1: ( ( ( rule__Stop__DurationAssignment_2_1 ) ) )
            // InternalRoboProse.g:2465:1: ( ( rule__Stop__DurationAssignment_2_1 ) )
            {
            // InternalRoboProse.g:2465:1: ( ( rule__Stop__DurationAssignment_2_1 ) )
            // InternalRoboProse.g:2466:2: ( rule__Stop__DurationAssignment_2_1 )
            {
             before(grammarAccess.getStopAccess().getDurationAssignment_2_1()); 
            // InternalRoboProse.g:2467:2: ( rule__Stop__DurationAssignment_2_1 )
            // InternalRoboProse.g:2467:3: rule__Stop__DurationAssignment_2_1
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
    // InternalRoboProse.g:2475:1: rule__Stop__Group_2__2 : rule__Stop__Group_2__2__Impl ;
    public final void rule__Stop__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2479:1: ( rule__Stop__Group_2__2__Impl )
            // InternalRoboProse.g:2480:2: rule__Stop__Group_2__2__Impl
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
    // InternalRoboProse.g:2486:1: rule__Stop__Group_2__2__Impl : ( 'seconds' ) ;
    public final void rule__Stop__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2490:1: ( ( 'seconds' ) )
            // InternalRoboProse.g:2491:1: ( 'seconds' )
            {
            // InternalRoboProse.g:2491:1: ( 'seconds' )
            // InternalRoboProse.g:2492:2: 'seconds'
            {
             before(grammarAccess.getStopAccess().getSecondsKeyword_2_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRoboProse.g:2502:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2506:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalRoboProse.g:2507:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
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
    // InternalRoboProse.g:2514:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2518:1: ( ( ( '-' )? ) )
            // InternalRoboProse.g:2519:1: ( ( '-' )? )
            {
            // InternalRoboProse.g:2519:1: ( ( '-' )? )
            // InternalRoboProse.g:2520:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalRoboProse.g:2521:2: ( '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRoboProse.g:2521:3: '-'
                    {
                    match(input,41,FOLLOW_2); 

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
    // InternalRoboProse.g:2529:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2533:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalRoboProse.g:2534:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
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
    // InternalRoboProse.g:2541:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2545:1: ( ( ( RULE_INT )? ) )
            // InternalRoboProse.g:2546:1: ( ( RULE_INT )? )
            {
            // InternalRoboProse.g:2546:1: ( ( RULE_INT )? )
            // InternalRoboProse.g:2547:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalRoboProse.g:2548:2: ( RULE_INT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==RULE_INT||LA24_1==12) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalRoboProse.g:2548:3: RULE_INT
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
    // InternalRoboProse.g:2556:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2560:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalRoboProse.g:2561:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
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
    // InternalRoboProse.g:2568:1: rule__EFloat__Group__2__Impl : ( ( '.' )? ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2572:1: ( ( ( '.' )? ) )
            // InternalRoboProse.g:2573:1: ( ( '.' )? )
            {
            // InternalRoboProse.g:2573:1: ( ( '.' )? )
            // InternalRoboProse.g:2574:2: ( '.' )?
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            // InternalRoboProse.g:2575:2: ( '.' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==12) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRoboProse.g:2575:3: '.'
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
    // InternalRoboProse.g:2583:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2587:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalRoboProse.g:2588:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
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
    // InternalRoboProse.g:2595:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2599:1: ( ( RULE_INT ) )
            // InternalRoboProse.g:2600:1: ( RULE_INT )
            {
            // InternalRoboProse.g:2600:1: ( RULE_INT )
            // InternalRoboProse.g:2601:2: RULE_INT
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
    // InternalRoboProse.g:2610:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2614:1: ( rule__EFloat__Group__4__Impl )
            // InternalRoboProse.g:2615:2: rule__EFloat__Group__4__Impl
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
    // InternalRoboProse.g:2621:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2625:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalRoboProse.g:2626:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalRoboProse.g:2626:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalRoboProse.g:2627:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalRoboProse.g:2628:2: ( rule__EFloat__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=15 && LA26_0<=16)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRoboProse.g:2628:3: rule__EFloat__Group_4__0
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
    // InternalRoboProse.g:2637:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2641:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalRoboProse.g:2642:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
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
    // InternalRoboProse.g:2649:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2653:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalRoboProse.g:2654:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalRoboProse.g:2654:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalRoboProse.g:2655:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalRoboProse.g:2656:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalRoboProse.g:2656:3: rule__EFloat__Alternatives_4_0
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
    // InternalRoboProse.g:2664:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2668:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalRoboProse.g:2669:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
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
    // InternalRoboProse.g:2676:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2680:1: ( ( ( '-' )? ) )
            // InternalRoboProse.g:2681:1: ( ( '-' )? )
            {
            // InternalRoboProse.g:2681:1: ( ( '-' )? )
            // InternalRoboProse.g:2682:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalRoboProse.g:2683:2: ( '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRoboProse.g:2683:3: '-'
                    {
                    match(input,41,FOLLOW_2); 

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
    // InternalRoboProse.g:2691:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2695:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalRoboProse.g:2696:2: rule__EFloat__Group_4__2__Impl
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
    // InternalRoboProse.g:2702:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2706:1: ( ( RULE_INT ) )
            // InternalRoboProse.g:2707:1: ( RULE_INT )
            {
            // InternalRoboProse.g:2707:1: ( RULE_INT )
            // InternalRoboProse.g:2708:2: RULE_INT
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
    // InternalRoboProse.g:2718:1: rule__Obstacle__Group__0 : rule__Obstacle__Group__0__Impl rule__Obstacle__Group__1 ;
    public final void rule__Obstacle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2722:1: ( rule__Obstacle__Group__0__Impl rule__Obstacle__Group__1 )
            // InternalRoboProse.g:2723:2: rule__Obstacle__Group__0__Impl rule__Obstacle__Group__1
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
    // InternalRoboProse.g:2730:1: rule__Obstacle__Group__0__Impl : ( () ) ;
    public final void rule__Obstacle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2734:1: ( ( () ) )
            // InternalRoboProse.g:2735:1: ( () )
            {
            // InternalRoboProse.g:2735:1: ( () )
            // InternalRoboProse.g:2736:2: ()
            {
             before(grammarAccess.getObstacleAccess().getObstacleAction_0()); 
            // InternalRoboProse.g:2737:2: ()
            // InternalRoboProse.g:2737:3: 
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
    // InternalRoboProse.g:2745:1: rule__Obstacle__Group__1 : rule__Obstacle__Group__1__Impl rule__Obstacle__Group__2 ;
    public final void rule__Obstacle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2749:1: ( rule__Obstacle__Group__1__Impl rule__Obstacle__Group__2 )
            // InternalRoboProse.g:2750:2: rule__Obstacle__Group__1__Impl rule__Obstacle__Group__2
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
    // InternalRoboProse.g:2757:1: rule__Obstacle__Group__1__Impl : ( 'meets' ) ;
    public final void rule__Obstacle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2761:1: ( ( 'meets' ) )
            // InternalRoboProse.g:2762:1: ( 'meets' )
            {
            // InternalRoboProse.g:2762:1: ( 'meets' )
            // InternalRoboProse.g:2763:2: 'meets'
            {
             before(grammarAccess.getObstacleAccess().getMeetsKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalRoboProse.g:2772:1: rule__Obstacle__Group__2 : rule__Obstacle__Group__2__Impl rule__Obstacle__Group__3 ;
    public final void rule__Obstacle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2776:1: ( rule__Obstacle__Group__2__Impl rule__Obstacle__Group__3 )
            // InternalRoboProse.g:2777:2: rule__Obstacle__Group__2__Impl rule__Obstacle__Group__3
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
    // InternalRoboProse.g:2784:1: rule__Obstacle__Group__2__Impl : ( 'an' ) ;
    public final void rule__Obstacle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2788:1: ( ( 'an' ) )
            // InternalRoboProse.g:2789:1: ( 'an' )
            {
            // InternalRoboProse.g:2789:1: ( 'an' )
            // InternalRoboProse.g:2790:2: 'an'
            {
             before(grammarAccess.getObstacleAccess().getAnKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalRoboProse.g:2799:1: rule__Obstacle__Group__3 : rule__Obstacle__Group__3__Impl ;
    public final void rule__Obstacle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2803:1: ( rule__Obstacle__Group__3__Impl )
            // InternalRoboProse.g:2804:2: rule__Obstacle__Group__3__Impl
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
    // InternalRoboProse.g:2810:1: rule__Obstacle__Group__3__Impl : ( 'obstacle' ) ;
    public final void rule__Obstacle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2814:1: ( ( 'obstacle' ) )
            // InternalRoboProse.g:2815:1: ( 'obstacle' )
            {
            // InternalRoboProse.g:2815:1: ( 'obstacle' )
            // InternalRoboProse.g:2816:2: 'obstacle'
            {
             before(grammarAccess.getObstacleAccess().getObstacleKeyword_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalRoboProse.g:2826:1: rule__Tapped__Group__0 : rule__Tapped__Group__0__Impl rule__Tapped__Group__1 ;
    public final void rule__Tapped__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2830:1: ( rule__Tapped__Group__0__Impl rule__Tapped__Group__1 )
            // InternalRoboProse.g:2831:2: rule__Tapped__Group__0__Impl rule__Tapped__Group__1
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
    // InternalRoboProse.g:2838:1: rule__Tapped__Group__0__Impl : ( () ) ;
    public final void rule__Tapped__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2842:1: ( ( () ) )
            // InternalRoboProse.g:2843:1: ( () )
            {
            // InternalRoboProse.g:2843:1: ( () )
            // InternalRoboProse.g:2844:2: ()
            {
             before(grammarAccess.getTappedAccess().getTappedAction_0()); 
            // InternalRoboProse.g:2845:2: ()
            // InternalRoboProse.g:2845:3: 
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
    // InternalRoboProse.g:2853:1: rule__Tapped__Group__1 : rule__Tapped__Group__1__Impl rule__Tapped__Group__2 ;
    public final void rule__Tapped__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2857:1: ( rule__Tapped__Group__1__Impl rule__Tapped__Group__2 )
            // InternalRoboProse.g:2858:2: rule__Tapped__Group__1__Impl rule__Tapped__Group__2
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
    // InternalRoboProse.g:2865:1: rule__Tapped__Group__1__Impl : ( 'is' ) ;
    public final void rule__Tapped__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2869:1: ( ( 'is' ) )
            // InternalRoboProse.g:2870:1: ( 'is' )
            {
            // InternalRoboProse.g:2870:1: ( 'is' )
            // InternalRoboProse.g:2871:2: 'is'
            {
             before(grammarAccess.getTappedAccess().getIsKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalRoboProse.g:2880:1: rule__Tapped__Group__2 : rule__Tapped__Group__2__Impl ;
    public final void rule__Tapped__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2884:1: ( rule__Tapped__Group__2__Impl )
            // InternalRoboProse.g:2885:2: rule__Tapped__Group__2__Impl
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
    // InternalRoboProse.g:2891:1: rule__Tapped__Group__2__Impl : ( 'tapped' ) ;
    public final void rule__Tapped__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2895:1: ( ( 'tapped' ) )
            // InternalRoboProse.g:2896:1: ( 'tapped' )
            {
            // InternalRoboProse.g:2896:1: ( 'tapped' )
            // InternalRoboProse.g:2897:2: 'tapped'
            {
             before(grammarAccess.getTappedAccess().getTappedKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalRoboProse.g:2907:1: rule__RoboProse__MainAssignment_1_3 : ( ruleMain ) ;
    public final void rule__RoboProse__MainAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2911:1: ( ( ruleMain ) )
            // InternalRoboProse.g:2912:2: ( ruleMain )
            {
            // InternalRoboProse.g:2912:2: ( ruleMain )
            // InternalRoboProse.g:2913:3: ruleMain
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
    // InternalRoboProse.g:2922:1: rule__RoboProse__ListenersAssignment_2_0 : ( ruleEventListener ) ;
    public final void rule__RoboProse__ListenersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2926:1: ( ( ruleEventListener ) )
            // InternalRoboProse.g:2927:2: ( ruleEventListener )
            {
            // InternalRoboProse.g:2927:2: ( ruleEventListener )
            // InternalRoboProse.g:2928:3: ruleEventListener
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
    // InternalRoboProse.g:2937:1: rule__RoboProse__ListenersAssignment_2_1_1 : ( ruleEventListener ) ;
    public final void rule__RoboProse__ListenersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2941:1: ( ( ruleEventListener ) )
            // InternalRoboProse.g:2942:2: ( ruleEventListener )
            {
            // InternalRoboProse.g:2942:2: ( ruleEventListener )
            // InternalRoboProse.g:2943:3: ruleEventListener
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
    // InternalRoboProse.g:2952:1: rule__Main__ActionsAssignment_0 : ( ruleAction ) ;
    public final void rule__Main__ActionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2956:1: ( ( ruleAction ) )
            // InternalRoboProse.g:2957:2: ( ruleAction )
            {
            // InternalRoboProse.g:2957:2: ( ruleAction )
            // InternalRoboProse.g:2958:3: ruleAction
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
    // InternalRoboProse.g:2967:1: rule__Main__ActionsAssignment_1_1 : ( ruleAction ) ;
    public final void rule__Main__ActionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2971:1: ( ( ruleAction ) )
            // InternalRoboProse.g:2972:2: ( ruleAction )
            {
            // InternalRoboProse.g:2972:2: ( ruleAction )
            // InternalRoboProse.g:2973:3: ruleAction
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
    // InternalRoboProse.g:2982:1: rule__EventListener__EventAssignment_2 : ( ruleEvent ) ;
    public final void rule__EventListener__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:2986:1: ( ( ruleEvent ) )
            // InternalRoboProse.g:2987:2: ( ruleEvent )
            {
            // InternalRoboProse.g:2987:2: ( ruleEvent )
            // InternalRoboProse.g:2988:3: ruleEvent
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
    // InternalRoboProse.g:2997:1: rule__EventListener__ActionsAssignment_5 : ( ruleAction ) ;
    public final void rule__EventListener__ActionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3001:1: ( ( ruleAction ) )
            // InternalRoboProse.g:3002:2: ( ruleAction )
            {
            // InternalRoboProse.g:3002:2: ( ruleAction )
            // InternalRoboProse.g:3003:3: ruleAction
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
    // InternalRoboProse.g:3012:1: rule__EventListener__ActionsAssignment_6_1 : ( ruleAction ) ;
    public final void rule__EventListener__ActionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3016:1: ( ( ruleAction ) )
            // InternalRoboProse.g:3017:2: ( ruleAction )
            {
            // InternalRoboProse.g:3017:2: ( ruleAction )
            // InternalRoboProse.g:3018:3: ruleAction
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
    // InternalRoboProse.g:3027:1: rule__EventListener__SublistenersAssignment_7_2 : ( ruleEventListener ) ;
    public final void rule__EventListener__SublistenersAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3031:1: ( ( ruleEventListener ) )
            // InternalRoboProse.g:3032:2: ( ruleEventListener )
            {
            // InternalRoboProse.g:3032:2: ( ruleEventListener )
            // InternalRoboProse.g:3033:3: ruleEventListener
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
    // InternalRoboProse.g:3042:1: rule__EventListener__SublistenersAssignment_7_3_1 : ( ruleEventListener ) ;
    public final void rule__EventListener__SublistenersAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3046:1: ( ( ruleEventListener ) )
            // InternalRoboProse.g:3047:2: ( ruleEventListener )
            {
            // InternalRoboProse.g:3047:2: ( ruleEventListener )
            // InternalRoboProse.g:3048:3: ruleEventListener
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
    // InternalRoboProse.g:3057:1: rule__Move__DirectionAssignment_2 : ( ruleMOVE_DIRECTION ) ;
    public final void rule__Move__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3061:1: ( ( ruleMOVE_DIRECTION ) )
            // InternalRoboProse.g:3062:2: ( ruleMOVE_DIRECTION )
            {
            // InternalRoboProse.g:3062:2: ( ruleMOVE_DIRECTION )
            // InternalRoboProse.g:3063:3: ruleMOVE_DIRECTION
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


    // $ANTLR start "rule__Move__DurationAssignment_3_1"
    // InternalRoboProse.g:3072:1: rule__Move__DurationAssignment_3_1 : ( ruleEFloat ) ;
    public final void rule__Move__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3076:1: ( ( ruleEFloat ) )
            // InternalRoboProse.g:3077:2: ( ruleEFloat )
            {
            // InternalRoboProse.g:3077:2: ( ruleEFloat )
            // InternalRoboProse.g:3078:3: ruleEFloat
            {
             before(grammarAccess.getMoveAccess().getDurationEFloatParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getDurationEFloatParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Move__DurationAssignment_3_1"


    // $ANTLR start "rule__Turn__DirectionAssignment_2"
    // InternalRoboProse.g:3087:1: rule__Turn__DirectionAssignment_2 : ( ruleTURN_DIRECTION ) ;
    public final void rule__Turn__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3091:1: ( ( ruleTURN_DIRECTION ) )
            // InternalRoboProse.g:3092:2: ( ruleTURN_DIRECTION )
            {
            // InternalRoboProse.g:3092:2: ( ruleTURN_DIRECTION )
            // InternalRoboProse.g:3093:3: ruleTURN_DIRECTION
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
    // InternalRoboProse.g:3102:1: rule__Turn__DurationAssignment_3_0_1 : ( ruleEFloat ) ;
    public final void rule__Turn__DurationAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3106:1: ( ( ruleEFloat ) )
            // InternalRoboProse.g:3107:2: ( ruleEFloat )
            {
            // InternalRoboProse.g:3107:2: ( ruleEFloat )
            // InternalRoboProse.g:3108:3: ruleEFloat
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
    // InternalRoboProse.g:3117:1: rule__Turn__DegreesAssignment_3_1_0 : ( ruleEFloat ) ;
    public final void rule__Turn__DegreesAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3121:1: ( ( ruleEFloat ) )
            // InternalRoboProse.g:3122:2: ( ruleEFloat )
            {
            // InternalRoboProse.g:3122:2: ( ruleEFloat )
            // InternalRoboProse.g:3123:3: ruleEFloat
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


    // $ANTLR start "rule__Stop__DurationAssignment_2_1"
    // InternalRoboProse.g:3132:1: rule__Stop__DurationAssignment_2_1 : ( ruleEFloat ) ;
    public final void rule__Stop__DurationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboProse.g:3136:1: ( ( ruleEFloat ) )
            // InternalRoboProse.g:3137:2: ( ruleEFloat )
            {
            // InternalRoboProse.g:3137:2: ( ruleEFloat )
            // InternalRoboProse.g:3138:3: ruleEFloat
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001006000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000014800000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000280001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000280001002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000290001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000010003E0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000001020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000021000C01020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});

}