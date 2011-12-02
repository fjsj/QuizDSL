package v1.quiz.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import v1.quiz.services.QuizGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuizParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'multiChoice'", "'singleChoice'", "'quizGame'", "'by'", "'{'", "'}'", "'question'", "'text'", "':'", "';'", "'score'", "'choices'", "'hint'", "'->'"
    };
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalQuizParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQuizParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQuizParser.tokenNames; }
    public String getGrammarFileName() { return "../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g"; }


     
     	private QuizGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(QuizGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleQuizGame"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:60:1: entryRuleQuizGame : ruleQuizGame EOF ;
    public final void entryRuleQuizGame() throws RecognitionException {
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:61:1: ( ruleQuizGame EOF )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:62:1: ruleQuizGame EOF
            {
             before(grammarAccess.getQuizGameRule()); 
            pushFollow(FOLLOW_ruleQuizGame_in_entryRuleQuizGame61);
            ruleQuizGame();

            state._fsp--;

             after(grammarAccess.getQuizGameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuizGame68); 

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
    // $ANTLR end "entryRuleQuizGame"


    // $ANTLR start "ruleQuizGame"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:69:1: ruleQuizGame : ( ( rule__QuizGame__Group__0 ) ) ;
    public final void ruleQuizGame() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:73:2: ( ( ( rule__QuizGame__Group__0 ) ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:74:1: ( ( rule__QuizGame__Group__0 ) )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:74:1: ( ( rule__QuizGame__Group__0 ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:75:1: ( rule__QuizGame__Group__0 )
            {
             before(grammarAccess.getQuizGameAccess().getGroup()); 
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:76:1: ( rule__QuizGame__Group__0 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:76:2: rule__QuizGame__Group__0
            {
            pushFollow(FOLLOW_rule__QuizGame__Group__0_in_ruleQuizGame94);
            rule__QuizGame__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuizGameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuizGame"


    // $ANTLR start "entryRuleQuiz"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:88:1: entryRuleQuiz : ruleQuiz EOF ;
    public final void entryRuleQuiz() throws RecognitionException {
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:89:1: ( ruleQuiz EOF )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:90:1: ruleQuiz EOF
            {
             before(grammarAccess.getQuizRule()); 
            pushFollow(FOLLOW_ruleQuiz_in_entryRuleQuiz121);
            ruleQuiz();

            state._fsp--;

             after(grammarAccess.getQuizRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuiz128); 

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
    // $ANTLR end "entryRuleQuiz"


    // $ANTLR start "ruleQuiz"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:97:1: ruleQuiz : ( ( rule__Quiz__Group__0 ) ) ;
    public final void ruleQuiz() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:101:2: ( ( ( rule__Quiz__Group__0 ) ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:102:1: ( ( rule__Quiz__Group__0 ) )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:102:1: ( ( rule__Quiz__Group__0 ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:103:1: ( rule__Quiz__Group__0 )
            {
             before(grammarAccess.getQuizAccess().getGroup()); 
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:104:1: ( rule__Quiz__Group__0 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:104:2: rule__Quiz__Group__0
            {
            pushFollow(FOLLOW_rule__Quiz__Group__0_in_ruleQuiz154);
            rule__Quiz__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuizAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuiz"


    // $ANTLR start "entryRuleChoice"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:116:1: entryRuleChoice : ruleChoice EOF ;
    public final void entryRuleChoice() throws RecognitionException {
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:117:1: ( ruleChoice EOF )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:118:1: ruleChoice EOF
            {
             before(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice181);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getChoiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice188); 

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
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:125:1: ruleChoice : ( ( rule__Choice__Group__0 ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:129:2: ( ( ( rule__Choice__Group__0 ) ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:130:1: ( ( rule__Choice__Group__0 ) )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:130:1: ( ( rule__Choice__Group__0 ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:131:1: ( rule__Choice__Group__0 )
            {
             before(grammarAccess.getChoiceAccess().getGroup()); 
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:132:1: ( rule__Choice__Group__0 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:132:2: rule__Choice__Group__0
            {
            pushFollow(FOLLOW_rule__Choice__Group__0_in_ruleChoice214);
            rule__Choice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleBool"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:144:1: entryRuleBool : ruleBool EOF ;
    public final void entryRuleBool() throws RecognitionException {
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:145:1: ( ruleBool EOF )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:146:1: ruleBool EOF
            {
             before(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_ruleBool_in_entryRuleBool241);
            ruleBool();

            state._fsp--;

             after(grammarAccess.getBoolRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBool248); 

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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:153:1: ruleBool : ( ( rule__Bool__Alternatives ) ) ;
    public final void ruleBool() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:157:2: ( ( ( rule__Bool__Alternatives ) ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:158:1: ( ( rule__Bool__Alternatives ) )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:158:1: ( ( rule__Bool__Alternatives ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:159:1: ( rule__Bool__Alternatives )
            {
             before(grammarAccess.getBoolAccess().getAlternatives()); 
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:160:1: ( rule__Bool__Alternatives )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:160:2: rule__Bool__Alternatives
            {
            pushFollow(FOLLOW_rule__Bool__Alternatives_in_ruleBool274);
            rule__Bool__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBool"


    // $ANTLR start "ruleType"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:173:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:177:1: ( ( ( rule__Type__Alternatives ) ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:178:1: ( ( rule__Type__Alternatives ) )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:178:1: ( ( rule__Type__Alternatives ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:179:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:180:1: ( rule__Type__Alternatives )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:180:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType311);
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


    // $ANTLR start "rule__Bool__Alternatives"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:191:1: rule__Bool__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Bool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:195:1: ( ( 'true' ) | ( 'false' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:196:1: ( 'true' )
                    {
                    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:196:1: ( 'true' )
                    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:197:1: 'true'
                    {
                     before(grammarAccess.getBoolAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Bool__Alternatives347); 
                     after(grammarAccess.getBoolAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:204:6: ( 'false' )
                    {
                    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:204:6: ( 'false' )
                    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:205:1: 'false'
                    {
                     before(grammarAccess.getBoolAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Bool__Alternatives367); 
                     after(grammarAccess.getBoolAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__Bool__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:217:1: rule__Type__Alternatives : ( ( ( 'multiChoice' ) ) | ( ( 'singleChoice' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:221:1: ( ( ( 'multiChoice' ) ) | ( ( 'singleChoice' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:222:1: ( ( 'multiChoice' ) )
                    {
                    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:222:1: ( ( 'multiChoice' ) )
                    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:223:1: ( 'multiChoice' )
                    {
                     before(grammarAccess.getTypeAccess().getMultiChoiceEnumLiteralDeclaration_0()); 
                    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:224:1: ( 'multiChoice' )
                    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:224:3: 'multiChoice'
                    {
                    match(input,13,FOLLOW_13_in_rule__Type__Alternatives402); 

                    }

                     after(grammarAccess.getTypeAccess().getMultiChoiceEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:229:6: ( ( 'singleChoice' ) )
                    {
                    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:229:6: ( ( 'singleChoice' ) )
                    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:230:1: ( 'singleChoice' )
                    {
                     before(grammarAccess.getTypeAccess().getSingleChoiceEnumLiteralDeclaration_1()); 
                    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:231:1: ( 'singleChoice' )
                    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:231:3: 'singleChoice'
                    {
                    match(input,14,FOLLOW_14_in_rule__Type__Alternatives423); 

                    }

                     after(grammarAccess.getTypeAccess().getSingleChoiceEnumLiteralDeclaration_1()); 

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


    // $ANTLR start "rule__QuizGame__Group__0"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:243:1: rule__QuizGame__Group__0 : rule__QuizGame__Group__0__Impl rule__QuizGame__Group__1 ;
    public final void rule__QuizGame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:247:1: ( rule__QuizGame__Group__0__Impl rule__QuizGame__Group__1 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:248:2: rule__QuizGame__Group__0__Impl rule__QuizGame__Group__1
            {
            pushFollow(FOLLOW_rule__QuizGame__Group__0__Impl_in_rule__QuizGame__Group__0456);
            rule__QuizGame__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuizGame__Group__1_in_rule__QuizGame__Group__0459);
            rule__QuizGame__Group__1();

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
    // $ANTLR end "rule__QuizGame__Group__0"


    // $ANTLR start "rule__QuizGame__Group__0__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:255:1: rule__QuizGame__Group__0__Impl : ( 'quizGame' ) ;
    public final void rule__QuizGame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:259:1: ( ( 'quizGame' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:260:1: ( 'quizGame' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:260:1: ( 'quizGame' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:261:1: 'quizGame'
            {
             before(grammarAccess.getQuizGameAccess().getQuizGameKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__QuizGame__Group__0__Impl487); 
             after(grammarAccess.getQuizGameAccess().getQuizGameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuizGame__Group__0__Impl"


    // $ANTLR start "rule__QuizGame__Group__1"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:274:1: rule__QuizGame__Group__1 : rule__QuizGame__Group__1__Impl rule__QuizGame__Group__2 ;
    public final void rule__QuizGame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:278:1: ( rule__QuizGame__Group__1__Impl rule__QuizGame__Group__2 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:279:2: rule__QuizGame__Group__1__Impl rule__QuizGame__Group__2
            {
            pushFollow(FOLLOW_rule__QuizGame__Group__1__Impl_in_rule__QuizGame__Group__1518);
            rule__QuizGame__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuizGame__Group__2_in_rule__QuizGame__Group__1521);
            rule__QuizGame__Group__2();

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
    // $ANTLR end "rule__QuizGame__Group__1"


    // $ANTLR start "rule__QuizGame__Group__1__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:286:1: rule__QuizGame__Group__1__Impl : ( ( rule__QuizGame__NameAssignment_1 ) ) ;
    public final void rule__QuizGame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:290:1: ( ( ( rule__QuizGame__NameAssignment_1 ) ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:291:1: ( ( rule__QuizGame__NameAssignment_1 ) )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:291:1: ( ( rule__QuizGame__NameAssignment_1 ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:292:1: ( rule__QuizGame__NameAssignment_1 )
            {
             before(grammarAccess.getQuizGameAccess().getNameAssignment_1()); 
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:293:1: ( rule__QuizGame__NameAssignment_1 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:293:2: rule__QuizGame__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__QuizGame__NameAssignment_1_in_rule__QuizGame__Group__1__Impl548);
            rule__QuizGame__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuizGameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuizGame__Group__1__Impl"


    // $ANTLR start "rule__QuizGame__Group__2"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:303:1: rule__QuizGame__Group__2 : rule__QuizGame__Group__2__Impl rule__QuizGame__Group__3 ;
    public final void rule__QuizGame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:307:1: ( rule__QuizGame__Group__2__Impl rule__QuizGame__Group__3 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:308:2: rule__QuizGame__Group__2__Impl rule__QuizGame__Group__3
            {
            pushFollow(FOLLOW_rule__QuizGame__Group__2__Impl_in_rule__QuizGame__Group__2578);
            rule__QuizGame__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuizGame__Group__3_in_rule__QuizGame__Group__2581);
            rule__QuizGame__Group__3();

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
    // $ANTLR end "rule__QuizGame__Group__2"


    // $ANTLR start "rule__QuizGame__Group__2__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:315:1: rule__QuizGame__Group__2__Impl : ( 'by' ) ;
    public final void rule__QuizGame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:319:1: ( ( 'by' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:320:1: ( 'by' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:320:1: ( 'by' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:321:1: 'by'
            {
             before(grammarAccess.getQuizGameAccess().getByKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__QuizGame__Group__2__Impl609); 
             after(grammarAccess.getQuizGameAccess().getByKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuizGame__Group__2__Impl"


    // $ANTLR start "rule__QuizGame__Group__3"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:334:1: rule__QuizGame__Group__3 : rule__QuizGame__Group__3__Impl rule__QuizGame__Group__4 ;
    public final void rule__QuizGame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:338:1: ( rule__QuizGame__Group__3__Impl rule__QuizGame__Group__4 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:339:2: rule__QuizGame__Group__3__Impl rule__QuizGame__Group__4
            {
            pushFollow(FOLLOW_rule__QuizGame__Group__3__Impl_in_rule__QuizGame__Group__3640);
            rule__QuizGame__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuizGame__Group__4_in_rule__QuizGame__Group__3643);
            rule__QuizGame__Group__4();

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
    // $ANTLR end "rule__QuizGame__Group__3"


    // $ANTLR start "rule__QuizGame__Group__3__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:346:1: rule__QuizGame__Group__3__Impl : ( ( rule__QuizGame__AuthorAssignment_3 ) ) ;
    public final void rule__QuizGame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:350:1: ( ( ( rule__QuizGame__AuthorAssignment_3 ) ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:351:1: ( ( rule__QuizGame__AuthorAssignment_3 ) )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:351:1: ( ( rule__QuizGame__AuthorAssignment_3 ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:352:1: ( rule__QuizGame__AuthorAssignment_3 )
            {
             before(grammarAccess.getQuizGameAccess().getAuthorAssignment_3()); 
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:353:1: ( rule__QuizGame__AuthorAssignment_3 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:353:2: rule__QuizGame__AuthorAssignment_3
            {
            pushFollow(FOLLOW_rule__QuizGame__AuthorAssignment_3_in_rule__QuizGame__Group__3__Impl670);
            rule__QuizGame__AuthorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuizGameAccess().getAuthorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuizGame__Group__3__Impl"


    // $ANTLR start "rule__QuizGame__Group__4"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:363:1: rule__QuizGame__Group__4 : rule__QuizGame__Group__4__Impl rule__QuizGame__Group__5 ;
    public final void rule__QuizGame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:367:1: ( rule__QuizGame__Group__4__Impl rule__QuizGame__Group__5 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:368:2: rule__QuizGame__Group__4__Impl rule__QuizGame__Group__5
            {
            pushFollow(FOLLOW_rule__QuizGame__Group__4__Impl_in_rule__QuizGame__Group__4700);
            rule__QuizGame__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuizGame__Group__5_in_rule__QuizGame__Group__4703);
            rule__QuizGame__Group__5();

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
    // $ANTLR end "rule__QuizGame__Group__4"


    // $ANTLR start "rule__QuizGame__Group__4__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:375:1: rule__QuizGame__Group__4__Impl : ( '{' ) ;
    public final void rule__QuizGame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:379:1: ( ( '{' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:380:1: ( '{' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:380:1: ( '{' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:381:1: '{'
            {
             before(grammarAccess.getQuizGameAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__QuizGame__Group__4__Impl731); 
             after(grammarAccess.getQuizGameAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuizGame__Group__4__Impl"


    // $ANTLR start "rule__QuizGame__Group__5"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:394:1: rule__QuizGame__Group__5 : rule__QuizGame__Group__5__Impl rule__QuizGame__Group__6 ;
    public final void rule__QuizGame__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:398:1: ( rule__QuizGame__Group__5__Impl rule__QuizGame__Group__6 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:399:2: rule__QuizGame__Group__5__Impl rule__QuizGame__Group__6
            {
            pushFollow(FOLLOW_rule__QuizGame__Group__5__Impl_in_rule__QuizGame__Group__5762);
            rule__QuizGame__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuizGame__Group__6_in_rule__QuizGame__Group__5765);
            rule__QuizGame__Group__6();

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
    // $ANTLR end "rule__QuizGame__Group__5"


    // $ANTLR start "rule__QuizGame__Group__5__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:406:1: rule__QuizGame__Group__5__Impl : ( ( ( rule__QuizGame__ElementsAssignment_5 ) ) ( ( rule__QuizGame__ElementsAssignment_5 )* ) ) ;
    public final void rule__QuizGame__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:410:1: ( ( ( ( rule__QuizGame__ElementsAssignment_5 ) ) ( ( rule__QuizGame__ElementsAssignment_5 )* ) ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:411:1: ( ( ( rule__QuizGame__ElementsAssignment_5 ) ) ( ( rule__QuizGame__ElementsAssignment_5 )* ) )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:411:1: ( ( ( rule__QuizGame__ElementsAssignment_5 ) ) ( ( rule__QuizGame__ElementsAssignment_5 )* ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:412:1: ( ( rule__QuizGame__ElementsAssignment_5 ) ) ( ( rule__QuizGame__ElementsAssignment_5 )* )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:412:1: ( ( rule__QuizGame__ElementsAssignment_5 ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:413:1: ( rule__QuizGame__ElementsAssignment_5 )
            {
             before(grammarAccess.getQuizGameAccess().getElementsAssignment_5()); 
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:414:1: ( rule__QuizGame__ElementsAssignment_5 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:414:2: rule__QuizGame__ElementsAssignment_5
            {
            pushFollow(FOLLOW_rule__QuizGame__ElementsAssignment_5_in_rule__QuizGame__Group__5__Impl794);
            rule__QuizGame__ElementsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQuizGameAccess().getElementsAssignment_5()); 

            }

            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:417:1: ( ( rule__QuizGame__ElementsAssignment_5 )* )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:418:1: ( rule__QuizGame__ElementsAssignment_5 )*
            {
             before(grammarAccess.getQuizGameAccess().getElementsAssignment_5()); 
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:419:1: ( rule__QuizGame__ElementsAssignment_5 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=13 && LA3_0<=14)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:419:2: rule__QuizGame__ElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__QuizGame__ElementsAssignment_5_in_rule__QuizGame__Group__5__Impl806);
            	    rule__QuizGame__ElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getQuizGameAccess().getElementsAssignment_5()); 

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
    // $ANTLR end "rule__QuizGame__Group__5__Impl"


    // $ANTLR start "rule__QuizGame__Group__6"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:430:1: rule__QuizGame__Group__6 : rule__QuizGame__Group__6__Impl ;
    public final void rule__QuizGame__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:434:1: ( rule__QuizGame__Group__6__Impl )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:435:2: rule__QuizGame__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__QuizGame__Group__6__Impl_in_rule__QuizGame__Group__6839);
            rule__QuizGame__Group__6__Impl();

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
    // $ANTLR end "rule__QuizGame__Group__6"


    // $ANTLR start "rule__QuizGame__Group__6__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:441:1: rule__QuizGame__Group__6__Impl : ( '}' ) ;
    public final void rule__QuizGame__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:445:1: ( ( '}' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:446:1: ( '}' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:446:1: ( '}' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:447:1: '}'
            {
             before(grammarAccess.getQuizGameAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__QuizGame__Group__6__Impl867); 
             after(grammarAccess.getQuizGameAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuizGame__Group__6__Impl"


    // $ANTLR start "rule__Quiz__Group__0"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:474:1: rule__Quiz__Group__0 : rule__Quiz__Group__0__Impl rule__Quiz__Group__1 ;
    public final void rule__Quiz__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:478:1: ( rule__Quiz__Group__0__Impl rule__Quiz__Group__1 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:479:2: rule__Quiz__Group__0__Impl rule__Quiz__Group__1
            {
            pushFollow(FOLLOW_rule__Quiz__Group__0__Impl_in_rule__Quiz__Group__0912);
            rule__Quiz__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group__1_in_rule__Quiz__Group__0915);
            rule__Quiz__Group__1();

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
    // $ANTLR end "rule__Quiz__Group__0"


    // $ANTLR start "rule__Quiz__Group__0__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:486:1: rule__Quiz__Group__0__Impl : ( ( rule__Quiz__TypeAssignment_0 ) ) ;
    public final void rule__Quiz__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:490:1: ( ( ( rule__Quiz__TypeAssignment_0 ) ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:491:1: ( ( rule__Quiz__TypeAssignment_0 ) )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:491:1: ( ( rule__Quiz__TypeAssignment_0 ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:492:1: ( rule__Quiz__TypeAssignment_0 )
            {
             before(grammarAccess.getQuizAccess().getTypeAssignment_0()); 
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:493:1: ( rule__Quiz__TypeAssignment_0 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:493:2: rule__Quiz__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Quiz__TypeAssignment_0_in_rule__Quiz__Group__0__Impl942);
            rule__Quiz__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQuizAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__0__Impl"


    // $ANTLR start "rule__Quiz__Group__1"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:503:1: rule__Quiz__Group__1 : rule__Quiz__Group__1__Impl rule__Quiz__Group__2 ;
    public final void rule__Quiz__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:507:1: ( rule__Quiz__Group__1__Impl rule__Quiz__Group__2 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:508:2: rule__Quiz__Group__1__Impl rule__Quiz__Group__2
            {
            pushFollow(FOLLOW_rule__Quiz__Group__1__Impl_in_rule__Quiz__Group__1972);
            rule__Quiz__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group__2_in_rule__Quiz__Group__1975);
            rule__Quiz__Group__2();

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
    // $ANTLR end "rule__Quiz__Group__1"


    // $ANTLR start "rule__Quiz__Group__1__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:515:1: rule__Quiz__Group__1__Impl : ( 'question' ) ;
    public final void rule__Quiz__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:519:1: ( ( 'question' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:520:1: ( 'question' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:520:1: ( 'question' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:521:1: 'question'
            {
             before(grammarAccess.getQuizAccess().getQuestionKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Quiz__Group__1__Impl1003); 
             after(grammarAccess.getQuizAccess().getQuestionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__1__Impl"


    // $ANTLR start "rule__Quiz__Group__2"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:534:1: rule__Quiz__Group__2 : rule__Quiz__Group__2__Impl rule__Quiz__Group__3 ;
    public final void rule__Quiz__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:538:1: ( rule__Quiz__Group__2__Impl rule__Quiz__Group__3 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:539:2: rule__Quiz__Group__2__Impl rule__Quiz__Group__3
            {
            pushFollow(FOLLOW_rule__Quiz__Group__2__Impl_in_rule__Quiz__Group__21034);
            rule__Quiz__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group__3_in_rule__Quiz__Group__21037);
            rule__Quiz__Group__3();

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
    // $ANTLR end "rule__Quiz__Group__2"


    // $ANTLR start "rule__Quiz__Group__2__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:546:1: rule__Quiz__Group__2__Impl : ( ( rule__Quiz__NameAssignment_2 ) ) ;
    public final void rule__Quiz__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:550:1: ( ( ( rule__Quiz__NameAssignment_2 ) ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:551:1: ( ( rule__Quiz__NameAssignment_2 ) )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:551:1: ( ( rule__Quiz__NameAssignment_2 ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:552:1: ( rule__Quiz__NameAssignment_2 )
            {
             before(grammarAccess.getQuizAccess().getNameAssignment_2()); 
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:553:1: ( rule__Quiz__NameAssignment_2 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:553:2: rule__Quiz__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Quiz__NameAssignment_2_in_rule__Quiz__Group__2__Impl1064);
            rule__Quiz__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuizAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__2__Impl"


    // $ANTLR start "rule__Quiz__Group__3"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:563:1: rule__Quiz__Group__3 : rule__Quiz__Group__3__Impl rule__Quiz__Group__4 ;
    public final void rule__Quiz__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:567:1: ( rule__Quiz__Group__3__Impl rule__Quiz__Group__4 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:568:2: rule__Quiz__Group__3__Impl rule__Quiz__Group__4
            {
            pushFollow(FOLLOW_rule__Quiz__Group__3__Impl_in_rule__Quiz__Group__31094);
            rule__Quiz__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group__4_in_rule__Quiz__Group__31097);
            rule__Quiz__Group__4();

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
    // $ANTLR end "rule__Quiz__Group__3"


    // $ANTLR start "rule__Quiz__Group__3__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:575:1: rule__Quiz__Group__3__Impl : ( '{' ) ;
    public final void rule__Quiz__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:579:1: ( ( '{' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:580:1: ( '{' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:580:1: ( '{' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:581:1: '{'
            {
             before(grammarAccess.getQuizAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Quiz__Group__3__Impl1125); 
             after(grammarAccess.getQuizAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__3__Impl"


    // $ANTLR start "rule__Quiz__Group__4"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:594:1: rule__Quiz__Group__4 : rule__Quiz__Group__4__Impl rule__Quiz__Group__5 ;
    public final void rule__Quiz__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:598:1: ( rule__Quiz__Group__4__Impl rule__Quiz__Group__5 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:599:2: rule__Quiz__Group__4__Impl rule__Quiz__Group__5
            {
            pushFollow(FOLLOW_rule__Quiz__Group__4__Impl_in_rule__Quiz__Group__41156);
            rule__Quiz__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group__5_in_rule__Quiz__Group__41159);
            rule__Quiz__Group__5();

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
    // $ANTLR end "rule__Quiz__Group__4"


    // $ANTLR start "rule__Quiz__Group__4__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:606:1: rule__Quiz__Group__4__Impl : ( 'text' ) ;
    public final void rule__Quiz__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:610:1: ( ( 'text' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:611:1: ( 'text' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:611:1: ( 'text' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:612:1: 'text'
            {
             before(grammarAccess.getQuizAccess().getTextKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Quiz__Group__4__Impl1187); 
             after(grammarAccess.getQuizAccess().getTextKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__4__Impl"


    // $ANTLR start "rule__Quiz__Group__5"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:625:1: rule__Quiz__Group__5 : rule__Quiz__Group__5__Impl rule__Quiz__Group__6 ;
    public final void rule__Quiz__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:629:1: ( rule__Quiz__Group__5__Impl rule__Quiz__Group__6 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:630:2: rule__Quiz__Group__5__Impl rule__Quiz__Group__6
            {
            pushFollow(FOLLOW_rule__Quiz__Group__5__Impl_in_rule__Quiz__Group__51218);
            rule__Quiz__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group__6_in_rule__Quiz__Group__51221);
            rule__Quiz__Group__6();

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
    // $ANTLR end "rule__Quiz__Group__5"


    // $ANTLR start "rule__Quiz__Group__5__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:637:1: rule__Quiz__Group__5__Impl : ( ':' ) ;
    public final void rule__Quiz__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:641:1: ( ( ':' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:642:1: ( ':' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:642:1: ( ':' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:643:1: ':'
            {
             before(grammarAccess.getQuizAccess().getColonKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Quiz__Group__5__Impl1249); 
             after(grammarAccess.getQuizAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__5__Impl"


    // $ANTLR start "rule__Quiz__Group__6"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:656:1: rule__Quiz__Group__6 : rule__Quiz__Group__6__Impl rule__Quiz__Group__7 ;
    public final void rule__Quiz__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:660:1: ( rule__Quiz__Group__6__Impl rule__Quiz__Group__7 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:661:2: rule__Quiz__Group__6__Impl rule__Quiz__Group__7
            {
            pushFollow(FOLLOW_rule__Quiz__Group__6__Impl_in_rule__Quiz__Group__61280);
            rule__Quiz__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group__7_in_rule__Quiz__Group__61283);
            rule__Quiz__Group__7();

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
    // $ANTLR end "rule__Quiz__Group__6"


    // $ANTLR start "rule__Quiz__Group__6__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:668:1: rule__Quiz__Group__6__Impl : ( ( rule__Quiz__TextAssignment_6 ) ) ;
    public final void rule__Quiz__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:672:1: ( ( ( rule__Quiz__TextAssignment_6 ) ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:673:1: ( ( rule__Quiz__TextAssignment_6 ) )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:673:1: ( ( rule__Quiz__TextAssignment_6 ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:674:1: ( rule__Quiz__TextAssignment_6 )
            {
             before(grammarAccess.getQuizAccess().getTextAssignment_6()); 
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:675:1: ( rule__Quiz__TextAssignment_6 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:675:2: rule__Quiz__TextAssignment_6
            {
            pushFollow(FOLLOW_rule__Quiz__TextAssignment_6_in_rule__Quiz__Group__6__Impl1310);
            rule__Quiz__TextAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getQuizAccess().getTextAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__6__Impl"


    // $ANTLR start "rule__Quiz__Group__7"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:685:1: rule__Quiz__Group__7 : rule__Quiz__Group__7__Impl rule__Quiz__Group__8 ;
    public final void rule__Quiz__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:689:1: ( rule__Quiz__Group__7__Impl rule__Quiz__Group__8 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:690:2: rule__Quiz__Group__7__Impl rule__Quiz__Group__8
            {
            pushFollow(FOLLOW_rule__Quiz__Group__7__Impl_in_rule__Quiz__Group__71340);
            rule__Quiz__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group__8_in_rule__Quiz__Group__71343);
            rule__Quiz__Group__8();

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
    // $ANTLR end "rule__Quiz__Group__7"


    // $ANTLR start "rule__Quiz__Group__7__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:697:1: rule__Quiz__Group__7__Impl : ( ';' ) ;
    public final void rule__Quiz__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:701:1: ( ( ';' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:702:1: ( ';' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:702:1: ( ';' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:703:1: ';'
            {
             before(grammarAccess.getQuizAccess().getSemicolonKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__Quiz__Group__7__Impl1371); 
             after(grammarAccess.getQuizAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__7__Impl"


    // $ANTLR start "rule__Quiz__Group__8"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:716:1: rule__Quiz__Group__8 : rule__Quiz__Group__8__Impl rule__Quiz__Group__9 ;
    public final void rule__Quiz__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:720:1: ( rule__Quiz__Group__8__Impl rule__Quiz__Group__9 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:721:2: rule__Quiz__Group__8__Impl rule__Quiz__Group__9
            {
            pushFollow(FOLLOW_rule__Quiz__Group__8__Impl_in_rule__Quiz__Group__81402);
            rule__Quiz__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group__9_in_rule__Quiz__Group__81405);
            rule__Quiz__Group__9();

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
    // $ANTLR end "rule__Quiz__Group__8"


    // $ANTLR start "rule__Quiz__Group__8__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:728:1: rule__Quiz__Group__8__Impl : ( 'score' ) ;
    public final void rule__Quiz__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:732:1: ( ( 'score' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:733:1: ( 'score' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:733:1: ( 'score' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:734:1: 'score'
            {
             before(grammarAccess.getQuizAccess().getScoreKeyword_8()); 
            match(input,23,FOLLOW_23_in_rule__Quiz__Group__8__Impl1433); 
             after(grammarAccess.getQuizAccess().getScoreKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__8__Impl"


    // $ANTLR start "rule__Quiz__Group__9"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:747:1: rule__Quiz__Group__9 : rule__Quiz__Group__9__Impl rule__Quiz__Group__10 ;
    public final void rule__Quiz__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:751:1: ( rule__Quiz__Group__9__Impl rule__Quiz__Group__10 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:752:2: rule__Quiz__Group__9__Impl rule__Quiz__Group__10
            {
            pushFollow(FOLLOW_rule__Quiz__Group__9__Impl_in_rule__Quiz__Group__91464);
            rule__Quiz__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group__10_in_rule__Quiz__Group__91467);
            rule__Quiz__Group__10();

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
    // $ANTLR end "rule__Quiz__Group__9"


    // $ANTLR start "rule__Quiz__Group__9__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:759:1: rule__Quiz__Group__9__Impl : ( ':' ) ;
    public final void rule__Quiz__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:763:1: ( ( ':' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:764:1: ( ':' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:764:1: ( ':' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:765:1: ':'
            {
             before(grammarAccess.getQuizAccess().getColonKeyword_9()); 
            match(input,21,FOLLOW_21_in_rule__Quiz__Group__9__Impl1495); 
             after(grammarAccess.getQuizAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__9__Impl"


    // $ANTLR start "rule__Quiz__Group__10"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:778:1: rule__Quiz__Group__10 : rule__Quiz__Group__10__Impl rule__Quiz__Group__11 ;
    public final void rule__Quiz__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:782:1: ( rule__Quiz__Group__10__Impl rule__Quiz__Group__11 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:783:2: rule__Quiz__Group__10__Impl rule__Quiz__Group__11
            {
            pushFollow(FOLLOW_rule__Quiz__Group__10__Impl_in_rule__Quiz__Group__101526);
            rule__Quiz__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group__11_in_rule__Quiz__Group__101529);
            rule__Quiz__Group__11();

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
    // $ANTLR end "rule__Quiz__Group__10"


    // $ANTLR start "rule__Quiz__Group__10__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:790:1: rule__Quiz__Group__10__Impl : ( ( rule__Quiz__ScoreAssignment_10 ) ) ;
    public final void rule__Quiz__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:794:1: ( ( ( rule__Quiz__ScoreAssignment_10 ) ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:795:1: ( ( rule__Quiz__ScoreAssignment_10 ) )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:795:1: ( ( rule__Quiz__ScoreAssignment_10 ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:796:1: ( rule__Quiz__ScoreAssignment_10 )
            {
             before(grammarAccess.getQuizAccess().getScoreAssignment_10()); 
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:797:1: ( rule__Quiz__ScoreAssignment_10 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:797:2: rule__Quiz__ScoreAssignment_10
            {
            pushFollow(FOLLOW_rule__Quiz__ScoreAssignment_10_in_rule__Quiz__Group__10__Impl1556);
            rule__Quiz__ScoreAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getQuizAccess().getScoreAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__10__Impl"


    // $ANTLR start "rule__Quiz__Group__11"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:807:1: rule__Quiz__Group__11 : rule__Quiz__Group__11__Impl rule__Quiz__Group__12 ;
    public final void rule__Quiz__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:811:1: ( rule__Quiz__Group__11__Impl rule__Quiz__Group__12 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:812:2: rule__Quiz__Group__11__Impl rule__Quiz__Group__12
            {
            pushFollow(FOLLOW_rule__Quiz__Group__11__Impl_in_rule__Quiz__Group__111586);
            rule__Quiz__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group__12_in_rule__Quiz__Group__111589);
            rule__Quiz__Group__12();

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
    // $ANTLR end "rule__Quiz__Group__11"


    // $ANTLR start "rule__Quiz__Group__11__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:819:1: rule__Quiz__Group__11__Impl : ( ';' ) ;
    public final void rule__Quiz__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:823:1: ( ( ';' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:824:1: ( ';' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:824:1: ( ';' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:825:1: ';'
            {
             before(grammarAccess.getQuizAccess().getSemicolonKeyword_11()); 
            match(input,22,FOLLOW_22_in_rule__Quiz__Group__11__Impl1617); 
             after(grammarAccess.getQuizAccess().getSemicolonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__11__Impl"


    // $ANTLR start "rule__Quiz__Group__12"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:838:1: rule__Quiz__Group__12 : rule__Quiz__Group__12__Impl rule__Quiz__Group__13 ;
    public final void rule__Quiz__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:842:1: ( rule__Quiz__Group__12__Impl rule__Quiz__Group__13 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:843:2: rule__Quiz__Group__12__Impl rule__Quiz__Group__13
            {
            pushFollow(FOLLOW_rule__Quiz__Group__12__Impl_in_rule__Quiz__Group__121648);
            rule__Quiz__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group__13_in_rule__Quiz__Group__121651);
            rule__Quiz__Group__13();

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
    // $ANTLR end "rule__Quiz__Group__12"


    // $ANTLR start "rule__Quiz__Group__12__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:850:1: rule__Quiz__Group__12__Impl : ( 'choices' ) ;
    public final void rule__Quiz__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:854:1: ( ( 'choices' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:855:1: ( 'choices' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:855:1: ( 'choices' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:856:1: 'choices'
            {
             before(grammarAccess.getQuizAccess().getChoicesKeyword_12()); 
            match(input,24,FOLLOW_24_in_rule__Quiz__Group__12__Impl1679); 
             after(grammarAccess.getQuizAccess().getChoicesKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__12__Impl"


    // $ANTLR start "rule__Quiz__Group__13"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:869:1: rule__Quiz__Group__13 : rule__Quiz__Group__13__Impl rule__Quiz__Group__14 ;
    public final void rule__Quiz__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:873:1: ( rule__Quiz__Group__13__Impl rule__Quiz__Group__14 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:874:2: rule__Quiz__Group__13__Impl rule__Quiz__Group__14
            {
            pushFollow(FOLLOW_rule__Quiz__Group__13__Impl_in_rule__Quiz__Group__131710);
            rule__Quiz__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group__14_in_rule__Quiz__Group__131713);
            rule__Quiz__Group__14();

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
    // $ANTLR end "rule__Quiz__Group__13"


    // $ANTLR start "rule__Quiz__Group__13__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:881:1: rule__Quiz__Group__13__Impl : ( '{' ) ;
    public final void rule__Quiz__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:885:1: ( ( '{' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:886:1: ( '{' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:886:1: ( '{' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:887:1: '{'
            {
             before(grammarAccess.getQuizAccess().getLeftCurlyBracketKeyword_13()); 
            match(input,17,FOLLOW_17_in_rule__Quiz__Group__13__Impl1741); 
             after(grammarAccess.getQuizAccess().getLeftCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__13__Impl"


    // $ANTLR start "rule__Quiz__Group__14"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:900:1: rule__Quiz__Group__14 : rule__Quiz__Group__14__Impl rule__Quiz__Group__15 ;
    public final void rule__Quiz__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:904:1: ( rule__Quiz__Group__14__Impl rule__Quiz__Group__15 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:905:2: rule__Quiz__Group__14__Impl rule__Quiz__Group__15
            {
            pushFollow(FOLLOW_rule__Quiz__Group__14__Impl_in_rule__Quiz__Group__141772);
            rule__Quiz__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group__15_in_rule__Quiz__Group__141775);
            rule__Quiz__Group__15();

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
    // $ANTLR end "rule__Quiz__Group__14"


    // $ANTLR start "rule__Quiz__Group__14__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:912:1: rule__Quiz__Group__14__Impl : ( ( ( rule__Quiz__ElementsAssignment_14 ) ) ( ( rule__Quiz__ElementsAssignment_14 )* ) ) ;
    public final void rule__Quiz__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:916:1: ( ( ( ( rule__Quiz__ElementsAssignment_14 ) ) ( ( rule__Quiz__ElementsAssignment_14 )* ) ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:917:1: ( ( ( rule__Quiz__ElementsAssignment_14 ) ) ( ( rule__Quiz__ElementsAssignment_14 )* ) )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:917:1: ( ( ( rule__Quiz__ElementsAssignment_14 ) ) ( ( rule__Quiz__ElementsAssignment_14 )* ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:918:1: ( ( rule__Quiz__ElementsAssignment_14 ) ) ( ( rule__Quiz__ElementsAssignment_14 )* )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:918:1: ( ( rule__Quiz__ElementsAssignment_14 ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:919:1: ( rule__Quiz__ElementsAssignment_14 )
            {
             before(grammarAccess.getQuizAccess().getElementsAssignment_14()); 
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:920:1: ( rule__Quiz__ElementsAssignment_14 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:920:2: rule__Quiz__ElementsAssignment_14
            {
            pushFollow(FOLLOW_rule__Quiz__ElementsAssignment_14_in_rule__Quiz__Group__14__Impl1804);
            rule__Quiz__ElementsAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getQuizAccess().getElementsAssignment_14()); 

            }

            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:923:1: ( ( rule__Quiz__ElementsAssignment_14 )* )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:924:1: ( rule__Quiz__ElementsAssignment_14 )*
            {
             before(grammarAccess.getQuizAccess().getElementsAssignment_14()); 
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:925:1: ( rule__Quiz__ElementsAssignment_14 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:925:2: rule__Quiz__ElementsAssignment_14
            	    {
            	    pushFollow(FOLLOW_rule__Quiz__ElementsAssignment_14_in_rule__Quiz__Group__14__Impl1816);
            	    rule__Quiz__ElementsAssignment_14();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getQuizAccess().getElementsAssignment_14()); 

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
    // $ANTLR end "rule__Quiz__Group__14__Impl"


    // $ANTLR start "rule__Quiz__Group__15"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:936:1: rule__Quiz__Group__15 : rule__Quiz__Group__15__Impl rule__Quiz__Group__16 ;
    public final void rule__Quiz__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:940:1: ( rule__Quiz__Group__15__Impl rule__Quiz__Group__16 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:941:2: rule__Quiz__Group__15__Impl rule__Quiz__Group__16
            {
            pushFollow(FOLLOW_rule__Quiz__Group__15__Impl_in_rule__Quiz__Group__151849);
            rule__Quiz__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group__16_in_rule__Quiz__Group__151852);
            rule__Quiz__Group__16();

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
    // $ANTLR end "rule__Quiz__Group__15"


    // $ANTLR start "rule__Quiz__Group__15__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:948:1: rule__Quiz__Group__15__Impl : ( '}' ) ;
    public final void rule__Quiz__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:952:1: ( ( '}' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:953:1: ( '}' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:953:1: ( '}' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:954:1: '}'
            {
             before(grammarAccess.getQuizAccess().getRightCurlyBracketKeyword_15()); 
            match(input,18,FOLLOW_18_in_rule__Quiz__Group__15__Impl1880); 
             after(grammarAccess.getQuizAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__15__Impl"


    // $ANTLR start "rule__Quiz__Group__16"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:967:1: rule__Quiz__Group__16 : rule__Quiz__Group__16__Impl rule__Quiz__Group__17 ;
    public final void rule__Quiz__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:971:1: ( rule__Quiz__Group__16__Impl rule__Quiz__Group__17 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:972:2: rule__Quiz__Group__16__Impl rule__Quiz__Group__17
            {
            pushFollow(FOLLOW_rule__Quiz__Group__16__Impl_in_rule__Quiz__Group__161911);
            rule__Quiz__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group__17_in_rule__Quiz__Group__161914);
            rule__Quiz__Group__17();

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
    // $ANTLR end "rule__Quiz__Group__16"


    // $ANTLR start "rule__Quiz__Group__16__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:979:1: rule__Quiz__Group__16__Impl : ( ( rule__Quiz__Group_16__0 )? ) ;
    public final void rule__Quiz__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:983:1: ( ( ( rule__Quiz__Group_16__0 )? ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:984:1: ( ( rule__Quiz__Group_16__0 )? )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:984:1: ( ( rule__Quiz__Group_16__0 )? )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:985:1: ( rule__Quiz__Group_16__0 )?
            {
             before(grammarAccess.getQuizAccess().getGroup_16()); 
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:986:1: ( rule__Quiz__Group_16__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:986:2: rule__Quiz__Group_16__0
                    {
                    pushFollow(FOLLOW_rule__Quiz__Group_16__0_in_rule__Quiz__Group__16__Impl1941);
                    rule__Quiz__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuizAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__16__Impl"


    // $ANTLR start "rule__Quiz__Group__17"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:996:1: rule__Quiz__Group__17 : rule__Quiz__Group__17__Impl ;
    public final void rule__Quiz__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1000:1: ( rule__Quiz__Group__17__Impl )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1001:2: rule__Quiz__Group__17__Impl
            {
            pushFollow(FOLLOW_rule__Quiz__Group__17__Impl_in_rule__Quiz__Group__171972);
            rule__Quiz__Group__17__Impl();

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
    // $ANTLR end "rule__Quiz__Group__17"


    // $ANTLR start "rule__Quiz__Group__17__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1007:1: rule__Quiz__Group__17__Impl : ( '}' ) ;
    public final void rule__Quiz__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1011:1: ( ( '}' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1012:1: ( '}' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1012:1: ( '}' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1013:1: '}'
            {
             before(grammarAccess.getQuizAccess().getRightCurlyBracketKeyword_17()); 
            match(input,18,FOLLOW_18_in_rule__Quiz__Group__17__Impl2000); 
             after(grammarAccess.getQuizAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__17__Impl"


    // $ANTLR start "rule__Quiz__Group_16__0"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1062:1: rule__Quiz__Group_16__0 : rule__Quiz__Group_16__0__Impl rule__Quiz__Group_16__1 ;
    public final void rule__Quiz__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1066:1: ( rule__Quiz__Group_16__0__Impl rule__Quiz__Group_16__1 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1067:2: rule__Quiz__Group_16__0__Impl rule__Quiz__Group_16__1
            {
            pushFollow(FOLLOW_rule__Quiz__Group_16__0__Impl_in_rule__Quiz__Group_16__02067);
            rule__Quiz__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group_16__1_in_rule__Quiz__Group_16__02070);
            rule__Quiz__Group_16__1();

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
    // $ANTLR end "rule__Quiz__Group_16__0"


    // $ANTLR start "rule__Quiz__Group_16__0__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1074:1: rule__Quiz__Group_16__0__Impl : ( 'hint' ) ;
    public final void rule__Quiz__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1078:1: ( ( 'hint' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1079:1: ( 'hint' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1079:1: ( 'hint' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1080:1: 'hint'
            {
             before(grammarAccess.getQuizAccess().getHintKeyword_16_0()); 
            match(input,25,FOLLOW_25_in_rule__Quiz__Group_16__0__Impl2098); 
             after(grammarAccess.getQuizAccess().getHintKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group_16__0__Impl"


    // $ANTLR start "rule__Quiz__Group_16__1"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1093:1: rule__Quiz__Group_16__1 : rule__Quiz__Group_16__1__Impl rule__Quiz__Group_16__2 ;
    public final void rule__Quiz__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1097:1: ( rule__Quiz__Group_16__1__Impl rule__Quiz__Group_16__2 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1098:2: rule__Quiz__Group_16__1__Impl rule__Quiz__Group_16__2
            {
            pushFollow(FOLLOW_rule__Quiz__Group_16__1__Impl_in_rule__Quiz__Group_16__12129);
            rule__Quiz__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group_16__2_in_rule__Quiz__Group_16__12132);
            rule__Quiz__Group_16__2();

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
    // $ANTLR end "rule__Quiz__Group_16__1"


    // $ANTLR start "rule__Quiz__Group_16__1__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1105:1: rule__Quiz__Group_16__1__Impl : ( ':' ) ;
    public final void rule__Quiz__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1109:1: ( ( ':' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1110:1: ( ':' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1110:1: ( ':' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1111:1: ':'
            {
             before(grammarAccess.getQuizAccess().getColonKeyword_16_1()); 
            match(input,21,FOLLOW_21_in_rule__Quiz__Group_16__1__Impl2160); 
             after(grammarAccess.getQuizAccess().getColonKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group_16__1__Impl"


    // $ANTLR start "rule__Quiz__Group_16__2"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1124:1: rule__Quiz__Group_16__2 : rule__Quiz__Group_16__2__Impl rule__Quiz__Group_16__3 ;
    public final void rule__Quiz__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1128:1: ( rule__Quiz__Group_16__2__Impl rule__Quiz__Group_16__3 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1129:2: rule__Quiz__Group_16__2__Impl rule__Quiz__Group_16__3
            {
            pushFollow(FOLLOW_rule__Quiz__Group_16__2__Impl_in_rule__Quiz__Group_16__22191);
            rule__Quiz__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quiz__Group_16__3_in_rule__Quiz__Group_16__22194);
            rule__Quiz__Group_16__3();

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
    // $ANTLR end "rule__Quiz__Group_16__2"


    // $ANTLR start "rule__Quiz__Group_16__2__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1136:1: rule__Quiz__Group_16__2__Impl : ( ( rule__Quiz__HintAssignment_16_2 ) ) ;
    public final void rule__Quiz__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1140:1: ( ( ( rule__Quiz__HintAssignment_16_2 ) ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1141:1: ( ( rule__Quiz__HintAssignment_16_2 ) )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1141:1: ( ( rule__Quiz__HintAssignment_16_2 ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1142:1: ( rule__Quiz__HintAssignment_16_2 )
            {
             before(grammarAccess.getQuizAccess().getHintAssignment_16_2()); 
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1143:1: ( rule__Quiz__HintAssignment_16_2 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1143:2: rule__Quiz__HintAssignment_16_2
            {
            pushFollow(FOLLOW_rule__Quiz__HintAssignment_16_2_in_rule__Quiz__Group_16__2__Impl2221);
            rule__Quiz__HintAssignment_16_2();

            state._fsp--;


            }

             after(grammarAccess.getQuizAccess().getHintAssignment_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group_16__2__Impl"


    // $ANTLR start "rule__Quiz__Group_16__3"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1153:1: rule__Quiz__Group_16__3 : rule__Quiz__Group_16__3__Impl ;
    public final void rule__Quiz__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1157:1: ( rule__Quiz__Group_16__3__Impl )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1158:2: rule__Quiz__Group_16__3__Impl
            {
            pushFollow(FOLLOW_rule__Quiz__Group_16__3__Impl_in_rule__Quiz__Group_16__32251);
            rule__Quiz__Group_16__3__Impl();

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
    // $ANTLR end "rule__Quiz__Group_16__3"


    // $ANTLR start "rule__Quiz__Group_16__3__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1164:1: rule__Quiz__Group_16__3__Impl : ( ';' ) ;
    public final void rule__Quiz__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1168:1: ( ( ';' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1169:1: ( ';' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1169:1: ( ';' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1170:1: ';'
            {
             before(grammarAccess.getQuizAccess().getSemicolonKeyword_16_3()); 
            match(input,22,FOLLOW_22_in_rule__Quiz__Group_16__3__Impl2279); 
             after(grammarAccess.getQuizAccess().getSemicolonKeyword_16_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group_16__3__Impl"


    // $ANTLR start "rule__Choice__Group__0"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1191:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1195:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1196:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__02318);
            rule__Choice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__02321);
            rule__Choice__Group__1();

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
    // $ANTLR end "rule__Choice__Group__0"


    // $ANTLR start "rule__Choice__Group__0__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1203:1: rule__Choice__Group__0__Impl : ( ( rule__Choice__TextAssignment_0 ) ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1207:1: ( ( ( rule__Choice__TextAssignment_0 ) ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1208:1: ( ( rule__Choice__TextAssignment_0 ) )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1208:1: ( ( rule__Choice__TextAssignment_0 ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1209:1: ( rule__Choice__TextAssignment_0 )
            {
             before(grammarAccess.getChoiceAccess().getTextAssignment_0()); 
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1210:1: ( rule__Choice__TextAssignment_0 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1210:2: rule__Choice__TextAssignment_0
            {
            pushFollow(FOLLOW_rule__Choice__TextAssignment_0_in_rule__Choice__Group__0__Impl2348);
            rule__Choice__TextAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getTextAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__0__Impl"


    // $ANTLR start "rule__Choice__Group__1"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1220:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1224:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1225:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
            {
            pushFollow(FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__12378);
            rule__Choice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__12381);
            rule__Choice__Group__2();

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
    // $ANTLR end "rule__Choice__Group__1"


    // $ANTLR start "rule__Choice__Group__1__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1232:1: rule__Choice__Group__1__Impl : ( '->' ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1236:1: ( ( '->' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1237:1: ( '->' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1237:1: ( '->' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1238:1: '->'
            {
             before(grammarAccess.getChoiceAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__Choice__Group__1__Impl2409); 
             after(grammarAccess.getChoiceAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__1__Impl"


    // $ANTLR start "rule__Choice__Group__2"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1251:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl rule__Choice__Group__3 ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1255:1: ( rule__Choice__Group__2__Impl rule__Choice__Group__3 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1256:2: rule__Choice__Group__2__Impl rule__Choice__Group__3
            {
            pushFollow(FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__22440);
            rule__Choice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__3_in_rule__Choice__Group__22443);
            rule__Choice__Group__3();

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
    // $ANTLR end "rule__Choice__Group__2"


    // $ANTLR start "rule__Choice__Group__2__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1263:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__CorrectAssignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1267:1: ( ( ( rule__Choice__CorrectAssignment_2 ) ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1268:1: ( ( rule__Choice__CorrectAssignment_2 ) )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1268:1: ( ( rule__Choice__CorrectAssignment_2 ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1269:1: ( rule__Choice__CorrectAssignment_2 )
            {
             before(grammarAccess.getChoiceAccess().getCorrectAssignment_2()); 
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1270:1: ( rule__Choice__CorrectAssignment_2 )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1270:2: rule__Choice__CorrectAssignment_2
            {
            pushFollow(FOLLOW_rule__Choice__CorrectAssignment_2_in_rule__Choice__Group__2__Impl2470);
            rule__Choice__CorrectAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getCorrectAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__2__Impl"


    // $ANTLR start "rule__Choice__Group__3"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1280:1: rule__Choice__Group__3 : rule__Choice__Group__3__Impl ;
    public final void rule__Choice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1284:1: ( rule__Choice__Group__3__Impl )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1285:2: rule__Choice__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Choice__Group__3__Impl_in_rule__Choice__Group__32500);
            rule__Choice__Group__3__Impl();

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
    // $ANTLR end "rule__Choice__Group__3"


    // $ANTLR start "rule__Choice__Group__3__Impl"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1291:1: rule__Choice__Group__3__Impl : ( ';' ) ;
    public final void rule__Choice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1295:1: ( ( ';' ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1296:1: ( ';' )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1296:1: ( ';' )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1297:1: ';'
            {
             before(grammarAccess.getChoiceAccess().getSemicolonKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Choice__Group__3__Impl2528); 
             after(grammarAccess.getChoiceAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__3__Impl"


    // $ANTLR start "rule__QuizGame__NameAssignment_1"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1319:1: rule__QuizGame__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__QuizGame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1323:1: ( ( RULE_ID ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1324:1: ( RULE_ID )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1324:1: ( RULE_ID )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1325:1: RULE_ID
            {
             before(grammarAccess.getQuizGameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QuizGame__NameAssignment_12572); 
             after(grammarAccess.getQuizGameAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuizGame__NameAssignment_1"


    // $ANTLR start "rule__QuizGame__AuthorAssignment_3"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1334:1: rule__QuizGame__AuthorAssignment_3 : ( RULE_ID ) ;
    public final void rule__QuizGame__AuthorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1338:1: ( ( RULE_ID ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1339:1: ( RULE_ID )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1339:1: ( RULE_ID )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1340:1: RULE_ID
            {
             before(grammarAccess.getQuizGameAccess().getAuthorIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QuizGame__AuthorAssignment_32603); 
             after(grammarAccess.getQuizGameAccess().getAuthorIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuizGame__AuthorAssignment_3"


    // $ANTLR start "rule__QuizGame__ElementsAssignment_5"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1349:1: rule__QuizGame__ElementsAssignment_5 : ( ruleQuiz ) ;
    public final void rule__QuizGame__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1353:1: ( ( ruleQuiz ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1354:1: ( ruleQuiz )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1354:1: ( ruleQuiz )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1355:1: ruleQuiz
            {
             before(grammarAccess.getQuizGameAccess().getElementsQuizParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleQuiz_in_rule__QuizGame__ElementsAssignment_52634);
            ruleQuiz();

            state._fsp--;

             after(grammarAccess.getQuizGameAccess().getElementsQuizParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuizGame__ElementsAssignment_5"


    // $ANTLR start "rule__Quiz__TypeAssignment_0"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1364:1: rule__Quiz__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Quiz__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1368:1: ( ( ruleType ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1369:1: ( ruleType )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1369:1: ( ruleType )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1370:1: ruleType
            {
             before(grammarAccess.getQuizAccess().getTypeTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Quiz__TypeAssignment_02665);
            ruleType();

            state._fsp--;

             after(grammarAccess.getQuizAccess().getTypeTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__TypeAssignment_0"


    // $ANTLR start "rule__Quiz__NameAssignment_2"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1379:1: rule__Quiz__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Quiz__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1383:1: ( ( RULE_ID ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1384:1: ( RULE_ID )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1384:1: ( RULE_ID )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1385:1: RULE_ID
            {
             before(grammarAccess.getQuizAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Quiz__NameAssignment_22696); 
             after(grammarAccess.getQuizAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__NameAssignment_2"


    // $ANTLR start "rule__Quiz__TextAssignment_6"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1394:1: rule__Quiz__TextAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Quiz__TextAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1398:1: ( ( RULE_STRING ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1399:1: ( RULE_STRING )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1399:1: ( RULE_STRING )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1400:1: RULE_STRING
            {
             before(grammarAccess.getQuizAccess().getTextSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Quiz__TextAssignment_62727); 
             after(grammarAccess.getQuizAccess().getTextSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__TextAssignment_6"


    // $ANTLR start "rule__Quiz__ScoreAssignment_10"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1409:1: rule__Quiz__ScoreAssignment_10 : ( RULE_INT ) ;
    public final void rule__Quiz__ScoreAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1413:1: ( ( RULE_INT ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1414:1: ( RULE_INT )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1414:1: ( RULE_INT )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1415:1: RULE_INT
            {
             before(grammarAccess.getQuizAccess().getScoreINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Quiz__ScoreAssignment_102758); 
             after(grammarAccess.getQuizAccess().getScoreINTTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__ScoreAssignment_10"


    // $ANTLR start "rule__Quiz__ElementsAssignment_14"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1424:1: rule__Quiz__ElementsAssignment_14 : ( ruleChoice ) ;
    public final void rule__Quiz__ElementsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1428:1: ( ( ruleChoice ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1429:1: ( ruleChoice )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1429:1: ( ruleChoice )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1430:1: ruleChoice
            {
             before(grammarAccess.getQuizAccess().getElementsChoiceParserRuleCall_14_0()); 
            pushFollow(FOLLOW_ruleChoice_in_rule__Quiz__ElementsAssignment_142789);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getQuizAccess().getElementsChoiceParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__ElementsAssignment_14"


    // $ANTLR start "rule__Quiz__HintAssignment_16_2"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1439:1: rule__Quiz__HintAssignment_16_2 : ( RULE_STRING ) ;
    public final void rule__Quiz__HintAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1443:1: ( ( RULE_STRING ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1444:1: ( RULE_STRING )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1444:1: ( RULE_STRING )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1445:1: RULE_STRING
            {
             before(grammarAccess.getQuizAccess().getHintSTRINGTerminalRuleCall_16_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Quiz__HintAssignment_16_22820); 
             after(grammarAccess.getQuizAccess().getHintSTRINGTerminalRuleCall_16_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__HintAssignment_16_2"


    // $ANTLR start "rule__Choice__TextAssignment_0"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1454:1: rule__Choice__TextAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Choice__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1458:1: ( ( RULE_STRING ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1459:1: ( RULE_STRING )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1459:1: ( RULE_STRING )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1460:1: RULE_STRING
            {
             before(grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Choice__TextAssignment_02851); 
             after(grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__TextAssignment_0"


    // $ANTLR start "rule__Choice__CorrectAssignment_2"
    // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1469:1: rule__Choice__CorrectAssignment_2 : ( ruleBool ) ;
    public final void rule__Choice__CorrectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1473:1: ( ( ruleBool ) )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1474:1: ( ruleBool )
            {
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1474:1: ( ruleBool )
            // ../v1.quiz.ui/src-gen/v1/quiz/ui/contentassist/antlr/internal/InternalQuiz.g:1475:1: ruleBool
            {
             before(grammarAccess.getChoiceAccess().getCorrectBoolParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBool_in_rule__Choice__CorrectAssignment_22882);
            ruleBool();

            state._fsp--;

             after(grammarAccess.getChoiceAccess().getCorrectBoolParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__CorrectAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleQuizGame_in_entryRuleQuizGame61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuizGame68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuizGame__Group__0_in_ruleQuizGame94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuiz_in_entryRuleQuiz121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuiz128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group__0_in_ruleQuiz154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__0_in_ruleChoice214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_entryRuleBool241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBool248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bool__Alternatives_in_ruleBool274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Bool__Alternatives347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Bool__Alternatives367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type__Alternatives402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__Alternatives423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuizGame__Group__0__Impl_in_rule__QuizGame__Group__0456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QuizGame__Group__1_in_rule__QuizGame__Group__0459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__QuizGame__Group__0__Impl487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuizGame__Group__1__Impl_in_rule__QuizGame__Group__1518 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__QuizGame__Group__2_in_rule__QuizGame__Group__1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuizGame__NameAssignment_1_in_rule__QuizGame__Group__1__Impl548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuizGame__Group__2__Impl_in_rule__QuizGame__Group__2578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QuizGame__Group__3_in_rule__QuizGame__Group__2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__QuizGame__Group__2__Impl609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuizGame__Group__3__Impl_in_rule__QuizGame__Group__3640 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__QuizGame__Group__4_in_rule__QuizGame__Group__3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuizGame__AuthorAssignment_3_in_rule__QuizGame__Group__3__Impl670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuizGame__Group__4__Impl_in_rule__QuizGame__Group__4700 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__QuizGame__Group__5_in_rule__QuizGame__Group__4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__QuizGame__Group__4__Impl731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuizGame__Group__5__Impl_in_rule__QuizGame__Group__5762 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__QuizGame__Group__6_in_rule__QuizGame__Group__5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuizGame__ElementsAssignment_5_in_rule__QuizGame__Group__5__Impl794 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__QuizGame__ElementsAssignment_5_in_rule__QuizGame__Group__5__Impl806 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__QuizGame__Group__6__Impl_in_rule__QuizGame__Group__6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__QuizGame__Group__6__Impl867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group__0__Impl_in_rule__Quiz__Group__0912 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Quiz__Group__1_in_rule__Quiz__Group__0915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__TypeAssignment_0_in_rule__Quiz__Group__0__Impl942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group__1__Impl_in_rule__Quiz__Group__1972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Quiz__Group__2_in_rule__Quiz__Group__1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Quiz__Group__1__Impl1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group__2__Impl_in_rule__Quiz__Group__21034 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Quiz__Group__3_in_rule__Quiz__Group__21037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__NameAssignment_2_in_rule__Quiz__Group__2__Impl1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group__3__Impl_in_rule__Quiz__Group__31094 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Quiz__Group__4_in_rule__Quiz__Group__31097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Quiz__Group__3__Impl1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group__4__Impl_in_rule__Quiz__Group__41156 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Quiz__Group__5_in_rule__Quiz__Group__41159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Quiz__Group__4__Impl1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group__5__Impl_in_rule__Quiz__Group__51218 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Quiz__Group__6_in_rule__Quiz__Group__51221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Quiz__Group__5__Impl1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group__6__Impl_in_rule__Quiz__Group__61280 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Quiz__Group__7_in_rule__Quiz__Group__61283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__TextAssignment_6_in_rule__Quiz__Group__6__Impl1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group__7__Impl_in_rule__Quiz__Group__71340 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Quiz__Group__8_in_rule__Quiz__Group__71343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Quiz__Group__7__Impl1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group__8__Impl_in_rule__Quiz__Group__81402 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Quiz__Group__9_in_rule__Quiz__Group__81405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Quiz__Group__8__Impl1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group__9__Impl_in_rule__Quiz__Group__91464 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Quiz__Group__10_in_rule__Quiz__Group__91467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Quiz__Group__9__Impl1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group__10__Impl_in_rule__Quiz__Group__101526 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Quiz__Group__11_in_rule__Quiz__Group__101529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__ScoreAssignment_10_in_rule__Quiz__Group__10__Impl1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group__11__Impl_in_rule__Quiz__Group__111586 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Quiz__Group__12_in_rule__Quiz__Group__111589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Quiz__Group__11__Impl1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group__12__Impl_in_rule__Quiz__Group__121648 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Quiz__Group__13_in_rule__Quiz__Group__121651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Quiz__Group__12__Impl1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group__13__Impl_in_rule__Quiz__Group__131710 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Quiz__Group__14_in_rule__Quiz__Group__131713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Quiz__Group__13__Impl1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group__14__Impl_in_rule__Quiz__Group__141772 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Quiz__Group__15_in_rule__Quiz__Group__141775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__ElementsAssignment_14_in_rule__Quiz__Group__14__Impl1804 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Quiz__ElementsAssignment_14_in_rule__Quiz__Group__14__Impl1816 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Quiz__Group__15__Impl_in_rule__Quiz__Group__151849 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_rule__Quiz__Group__16_in_rule__Quiz__Group__151852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Quiz__Group__15__Impl1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group__16__Impl_in_rule__Quiz__Group__161911 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_rule__Quiz__Group__17_in_rule__Quiz__Group__161914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group_16__0_in_rule__Quiz__Group__16__Impl1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group__17__Impl_in_rule__Quiz__Group__171972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Quiz__Group__17__Impl2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group_16__0__Impl_in_rule__Quiz__Group_16__02067 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Quiz__Group_16__1_in_rule__Quiz__Group_16__02070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Quiz__Group_16__0__Impl2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group_16__1__Impl_in_rule__Quiz__Group_16__12129 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Quiz__Group_16__2_in_rule__Quiz__Group_16__12132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Quiz__Group_16__1__Impl2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group_16__2__Impl_in_rule__Quiz__Group_16__22191 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Quiz__Group_16__3_in_rule__Quiz__Group_16__22194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__HintAssignment_16_2_in_rule__Quiz__Group_16__2__Impl2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quiz__Group_16__3__Impl_in_rule__Quiz__Group_16__32251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Quiz__Group_16__3__Impl2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__02318 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__02321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__TextAssignment_0_in_rule__Choice__Group__0__Impl2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__12378 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__12381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Choice__Group__1__Impl2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__22440 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Choice__Group__3_in_rule__Choice__Group__22443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__CorrectAssignment_2_in_rule__Choice__Group__2__Impl2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__3__Impl_in_rule__Choice__Group__32500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Choice__Group__3__Impl2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QuizGame__NameAssignment_12572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QuizGame__AuthorAssignment_32603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuiz_in_rule__QuizGame__ElementsAssignment_52634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Quiz__TypeAssignment_02665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Quiz__NameAssignment_22696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Quiz__TextAssignment_62727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Quiz__ScoreAssignment_102758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_rule__Quiz__ElementsAssignment_142789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Quiz__HintAssignment_16_22820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Choice__TextAssignment_02851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_rule__Choice__CorrectAssignment_22882 = new BitSet(new long[]{0x0000000000000002L});

}