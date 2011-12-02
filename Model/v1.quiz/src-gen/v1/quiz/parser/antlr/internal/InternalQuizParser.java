package v1.quiz.parser.antlr.internal; 

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
import v1.quiz.services.QuizGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuizParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'quizGame'", "'by'", "'{'", "'}'", "'question'", "'text'", "':'", "';'", "'score'", "'choices'", "'hint'", "'->'", "'true'", "'false'", "'multiChoice'", "'singleChoice'"
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
    public String getGrammarFileName() { return "../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g"; }



     	private QuizGrammarAccess grammarAccess;
     	
        public InternalQuizParser(TokenStream input, QuizGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "QuizGame";	
       	}
       	
       	@Override
       	protected QuizGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleQuizGame"
    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:68:1: entryRuleQuizGame returns [EObject current=null] : iv_ruleQuizGame= ruleQuizGame EOF ;
    public final EObject entryRuleQuizGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuizGame = null;


        try {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:69:2: (iv_ruleQuizGame= ruleQuizGame EOF )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:70:2: iv_ruleQuizGame= ruleQuizGame EOF
            {
             newCompositeNode(grammarAccess.getQuizGameRule()); 
            pushFollow(FOLLOW_ruleQuizGame_in_entryRuleQuizGame75);
            iv_ruleQuizGame=ruleQuizGame();

            state._fsp--;

             current =iv_ruleQuizGame; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuizGame85); 

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
    // $ANTLR end "entryRuleQuizGame"


    // $ANTLR start "ruleQuizGame"
    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:77:1: ruleQuizGame returns [EObject current=null] : (otherlv_0= 'quizGame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'by' ( (lv_author_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleQuiz ) )+ otherlv_6= '}' ) ;
    public final EObject ruleQuizGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_author_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_5_0 = null;


         enterRule(); 
            
        try {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:80:28: ( (otherlv_0= 'quizGame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'by' ( (lv_author_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleQuiz ) )+ otherlv_6= '}' ) )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:81:1: (otherlv_0= 'quizGame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'by' ( (lv_author_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleQuiz ) )+ otherlv_6= '}' )
            {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:81:1: (otherlv_0= 'quizGame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'by' ( (lv_author_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleQuiz ) )+ otherlv_6= '}' )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:81:3: otherlv_0= 'quizGame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'by' ( (lv_author_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleQuiz ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleQuizGame122); 

                	newLeafNode(otherlv_0, grammarAccess.getQuizGameAccess().getQuizGameKeyword_0());
                
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:85:1: ( (lv_name_1_0= RULE_ID ) )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:86:1: (lv_name_1_0= RULE_ID )
            {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:86:1: (lv_name_1_0= RULE_ID )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:87:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuizGame139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQuizGameAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuizGameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleQuizGame156); 

                	newLeafNode(otherlv_2, grammarAccess.getQuizGameAccess().getByKeyword_2());
                
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:107:1: ( (lv_author_3_0= RULE_ID ) )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:108:1: (lv_author_3_0= RULE_ID )
            {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:108:1: (lv_author_3_0= RULE_ID )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:109:3: lv_author_3_0= RULE_ID
            {
            lv_author_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuizGame173); 

            			newLeafNode(lv_author_3_0, grammarAccess.getQuizGameAccess().getAuthorIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuizGameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"author",
                    		lv_author_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleQuizGame190); 

                	newLeafNode(otherlv_4, grammarAccess.getQuizGameAccess().getLeftCurlyBracketKeyword_4());
                
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:129:1: ( (lv_elements_5_0= ruleQuiz ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=25 && LA1_0<=26)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:130:1: (lv_elements_5_0= ruleQuiz )
            	    {
            	    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:130:1: (lv_elements_5_0= ruleQuiz )
            	    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:131:3: lv_elements_5_0= ruleQuiz
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuizGameAccess().getElementsQuizParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuiz_in_ruleQuizGame211);
            	    lv_elements_5_0=ruleQuiz();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuizGameRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_5_0, 
            	            		"Quiz");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleQuizGame224); 

                	newLeafNode(otherlv_6, grammarAccess.getQuizGameAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleQuizGame"


    // $ANTLR start "entryRuleQuiz"
    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:159:1: entryRuleQuiz returns [EObject current=null] : iv_ruleQuiz= ruleQuiz EOF ;
    public final EObject entryRuleQuiz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuiz = null;


        try {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:160:2: (iv_ruleQuiz= ruleQuiz EOF )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:161:2: iv_ruleQuiz= ruleQuiz EOF
            {
             newCompositeNode(grammarAccess.getQuizRule()); 
            pushFollow(FOLLOW_ruleQuiz_in_entryRuleQuiz260);
            iv_ruleQuiz=ruleQuiz();

            state._fsp--;

             current =iv_ruleQuiz; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuiz270); 

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
    // $ANTLR end "entryRuleQuiz"


    // $ANTLR start "ruleQuiz"
    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:168:1: ruleQuiz returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) otherlv_1= 'question' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'text' otherlv_5= ':' ( (lv_text_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'score' otherlv_9= ':' ( (lv_score_10_0= RULE_INT ) ) otherlv_11= ';' otherlv_12= 'choices' otherlv_13= '{' ( (lv_elements_14_0= ruleChoice ) )+ otherlv_15= '}' (otherlv_16= 'hint' otherlv_17= ':' ( (lv_hint_18_0= RULE_STRING ) ) otherlv_19= ';' )? otherlv_20= '}' ) ;
    public final EObject ruleQuiz() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_text_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_score_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_hint_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_elements_14_0 = null;


         enterRule(); 
            
        try {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:171:28: ( ( ( (lv_type_0_0= ruleType ) ) otherlv_1= 'question' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'text' otherlv_5= ':' ( (lv_text_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'score' otherlv_9= ':' ( (lv_score_10_0= RULE_INT ) ) otherlv_11= ';' otherlv_12= 'choices' otherlv_13= '{' ( (lv_elements_14_0= ruleChoice ) )+ otherlv_15= '}' (otherlv_16= 'hint' otherlv_17= ':' ( (lv_hint_18_0= RULE_STRING ) ) otherlv_19= ';' )? otherlv_20= '}' ) )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:172:1: ( ( (lv_type_0_0= ruleType ) ) otherlv_1= 'question' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'text' otherlv_5= ':' ( (lv_text_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'score' otherlv_9= ':' ( (lv_score_10_0= RULE_INT ) ) otherlv_11= ';' otherlv_12= 'choices' otherlv_13= '{' ( (lv_elements_14_0= ruleChoice ) )+ otherlv_15= '}' (otherlv_16= 'hint' otherlv_17= ':' ( (lv_hint_18_0= RULE_STRING ) ) otherlv_19= ';' )? otherlv_20= '}' )
            {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:172:1: ( ( (lv_type_0_0= ruleType ) ) otherlv_1= 'question' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'text' otherlv_5= ':' ( (lv_text_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'score' otherlv_9= ':' ( (lv_score_10_0= RULE_INT ) ) otherlv_11= ';' otherlv_12= 'choices' otherlv_13= '{' ( (lv_elements_14_0= ruleChoice ) )+ otherlv_15= '}' (otherlv_16= 'hint' otherlv_17= ':' ( (lv_hint_18_0= RULE_STRING ) ) otherlv_19= ';' )? otherlv_20= '}' )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:172:2: ( (lv_type_0_0= ruleType ) ) otherlv_1= 'question' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'text' otherlv_5= ':' ( (lv_text_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'score' otherlv_9= ':' ( (lv_score_10_0= RULE_INT ) ) otherlv_11= ';' otherlv_12= 'choices' otherlv_13= '{' ( (lv_elements_14_0= ruleChoice ) )+ otherlv_15= '}' (otherlv_16= 'hint' otherlv_17= ':' ( (lv_hint_18_0= RULE_STRING ) ) otherlv_19= ';' )? otherlv_20= '}'
            {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:172:2: ( (lv_type_0_0= ruleType ) )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:173:1: (lv_type_0_0= ruleType )
            {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:173:1: (lv_type_0_0= ruleType )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:174:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getQuizAccess().getTypeTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleQuiz316);
            lv_type_0_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuizRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleQuiz328); 

                	newLeafNode(otherlv_1, grammarAccess.getQuizAccess().getQuestionKeyword_1());
                
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:194:1: ( (lv_name_2_0= RULE_ID ) )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:195:1: (lv_name_2_0= RULE_ID )
            {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:195:1: (lv_name_2_0= RULE_ID )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:196:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuiz345); 

            			newLeafNode(lv_name_2_0, grammarAccess.getQuizAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuizRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleQuiz362); 

                	newLeafNode(otherlv_3, grammarAccess.getQuizAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleQuiz374); 

                	newLeafNode(otherlv_4, grammarAccess.getQuizAccess().getTextKeyword_4());
                
            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleQuiz386); 

                	newLeafNode(otherlv_5, grammarAccess.getQuizAccess().getColonKeyword_5());
                
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:224:1: ( (lv_text_6_0= RULE_STRING ) )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:225:1: (lv_text_6_0= RULE_STRING )
            {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:225:1: (lv_text_6_0= RULE_STRING )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:226:3: lv_text_6_0= RULE_STRING
            {
            lv_text_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuiz403); 

            			newLeafNode(lv_text_6_0, grammarAccess.getQuizAccess().getTextSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuizRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_6_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleQuiz420); 

                	newLeafNode(otherlv_7, grammarAccess.getQuizAccess().getSemicolonKeyword_7());
                
            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleQuiz432); 

                	newLeafNode(otherlv_8, grammarAccess.getQuizAccess().getScoreKeyword_8());
                
            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleQuiz444); 

                	newLeafNode(otherlv_9, grammarAccess.getQuizAccess().getColonKeyword_9());
                
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:254:1: ( (lv_score_10_0= RULE_INT ) )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:255:1: (lv_score_10_0= RULE_INT )
            {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:255:1: (lv_score_10_0= RULE_INT )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:256:3: lv_score_10_0= RULE_INT
            {
            lv_score_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuiz461); 

            			newLeafNode(lv_score_10_0, grammarAccess.getQuizAccess().getScoreINTTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuizRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"score",
                    		lv_score_10_0, 
                    		"INT");
            	    

            }


            }

            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleQuiz478); 

                	newLeafNode(otherlv_11, grammarAccess.getQuizAccess().getSemicolonKeyword_11());
                
            otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleQuiz490); 

                	newLeafNode(otherlv_12, grammarAccess.getQuizAccess().getChoicesKeyword_12());
                
            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleQuiz502); 

                	newLeafNode(otherlv_13, grammarAccess.getQuizAccess().getLeftCurlyBracketKeyword_13());
                
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:284:1: ( (lv_elements_14_0= ruleChoice ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:285:1: (lv_elements_14_0= ruleChoice )
            	    {
            	    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:285:1: (lv_elements_14_0= ruleChoice )
            	    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:286:3: lv_elements_14_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuizAccess().getElementsChoiceParserRuleCall_14_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChoice_in_ruleQuiz523);
            	    lv_elements_14_0=ruleChoice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuizRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_14_0, 
            	            		"Choice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_15=(Token)match(input,14,FOLLOW_14_in_ruleQuiz536); 

                	newLeafNode(otherlv_15, grammarAccess.getQuizAccess().getRightCurlyBracketKeyword_15());
                
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:306:1: (otherlv_16= 'hint' otherlv_17= ':' ( (lv_hint_18_0= RULE_STRING ) ) otherlv_19= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:306:3: otherlv_16= 'hint' otherlv_17= ':' ( (lv_hint_18_0= RULE_STRING ) ) otherlv_19= ';'
                    {
                    otherlv_16=(Token)match(input,21,FOLLOW_21_in_ruleQuiz549); 

                        	newLeafNode(otherlv_16, grammarAccess.getQuizAccess().getHintKeyword_16_0());
                        
                    otherlv_17=(Token)match(input,17,FOLLOW_17_in_ruleQuiz561); 

                        	newLeafNode(otherlv_17, grammarAccess.getQuizAccess().getColonKeyword_16_1());
                        
                    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:314:1: ( (lv_hint_18_0= RULE_STRING ) )
                    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:315:1: (lv_hint_18_0= RULE_STRING )
                    {
                    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:315:1: (lv_hint_18_0= RULE_STRING )
                    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:316:3: lv_hint_18_0= RULE_STRING
                    {
                    lv_hint_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuiz578); 

                    			newLeafNode(lv_hint_18_0, grammarAccess.getQuizAccess().getHintSTRINGTerminalRuleCall_16_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuizRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"hint",
                            		lv_hint_18_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_19=(Token)match(input,18,FOLLOW_18_in_ruleQuiz595); 

                        	newLeafNode(otherlv_19, grammarAccess.getQuizAccess().getSemicolonKeyword_16_3());
                        

                    }
                    break;

            }

            otherlv_20=(Token)match(input,14,FOLLOW_14_in_ruleQuiz609); 

                	newLeafNode(otherlv_20, grammarAccess.getQuizAccess().getRightCurlyBracketKeyword_17());
                

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
    // $ANTLR end "ruleQuiz"


    // $ANTLR start "entryRuleChoice"
    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:348:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:349:2: (iv_ruleChoice= ruleChoice EOF )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:350:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice645);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice655); 

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
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:357:1: ruleChoice returns [EObject current=null] : ( ( (lv_text_0_0= RULE_STRING ) ) otherlv_1= '->' ( (lv_correct_2_0= ruleBool ) ) otherlv_3= ';' ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_correct_2_0 = null;


         enterRule(); 
            
        try {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:360:28: ( ( ( (lv_text_0_0= RULE_STRING ) ) otherlv_1= '->' ( (lv_correct_2_0= ruleBool ) ) otherlv_3= ';' ) )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:361:1: ( ( (lv_text_0_0= RULE_STRING ) ) otherlv_1= '->' ( (lv_correct_2_0= ruleBool ) ) otherlv_3= ';' )
            {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:361:1: ( ( (lv_text_0_0= RULE_STRING ) ) otherlv_1= '->' ( (lv_correct_2_0= ruleBool ) ) otherlv_3= ';' )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:361:2: ( (lv_text_0_0= RULE_STRING ) ) otherlv_1= '->' ( (lv_correct_2_0= ruleBool ) ) otherlv_3= ';'
            {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:361:2: ( (lv_text_0_0= RULE_STRING ) )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:362:1: (lv_text_0_0= RULE_STRING )
            {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:362:1: (lv_text_0_0= RULE_STRING )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:363:3: lv_text_0_0= RULE_STRING
            {
            lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChoice697); 

            			newLeafNode(lv_text_0_0, grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleChoice714); 

                	newLeafNode(otherlv_1, grammarAccess.getChoiceAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:383:1: ( (lv_correct_2_0= ruleBool ) )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:384:1: (lv_correct_2_0= ruleBool )
            {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:384:1: (lv_correct_2_0= ruleBool )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:385:3: lv_correct_2_0= ruleBool
            {
             
            	        newCompositeNode(grammarAccess.getChoiceAccess().getCorrectBoolParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBool_in_ruleChoice735);
            lv_correct_2_0=ruleBool();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChoiceRule());
            	        }
                   		set(
                   			current, 
                   			"correct",
                    		lv_correct_2_0, 
                    		"Bool");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleChoice747); 

                	newLeafNode(otherlv_3, grammarAccess.getChoiceAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleChoice"


    // $ANTLR start "entryRuleBool"
    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:413:1: entryRuleBool returns [String current=null] : iv_ruleBool= ruleBool EOF ;
    public final String entryRuleBool() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBool = null;


        try {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:414:2: (iv_ruleBool= ruleBool EOF )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:415:2: iv_ruleBool= ruleBool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_ruleBool_in_entryRuleBool784);
            iv_ruleBool=ruleBool();

            state._fsp--;

             current =iv_ruleBool.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBool795); 

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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:422:1: ruleBool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBool() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:425:28: ( (kw= 'true' | kw= 'false' ) )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:426:1: (kw= 'true' | kw= 'false' )
            {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:426:1: (kw= 'true' | kw= 'false' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:427:2: kw= 'true'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleBool833); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBoolAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:434:2: kw= 'false'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleBool852); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBoolAccess().getFalseKeyword_1()); 
                        

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
    // $ANTLR end "ruleBool"


    // $ANTLR start "ruleType"
    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:447:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'multiChoice' ) | (enumLiteral_1= 'singleChoice' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:449:28: ( ( (enumLiteral_0= 'multiChoice' ) | (enumLiteral_1= 'singleChoice' ) ) )
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:450:1: ( (enumLiteral_0= 'multiChoice' ) | (enumLiteral_1= 'singleChoice' ) )
            {
            // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:450:1: ( (enumLiteral_0= 'multiChoice' ) | (enumLiteral_1= 'singleChoice' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            else if ( (LA5_0==26) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:450:2: (enumLiteral_0= 'multiChoice' )
                    {
                    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:450:2: (enumLiteral_0= 'multiChoice' )
                    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:450:4: enumLiteral_0= 'multiChoice'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_25_in_ruleType906); 

                            current = grammarAccess.getTypeAccess().getMultiChoiceEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getMultiChoiceEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:456:6: (enumLiteral_1= 'singleChoice' )
                    {
                    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:456:6: (enumLiteral_1= 'singleChoice' )
                    // ../v1.quiz/src-gen/v1/quiz/parser/antlr/internal/InternalQuiz.g:456:8: enumLiteral_1= 'singleChoice'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_26_in_ruleType923); 

                            current = grammarAccess.getTypeAccess().getSingleChoiceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getSingleChoiceEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleQuizGame_in_entryRuleQuizGame75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuizGame85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleQuizGame122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuizGame139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQuizGame156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuizGame173 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleQuizGame190 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleQuiz_in_ruleQuizGame211 = new BitSet(new long[]{0x0000000006004000L});
    public static final BitSet FOLLOW_14_in_ruleQuizGame224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuiz_in_entryRuleQuiz260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuiz270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleQuiz316 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQuiz328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuiz345 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleQuiz362 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQuiz374 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQuiz386 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuiz403 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQuiz420 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQuiz432 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQuiz444 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuiz461 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQuiz478 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleQuiz490 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleQuiz502 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleQuiz523 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_14_in_ruleQuiz536 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_21_in_ruleQuiz549 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQuiz561 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuiz578 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQuiz595 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQuiz609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChoice697 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleChoice714 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleBool_in_ruleChoice735 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleChoice747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_entryRuleBool784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBool795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleBool833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBool852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleType906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleType923 = new BitSet(new long[]{0x0000000000000002L});

}