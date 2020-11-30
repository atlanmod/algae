package org.atlanmod.analysis.parser.antlr.internal;

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
import org.atlanmod.analysis.services.AlgaeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlgaeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Platform'", "'{'", "','", "'}'", "'.'", "'post'", "'#'", "'='", "'ocl:'", "'attribute:'", "'.absoluteTime'", "'+'", "'-'", "'*'", "'/'", "'exp'", "'logistic'", "'integral'", "'['", "';'", "']'", "'NormalDistribution'", "'Interval'", "'lowerEndpoint'", "'upperEndpoint'", "'Sampling'", "'measurementProcedure'", "'samples'", "'Integral'", "'function'", "'interval'", "'Sample'", "'quantity'", "'abstract'", "'interface'", "'EClass'", "'instanceClassName'", "'instanceTypeName'", "'eSuperTypes'", "'('", "')'", "'eAnnotations'", "'eTypeParameters'", "'eOperations'", "'eStructuralFeatures'", "'eGenericSuperTypes'", "'EOperation'", "'ordered'", "'unique'", "'lowerBound'", "'upperBound'", "'eType'", "'eExceptions'", "'eGenericType'", "'eParameters'", "'eGenericExceptions'", "'EAnnotation'", "'source'", "'references'", "'details'", "'contents'", "'ETypeParameter'", "'eBounds'", "'true'", "'false'", "'EGenericType'", "'eTypeParameter'", "'eClassifier'", "'eUpperBound'", "'eTypeArguments'", "'eLowerBound'", "'EStringToStringMapEntry'", "'key'", "'value'", "'EObject'", "'volatile'", "'transient'", "'unsettable'", "'derived'", "'iD'", "'EAttribute'", "'changeable'", "'defaultValueLiteral'", "'containment'", "'EReference'", "'resolveProxies'", "'eOpposite'", "'eKeys'", "'EDataType'", "'serializable'", "'EEnum'", "'eLiterals'", "'EEnumLiteral'", "'literal'", "'EParameter'", "'LOCAL'", "'GLOBAL'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalAlgaeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAlgaeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAlgaeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAlgae.g"; }



     	private AlgaeGrammarAccess grammarAccess;

        public InternalAlgaeParser(TokenStream input, AlgaeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Platform";
       	}

       	@Override
       	protected AlgaeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePlatform"
    // InternalAlgae.g:65:1: entryRulePlatform returns [EObject current=null] : iv_rulePlatform= rulePlatform EOF ;
    public final EObject entryRulePlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatform = null;


        try {
            // InternalAlgae.g:65:49: (iv_rulePlatform= rulePlatform EOF )
            // InternalAlgae.g:66:2: iv_rulePlatform= rulePlatform EOF
            {
             newCompositeNode(grammarAccess.getPlatformRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatform=rulePlatform();

            state._fsp--;

             current =iv_rulePlatform; 
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
    // $ANTLR end "entryRulePlatform"


    // $ANTLR start "rulePlatform"
    // InternalAlgae.g:72:1: rulePlatform returns [EObject current=null] : ( () otherlv_1= 'Platform' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_measures_4_0= ruleMeasure ) ) ( (otherlv_5= ',' )? ( (lv_measures_6_0= ruleMeasure ) ) )* otherlv_7= '}' ) ;
    public final EObject rulePlatform() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_measures_4_0 = null;

        EObject lv_measures_6_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:78:2: ( ( () otherlv_1= 'Platform' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_measures_4_0= ruleMeasure ) ) ( (otherlv_5= ',' )? ( (lv_measures_6_0= ruleMeasure ) ) )* otherlv_7= '}' ) )
            // InternalAlgae.g:79:2: ( () otherlv_1= 'Platform' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_measures_4_0= ruleMeasure ) ) ( (otherlv_5= ',' )? ( (lv_measures_6_0= ruleMeasure ) ) )* otherlv_7= '}' )
            {
            // InternalAlgae.g:79:2: ( () otherlv_1= 'Platform' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_measures_4_0= ruleMeasure ) ) ( (otherlv_5= ',' )? ( (lv_measures_6_0= ruleMeasure ) ) )* otherlv_7= '}' )
            // InternalAlgae.g:80:3: () otherlv_1= 'Platform' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_measures_4_0= ruleMeasure ) ) ( (otherlv_5= ',' )? ( (lv_measures_6_0= ruleMeasure ) ) )* otherlv_7= '}'
            {
            // InternalAlgae.g:80:3: ()
            // InternalAlgae.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlatformAccess().getPlatformAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPlatformAccess().getPlatformKeyword_1());
            		
            // InternalAlgae.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAlgae.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalAlgae.g:92:4: (lv_name_2_0= ruleEString )
            // InternalAlgae.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPlatformAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlatformRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAlgae.g:114:3: ( (lv_measures_4_0= ruleMeasure ) )
            // InternalAlgae.g:115:4: (lv_measures_4_0= ruleMeasure )
            {
            // InternalAlgae.g:115:4: (lv_measures_4_0= ruleMeasure )
            // InternalAlgae.g:116:5: lv_measures_4_0= ruleMeasure
            {

            					newCompositeNode(grammarAccess.getPlatformAccess().getMeasuresMeasureParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_measures_4_0=ruleMeasure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlatformRule());
            					}
            					add(
            						current,
            						"measures",
            						lv_measures_4_0,
            						"org.atlanmod.analysis.Algae.Measure");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:133:3: ( (otherlv_5= ',' )? ( (lv_measures_6_0= ruleMeasure ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)||LA2_0==13||LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAlgae.g:134:4: (otherlv_5= ',' )? ( (lv_measures_6_0= ruleMeasure ) )
            	    {
            	    // InternalAlgae.g:134:4: (otherlv_5= ',' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==13) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalAlgae.g:135:5: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,13,FOLLOW_5); 

            	            					newLeafNode(otherlv_5, grammarAccess.getPlatformAccess().getCommaKeyword_5_0());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalAlgae.g:140:4: ( (lv_measures_6_0= ruleMeasure ) )
            	    // InternalAlgae.g:141:5: (lv_measures_6_0= ruleMeasure )
            	    {
            	    // InternalAlgae.g:141:5: (lv_measures_6_0= ruleMeasure )
            	    // InternalAlgae.g:142:6: lv_measures_6_0= ruleMeasure
            	    {

            	    						newCompositeNode(grammarAccess.getPlatformAccess().getMeasuresMeasureParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_measures_6_0=ruleMeasure();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlatformRule());
            	    						}
            	    						add(
            	    							current,
            	    							"measures",
            	    							lv_measures_6_0,
            	    							"org.atlanmod.analysis.Algae.Measure");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "rulePlatform"


    // $ANTLR start "entryRuleMeasure"
    // InternalAlgae.g:168:1: entryRuleMeasure returns [EObject current=null] : iv_ruleMeasure= ruleMeasure EOF ;
    public final EObject entryRuleMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasure = null;


        try {
            // InternalAlgae.g:168:48: (iv_ruleMeasure= ruleMeasure EOF )
            // InternalAlgae.g:169:2: iv_ruleMeasure= ruleMeasure EOF
            {
             newCompositeNode(grammarAccess.getMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasure=ruleMeasure();

            state._fsp--;

             current =iv_ruleMeasure; 
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
    // $ANTLR end "entryRuleMeasure"


    // $ANTLR start "ruleMeasure"
    // InternalAlgae.g:175:1: ruleMeasure returns [EObject current=null] : (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureUnboundProductOperation_3= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_4= ruleMeasureUnboundSumOperation | this_MeasureUnboundDivisionOperation_5= ruleMeasureUnboundDivisionOperation | this_MeasureUnboundSubstractOperation_6= ruleMeasureUnboundSubstractOperation | this_RealTimeDuration_7= ruleRealTimeDuration | this_CompositeMeasure_8= ruleCompositeMeasure ) ;
    public final EObject ruleMeasure() throws RecognitionException {
        EObject current = null;

        EObject this_MeasureValue_Impl_0 = null;

        EObject this_MeasureOCL_1 = null;

        EObject this_MeasureAttribute_2 = null;

        EObject this_MeasureUnboundProductOperation_3 = null;

        EObject this_MeasureUnboundSumOperation_4 = null;

        EObject this_MeasureUnboundDivisionOperation_5 = null;

        EObject this_MeasureUnboundSubstractOperation_6 = null;

        EObject this_RealTimeDuration_7 = null;

        EObject this_CompositeMeasure_8 = null;



        	enterRule();

        try {
            // InternalAlgae.g:181:2: ( (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureUnboundProductOperation_3= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_4= ruleMeasureUnboundSumOperation | this_MeasureUnboundDivisionOperation_5= ruleMeasureUnboundDivisionOperation | this_MeasureUnboundSubstractOperation_6= ruleMeasureUnboundSubstractOperation | this_RealTimeDuration_7= ruleRealTimeDuration | this_CompositeMeasure_8= ruleCompositeMeasure ) )
            // InternalAlgae.g:182:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureUnboundProductOperation_3= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_4= ruleMeasureUnboundSumOperation | this_MeasureUnboundDivisionOperation_5= ruleMeasureUnboundDivisionOperation | this_MeasureUnboundSubstractOperation_6= ruleMeasureUnboundSubstractOperation | this_RealTimeDuration_7= ruleRealTimeDuration | this_CompositeMeasure_8= ruleCompositeMeasure )
            {
            // InternalAlgae.g:182:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureUnboundProductOperation_3= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_4= ruleMeasureUnboundSumOperation | this_MeasureUnboundDivisionOperation_5= ruleMeasureUnboundDivisionOperation | this_MeasureUnboundSubstractOperation_6= ruleMeasureUnboundSubstractOperation | this_RealTimeDuration_7= ruleRealTimeDuration | this_CompositeMeasure_8= ruleCompositeMeasure )
            int alt3=9;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalAlgae.g:183:3: this_MeasureValue_Impl_0= ruleMeasureValue_Impl
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureValue_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureValue_Impl_0=ruleMeasureValue_Impl();

                    state._fsp--;


                    			current = this_MeasureValue_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlgae.g:192:3: this_MeasureOCL_1= ruleMeasureOCL
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureOCLParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureOCL_1=ruleMeasureOCL();

                    state._fsp--;


                    			current = this_MeasureOCL_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlgae.g:201:3: this_MeasureAttribute_2= ruleMeasureAttribute
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureAttributeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureAttribute_2=ruleMeasureAttribute();

                    state._fsp--;


                    			current = this_MeasureAttribute_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlgae.g:210:3: this_MeasureUnboundProductOperation_3= ruleMeasureUnboundProductOperation
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureUnboundProductOperationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureUnboundProductOperation_3=ruleMeasureUnboundProductOperation();

                    state._fsp--;


                    			current = this_MeasureUnboundProductOperation_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAlgae.g:219:3: this_MeasureUnboundSumOperation_4= ruleMeasureUnboundSumOperation
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureUnboundSumOperationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureUnboundSumOperation_4=ruleMeasureUnboundSumOperation();

                    state._fsp--;


                    			current = this_MeasureUnboundSumOperation_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAlgae.g:228:3: this_MeasureUnboundDivisionOperation_5= ruleMeasureUnboundDivisionOperation
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureUnboundDivisionOperationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureUnboundDivisionOperation_5=ruleMeasureUnboundDivisionOperation();

                    state._fsp--;


                    			current = this_MeasureUnboundDivisionOperation_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAlgae.g:237:3: this_MeasureUnboundSubstractOperation_6= ruleMeasureUnboundSubstractOperation
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureUnboundSubstractOperationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureUnboundSubstractOperation_6=ruleMeasureUnboundSubstractOperation();

                    state._fsp--;


                    			current = this_MeasureUnboundSubstractOperation_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalAlgae.g:246:3: this_RealTimeDuration_7= ruleRealTimeDuration
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getRealTimeDurationParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealTimeDuration_7=ruleRealTimeDuration();

                    state._fsp--;


                    			current = this_RealTimeDuration_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalAlgae.g:255:3: this_CompositeMeasure_8= ruleCompositeMeasure
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getCompositeMeasureParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeMeasure_8=ruleCompositeMeasure();

                    state._fsp--;


                    			current = this_CompositeMeasure_8;
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
    // $ANTLR end "ruleMeasure"


    // $ANTLR start "entryRuleCompositeMeasure"
    // InternalAlgae.g:267:1: entryRuleCompositeMeasure returns [EObject current=null] : iv_ruleCompositeMeasure= ruleCompositeMeasure EOF ;
    public final EObject entryRuleCompositeMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeMeasure = null;


        try {
            // InternalAlgae.g:267:57: (iv_ruleCompositeMeasure= ruleCompositeMeasure EOF )
            // InternalAlgae.g:268:2: iv_ruleCompositeMeasure= ruleCompositeMeasure EOF
            {
             newCompositeNode(grammarAccess.getCompositeMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeMeasure=ruleCompositeMeasure();

            state._fsp--;

             current =iv_ruleCompositeMeasure; 
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
    // $ANTLR end "entryRuleCompositeMeasure"


    // $ANTLR start "ruleCompositeMeasure"
    // InternalAlgae.g:274:1: ruleCompositeMeasure returns [EObject current=null] : (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure | this_IntegrationMeasure_2= ruleIntegrationMeasure ) ;
    public final EObject ruleCompositeMeasure() throws RecognitionException {
        EObject current = null;

        EObject this_ExponentialMeasure_0 = null;

        EObject this_LogisticMeasure_1 = null;

        EObject this_IntegrationMeasure_2 = null;



        	enterRule();

        try {
            // InternalAlgae.g:280:2: ( (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure | this_IntegrationMeasure_2= ruleIntegrationMeasure ) )
            // InternalAlgae.g:281:2: (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure | this_IntegrationMeasure_2= ruleIntegrationMeasure )
            {
            // InternalAlgae.g:281:2: (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure | this_IntegrationMeasure_2= ruleIntegrationMeasure )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalAlgae.g:282:3: this_ExponentialMeasure_0= ruleExponentialMeasure
                    {

                    			newCompositeNode(grammarAccess.getCompositeMeasureAccess().getExponentialMeasureParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExponentialMeasure_0=ruleExponentialMeasure();

                    state._fsp--;


                    			current = this_ExponentialMeasure_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlgae.g:291:3: this_LogisticMeasure_1= ruleLogisticMeasure
                    {

                    			newCompositeNode(grammarAccess.getCompositeMeasureAccess().getLogisticMeasureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogisticMeasure_1=ruleLogisticMeasure();

                    state._fsp--;


                    			current = this_LogisticMeasure_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlgae.g:300:3: this_IntegrationMeasure_2= ruleIntegrationMeasure
                    {

                    			newCompositeNode(grammarAccess.getCompositeMeasureAccess().getIntegrationMeasureParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegrationMeasure_2=ruleIntegrationMeasure();

                    state._fsp--;


                    			current = this_IntegrationMeasure_2;
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
    // $ANTLR end "ruleCompositeMeasure"


    // $ANTLR start "entryRuleMeasurementUncertaintyInformation"
    // InternalAlgae.g:312:1: entryRuleMeasurementUncertaintyInformation returns [EObject current=null] : iv_ruleMeasurementUncertaintyInformation= ruleMeasurementUncertaintyInformation EOF ;
    public final EObject entryRuleMeasurementUncertaintyInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementUncertaintyInformation = null;


        try {
            // InternalAlgae.g:312:74: (iv_ruleMeasurementUncertaintyInformation= ruleMeasurementUncertaintyInformation EOF )
            // InternalAlgae.g:313:2: iv_ruleMeasurementUncertaintyInformation= ruleMeasurementUncertaintyInformation EOF
            {
             newCompositeNode(grammarAccess.getMeasurementUncertaintyInformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasurementUncertaintyInformation=ruleMeasurementUncertaintyInformation();

            state._fsp--;

             current =iv_ruleMeasurementUncertaintyInformation; 
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
    // $ANTLR end "entryRuleMeasurementUncertaintyInformation"


    // $ANTLR start "ruleMeasurementUncertaintyInformation"
    // InternalAlgae.g:319:1: ruleMeasurementUncertaintyInformation returns [EObject current=null] : (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral ) ;
    public final EObject ruleMeasurementUncertaintyInformation() throws RecognitionException {
        EObject current = null;

        EObject this_NormalDistribution_0 = null;

        EObject this_Interval_1 = null;

        EObject this_Sampling_2 = null;

        EObject this_Integral_3 = null;



        	enterRule();

        try {
            // InternalAlgae.g:325:2: ( (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral ) )
            // InternalAlgae.g:326:2: (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral )
            {
            // InternalAlgae.g:326:2: (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt5=1;
                }
                break;
            case 33:
                {
                alt5=2;
                }
                break;
            case 36:
                {
                alt5=3;
                }
                break;
            case 39:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalAlgae.g:327:3: this_NormalDistribution_0= ruleNormalDistribution
                    {

                    			newCompositeNode(grammarAccess.getMeasurementUncertaintyInformationAccess().getNormalDistributionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NormalDistribution_0=ruleNormalDistribution();

                    state._fsp--;


                    			current = this_NormalDistribution_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlgae.g:336:3: this_Interval_1= ruleInterval
                    {

                    			newCompositeNode(grammarAccess.getMeasurementUncertaintyInformationAccess().getIntervalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interval_1=ruleInterval();

                    state._fsp--;


                    			current = this_Interval_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlgae.g:345:3: this_Sampling_2= ruleSampling
                    {

                    			newCompositeNode(grammarAccess.getMeasurementUncertaintyInformationAccess().getSamplingParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sampling_2=ruleSampling();

                    state._fsp--;


                    			current = this_Sampling_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlgae.g:354:3: this_Integral_3= ruleIntegral
                    {

                    			newCompositeNode(grammarAccess.getMeasurementUncertaintyInformationAccess().getIntegralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Integral_3=ruleIntegral();

                    state._fsp--;


                    			current = this_Integral_3;
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
    // $ANTLR end "ruleMeasurementUncertaintyInformation"


    // $ANTLR start "entryRuleEString"
    // InternalAlgae.g:366:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAlgae.g:366:47: (iv_ruleEString= ruleEString EOF )
            // InternalAlgae.g:367:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalAlgae.g:373:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAlgae.g:379:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAlgae.g:380:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAlgae.g:380:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAlgae.g:381:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlgae.g:389:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBigDecimal"
    // InternalAlgae.g:400:1: entryRuleEBigDecimal returns [String current=null] : iv_ruleEBigDecimal= ruleEBigDecimal EOF ;
    public final String entryRuleEBigDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigDecimal = null;


        try {
            // InternalAlgae.g:400:51: (iv_ruleEBigDecimal= ruleEBigDecimal EOF )
            // InternalAlgae.g:401:2: iv_ruleEBigDecimal= ruleEBigDecimal EOF
            {
             newCompositeNode(grammarAccess.getEBigDecimalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBigDecimal=ruleEBigDecimal();

            state._fsp--;

             current =iv_ruleEBigDecimal.getText(); 
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
    // $ANTLR end "entryRuleEBigDecimal"


    // $ANTLR start "ruleEBigDecimal"
    // InternalAlgae.g:407:1: ruleEBigDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalAlgae.g:413:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalAlgae.g:414:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalAlgae.g:414:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalAlgae.g:415:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalAlgae.g:415:3: (this_INT_0= RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlgae.g:416:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_7); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,15,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEBigDecimalAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleEBigDecimal"


    // $ANTLR start "entryRuleMeasureValue_Impl"
    // InternalAlgae.g:440:1: entryRuleMeasureValue_Impl returns [EObject current=null] : iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF ;
    public final EObject entryRuleMeasureValue_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureValue_Impl = null;


        try {
            // InternalAlgae.g:440:58: (iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF )
            // InternalAlgae.g:441:2: iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF
            {
             newCompositeNode(grammarAccess.getMeasureValue_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureValue_Impl=ruleMeasureValue_Impl();

            state._fsp--;

             current =iv_ruleMeasureValue_Impl; 
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
    // $ANTLR end "entryRuleMeasureValue_Impl"


    // $ANTLR start "ruleMeasureValue_Impl"
    // InternalAlgae.g:447:1: ruleMeasureValue_Impl returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( (lv_value_8_0= ruleEBigDecimal ) )? ) ;
    public final EObject ruleMeasureValue_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        AntlrDatatypeRuleToken lv_subname_6_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:453:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( (lv_value_8_0= ruleEBigDecimal ) )? ) )
            // InternalAlgae.g:454:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( (lv_value_8_0= ruleEBigDecimal ) )? )
            {
            // InternalAlgae.g:454:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( (lv_value_8_0= ruleEBigDecimal ) )? )
            // InternalAlgae.g:455:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( (lv_value_8_0= ruleEBigDecimal ) )?
            {
            // InternalAlgae.g:455:3: ()
            // InternalAlgae.g:456:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureValue_ImplAccess().getMeasureValueAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:462:3: ( (lv_post_1_0= 'post' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlgae.g:463:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:463:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:464:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,16,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureValue_ImplAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureValue_ImplRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:476:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalAlgae.g:477:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalAlgae.g:477:4: (lv_targetClass_2_0= ruleEString )
            // InternalAlgae.g:478:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:495:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAlgae.g:496:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureValue_ImplAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalAlgae.g:500:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalAlgae.g:501:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalAlgae.g:501:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalAlgae.g:502:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureValue_ImplAccess().getFullStopKeyword_4());
            		
            // InternalAlgae.g:524:3: ( (lv_subname_6_0= ruleEString ) )
            // InternalAlgae.g:525:4: (lv_subname_6_0= ruleEString )
            {
            // InternalAlgae.g:525:4: (lv_subname_6_0= ruleEString )
            // InternalAlgae.g:526:5: lv_subname_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getSubnameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_subname_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
            					}
            					set(
            						current,
            						"subname",
            						lv_subname_6_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureValue_ImplAccess().getEqualsSignKeyword_6());
            		
            // InternalAlgae.g:547:3: ( (lv_value_8_0= ruleEBigDecimal ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT||LA10_0==15) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAlgae.g:548:4: (lv_value_8_0= ruleEBigDecimal )
                    {
                    // InternalAlgae.g:548:4: (lv_value_8_0= ruleEBigDecimal )
                    // InternalAlgae.g:549:5: lv_value_8_0= ruleEBigDecimal
                    {

                    					newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getValueEBigDecimalParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_8_0=ruleEBigDecimal();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_8_0,
                    						"org.atlanmod.analysis.Algae.EBigDecimal");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleMeasureValue_Impl"


    // $ANTLR start "entryRuleMeasureOCL"
    // InternalAlgae.g:570:1: entryRuleMeasureOCL returns [EObject current=null] : iv_ruleMeasureOCL= ruleMeasureOCL EOF ;
    public final EObject entryRuleMeasureOCL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureOCL = null;


        try {
            // InternalAlgae.g:570:51: (iv_ruleMeasureOCL= ruleMeasureOCL EOF )
            // InternalAlgae.g:571:2: iv_ruleMeasureOCL= ruleMeasureOCL EOF
            {
             newCompositeNode(grammarAccess.getMeasureOCLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureOCL=ruleMeasureOCL();

            state._fsp--;

             current =iv_ruleMeasureOCL; 
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
    // $ANTLR end "entryRuleMeasureOCL"


    // $ANTLR start "ruleMeasureOCL"
    // InternalAlgae.g:577:1: ruleMeasureOCL returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'ocl:' ( (lv_oclQuery_9_0= ruleEString ) ) ) ;
    public final EObject ruleMeasureOCL() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        AntlrDatatypeRuleToken lv_subname_6_0 = null;

        AntlrDatatypeRuleToken lv_oclQuery_9_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:583:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'ocl:' ( (lv_oclQuery_9_0= ruleEString ) ) ) )
            // InternalAlgae.g:584:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'ocl:' ( (lv_oclQuery_9_0= ruleEString ) ) )
            {
            // InternalAlgae.g:584:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'ocl:' ( (lv_oclQuery_9_0= ruleEString ) ) )
            // InternalAlgae.g:585:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'ocl:' ( (lv_oclQuery_9_0= ruleEString ) )
            {
            // InternalAlgae.g:585:3: ()
            // InternalAlgae.g:586:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureOCLAccess().getMeasureOCLAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:592:3: ( (lv_post_1_0= 'post' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlgae.g:593:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:593:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:594:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,16,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureOCLAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureOCLRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:606:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalAlgae.g:607:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalAlgae.g:607:4: (lv_targetClass_2_0= ruleEString )
            // InternalAlgae.g:608:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureOCLAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:625:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAlgae.g:626:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureOCLAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalAlgae.g:630:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalAlgae.g:631:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalAlgae.g:631:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalAlgae.g:632:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureOCLAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureOCLAccess().getFullStopKeyword_4());
            		
            // InternalAlgae.g:654:3: ( (lv_subname_6_0= ruleEString ) )
            // InternalAlgae.g:655:4: (lv_subname_6_0= ruleEString )
            {
            // InternalAlgae.g:655:4: (lv_subname_6_0= ruleEString )
            // InternalAlgae.g:656:5: lv_subname_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureOCLAccess().getSubnameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_subname_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
            					}
            					set(
            						current,
            						"subname",
            						lv_subname_6_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureOCLAccess().getEqualsSignKeyword_6());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureOCLAccess().getOclKeyword_7());
            		
            // InternalAlgae.g:681:3: ( (lv_oclQuery_9_0= ruleEString ) )
            // InternalAlgae.g:682:4: (lv_oclQuery_9_0= ruleEString )
            {
            // InternalAlgae.g:682:4: (lv_oclQuery_9_0= ruleEString )
            // InternalAlgae.g:683:5: lv_oclQuery_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureOCLAccess().getOclQueryEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_oclQuery_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
            					}
            					set(
            						current,
            						"oclQuery",
            						lv_oclQuery_9_0,
            						"org.atlanmod.analysis.Algae.EString");
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
    // $ANTLR end "ruleMeasureOCL"


    // $ANTLR start "entryRuleMeasureAttribute"
    // InternalAlgae.g:704:1: entryRuleMeasureAttribute returns [EObject current=null] : iv_ruleMeasureAttribute= ruleMeasureAttribute EOF ;
    public final EObject entryRuleMeasureAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureAttribute = null;


        try {
            // InternalAlgae.g:704:57: (iv_ruleMeasureAttribute= ruleMeasureAttribute EOF )
            // InternalAlgae.g:705:2: iv_ruleMeasureAttribute= ruleMeasureAttribute EOF
            {
             newCompositeNode(grammarAccess.getMeasureAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureAttribute=ruleMeasureAttribute();

            state._fsp--;

             current =iv_ruleMeasureAttribute; 
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
    // $ANTLR end "entryRuleMeasureAttribute"


    // $ANTLR start "ruleMeasureAttribute"
    // InternalAlgae.g:711:1: ruleMeasureAttribute returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'attribute:' ( (lv_att_9_0= ruleEString ) ) ) ;
    public final EObject ruleMeasureAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        AntlrDatatypeRuleToken lv_subname_6_0 = null;

        AntlrDatatypeRuleToken lv_att_9_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:717:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'attribute:' ( (lv_att_9_0= ruleEString ) ) ) )
            // InternalAlgae.g:718:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'attribute:' ( (lv_att_9_0= ruleEString ) ) )
            {
            // InternalAlgae.g:718:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'attribute:' ( (lv_att_9_0= ruleEString ) ) )
            // InternalAlgae.g:719:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'attribute:' ( (lv_att_9_0= ruleEString ) )
            {
            // InternalAlgae.g:719:3: ()
            // InternalAlgae.g:720:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureAttributeAccess().getMeasureAttributeAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:726:3: ( (lv_post_1_0= 'post' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlgae.g:727:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:727:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:728:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,16,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureAttributeAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureAttributeRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:740:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalAlgae.g:741:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalAlgae.g:741:4: (lv_targetClass_2_0= ruleEString )
            // InternalAlgae.g:742:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureAttributeAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureAttributeRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:759:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlgae.g:760:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureAttributeAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalAlgae.g:764:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalAlgae.g:765:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalAlgae.g:765:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalAlgae.g:766:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureAttributeAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureAttributeRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureAttributeAccess().getFullStopKeyword_4());
            		
            // InternalAlgae.g:788:3: ( (lv_subname_6_0= ruleEString ) )
            // InternalAlgae.g:789:4: (lv_subname_6_0= ruleEString )
            {
            // InternalAlgae.g:789:4: (lv_subname_6_0= ruleEString )
            // InternalAlgae.g:790:5: lv_subname_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureAttributeAccess().getSubnameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_subname_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureAttributeRule());
            					}
            					set(
            						current,
            						"subname",
            						lv_subname_6_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureAttributeAccess().getEqualsSignKeyword_6());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureAttributeAccess().getAttributeKeyword_7());
            		
            // InternalAlgae.g:815:3: ( (lv_att_9_0= ruleEString ) )
            // InternalAlgae.g:816:4: (lv_att_9_0= ruleEString )
            {
            // InternalAlgae.g:816:4: (lv_att_9_0= ruleEString )
            // InternalAlgae.g:817:5: lv_att_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureAttributeAccess().getAttEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_att_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureAttributeRule());
            					}
            					set(
            						current,
            						"att",
            						lv_att_9_0,
            						"org.atlanmod.analysis.Algae.EString");
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
    // $ANTLR end "ruleMeasureAttribute"


    // $ANTLR start "entryRuleRealTimeDuration"
    // InternalAlgae.g:838:1: entryRuleRealTimeDuration returns [EObject current=null] : iv_ruleRealTimeDuration= ruleRealTimeDuration EOF ;
    public final EObject entryRuleRealTimeDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTimeDuration = null;


        try {
            // InternalAlgae.g:838:57: (iv_ruleRealTimeDuration= ruleRealTimeDuration EOF )
            // InternalAlgae.g:839:2: iv_ruleRealTimeDuration= ruleRealTimeDuration EOF
            {
             newCompositeNode(grammarAccess.getRealTimeDurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealTimeDuration=ruleRealTimeDuration();

            state._fsp--;

             current =iv_ruleRealTimeDuration; 
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
    // $ANTLR end "entryRuleRealTimeDuration"


    // $ANTLR start "ruleRealTimeDuration"
    // InternalAlgae.g:845:1: ruleRealTimeDuration returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime' ) ;
    public final EObject ruleRealTimeDuration() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:851:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime' ) )
            // InternalAlgae.g:852:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime' )
            {
            // InternalAlgae.g:852:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime' )
            // InternalAlgae.g:853:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime'
            {
            // InternalAlgae.g:853:3: ()
            // InternalAlgae.g:854:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealTimeDurationAccess().getRealTimeDurationAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:860:3: ( (lv_post_1_0= 'post' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAlgae.g:861:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:861:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:862:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,16,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getRealTimeDurationAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRealTimeDurationRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:874:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalAlgae.g:875:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalAlgae.g:875:4: (lv_targetClass_2_0= ruleEString )
            // InternalAlgae.g:876:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRealTimeDurationAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRealTimeDurationRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:893:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAlgae.g:894:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRealTimeDurationAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalAlgae.g:898:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalAlgae.g:899:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalAlgae.g:899:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalAlgae.g:900:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRealTimeDurationAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRealTimeDurationRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRealTimeDurationAccess().getAbsoluteTimeKeyword_4());
            		

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
    // $ANTLR end "ruleRealTimeDuration"


    // $ANTLR start "entryRuleMeasureUnboundSumOperation"
    // InternalAlgae.g:926:1: entryRuleMeasureUnboundSumOperation returns [EObject current=null] : iv_ruleMeasureUnboundSumOperation= ruleMeasureUnboundSumOperation EOF ;
    public final EObject entryRuleMeasureUnboundSumOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureUnboundSumOperation = null;


        try {
            // InternalAlgae.g:926:67: (iv_ruleMeasureUnboundSumOperation= ruleMeasureUnboundSumOperation EOF )
            // InternalAlgae.g:927:2: iv_ruleMeasureUnboundSumOperation= ruleMeasureUnboundSumOperation EOF
            {
             newCompositeNode(grammarAccess.getMeasureUnboundSumOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureUnboundSumOperation=ruleMeasureUnboundSumOperation();

            state._fsp--;

             current =iv_ruleMeasureUnboundSumOperation; 
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
    // $ANTLR end "entryRuleMeasureUnboundSumOperation"


    // $ANTLR start "ruleMeasureUnboundSumOperation"
    // InternalAlgae.g:933:1: ruleMeasureUnboundSumOperation returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '+' ( ( ruleEString ) ) )+ ) ;
    public final EObject ruleMeasureUnboundSumOperation() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        AntlrDatatypeRuleToken lv_subname_6_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:939:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '+' ( ( ruleEString ) ) )+ ) )
            // InternalAlgae.g:940:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '+' ( ( ruleEString ) ) )+ )
            {
            // InternalAlgae.g:940:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '+' ( ( ruleEString ) ) )+ )
            // InternalAlgae.g:941:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '+' ( ( ruleEString ) ) )+
            {
            // InternalAlgae.g:941:3: ()
            // InternalAlgae.g:942:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureUnboundSumOperationAccess().getMeasureUnboundSumOperationAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:948:3: ( (lv_post_1_0= 'post' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAlgae.g:949:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:949:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:950:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,16,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureUnboundSumOperationAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureUnboundSumOperationRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:962:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalAlgae.g:963:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalAlgae.g:963:4: (lv_targetClass_2_0= ruleEString )
            // InternalAlgae.g:964:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureUnboundSumOperationAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureUnboundSumOperationRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:981:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAlgae.g:982:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureUnboundSumOperationAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalAlgae.g:986:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalAlgae.g:987:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalAlgae.g:987:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalAlgae.g:988:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundSumOperationAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundSumOperationRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureUnboundSumOperationAccess().getFullStopKeyword_4());
            		
            // InternalAlgae.g:1010:3: ( (lv_subname_6_0= ruleEString ) )
            // InternalAlgae.g:1011:4: (lv_subname_6_0= ruleEString )
            {
            // InternalAlgae.g:1011:4: (lv_subname_6_0= ruleEString )
            // InternalAlgae.g:1012:5: lv_subname_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureUnboundSumOperationAccess().getSubnameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_subname_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureUnboundSumOperationRule());
            					}
            					set(
            						current,
            						"subname",
            						lv_subname_6_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureUnboundSumOperationAccess().getEqualsSignKeyword_6());
            		
            // InternalAlgae.g:1033:3: ( ( ruleEString ) )
            // InternalAlgae.g:1034:4: ( ruleEString )
            {
            // InternalAlgae.g:1034:4: ( ruleEString )
            // InternalAlgae.g:1035:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureUnboundSumOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureUnboundSumOperationAccess().getMeasuresMeasureCrossReference_7_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1049:3: (otherlv_9= '+' ( ( ruleEString ) ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAlgae.g:1050:4: otherlv_9= '+' ( ( ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_9, grammarAccess.getMeasureUnboundSumOperationAccess().getPlusSignKeyword_8_0());
            	    			
            	    // InternalAlgae.g:1054:4: ( ( ruleEString ) )
            	    // InternalAlgae.g:1055:5: ( ruleEString )
            	    {
            	    // InternalAlgae.g:1055:5: ( ruleEString )
            	    // InternalAlgae.g:1056:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMeasureUnboundSumOperationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMeasureUnboundSumOperationAccess().getMeasuresMeasureCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    // $ANTLR end "ruleMeasureUnboundSumOperation"


    // $ANTLR start "entryRuleMeasureUnboundSubstractOperation"
    // InternalAlgae.g:1075:1: entryRuleMeasureUnboundSubstractOperation returns [EObject current=null] : iv_ruleMeasureUnboundSubstractOperation= ruleMeasureUnboundSubstractOperation EOF ;
    public final EObject entryRuleMeasureUnboundSubstractOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureUnboundSubstractOperation = null;


        try {
            // InternalAlgae.g:1075:73: (iv_ruleMeasureUnboundSubstractOperation= ruleMeasureUnboundSubstractOperation EOF )
            // InternalAlgae.g:1076:2: iv_ruleMeasureUnboundSubstractOperation= ruleMeasureUnboundSubstractOperation EOF
            {
             newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureUnboundSubstractOperation=ruleMeasureUnboundSubstractOperation();

            state._fsp--;

             current =iv_ruleMeasureUnboundSubstractOperation; 
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
    // $ANTLR end "entryRuleMeasureUnboundSubstractOperation"


    // $ANTLR start "ruleMeasureUnboundSubstractOperation"
    // InternalAlgae.g:1082:1: ruleMeasureUnboundSubstractOperation returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '-' ( ( ruleEString ) ) )+ ) ;
    public final EObject ruleMeasureUnboundSubstractOperation() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        AntlrDatatypeRuleToken lv_subname_6_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:1088:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '-' ( ( ruleEString ) ) )+ ) )
            // InternalAlgae.g:1089:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '-' ( ( ruleEString ) ) )+ )
            {
            // InternalAlgae.g:1089:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '-' ( ( ruleEString ) ) )+ )
            // InternalAlgae.g:1090:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '-' ( ( ruleEString ) ) )+
            {
            // InternalAlgae.g:1090:3: ()
            // InternalAlgae.g:1091:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureUnboundSubstractOperationAccess().getMeasureUnboundSubstractOperationAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:1097:3: ( (lv_post_1_0= 'post' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAlgae.g:1098:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:1098:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:1099:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,16,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureUnboundSubstractOperationAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureUnboundSubstractOperationRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:1111:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalAlgae.g:1112:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalAlgae.g:1112:4: (lv_targetClass_2_0= ruleEString )
            // InternalAlgae.g:1113:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureUnboundSubstractOperationRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1130:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAlgae.g:1131:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureUnboundSubstractOperationAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalAlgae.g:1135:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalAlgae.g:1136:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalAlgae.g:1136:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalAlgae.g:1137:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundSubstractOperationRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureUnboundSubstractOperationAccess().getFullStopKeyword_4());
            		
            // InternalAlgae.g:1159:3: ( (lv_subname_6_0= ruleEString ) )
            // InternalAlgae.g:1160:4: (lv_subname_6_0= ruleEString )
            {
            // InternalAlgae.g:1160:4: (lv_subname_6_0= ruleEString )
            // InternalAlgae.g:1161:5: lv_subname_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationAccess().getSubnameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_subname_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureUnboundSubstractOperationRule());
            					}
            					set(
            						current,
            						"subname",
            						lv_subname_6_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureUnboundSubstractOperationAccess().getEqualsSignKeyword_6());
            		
            // InternalAlgae.g:1182:3: ( ( ruleEString ) )
            // InternalAlgae.g:1183:4: ( ruleEString )
            {
            // InternalAlgae.g:1183:4: ( ruleEString )
            // InternalAlgae.g:1184:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureUnboundSubstractOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationAccess().getMeasuresMeasureCrossReference_7_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1198:3: (otherlv_9= '-' ( ( ruleEString ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAlgae.g:1199:4: otherlv_9= '-' ( ( ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,23,FOLLOW_3); 

            	    				newLeafNode(otherlv_9, grammarAccess.getMeasureUnboundSubstractOperationAccess().getHyphenMinusKeyword_8_0());
            	    			
            	    // InternalAlgae.g:1203:4: ( ( ruleEString ) )
            	    // InternalAlgae.g:1204:5: ( ruleEString )
            	    {
            	    // InternalAlgae.g:1204:5: ( ruleEString )
            	    // InternalAlgae.g:1205:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMeasureUnboundSubstractOperationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationAccess().getMeasuresMeasureCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // $ANTLR end "ruleMeasureUnboundSubstractOperation"


    // $ANTLR start "entryRuleMeasureUnboundProductOperation"
    // InternalAlgae.g:1224:1: entryRuleMeasureUnboundProductOperation returns [EObject current=null] : iv_ruleMeasureUnboundProductOperation= ruleMeasureUnboundProductOperation EOF ;
    public final EObject entryRuleMeasureUnboundProductOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureUnboundProductOperation = null;


        try {
            // InternalAlgae.g:1224:71: (iv_ruleMeasureUnboundProductOperation= ruleMeasureUnboundProductOperation EOF )
            // InternalAlgae.g:1225:2: iv_ruleMeasureUnboundProductOperation= ruleMeasureUnboundProductOperation EOF
            {
             newCompositeNode(grammarAccess.getMeasureUnboundProductOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureUnboundProductOperation=ruleMeasureUnboundProductOperation();

            state._fsp--;

             current =iv_ruleMeasureUnboundProductOperation; 
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
    // $ANTLR end "entryRuleMeasureUnboundProductOperation"


    // $ANTLR start "ruleMeasureUnboundProductOperation"
    // InternalAlgae.g:1231:1: ruleMeasureUnboundProductOperation returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '*' ( ( ruleEString ) ) )+ ) ;
    public final EObject ruleMeasureUnboundProductOperation() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        AntlrDatatypeRuleToken lv_subname_6_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:1237:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '*' ( ( ruleEString ) ) )+ ) )
            // InternalAlgae.g:1238:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '*' ( ( ruleEString ) ) )+ )
            {
            // InternalAlgae.g:1238:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '*' ( ( ruleEString ) ) )+ )
            // InternalAlgae.g:1239:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '*' ( ( ruleEString ) ) )+
            {
            // InternalAlgae.g:1239:3: ()
            // InternalAlgae.g:1240:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureUnboundProductOperationAccess().getMeasureUnboundProductOperationAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:1246:3: ( (lv_post_1_0= 'post' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==16) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAlgae.g:1247:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:1247:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:1248:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,16,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureUnboundProductOperationAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureUnboundProductOperationRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:1260:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalAlgae.g:1261:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalAlgae.g:1261:4: (lv_targetClass_2_0= ruleEString )
            // InternalAlgae.g:1262:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureUnboundProductOperationRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1279:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAlgae.g:1280:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureUnboundProductOperationAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalAlgae.g:1284:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalAlgae.g:1285:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalAlgae.g:1285:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalAlgae.g:1286:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundProductOperationRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureUnboundProductOperationAccess().getFullStopKeyword_4());
            		
            // InternalAlgae.g:1308:3: ( (lv_subname_6_0= ruleEString ) )
            // InternalAlgae.g:1309:4: (lv_subname_6_0= ruleEString )
            {
            // InternalAlgae.g:1309:4: (lv_subname_6_0= ruleEString )
            // InternalAlgae.g:1310:5: lv_subname_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getSubnameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_subname_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureUnboundProductOperationRule());
            					}
            					set(
            						current,
            						"subname",
            						lv_subname_6_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureUnboundProductOperationAccess().getEqualsSignKeyword_6());
            		
            // InternalAlgae.g:1331:3: ( ( ruleEString ) )
            // InternalAlgae.g:1332:4: ( ruleEString )
            {
            // InternalAlgae.g:1332:4: ( ruleEString )
            // InternalAlgae.g:1333:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureUnboundProductOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getMeasuresMeasureCrossReference_7_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1347:3: (otherlv_9= '*' ( ( ruleEString ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==24) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAlgae.g:1348:4: otherlv_9= '*' ( ( ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_9, grammarAccess.getMeasureUnboundProductOperationAccess().getAsteriskKeyword_8_0());
            	    			
            	    // InternalAlgae.g:1352:4: ( ( ruleEString ) )
            	    // InternalAlgae.g:1353:5: ( ruleEString )
            	    {
            	    // InternalAlgae.g:1353:5: ( ruleEString )
            	    // InternalAlgae.g:1354:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMeasureUnboundProductOperationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getMeasuresMeasureCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
    // $ANTLR end "ruleMeasureUnboundProductOperation"


    // $ANTLR start "entryRuleMeasureUnboundDivisionOperation"
    // InternalAlgae.g:1373:1: entryRuleMeasureUnboundDivisionOperation returns [EObject current=null] : iv_ruleMeasureUnboundDivisionOperation= ruleMeasureUnboundDivisionOperation EOF ;
    public final EObject entryRuleMeasureUnboundDivisionOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureUnboundDivisionOperation = null;


        try {
            // InternalAlgae.g:1373:72: (iv_ruleMeasureUnboundDivisionOperation= ruleMeasureUnboundDivisionOperation EOF )
            // InternalAlgae.g:1374:2: iv_ruleMeasureUnboundDivisionOperation= ruleMeasureUnboundDivisionOperation EOF
            {
             newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureUnboundDivisionOperation=ruleMeasureUnboundDivisionOperation();

            state._fsp--;

             current =iv_ruleMeasureUnboundDivisionOperation; 
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
    // $ANTLR end "entryRuleMeasureUnboundDivisionOperation"


    // $ANTLR start "ruleMeasureUnboundDivisionOperation"
    // InternalAlgae.g:1380:1: ruleMeasureUnboundDivisionOperation returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '/' ( ( ruleEString ) ) )+ ) ;
    public final EObject ruleMeasureUnboundDivisionOperation() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        AntlrDatatypeRuleToken lv_subname_6_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:1386:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '/' ( ( ruleEString ) ) )+ ) )
            // InternalAlgae.g:1387:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '/' ( ( ruleEString ) ) )+ )
            {
            // InternalAlgae.g:1387:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '/' ( ( ruleEString ) ) )+ )
            // InternalAlgae.g:1388:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) (otherlv_9= '/' ( ( ruleEString ) ) )+
            {
            // InternalAlgae.g:1388:3: ()
            // InternalAlgae.g:1389:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureUnboundDivisionOperationAccess().getMeasureUnboundDivisionOperationAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:1395:3: ( (lv_post_1_0= 'post' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAlgae.g:1396:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:1396:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:1397:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,16,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureUnboundDivisionOperationAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureUnboundDivisionOperationRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:1409:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalAlgae.g:1410:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalAlgae.g:1410:4: (lv_targetClass_2_0= ruleEString )
            // InternalAlgae.g:1411:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureUnboundDivisionOperationRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1428:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==17) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAlgae.g:1429:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureUnboundDivisionOperationAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalAlgae.g:1433:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalAlgae.g:1434:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalAlgae.g:1434:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalAlgae.g:1435:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundDivisionOperationRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureUnboundDivisionOperationAccess().getFullStopKeyword_4());
            		
            // InternalAlgae.g:1457:3: ( (lv_subname_6_0= ruleEString ) )
            // InternalAlgae.g:1458:4: (lv_subname_6_0= ruleEString )
            {
            // InternalAlgae.g:1458:4: (lv_subname_6_0= ruleEString )
            // InternalAlgae.g:1459:5: lv_subname_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationAccess().getSubnameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_subname_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureUnboundDivisionOperationRule());
            					}
            					set(
            						current,
            						"subname",
            						lv_subname_6_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureUnboundDivisionOperationAccess().getEqualsSignKeyword_6());
            		
            // InternalAlgae.g:1480:3: ( ( ruleEString ) )
            // InternalAlgae.g:1481:4: ( ruleEString )
            {
            // InternalAlgae.g:1481:4: ( ruleEString )
            // InternalAlgae.g:1482:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureUnboundDivisionOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationAccess().getMeasuresMeasureCrossReference_7_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1496:3: (otherlv_9= '/' ( ( ruleEString ) ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==25) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAlgae.g:1497:4: otherlv_9= '/' ( ( ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,25,FOLLOW_3); 

            	    				newLeafNode(otherlv_9, grammarAccess.getMeasureUnboundDivisionOperationAccess().getSolidusKeyword_8_0());
            	    			
            	    // InternalAlgae.g:1501:4: ( ( ruleEString ) )
            	    // InternalAlgae.g:1502:5: ( ruleEString )
            	    {
            	    // InternalAlgae.g:1502:5: ( ruleEString )
            	    // InternalAlgae.g:1503:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMeasureUnboundDivisionOperationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationAccess().getMeasuresMeasureCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
    // $ANTLR end "ruleMeasureUnboundDivisionOperation"


    // $ANTLR start "entryRuleExponentialMeasure"
    // InternalAlgae.g:1522:1: entryRuleExponentialMeasure returns [EObject current=null] : iv_ruleExponentialMeasure= ruleExponentialMeasure EOF ;
    public final EObject entryRuleExponentialMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialMeasure = null;


        try {
            // InternalAlgae.g:1522:59: (iv_ruleExponentialMeasure= ruleExponentialMeasure EOF )
            // InternalAlgae.g:1523:2: iv_ruleExponentialMeasure= ruleExponentialMeasure EOF
            {
             newCompositeNode(grammarAccess.getExponentialMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExponentialMeasure=ruleExponentialMeasure();

            state._fsp--;

             current =iv_ruleExponentialMeasure; 
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
    // $ANTLR end "entryRuleExponentialMeasure"


    // $ANTLR start "ruleExponentialMeasure"
    // InternalAlgae.g:1529:1: ruleExponentialMeasure returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'exp' ( ( ruleEString ) ) ) ;
    public final EObject ruleExponentialMeasure() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        AntlrDatatypeRuleToken lv_subname_6_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:1535:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'exp' ( ( ruleEString ) ) ) )
            // InternalAlgae.g:1536:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'exp' ( ( ruleEString ) ) )
            {
            // InternalAlgae.g:1536:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'exp' ( ( ruleEString ) ) )
            // InternalAlgae.g:1537:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'exp' ( ( ruleEString ) )
            {
            // InternalAlgae.g:1537:3: ()
            // InternalAlgae.g:1538:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExponentialMeasureAccess().getExponentialMeasureAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:1544:3: ( (lv_post_1_0= 'post' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==16) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAlgae.g:1545:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:1545:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:1546:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,16,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getExponentialMeasureAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExponentialMeasureRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:1558:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalAlgae.g:1559:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalAlgae.g:1559:4: (lv_targetClass_2_0= ruleEString )
            // InternalAlgae.g:1560:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExponentialMeasureAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExponentialMeasureRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1577:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==17) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAlgae.g:1578:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getExponentialMeasureAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalAlgae.g:1582:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalAlgae.g:1583:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalAlgae.g:1583:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalAlgae.g:1584:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExponentialMeasureAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExponentialMeasureRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getExponentialMeasureAccess().getFullStopKeyword_4());
            		
            // InternalAlgae.g:1606:3: ( (lv_subname_6_0= ruleEString ) )
            // InternalAlgae.g:1607:4: (lv_subname_6_0= ruleEString )
            {
            // InternalAlgae.g:1607:4: (lv_subname_6_0= ruleEString )
            // InternalAlgae.g:1608:5: lv_subname_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExponentialMeasureAccess().getSubnameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_subname_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExponentialMeasureRule());
            					}
            					set(
            						current,
            						"subname",
            						lv_subname_6_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getExponentialMeasureAccess().getEqualsSignKeyword_6());
            		
            otherlv_8=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getExponentialMeasureAccess().getExpKeyword_7());
            		
            // InternalAlgae.g:1633:3: ( ( ruleEString ) )
            // InternalAlgae.g:1634:4: ( ruleEString )
            {
            // InternalAlgae.g:1634:4: ( ruleEString )
            // InternalAlgae.g:1635:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExponentialMeasureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExponentialMeasureAccess().getXMeasureCrossReference_8_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleExponentialMeasure"


    // $ANTLR start "entryRuleLogisticMeasure"
    // InternalAlgae.g:1653:1: entryRuleLogisticMeasure returns [EObject current=null] : iv_ruleLogisticMeasure= ruleLogisticMeasure EOF ;
    public final EObject entryRuleLogisticMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogisticMeasure = null;


        try {
            // InternalAlgae.g:1653:56: (iv_ruleLogisticMeasure= ruleLogisticMeasure EOF )
            // InternalAlgae.g:1654:2: iv_ruleLogisticMeasure= ruleLogisticMeasure EOF
            {
             newCompositeNode(grammarAccess.getLogisticMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogisticMeasure=ruleLogisticMeasure();

            state._fsp--;

             current =iv_ruleLogisticMeasure; 
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
    // $ANTLR end "entryRuleLogisticMeasure"


    // $ANTLR start "ruleLogisticMeasure"
    // InternalAlgae.g:1660:1: ruleLogisticMeasure returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'logistic' ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleLogisticMeasure() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        AntlrDatatypeRuleToken lv_subname_6_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:1666:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'logistic' ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ) )
            // InternalAlgae.g:1667:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'logistic' ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) )
            {
            // InternalAlgae.g:1667:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'logistic' ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) )
            // InternalAlgae.g:1668:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'logistic' ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) )
            {
            // InternalAlgae.g:1668:3: ()
            // InternalAlgae.g:1669:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogisticMeasureAccess().getLogisticMeasureAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:1675:3: ( (lv_post_1_0= 'post' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==16) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAlgae.g:1676:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:1676:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:1677:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,16,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getLogisticMeasureAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogisticMeasureRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:1689:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalAlgae.g:1690:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalAlgae.g:1690:4: (lv_targetClass_2_0= ruleEString )
            // InternalAlgae.g:1691:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLogisticMeasureAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogisticMeasureRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1708:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==17) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAlgae.g:1709:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogisticMeasureAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalAlgae.g:1713:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalAlgae.g:1714:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalAlgae.g:1714:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalAlgae.g:1715:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLogisticMeasureAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogisticMeasureRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getLogisticMeasureAccess().getFullStopKeyword_4());
            		
            // InternalAlgae.g:1737:3: ( (lv_subname_6_0= ruleEString ) )
            // InternalAlgae.g:1738:4: (lv_subname_6_0= ruleEString )
            {
            // InternalAlgae.g:1738:4: (lv_subname_6_0= ruleEString )
            // InternalAlgae.g:1739:5: lv_subname_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLogisticMeasureAccess().getSubnameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_subname_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogisticMeasureRule());
            					}
            					set(
            						current,
            						"subname",
            						lv_subname_6_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getLogisticMeasureAccess().getEqualsSignKeyword_6());
            		
            otherlv_8=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getLogisticMeasureAccess().getLogisticKeyword_7());
            		
            // InternalAlgae.g:1764:3: ( ( ruleEString ) )
            // InternalAlgae.g:1765:4: ( ruleEString )
            {
            // InternalAlgae.g:1765:4: ( ruleEString )
            // InternalAlgae.g:1766:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogisticMeasureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogisticMeasureAccess().getLMeasureCrossReference_8_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1780:3: ( ( ruleEString ) )
            // InternalAlgae.g:1781:4: ( ruleEString )
            {
            // InternalAlgae.g:1781:4: ( ruleEString )
            // InternalAlgae.g:1782:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogisticMeasureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogisticMeasureAccess().getKMeasureCrossReference_9_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1796:3: ( ( ruleEString ) )
            // InternalAlgae.g:1797:4: ( ruleEString )
            {
            // InternalAlgae.g:1797:4: ( ruleEString )
            // InternalAlgae.g:1798:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogisticMeasureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogisticMeasureAccess().getX0MeasureCrossReference_10_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1812:3: ( ( ruleEString ) )
            // InternalAlgae.g:1813:4: ( ruleEString )
            {
            // InternalAlgae.g:1813:4: ( ruleEString )
            // InternalAlgae.g:1814:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogisticMeasureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLogisticMeasureAccess().getXMeasureCrossReference_11_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleLogisticMeasure"


    // $ANTLR start "entryRuleIntegrationMeasure"
    // InternalAlgae.g:1832:1: entryRuleIntegrationMeasure returns [EObject current=null] : iv_ruleIntegrationMeasure= ruleIntegrationMeasure EOF ;
    public final EObject entryRuleIntegrationMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegrationMeasure = null;


        try {
            // InternalAlgae.g:1832:59: (iv_ruleIntegrationMeasure= ruleIntegrationMeasure EOF )
            // InternalAlgae.g:1833:2: iv_ruleIntegrationMeasure= ruleIntegrationMeasure EOF
            {
             newCompositeNode(grammarAccess.getIntegrationMeasureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegrationMeasure=ruleIntegrationMeasure();

            state._fsp--;

             current =iv_ruleIntegrationMeasure; 
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
    // $ANTLR end "entryRuleIntegrationMeasure"


    // $ANTLR start "ruleIntegrationMeasure"
    // InternalAlgae.g:1839:1: ruleIntegrationMeasure returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'integral' ( ( ruleEString ) ) otherlv_10= '[' ( ( ruleEString ) ) otherlv_12= ';' ( ( ruleEString ) ) otherlv_14= ']' ) ;
    public final EObject ruleIntegrationMeasure() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        AntlrDatatypeRuleToken lv_subname_6_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:1845:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'integral' ( ( ruleEString ) ) otherlv_10= '[' ( ( ruleEString ) ) otherlv_12= ';' ( ( ruleEString ) ) otherlv_14= ']' ) )
            // InternalAlgae.g:1846:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'integral' ( ( ruleEString ) ) otherlv_10= '[' ( ( ruleEString ) ) otherlv_12= ';' ( ( ruleEString ) ) otherlv_14= ']' )
            {
            // InternalAlgae.g:1846:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'integral' ( ( ruleEString ) ) otherlv_10= '[' ( ( ruleEString ) ) otherlv_12= ';' ( ( ruleEString ) ) otherlv_14= ']' )
            // InternalAlgae.g:1847:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' otherlv_8= 'integral' ( ( ruleEString ) ) otherlv_10= '[' ( ( ruleEString ) ) otherlv_12= ';' ( ( ruleEString ) ) otherlv_14= ']'
            {
            // InternalAlgae.g:1847:3: ()
            // InternalAlgae.g:1848:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegrationMeasureAccess().getIntegrationMeasureAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:1854:3: ( (lv_post_1_0= 'post' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==16) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAlgae.g:1855:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:1855:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:1856:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,16,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getIntegrationMeasureAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIntegrationMeasureRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:1868:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalAlgae.g:1869:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalAlgae.g:1869:4: (lv_targetClass_2_0= ruleEString )
            // InternalAlgae.g:1870:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntegrationMeasureAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegrationMeasureRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1887:3: (otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==17) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAlgae.g:1888:4: otherlv_3= '#' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntegrationMeasureAccess().getNumberSignKeyword_3_0());
                    			
                    // InternalAlgae.g:1892:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalAlgae.g:1893:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalAlgae.g:1893:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalAlgae.g:1894:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIntegrationMeasureAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegrationMeasureRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_4_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getIntegrationMeasureAccess().getFullStopKeyword_4());
            		
            // InternalAlgae.g:1916:3: ( (lv_subname_6_0= ruleEString ) )
            // InternalAlgae.g:1917:4: (lv_subname_6_0= ruleEString )
            {
            // InternalAlgae.g:1917:4: (lv_subname_6_0= ruleEString )
            // InternalAlgae.g:1918:5: lv_subname_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntegrationMeasureAccess().getSubnameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_subname_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegrationMeasureRule());
            					}
            					set(
            						current,
            						"subname",
            						lv_subname_6_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getIntegrationMeasureAccess().getEqualsSignKeyword_6());
            		
            otherlv_8=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getIntegrationMeasureAccess().getIntegralKeyword_7());
            		
            // InternalAlgae.g:1943:3: ( ( ruleEString ) )
            // InternalAlgae.g:1944:4: ( ruleEString )
            {
            // InternalAlgae.g:1944:4: ( ruleEString )
            // InternalAlgae.g:1945:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegrationMeasureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIntegrationMeasureAccess().getFunctionCompositeMeasureCrossReference_8_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getIntegrationMeasureAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalAlgae.g:1963:3: ( ( ruleEString ) )
            // InternalAlgae.g:1964:4: ( ruleEString )
            {
            // InternalAlgae.g:1964:4: ( ruleEString )
            // InternalAlgae.g:1965:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegrationMeasureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIntegrationMeasureAccess().getLeftBoundMeasureCrossReference_10_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getIntegrationMeasureAccess().getSemicolonKeyword_11());
            		
            // InternalAlgae.g:1983:3: ( ( ruleEString ) )
            // InternalAlgae.g:1984:4: ( ruleEString )
            {
            // InternalAlgae.g:1984:4: ( ruleEString )
            // InternalAlgae.g:1985:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegrationMeasureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIntegrationMeasureAccess().getRightBoundMeasureCrossReference_12_0());
            				
            pushFollow(FOLLOW_29);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getIntegrationMeasureAccess().getRightSquareBracketKeyword_13());
            		

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
    // $ANTLR end "ruleIntegrationMeasure"


    // $ANTLR start "entryRuleNormalDistribution"
    // InternalAlgae.g:2007:1: entryRuleNormalDistribution returns [EObject current=null] : iv_ruleNormalDistribution= ruleNormalDistribution EOF ;
    public final EObject entryRuleNormalDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalDistribution = null;


        try {
            // InternalAlgae.g:2007:59: (iv_ruleNormalDistribution= ruleNormalDistribution EOF )
            // InternalAlgae.g:2008:2: iv_ruleNormalDistribution= ruleNormalDistribution EOF
            {
             newCompositeNode(grammarAccess.getNormalDistributionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNormalDistribution=ruleNormalDistribution();

            state._fsp--;

             current =iv_ruleNormalDistribution; 
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
    // $ANTLR end "entryRuleNormalDistribution"


    // $ANTLR start "ruleNormalDistribution"
    // InternalAlgae.g:2014:1: ruleNormalDistribution returns [EObject current=null] : ( () otherlv_1= 'NormalDistribution' ) ;
    public final EObject ruleNormalDistribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlgae.g:2020:2: ( ( () otherlv_1= 'NormalDistribution' ) )
            // InternalAlgae.g:2021:2: ( () otherlv_1= 'NormalDistribution' )
            {
            // InternalAlgae.g:2021:2: ( () otherlv_1= 'NormalDistribution' )
            // InternalAlgae.g:2022:3: () otherlv_1= 'NormalDistribution'
            {
            // InternalAlgae.g:2022:3: ()
            // InternalAlgae.g:2023:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNormalDistributionAccess().getNormalDistributionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNormalDistributionAccess().getNormalDistributionKeyword_1());
            		

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
    // $ANTLR end "ruleNormalDistribution"


    // $ANTLR start "entryRuleInterval"
    // InternalAlgae.g:2037:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalAlgae.g:2037:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalAlgae.g:2038:2: iv_ruleInterval= ruleInterval EOF
            {
             newCompositeNode(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterval=ruleInterval();

            state._fsp--;

             current =iv_ruleInterval; 
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
    // $ANTLR end "entryRuleInterval"


    // $ANTLR start "ruleInterval"
    // InternalAlgae.g:2044:1: ruleInterval returns [EObject current=null] : (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' ) ;
    public final EObject ruleInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lowerEndpoint_3_0 = null;

        EObject lv_upperEndpoint_5_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:2050:2: ( (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' ) )
            // InternalAlgae.g:2051:2: (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' )
            {
            // InternalAlgae.g:2051:2: (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' )
            // InternalAlgae.g:2052:3: otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIntervalAccess().getIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getIntervalAccess().getLowerEndpointKeyword_2());
            		
            // InternalAlgae.g:2064:3: ( (lv_lowerEndpoint_3_0= ruleMeasure ) )
            // InternalAlgae.g:2065:4: (lv_lowerEndpoint_3_0= ruleMeasure )
            {
            // InternalAlgae.g:2065:4: (lv_lowerEndpoint_3_0= ruleMeasure )
            // InternalAlgae.g:2066:5: lv_lowerEndpoint_3_0= ruleMeasure
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getLowerEndpointMeasureParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_lowerEndpoint_3_0=ruleMeasure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntervalRule());
            					}
            					set(
            						current,
            						"lowerEndpoint",
            						lv_lowerEndpoint_3_0,
            						"org.atlanmod.analysis.Algae.Measure");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getIntervalAccess().getUpperEndpointKeyword_4());
            		
            // InternalAlgae.g:2087:3: ( (lv_upperEndpoint_5_0= ruleMeasure ) )
            // InternalAlgae.g:2088:4: (lv_upperEndpoint_5_0= ruleMeasure )
            {
            // InternalAlgae.g:2088:4: (lv_upperEndpoint_5_0= ruleMeasure )
            // InternalAlgae.g:2089:5: lv_upperEndpoint_5_0= ruleMeasure
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getUpperEndpointMeasureParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_32);
            lv_upperEndpoint_5_0=ruleMeasure();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntervalRule());
            					}
            					set(
            						current,
            						"upperEndpoint",
            						lv_upperEndpoint_5_0,
            						"org.atlanmod.analysis.Algae.Measure");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getIntervalAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleSampling"
    // InternalAlgae.g:2114:1: entryRuleSampling returns [EObject current=null] : iv_ruleSampling= ruleSampling EOF ;
    public final EObject entryRuleSampling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampling = null;


        try {
            // InternalAlgae.g:2114:49: (iv_ruleSampling= ruleSampling EOF )
            // InternalAlgae.g:2115:2: iv_ruleSampling= ruleSampling EOF
            {
             newCompositeNode(grammarAccess.getSamplingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSampling=ruleSampling();

            state._fsp--;

             current =iv_ruleSampling; 
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
    // $ANTLR end "entryRuleSampling"


    // $ANTLR start "ruleSampling"
    // InternalAlgae.g:2121:1: ruleSampling returns [EObject current=null] : ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleSampling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_measurementProcedure_4_0 = null;

        EObject lv_samples_7_0 = null;

        EObject lv_samples_9_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:2127:2: ( ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalAlgae.g:2128:2: ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalAlgae.g:2128:2: ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalAlgae.g:2129:3: () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalAlgae.g:2129:3: ()
            // InternalAlgae.g:2130:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSamplingAccess().getSamplingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSamplingAccess().getSamplingKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getSamplingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlgae.g:2144:3: (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAlgae.g:2145:4: otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSamplingAccess().getMeasurementProcedureKeyword_3_0());
                    			
                    // InternalAlgae.g:2149:4: ( (lv_measurementProcedure_4_0= ruleEString ) )
                    // InternalAlgae.g:2150:5: (lv_measurementProcedure_4_0= ruleEString )
                    {
                    // InternalAlgae.g:2150:5: (lv_measurementProcedure_4_0= ruleEString )
                    // InternalAlgae.g:2151:6: lv_measurementProcedure_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSamplingAccess().getMeasurementProcedureEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_measurementProcedure_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSamplingRule());
                    						}
                    						set(
                    							current,
                    							"measurementProcedure",
                    							lv_measurementProcedure_4_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:2169:3: (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==38) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAlgae.g:2170:4: otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getSamplingAccess().getSamplesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_6, grammarAccess.getSamplingAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalAlgae.g:2178:4: ( (lv_samples_7_0= ruleSample ) )
                    // InternalAlgae.g:2179:5: (lv_samples_7_0= ruleSample )
                    {
                    // InternalAlgae.g:2179:5: (lv_samples_7_0= ruleSample )
                    // InternalAlgae.g:2180:6: lv_samples_7_0= ruleSample
                    {

                    						newCompositeNode(grammarAccess.getSamplingAccess().getSamplesSampleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_samples_7_0=ruleSample();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSamplingRule());
                    						}
                    						add(
                    							current,
                    							"samples",
                    							lv_samples_7_0,
                    							"org.atlanmod.analysis.Algae.Sample");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:2197:4: (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==13) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalAlgae.g:2198:5: otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_35); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSamplingAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalAlgae.g:2202:5: ( (lv_samples_9_0= ruleSample ) )
                    	    // InternalAlgae.g:2203:6: (lv_samples_9_0= ruleSample )
                    	    {
                    	    // InternalAlgae.g:2203:6: (lv_samples_9_0= ruleSample )
                    	    // InternalAlgae.g:2204:7: lv_samples_9_0= ruleSample
                    	    {

                    	    							newCompositeNode(grammarAccess.getSamplingAccess().getSamplesSampleParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_samples_9_0=ruleSample();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSamplingRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"samples",
                    	    								lv_samples_9_0,
                    	    								"org.atlanmod.analysis.Algae.Sample");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,14,FOLLOW_32); 

                    				newLeafNode(otherlv_10, grammarAccess.getSamplingAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSamplingAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSampling"


    // $ANTLR start "entryRuleIntegral"
    // InternalAlgae.g:2235:1: entryRuleIntegral returns [EObject current=null] : iv_ruleIntegral= ruleIntegral EOF ;
    public final EObject entryRuleIntegral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegral = null;


        try {
            // InternalAlgae.g:2235:49: (iv_ruleIntegral= ruleIntegral EOF )
            // InternalAlgae.g:2236:2: iv_ruleIntegral= ruleIntegral EOF
            {
             newCompositeNode(grammarAccess.getIntegralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegral=ruleIntegral();

            state._fsp--;

             current =iv_ruleIntegral; 
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
    // $ANTLR end "entryRuleIntegral"


    // $ANTLR start "ruleIntegral"
    // InternalAlgae.g:2242:1: ruleIntegral returns [EObject current=null] : (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleIntegral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_function_3_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:2248:2: ( (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalAlgae.g:2249:2: (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalAlgae.g:2249:2: (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalAlgae.g:2250:3: otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIntegralAccess().getIntegralKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegralAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlgae.g:2258:3: (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAlgae.g:2259:4: otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getIntegralAccess().getFunctionKeyword_2_0());
                    			
                    // InternalAlgae.g:2263:4: ( (lv_function_3_0= ruleEString ) )
                    // InternalAlgae.g:2264:5: (lv_function_3_0= ruleEString )
                    {
                    // InternalAlgae.g:2264:5: (lv_function_3_0= ruleEString )
                    // InternalAlgae.g:2265:6: lv_function_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIntegralAccess().getFunctionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_function_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegralRule());
                    						}
                    						set(
                    							current,
                    							"function",
                    							lv_function_3_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getIntegralAccess().getIntervalKeyword_3());
            		
            // InternalAlgae.g:2287:3: ( ( ruleEString ) )
            // InternalAlgae.g:2288:4: ( ruleEString )
            {
            // InternalAlgae.g:2288:4: ( ruleEString )
            // InternalAlgae.g:2289:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegralRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIntegralAccess().getIntervalIntervalCrossReference_4_0());
            				
            pushFollow(FOLLOW_32);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getIntegralAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleIntegral"


    // $ANTLR start "entryRuleSample"
    // InternalAlgae.g:2311:1: entryRuleSample returns [EObject current=null] : iv_ruleSample= ruleSample EOF ;
    public final EObject entryRuleSample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSample = null;


        try {
            // InternalAlgae.g:2311:47: (iv_ruleSample= ruleSample EOF )
            // InternalAlgae.g:2312:2: iv_ruleSample= ruleSample EOF
            {
             newCompositeNode(grammarAccess.getSampleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSample=ruleSample();

            state._fsp--;

             current =iv_ruleSample; 
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
    // $ANTLR end "entryRuleSample"


    // $ANTLR start "ruleSample"
    // InternalAlgae.g:2318:1: ruleSample returns [EObject current=null] : ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleSample() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_quantity_5_0 = null;

        EObject lv_quantity_7_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:2324:2: ( ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalAlgae.g:2325:2: ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalAlgae.g:2325:2: ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalAlgae.g:2326:3: () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalAlgae.g:2326:3: ()
            // InternalAlgae.g:2327:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSampleAccess().getSampleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSampleAccess().getSampleKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getSampleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlgae.g:2341:3: (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==43) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAlgae.g:2342:4: otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSampleAccess().getQuantityKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSampleAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalAlgae.g:2350:4: ( (lv_quantity_5_0= ruleMeasure ) )
                    // InternalAlgae.g:2351:5: (lv_quantity_5_0= ruleMeasure )
                    {
                    // InternalAlgae.g:2351:5: (lv_quantity_5_0= ruleMeasure )
                    // InternalAlgae.g:2352:6: lv_quantity_5_0= ruleMeasure
                    {

                    						newCompositeNode(grammarAccess.getSampleAccess().getQuantityMeasureParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_quantity_5_0=ruleMeasure();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSampleRule());
                    						}
                    						add(
                    							current,
                    							"quantity",
                    							lv_quantity_5_0,
                    							"org.atlanmod.analysis.Algae.Measure");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:2369:4: (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==13) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalAlgae.g:2370:5: otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSampleAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalAlgae.g:2374:5: ( (lv_quantity_7_0= ruleMeasure ) )
                    	    // InternalAlgae.g:2375:6: (lv_quantity_7_0= ruleMeasure )
                    	    {
                    	    // InternalAlgae.g:2375:6: (lv_quantity_7_0= ruleMeasure )
                    	    // InternalAlgae.g:2376:7: lv_quantity_7_0= ruleMeasure
                    	    {

                    	    							newCompositeNode(grammarAccess.getSampleAccess().getQuantityMeasureParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_quantity_7_0=ruleMeasure();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSampleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"quantity",
                    	    								lv_quantity_7_0,
                    	    								"org.atlanmod.analysis.Algae.Measure");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_32); 

                    				newLeafNode(otherlv_8, grammarAccess.getSampleAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSampleAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSample"


    // $ANTLR start "entryRuleEStructuralFeature"
    // InternalAlgae.g:2407:1: entryRuleEStructuralFeature returns [EObject current=null] : iv_ruleEStructuralFeature= ruleEStructuralFeature EOF ;
    public final EObject entryRuleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStructuralFeature = null;


        try {
            // InternalAlgae.g:2407:59: (iv_ruleEStructuralFeature= ruleEStructuralFeature EOF )
            // InternalAlgae.g:2408:2: iv_ruleEStructuralFeature= ruleEStructuralFeature EOF
            {
             newCompositeNode(grammarAccess.getEStructuralFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEStructuralFeature=ruleEStructuralFeature();

            state._fsp--;

             current =iv_ruleEStructuralFeature; 
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
    // $ANTLR end "entryRuleEStructuralFeature"


    // $ANTLR start "ruleEStructuralFeature"
    // InternalAlgae.g:2414:1: ruleEStructuralFeature returns [EObject current=null] : (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) ;
    public final EObject ruleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_EAttribute_0 = null;

        EObject this_EReference_1 = null;



        	enterRule();

        try {
            // InternalAlgae.g:2420:2: ( (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) )
            // InternalAlgae.g:2421:2: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            {
            // InternalAlgae.g:2421:2: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            int alt41=2;
            switch ( input.LA(1) ) {
            case 86:
                {
                switch ( input.LA(2) ) {
                case 87:
                    {
                    switch ( input.LA(3) ) {
                    case 88:
                        {
                        switch ( input.LA(4) ) {
                        case 89:
                            {
                            int LA41_4 = input.LA(5);

                            if ( ((LA41_4>=90 && LA41_4<=91)) ) {
                                alt41=1;
                            }
                            else if ( ((LA41_4>=94 && LA41_4<=95)) ) {
                                alt41=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 41, 4, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 94:
                        case 95:
                            {
                            alt41=2;
                            }
                            break;
                        case 90:
                        case 91:
                            {
                            alt41=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 41, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 89:
                        {
                        int LA41_4 = input.LA(4);

                        if ( ((LA41_4>=90 && LA41_4<=91)) ) {
                            alt41=1;
                        }
                        else if ( ((LA41_4>=94 && LA41_4<=95)) ) {
                            alt41=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 41, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 94:
                    case 95:
                        {
                        alt41=2;
                        }
                        break;
                    case 90:
                    case 91:
                        {
                        alt41=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 88:
                    {
                    switch ( input.LA(3) ) {
                    case 89:
                        {
                        int LA41_4 = input.LA(4);

                        if ( ((LA41_4>=90 && LA41_4<=91)) ) {
                            alt41=1;
                        }
                        else if ( ((LA41_4>=94 && LA41_4<=95)) ) {
                            alt41=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 41, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 94:
                    case 95:
                        {
                        alt41=2;
                        }
                        break;
                    case 90:
                    case 91:
                        {
                        alt41=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 89:
                    {
                    int LA41_4 = input.LA(3);

                    if ( ((LA41_4>=90 && LA41_4<=91)) ) {
                        alt41=1;
                    }
                    else if ( ((LA41_4>=94 && LA41_4<=95)) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 90:
                case 91:
                    {
                    alt41=1;
                    }
                    break;
                case 94:
                case 95:
                    {
                    alt41=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }

                }
                break;
            case 87:
                {
                switch ( input.LA(2) ) {
                case 88:
                    {
                    switch ( input.LA(3) ) {
                    case 89:
                        {
                        int LA41_4 = input.LA(4);

                        if ( ((LA41_4>=90 && LA41_4<=91)) ) {
                            alt41=1;
                        }
                        else if ( ((LA41_4>=94 && LA41_4<=95)) ) {
                            alt41=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 41, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 94:
                    case 95:
                        {
                        alt41=2;
                        }
                        break;
                    case 90:
                    case 91:
                        {
                        alt41=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 89:
                    {
                    int LA41_4 = input.LA(3);

                    if ( ((LA41_4>=90 && LA41_4<=91)) ) {
                        alt41=1;
                    }
                    else if ( ((LA41_4>=94 && LA41_4<=95)) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 94:
                case 95:
                    {
                    alt41=2;
                    }
                    break;
                case 90:
                case 91:
                    {
                    alt41=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }

                }
                break;
            case 88:
                {
                switch ( input.LA(2) ) {
                case 89:
                    {
                    int LA41_4 = input.LA(3);

                    if ( ((LA41_4>=90 && LA41_4<=91)) ) {
                        alt41=1;
                    }
                    else if ( ((LA41_4>=94 && LA41_4<=95)) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 94:
                case 95:
                    {
                    alt41=2;
                    }
                    break;
                case 90:
                case 91:
                    {
                    alt41=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 3, input);

                    throw nvae;
                }

                }
                break;
            case 89:
                {
                int LA41_4 = input.LA(2);

                if ( ((LA41_4>=90 && LA41_4<=91)) ) {
                    alt41=1;
                }
                else if ( ((LA41_4>=94 && LA41_4<=95)) ) {
                    alt41=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 4, input);

                    throw nvae;
                }
                }
                break;
            case 90:
            case 91:
                {
                alt41=1;
                }
                break;
            case 94:
            case 95:
                {
                alt41=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalAlgae.g:2422:3: this_EAttribute_0= ruleEAttribute
                    {

                    			newCompositeNode(grammarAccess.getEStructuralFeatureAccess().getEAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EAttribute_0=ruleEAttribute();

                    state._fsp--;


                    			current = this_EAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlgae.g:2431:3: this_EReference_1= ruleEReference
                    {

                    			newCompositeNode(grammarAccess.getEStructuralFeatureAccess().getEReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EReference_1=ruleEReference();

                    state._fsp--;


                    			current = this_EReference_1;
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
    // $ANTLR end "ruleEStructuralFeature"


    // $ANTLR start "entryRuleEClass"
    // InternalAlgae.g:2443:1: entryRuleEClass returns [EObject current=null] : iv_ruleEClass= ruleEClass EOF ;
    public final EObject entryRuleEClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClass = null;


        try {
            // InternalAlgae.g:2443:47: (iv_ruleEClass= ruleEClass EOF )
            // InternalAlgae.g:2444:2: iv_ruleEClass= ruleEClass EOF
            {
             newCompositeNode(grammarAccess.getEClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEClass=ruleEClass();

            state._fsp--;

             current =iv_ruleEClass; 
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
    // $ANTLR end "entryRuleEClass"


    // $ANTLR start "ruleEClass"
    // InternalAlgae.g:2450:1: ruleEClass returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
    public final EObject ruleEClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token lv_interface_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_7_0 = null;

        AntlrDatatypeRuleToken lv_instanceTypeName_9_0 = null;

        EObject lv_eAnnotations_18_0 = null;

        EObject lv_eAnnotations_20_0 = null;

        EObject lv_eTypeParameters_24_0 = null;

        EObject lv_eTypeParameters_26_0 = null;

        EObject lv_eOperations_30_0 = null;

        EObject lv_eOperations_32_0 = null;

        EObject lv_eStructuralFeatures_36_0 = null;

        EObject lv_eStructuralFeatures_38_0 = null;

        EObject lv_eGenericSuperTypes_42_0 = null;

        EObject lv_eGenericSuperTypes_44_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:2456:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalAlgae.g:2457:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalAlgae.g:2457:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalAlgae.g:2458:3: () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // InternalAlgae.g:2458:3: ()
            // InternalAlgae.g:2459:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEClassAccess().getEClassAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:2465:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAlgae.g:2466:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalAlgae.g:2466:4: (lv_abstract_1_0= 'abstract' )
                    // InternalAlgae.g:2467:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,44,FOLLOW_40); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getEClassAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:2479:3: ( (lv_interface_2_0= 'interface' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==45) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAlgae.g:2480:4: (lv_interface_2_0= 'interface' )
                    {
                    // InternalAlgae.g:2480:4: (lv_interface_2_0= 'interface' )
                    // InternalAlgae.g:2481:5: lv_interface_2_0= 'interface'
                    {
                    lv_interface_2_0=(Token)match(input,45,FOLLOW_41); 

                    					newLeafNode(lv_interface_2_0, grammarAccess.getEClassAccess().getInterfaceInterfaceKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEClassRule());
                    					}
                    					setWithLastConsumed(current, "interface", true, "interface");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getEClassAccess().getEClassKeyword_3());
            		
            // InternalAlgae.g:2497:3: ( (lv_name_4_0= ruleEString ) )
            // InternalAlgae.g:2498:4: (lv_name_4_0= ruleEString )
            {
            // InternalAlgae.g:2498:4: (lv_name_4_0= ruleEString )
            // InternalAlgae.g:2499:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEClassAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_5, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalAlgae.g:2520:3: (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==47) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAlgae.g:2521:4: otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEClassAccess().getInstanceClassNameKeyword_6_0());
                    			
                    // InternalAlgae.g:2525:4: ( (lv_instanceClassName_7_0= ruleEString ) )
                    // InternalAlgae.g:2526:5: (lv_instanceClassName_7_0= ruleEString )
                    {
                    // InternalAlgae.g:2526:5: (lv_instanceClassName_7_0= ruleEString )
                    // InternalAlgae.g:2527:6: lv_instanceClassName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getInstanceClassNameEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_instanceClassName_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						set(
                    							current,
                    							"instanceClassName",
                    							lv_instanceClassName_7_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:2545:3: (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==48) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAlgae.g:2546:4: otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getEClassAccess().getInstanceTypeNameKeyword_7_0());
                    			
                    // InternalAlgae.g:2550:4: ( (lv_instanceTypeName_9_0= ruleEString ) )
                    // InternalAlgae.g:2551:5: (lv_instanceTypeName_9_0= ruleEString )
                    {
                    // InternalAlgae.g:2551:5: (lv_instanceTypeName_9_0= ruleEString )
                    // InternalAlgae.g:2552:6: lv_instanceTypeName_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getInstanceTypeNameEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_instanceTypeName_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						set(
                    							current,
                    							"instanceTypeName",
                    							lv_instanceTypeName_9_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:2570:3: (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAlgae.g:2571:4: otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,49,FOLLOW_45); 

                    				newLeafNode(otherlv_10, grammarAccess.getEClassAccess().getESuperTypesKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getEClassAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalAlgae.g:2579:4: ( ( ruleEString ) )
                    // InternalAlgae.g:2580:5: ( ruleEString )
                    {
                    // InternalAlgae.g:2580:5: ( ruleEString )
                    // InternalAlgae.g:2581:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:2595:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==13) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalAlgae.g:2596:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEClassAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalAlgae.g:2600:5: ( ( ruleEString ) )
                    	    // InternalAlgae.g:2601:6: ( ruleEString )
                    	    {
                    	    // InternalAlgae.g:2601:6: ( ruleEString )
                    	    // InternalAlgae.g:2602:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,51,FOLLOW_47); 

                    				newLeafNode(otherlv_15, grammarAccess.getEClassAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:2622:3: (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==52) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAlgae.g:2623:4: otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEClassAccess().getEAnnotationsKeyword_9_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_17, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalAlgae.g:2631:4: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    // InternalAlgae.g:2632:5: (lv_eAnnotations_18_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:2632:5: (lv_eAnnotations_18_0= ruleEAnnotation )
                    // InternalAlgae.g:2633:6: lv_eAnnotations_18_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEAnnotationsEAnnotationParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eAnnotations_18_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_18_0,
                    							"org.atlanmod.analysis.Algae.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:2650:4: (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==13) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalAlgae.g:2651:5: otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_19=(Token)match(input,13,FOLLOW_48); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEClassAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalAlgae.g:2655:5: ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:2656:6: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:2656:6: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    // InternalAlgae.g:2657:7: lv_eAnnotations_20_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEAnnotationsEAnnotationParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eAnnotations_20_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_20_0,
                    	    								"org.atlanmod.analysis.Algae.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,14,FOLLOW_49); 

                    				newLeafNode(otherlv_21, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:2680:3: (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==53) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAlgae.g:2681:4: otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getEClassAccess().getETypeParametersKeyword_10_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_23, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalAlgae.g:2689:4: ( (lv_eTypeParameters_24_0= ruleETypeParameter ) )
                    // InternalAlgae.g:2690:5: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    {
                    // InternalAlgae.g:2690:5: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    // InternalAlgae.g:2691:6: lv_eTypeParameters_24_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getETypeParametersETypeParameterParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eTypeParameters_24_0=ruleETypeParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eTypeParameters",
                    							lv_eTypeParameters_24_0,
                    							"org.atlanmod.analysis.Algae.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:2708:4: (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==13) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalAlgae.g:2709:5: otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_25=(Token)match(input,13,FOLLOW_50); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEClassAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalAlgae.g:2713:5: ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    // InternalAlgae.g:2714:6: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    {
                    	    // InternalAlgae.g:2714:6: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    // InternalAlgae.g:2715:7: lv_eTypeParameters_26_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getETypeParametersETypeParameterParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eTypeParameters_26_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeParameters",
                    	    								lv_eTypeParameters_26_0,
                    	    								"org.atlanmod.analysis.Algae.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,14,FOLLOW_51); 

                    				newLeafNode(otherlv_27, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:2738:3: (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==54) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAlgae.g:2739:4: otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,54,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getEClassAccess().getEOperationsKeyword_11_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_52); 

                    				newLeafNode(otherlv_29, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalAlgae.g:2747:4: ( (lv_eOperations_30_0= ruleEOperation ) )
                    // InternalAlgae.g:2748:5: (lv_eOperations_30_0= ruleEOperation )
                    {
                    // InternalAlgae.g:2748:5: (lv_eOperations_30_0= ruleEOperation )
                    // InternalAlgae.g:2749:6: lv_eOperations_30_0= ruleEOperation
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEOperationsEOperationParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eOperations_30_0=ruleEOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eOperations",
                    							lv_eOperations_30_0,
                    							"org.atlanmod.analysis.Algae.EOperation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:2766:4: (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==13) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalAlgae.g:2767:5: otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    {
                    	    otherlv_31=(Token)match(input,13,FOLLOW_52); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getEClassAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalAlgae.g:2771:5: ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    // InternalAlgae.g:2772:6: (lv_eOperations_32_0= ruleEOperation )
                    	    {
                    	    // InternalAlgae.g:2772:6: (lv_eOperations_32_0= ruleEOperation )
                    	    // InternalAlgae.g:2773:7: lv_eOperations_32_0= ruleEOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEOperationsEOperationParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eOperations_32_0=ruleEOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eOperations",
                    	    								lv_eOperations_32_0,
                    	    								"org.atlanmod.analysis.Algae.EOperation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,14,FOLLOW_53); 

                    				newLeafNode(otherlv_33, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:2796:3: (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==55) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalAlgae.g:2797:4: otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,55,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getEClassAccess().getEStructuralFeaturesKeyword_12_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_54); 

                    				newLeafNode(otherlv_35, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalAlgae.g:2805:4: ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) )
                    // InternalAlgae.g:2806:5: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    {
                    // InternalAlgae.g:2806:5: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    // InternalAlgae.g:2807:6: lv_eStructuralFeatures_36_0= ruleEStructuralFeature
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEStructuralFeaturesEStructuralFeatureParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eStructuralFeatures_36_0=ruleEStructuralFeature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eStructuralFeatures",
                    							lv_eStructuralFeatures_36_0,
                    							"org.atlanmod.analysis.Algae.EStructuralFeature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:2824:4: (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==13) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalAlgae.g:2825:5: otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    {
                    	    otherlv_37=(Token)match(input,13,FOLLOW_54); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getEClassAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalAlgae.g:2829:5: ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    // InternalAlgae.g:2830:6: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    {
                    	    // InternalAlgae.g:2830:6: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    // InternalAlgae.g:2831:7: lv_eStructuralFeatures_38_0= ruleEStructuralFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEStructuralFeaturesEStructuralFeatureParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eStructuralFeatures_38_0=ruleEStructuralFeature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eStructuralFeatures",
                    	    								lv_eStructuralFeatures_38_0,
                    	    								"org.atlanmod.analysis.Algae.EStructuralFeature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,14,FOLLOW_55); 

                    				newLeafNode(otherlv_39, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:2854:3: (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==56) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalAlgae.g:2855:4: otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,56,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getEClassAccess().getEGenericSuperTypesKeyword_13_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_56); 

                    				newLeafNode(otherlv_41, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalAlgae.g:2863:4: ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) )
                    // InternalAlgae.g:2864:5: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:2864:5: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    // InternalAlgae.g:2865:6: lv_eGenericSuperTypes_42_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEGenericSuperTypesEGenericTypeParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eGenericSuperTypes_42_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEClassRule());
                    						}
                    						add(
                    							current,
                    							"eGenericSuperTypes",
                    							lv_eGenericSuperTypes_42_0,
                    							"org.atlanmod.analysis.Algae.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:2882:4: (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==13) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalAlgae.g:2883:5: otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,13,FOLLOW_56); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getEClassAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalAlgae.g:2887:5: ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    // InternalAlgae.g:2888:6: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    {
                    	    // InternalAlgae.g:2888:6: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    // InternalAlgae.g:2889:7: lv_eGenericSuperTypes_44_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEGenericSuperTypesEGenericTypeParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eGenericSuperTypes_44_0=ruleEGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eGenericSuperTypes",
                    	    								lv_eGenericSuperTypes_44_0,
                    	    								"org.atlanmod.analysis.Algae.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,14,FOLLOW_32); 

                    				newLeafNode(otherlv_45, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            otherlv_46=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_46, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleEClass"


    // $ANTLR start "entryRuleEOperation"
    // InternalAlgae.g:2920:1: entryRuleEOperation returns [EObject current=null] : iv_ruleEOperation= ruleEOperation EOF ;
    public final EObject entryRuleEOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperation = null;


        try {
            // InternalAlgae.g:2920:51: (iv_ruleEOperation= ruleEOperation EOF )
            // InternalAlgae.g:2921:2: iv_ruleEOperation= ruleEOperation EOF
            {
             newCompositeNode(grammarAccess.getEOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOperation=ruleEOperation();

            state._fsp--;

             current =iv_ruleEOperation; 
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
    // $ANTLR end "entryRuleEOperation"


    // $ANTLR start "ruleEOperation"
    // InternalAlgae.g:2927:1: ruleEOperation returns [EObject current=null] : ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
    public final EObject ruleEOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ordered_5_0 = null;

        AntlrDatatypeRuleToken lv_unique_7_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_9_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_11_0 = null;

        EObject lv_eAnnotations_22_0 = null;

        EObject lv_eAnnotations_24_0 = null;

        EObject lv_eGenericType_27_0 = null;

        EObject lv_eTypeParameters_30_0 = null;

        EObject lv_eTypeParameters_32_0 = null;

        EObject lv_eParameters_36_0 = null;

        EObject lv_eParameters_38_0 = null;

        EObject lv_eGenericExceptions_42_0 = null;

        EObject lv_eGenericExceptions_44_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:2933:2: ( ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalAlgae.g:2934:2: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalAlgae.g:2934:2: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalAlgae.g:2935:3: () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // InternalAlgae.g:2935:3: ()
            // InternalAlgae.g:2936:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationAccess().getEOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEOperationAccess().getEOperationKeyword_1());
            		
            // InternalAlgae.g:2946:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAlgae.g:2947:4: (lv_name_2_0= ruleEString )
            {
            // InternalAlgae.g:2947:4: (lv_name_2_0= ruleEString )
            // InternalAlgae.g:2948:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEOperationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEOperationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_57); 

            			newLeafNode(otherlv_3, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAlgae.g:2969:3: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==58) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAlgae.g:2970:4: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,58,FOLLOW_58); 

                    				newLeafNode(otherlv_4, grammarAccess.getEOperationAccess().getOrderedKeyword_4_0());
                    			
                    // InternalAlgae.g:2974:4: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // InternalAlgae.g:2975:5: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:2975:5: (lv_ordered_5_0= ruleEBoolean )
                    // InternalAlgae.g:2976:6: lv_ordered_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getOrderedEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_ordered_5_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_5_0,
                    							"org.atlanmod.analysis.Algae.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:2994:3: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==59) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAlgae.g:2995:4: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,59,FOLLOW_58); 

                    				newLeafNode(otherlv_6, grammarAccess.getEOperationAccess().getUniqueKeyword_5_0());
                    			
                    // InternalAlgae.g:2999:4: ( (lv_unique_7_0= ruleEBoolean ) )
                    // InternalAlgae.g:3000:5: (lv_unique_7_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:3000:5: (lv_unique_7_0= ruleEBoolean )
                    // InternalAlgae.g:3001:6: lv_unique_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getUniqueEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_unique_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_7_0,
                    							"org.atlanmod.analysis.Algae.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:3019:3: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==60) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalAlgae.g:3020:4: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,60,FOLLOW_61); 

                    				newLeafNode(otherlv_8, grammarAccess.getEOperationAccess().getLowerBoundKeyword_6_0());
                    			
                    // InternalAlgae.g:3024:4: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // InternalAlgae.g:3025:5: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // InternalAlgae.g:3025:5: (lv_lowerBound_9_0= ruleEInt )
                    // InternalAlgae.g:3026:6: lv_lowerBound_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getLowerBoundEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_lowerBound_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_9_0,
                    							"org.atlanmod.analysis.Algae.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:3044:3: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==61) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAlgae.g:3045:4: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,61,FOLLOW_61); 

                    				newLeafNode(otherlv_10, grammarAccess.getEOperationAccess().getUpperBoundKeyword_7_0());
                    			
                    // InternalAlgae.g:3049:4: ( (lv_upperBound_11_0= ruleEInt ) )
                    // InternalAlgae.g:3050:5: (lv_upperBound_11_0= ruleEInt )
                    {
                    // InternalAlgae.g:3050:5: (lv_upperBound_11_0= ruleEInt )
                    // InternalAlgae.g:3051:6: lv_upperBound_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getUpperBoundEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_63);
                    lv_upperBound_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_11_0,
                    							"org.atlanmod.analysis.Algae.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:3069:3: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==62) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalAlgae.g:3070:4: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEOperationAccess().getETypeKeyword_8_0());
                    			
                    // InternalAlgae.g:3074:4: ( ( ruleEString ) )
                    // InternalAlgae.g:3075:5: ( ruleEString )
                    {
                    // InternalAlgae.g:3075:5: ( ruleEString )
                    // InternalAlgae.g:3076:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEOperationAccess().getETypeEClassifierCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:3091:3: (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==63) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalAlgae.g:3092:4: otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,63,FOLLOW_45); 

                    				newLeafNode(otherlv_14, grammarAccess.getEOperationAccess().getEExceptionsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getEOperationAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalAlgae.g:3100:4: ( ( ruleEString ) )
                    // InternalAlgae.g:3101:5: ( ruleEString )
                    {
                    // InternalAlgae.g:3101:5: ( ruleEString )
                    // InternalAlgae.g:3102:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:3116:4: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==13) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalAlgae.g:3117:5: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEOperationAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalAlgae.g:3121:5: ( ( ruleEString ) )
                    	    // InternalAlgae.g:3122:6: ( ruleEString )
                    	    {
                    	    // InternalAlgae.g:3122:6: ( ruleEString )
                    	    // InternalAlgae.g:3123:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEOperationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,51,FOLLOW_65); 

                    				newLeafNode(otherlv_19, grammarAccess.getEOperationAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:3143:3: (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==52) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalAlgae.g:3144:4: otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getEOperationAccess().getEAnnotationsKeyword_10_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_21, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalAlgae.g:3152:4: ( (lv_eAnnotations_22_0= ruleEAnnotation ) )
                    // InternalAlgae.g:3153:5: (lv_eAnnotations_22_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:3153:5: (lv_eAnnotations_22_0= ruleEAnnotation )
                    // InternalAlgae.g:3154:6: lv_eAnnotations_22_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEAnnotationsEAnnotationParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eAnnotations_22_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_22_0,
                    							"org.atlanmod.analysis.Algae.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:3171:4: (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==13) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalAlgae.g:3172:5: otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,13,FOLLOW_48); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getEOperationAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalAlgae.g:3176:5: ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:3177:6: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:3177:6: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    // InternalAlgae.g:3178:7: lv_eAnnotations_24_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEAnnotationsEAnnotationParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eAnnotations_24_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_24_0,
                    	    								"org.atlanmod.analysis.Algae.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,14,FOLLOW_66); 

                    				newLeafNode(otherlv_25, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:3201:3: (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==64) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalAlgae.g:3202:4: otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    {
                    otherlv_26=(Token)match(input,64,FOLLOW_56); 

                    				newLeafNode(otherlv_26, grammarAccess.getEOperationAccess().getEGenericTypeKeyword_11_0());
                    			
                    // InternalAlgae.g:3206:4: ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    // InternalAlgae.g:3207:5: (lv_eGenericType_27_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:3207:5: (lv_eGenericType_27_0= ruleEGenericType )
                    // InternalAlgae.g:3208:6: lv_eGenericType_27_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEGenericTypeEGenericTypeParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_eGenericType_27_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"eGenericType",
                    							lv_eGenericType_27_0,
                    							"org.atlanmod.analysis.Algae.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:3226:3: (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==53) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalAlgae.g:3227:4: otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getEOperationAccess().getETypeParametersKeyword_12_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_29, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalAlgae.g:3235:4: ( (lv_eTypeParameters_30_0= ruleETypeParameter ) )
                    // InternalAlgae.g:3236:5: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    {
                    // InternalAlgae.g:3236:5: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    // InternalAlgae.g:3237:6: lv_eTypeParameters_30_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getETypeParametersETypeParameterParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eTypeParameters_30_0=ruleETypeParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						add(
                    							current,
                    							"eTypeParameters",
                    							lv_eTypeParameters_30_0,
                    							"org.atlanmod.analysis.Algae.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:3254:4: (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==13) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalAlgae.g:3255:5: otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_31=(Token)match(input,13,FOLLOW_50); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getEOperationAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalAlgae.g:3259:5: ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    // InternalAlgae.g:3260:6: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    {
                    	    // InternalAlgae.g:3260:6: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    // InternalAlgae.g:3261:7: lv_eTypeParameters_32_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getETypeParametersETypeParameterParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eTypeParameters_32_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeParameters",
                    	    								lv_eTypeParameters_32_0,
                    	    								"org.atlanmod.analysis.Algae.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,14,FOLLOW_68); 

                    				newLeafNode(otherlv_33, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:3284:3: (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==65) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalAlgae.g:3285:4: otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,65,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getEOperationAccess().getEParametersKeyword_13_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_69); 

                    				newLeafNode(otherlv_35, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalAlgae.g:3293:4: ( (lv_eParameters_36_0= ruleEParameter ) )
                    // InternalAlgae.g:3294:5: (lv_eParameters_36_0= ruleEParameter )
                    {
                    // InternalAlgae.g:3294:5: (lv_eParameters_36_0= ruleEParameter )
                    // InternalAlgae.g:3295:6: lv_eParameters_36_0= ruleEParameter
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEParametersEParameterParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eParameters_36_0=ruleEParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						add(
                    							current,
                    							"eParameters",
                    							lv_eParameters_36_0,
                    							"org.atlanmod.analysis.Algae.EParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:3312:4: (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==13) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalAlgae.g:3313:5: otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    {
                    	    otherlv_37=(Token)match(input,13,FOLLOW_69); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getEOperationAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalAlgae.g:3317:5: ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    // InternalAlgae.g:3318:6: (lv_eParameters_38_0= ruleEParameter )
                    	    {
                    	    // InternalAlgae.g:3318:6: (lv_eParameters_38_0= ruleEParameter )
                    	    // InternalAlgae.g:3319:7: lv_eParameters_38_0= ruleEParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEParametersEParameterParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eParameters_38_0=ruleEParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eParameters",
                    	    								lv_eParameters_38_0,
                    	    								"org.atlanmod.analysis.Algae.EParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,14,FOLLOW_70); 

                    				newLeafNode(otherlv_39, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:3342:3: (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==66) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalAlgae.g:3343:4: otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,66,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getEOperationAccess().getEGenericExceptionsKeyword_14_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_56); 

                    				newLeafNode(otherlv_41, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalAlgae.g:3351:4: ( (lv_eGenericExceptions_42_0= ruleEGenericType ) )
                    // InternalAlgae.g:3352:5: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:3352:5: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    // InternalAlgae.g:3353:6: lv_eGenericExceptions_42_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEGenericExceptionsEGenericTypeParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eGenericExceptions_42_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						add(
                    							current,
                    							"eGenericExceptions",
                    							lv_eGenericExceptions_42_0,
                    							"org.atlanmod.analysis.Algae.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:3370:4: (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==13) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalAlgae.g:3371:5: otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,13,FOLLOW_56); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getEOperationAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalAlgae.g:3375:5: ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    // InternalAlgae.g:3376:6: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    {
                    	    // InternalAlgae.g:3376:6: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    // InternalAlgae.g:3377:7: lv_eGenericExceptions_44_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEGenericExceptionsEGenericTypeParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eGenericExceptions_44_0=ruleEGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eGenericExceptions",
                    	    								lv_eGenericExceptions_44_0,
                    	    								"org.atlanmod.analysis.Algae.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,14,FOLLOW_32); 

                    				newLeafNode(otherlv_45, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            otherlv_46=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_46, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleEOperation"


    // $ANTLR start "entryRuleEAnnotation"
    // InternalAlgae.g:3408:1: entryRuleEAnnotation returns [EObject current=null] : iv_ruleEAnnotation= ruleEAnnotation EOF ;
    public final EObject entryRuleEAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAnnotation = null;


        try {
            // InternalAlgae.g:3408:52: (iv_ruleEAnnotation= ruleEAnnotation EOF )
            // InternalAlgae.g:3409:2: iv_ruleEAnnotation= ruleEAnnotation EOF
            {
             newCompositeNode(grammarAccess.getEAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAnnotation=ruleEAnnotation();

            state._fsp--;

             current =iv_ruleEAnnotation; 
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
    // $ANTLR end "entryRuleEAnnotation"


    // $ANTLR start "ruleEAnnotation"
    // InternalAlgae.g:3415:1: ruleEAnnotation returns [EObject current=null] : ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
    public final EObject ruleEAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_source_4_0 = null;

        EObject lv_eAnnotations_13_0 = null;

        EObject lv_eAnnotations_15_0 = null;

        EObject lv_details_19_0 = null;

        EObject lv_details_21_0 = null;

        EObject lv_contents_25_0 = null;

        EObject lv_contents_27_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:3421:2: ( ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // InternalAlgae.g:3422:2: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // InternalAlgae.g:3422:2: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // InternalAlgae.g:3423:3: () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // InternalAlgae.g:3423:3: ()
            // InternalAlgae.g:3424:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAnnotationAccess().getEAnnotationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEAnnotationAccess().getEAnnotationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlgae.g:3438:3: (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==68) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalAlgae.g:3439:4: otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEAnnotationAccess().getSourceKeyword_3_0());
                    			
                    // InternalAlgae.g:3443:4: ( (lv_source_4_0= ruleEString ) )
                    // InternalAlgae.g:3444:5: (lv_source_4_0= ruleEString )
                    {
                    // InternalAlgae.g:3444:5: (lv_source_4_0= ruleEString )
                    // InternalAlgae.g:3445:6: lv_source_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getSourceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_source_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    						}
                    						set(
                    							current,
                    							"source",
                    							lv_source_4_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:3463:3: (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==69) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalAlgae.g:3464:4: otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,69,FOLLOW_45); 

                    				newLeafNode(otherlv_5, grammarAccess.getEAnnotationAccess().getReferencesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEAnnotationAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalAlgae.g:3472:4: ( ( ruleEString ) )
                    // InternalAlgae.g:3473:5: ( ruleEString )
                    {
                    // InternalAlgae.g:3473:5: ( ruleEString )
                    // InternalAlgae.g:3474:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAnnotationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:3488:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==13) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalAlgae.g:3489:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEAnnotationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalAlgae.g:3493:5: ( ( ruleEString ) )
                    	    // InternalAlgae.g:3494:6: ( ruleEString )
                    	    {
                    	    // InternalAlgae.g:3494:6: ( ruleEString )
                    	    // InternalAlgae.g:3495:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,51,FOLLOW_73); 

                    				newLeafNode(otherlv_10, grammarAccess.getEAnnotationAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:3515:3: (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==52) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalAlgae.g:3516:4: otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getEAnnotationAccess().getEAnnotationsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_12, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalAlgae.g:3524:4: ( (lv_eAnnotations_13_0= ruleEAnnotation ) )
                    // InternalAlgae.g:3525:5: (lv_eAnnotations_13_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:3525:5: (lv_eAnnotations_13_0= ruleEAnnotation )
                    // InternalAlgae.g:3526:6: lv_eAnnotations_13_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getEAnnotationsEAnnotationParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eAnnotations_13_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_13_0,
                    							"org.atlanmod.analysis.Algae.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:3543:4: (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==13) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalAlgae.g:3544:5: otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,13,FOLLOW_48); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getEAnnotationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalAlgae.g:3548:5: ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:3549:6: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:3549:6: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    // InternalAlgae.g:3550:7: lv_eAnnotations_15_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getEAnnotationsEAnnotationParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eAnnotations_15_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_15_0,
                    	    								"org.atlanmod.analysis.Algae.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,14,FOLLOW_74); 

                    				newLeafNode(otherlv_16, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:3573:3: (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==70) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalAlgae.g:3574:4: otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,70,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getEAnnotationAccess().getDetailsKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_75); 

                    				newLeafNode(otherlv_18, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalAlgae.g:3582:4: ( (lv_details_19_0= ruleEStringToStringMapEntry ) )
                    // InternalAlgae.g:3583:5: (lv_details_19_0= ruleEStringToStringMapEntry )
                    {
                    // InternalAlgae.g:3583:5: (lv_details_19_0= ruleEStringToStringMapEntry )
                    // InternalAlgae.g:3584:6: lv_details_19_0= ruleEStringToStringMapEntry
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getDetailsEStringToStringMapEntryParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_details_19_0=ruleEStringToStringMapEntry();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    						}
                    						add(
                    							current,
                    							"details",
                    							lv_details_19_0,
                    							"org.atlanmod.analysis.Algae.EStringToStringMapEntry");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:3601:4: (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==13) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalAlgae.g:3602:5: otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    {
                    	    otherlv_20=(Token)match(input,13,FOLLOW_75); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getEAnnotationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalAlgae.g:3606:5: ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    // InternalAlgae.g:3607:6: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    {
                    	    // InternalAlgae.g:3607:6: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    // InternalAlgae.g:3608:7: lv_details_21_0= ruleEStringToStringMapEntry
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getDetailsEStringToStringMapEntryParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_details_21_0=ruleEStringToStringMapEntry();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"details",
                    	    								lv_details_21_0,
                    	    								"org.atlanmod.analysis.Algae.EStringToStringMapEntry");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,14,FOLLOW_76); 

                    				newLeafNode(otherlv_22, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:3631:3: (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==71) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalAlgae.g:3632:4: otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,71,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getEAnnotationAccess().getContentsKeyword_7_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_77); 

                    				newLeafNode(otherlv_24, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalAlgae.g:3640:4: ( (lv_contents_25_0= ruleEObject ) )
                    // InternalAlgae.g:3641:5: (lv_contents_25_0= ruleEObject )
                    {
                    // InternalAlgae.g:3641:5: (lv_contents_25_0= ruleEObject )
                    // InternalAlgae.g:3642:6: lv_contents_25_0= ruleEObject
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getContentsEObjectParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_contents_25_0=ruleEObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    						}
                    						add(
                    							current,
                    							"contents",
                    							lv_contents_25_0,
                    							"org.atlanmod.analysis.Algae.EObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:3659:4: (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==13) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalAlgae.g:3660:5: otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) )
                    	    {
                    	    otherlv_26=(Token)match(input,13,FOLLOW_77); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEAnnotationAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalAlgae.g:3664:5: ( (lv_contents_27_0= ruleEObject ) )
                    	    // InternalAlgae.g:3665:6: (lv_contents_27_0= ruleEObject )
                    	    {
                    	    // InternalAlgae.g:3665:6: (lv_contents_27_0= ruleEObject )
                    	    // InternalAlgae.g:3666:7: lv_contents_27_0= ruleEObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getContentsEObjectParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_contents_27_0=ruleEObject();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"contents",
                    	    								lv_contents_27_0,
                    	    								"org.atlanmod.analysis.Algae.EObject");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,14,FOLLOW_32); 

                    				newLeafNode(otherlv_28, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleEAnnotation"


    // $ANTLR start "entryRuleETypeParameter"
    // InternalAlgae.g:3697:1: entryRuleETypeParameter returns [EObject current=null] : iv_ruleETypeParameter= ruleETypeParameter EOF ;
    public final EObject entryRuleETypeParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETypeParameter = null;


        try {
            // InternalAlgae.g:3697:55: (iv_ruleETypeParameter= ruleETypeParameter EOF )
            // InternalAlgae.g:3698:2: iv_ruleETypeParameter= ruleETypeParameter EOF
            {
             newCompositeNode(grammarAccess.getETypeParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETypeParameter=ruleETypeParameter();

            state._fsp--;

             current =iv_ruleETypeParameter; 
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
    // $ANTLR end "entryRuleETypeParameter"


    // $ANTLR start "ruleETypeParameter"
    // InternalAlgae.g:3704:1: ruleETypeParameter returns [EObject current=null] : ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleETypeParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_eAnnotations_6_0 = null;

        EObject lv_eAnnotations_8_0 = null;

        EObject lv_eBounds_12_0 = null;

        EObject lv_eBounds_14_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:3710:2: ( ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalAlgae.g:3711:2: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalAlgae.g:3711:2: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalAlgae.g:3712:3: () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalAlgae.g:3712:3: ()
            // InternalAlgae.g:3713:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETypeParameterAccess().getETypeParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getETypeParameterAccess().getETypeParameterKeyword_1());
            		
            // InternalAlgae.g:3723:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAlgae.g:3724:4: (lv_name_2_0= ruleEString )
            {
            // InternalAlgae.g:3724:4: (lv_name_2_0= ruleEString )
            // InternalAlgae.g:3725:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getETypeParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getETypeParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_78); 

            			newLeafNode(otherlv_3, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAlgae.g:3746:3: (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==52) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalAlgae.g:3747:4: otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getETypeParameterAccess().getEAnnotationsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_5, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalAlgae.g:3755:4: ( (lv_eAnnotations_6_0= ruleEAnnotation ) )
                    // InternalAlgae.g:3756:5: (lv_eAnnotations_6_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:3756:5: (lv_eAnnotations_6_0= ruleEAnnotation )
                    // InternalAlgae.g:3757:6: lv_eAnnotations_6_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getETypeParameterAccess().getEAnnotationsEAnnotationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eAnnotations_6_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_6_0,
                    							"org.atlanmod.analysis.Algae.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:3774:4: (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==13) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalAlgae.g:3775:5: otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_48); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getETypeParameterAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalAlgae.g:3779:5: ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:3780:6: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:3780:6: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    // InternalAlgae.g:3781:7: lv_eAnnotations_8_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getETypeParameterAccess().getEAnnotationsEAnnotationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eAnnotations_8_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_8_0,
                    	    								"org.atlanmod.analysis.Algae.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_79); 

                    				newLeafNode(otherlv_9, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:3804:3: (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==73) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalAlgae.g:3805:4: otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,73,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getETypeParameterAccess().getEBoundsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_56); 

                    				newLeafNode(otherlv_11, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalAlgae.g:3813:4: ( (lv_eBounds_12_0= ruleEGenericType ) )
                    // InternalAlgae.g:3814:5: (lv_eBounds_12_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:3814:5: (lv_eBounds_12_0= ruleEGenericType )
                    // InternalAlgae.g:3815:6: lv_eBounds_12_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getETypeParameterAccess().getEBoundsEGenericTypeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eBounds_12_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    						}
                    						add(
                    							current,
                    							"eBounds",
                    							lv_eBounds_12_0,
                    							"org.atlanmod.analysis.Algae.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:3832:4: (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==13) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalAlgae.g:3833:5: otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_56); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getETypeParameterAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalAlgae.g:3837:5: ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    // InternalAlgae.g:3838:6: (lv_eBounds_14_0= ruleEGenericType )
                    	    {
                    	    // InternalAlgae.g:3838:6: (lv_eBounds_14_0= ruleEGenericType )
                    	    // InternalAlgae.g:3839:7: lv_eBounds_14_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getETypeParameterAccess().getEBoundsEGenericTypeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eBounds_14_0=ruleEGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getETypeParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eBounds",
                    	    								lv_eBounds_14_0,
                    	    								"org.atlanmod.analysis.Algae.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,14,FOLLOW_32); 

                    				newLeafNode(otherlv_15, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleETypeParameter"


    // $ANTLR start "entryRuleEBoolean"
    // InternalAlgae.g:3870:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalAlgae.g:3870:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalAlgae.g:3871:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalAlgae.g:3877:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlgae.g:3883:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalAlgae.g:3884:2: (kw= 'true' | kw= 'false' )
            {
            // InternalAlgae.g:3884:2: (kw= 'true' | kw= 'false' )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==74) ) {
                alt87=1;
            }
            else if ( (LA87_0==75) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalAlgae.g:3885:3: kw= 'true'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlgae.g:3891:3: kw= 'false'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEGenericType"
    // InternalAlgae.g:3900:1: entryRuleEGenericType returns [EObject current=null] : iv_ruleEGenericType= ruleEGenericType EOF ;
    public final EObject entryRuleEGenericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGenericType = null;


        try {
            // InternalAlgae.g:3900:53: (iv_ruleEGenericType= ruleEGenericType EOF )
            // InternalAlgae.g:3901:2: iv_ruleEGenericType= ruleEGenericType EOF
            {
             newCompositeNode(grammarAccess.getEGenericTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEGenericType=ruleEGenericType();

            state._fsp--;

             current =iv_ruleEGenericType; 
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
    // $ANTLR end "entryRuleEGenericType"


    // $ANTLR start "ruleEGenericType"
    // InternalAlgae.g:3907:1: ruleEGenericType returns [EObject current=null] : ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleEGenericType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_eUpperBound_8_0 = null;

        EObject lv_eTypeArguments_11_0 = null;

        EObject lv_eTypeArguments_13_0 = null;

        EObject lv_eLowerBound_16_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:3913:2: ( ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) )
            // InternalAlgae.g:3914:2: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            {
            // InternalAlgae.g:3914:2: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            // InternalAlgae.g:3915:3: () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}'
            {
            // InternalAlgae.g:3915:3: ()
            // InternalAlgae.g:3916:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEGenericTypeAccess().getEGenericTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,76,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEGenericTypeAccess().getEGenericTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_80); 

            			newLeafNode(otherlv_2, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlgae.g:3930:3: (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==77) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalAlgae.g:3931:4: otherlv_3= 'eTypeParameter' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,77,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEGenericTypeAccess().getETypeParameterKeyword_3_0());
                    			
                    // InternalAlgae.g:3935:4: ( ( ruleEString ) )
                    // InternalAlgae.g:3936:5: ( ruleEString )
                    {
                    // InternalAlgae.g:3936:5: ( ruleEString )
                    // InternalAlgae.g:3937:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEGenericTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeParameterETypeParameterCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_81);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:3952:3: (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==78) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalAlgae.g:3953:4: otherlv_5= 'eClassifier' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,78,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEGenericTypeAccess().getEClassifierKeyword_4_0());
                    			
                    // InternalAlgae.g:3957:4: ( ( ruleEString ) )
                    // InternalAlgae.g:3958:5: ( ruleEString )
                    {
                    // InternalAlgae.g:3958:5: ( ruleEString )
                    // InternalAlgae.g:3959:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEGenericTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getEClassifierEClassifierCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_82);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:3974:3: (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==79) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalAlgae.g:3975:4: otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    {
                    otherlv_7=(Token)match(input,79,FOLLOW_56); 

                    				newLeafNode(otherlv_7, grammarAccess.getEGenericTypeAccess().getEUpperBoundKeyword_5_0());
                    			
                    // InternalAlgae.g:3979:4: ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    // InternalAlgae.g:3980:5: (lv_eUpperBound_8_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:3980:5: (lv_eUpperBound_8_0= ruleEGenericType )
                    // InternalAlgae.g:3981:6: lv_eUpperBound_8_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getEUpperBoundEGenericTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_83);
                    lv_eUpperBound_8_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    						}
                    						set(
                    							current,
                    							"eUpperBound",
                    							lv_eUpperBound_8_0,
                    							"org.atlanmod.analysis.Algae.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:3999:3: (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==80) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalAlgae.g:4000:4: otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,80,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getEGenericTypeAccess().getETypeArgumentsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_56); 

                    				newLeafNode(otherlv_10, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalAlgae.g:4008:4: ( (lv_eTypeArguments_11_0= ruleEGenericType ) )
                    // InternalAlgae.g:4009:5: (lv_eTypeArguments_11_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:4009:5: (lv_eTypeArguments_11_0= ruleEGenericType )
                    // InternalAlgae.g:4010:6: lv_eTypeArguments_11_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeArgumentsEGenericTypeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eTypeArguments_11_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    						}
                    						add(
                    							current,
                    							"eTypeArguments",
                    							lv_eTypeArguments_11_0,
                    							"org.atlanmod.analysis.Algae.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:4027:4: (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==13) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalAlgae.g:4028:5: otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_12=(Token)match(input,13,FOLLOW_56); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEGenericTypeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalAlgae.g:4032:5: ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    // InternalAlgae.g:4033:6: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    {
                    	    // InternalAlgae.g:4033:6: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    // InternalAlgae.g:4034:7: lv_eTypeArguments_13_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeArgumentsEGenericTypeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eTypeArguments_13_0=ruleEGenericType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeArguments",
                    	    								lv_eTypeArguments_13_0,
                    	    								"org.atlanmod.analysis.Algae.EGenericType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,14,FOLLOW_84); 

                    				newLeafNode(otherlv_14, grammarAccess.getEGenericTypeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:4057:3: (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==81) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalAlgae.g:4058:4: otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    {
                    otherlv_15=(Token)match(input,81,FOLLOW_56); 

                    				newLeafNode(otherlv_15, grammarAccess.getEGenericTypeAccess().getELowerBoundKeyword_7_0());
                    			
                    // InternalAlgae.g:4062:4: ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    // InternalAlgae.g:4063:5: (lv_eLowerBound_16_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:4063:5: (lv_eLowerBound_16_0= ruleEGenericType )
                    // InternalAlgae.g:4064:6: lv_eLowerBound_16_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getELowerBoundEGenericTypeParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_eLowerBound_16_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEGenericTypeRule());
                    						}
                    						set(
                    							current,
                    							"eLowerBound",
                    							lv_eLowerBound_16_0,
                    							"org.atlanmod.analysis.Algae.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getEGenericTypeAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleEGenericType"


    // $ANTLR start "entryRuleEStringToStringMapEntry"
    // InternalAlgae.g:4090:1: entryRuleEStringToStringMapEntry returns [EObject current=null] : iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF ;
    public final EObject entryRuleEStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStringToStringMapEntry = null;


        try {
            // InternalAlgae.g:4090:64: (iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF )
            // InternalAlgae.g:4091:2: iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF
            {
             newCompositeNode(grammarAccess.getEStringToStringMapEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEStringToStringMapEntry=ruleEStringToStringMapEntry();

            state._fsp--;

             current =iv_ruleEStringToStringMapEntry; 
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
    // $ANTLR end "entryRuleEStringToStringMapEntry"


    // $ANTLR start "ruleEStringToStringMapEntry"
    // InternalAlgae.g:4097:1: ruleEStringToStringMapEntry returns [EObject current=null] : ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleEStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_key_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:4103:2: ( ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalAlgae.g:4104:2: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalAlgae.g:4104:2: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalAlgae.g:4105:3: () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalAlgae.g:4105:3: ()
            // InternalAlgae.g:4106:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,82,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_85); 

            			newLeafNode(otherlv_2, grammarAccess.getEStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlgae.g:4120:3: (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==83) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalAlgae.g:4121:4: otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,83,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEStringToStringMapEntryAccess().getKeyKeyword_3_0());
                    			
                    // InternalAlgae.g:4125:4: ( (lv_key_4_0= ruleEString ) )
                    // InternalAlgae.g:4126:5: (lv_key_4_0= ruleEString )
                    {
                    // InternalAlgae.g:4126:5: (lv_key_4_0= ruleEString )
                    // InternalAlgae.g:4127:6: lv_key_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_86);
                    lv_key_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEStringToStringMapEntryRule());
                    						}
                    						set(
                    							current,
                    							"key",
                    							lv_key_4_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:4145:3: (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==84) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalAlgae.g:4146:4: otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,84,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEStringToStringMapEntryAccess().getValueKeyword_4_0());
                    			
                    // InternalAlgae.g:4150:4: ( (lv_value_6_0= ruleEString ) )
                    // InternalAlgae.g:4151:5: (lv_value_6_0= ruleEString )
                    {
                    // InternalAlgae.g:4151:5: (lv_value_6_0= ruleEString )
                    // InternalAlgae.g:4152:6: lv_value_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getValueEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_value_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEStringToStringMapEntryRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEStringToStringMapEntryAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEStringToStringMapEntry"


    // $ANTLR start "entryRuleEObject"
    // InternalAlgae.g:4178:1: entryRuleEObject returns [EObject current=null] : iv_ruleEObject= ruleEObject EOF ;
    public final EObject entryRuleEObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObject = null;


        try {
            // InternalAlgae.g:4178:48: (iv_ruleEObject= ruleEObject EOF )
            // InternalAlgae.g:4179:2: iv_ruleEObject= ruleEObject EOF
            {
             newCompositeNode(grammarAccess.getEObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEObject=ruleEObject();

            state._fsp--;

             current =iv_ruleEObject; 
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
    // $ANTLR end "entryRuleEObject"


    // $ANTLR start "ruleEObject"
    // InternalAlgae.g:4185:1: ruleEObject returns [EObject current=null] : ( () otherlv_1= 'EObject' ) ;
    public final EObject ruleEObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlgae.g:4191:2: ( ( () otherlv_1= 'EObject' ) )
            // InternalAlgae.g:4192:2: ( () otherlv_1= 'EObject' )
            {
            // InternalAlgae.g:4192:2: ( () otherlv_1= 'EObject' )
            // InternalAlgae.g:4193:3: () otherlv_1= 'EObject'
            {
            // InternalAlgae.g:4193:3: ()
            // InternalAlgae.g:4194:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEObjectAccess().getEObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,85,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEObjectAccess().getEObjectKeyword_1());
            		

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
    // $ANTLR end "ruleEObject"


    // $ANTLR start "entryRuleEInt"
    // InternalAlgae.g:4208:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalAlgae.g:4208:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalAlgae.g:4209:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalAlgae.g:4215:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalAlgae.g:4221:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalAlgae.g:4222:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalAlgae.g:4222:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalAlgae.g:4223:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalAlgae.g:4223:3: (kw= '-' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==23) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalAlgae.g:4224:4: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEAttribute"
    // InternalAlgae.g:4241:1: entryRuleEAttribute returns [EObject current=null] : iv_ruleEAttribute= ruleEAttribute EOF ;
    public final EObject entryRuleEAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttribute = null;


        try {
            // InternalAlgae.g:4241:51: (iv_ruleEAttribute= ruleEAttribute EOF )
            // InternalAlgae.g:4242:2: iv_ruleEAttribute= ruleEAttribute EOF
            {
             newCompositeNode(grammarAccess.getEAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAttribute=ruleEAttribute();

            state._fsp--;

             current =iv_ruleEAttribute; 
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
    // $ANTLR end "entryRuleEAttribute"


    // $ANTLR start "ruleEAttribute"
    // InternalAlgae.g:4248:1: ruleEAttribute returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) ;
    public final EObject ruleEAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_volatile_1_0=null;
        Token lv_transient_2_0=null;
        Token lv_unsettable_3_0=null;
        Token lv_derived_4_0=null;
        Token lv_iD_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_name_7_0 = null;

        AntlrDatatypeRuleToken lv_ordered_10_0 = null;

        AntlrDatatypeRuleToken lv_unique_12_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_14_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_16_0 = null;

        AntlrDatatypeRuleToken lv_changeable_18_0 = null;

        AntlrDatatypeRuleToken lv_defaultValueLiteral_20_0 = null;

        EObject lv_eAnnotations_25_0 = null;

        EObject lv_eAnnotations_27_0 = null;

        EObject lv_eGenericType_30_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:4254:2: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) )
            // InternalAlgae.g:4255:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            {
            // InternalAlgae.g:4255:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            // InternalAlgae.g:4256:3: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}'
            {
            // InternalAlgae.g:4256:3: ()
            // InternalAlgae.g:4257:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAttributeAccess().getEAttributeAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:4263:3: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==86) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalAlgae.g:4264:4: (lv_volatile_1_0= 'volatile' )
                    {
                    // InternalAlgae.g:4264:4: (lv_volatile_1_0= 'volatile' )
                    // InternalAlgae.g:4265:5: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,86,FOLLOW_87); 

                    					newLeafNode(lv_volatile_1_0, grammarAccess.getEAttributeAccess().getVolatileVolatileKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "volatile", true, "volatile");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:4277:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==87) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalAlgae.g:4278:4: (lv_transient_2_0= 'transient' )
                    {
                    // InternalAlgae.g:4278:4: (lv_transient_2_0= 'transient' )
                    // InternalAlgae.g:4279:5: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,87,FOLLOW_88); 

                    					newLeafNode(lv_transient_2_0, grammarAccess.getEAttributeAccess().getTransientTransientKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "transient", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:4291:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==88) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalAlgae.g:4292:4: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // InternalAlgae.g:4292:4: (lv_unsettable_3_0= 'unsettable' )
                    // InternalAlgae.g:4293:5: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,88,FOLLOW_89); 

                    					newLeafNode(lv_unsettable_3_0, grammarAccess.getEAttributeAccess().getUnsettableUnsettableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "unsettable", true, "unsettable");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:4305:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==89) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalAlgae.g:4306:4: (lv_derived_4_0= 'derived' )
                    {
                    // InternalAlgae.g:4306:4: (lv_derived_4_0= 'derived' )
                    // InternalAlgae.g:4307:5: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,89,FOLLOW_90); 

                    					newLeafNode(lv_derived_4_0, grammarAccess.getEAttributeAccess().getDerivedDerivedKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "derived", true, "derived");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:4319:3: ( (lv_iD_5_0= 'iD' ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==90) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalAlgae.g:4320:4: (lv_iD_5_0= 'iD' )
                    {
                    // InternalAlgae.g:4320:4: (lv_iD_5_0= 'iD' )
                    // InternalAlgae.g:4321:5: lv_iD_5_0= 'iD'
                    {
                    lv_iD_5_0=(Token)match(input,90,FOLLOW_91); 

                    					newLeafNode(lv_iD_5_0, grammarAccess.getEAttributeAccess().getIDIDKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "iD", true, "iD");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,91,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getEAttributeAccess().getEAttributeKeyword_6());
            		
            // InternalAlgae.g:4337:3: ( (lv_name_7_0= ruleEString ) )
            // InternalAlgae.g:4338:4: (lv_name_7_0= ruleEString )
            {
            // InternalAlgae.g:4338:4: (lv_name_7_0= ruleEString )
            // InternalAlgae.g:4339:5: lv_name_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEAttributeAccess().getNameEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_92); 

            			newLeafNode(otherlv_8, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalAlgae.g:4360:3: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==58) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalAlgae.g:4361:4: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,58,FOLLOW_58); 

                    				newLeafNode(otherlv_9, grammarAccess.getEAttributeAccess().getOrderedKeyword_9_0());
                    			
                    // InternalAlgae.g:4365:4: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // InternalAlgae.g:4366:5: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:4366:5: (lv_ordered_10_0= ruleEBoolean )
                    // InternalAlgae.g:4367:6: lv_ordered_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getOrderedEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_93);
                    lv_ordered_10_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_10_0,
                    							"org.atlanmod.analysis.Algae.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:4385:3: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==59) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalAlgae.g:4386:4: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,59,FOLLOW_58); 

                    				newLeafNode(otherlv_11, grammarAccess.getEAttributeAccess().getUniqueKeyword_10_0());
                    			
                    // InternalAlgae.g:4390:4: ( (lv_unique_12_0= ruleEBoolean ) )
                    // InternalAlgae.g:4391:5: (lv_unique_12_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:4391:5: (lv_unique_12_0= ruleEBoolean )
                    // InternalAlgae.g:4392:6: lv_unique_12_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getUniqueEBooleanParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_94);
                    lv_unique_12_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_12_0,
                    							"org.atlanmod.analysis.Algae.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:4410:3: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==60) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalAlgae.g:4411:4: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,60,FOLLOW_61); 

                    				newLeafNode(otherlv_13, grammarAccess.getEAttributeAccess().getLowerBoundKeyword_11_0());
                    			
                    // InternalAlgae.g:4415:4: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // InternalAlgae.g:4416:5: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // InternalAlgae.g:4416:5: (lv_lowerBound_14_0= ruleEInt )
                    // InternalAlgae.g:4417:6: lv_lowerBound_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getLowerBoundEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_95);
                    lv_lowerBound_14_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_14_0,
                    							"org.atlanmod.analysis.Algae.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:4435:3: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==61) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalAlgae.g:4436:4: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,61,FOLLOW_61); 

                    				newLeafNode(otherlv_15, grammarAccess.getEAttributeAccess().getUpperBoundKeyword_12_0());
                    			
                    // InternalAlgae.g:4440:4: ( (lv_upperBound_16_0= ruleEInt ) )
                    // InternalAlgae.g:4441:5: (lv_upperBound_16_0= ruleEInt )
                    {
                    // InternalAlgae.g:4441:5: (lv_upperBound_16_0= ruleEInt )
                    // InternalAlgae.g:4442:6: lv_upperBound_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getUpperBoundEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_96);
                    lv_upperBound_16_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_16_0,
                    							"org.atlanmod.analysis.Algae.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:4460:3: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==92) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalAlgae.g:4461:4: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,92,FOLLOW_58); 

                    				newLeafNode(otherlv_17, grammarAccess.getEAttributeAccess().getChangeableKeyword_13_0());
                    			
                    // InternalAlgae.g:4465:4: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // InternalAlgae.g:4466:5: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:4466:5: (lv_changeable_18_0= ruleEBoolean )
                    // InternalAlgae.g:4467:6: lv_changeable_18_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getChangeableEBooleanParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_97);
                    lv_changeable_18_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"changeable",
                    							lv_changeable_18_0,
                    							"org.atlanmod.analysis.Algae.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:4485:3: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==93) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalAlgae.g:4486:4: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,93,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getEAttributeAccess().getDefaultValueLiteralKeyword_14_0());
                    			
                    // InternalAlgae.g:4490:4: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // InternalAlgae.g:4491:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // InternalAlgae.g:4491:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    // InternalAlgae.g:4492:6: lv_defaultValueLiteral_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_98);
                    lv_defaultValueLiteral_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"defaultValueLiteral",
                    							lv_defaultValueLiteral_20_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:4510:3: (otherlv_21= 'eType' ( ( ruleEString ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==62) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalAlgae.g:4511:4: otherlv_21= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_21=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getEAttributeAccess().getETypeKeyword_15_0());
                    			
                    // InternalAlgae.g:4515:4: ( ( ruleEString ) )
                    // InternalAlgae.g:4516:5: ( ruleEString )
                    {
                    // InternalAlgae.g:4516:5: ( ruleEString )
                    // InternalAlgae.g:4517:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getETypeEClassifierCrossReference_15_1_0());
                    					
                    pushFollow(FOLLOW_99);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:4532:3: (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==52) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalAlgae.g:4533:4: otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getEAttributeAccess().getEAnnotationsKeyword_16_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_24, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalAlgae.g:4541:4: ( (lv_eAnnotations_25_0= ruleEAnnotation ) )
                    // InternalAlgae.g:4542:5: (lv_eAnnotations_25_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:4542:5: (lv_eAnnotations_25_0= ruleEAnnotation )
                    // InternalAlgae.g:4543:6: lv_eAnnotations_25_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getEAnnotationsEAnnotationParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eAnnotations_25_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_25_0,
                    							"org.atlanmod.analysis.Algae.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:4560:4: (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==13) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // InternalAlgae.g:4561:5: otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_26=(Token)match(input,13,FOLLOW_48); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEAttributeAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalAlgae.g:4565:5: ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:4566:6: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:4566:6: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    // InternalAlgae.g:4567:7: lv_eAnnotations_27_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAttributeAccess().getEAnnotationsEAnnotationParserRuleCall_16_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eAnnotations_27_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_27_0,
                    	    								"org.atlanmod.analysis.Algae.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop109;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,14,FOLLOW_100); 

                    				newLeafNode(otherlv_28, grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:4590:3: (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==64) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalAlgae.g:4591:4: otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    {
                    otherlv_29=(Token)match(input,64,FOLLOW_56); 

                    				newLeafNode(otherlv_29, grammarAccess.getEAttributeAccess().getEGenericTypeKeyword_17_0());
                    			
                    // InternalAlgae.g:4595:4: ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    // InternalAlgae.g:4596:5: (lv_eGenericType_30_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:4596:5: (lv_eGenericType_30_0= ruleEGenericType )
                    // InternalAlgae.g:4597:6: lv_eGenericType_30_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getEGenericTypeEGenericTypeParserRuleCall_17_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_eGenericType_30_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAttributeRule());
                    						}
                    						set(
                    							current,
                    							"eGenericType",
                    							lv_eGenericType_30_0,
                    							"org.atlanmod.analysis.Algae.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_31=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleEAttribute"


    // $ANTLR start "entryRuleEReference"
    // InternalAlgae.g:4623:1: entryRuleEReference returns [EObject current=null] : iv_ruleEReference= ruleEReference EOF ;
    public final EObject entryRuleEReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReference = null;


        try {
            // InternalAlgae.g:4623:51: (iv_ruleEReference= ruleEReference EOF )
            // InternalAlgae.g:4624:2: iv_ruleEReference= ruleEReference EOF
            {
             newCompositeNode(grammarAccess.getEReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEReference=ruleEReference();

            state._fsp--;

             current =iv_ruleEReference; 
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
    // $ANTLR end "entryRuleEReference"


    // $ANTLR start "ruleEReference"
    // InternalAlgae.g:4630:1: ruleEReference returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) ;
    public final EObject ruleEReference() throws RecognitionException {
        EObject current = null;

        Token lv_volatile_1_0=null;
        Token lv_transient_2_0=null;
        Token lv_unsettable_3_0=null;
        Token lv_derived_4_0=null;
        Token lv_containment_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        AntlrDatatypeRuleToken lv_name_7_0 = null;

        AntlrDatatypeRuleToken lv_ordered_10_0 = null;

        AntlrDatatypeRuleToken lv_unique_12_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_14_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_16_0 = null;

        AntlrDatatypeRuleToken lv_changeable_18_0 = null;

        AntlrDatatypeRuleToken lv_defaultValueLiteral_20_0 = null;

        AntlrDatatypeRuleToken lv_resolveProxies_22_0 = null;

        EObject lv_eAnnotations_35_0 = null;

        EObject lv_eAnnotations_37_0 = null;

        EObject lv_eGenericType_40_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:4636:2: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) )
            // InternalAlgae.g:4637:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            {
            // InternalAlgae.g:4637:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            // InternalAlgae.g:4638:3: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}'
            {
            // InternalAlgae.g:4638:3: ()
            // InternalAlgae.g:4639:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEReferenceAccess().getEReferenceAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:4645:3: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==86) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalAlgae.g:4646:4: (lv_volatile_1_0= 'volatile' )
                    {
                    // InternalAlgae.g:4646:4: (lv_volatile_1_0= 'volatile' )
                    // InternalAlgae.g:4647:5: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,86,FOLLOW_101); 

                    					newLeafNode(lv_volatile_1_0, grammarAccess.getEReferenceAccess().getVolatileVolatileKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "volatile", true, "volatile");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:4659:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==87) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalAlgae.g:4660:4: (lv_transient_2_0= 'transient' )
                    {
                    // InternalAlgae.g:4660:4: (lv_transient_2_0= 'transient' )
                    // InternalAlgae.g:4661:5: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,87,FOLLOW_102); 

                    					newLeafNode(lv_transient_2_0, grammarAccess.getEReferenceAccess().getTransientTransientKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "transient", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:4673:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==88) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalAlgae.g:4674:4: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // InternalAlgae.g:4674:4: (lv_unsettable_3_0= 'unsettable' )
                    // InternalAlgae.g:4675:5: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,88,FOLLOW_103); 

                    					newLeafNode(lv_unsettable_3_0, grammarAccess.getEReferenceAccess().getUnsettableUnsettableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "unsettable", true, "unsettable");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:4687:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==89) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalAlgae.g:4688:4: (lv_derived_4_0= 'derived' )
                    {
                    // InternalAlgae.g:4688:4: (lv_derived_4_0= 'derived' )
                    // InternalAlgae.g:4689:5: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,89,FOLLOW_104); 

                    					newLeafNode(lv_derived_4_0, grammarAccess.getEReferenceAccess().getDerivedDerivedKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "derived", true, "derived");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:4701:3: ( (lv_containment_5_0= 'containment' ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==94) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalAlgae.g:4702:4: (lv_containment_5_0= 'containment' )
                    {
                    // InternalAlgae.g:4702:4: (lv_containment_5_0= 'containment' )
                    // InternalAlgae.g:4703:5: lv_containment_5_0= 'containment'
                    {
                    lv_containment_5_0=(Token)match(input,94,FOLLOW_105); 

                    					newLeafNode(lv_containment_5_0, grammarAccess.getEReferenceAccess().getContainmentContainmentKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "containment", true, "containment");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,95,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getEReferenceAccess().getEReferenceKeyword_6());
            		
            // InternalAlgae.g:4719:3: ( (lv_name_7_0= ruleEString ) )
            // InternalAlgae.g:4720:4: (lv_name_7_0= ruleEString )
            {
            // InternalAlgae.g:4720:4: (lv_name_7_0= ruleEString )
            // InternalAlgae.g:4721:5: lv_name_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEReferenceAccess().getNameEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEReferenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_106); 

            			newLeafNode(otherlv_8, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalAlgae.g:4742:3: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==58) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalAlgae.g:4743:4: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,58,FOLLOW_58); 

                    				newLeafNode(otherlv_9, grammarAccess.getEReferenceAccess().getOrderedKeyword_9_0());
                    			
                    // InternalAlgae.g:4747:4: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // InternalAlgae.g:4748:5: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:4748:5: (lv_ordered_10_0= ruleEBoolean )
                    // InternalAlgae.g:4749:6: lv_ordered_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getOrderedEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_107);
                    lv_ordered_10_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_10_0,
                    							"org.atlanmod.analysis.Algae.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:4767:3: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==59) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalAlgae.g:4768:4: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,59,FOLLOW_58); 

                    				newLeafNode(otherlv_11, grammarAccess.getEReferenceAccess().getUniqueKeyword_10_0());
                    			
                    // InternalAlgae.g:4772:4: ( (lv_unique_12_0= ruleEBoolean ) )
                    // InternalAlgae.g:4773:5: (lv_unique_12_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:4773:5: (lv_unique_12_0= ruleEBoolean )
                    // InternalAlgae.g:4774:6: lv_unique_12_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getUniqueEBooleanParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_108);
                    lv_unique_12_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_12_0,
                    							"org.atlanmod.analysis.Algae.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:4792:3: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==60) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalAlgae.g:4793:4: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,60,FOLLOW_61); 

                    				newLeafNode(otherlv_13, grammarAccess.getEReferenceAccess().getLowerBoundKeyword_11_0());
                    			
                    // InternalAlgae.g:4797:4: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // InternalAlgae.g:4798:5: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // InternalAlgae.g:4798:5: (lv_lowerBound_14_0= ruleEInt )
                    // InternalAlgae.g:4799:6: lv_lowerBound_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getLowerBoundEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_109);
                    lv_lowerBound_14_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_14_0,
                    							"org.atlanmod.analysis.Algae.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:4817:3: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==61) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalAlgae.g:4818:4: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,61,FOLLOW_61); 

                    				newLeafNode(otherlv_15, grammarAccess.getEReferenceAccess().getUpperBoundKeyword_12_0());
                    			
                    // InternalAlgae.g:4822:4: ( (lv_upperBound_16_0= ruleEInt ) )
                    // InternalAlgae.g:4823:5: (lv_upperBound_16_0= ruleEInt )
                    {
                    // InternalAlgae.g:4823:5: (lv_upperBound_16_0= ruleEInt )
                    // InternalAlgae.g:4824:6: lv_upperBound_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getUpperBoundEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_110);
                    lv_upperBound_16_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_16_0,
                    							"org.atlanmod.analysis.Algae.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:4842:3: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==92) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalAlgae.g:4843:4: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,92,FOLLOW_58); 

                    				newLeafNode(otherlv_17, grammarAccess.getEReferenceAccess().getChangeableKeyword_13_0());
                    			
                    // InternalAlgae.g:4847:4: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // InternalAlgae.g:4848:5: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:4848:5: (lv_changeable_18_0= ruleEBoolean )
                    // InternalAlgae.g:4849:6: lv_changeable_18_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getChangeableEBooleanParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_111);
                    lv_changeable_18_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"changeable",
                    							lv_changeable_18_0,
                    							"org.atlanmod.analysis.Algae.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:4867:3: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==93) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalAlgae.g:4868:4: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,93,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getEReferenceAccess().getDefaultValueLiteralKeyword_14_0());
                    			
                    // InternalAlgae.g:4872:4: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // InternalAlgae.g:4873:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // InternalAlgae.g:4873:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    // InternalAlgae.g:4874:6: lv_defaultValueLiteral_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_112);
                    lv_defaultValueLiteral_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"defaultValueLiteral",
                    							lv_defaultValueLiteral_20_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:4892:3: (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==96) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalAlgae.g:4893:4: otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    {
                    otherlv_21=(Token)match(input,96,FOLLOW_58); 

                    				newLeafNode(otherlv_21, grammarAccess.getEReferenceAccess().getResolveProxiesKeyword_15_0());
                    			
                    // InternalAlgae.g:4897:4: ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    // InternalAlgae.g:4898:5: (lv_resolveProxies_22_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:4898:5: (lv_resolveProxies_22_0= ruleEBoolean )
                    // InternalAlgae.g:4899:6: lv_resolveProxies_22_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getResolveProxiesEBooleanParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_113);
                    lv_resolveProxies_22_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"resolveProxies",
                    							lv_resolveProxies_22_0,
                    							"org.atlanmod.analysis.Algae.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:4917:3: (otherlv_23= 'eType' ( ( ruleEString ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==62) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalAlgae.g:4918:4: otherlv_23= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_23=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getEReferenceAccess().getETypeKeyword_16_0());
                    			
                    // InternalAlgae.g:4922:4: ( ( ruleEString ) )
                    // InternalAlgae.g:4923:5: ( ruleEString )
                    {
                    // InternalAlgae.g:4923:5: ( ruleEString )
                    // InternalAlgae.g:4924:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getETypeEClassifierCrossReference_16_1_0());
                    					
                    pushFollow(FOLLOW_114);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:4939:3: (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==97) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalAlgae.g:4940:4: otherlv_25= 'eOpposite' ( ( ruleEString ) )
                    {
                    otherlv_25=(Token)match(input,97,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getEReferenceAccess().getEOppositeKeyword_17_0());
                    			
                    // InternalAlgae.g:4944:4: ( ( ruleEString ) )
                    // InternalAlgae.g:4945:5: ( ruleEString )
                    {
                    // InternalAlgae.g:4945:5: ( ruleEString )
                    // InternalAlgae.g:4946:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEOppositeEReferenceCrossReference_17_1_0());
                    					
                    pushFollow(FOLLOW_115);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:4961:3: (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==98) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalAlgae.g:4962:4: otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')'
                    {
                    otherlv_27=(Token)match(input,98,FOLLOW_45); 

                    				newLeafNode(otherlv_27, grammarAccess.getEReferenceAccess().getEKeysKeyword_18_0());
                    			
                    otherlv_28=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getEReferenceAccess().getLeftParenthesisKeyword_18_1());
                    			
                    // InternalAlgae.g:4970:4: ( ( ruleEString ) )
                    // InternalAlgae.g:4971:5: ( ruleEString )
                    {
                    // InternalAlgae.g:4971:5: ( ruleEString )
                    // InternalAlgae.g:4972:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:4986:4: (otherlv_30= ',' ( ( ruleEString ) ) )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==13) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // InternalAlgae.g:4987:5: otherlv_30= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_30=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getEReferenceAccess().getCommaKeyword_18_3_0());
                    	    				
                    	    // InternalAlgae.g:4991:5: ( ( ruleEString ) )
                    	    // InternalAlgae.g:4992:6: ( ruleEString )
                    	    {
                    	    // InternalAlgae.g:4992:6: ( ruleEString )
                    	    // InternalAlgae.g:4993:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEReferenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,51,FOLLOW_99); 

                    				newLeafNode(otherlv_32, grammarAccess.getEReferenceAccess().getRightParenthesisKeyword_18_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:5013:3: (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==52) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalAlgae.g:5014:4: otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_33, grammarAccess.getEReferenceAccess().getEAnnotationsKeyword_19_0());
                    			
                    otherlv_34=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_34, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_19_1());
                    			
                    // InternalAlgae.g:5022:4: ( (lv_eAnnotations_35_0= ruleEAnnotation ) )
                    // InternalAlgae.g:5023:5: (lv_eAnnotations_35_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:5023:5: (lv_eAnnotations_35_0= ruleEAnnotation )
                    // InternalAlgae.g:5024:6: lv_eAnnotations_35_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEAnnotationsEAnnotationParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eAnnotations_35_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_35_0,
                    							"org.atlanmod.analysis.Algae.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:5041:4: (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )*
                    loop128:
                    do {
                        int alt128=2;
                        int LA128_0 = input.LA(1);

                        if ( (LA128_0==13) ) {
                            alt128=1;
                        }


                        switch (alt128) {
                    	case 1 :
                    	    // InternalAlgae.g:5042:5: otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_36=(Token)match(input,13,FOLLOW_48); 

                    	    					newLeafNode(otherlv_36, grammarAccess.getEReferenceAccess().getCommaKeyword_19_3_0());
                    	    				
                    	    // InternalAlgae.g:5046:5: ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:5047:6: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:5047:6: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    // InternalAlgae.g:5048:7: lv_eAnnotations_37_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEReferenceAccess().getEAnnotationsEAnnotationParserRuleCall_19_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eAnnotations_37_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_37_0,
                    	    								"org.atlanmod.analysis.Algae.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop128;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,14,FOLLOW_100); 

                    				newLeafNode(otherlv_38, grammarAccess.getEReferenceAccess().getRightCurlyBracketKeyword_19_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:5071:3: (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==64) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalAlgae.g:5072:4: otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    {
                    otherlv_39=(Token)match(input,64,FOLLOW_56); 

                    				newLeafNode(otherlv_39, grammarAccess.getEReferenceAccess().getEGenericTypeKeyword_20_0());
                    			
                    // InternalAlgae.g:5076:4: ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    // InternalAlgae.g:5077:5: (lv_eGenericType_40_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:5077:5: (lv_eGenericType_40_0= ruleEGenericType )
                    // InternalAlgae.g:5078:6: lv_eGenericType_40_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEGenericTypeEGenericTypeParserRuleCall_20_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_eGenericType_40_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEReferenceRule());
                    						}
                    						set(
                    							current,
                    							"eGenericType",
                    							lv_eGenericType_40_0,
                    							"org.atlanmod.analysis.Algae.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_41=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_41, grammarAccess.getEReferenceAccess().getRightCurlyBracketKeyword_21());
            		

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
    // $ANTLR end "ruleEReference"


    // $ANTLR start "entryRuleEDataType_Impl"
    // InternalAlgae.g:5104:1: entryRuleEDataType_Impl returns [EObject current=null] : iv_ruleEDataType_Impl= ruleEDataType_Impl EOF ;
    public final EObject entryRuleEDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataType_Impl = null;


        try {
            // InternalAlgae.g:5104:55: (iv_ruleEDataType_Impl= ruleEDataType_Impl EOF )
            // InternalAlgae.g:5105:2: iv_ruleEDataType_Impl= ruleEDataType_Impl EOF
            {
             newCompositeNode(grammarAccess.getEDataType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDataType_Impl=ruleEDataType_Impl();

            state._fsp--;

             current =iv_ruleEDataType_Impl; 
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
    // $ANTLR end "entryRuleEDataType_Impl"


    // $ANTLR start "ruleEDataType_Impl"
    // InternalAlgae.g:5111:1: ruleEDataType_Impl returns [EObject current=null] : ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleEDataType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_5_0 = null;

        AntlrDatatypeRuleToken lv_instanceTypeName_7_0 = null;

        AntlrDatatypeRuleToken lv_serializable_9_0 = null;

        EObject lv_eAnnotations_12_0 = null;

        EObject lv_eAnnotations_14_0 = null;

        EObject lv_eTypeParameters_18_0 = null;

        EObject lv_eTypeParameters_20_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:5117:2: ( ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalAlgae.g:5118:2: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalAlgae.g:5118:2: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalAlgae.g:5119:3: () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalAlgae.g:5119:3: ()
            // InternalAlgae.g:5120:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDataType_ImplAccess().getEDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,99,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEDataType_ImplAccess().getEDataTypeKeyword_1());
            		
            // InternalAlgae.g:5130:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAlgae.g:5131:4: (lv_name_2_0= ruleEString )
            {
            // InternalAlgae.g:5131:4: (lv_name_2_0= ruleEString )
            // InternalAlgae.g:5132:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEDataType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_116); 

            			newLeafNode(otherlv_3, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAlgae.g:5153:3: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==47) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalAlgae.g:5154:4: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEDataType_ImplAccess().getInstanceClassNameKeyword_4_0());
                    			
                    // InternalAlgae.g:5158:4: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // InternalAlgae.g:5159:5: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // InternalAlgae.g:5159:5: (lv_instanceClassName_5_0= ruleEString )
                    // InternalAlgae.g:5160:6: lv_instanceClassName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_117);
                    lv_instanceClassName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"instanceClassName",
                    							lv_instanceClassName_5_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:5178:3: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==48) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalAlgae.g:5179:4: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameKeyword_5_0());
                    			
                    // InternalAlgae.g:5183:4: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // InternalAlgae.g:5184:5: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // InternalAlgae.g:5184:5: (lv_instanceTypeName_7_0= ruleEString )
                    // InternalAlgae.g:5185:6: lv_instanceTypeName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_118);
                    lv_instanceTypeName_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"instanceTypeName",
                    							lv_instanceTypeName_7_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:5203:3: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==100) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalAlgae.g:5204:4: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,100,FOLLOW_58); 

                    				newLeafNode(otherlv_8, grammarAccess.getEDataType_ImplAccess().getSerializableKeyword_6_0());
                    			
                    // InternalAlgae.g:5208:4: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // InternalAlgae.g:5209:5: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:5209:5: (lv_serializable_9_0= ruleEBoolean )
                    // InternalAlgae.g:5210:6: lv_serializable_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getSerializableEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_119);
                    lv_serializable_9_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						set(
                    							current,
                    							"serializable",
                    							lv_serializable_9_0,
                    							"org.atlanmod.analysis.Algae.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:5228:3: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==52) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalAlgae.g:5229:4: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEDataType_ImplAccess().getEAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_11, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalAlgae.g:5237:4: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // InternalAlgae.g:5238:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:5238:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // InternalAlgae.g:5239:6: lv_eAnnotations_12_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getEAnnotationsEAnnotationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eAnnotations_12_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_12_0,
                    							"org.atlanmod.analysis.Algae.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:5256:4: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop134:
                    do {
                        int alt134=2;
                        int LA134_0 = input.LA(1);

                        if ( (LA134_0==13) ) {
                            alt134=1;
                        }


                        switch (alt134) {
                    	case 1 :
                    	    // InternalAlgae.g:5257:5: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_48); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalAlgae.g:5261:5: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:5262:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:5262:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // InternalAlgae.g:5263:7: lv_eAnnotations_14_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEDataType_ImplAccess().getEAnnotationsEAnnotationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eAnnotations_14_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_14_0,
                    	    								"org.atlanmod.analysis.Algae.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop134;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,14,FOLLOW_120); 

                    				newLeafNode(otherlv_15, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:5286:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==53) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalAlgae.g:5287:4: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEDataType_ImplAccess().getETypeParametersKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_17, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalAlgae.g:5295:4: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // InternalAlgae.g:5296:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // InternalAlgae.g:5296:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // InternalAlgae.g:5297:6: lv_eTypeParameters_18_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getETypeParametersETypeParameterParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eTypeParameters_18_0=ruleETypeParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    						}
                    						add(
                    							current,
                    							"eTypeParameters",
                    							lv_eTypeParameters_18_0,
                    							"org.atlanmod.analysis.Algae.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:5314:4: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==13) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // InternalAlgae.g:5315:5: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,13,FOLLOW_50); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalAlgae.g:5319:5: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // InternalAlgae.g:5320:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // InternalAlgae.g:5320:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // InternalAlgae.g:5321:7: lv_eTypeParameters_20_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEDataType_ImplAccess().getETypeParametersETypeParameterParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eTypeParameters_20_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEDataType_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeParameters",
                    	    								lv_eTypeParameters_20_0,
                    	    								"org.atlanmod.analysis.Algae.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,14,FOLLOW_32); 

                    				newLeafNode(otherlv_21, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleEDataType_Impl"


    // $ANTLR start "entryRuleEEnum"
    // InternalAlgae.g:5352:1: entryRuleEEnum returns [EObject current=null] : iv_ruleEEnum= ruleEEnum EOF ;
    public final EObject entryRuleEEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnum = null;


        try {
            // InternalAlgae.g:5352:46: (iv_ruleEEnum= ruleEEnum EOF )
            // InternalAlgae.g:5353:2: iv_ruleEEnum= ruleEEnum EOF
            {
             newCompositeNode(grammarAccess.getEEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEEnum=ruleEEnum();

            state._fsp--;

             current =iv_ruleEEnum; 
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
    // $ANTLR end "entryRuleEEnum"


    // $ANTLR start "ruleEEnum"
    // InternalAlgae.g:5359:1: ruleEEnum returns [EObject current=null] : ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleEEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_5_0 = null;

        AntlrDatatypeRuleToken lv_instanceTypeName_7_0 = null;

        AntlrDatatypeRuleToken lv_serializable_9_0 = null;

        EObject lv_eAnnotations_12_0 = null;

        EObject lv_eAnnotations_14_0 = null;

        EObject lv_eTypeParameters_18_0 = null;

        EObject lv_eTypeParameters_20_0 = null;

        EObject lv_eLiterals_24_0 = null;

        EObject lv_eLiterals_26_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:5365:2: ( ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalAlgae.g:5366:2: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalAlgae.g:5366:2: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalAlgae.g:5367:3: () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // InternalAlgae.g:5367:3: ()
            // InternalAlgae.g:5368:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnumAccess().getEEnumAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,101,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnumAccess().getEEnumKeyword_1());
            		
            // InternalAlgae.g:5378:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAlgae.g:5379:4: (lv_name_2_0= ruleEString )
            {
            // InternalAlgae.g:5379:4: (lv_name_2_0= ruleEString )
            // InternalAlgae.g:5380:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEEnumAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEEnumRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_121); 

            			newLeafNode(otherlv_3, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAlgae.g:5401:3: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==47) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalAlgae.g:5402:4: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEEnumAccess().getInstanceClassNameKeyword_4_0());
                    			
                    // InternalAlgae.g:5406:4: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // InternalAlgae.g:5407:5: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // InternalAlgae.g:5407:5: (lv_instanceClassName_5_0= ruleEString )
                    // InternalAlgae.g:5408:6: lv_instanceClassName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getInstanceClassNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_122);
                    lv_instanceClassName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						set(
                    							current,
                    							"instanceClassName",
                    							lv_instanceClassName_5_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:5426:3: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==48) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalAlgae.g:5427:4: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEEnumAccess().getInstanceTypeNameKeyword_5_0());
                    			
                    // InternalAlgae.g:5431:4: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // InternalAlgae.g:5432:5: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // InternalAlgae.g:5432:5: (lv_instanceTypeName_7_0= ruleEString )
                    // InternalAlgae.g:5433:6: lv_instanceTypeName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_123);
                    lv_instanceTypeName_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						set(
                    							current,
                    							"instanceTypeName",
                    							lv_instanceTypeName_7_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:5451:3: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==100) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalAlgae.g:5452:4: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,100,FOLLOW_58); 

                    				newLeafNode(otherlv_8, grammarAccess.getEEnumAccess().getSerializableKeyword_6_0());
                    			
                    // InternalAlgae.g:5456:4: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // InternalAlgae.g:5457:5: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:5457:5: (lv_serializable_9_0= ruleEBoolean )
                    // InternalAlgae.g:5458:6: lv_serializable_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getSerializableEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_124);
                    lv_serializable_9_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						set(
                    							current,
                    							"serializable",
                    							lv_serializable_9_0,
                    							"org.atlanmod.analysis.Algae.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:5476:3: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==52) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalAlgae.g:5477:4: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEEnumAccess().getEAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_11, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalAlgae.g:5485:4: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // InternalAlgae.g:5486:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:5486:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // InternalAlgae.g:5487:6: lv_eAnnotations_12_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getEAnnotationsEAnnotationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eAnnotations_12_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_12_0,
                    							"org.atlanmod.analysis.Algae.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:5504:4: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==13) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // InternalAlgae.g:5505:5: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_48); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEEnumAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalAlgae.g:5509:5: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:5510:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:5510:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // InternalAlgae.g:5511:7: lv_eAnnotations_14_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumAccess().getEAnnotationsEAnnotationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eAnnotations_14_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_14_0,
                    	    								"org.atlanmod.analysis.Algae.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop141;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,14,FOLLOW_125); 

                    				newLeafNode(otherlv_15, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:5534:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==53) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalAlgae.g:5535:4: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEEnumAccess().getETypeParametersKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_17, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalAlgae.g:5543:4: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // InternalAlgae.g:5544:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // InternalAlgae.g:5544:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // InternalAlgae.g:5545:6: lv_eTypeParameters_18_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getETypeParametersETypeParameterParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eTypeParameters_18_0=ruleETypeParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						add(
                    							current,
                    							"eTypeParameters",
                    							lv_eTypeParameters_18_0,
                    							"org.atlanmod.analysis.Algae.ETypeParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:5562:4: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop143:
                    do {
                        int alt143=2;
                        int LA143_0 = input.LA(1);

                        if ( (LA143_0==13) ) {
                            alt143=1;
                        }


                        switch (alt143) {
                    	case 1 :
                    	    // InternalAlgae.g:5563:5: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,13,FOLLOW_50); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEEnumAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalAlgae.g:5567:5: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // InternalAlgae.g:5568:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // InternalAlgae.g:5568:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // InternalAlgae.g:5569:7: lv_eTypeParameters_20_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumAccess().getETypeParametersETypeParameterParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eTypeParameters_20_0=ruleETypeParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eTypeParameters",
                    	    								lv_eTypeParameters_20_0,
                    	    								"org.atlanmod.analysis.Algae.ETypeParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop143;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,14,FOLLOW_126); 

                    				newLeafNode(otherlv_21, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:5592:3: (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==102) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalAlgae.g:5593:4: otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,102,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getEEnumAccess().getELiteralsKeyword_9_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_127); 

                    				newLeafNode(otherlv_23, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalAlgae.g:5601:4: ( (lv_eLiterals_24_0= ruleEEnumLiteral ) )
                    // InternalAlgae.g:5602:5: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    {
                    // InternalAlgae.g:5602:5: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    // InternalAlgae.g:5603:6: lv_eLiterals_24_0= ruleEEnumLiteral
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eLiterals_24_0=ruleEEnumLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumRule());
                    						}
                    						add(
                    							current,
                    							"eLiterals",
                    							lv_eLiterals_24_0,
                    							"org.atlanmod.analysis.Algae.EEnumLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:5620:4: (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )*
                    loop145:
                    do {
                        int alt145=2;
                        int LA145_0 = input.LA(1);

                        if ( (LA145_0==13) ) {
                            alt145=1;
                        }


                        switch (alt145) {
                    	case 1 :
                    	    // InternalAlgae.g:5621:5: otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    {
                    	    otherlv_25=(Token)match(input,13,FOLLOW_127); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEEnumAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalAlgae.g:5625:5: ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    // InternalAlgae.g:5626:6: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    {
                    	    // InternalAlgae.g:5626:6: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    // InternalAlgae.g:5627:7: lv_eLiterals_26_0= ruleEEnumLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eLiterals_26_0=ruleEEnumLiteral();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEEnumRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eLiterals",
                    	    								lv_eLiterals_26_0,
                    	    								"org.atlanmod.analysis.Algae.EEnumLiteral");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop145;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,14,FOLLOW_32); 

                    				newLeafNode(otherlv_27, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleEEnum"


    // $ANTLR start "entryRuleEEnumLiteral"
    // InternalAlgae.g:5658:1: entryRuleEEnumLiteral returns [EObject current=null] : iv_ruleEEnumLiteral= ruleEEnumLiteral EOF ;
    public final EObject entryRuleEEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnumLiteral = null;


        try {
            // InternalAlgae.g:5658:53: (iv_ruleEEnumLiteral= ruleEEnumLiteral EOF )
            // InternalAlgae.g:5659:2: iv_ruleEEnumLiteral= ruleEEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getEEnumLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEEnumLiteral=ruleEEnumLiteral();

            state._fsp--;

             current =iv_ruleEEnumLiteral; 
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
    // $ANTLR end "entryRuleEEnumLiteral"


    // $ANTLR start "ruleEEnumLiteral"
    // InternalAlgae.g:5665:1: ruleEEnumLiteral returns [EObject current=null] : ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleEEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_literal_7_0 = null;

        EObject lv_eAnnotations_10_0 = null;

        EObject lv_eAnnotations_12_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:5671:2: ( ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalAlgae.g:5672:2: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalAlgae.g:5672:2: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalAlgae.g:5673:3: () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalAlgae.g:5673:3: ()
            // InternalAlgae.g:5674:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnumLiteralAccess().getEEnumLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,103,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnumLiteralAccess().getEEnumLiteralKeyword_1());
            		
            // InternalAlgae.g:5684:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAlgae.g:5685:4: (lv_name_2_0= ruleEString )
            {
            // InternalAlgae.g:5685:4: (lv_name_2_0= ruleEString )
            // InternalAlgae.g:5686:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEEnumLiteralAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_128); 

            			newLeafNode(otherlv_3, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAlgae.g:5707:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==84) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalAlgae.g:5708:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,84,FOLLOW_61); 

                    				newLeafNode(otherlv_4, grammarAccess.getEEnumLiteralAccess().getValueKeyword_4_0());
                    			
                    // InternalAlgae.g:5712:4: ( (lv_value_5_0= ruleEInt ) )
                    // InternalAlgae.g:5713:5: (lv_value_5_0= ruleEInt )
                    {
                    // InternalAlgae.g:5713:5: (lv_value_5_0= ruleEInt )
                    // InternalAlgae.g:5714:6: lv_value_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getValueEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_129);
                    lv_value_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.atlanmod.analysis.Algae.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:5732:3: (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==104) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalAlgae.g:5733:4: otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,104,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEEnumLiteralAccess().getLiteralKeyword_5_0());
                    			
                    // InternalAlgae.g:5737:4: ( (lv_literal_7_0= ruleEString ) )
                    // InternalAlgae.g:5738:5: (lv_literal_7_0= ruleEString )
                    {
                    // InternalAlgae.g:5738:5: (lv_literal_7_0= ruleEString )
                    // InternalAlgae.g:5739:6: lv_literal_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getLiteralEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_130);
                    lv_literal_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    						}
                    						set(
                    							current,
                    							"literal",
                    							lv_literal_7_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:5757:3: (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==52) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalAlgae.g:5758:4: otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEEnumLiteralAccess().getEAnnotationsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_9, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalAlgae.g:5766:4: ( (lv_eAnnotations_10_0= ruleEAnnotation ) )
                    // InternalAlgae.g:5767:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:5767:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    // InternalAlgae.g:5768:6: lv_eAnnotations_10_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getEAnnotationsEAnnotationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eAnnotations_10_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_10_0,
                    							"org.atlanmod.analysis.Algae.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:5785:4: (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )*
                    loop149:
                    do {
                        int alt149=2;
                        int LA149_0 = input.LA(1);

                        if ( (LA149_0==13) ) {
                            alt149=1;
                        }


                        switch (alt149) {
                    	case 1 :
                    	    // InternalAlgae.g:5786:5: otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,13,FOLLOW_48); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getEEnumLiteralAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalAlgae.g:5790:5: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:5791:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:5791:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    // InternalAlgae.g:5792:7: lv_eAnnotations_12_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumLiteralAccess().getEAnnotationsEAnnotationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eAnnotations_12_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEEnumLiteralRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_12_0,
                    	    								"org.atlanmod.analysis.Algae.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop149;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,14,FOLLOW_32); 

                    				newLeafNode(otherlv_13, grammarAccess.getEEnumLiteralAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getEEnumLiteralAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleEEnumLiteral"


    // $ANTLR start "entryRuleEParameter"
    // InternalAlgae.g:5823:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalAlgae.g:5823:51: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalAlgae.g:5824:2: iv_ruleEParameter= ruleEParameter EOF
            {
             newCompositeNode(grammarAccess.getEParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEParameter=ruleEParameter();

            state._fsp--;

             current =iv_ruleEParameter; 
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
    // $ANTLR end "entryRuleEParameter"


    // $ANTLR start "ruleEParameter"
    // InternalAlgae.g:5830:1: ruleEParameter returns [EObject current=null] : ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) ;
    public final EObject ruleEParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_ordered_5_0 = null;

        AntlrDatatypeRuleToken lv_unique_7_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_9_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_11_0 = null;

        EObject lv_eAnnotations_16_0 = null;

        EObject lv_eAnnotations_18_0 = null;

        EObject lv_eGenericType_21_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:5836:2: ( ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) )
            // InternalAlgae.g:5837:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            {
            // InternalAlgae.g:5837:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            // InternalAlgae.g:5838:3: () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}'
            {
            // InternalAlgae.g:5838:3: ()
            // InternalAlgae.g:5839:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEParameterAccess().getEParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,105,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getEParameterKeyword_1());
            		
            // InternalAlgae.g:5849:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAlgae.g:5850:4: (lv_name_2_0= ruleEString )
            {
            // InternalAlgae.g:5850:4: (lv_name_2_0= ruleEString )
            // InternalAlgae.g:5851:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_131); 

            			newLeafNode(otherlv_3, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAlgae.g:5872:3: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==58) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalAlgae.g:5873:4: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,58,FOLLOW_58); 

                    				newLeafNode(otherlv_4, grammarAccess.getEParameterAccess().getOrderedKeyword_4_0());
                    			
                    // InternalAlgae.g:5877:4: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // InternalAlgae.g:5878:5: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:5878:5: (lv_ordered_5_0= ruleEBoolean )
                    // InternalAlgae.g:5879:6: lv_ordered_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getOrderedEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_132);
                    lv_ordered_5_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"ordered",
                    							lv_ordered_5_0,
                    							"org.atlanmod.analysis.Algae.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:5897:3: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==59) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalAlgae.g:5898:4: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,59,FOLLOW_58); 

                    				newLeafNode(otherlv_6, grammarAccess.getEParameterAccess().getUniqueKeyword_5_0());
                    			
                    // InternalAlgae.g:5902:4: ( (lv_unique_7_0= ruleEBoolean ) )
                    // InternalAlgae.g:5903:5: (lv_unique_7_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:5903:5: (lv_unique_7_0= ruleEBoolean )
                    // InternalAlgae.g:5904:6: lv_unique_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getUniqueEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_133);
                    lv_unique_7_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"unique",
                    							lv_unique_7_0,
                    							"org.atlanmod.analysis.Algae.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:5922:3: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==60) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalAlgae.g:5923:4: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,60,FOLLOW_61); 

                    				newLeafNode(otherlv_8, grammarAccess.getEParameterAccess().getLowerBoundKeyword_6_0());
                    			
                    // InternalAlgae.g:5927:4: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // InternalAlgae.g:5928:5: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // InternalAlgae.g:5928:5: (lv_lowerBound_9_0= ruleEInt )
                    // InternalAlgae.g:5929:6: lv_lowerBound_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getLowerBoundEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_134);
                    lv_lowerBound_9_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_9_0,
                    							"org.atlanmod.analysis.Algae.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:5947:3: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==61) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // InternalAlgae.g:5948:4: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,61,FOLLOW_61); 

                    				newLeafNode(otherlv_10, grammarAccess.getEParameterAccess().getUpperBoundKeyword_7_0());
                    			
                    // InternalAlgae.g:5952:4: ( (lv_upperBound_11_0= ruleEInt ) )
                    // InternalAlgae.g:5953:5: (lv_upperBound_11_0= ruleEInt )
                    {
                    // InternalAlgae.g:5953:5: (lv_upperBound_11_0= ruleEInt )
                    // InternalAlgae.g:5954:6: lv_upperBound_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getUpperBoundEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_98);
                    lv_upperBound_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_11_0,
                    							"org.atlanmod.analysis.Algae.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:5972:3: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==62) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // InternalAlgae.g:5973:4: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEParameterAccess().getETypeKeyword_8_0());
                    			
                    // InternalAlgae.g:5977:4: ( ( ruleEString ) )
                    // InternalAlgae.g:5978:5: ( ruleEString )
                    {
                    // InternalAlgae.g:5978:5: ( ruleEString )
                    // InternalAlgae.g:5979:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEParameterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEParameterAccess().getETypeEClassifierCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_99);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:5994:3: (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==52) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalAlgae.g:5995:4: otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getEParameterAccess().getEAnnotationsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_15, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalAlgae.g:6003:4: ( (lv_eAnnotations_16_0= ruleEAnnotation ) )
                    // InternalAlgae.g:6004:5: (lv_eAnnotations_16_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:6004:5: (lv_eAnnotations_16_0= ruleEAnnotation )
                    // InternalAlgae.g:6005:6: lv_eAnnotations_16_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getEAnnotationsEAnnotationParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_eAnnotations_16_0=ruleEAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						add(
                    							current,
                    							"eAnnotations",
                    							lv_eAnnotations_16_0,
                    							"org.atlanmod.analysis.Algae.EAnnotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:6022:4: (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )*
                    loop156:
                    do {
                        int alt156=2;
                        int LA156_0 = input.LA(1);

                        if ( (LA156_0==13) ) {
                            alt156=1;
                        }


                        switch (alt156) {
                    	case 1 :
                    	    // InternalAlgae.g:6023:5: otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_17=(Token)match(input,13,FOLLOW_48); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEParameterAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalAlgae.g:6027:5: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:6028:6: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:6028:6: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    // InternalAlgae.g:6029:7: lv_eAnnotations_18_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEParameterAccess().getEAnnotationsEAnnotationParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_eAnnotations_18_0=ruleEAnnotation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eAnnotations",
                    	    								lv_eAnnotations_18_0,
                    	    								"org.atlanmod.analysis.Algae.EAnnotation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop156;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,14,FOLLOW_100); 

                    				newLeafNode(otherlv_19, grammarAccess.getEParameterAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:6052:3: (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==64) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalAlgae.g:6053:4: otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    {
                    otherlv_20=(Token)match(input,64,FOLLOW_56); 

                    				newLeafNode(otherlv_20, grammarAccess.getEParameterAccess().getEGenericTypeKeyword_10_0());
                    			
                    // InternalAlgae.g:6057:4: ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    // InternalAlgae.g:6058:5: (lv_eGenericType_21_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:6058:5: (lv_eGenericType_21_0= ruleEGenericType )
                    // InternalAlgae.g:6059:6: lv_eGenericType_21_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getEGenericTypeEGenericTypeParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_eGenericType_21_0=ruleEGenericType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterRule());
                    						}
                    						set(
                    							current,
                    							"eGenericType",
                    							lv_eGenericType_21_0,
                    							"org.atlanmod.analysis.Algae.EGenericType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getEParameterAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleEParameter"


    // $ANTLR start "ruleVisibility"
    // InternalAlgae.g:6085:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAlgae.g:6091:2: ( ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) ) )
            // InternalAlgae.g:6092:2: ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) )
            {
            // InternalAlgae.g:6092:2: ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) )
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==106) ) {
                alt159=1;
            }
            else if ( (LA159_0==107) ) {
                alt159=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 159, 0, input);

                throw nvae;
            }
            switch (alt159) {
                case 1 :
                    // InternalAlgae.g:6093:3: (enumLiteral_0= 'LOCAL' )
                    {
                    // InternalAlgae.g:6093:3: (enumLiteral_0= 'LOCAL' )
                    // InternalAlgae.g:6094:4: enumLiteral_0= 'LOCAL'
                    {
                    enumLiteral_0=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getLOCALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlgae.g:6101:3: (enumLiteral_1= 'GLOBAL' )
                    {
                    // InternalAlgae.g:6101:3: (enumLiteral_1= 'GLOBAL' )
                    // InternalAlgae.g:6102:4: enumLiteral_1= 'GLOBAL'
                    {
                    enumLiteral_1=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getGLOBALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getGLOBALEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleVisibility"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\13\uffff\1\20\12\uffff";
    static final String dfa_3s = "\2\4\2\17\2\4\1\uffff\2\17\2\22\1\4\2\uffff\2\17\6\uffff";
    static final String dfa_4s = "\1\20\1\5\2\25\2\5\1\uffff\2\25\2\22\1\43\2\uffff\2\31\6\uffff";
    static final String dfa_5s = "\6\uffff\1\10\5\uffff\1\11\1\3\2\uffff\1\1\1\2\1\5\1\6\1\7\1\4";
    static final String dfa_6s = "\26\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\12\uffff\1\1",
            "\1\2\1\3",
            "\1\5\1\uffff\1\4\3\uffff\1\6",
            "\1\5\1\uffff\1\4\3\uffff\1\6",
            "\1\7\1\10",
            "\1\11\1\12",
            "",
            "\1\5\5\uffff\1\6",
            "\1\5\5\uffff\1\6",
            "\1\13",
            "\1\13",
            "\1\16\1\17\1\20\6\uffff\4\20\2\uffff\1\21\1\15\5\uffff\3\14\6\uffff\1\20",
            "",
            "",
            "\1\20\1\uffff\1\20\3\uffff\1\20\1\22\1\24\1\25\1\23",
            "\1\20\1\uffff\1\20\3\uffff\1\20\1\22\1\24\1\25\1\23",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "182:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureUnboundProductOperation_3= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_4= ruleMeasureUnboundSumOperation | this_MeasureUnboundDivisionOperation_5= ruleMeasureUnboundDivisionOperation | this_MeasureUnboundSubstractOperation_6= ruleMeasureUnboundSubstractOperation | this_RealTimeDuration_7= ruleRealTimeDuration | this_CompositeMeasure_8= ruleCompositeMeasure )";
        }
    }
    static final String dfa_8s = "\16\uffff";
    static final String dfa_9s = "\2\4\2\17\2\4\2\17\2\22\1\32\3\uffff";
    static final String dfa_10s = "\1\20\1\5\2\21\2\5\2\17\2\22\1\34\3\uffff";
    static final String dfa_11s = "\13\uffff\1\1\1\3\1\2";
    static final String dfa_12s = "\16\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\1\3\12\uffff\1\1",
            "\1\2\1\3",
            "\1\5\1\uffff\1\4",
            "\1\5\1\uffff\1\4",
            "\1\6\1\7",
            "\1\10\1\11",
            "\1\5",
            "\1\5",
            "\1\12",
            "\1\12",
            "\1\13\1\15\1\14",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "281:2: (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure | this_IntegrationMeasure_2= ruleIntegrationMeasure )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000016030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000006000004000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x01F3800000004000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x01F3000000004000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x01F2000000004000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0008000000002000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x01F0000000004000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x01E0000000004000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x01C0000000004000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0180000000004000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x00000000CFC00000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0100000000004000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0xFC30000000004000L,0x0000000000000007L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0xF830000000004000L,0x0000000000000007L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0xF030000000004000L,0x0000000000000007L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0xE030000000004000L,0x0000000000000007L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0xC030000000004000L,0x0000000000000007L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x8030000000004000L,0x0000000000000007L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0030000000004000L,0x0000000000000007L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0020000000004000L,0x0000000000000007L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0020000000004000L,0x0000000000000006L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000006L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000004L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0010000000004000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0010000000004000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0010000000004000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000004000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000080L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0010000000004000L,0x0000000000000200L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000200L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000004000L,0x000000000003E000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000004000L,0x000000000003C000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000004000L,0x0000000000038000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000004000L,0x0000000000030000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000004000L,0x0000000000020000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000004000L,0x0000000000180000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000004000L,0x0000000000100000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x000000000F800000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x000000000F000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x000000000E000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x7C10000000004000L,0x0000000030000001L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x7810000000004000L,0x0000000030000001L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x7010000000004000L,0x0000000030000001L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x6010000000004000L,0x0000000030000001L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x4010000000004000L,0x0000000030000001L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x4010000000004000L,0x0000000020000001L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x4010000000004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0010000000004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x00000000C3800000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x00000000C3000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x00000000C2000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x7C10000000004000L,0x0000000730000001L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x7810000000004000L,0x0000000730000001L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x7010000000004000L,0x0000000730000001L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x6010000000004000L,0x0000000730000001L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x4010000000004000L,0x0000000730000001L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x4010000000004000L,0x0000000720000001L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x4010000000004000L,0x0000000700000001L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x4010000000004000L,0x0000000600000001L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0010000000004000L,0x0000000600000001L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0010000000004000L,0x0000000400000001L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0031800000004000L,0x0000001000000000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0031000000004000L,0x0000001000000000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0030000000004000L,0x0000001000000000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0030000000004000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0020000000004000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0031800000004000L,0x0000005000000000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0031000000004000L,0x0000005000000000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0030000000004000L,0x0000005000000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0030000000004000L,0x0000004000000000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0020000000004000L,0x0000004000000000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000004000L,0x0000004000000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0010000000004000L,0x0000010000100000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0010000000004000L,0x0000010000000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0010000000004000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x7C10000000004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x7810000000004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x7010000000004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x6010000000004000L,0x0000000000000001L});

}