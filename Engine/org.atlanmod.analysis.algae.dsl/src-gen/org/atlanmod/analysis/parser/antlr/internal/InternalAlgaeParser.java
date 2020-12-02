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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Platform'", "'{'", "','", "'}'", "'.'", "'post'", "'='", "'ocl:'", "'attribute:'", "'as'", "'.absoluteTime'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'exp'", "'logistic'", "'integral'", "'['", "';'", "']'", "'NormalDistribution'", "'Interval'", "'lowerEndpoint'", "'upperEndpoint'", "'Sampling'", "'measurementProcedure'", "'samples'", "'Integral'", "'function'", "'interval'", "'Sample'", "'quantity'", "'abstract'", "'interface'", "'EClass'", "'instanceClassName'", "'instanceTypeName'", "'eSuperTypes'", "'eAnnotations'", "'eTypeParameters'", "'eOperations'", "'eStructuralFeatures'", "'eGenericSuperTypes'", "'EOperation'", "'ordered'", "'unique'", "'lowerBound'", "'upperBound'", "'eType'", "'eExceptions'", "'eGenericType'", "'eParameters'", "'eGenericExceptions'", "'EAnnotation'", "'source'", "'references'", "'details'", "'contents'", "'ETypeParameter'", "'eBounds'", "'true'", "'false'", "'EGenericType'", "'eTypeParameter'", "'eClassifier'", "'eUpperBound'", "'eTypeArguments'", "'eLowerBound'", "'EStringToStringMapEntry'", "'key'", "'value'", "'EObject'", "'volatile'", "'transient'", "'unsettable'", "'derived'", "'iD'", "'EAttribute'", "'changeable'", "'defaultValueLiteral'", "'containment'", "'EReference'", "'resolveProxies'", "'eOpposite'", "'eKeys'", "'EDataType'", "'serializable'", "'EEnum'", "'eLiterals'", "'EEnumLiteral'", "'literal'", "'EParameter'", "'duration'", "'frequency'", "'scalar'", "'LOCAL'", "'GLOBAL'"
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
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
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

                if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)||LA2_0==13||LA2_0==16||LA2_0==22) ) {
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
    // InternalAlgae.g:175:1: ruleMeasure returns [EObject current=null] : (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureUnboundProductOperation_4= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_5= ruleMeasureUnboundSumOperation | this_MeasureUnboundDivisionOperation_6= ruleMeasureUnboundDivisionOperation | this_MeasureUnboundSubstractOperation_7= ruleMeasureUnboundSubstractOperation | this_RealTimeDuration_8= ruleRealTimeDuration | this_CompositeMeasure_9= ruleCompositeMeasure | this_IntegrationMeasure_10= ruleIntegrationMeasure ) ;
    public final EObject ruleMeasure() throws RecognitionException {
        EObject current = null;

        EObject this_MeasureValue_Impl_0 = null;

        EObject this_MeasureOCL_1 = null;

        EObject this_MeasureAttribute_2 = null;

        EObject this_MeasureCast_3 = null;

        EObject this_MeasureUnboundProductOperation_4 = null;

        EObject this_MeasureUnboundSumOperation_5 = null;

        EObject this_MeasureUnboundDivisionOperation_6 = null;

        EObject this_MeasureUnboundSubstractOperation_7 = null;

        EObject this_RealTimeDuration_8 = null;

        EObject this_CompositeMeasure_9 = null;

        EObject this_IntegrationMeasure_10 = null;



        	enterRule();

        try {
            // InternalAlgae.g:181:2: ( (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureUnboundProductOperation_4= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_5= ruleMeasureUnboundSumOperation | this_MeasureUnboundDivisionOperation_6= ruleMeasureUnboundDivisionOperation | this_MeasureUnboundSubstractOperation_7= ruleMeasureUnboundSubstractOperation | this_RealTimeDuration_8= ruleRealTimeDuration | this_CompositeMeasure_9= ruleCompositeMeasure | this_IntegrationMeasure_10= ruleIntegrationMeasure ) )
            // InternalAlgae.g:182:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureUnboundProductOperation_4= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_5= ruleMeasureUnboundSumOperation | this_MeasureUnboundDivisionOperation_6= ruleMeasureUnboundDivisionOperation | this_MeasureUnboundSubstractOperation_7= ruleMeasureUnboundSubstractOperation | this_RealTimeDuration_8= ruleRealTimeDuration | this_CompositeMeasure_9= ruleCompositeMeasure | this_IntegrationMeasure_10= ruleIntegrationMeasure )
            {
            // InternalAlgae.g:182:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureUnboundProductOperation_4= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_5= ruleMeasureUnboundSumOperation | this_MeasureUnboundDivisionOperation_6= ruleMeasureUnboundDivisionOperation | this_MeasureUnboundSubstractOperation_7= ruleMeasureUnboundSubstractOperation | this_RealTimeDuration_8= ruleRealTimeDuration | this_CompositeMeasure_9= ruleCompositeMeasure | this_IntegrationMeasure_10= ruleIntegrationMeasure )
            int alt3=11;
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
                    // InternalAlgae.g:210:3: this_MeasureCast_3= ruleMeasureCast
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureCastParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureCast_3=ruleMeasureCast();

                    state._fsp--;


                    			current = this_MeasureCast_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAlgae.g:219:3: this_MeasureUnboundProductOperation_4= ruleMeasureUnboundProductOperation
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureUnboundProductOperationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureUnboundProductOperation_4=ruleMeasureUnboundProductOperation();

                    state._fsp--;


                    			current = this_MeasureUnboundProductOperation_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAlgae.g:228:3: this_MeasureUnboundSumOperation_5= ruleMeasureUnboundSumOperation
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureUnboundSumOperationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureUnboundSumOperation_5=ruleMeasureUnboundSumOperation();

                    state._fsp--;


                    			current = this_MeasureUnboundSumOperation_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAlgae.g:237:3: this_MeasureUnboundDivisionOperation_6= ruleMeasureUnboundDivisionOperation
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureUnboundDivisionOperationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureUnboundDivisionOperation_6=ruleMeasureUnboundDivisionOperation();

                    state._fsp--;


                    			current = this_MeasureUnboundDivisionOperation_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalAlgae.g:246:3: this_MeasureUnboundSubstractOperation_7= ruleMeasureUnboundSubstractOperation
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getMeasureUnboundSubstractOperationParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeasureUnboundSubstractOperation_7=ruleMeasureUnboundSubstractOperation();

                    state._fsp--;


                    			current = this_MeasureUnboundSubstractOperation_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalAlgae.g:255:3: this_RealTimeDuration_8= ruleRealTimeDuration
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getRealTimeDurationParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealTimeDuration_8=ruleRealTimeDuration();

                    state._fsp--;


                    			current = this_RealTimeDuration_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalAlgae.g:264:3: this_CompositeMeasure_9= ruleCompositeMeasure
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getCompositeMeasureParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeMeasure_9=ruleCompositeMeasure();

                    state._fsp--;


                    			current = this_CompositeMeasure_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalAlgae.g:273:3: this_IntegrationMeasure_10= ruleIntegrationMeasure
                    {

                    			newCompositeNode(grammarAccess.getMeasureAccess().getIntegrationMeasureParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegrationMeasure_10=ruleIntegrationMeasure();

                    state._fsp--;


                    			current = this_IntegrationMeasure_10;
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
    // InternalAlgae.g:285:1: entryRuleCompositeMeasure returns [EObject current=null] : iv_ruleCompositeMeasure= ruleCompositeMeasure EOF ;
    public final EObject entryRuleCompositeMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeMeasure = null;


        try {
            // InternalAlgae.g:285:57: (iv_ruleCompositeMeasure= ruleCompositeMeasure EOF )
            // InternalAlgae.g:286:2: iv_ruleCompositeMeasure= ruleCompositeMeasure EOF
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
    // InternalAlgae.g:292:1: ruleCompositeMeasure returns [EObject current=null] : (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure ) ;
    public final EObject ruleCompositeMeasure() throws RecognitionException {
        EObject current = null;

        EObject this_ExponentialMeasure_0 = null;

        EObject this_LogisticMeasure_1 = null;



        	enterRule();

        try {
            // InternalAlgae.g:298:2: ( (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure ) )
            // InternalAlgae.g:299:2: (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure )
            {
            // InternalAlgae.g:299:2: (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalAlgae.g:300:3: this_ExponentialMeasure_0= ruleExponentialMeasure
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
                    // InternalAlgae.g:309:3: this_LogisticMeasure_1= ruleLogisticMeasure
                    {

                    			newCompositeNode(grammarAccess.getCompositeMeasureAccess().getLogisticMeasureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogisticMeasure_1=ruleLogisticMeasure();

                    state._fsp--;


                    			current = this_LogisticMeasure_1;
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
    // InternalAlgae.g:321:1: entryRuleMeasurementUncertaintyInformation returns [EObject current=null] : iv_ruleMeasurementUncertaintyInformation= ruleMeasurementUncertaintyInformation EOF ;
    public final EObject entryRuleMeasurementUncertaintyInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurementUncertaintyInformation = null;


        try {
            // InternalAlgae.g:321:74: (iv_ruleMeasurementUncertaintyInformation= ruleMeasurementUncertaintyInformation EOF )
            // InternalAlgae.g:322:2: iv_ruleMeasurementUncertaintyInformation= ruleMeasurementUncertaintyInformation EOF
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
    // InternalAlgae.g:328:1: ruleMeasurementUncertaintyInformation returns [EObject current=null] : (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral ) ;
    public final EObject ruleMeasurementUncertaintyInformation() throws RecognitionException {
        EObject current = null;

        EObject this_NormalDistribution_0 = null;

        EObject this_Interval_1 = null;

        EObject this_Sampling_2 = null;

        EObject this_Integral_3 = null;



        	enterRule();

        try {
            // InternalAlgae.g:334:2: ( (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral ) )
            // InternalAlgae.g:335:2: (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral )
            {
            // InternalAlgae.g:335:2: (this_NormalDistribution_0= ruleNormalDistribution | this_Interval_1= ruleInterval | this_Sampling_2= ruleSampling | this_Integral_3= ruleIntegral )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt5=1;
                }
                break;
            case 35:
                {
                alt5=2;
                }
                break;
            case 38:
                {
                alt5=3;
                }
                break;
            case 41:
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
                    // InternalAlgae.g:336:3: this_NormalDistribution_0= ruleNormalDistribution
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
                    // InternalAlgae.g:345:3: this_Interval_1= ruleInterval
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
                    // InternalAlgae.g:354:3: this_Sampling_2= ruleSampling
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
                    // InternalAlgae.g:363:3: this_Integral_3= ruleIntegral
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
    // InternalAlgae.g:375:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAlgae.g:375:47: (iv_ruleEString= ruleEString EOF )
            // InternalAlgae.g:376:2: iv_ruleEString= ruleEString EOF
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
    // InternalAlgae.g:382:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAlgae.g:388:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAlgae.g:389:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAlgae.g:389:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalAlgae.g:390:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlgae.g:398:3: this_ID_1= RULE_ID
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
    // InternalAlgae.g:409:1: entryRuleEBigDecimal returns [String current=null] : iv_ruleEBigDecimal= ruleEBigDecimal EOF ;
    public final String entryRuleEBigDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigDecimal = null;


        try {
            // InternalAlgae.g:409:51: (iv_ruleEBigDecimal= ruleEBigDecimal EOF )
            // InternalAlgae.g:410:2: iv_ruleEBigDecimal= ruleEBigDecimal EOF
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
    // InternalAlgae.g:416:1: ruleEBigDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalAlgae.g:422:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalAlgae.g:423:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalAlgae.g:423:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalAlgae.g:424:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalAlgae.g:424:3: (this_INT_0= RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlgae.g:425:4: this_INT_0= RULE_INT
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
    // InternalAlgae.g:449:1: entryRuleMeasureValue_Impl returns [EObject current=null] : iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF ;
    public final EObject entryRuleMeasureValue_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureValue_Impl = null;


        try {
            // InternalAlgae.g:449:58: (iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF )
            // InternalAlgae.g:450:2: iv_ruleMeasureValue_Impl= ruleMeasureValue_Impl EOF
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
    // InternalAlgae.g:456:1: ruleMeasureValue_Impl returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (lv_value_9_0= ruleEBigDecimal ) )? ) ;
    public final EObject ruleMeasureValue_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        Enumerator lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_subname_7_0 = null;

        AntlrDatatypeRuleToken lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:462:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (lv_value_9_0= ruleEBigDecimal ) )? ) )
            // InternalAlgae.g:463:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (lv_value_9_0= ruleEBigDecimal ) )? )
            {
            // InternalAlgae.g:463:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (lv_value_9_0= ruleEBigDecimal ) )? )
            // InternalAlgae.g:464:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' ( (lv_value_9_0= ruleEBigDecimal ) )?
            {
            // InternalAlgae.g:464:3: ()
            // InternalAlgae.g:465:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureValue_ImplAccess().getMeasureValueAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:471:3: ( (lv_post_1_0= 'post' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAlgae.g:472:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:472:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:473:5: lv_post_1_0= 'post'
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

            // InternalAlgae.g:485:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalAlgae.g:486:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalAlgae.g:486:4: (lv_targetClass_2_0= ruleEString )
            // InternalAlgae.g:487:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalAlgae.g:504:3: (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_STRING) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==15) ) {
                        alt9=1;
                    }
                }
                else if ( (LA9_1==RULE_ID) ) {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3==15) ) {
                        alt9=1;
                    }
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalAlgae.g:505:4: otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureValue_ImplAccess().getFullStopKeyword_3_0());
                    			
                    // InternalAlgae.g:509:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalAlgae.g:510:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalAlgae.g:510:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalAlgae.g:511:6: lv_targetOperation_4_0= ruleEString
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

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureValue_ImplAccess().getFullStopKeyword_4());
            		
            // InternalAlgae.g:533:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=106 && LA10_0<=108)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAlgae.g:534:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalAlgae.g:534:4: ( (lv_type_6_0= ruleType ) )
                    // InternalAlgae.g:535:5: (lv_type_6_0= ruleType )
                    {
                    // InternalAlgae.g:535:5: (lv_type_6_0= ruleType )
                    // InternalAlgae.g:536:6: lv_type_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getTypeTypeEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_type_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.atlanmod.analysis.Algae.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlgae.g:554:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalAlgae.g:554:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalAlgae.g:555:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalAlgae.g:555:5: (lv_subname_7_0= ruleEString )
                    // InternalAlgae.g:556:6: lv_subname_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getSubnameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_subname_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_7_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureValue_ImplAccess().getEqualsSignKeyword_6());
            		
            // InternalAlgae.g:578:3: ( (lv_value_9_0= ruleEBigDecimal ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT||LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlgae.g:579:4: (lv_value_9_0= ruleEBigDecimal )
                    {
                    // InternalAlgae.g:579:4: (lv_value_9_0= ruleEBigDecimal )
                    // InternalAlgae.g:580:5: lv_value_9_0= ruleEBigDecimal
                    {

                    					newCompositeNode(grammarAccess.getMeasureValue_ImplAccess().getValueEBigDecimalParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_9_0=ruleEBigDecimal();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMeasureValue_ImplRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_9_0,
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
    // InternalAlgae.g:601:1: entryRuleMeasureOCL returns [EObject current=null] : iv_ruleMeasureOCL= ruleMeasureOCL EOF ;
    public final EObject entryRuleMeasureOCL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureOCL = null;


        try {
            // InternalAlgae.g:601:51: (iv_ruleMeasureOCL= ruleMeasureOCL EOF )
            // InternalAlgae.g:602:2: iv_ruleMeasureOCL= ruleMeasureOCL EOF
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
    // InternalAlgae.g:608:1: ruleMeasureOCL returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'ocl:' ( (lv_oclQuery_10_0= ruleEString ) ) ) ;
    public final EObject ruleMeasureOCL() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        Enumerator lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_subname_7_0 = null;

        AntlrDatatypeRuleToken lv_oclQuery_10_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:614:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'ocl:' ( (lv_oclQuery_10_0= ruleEString ) ) ) )
            // InternalAlgae.g:615:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'ocl:' ( (lv_oclQuery_10_0= ruleEString ) ) )
            {
            // InternalAlgae.g:615:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'ocl:' ( (lv_oclQuery_10_0= ruleEString ) ) )
            // InternalAlgae.g:616:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'ocl:' ( (lv_oclQuery_10_0= ruleEString ) )
            {
            // InternalAlgae.g:616:3: ()
            // InternalAlgae.g:617:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureOCLAccess().getMeasureOCLAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:623:3: ( (lv_post_1_0= 'post' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAlgae.g:624:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:624:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:625:5: lv_post_1_0= 'post'
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

            // InternalAlgae.g:637:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalAlgae.g:638:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalAlgae.g:638:4: (lv_targetClass_2_0= ruleEString )
            // InternalAlgae.g:639:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureOCLAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalAlgae.g:656:3: (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_STRING) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==15) ) {
                        alt13=1;
                    }
                }
                else if ( (LA13_1==RULE_ID) ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==15) ) {
                        alt13=1;
                    }
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalAlgae.g:657:4: otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureOCLAccess().getFullStopKeyword_3_0());
                    			
                    // InternalAlgae.g:661:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalAlgae.g:662:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalAlgae.g:662:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalAlgae.g:663:6: lv_targetOperation_4_0= ruleEString
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

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureOCLAccess().getFullStopKeyword_4());
            		
            // InternalAlgae.g:685:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=106 && LA14_0<=108)) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlgae.g:686:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalAlgae.g:686:4: ( (lv_type_6_0= ruleType ) )
                    // InternalAlgae.g:687:5: (lv_type_6_0= ruleType )
                    {
                    // InternalAlgae.g:687:5: (lv_type_6_0= ruleType )
                    // InternalAlgae.g:688:6: lv_type_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureOCLAccess().getTypeTypeEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_type_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.atlanmod.analysis.Algae.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlgae.g:706:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalAlgae.g:706:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalAlgae.g:707:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalAlgae.g:707:5: (lv_subname_7_0= ruleEString )
                    // InternalAlgae.g:708:6: lv_subname_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureOCLAccess().getSubnameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_subname_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_7_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureOCLAccess().getEqualsSignKeyword_6());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getMeasureOCLAccess().getOclKeyword_7());
            		
            // InternalAlgae.g:734:3: ( (lv_oclQuery_10_0= ruleEString ) )
            // InternalAlgae.g:735:4: (lv_oclQuery_10_0= ruleEString )
            {
            // InternalAlgae.g:735:4: (lv_oclQuery_10_0= ruleEString )
            // InternalAlgae.g:736:5: lv_oclQuery_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureOCLAccess().getOclQueryEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_oclQuery_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureOCLRule());
            					}
            					set(
            						current,
            						"oclQuery",
            						lv_oclQuery_10_0,
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
    // InternalAlgae.g:757:1: entryRuleMeasureAttribute returns [EObject current=null] : iv_ruleMeasureAttribute= ruleMeasureAttribute EOF ;
    public final EObject entryRuleMeasureAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureAttribute = null;


        try {
            // InternalAlgae.g:757:57: (iv_ruleMeasureAttribute= ruleMeasureAttribute EOF )
            // InternalAlgae.g:758:2: iv_ruleMeasureAttribute= ruleMeasureAttribute EOF
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
    // InternalAlgae.g:764:1: ruleMeasureAttribute returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'attribute:' ( (lv_att_10_0= ruleEString ) ) ) ;
    public final EObject ruleMeasureAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        Enumerator lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_subname_7_0 = null;

        AntlrDatatypeRuleToken lv_att_10_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:770:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'attribute:' ( (lv_att_10_0= ruleEString ) ) ) )
            // InternalAlgae.g:771:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'attribute:' ( (lv_att_10_0= ruleEString ) ) )
            {
            // InternalAlgae.g:771:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'attribute:' ( (lv_att_10_0= ruleEString ) ) )
            // InternalAlgae.g:772:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'attribute:' ( (lv_att_10_0= ruleEString ) )
            {
            // InternalAlgae.g:772:3: ()
            // InternalAlgae.g:773:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureAttributeAccess().getMeasureAttributeAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:779:3: ( (lv_post_1_0= 'post' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAlgae.g:780:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:780:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:781:5: lv_post_1_0= 'post'
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

            // InternalAlgae.g:793:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalAlgae.g:794:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalAlgae.g:794:4: (lv_targetClass_2_0= ruleEString )
            // InternalAlgae.g:795:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureAttributeAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalAlgae.g:812:3: (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==RULE_STRING) ) {
                    int LA16_2 = input.LA(3);

                    if ( (LA16_2==15) ) {
                        alt16=1;
                    }
                }
                else if ( (LA16_1==RULE_ID) ) {
                    int LA16_3 = input.LA(3);

                    if ( (LA16_3==15) ) {
                        alt16=1;
                    }
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalAlgae.g:813:4: otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureAttributeAccess().getFullStopKeyword_3_0());
                    			
                    // InternalAlgae.g:817:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalAlgae.g:818:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalAlgae.g:818:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalAlgae.g:819:6: lv_targetOperation_4_0= ruleEString
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

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasureAttributeAccess().getFullStopKeyword_4());
            		
            // InternalAlgae.g:841:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=106 && LA17_0<=108)) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalAlgae.g:842:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalAlgae.g:842:4: ( (lv_type_6_0= ruleType ) )
                    // InternalAlgae.g:843:5: (lv_type_6_0= ruleType )
                    {
                    // InternalAlgae.g:843:5: (lv_type_6_0= ruleType )
                    // InternalAlgae.g:844:6: lv_type_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureAttributeAccess().getTypeTypeEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_type_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureAttributeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.atlanmod.analysis.Algae.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlgae.g:862:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalAlgae.g:862:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalAlgae.g:863:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalAlgae.g:863:5: (lv_subname_7_0= ruleEString )
                    // InternalAlgae.g:864:6: lv_subname_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureAttributeAccess().getSubnameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_subname_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureAttributeRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_7_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureAttributeAccess().getEqualsSignKeyword_6());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getMeasureAttributeAccess().getAttributeKeyword_7());
            		
            // InternalAlgae.g:890:3: ( (lv_att_10_0= ruleEString ) )
            // InternalAlgae.g:891:4: (lv_att_10_0= ruleEString )
            {
            // InternalAlgae.g:891:4: (lv_att_10_0= ruleEString )
            // InternalAlgae.g:892:5: lv_att_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureAttributeAccess().getAttEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_att_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureAttributeRule());
            					}
            					set(
            						current,
            						"att",
            						lv_att_10_0,
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


    // $ANTLR start "entryRuleMeasureCast"
    // InternalAlgae.g:913:1: entryRuleMeasureCast returns [EObject current=null] : iv_ruleMeasureCast= ruleMeasureCast EOF ;
    public final EObject entryRuleMeasureCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureCast = null;


        try {
            // InternalAlgae.g:913:52: (iv_ruleMeasureCast= ruleMeasureCast EOF )
            // InternalAlgae.g:914:2: iv_ruleMeasureCast= ruleMeasureCast EOF
            {
             newCompositeNode(grammarAccess.getMeasureCastRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasureCast=ruleMeasureCast();

            state._fsp--;

             current =iv_ruleMeasureCast; 
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
    // $ANTLR end "entryRuleMeasureCast"


    // $ANTLR start "ruleMeasureCast"
    // InternalAlgae.g:920:1: ruleMeasureCast returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= 'as' ( (lv_type_10_0= ruleType ) ) ) ;
    public final EObject ruleMeasureCast() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        AntlrDatatypeRuleToken lv_subname_6_0 = null;

        Enumerator lv_type_10_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:926:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= 'as' ( (lv_type_10_0= ruleType ) ) ) )
            // InternalAlgae.g:927:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= 'as' ( (lv_type_10_0= ruleType ) ) )
            {
            // InternalAlgae.g:927:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= 'as' ( (lv_type_10_0= ruleType ) ) )
            // InternalAlgae.g:928:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( (lv_subname_6_0= ruleEString ) ) otherlv_7= '=' ( ( ruleEString ) ) otherlv_9= 'as' ( (lv_type_10_0= ruleType ) )
            {
            // InternalAlgae.g:928:3: ()
            // InternalAlgae.g:929:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureCastAccess().getMeasureCastAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:935:3: ( (lv_post_1_0= 'post' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAlgae.g:936:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:936:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:937:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,16,FOLLOW_3); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureCastAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureCastRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:949:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalAlgae.g:950:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalAlgae.g:950:4: (lv_targetClass_2_0= ruleEString )
            // InternalAlgae.g:951:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureCastAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_targetClass_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureCastRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_2_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:968:3: (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_STRING) ) {
                    int LA19_2 = input.LA(3);

                    if ( (LA19_2==15) ) {
                        alt19=1;
                    }
                }
                else if ( (LA19_1==RULE_ID) ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==15) ) {
                        alt19=1;
                    }
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalAlgae.g:969:4: otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasureCastAccess().getFullStopKeyword_3_0());
                    			
                    // InternalAlgae.g:973:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalAlgae.g:974:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalAlgae.g:974:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalAlgae.g:975:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureCastAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_targetOperation_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureCastRule());
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

            			newLeafNode(otherlv_5, grammarAccess.getMeasureCastAccess().getFullStopKeyword_4());
            		
            // InternalAlgae.g:997:3: ( (lv_subname_6_0= ruleEString ) )
            // InternalAlgae.g:998:4: (lv_subname_6_0= ruleEString )
            {
            // InternalAlgae.g:998:4: (lv_subname_6_0= ruleEString )
            // InternalAlgae.g:999:5: lv_subname_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureCastAccess().getSubnameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_subname_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureCastRule());
            					}
            					set(
            						current,
            						"subname",
            						lv_subname_6_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasureCastAccess().getEqualsSignKeyword_6());
            		
            // InternalAlgae.g:1020:3: ( ( ruleEString ) )
            // InternalAlgae.g:1021:4: ( ruleEString )
            {
            // InternalAlgae.g:1021:4: ( ruleEString )
            // InternalAlgae.g:1022:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureCastRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureCastAccess().getMeasureMeasureCrossReference_7_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getMeasureCastAccess().getAsKeyword_8());
            		
            // InternalAlgae.g:1040:3: ( (lv_type_10_0= ruleType ) )
            // InternalAlgae.g:1041:4: (lv_type_10_0= ruleType )
            {
            // InternalAlgae.g:1041:4: (lv_type_10_0= ruleType )
            // InternalAlgae.g:1042:5: lv_type_10_0= ruleType
            {

            					newCompositeNode(grammarAccess.getMeasureCastAccess().getTypeTypeEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_10_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureCastRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_10_0,
            						"org.atlanmod.analysis.Algae.Type");
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
    // $ANTLR end "ruleMeasureCast"


    // $ANTLR start "entryRuleRealTimeDuration"
    // InternalAlgae.g:1063:1: entryRuleRealTimeDuration returns [EObject current=null] : iv_ruleRealTimeDuration= ruleRealTimeDuration EOF ;
    public final EObject entryRuleRealTimeDuration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTimeDuration = null;


        try {
            // InternalAlgae.g:1063:57: (iv_ruleRealTimeDuration= ruleRealTimeDuration EOF )
            // InternalAlgae.g:1064:2: iv_ruleRealTimeDuration= ruleRealTimeDuration EOF
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
    // InternalAlgae.g:1070:1: ruleRealTimeDuration returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime' ) ;
    public final EObject ruleRealTimeDuration() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:1076:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime' ) )
            // InternalAlgae.g:1077:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime' )
            {
            // InternalAlgae.g:1077:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime' )
            // InternalAlgae.g:1078:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.absoluteTime'
            {
            // InternalAlgae.g:1078:3: ()
            // InternalAlgae.g:1079:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealTimeDurationAccess().getRealTimeDurationAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:1085:3: ( (lv_post_1_0= 'post' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAlgae.g:1086:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:1086:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:1087:5: lv_post_1_0= 'post'
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

            // InternalAlgae.g:1099:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalAlgae.g:1100:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalAlgae.g:1100:4: (lv_targetClass_2_0= ruleEString )
            // InternalAlgae.g:1101:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRealTimeDurationAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalAlgae.g:1118:3: (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAlgae.g:1119:4: otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRealTimeDurationAccess().getFullStopKeyword_3_0());
                    			
                    // InternalAlgae.g:1123:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalAlgae.g:1124:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalAlgae.g:1124:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalAlgae.g:1125:6: lv_targetOperation_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRealTimeDurationAccess().getTargetOperationEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
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
    // InternalAlgae.g:1151:1: entryRuleMeasureUnboundSumOperation returns [EObject current=null] : iv_ruleMeasureUnboundSumOperation= ruleMeasureUnboundSumOperation EOF ;
    public final EObject entryRuleMeasureUnboundSumOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureUnboundSumOperation = null;


        try {
            // InternalAlgae.g:1151:67: (iv_ruleMeasureUnboundSumOperation= ruleMeasureUnboundSumOperation EOF )
            // InternalAlgae.g:1152:2: iv_ruleMeasureUnboundSumOperation= ruleMeasureUnboundSumOperation EOF
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
    // InternalAlgae.g:1158:1: ruleMeasureUnboundSumOperation returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '+' ( ( ruleEString ) ) )+ ) ;
    public final EObject ruleMeasureUnboundSumOperation() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_targetClass_5_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_7_0 = null;

        Enumerator lv_type_9_0 = null;

        AntlrDatatypeRuleToken lv_subname_10_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:1164:2: ( ( () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '+' ( ( ruleEString ) ) )+ ) )
            // InternalAlgae.g:1165:2: ( () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '+' ( ( ruleEString ) ) )+ )
            {
            // InternalAlgae.g:1165:2: ( () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '+' ( ( ruleEString ) ) )+ )
            // InternalAlgae.g:1166:3: () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '+' ( ( ruleEString ) ) )+
            {
            // InternalAlgae.g:1166:3: ()
            // InternalAlgae.g:1167:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureUnboundSumOperationAccess().getMeasureUnboundSumOperationAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:1173:3: ( (lv_post_1_0= 'post' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==16) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAlgae.g:1174:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:1174:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:1175:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,16,FOLLOW_18); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureUnboundSumOperationAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureUnboundSumOperationRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:1187:3: (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAlgae.g:1188:4: otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeasureUnboundSumOperationAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalAlgae.g:1192:4: ( (lv_value_3_0= ruleEBigDecimal ) )
                    // InternalAlgae.g:1193:5: (lv_value_3_0= ruleEBigDecimal )
                    {
                    // InternalAlgae.g:1193:5: (lv_value_3_0= ruleEBigDecimal )
                    // InternalAlgae.g:1194:6: lv_value_3_0= ruleEBigDecimal
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundSumOperationAccess().getValueEBigDecimalParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_value_3_0=ruleEBigDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundSumOperationRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.atlanmod.analysis.Algae.EBigDecimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeasureUnboundSumOperationAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:1216:3: ( (lv_targetClass_5_0= ruleEString ) )
            // InternalAlgae.g:1217:4: (lv_targetClass_5_0= ruleEString )
            {
            // InternalAlgae.g:1217:4: (lv_targetClass_5_0= ruleEString )
            // InternalAlgae.g:1218:5: lv_targetClass_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureUnboundSumOperationAccess().getTargetClassEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_targetClass_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureUnboundSumOperationRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_5_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1235:3: (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==15) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==RULE_STRING) ) {
                    int LA24_2 = input.LA(3);

                    if ( (LA24_2==15) ) {
                        alt24=1;
                    }
                }
                else if ( (LA24_1==RULE_ID) ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3==15) ) {
                        alt24=1;
                    }
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalAlgae.g:1236:4: otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getMeasureUnboundSumOperationAccess().getFullStopKeyword_4_0());
                    			
                    // InternalAlgae.g:1240:4: ( (lv_targetOperation_7_0= ruleEString ) )
                    // InternalAlgae.g:1241:5: (lv_targetOperation_7_0= ruleEString )
                    {
                    // InternalAlgae.g:1241:5: (lv_targetOperation_7_0= ruleEString )
                    // InternalAlgae.g:1242:6: lv_targetOperation_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundSumOperationAccess().getTargetOperationEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_targetOperation_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundSumOperationRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_7_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureUnboundSumOperationAccess().getFullStopKeyword_5());
            		
            // InternalAlgae.g:1264:3: ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=106 && LA25_0<=108)) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalAlgae.g:1265:4: ( (lv_type_9_0= ruleType ) )
                    {
                    // InternalAlgae.g:1265:4: ( (lv_type_9_0= ruleType ) )
                    // InternalAlgae.g:1266:5: (lv_type_9_0= ruleType )
                    {
                    // InternalAlgae.g:1266:5: (lv_type_9_0= ruleType )
                    // InternalAlgae.g:1267:6: lv_type_9_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundSumOperationAccess().getTypeTypeEnumRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_type_9_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundSumOperationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_9_0,
                    							"org.atlanmod.analysis.Algae.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlgae.g:1285:4: ( (lv_subname_10_0= ruleEString ) )
                    {
                    // InternalAlgae.g:1285:4: ( (lv_subname_10_0= ruleEString ) )
                    // InternalAlgae.g:1286:5: (lv_subname_10_0= ruleEString )
                    {
                    // InternalAlgae.g:1286:5: (lv_subname_10_0= ruleEString )
                    // InternalAlgae.g:1287:6: lv_subname_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundSumOperationAccess().getSubnameEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_subname_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundSumOperationRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_10_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getMeasureUnboundSumOperationAccess().getEqualsSignKeyword_7());
            		
            // InternalAlgae.g:1309:3: ( ( ruleEString ) )
            // InternalAlgae.g:1310:4: ( ruleEString )
            {
            // InternalAlgae.g:1310:4: ( ruleEString )
            // InternalAlgae.g:1311:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureUnboundSumOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureUnboundSumOperationAccess().getMeasuresMeasureCrossReference_8_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1325:3: (otherlv_13= '+' ( ( ruleEString ) ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==24) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAlgae.g:1326:4: otherlv_13= '+' ( ( ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_13, grammarAccess.getMeasureUnboundSumOperationAccess().getPlusSignKeyword_9_0());
            	    			
            	    // InternalAlgae.g:1330:4: ( ( ruleEString ) )
            	    // InternalAlgae.g:1331:5: ( ruleEString )
            	    {
            	    // InternalAlgae.g:1331:5: ( ruleEString )
            	    // InternalAlgae.g:1332:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMeasureUnboundSumOperationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMeasureUnboundSumOperationAccess().getMeasuresMeasureCrossReference_9_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
    // InternalAlgae.g:1351:1: entryRuleMeasureUnboundSubstractOperation returns [EObject current=null] : iv_ruleMeasureUnboundSubstractOperation= ruleMeasureUnboundSubstractOperation EOF ;
    public final EObject entryRuleMeasureUnboundSubstractOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureUnboundSubstractOperation = null;


        try {
            // InternalAlgae.g:1351:73: (iv_ruleMeasureUnboundSubstractOperation= ruleMeasureUnboundSubstractOperation EOF )
            // InternalAlgae.g:1352:2: iv_ruleMeasureUnboundSubstractOperation= ruleMeasureUnboundSubstractOperation EOF
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
    // InternalAlgae.g:1358:1: ruleMeasureUnboundSubstractOperation returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '-' ( ( ruleEString ) ) )+ ) ;
    public final EObject ruleMeasureUnboundSubstractOperation() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_targetClass_5_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_7_0 = null;

        Enumerator lv_type_9_0 = null;

        AntlrDatatypeRuleToken lv_subname_10_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:1364:2: ( ( () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '-' ( ( ruleEString ) ) )+ ) )
            // InternalAlgae.g:1365:2: ( () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '-' ( ( ruleEString ) ) )+ )
            {
            // InternalAlgae.g:1365:2: ( () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '-' ( ( ruleEString ) ) )+ )
            // InternalAlgae.g:1366:3: () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '-' ( ( ruleEString ) ) )+
            {
            // InternalAlgae.g:1366:3: ()
            // InternalAlgae.g:1367:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureUnboundSubstractOperationAccess().getMeasureUnboundSubstractOperationAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:1373:3: ( (lv_post_1_0= 'post' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==16) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAlgae.g:1374:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:1374:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:1375:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,16,FOLLOW_18); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureUnboundSubstractOperationAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureUnboundSubstractOperationRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:1387:3: (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==22) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAlgae.g:1388:4: otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeasureUnboundSubstractOperationAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalAlgae.g:1392:4: ( (lv_value_3_0= ruleEBigDecimal ) )
                    // InternalAlgae.g:1393:5: (lv_value_3_0= ruleEBigDecimal )
                    {
                    // InternalAlgae.g:1393:5: (lv_value_3_0= ruleEBigDecimal )
                    // InternalAlgae.g:1394:6: lv_value_3_0= ruleEBigDecimal
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationAccess().getValueEBigDecimalParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_value_3_0=ruleEBigDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundSubstractOperationRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.atlanmod.analysis.Algae.EBigDecimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeasureUnboundSubstractOperationAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:1416:3: ( (lv_targetClass_5_0= ruleEString ) )
            // InternalAlgae.g:1417:4: (lv_targetClass_5_0= ruleEString )
            {
            // InternalAlgae.g:1417:4: (lv_targetClass_5_0= ruleEString )
            // InternalAlgae.g:1418:5: lv_targetClass_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationAccess().getTargetClassEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_targetClass_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureUnboundSubstractOperationRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_5_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1435:3: (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==15) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==RULE_STRING) ) {
                    int LA29_2 = input.LA(3);

                    if ( (LA29_2==15) ) {
                        alt29=1;
                    }
                }
                else if ( (LA29_1==RULE_ID) ) {
                    int LA29_3 = input.LA(3);

                    if ( (LA29_3==15) ) {
                        alt29=1;
                    }
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalAlgae.g:1436:4: otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getMeasureUnboundSubstractOperationAccess().getFullStopKeyword_4_0());
                    			
                    // InternalAlgae.g:1440:4: ( (lv_targetOperation_7_0= ruleEString ) )
                    // InternalAlgae.g:1441:5: (lv_targetOperation_7_0= ruleEString )
                    {
                    // InternalAlgae.g:1441:5: (lv_targetOperation_7_0= ruleEString )
                    // InternalAlgae.g:1442:6: lv_targetOperation_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationAccess().getTargetOperationEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_targetOperation_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundSubstractOperationRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_7_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureUnboundSubstractOperationAccess().getFullStopKeyword_5());
            		
            // InternalAlgae.g:1464:3: ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=106 && LA30_0<=108)) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalAlgae.g:1465:4: ( (lv_type_9_0= ruleType ) )
                    {
                    // InternalAlgae.g:1465:4: ( (lv_type_9_0= ruleType ) )
                    // InternalAlgae.g:1466:5: (lv_type_9_0= ruleType )
                    {
                    // InternalAlgae.g:1466:5: (lv_type_9_0= ruleType )
                    // InternalAlgae.g:1467:6: lv_type_9_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationAccess().getTypeTypeEnumRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_type_9_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundSubstractOperationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_9_0,
                    							"org.atlanmod.analysis.Algae.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlgae.g:1485:4: ( (lv_subname_10_0= ruleEString ) )
                    {
                    // InternalAlgae.g:1485:4: ( (lv_subname_10_0= ruleEString ) )
                    // InternalAlgae.g:1486:5: (lv_subname_10_0= ruleEString )
                    {
                    // InternalAlgae.g:1486:5: (lv_subname_10_0= ruleEString )
                    // InternalAlgae.g:1487:6: lv_subname_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationAccess().getSubnameEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_subname_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundSubstractOperationRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_10_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getMeasureUnboundSubstractOperationAccess().getEqualsSignKeyword_7());
            		
            // InternalAlgae.g:1509:3: ( ( ruleEString ) )
            // InternalAlgae.g:1510:4: ( ruleEString )
            {
            // InternalAlgae.g:1510:4: ( ruleEString )
            // InternalAlgae.g:1511:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureUnboundSubstractOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationAccess().getMeasuresMeasureCrossReference_8_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1525:3: (otherlv_13= '-' ( ( ruleEString ) ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==25) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAlgae.g:1526:4: otherlv_13= '-' ( ( ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,25,FOLLOW_3); 

            	    				newLeafNode(otherlv_13, grammarAccess.getMeasureUnboundSubstractOperationAccess().getHyphenMinusKeyword_9_0());
            	    			
            	    // InternalAlgae.g:1530:4: ( ( ruleEString ) )
            	    // InternalAlgae.g:1531:5: ( ruleEString )
            	    {
            	    // InternalAlgae.g:1531:5: ( ruleEString )
            	    // InternalAlgae.g:1532:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMeasureUnboundSubstractOperationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMeasureUnboundSubstractOperationAccess().getMeasuresMeasureCrossReference_9_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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
    // InternalAlgae.g:1551:1: entryRuleMeasureUnboundProductOperation returns [EObject current=null] : iv_ruleMeasureUnboundProductOperation= ruleMeasureUnboundProductOperation EOF ;
    public final EObject entryRuleMeasureUnboundProductOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureUnboundProductOperation = null;


        try {
            // InternalAlgae.g:1551:71: (iv_ruleMeasureUnboundProductOperation= ruleMeasureUnboundProductOperation EOF )
            // InternalAlgae.g:1552:2: iv_ruleMeasureUnboundProductOperation= ruleMeasureUnboundProductOperation EOF
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
    // InternalAlgae.g:1558:1: ruleMeasureUnboundProductOperation returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '*' ( ( ruleEString ) ) )+ ) ;
    public final EObject ruleMeasureUnboundProductOperation() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_targetClass_5_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_7_0 = null;

        Enumerator lv_type_9_0 = null;

        AntlrDatatypeRuleToken lv_subname_10_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:1564:2: ( ( () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '*' ( ( ruleEString ) ) )+ ) )
            // InternalAlgae.g:1565:2: ( () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '*' ( ( ruleEString ) ) )+ )
            {
            // InternalAlgae.g:1565:2: ( () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '*' ( ( ruleEString ) ) )+ )
            // InternalAlgae.g:1566:3: () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '*' ( ( ruleEString ) ) )+
            {
            // InternalAlgae.g:1566:3: ()
            // InternalAlgae.g:1567:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureUnboundProductOperationAccess().getMeasureUnboundProductOperationAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:1573:3: ( (lv_post_1_0= 'post' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAlgae.g:1574:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:1574:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:1575:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,16,FOLLOW_18); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureUnboundProductOperationAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureUnboundProductOperationRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:1587:3: (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==22) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAlgae.g:1588:4: otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeasureUnboundProductOperationAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalAlgae.g:1592:4: ( (lv_value_3_0= ruleEBigDecimal ) )
                    // InternalAlgae.g:1593:5: (lv_value_3_0= ruleEBigDecimal )
                    {
                    // InternalAlgae.g:1593:5: (lv_value_3_0= ruleEBigDecimal )
                    // InternalAlgae.g:1594:6: lv_value_3_0= ruleEBigDecimal
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getValueEBigDecimalParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_value_3_0=ruleEBigDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundProductOperationRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.atlanmod.analysis.Algae.EBigDecimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeasureUnboundProductOperationAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:1616:3: ( (lv_targetClass_5_0= ruleEString ) )
            // InternalAlgae.g:1617:4: (lv_targetClass_5_0= ruleEString )
            {
            // InternalAlgae.g:1617:4: (lv_targetClass_5_0= ruleEString )
            // InternalAlgae.g:1618:5: lv_targetClass_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getTargetClassEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_targetClass_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureUnboundProductOperationRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_5_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1635:3: (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==15) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==RULE_STRING) ) {
                    int LA34_2 = input.LA(3);

                    if ( (LA34_2==15) ) {
                        alt34=1;
                    }
                }
                else if ( (LA34_1==RULE_ID) ) {
                    int LA34_3 = input.LA(3);

                    if ( (LA34_3==15) ) {
                        alt34=1;
                    }
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalAlgae.g:1636:4: otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getMeasureUnboundProductOperationAccess().getFullStopKeyword_4_0());
                    			
                    // InternalAlgae.g:1640:4: ( (lv_targetOperation_7_0= ruleEString ) )
                    // InternalAlgae.g:1641:5: (lv_targetOperation_7_0= ruleEString )
                    {
                    // InternalAlgae.g:1641:5: (lv_targetOperation_7_0= ruleEString )
                    // InternalAlgae.g:1642:6: lv_targetOperation_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getTargetOperationEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_targetOperation_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundProductOperationRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_7_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureUnboundProductOperationAccess().getFullStopKeyword_5());
            		
            // InternalAlgae.g:1664:3: ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=106 && LA35_0<=108)) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_ID)) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalAlgae.g:1665:4: ( (lv_type_9_0= ruleType ) )
                    {
                    // InternalAlgae.g:1665:4: ( (lv_type_9_0= ruleType ) )
                    // InternalAlgae.g:1666:5: (lv_type_9_0= ruleType )
                    {
                    // InternalAlgae.g:1666:5: (lv_type_9_0= ruleType )
                    // InternalAlgae.g:1667:6: lv_type_9_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getTypeTypeEnumRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_type_9_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundProductOperationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_9_0,
                    							"org.atlanmod.analysis.Algae.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlgae.g:1685:4: ( (lv_subname_10_0= ruleEString ) )
                    {
                    // InternalAlgae.g:1685:4: ( (lv_subname_10_0= ruleEString ) )
                    // InternalAlgae.g:1686:5: (lv_subname_10_0= ruleEString )
                    {
                    // InternalAlgae.g:1686:5: (lv_subname_10_0= ruleEString )
                    // InternalAlgae.g:1687:6: lv_subname_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getSubnameEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_subname_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundProductOperationRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_10_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getMeasureUnboundProductOperationAccess().getEqualsSignKeyword_7());
            		
            // InternalAlgae.g:1709:3: ( ( ruleEString ) )
            // InternalAlgae.g:1710:4: ( ruleEString )
            {
            // InternalAlgae.g:1710:4: ( ruleEString )
            // InternalAlgae.g:1711:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureUnboundProductOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getMeasuresMeasureCrossReference_8_0());
            				
            pushFollow(FOLLOW_25);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1725:3: (otherlv_13= '*' ( ( ruleEString ) ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==26) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAlgae.g:1726:4: otherlv_13= '*' ( ( ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,26,FOLLOW_3); 

            	    				newLeafNode(otherlv_13, grammarAccess.getMeasureUnboundProductOperationAccess().getAsteriskKeyword_9_0());
            	    			
            	    // InternalAlgae.g:1730:4: ( ( ruleEString ) )
            	    // InternalAlgae.g:1731:5: ( ruleEString )
            	    {
            	    // InternalAlgae.g:1731:5: ( ruleEString )
            	    // InternalAlgae.g:1732:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMeasureUnboundProductOperationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMeasureUnboundProductOperationAccess().getMeasuresMeasureCrossReference_9_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
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
    // InternalAlgae.g:1751:1: entryRuleMeasureUnboundDivisionOperation returns [EObject current=null] : iv_ruleMeasureUnboundDivisionOperation= ruleMeasureUnboundDivisionOperation EOF ;
    public final EObject entryRuleMeasureUnboundDivisionOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasureUnboundDivisionOperation = null;


        try {
            // InternalAlgae.g:1751:72: (iv_ruleMeasureUnboundDivisionOperation= ruleMeasureUnboundDivisionOperation EOF )
            // InternalAlgae.g:1752:2: iv_ruleMeasureUnboundDivisionOperation= ruleMeasureUnboundDivisionOperation EOF
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
    // InternalAlgae.g:1758:1: ruleMeasureUnboundDivisionOperation returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '/' ( ( ruleEString ) ) )+ ) ;
    public final EObject ruleMeasureUnboundDivisionOperation() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_targetClass_5_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_7_0 = null;

        Enumerator lv_type_9_0 = null;

        AntlrDatatypeRuleToken lv_subname_10_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:1764:2: ( ( () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '/' ( ( ruleEString ) ) )+ ) )
            // InternalAlgae.g:1765:2: ( () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '/' ( ( ruleEString ) ) )+ )
            {
            // InternalAlgae.g:1765:2: ( () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '/' ( ( ruleEString ) ) )+ )
            // InternalAlgae.g:1766:3: () ( (lv_post_1_0= 'post' ) )? (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )? ( (lv_targetClass_5_0= ruleEString ) ) (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )? otherlv_8= '.' ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) ) otherlv_11= '=' ( ( ruleEString ) ) (otherlv_13= '/' ( ( ruleEString ) ) )+
            {
            // InternalAlgae.g:1766:3: ()
            // InternalAlgae.g:1767:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeasureUnboundDivisionOperationAccess().getMeasureUnboundDivisionOperationAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:1773:3: ( (lv_post_1_0= 'post' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==16) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAlgae.g:1774:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:1774:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:1775:5: lv_post_1_0= 'post'
                    {
                    lv_post_1_0=(Token)match(input,16,FOLLOW_18); 

                    					newLeafNode(lv_post_1_0, grammarAccess.getMeasureUnboundDivisionOperationAccess().getPostPostKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeasureUnboundDivisionOperationRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:1787:3: (otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==22) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAlgae.g:1788:4: otherlv_2= '(' ( (lv_value_3_0= ruleEBigDecimal ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getMeasureUnboundDivisionOperationAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalAlgae.g:1792:4: ( (lv_value_3_0= ruleEBigDecimal ) )
                    // InternalAlgae.g:1793:5: (lv_value_3_0= ruleEBigDecimal )
                    {
                    // InternalAlgae.g:1793:5: (lv_value_3_0= ruleEBigDecimal )
                    // InternalAlgae.g:1794:6: lv_value_3_0= ruleEBigDecimal
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationAccess().getValueEBigDecimalParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_value_3_0=ruleEBigDecimal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundDivisionOperationRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.atlanmod.analysis.Algae.EBigDecimal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeasureUnboundDivisionOperationAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:1816:3: ( (lv_targetClass_5_0= ruleEString ) )
            // InternalAlgae.g:1817:4: (lv_targetClass_5_0= ruleEString )
            {
            // InternalAlgae.g:1817:4: (lv_targetClass_5_0= ruleEString )
            // InternalAlgae.g:1818:5: lv_targetClass_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationAccess().getTargetClassEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_targetClass_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasureUnboundDivisionOperationRule());
            					}
            					set(
            						current,
            						"targetClass",
            						lv_targetClass_5_0,
            						"org.atlanmod.analysis.Algae.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1835:3: (otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==15) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==RULE_STRING) ) {
                    int LA39_2 = input.LA(3);

                    if ( (LA39_2==15) ) {
                        alt39=1;
                    }
                }
                else if ( (LA39_1==RULE_ID) ) {
                    int LA39_3 = input.LA(3);

                    if ( (LA39_3==15) ) {
                        alt39=1;
                    }
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalAlgae.g:1836:4: otherlv_6= '.' ( (lv_targetOperation_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getMeasureUnboundDivisionOperationAccess().getFullStopKeyword_4_0());
                    			
                    // InternalAlgae.g:1840:4: ( (lv_targetOperation_7_0= ruleEString ) )
                    // InternalAlgae.g:1841:5: (lv_targetOperation_7_0= ruleEString )
                    {
                    // InternalAlgae.g:1841:5: (lv_targetOperation_7_0= ruleEString )
                    // InternalAlgae.g:1842:6: lv_targetOperation_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationAccess().getTargetOperationEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_targetOperation_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundDivisionOperationRule());
                    						}
                    						set(
                    							current,
                    							"targetOperation",
                    							lv_targetOperation_7_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getMeasureUnboundDivisionOperationAccess().getFullStopKeyword_5());
            		
            // InternalAlgae.g:1864:3: ( ( (lv_type_9_0= ruleType ) ) | ( (lv_subname_10_0= ruleEString ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=106 && LA40_0<=108)) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_ID)) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalAlgae.g:1865:4: ( (lv_type_9_0= ruleType ) )
                    {
                    // InternalAlgae.g:1865:4: ( (lv_type_9_0= ruleType ) )
                    // InternalAlgae.g:1866:5: (lv_type_9_0= ruleType )
                    {
                    // InternalAlgae.g:1866:5: (lv_type_9_0= ruleType )
                    // InternalAlgae.g:1867:6: lv_type_9_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationAccess().getTypeTypeEnumRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_type_9_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundDivisionOperationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_9_0,
                    							"org.atlanmod.analysis.Algae.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlgae.g:1885:4: ( (lv_subname_10_0= ruleEString ) )
                    {
                    // InternalAlgae.g:1885:4: ( (lv_subname_10_0= ruleEString ) )
                    // InternalAlgae.g:1886:5: (lv_subname_10_0= ruleEString )
                    {
                    // InternalAlgae.g:1886:5: (lv_subname_10_0= ruleEString )
                    // InternalAlgae.g:1887:6: lv_subname_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationAccess().getSubnameEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_subname_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasureUnboundDivisionOperationRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_10_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getMeasureUnboundDivisionOperationAccess().getEqualsSignKeyword_7());
            		
            // InternalAlgae.g:1909:3: ( ( ruleEString ) )
            // InternalAlgae.g:1910:4: ( ruleEString )
            {
            // InternalAlgae.g:1910:4: ( ruleEString )
            // InternalAlgae.g:1911:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeasureUnboundDivisionOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationAccess().getMeasuresMeasureCrossReference_8_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgae.g:1925:3: (otherlv_13= '/' ( ( ruleEString ) ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==27) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAlgae.g:1926:4: otherlv_13= '/' ( ( ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,27,FOLLOW_3); 

            	    				newLeafNode(otherlv_13, grammarAccess.getMeasureUnboundDivisionOperationAccess().getSolidusKeyword_9_0());
            	    			
            	    // InternalAlgae.g:1930:4: ( ( ruleEString ) )
            	    // InternalAlgae.g:1931:5: ( ruleEString )
            	    {
            	    // InternalAlgae.g:1931:5: ( ruleEString )
            	    // InternalAlgae.g:1932:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMeasureUnboundDivisionOperationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMeasureUnboundDivisionOperationAccess().getMeasuresMeasureCrossReference_9_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
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
    // InternalAlgae.g:1951:1: entryRuleExponentialMeasure returns [EObject current=null] : iv_ruleExponentialMeasure= ruleExponentialMeasure EOF ;
    public final EObject entryRuleExponentialMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialMeasure = null;


        try {
            // InternalAlgae.g:1951:59: (iv_ruleExponentialMeasure= ruleExponentialMeasure EOF )
            // InternalAlgae.g:1952:2: iv_ruleExponentialMeasure= ruleExponentialMeasure EOF
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
    // InternalAlgae.g:1958:1: ruleExponentialMeasure returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'exp' ( ( ruleEString ) ) ) ;
    public final EObject ruleExponentialMeasure() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        Enumerator lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_subname_7_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:1964:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'exp' ( ( ruleEString ) ) ) )
            // InternalAlgae.g:1965:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'exp' ( ( ruleEString ) ) )
            {
            // InternalAlgae.g:1965:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'exp' ( ( ruleEString ) ) )
            // InternalAlgae.g:1966:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'exp' ( ( ruleEString ) )
            {
            // InternalAlgae.g:1966:3: ()
            // InternalAlgae.g:1967:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExponentialMeasureAccess().getExponentialMeasureAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:1973:3: ( (lv_post_1_0= 'post' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==16) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAlgae.g:1974:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:1974:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:1975:5: lv_post_1_0= 'post'
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

            // InternalAlgae.g:1987:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalAlgae.g:1988:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalAlgae.g:1988:4: (lv_targetClass_2_0= ruleEString )
            // InternalAlgae.g:1989:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExponentialMeasureAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalAlgae.g:2006:3: (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==15) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==RULE_STRING) ) {
                    int LA43_2 = input.LA(3);

                    if ( (LA43_2==15) ) {
                        alt43=1;
                    }
                }
                else if ( (LA43_1==RULE_ID) ) {
                    int LA43_3 = input.LA(3);

                    if ( (LA43_3==15) ) {
                        alt43=1;
                    }
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalAlgae.g:2007:4: otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getExponentialMeasureAccess().getFullStopKeyword_3_0());
                    			
                    // InternalAlgae.g:2011:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalAlgae.g:2012:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalAlgae.g:2012:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalAlgae.g:2013:6: lv_targetOperation_4_0= ruleEString
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

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getExponentialMeasureAccess().getFullStopKeyword_4());
            		
            // InternalAlgae.g:2035:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=106 && LA44_0<=108)) ) {
                alt44=1;
            }
            else if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_ID)) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalAlgae.g:2036:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalAlgae.g:2036:4: ( (lv_type_6_0= ruleType ) )
                    // InternalAlgae.g:2037:5: (lv_type_6_0= ruleType )
                    {
                    // InternalAlgae.g:2037:5: (lv_type_6_0= ruleType )
                    // InternalAlgae.g:2038:6: lv_type_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getExponentialMeasureAccess().getTypeTypeEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_type_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExponentialMeasureRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.atlanmod.analysis.Algae.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlgae.g:2056:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalAlgae.g:2056:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalAlgae.g:2057:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalAlgae.g:2057:5: (lv_subname_7_0= ruleEString )
                    // InternalAlgae.g:2058:6: lv_subname_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExponentialMeasureAccess().getSubnameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_subname_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExponentialMeasureRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_7_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_29); 

            			newLeafNode(otherlv_8, grammarAccess.getExponentialMeasureAccess().getEqualsSignKeyword_6());
            		
            otherlv_9=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getExponentialMeasureAccess().getExpKeyword_7());
            		
            // InternalAlgae.g:2084:3: ( ( ruleEString ) )
            // InternalAlgae.g:2085:4: ( ruleEString )
            {
            // InternalAlgae.g:2085:4: ( ruleEString )
            // InternalAlgae.g:2086:5: ruleEString
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
    // InternalAlgae.g:2104:1: entryRuleLogisticMeasure returns [EObject current=null] : iv_ruleLogisticMeasure= ruleLogisticMeasure EOF ;
    public final EObject entryRuleLogisticMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogisticMeasure = null;


        try {
            // InternalAlgae.g:2104:56: (iv_ruleLogisticMeasure= ruleLogisticMeasure EOF )
            // InternalAlgae.g:2105:2: iv_ruleLogisticMeasure= ruleLogisticMeasure EOF
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
    // InternalAlgae.g:2111:1: ruleLogisticMeasure returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'logistic' ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleLogisticMeasure() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        Enumerator lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_subname_7_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:2117:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'logistic' ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ) )
            // InternalAlgae.g:2118:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'logistic' ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) )
            {
            // InternalAlgae.g:2118:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'logistic' ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) )
            // InternalAlgae.g:2119:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'logistic' ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) )
            {
            // InternalAlgae.g:2119:3: ()
            // InternalAlgae.g:2120:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLogisticMeasureAccess().getLogisticMeasureAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:2126:3: ( (lv_post_1_0= 'post' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==16) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAlgae.g:2127:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:2127:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:2128:5: lv_post_1_0= 'post'
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

            // InternalAlgae.g:2140:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalAlgae.g:2141:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalAlgae.g:2141:4: (lv_targetClass_2_0= ruleEString )
            // InternalAlgae.g:2142:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLogisticMeasureAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalAlgae.g:2159:3: (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==15) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==RULE_STRING) ) {
                    int LA46_2 = input.LA(3);

                    if ( (LA46_2==15) ) {
                        alt46=1;
                    }
                }
                else if ( (LA46_1==RULE_ID) ) {
                    int LA46_3 = input.LA(3);

                    if ( (LA46_3==15) ) {
                        alt46=1;
                    }
                }
            }
            switch (alt46) {
                case 1 :
                    // InternalAlgae.g:2160:4: otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLogisticMeasureAccess().getFullStopKeyword_3_0());
                    			
                    // InternalAlgae.g:2164:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalAlgae.g:2165:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalAlgae.g:2165:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalAlgae.g:2166:6: lv_targetOperation_4_0= ruleEString
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

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getLogisticMeasureAccess().getFullStopKeyword_4());
            		
            // InternalAlgae.g:2188:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=106 && LA47_0<=108)) ) {
                alt47=1;
            }
            else if ( ((LA47_0>=RULE_STRING && LA47_0<=RULE_ID)) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalAlgae.g:2189:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalAlgae.g:2189:4: ( (lv_type_6_0= ruleType ) )
                    // InternalAlgae.g:2190:5: (lv_type_6_0= ruleType )
                    {
                    // InternalAlgae.g:2190:5: (lv_type_6_0= ruleType )
                    // InternalAlgae.g:2191:6: lv_type_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getLogisticMeasureAccess().getTypeTypeEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_type_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogisticMeasureRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.atlanmod.analysis.Algae.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlgae.g:2209:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalAlgae.g:2209:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalAlgae.g:2210:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalAlgae.g:2210:5: (lv_subname_7_0= ruleEString )
                    // InternalAlgae.g:2211:6: lv_subname_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLogisticMeasureAccess().getSubnameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_subname_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogisticMeasureRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_7_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_30); 

            			newLeafNode(otherlv_8, grammarAccess.getLogisticMeasureAccess().getEqualsSignKeyword_6());
            		
            otherlv_9=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getLogisticMeasureAccess().getLogisticKeyword_7());
            		
            // InternalAlgae.g:2237:3: ( ( ruleEString ) )
            // InternalAlgae.g:2238:4: ( ruleEString )
            {
            // InternalAlgae.g:2238:4: ( ruleEString )
            // InternalAlgae.g:2239:5: ruleEString
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

            // InternalAlgae.g:2253:3: ( ( ruleEString ) )
            // InternalAlgae.g:2254:4: ( ruleEString )
            {
            // InternalAlgae.g:2254:4: ( ruleEString )
            // InternalAlgae.g:2255:5: ruleEString
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

            // InternalAlgae.g:2269:3: ( ( ruleEString ) )
            // InternalAlgae.g:2270:4: ( ruleEString )
            {
            // InternalAlgae.g:2270:4: ( ruleEString )
            // InternalAlgae.g:2271:5: ruleEString
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

            // InternalAlgae.g:2285:3: ( ( ruleEString ) )
            // InternalAlgae.g:2286:4: ( ruleEString )
            {
            // InternalAlgae.g:2286:4: ( ruleEString )
            // InternalAlgae.g:2287:5: ruleEString
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
    // InternalAlgae.g:2305:1: entryRuleIntegrationMeasure returns [EObject current=null] : iv_ruleIntegrationMeasure= ruleIntegrationMeasure EOF ;
    public final EObject entryRuleIntegrationMeasure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegrationMeasure = null;


        try {
            // InternalAlgae.g:2305:59: (iv_ruleIntegrationMeasure= ruleIntegrationMeasure EOF )
            // InternalAlgae.g:2306:2: iv_ruleIntegrationMeasure= ruleIntegrationMeasure EOF
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
    // InternalAlgae.g:2312:1: ruleIntegrationMeasure returns [EObject current=null] : ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'integral' ( ( ruleEString ) ) otherlv_11= '[' ( ( ruleEString ) ) otherlv_13= ';' ( ( ruleEString ) ) otherlv_15= ']' ) ;
    public final EObject ruleIntegrationMeasure() throws RecognitionException {
        EObject current = null;

        Token lv_post_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_targetClass_2_0 = null;

        AntlrDatatypeRuleToken lv_targetOperation_4_0 = null;

        Enumerator lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_subname_7_0 = null;



        	enterRule();

        try {
            // InternalAlgae.g:2318:2: ( ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'integral' ( ( ruleEString ) ) otherlv_11= '[' ( ( ruleEString ) ) otherlv_13= ';' ( ( ruleEString ) ) otherlv_15= ']' ) )
            // InternalAlgae.g:2319:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'integral' ( ( ruleEString ) ) otherlv_11= '[' ( ( ruleEString ) ) otherlv_13= ';' ( ( ruleEString ) ) otherlv_15= ']' )
            {
            // InternalAlgae.g:2319:2: ( () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'integral' ( ( ruleEString ) ) otherlv_11= '[' ( ( ruleEString ) ) otherlv_13= ';' ( ( ruleEString ) ) otherlv_15= ']' )
            // InternalAlgae.g:2320:3: () ( (lv_post_1_0= 'post' ) )? ( (lv_targetClass_2_0= ruleEString ) ) (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )? otherlv_5= '.' ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) ) otherlv_8= '=' otherlv_9= 'integral' ( ( ruleEString ) ) otherlv_11= '[' ( ( ruleEString ) ) otherlv_13= ';' ( ( ruleEString ) ) otherlv_15= ']'
            {
            // InternalAlgae.g:2320:3: ()
            // InternalAlgae.g:2321:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegrationMeasureAccess().getIntegrationMeasureAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:2327:3: ( (lv_post_1_0= 'post' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==16) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAlgae.g:2328:4: (lv_post_1_0= 'post' )
                    {
                    // InternalAlgae.g:2328:4: (lv_post_1_0= 'post' )
                    // InternalAlgae.g:2329:5: lv_post_1_0= 'post'
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

            // InternalAlgae.g:2341:3: ( (lv_targetClass_2_0= ruleEString ) )
            // InternalAlgae.g:2342:4: (lv_targetClass_2_0= ruleEString )
            {
            // InternalAlgae.g:2342:4: (lv_targetClass_2_0= ruleEString )
            // InternalAlgae.g:2343:5: lv_targetClass_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntegrationMeasureAccess().getTargetClassEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalAlgae.g:2360:3: (otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==15) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==RULE_STRING) ) {
                    int LA49_2 = input.LA(3);

                    if ( (LA49_2==15) ) {
                        alt49=1;
                    }
                }
                else if ( (LA49_1==RULE_ID) ) {
                    int LA49_3 = input.LA(3);

                    if ( (LA49_3==15) ) {
                        alt49=1;
                    }
                }
            }
            switch (alt49) {
                case 1 :
                    // InternalAlgae.g:2361:4: otherlv_3= '.' ( (lv_targetOperation_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntegrationMeasureAccess().getFullStopKeyword_3_0());
                    			
                    // InternalAlgae.g:2365:4: ( (lv_targetOperation_4_0= ruleEString ) )
                    // InternalAlgae.g:2366:5: (lv_targetOperation_4_0= ruleEString )
                    {
                    // InternalAlgae.g:2366:5: (lv_targetOperation_4_0= ruleEString )
                    // InternalAlgae.g:2367:6: lv_targetOperation_4_0= ruleEString
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

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getIntegrationMeasureAccess().getFullStopKeyword_4());
            		
            // InternalAlgae.g:2389:3: ( ( (lv_type_6_0= ruleType ) ) | ( (lv_subname_7_0= ruleEString ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=106 && LA50_0<=108)) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=RULE_STRING && LA50_0<=RULE_ID)) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalAlgae.g:2390:4: ( (lv_type_6_0= ruleType ) )
                    {
                    // InternalAlgae.g:2390:4: ( (lv_type_6_0= ruleType ) )
                    // InternalAlgae.g:2391:5: (lv_type_6_0= ruleType )
                    {
                    // InternalAlgae.g:2391:5: (lv_type_6_0= ruleType )
                    // InternalAlgae.g:2392:6: lv_type_6_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getIntegrationMeasureAccess().getTypeTypeEnumRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_type_6_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegrationMeasureRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.atlanmod.analysis.Algae.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAlgae.g:2410:4: ( (lv_subname_7_0= ruleEString ) )
                    {
                    // InternalAlgae.g:2410:4: ( (lv_subname_7_0= ruleEString ) )
                    // InternalAlgae.g:2411:5: (lv_subname_7_0= ruleEString )
                    {
                    // InternalAlgae.g:2411:5: (lv_subname_7_0= ruleEString )
                    // InternalAlgae.g:2412:6: lv_subname_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIntegrationMeasureAccess().getSubnameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_subname_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegrationMeasureRule());
                    						}
                    						set(
                    							current,
                    							"subname",
                    							lv_subname_7_0,
                    							"org.atlanmod.analysis.Algae.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_31); 

            			newLeafNode(otherlv_8, grammarAccess.getIntegrationMeasureAccess().getEqualsSignKeyword_6());
            		
            otherlv_9=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getIntegrationMeasureAccess().getIntegralKeyword_7());
            		
            // InternalAlgae.g:2438:3: ( ( ruleEString ) )
            // InternalAlgae.g:2439:4: ( ruleEString )
            {
            // InternalAlgae.g:2439:4: ( ruleEString )
            // InternalAlgae.g:2440:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegrationMeasureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIntegrationMeasureAccess().getFunctionCompositeMeasureCrossReference_8_0());
            				
            pushFollow(FOLLOW_32);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getIntegrationMeasureAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalAlgae.g:2458:3: ( ( ruleEString ) )
            // InternalAlgae.g:2459:4: ( ruleEString )
            {
            // InternalAlgae.g:2459:4: ( ruleEString )
            // InternalAlgae.g:2460:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegrationMeasureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIntegrationMeasureAccess().getLeftBoundMeasureCrossReference_10_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getIntegrationMeasureAccess().getSemicolonKeyword_11());
            		
            // InternalAlgae.g:2478:3: ( ( ruleEString ) )
            // InternalAlgae.g:2479:4: ( ruleEString )
            {
            // InternalAlgae.g:2479:4: ( ruleEString )
            // InternalAlgae.g:2480:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegrationMeasureRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIntegrationMeasureAccess().getRightBoundMeasureCrossReference_12_0());
            				
            pushFollow(FOLLOW_34);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getIntegrationMeasureAccess().getRightSquareBracketKeyword_13());
            		

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
    // InternalAlgae.g:2502:1: entryRuleNormalDistribution returns [EObject current=null] : iv_ruleNormalDistribution= ruleNormalDistribution EOF ;
    public final EObject entryRuleNormalDistribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalDistribution = null;


        try {
            // InternalAlgae.g:2502:59: (iv_ruleNormalDistribution= ruleNormalDistribution EOF )
            // InternalAlgae.g:2503:2: iv_ruleNormalDistribution= ruleNormalDistribution EOF
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
    // InternalAlgae.g:2509:1: ruleNormalDistribution returns [EObject current=null] : ( () otherlv_1= 'NormalDistribution' ) ;
    public final EObject ruleNormalDistribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlgae.g:2515:2: ( ( () otherlv_1= 'NormalDistribution' ) )
            // InternalAlgae.g:2516:2: ( () otherlv_1= 'NormalDistribution' )
            {
            // InternalAlgae.g:2516:2: ( () otherlv_1= 'NormalDistribution' )
            // InternalAlgae.g:2517:3: () otherlv_1= 'NormalDistribution'
            {
            // InternalAlgae.g:2517:3: ()
            // InternalAlgae.g:2518:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNormalDistributionAccess().getNormalDistributionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_2); 

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
    // InternalAlgae.g:2532:1: entryRuleInterval returns [EObject current=null] : iv_ruleInterval= ruleInterval EOF ;
    public final EObject entryRuleInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterval = null;


        try {
            // InternalAlgae.g:2532:49: (iv_ruleInterval= ruleInterval EOF )
            // InternalAlgae.g:2533:2: iv_ruleInterval= ruleInterval EOF
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
    // InternalAlgae.g:2539:1: ruleInterval returns [EObject current=null] : (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' ) ;
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
            // InternalAlgae.g:2545:2: ( (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' ) )
            // InternalAlgae.g:2546:2: (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' )
            {
            // InternalAlgae.g:2546:2: (otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}' )
            // InternalAlgae.g:2547:3: otherlv_0= 'Interval' otherlv_1= '{' otherlv_2= 'lowerEndpoint' ( (lv_lowerEndpoint_3_0= ruleMeasure ) ) otherlv_4= 'upperEndpoint' ( (lv_upperEndpoint_5_0= ruleMeasure ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIntervalAccess().getIntervalKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getIntervalAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getIntervalAccess().getLowerEndpointKeyword_2());
            		
            // InternalAlgae.g:2559:3: ( (lv_lowerEndpoint_3_0= ruleMeasure ) )
            // InternalAlgae.g:2560:4: (lv_lowerEndpoint_3_0= ruleMeasure )
            {
            // InternalAlgae.g:2560:4: (lv_lowerEndpoint_3_0= ruleMeasure )
            // InternalAlgae.g:2561:5: lv_lowerEndpoint_3_0= ruleMeasure
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getLowerEndpointMeasureParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
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

            otherlv_4=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getIntervalAccess().getUpperEndpointKeyword_4());
            		
            // InternalAlgae.g:2582:3: ( (lv_upperEndpoint_5_0= ruleMeasure ) )
            // InternalAlgae.g:2583:4: (lv_upperEndpoint_5_0= ruleMeasure )
            {
            // InternalAlgae.g:2583:4: (lv_upperEndpoint_5_0= ruleMeasure )
            // InternalAlgae.g:2584:5: lv_upperEndpoint_5_0= ruleMeasure
            {

            					newCompositeNode(grammarAccess.getIntervalAccess().getUpperEndpointMeasureParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_37);
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
    // InternalAlgae.g:2609:1: entryRuleSampling returns [EObject current=null] : iv_ruleSampling= ruleSampling EOF ;
    public final EObject entryRuleSampling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampling = null;


        try {
            // InternalAlgae.g:2609:49: (iv_ruleSampling= ruleSampling EOF )
            // InternalAlgae.g:2610:2: iv_ruleSampling= ruleSampling EOF
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
    // InternalAlgae.g:2616:1: ruleSampling returns [EObject current=null] : ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalAlgae.g:2622:2: ( ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalAlgae.g:2623:2: ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalAlgae.g:2623:2: ( () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalAlgae.g:2624:3: () otherlv_1= 'Sampling' otherlv_2= '{' (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )? (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalAlgae.g:2624:3: ()
            // InternalAlgae.g:2625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSamplingAccess().getSamplingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSamplingAccess().getSamplingKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getSamplingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlgae.g:2639:3: (otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==39) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAlgae.g:2640:4: otherlv_3= 'measurementProcedure' ( (lv_measurementProcedure_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSamplingAccess().getMeasurementProcedureKeyword_3_0());
                    			
                    // InternalAlgae.g:2644:4: ( (lv_measurementProcedure_4_0= ruleEString ) )
                    // InternalAlgae.g:2645:5: (lv_measurementProcedure_4_0= ruleEString )
                    {
                    // InternalAlgae.g:2645:5: (lv_measurementProcedure_4_0= ruleEString )
                    // InternalAlgae.g:2646:6: lv_measurementProcedure_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSamplingAccess().getMeasurementProcedureEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_39);
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

            // InternalAlgae.g:2664:3: (otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==40) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAlgae.g:2665:4: otherlv_5= 'samples' otherlv_6= '{' ( (lv_samples_7_0= ruleSample ) ) (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getSamplingAccess().getSamplesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_40); 

                    				newLeafNode(otherlv_6, grammarAccess.getSamplingAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalAlgae.g:2673:4: ( (lv_samples_7_0= ruleSample ) )
                    // InternalAlgae.g:2674:5: (lv_samples_7_0= ruleSample )
                    {
                    // InternalAlgae.g:2674:5: (lv_samples_7_0= ruleSample )
                    // InternalAlgae.g:2675:6: lv_samples_7_0= ruleSample
                    {

                    						newCompositeNode(grammarAccess.getSamplingAccess().getSamplesSampleParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:2692:4: (otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==13) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalAlgae.g:2693:5: otherlv_8= ',' ( (lv_samples_9_0= ruleSample ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_40); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSamplingAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalAlgae.g:2697:5: ( (lv_samples_9_0= ruleSample ) )
                    	    // InternalAlgae.g:2698:6: (lv_samples_9_0= ruleSample )
                    	    {
                    	    // InternalAlgae.g:2698:6: (lv_samples_9_0= ruleSample )
                    	    // InternalAlgae.g:2699:7: lv_samples_9_0= ruleSample
                    	    {

                    	    							newCompositeNode(grammarAccess.getSamplingAccess().getSamplesSampleParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,14,FOLLOW_37); 

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
    // InternalAlgae.g:2730:1: entryRuleIntegral returns [EObject current=null] : iv_ruleIntegral= ruleIntegral EOF ;
    public final EObject entryRuleIntegral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegral = null;


        try {
            // InternalAlgae.g:2730:49: (iv_ruleIntegral= ruleIntegral EOF )
            // InternalAlgae.g:2731:2: iv_ruleIntegral= ruleIntegral EOF
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
    // InternalAlgae.g:2737:1: ruleIntegral returns [EObject current=null] : (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' ) ;
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
            // InternalAlgae.g:2743:2: ( (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalAlgae.g:2744:2: (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalAlgae.g:2744:2: (otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalAlgae.g:2745:3: otherlv_0= 'Integral' otherlv_1= '{' (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )? otherlv_4= 'interval' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIntegralAccess().getIntegralKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegralAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlgae.g:2753:3: (otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==42) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAlgae.g:2754:4: otherlv_2= 'function' ( (lv_function_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getIntegralAccess().getFunctionKeyword_2_0());
                    			
                    // InternalAlgae.g:2758:4: ( (lv_function_3_0= ruleEString ) )
                    // InternalAlgae.g:2759:5: (lv_function_3_0= ruleEString )
                    {
                    // InternalAlgae.g:2759:5: (lv_function_3_0= ruleEString )
                    // InternalAlgae.g:2760:6: lv_function_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIntegralAccess().getFunctionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_43);
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

            otherlv_4=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getIntegralAccess().getIntervalKeyword_3());
            		
            // InternalAlgae.g:2782:3: ( ( ruleEString ) )
            // InternalAlgae.g:2783:4: ( ruleEString )
            {
            // InternalAlgae.g:2783:4: ( ruleEString )
            // InternalAlgae.g:2784:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegralRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIntegralAccess().getIntervalIntervalCrossReference_4_0());
            				
            pushFollow(FOLLOW_37);
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
    // InternalAlgae.g:2806:1: entryRuleSample returns [EObject current=null] : iv_ruleSample= ruleSample EOF ;
    public final EObject entryRuleSample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSample = null;


        try {
            // InternalAlgae.g:2806:47: (iv_ruleSample= ruleSample EOF )
            // InternalAlgae.g:2807:2: iv_ruleSample= ruleSample EOF
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
    // InternalAlgae.g:2813:1: ruleSample returns [EObject current=null] : ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalAlgae.g:2819:2: ( ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalAlgae.g:2820:2: ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalAlgae.g:2820:2: ( () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalAlgae.g:2821:3: () otherlv_1= 'Sample' otherlv_2= '{' (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalAlgae.g:2821:3: ()
            // InternalAlgae.g:2822:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSampleAccess().getSampleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSampleAccess().getSampleKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getSampleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlgae.g:2836:3: (otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==45) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalAlgae.g:2837:4: otherlv_3= 'quantity' otherlv_4= '{' ( (lv_quantity_5_0= ruleMeasure ) ) (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSampleAccess().getQuantityKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSampleAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalAlgae.g:2845:4: ( (lv_quantity_5_0= ruleMeasure ) )
                    // InternalAlgae.g:2846:5: (lv_quantity_5_0= ruleMeasure )
                    {
                    // InternalAlgae.g:2846:5: (lv_quantity_5_0= ruleMeasure )
                    // InternalAlgae.g:2847:6: lv_quantity_5_0= ruleMeasure
                    {

                    						newCompositeNode(grammarAccess.getSampleAccess().getQuantityMeasureParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:2864:4: (otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==13) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalAlgae.g:2865:5: otherlv_6= ',' ( (lv_quantity_7_0= ruleMeasure ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSampleAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalAlgae.g:2869:5: ( (lv_quantity_7_0= ruleMeasure ) )
                    	    // InternalAlgae.g:2870:6: (lv_quantity_7_0= ruleMeasure )
                    	    {
                    	    // InternalAlgae.g:2870:6: (lv_quantity_7_0= ruleMeasure )
                    	    // InternalAlgae.g:2871:7: lv_quantity_7_0= ruleMeasure
                    	    {

                    	    							newCompositeNode(grammarAccess.getSampleAccess().getQuantityMeasureParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_37); 

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
    // InternalAlgae.g:2902:1: entryRuleEStructuralFeature returns [EObject current=null] : iv_ruleEStructuralFeature= ruleEStructuralFeature EOF ;
    public final EObject entryRuleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStructuralFeature = null;


        try {
            // InternalAlgae.g:2902:59: (iv_ruleEStructuralFeature= ruleEStructuralFeature EOF )
            // InternalAlgae.g:2903:2: iv_ruleEStructuralFeature= ruleEStructuralFeature EOF
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
    // InternalAlgae.g:2909:1: ruleEStructuralFeature returns [EObject current=null] : (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) ;
    public final EObject ruleEStructuralFeature() throws RecognitionException {
        EObject current = null;

        EObject this_EAttribute_0 = null;

        EObject this_EReference_1 = null;



        	enterRule();

        try {
            // InternalAlgae.g:2915:2: ( (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference ) )
            // InternalAlgae.g:2916:2: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            {
            // InternalAlgae.g:2916:2: (this_EAttribute_0= ruleEAttribute | this_EReference_1= ruleEReference )
            int alt57=2;
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
                            int LA57_4 = input.LA(5);

                            if ( ((LA57_4>=90 && LA57_4<=91)) ) {
                                alt57=1;
                            }
                            else if ( ((LA57_4>=94 && LA57_4<=95)) ) {
                                alt57=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 57, 4, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 90:
                        case 91:
                            {
                            alt57=1;
                            }
                            break;
                        case 94:
                        case 95:
                            {
                            alt57=2;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 57, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 89:
                        {
                        int LA57_4 = input.LA(4);

                        if ( ((LA57_4>=90 && LA57_4<=91)) ) {
                            alt57=1;
                        }
                        else if ( ((LA57_4>=94 && LA57_4<=95)) ) {
                            alt57=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 57, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 94:
                    case 95:
                        {
                        alt57=2;
                        }
                        break;
                    case 90:
                    case 91:
                        {
                        alt57=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 88:
                    {
                    switch ( input.LA(3) ) {
                    case 89:
                        {
                        int LA57_4 = input.LA(4);

                        if ( ((LA57_4>=90 && LA57_4<=91)) ) {
                            alt57=1;
                        }
                        else if ( ((LA57_4>=94 && LA57_4<=95)) ) {
                            alt57=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 57, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 90:
                    case 91:
                        {
                        alt57=1;
                        }
                        break;
                    case 94:
                    case 95:
                        {
                        alt57=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 89:
                    {
                    int LA57_4 = input.LA(3);

                    if ( ((LA57_4>=90 && LA57_4<=91)) ) {
                        alt57=1;
                    }
                    else if ( ((LA57_4>=94 && LA57_4<=95)) ) {
                        alt57=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 90:
                case 91:
                    {
                    alt57=1;
                    }
                    break;
                case 94:
                case 95:
                    {
                    alt57=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

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
                        int LA57_4 = input.LA(4);

                        if ( ((LA57_4>=90 && LA57_4<=91)) ) {
                            alt57=1;
                        }
                        else if ( ((LA57_4>=94 && LA57_4<=95)) ) {
                            alt57=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 57, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 90:
                    case 91:
                        {
                        alt57=1;
                        }
                        break;
                    case 94:
                    case 95:
                        {
                        alt57=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 89:
                    {
                    int LA57_4 = input.LA(3);

                    if ( ((LA57_4>=90 && LA57_4<=91)) ) {
                        alt57=1;
                    }
                    else if ( ((LA57_4>=94 && LA57_4<=95)) ) {
                        alt57=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 94:
                case 95:
                    {
                    alt57=2;
                    }
                    break;
                case 90:
                case 91:
                    {
                    alt57=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 2, input);

                    throw nvae;
                }

                }
                break;
            case 88:
                {
                switch ( input.LA(2) ) {
                case 89:
                    {
                    int LA57_4 = input.LA(3);

                    if ( ((LA57_4>=90 && LA57_4<=91)) ) {
                        alt57=1;
                    }
                    else if ( ((LA57_4>=94 && LA57_4<=95)) ) {
                        alt57=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 90:
                case 91:
                    {
                    alt57=1;
                    }
                    break;
                case 94:
                case 95:
                    {
                    alt57=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 3, input);

                    throw nvae;
                }

                }
                break;
            case 89:
                {
                int LA57_4 = input.LA(2);

                if ( ((LA57_4>=90 && LA57_4<=91)) ) {
                    alt57=1;
                }
                else if ( ((LA57_4>=94 && LA57_4<=95)) ) {
                    alt57=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 4, input);

                    throw nvae;
                }
                }
                break;
            case 90:
            case 91:
                {
                alt57=1;
                }
                break;
            case 94:
            case 95:
                {
                alt57=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalAlgae.g:2917:3: this_EAttribute_0= ruleEAttribute
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
                    // InternalAlgae.g:2926:3: this_EReference_1= ruleEReference
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
    // InternalAlgae.g:2938:1: entryRuleEClass returns [EObject current=null] : iv_ruleEClass= ruleEClass EOF ;
    public final EObject entryRuleEClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEClass = null;


        try {
            // InternalAlgae.g:2938:47: (iv_ruleEClass= ruleEClass EOF )
            // InternalAlgae.g:2939:2: iv_ruleEClass= ruleEClass EOF
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
    // InternalAlgae.g:2945:1: ruleEClass returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
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
            // InternalAlgae.g:2951:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalAlgae.g:2952:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalAlgae.g:2952:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalAlgae.g:2953:3: () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_interface_2_0= 'interface' ) )? otherlv_3= 'EClass' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )? (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )? (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )? (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )? (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )? (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // InternalAlgae.g:2953:3: ()
            // InternalAlgae.g:2954:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEClassAccess().getEClassAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:2960:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==46) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAlgae.g:2961:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalAlgae.g:2961:4: (lv_abstract_1_0= 'abstract' )
                    // InternalAlgae.g:2962:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,46,FOLLOW_45); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getEClassAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEClassRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:2974:3: ( (lv_interface_2_0= 'interface' ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==47) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAlgae.g:2975:4: (lv_interface_2_0= 'interface' )
                    {
                    // InternalAlgae.g:2975:4: (lv_interface_2_0= 'interface' )
                    // InternalAlgae.g:2976:5: lv_interface_2_0= 'interface'
                    {
                    lv_interface_2_0=(Token)match(input,47,FOLLOW_46); 

                    					newLeafNode(lv_interface_2_0, grammarAccess.getEClassAccess().getInterfaceInterfaceKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEClassRule());
                    					}
                    					setWithLastConsumed(current, "interface", true, "interface");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getEClassAccess().getEClassKeyword_3());
            		
            // InternalAlgae.g:2992:3: ( (lv_name_4_0= ruleEString ) )
            // InternalAlgae.g:2993:4: (lv_name_4_0= ruleEString )
            {
            // InternalAlgae.g:2993:4: (lv_name_4_0= ruleEString )
            // InternalAlgae.g:2994:5: lv_name_4_0= ruleEString
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

            otherlv_5=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_5, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalAlgae.g:3015:3: (otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==49) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalAlgae.g:3016:4: otherlv_6= 'instanceClassName' ( (lv_instanceClassName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEClassAccess().getInstanceClassNameKeyword_6_0());
                    			
                    // InternalAlgae.g:3020:4: ( (lv_instanceClassName_7_0= ruleEString ) )
                    // InternalAlgae.g:3021:5: (lv_instanceClassName_7_0= ruleEString )
                    {
                    // InternalAlgae.g:3021:5: (lv_instanceClassName_7_0= ruleEString )
                    // InternalAlgae.g:3022:6: lv_instanceClassName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getInstanceClassNameEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_48);
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

            // InternalAlgae.g:3040:3: (otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==50) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAlgae.g:3041:4: otherlv_8= 'instanceTypeName' ( (lv_instanceTypeName_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getEClassAccess().getInstanceTypeNameKeyword_7_0());
                    			
                    // InternalAlgae.g:3045:4: ( (lv_instanceTypeName_9_0= ruleEString ) )
                    // InternalAlgae.g:3046:5: (lv_instanceTypeName_9_0= ruleEString )
                    {
                    // InternalAlgae.g:3046:5: (lv_instanceTypeName_9_0= ruleEString )
                    // InternalAlgae.g:3047:6: lv_instanceTypeName_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getInstanceTypeNameEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_49);
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

            // InternalAlgae.g:3065:3: (otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==51) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAlgae.g:3066:4: otherlv_10= 'eSuperTypes' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,51,FOLLOW_50); 

                    				newLeafNode(otherlv_10, grammarAccess.getEClassAccess().getESuperTypesKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getEClassAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalAlgae.g:3074:4: ( ( ruleEString ) )
                    // InternalAlgae.g:3075:5: ( ruleEString )
                    {
                    // InternalAlgae.g:3075:5: ( ruleEString )
                    // InternalAlgae.g:3076:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_51);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:3090:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==13) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalAlgae.g:3091:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEClassAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalAlgae.g:3095:5: ( ( ruleEString ) )
                    	    // InternalAlgae.g:3096:6: ( ruleEString )
                    	    {
                    	    // InternalAlgae.g:3096:6: ( ruleEString )
                    	    // InternalAlgae.g:3097:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getESuperTypesEClassCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_51);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,23,FOLLOW_52); 

                    				newLeafNode(otherlv_15, grammarAccess.getEClassAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:3117:3: (otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==52) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalAlgae.g:3118:4: otherlv_16= 'eAnnotations' otherlv_17= '{' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEClassAccess().getEAnnotationsKeyword_9_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_53); 

                    				newLeafNode(otherlv_17, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalAlgae.g:3126:4: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    // InternalAlgae.g:3127:5: (lv_eAnnotations_18_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:3127:5: (lv_eAnnotations_18_0= ruleEAnnotation )
                    // InternalAlgae.g:3128:6: lv_eAnnotations_18_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEAnnotationsEAnnotationParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:3145:4: (otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==13) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalAlgae.g:3146:5: otherlv_19= ',' ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_19=(Token)match(input,13,FOLLOW_53); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEClassAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalAlgae.g:3150:5: ( (lv_eAnnotations_20_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:3151:6: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:3151:6: (lv_eAnnotations_20_0= ruleEAnnotation )
                    	    // InternalAlgae.g:3152:7: lv_eAnnotations_20_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEAnnotationsEAnnotationParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,14,FOLLOW_54); 

                    				newLeafNode(otherlv_21, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:3175:3: (otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==53) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalAlgae.g:3176:4: otherlv_22= 'eTypeParameters' otherlv_23= '{' ( (lv_eTypeParameters_24_0= ruleETypeParameter ) ) (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getEClassAccess().getETypeParametersKeyword_10_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_55); 

                    				newLeafNode(otherlv_23, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalAlgae.g:3184:4: ( (lv_eTypeParameters_24_0= ruleETypeParameter ) )
                    // InternalAlgae.g:3185:5: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    {
                    // InternalAlgae.g:3185:5: (lv_eTypeParameters_24_0= ruleETypeParameter )
                    // InternalAlgae.g:3186:6: lv_eTypeParameters_24_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getETypeParametersETypeParameterParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:3203:4: (otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==13) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalAlgae.g:3204:5: otherlv_25= ',' ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_25=(Token)match(input,13,FOLLOW_55); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEClassAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalAlgae.g:3208:5: ( (lv_eTypeParameters_26_0= ruleETypeParameter ) )
                    	    // InternalAlgae.g:3209:6: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    {
                    	    // InternalAlgae.g:3209:6: (lv_eTypeParameters_26_0= ruleETypeParameter )
                    	    // InternalAlgae.g:3210:7: lv_eTypeParameters_26_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getETypeParametersETypeParameterParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,14,FOLLOW_56); 

                    				newLeafNode(otherlv_27, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:3233:3: (otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==54) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalAlgae.g:3234:4: otherlv_28= 'eOperations' otherlv_29= '{' ( (lv_eOperations_30_0= ruleEOperation ) ) (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,54,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getEClassAccess().getEOperationsKeyword_11_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_29, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalAlgae.g:3242:4: ( (lv_eOperations_30_0= ruleEOperation ) )
                    // InternalAlgae.g:3243:5: (lv_eOperations_30_0= ruleEOperation )
                    {
                    // InternalAlgae.g:3243:5: (lv_eOperations_30_0= ruleEOperation )
                    // InternalAlgae.g:3244:6: lv_eOperations_30_0= ruleEOperation
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEOperationsEOperationParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:3261:4: (otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==13) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalAlgae.g:3262:5: otherlv_31= ',' ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    {
                    	    otherlv_31=(Token)match(input,13,FOLLOW_57); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getEClassAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalAlgae.g:3266:5: ( (lv_eOperations_32_0= ruleEOperation ) )
                    	    // InternalAlgae.g:3267:6: (lv_eOperations_32_0= ruleEOperation )
                    	    {
                    	    // InternalAlgae.g:3267:6: (lv_eOperations_32_0= ruleEOperation )
                    	    // InternalAlgae.g:3268:7: lv_eOperations_32_0= ruleEOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEOperationsEOperationParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop68;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,14,FOLLOW_58); 

                    				newLeafNode(otherlv_33, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:3291:3: (otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==55) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalAlgae.g:3292:4: otherlv_34= 'eStructuralFeatures' otherlv_35= '{' ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) ) (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,55,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getEClassAccess().getEStructuralFeaturesKeyword_12_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_59); 

                    				newLeafNode(otherlv_35, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalAlgae.g:3300:4: ( (lv_eStructuralFeatures_36_0= ruleEStructuralFeature ) )
                    // InternalAlgae.g:3301:5: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    {
                    // InternalAlgae.g:3301:5: (lv_eStructuralFeatures_36_0= ruleEStructuralFeature )
                    // InternalAlgae.g:3302:6: lv_eStructuralFeatures_36_0= ruleEStructuralFeature
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEStructuralFeaturesEStructuralFeatureParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:3319:4: (otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==13) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalAlgae.g:3320:5: otherlv_37= ',' ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    {
                    	    otherlv_37=(Token)match(input,13,FOLLOW_59); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getEClassAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalAlgae.g:3324:5: ( (lv_eStructuralFeatures_38_0= ruleEStructuralFeature ) )
                    	    // InternalAlgae.g:3325:6: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    {
                    	    // InternalAlgae.g:3325:6: (lv_eStructuralFeatures_38_0= ruleEStructuralFeature )
                    	    // InternalAlgae.g:3326:7: lv_eStructuralFeatures_38_0= ruleEStructuralFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEStructuralFeaturesEStructuralFeatureParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,14,FOLLOW_60); 

                    				newLeafNode(otherlv_39, grammarAccess.getEClassAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:3349:3: (otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==56) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalAlgae.g:3350:4: otherlv_40= 'eGenericSuperTypes' otherlv_41= '{' ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,56,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getEClassAccess().getEGenericSuperTypesKeyword_13_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_61); 

                    				newLeafNode(otherlv_41, grammarAccess.getEClassAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalAlgae.g:3358:4: ( (lv_eGenericSuperTypes_42_0= ruleEGenericType ) )
                    // InternalAlgae.g:3359:5: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:3359:5: (lv_eGenericSuperTypes_42_0= ruleEGenericType )
                    // InternalAlgae.g:3360:6: lv_eGenericSuperTypes_42_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEClassAccess().getEGenericSuperTypesEGenericTypeParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:3377:4: (otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==13) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalAlgae.g:3378:5: otherlv_43= ',' ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,13,FOLLOW_61); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getEClassAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalAlgae.g:3382:5: ( (lv_eGenericSuperTypes_44_0= ruleEGenericType ) )
                    	    // InternalAlgae.g:3383:6: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    {
                    	    // InternalAlgae.g:3383:6: (lv_eGenericSuperTypes_44_0= ruleEGenericType )
                    	    // InternalAlgae.g:3384:7: lv_eGenericSuperTypes_44_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getEClassAccess().getEGenericSuperTypesEGenericTypeParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,14,FOLLOW_37); 

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
    // InternalAlgae.g:3415:1: entryRuleEOperation returns [EObject current=null] : iv_ruleEOperation= ruleEOperation EOF ;
    public final EObject entryRuleEOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperation = null;


        try {
            // InternalAlgae.g:3415:51: (iv_ruleEOperation= ruleEOperation EOF )
            // InternalAlgae.g:3416:2: iv_ruleEOperation= ruleEOperation EOF
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
    // InternalAlgae.g:3422:1: ruleEOperation returns [EObject current=null] : ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
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
            // InternalAlgae.g:3428:2: ( ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalAlgae.g:3429:2: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalAlgae.g:3429:2: ( () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalAlgae.g:3430:3: () otherlv_1= 'EOperation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )? (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )? (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )? (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )? (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )? (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            // InternalAlgae.g:3430:3: ()
            // InternalAlgae.g:3431:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationAccess().getEOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEOperationAccess().getEOperationKeyword_1());
            		
            // InternalAlgae.g:3441:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAlgae.g:3442:4: (lv_name_2_0= ruleEString )
            {
            // InternalAlgae.g:3442:4: (lv_name_2_0= ruleEString )
            // InternalAlgae.g:3443:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_3, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAlgae.g:3464:3: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==58) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalAlgae.g:3465:4: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,58,FOLLOW_63); 

                    				newLeafNode(otherlv_4, grammarAccess.getEOperationAccess().getOrderedKeyword_4_0());
                    			
                    // InternalAlgae.g:3469:4: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // InternalAlgae.g:3470:5: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:3470:5: (lv_ordered_5_0= ruleEBoolean )
                    // InternalAlgae.g:3471:6: lv_ordered_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getOrderedEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_64);
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

            // InternalAlgae.g:3489:3: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==59) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalAlgae.g:3490:4: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,59,FOLLOW_63); 

                    				newLeafNode(otherlv_6, grammarAccess.getEOperationAccess().getUniqueKeyword_5_0());
                    			
                    // InternalAlgae.g:3494:4: ( (lv_unique_7_0= ruleEBoolean ) )
                    // InternalAlgae.g:3495:5: (lv_unique_7_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:3495:5: (lv_unique_7_0= ruleEBoolean )
                    // InternalAlgae.g:3496:6: lv_unique_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getUniqueEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_65);
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

            // InternalAlgae.g:3514:3: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==60) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalAlgae.g:3515:4: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,60,FOLLOW_66); 

                    				newLeafNode(otherlv_8, grammarAccess.getEOperationAccess().getLowerBoundKeyword_6_0());
                    			
                    // InternalAlgae.g:3519:4: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // InternalAlgae.g:3520:5: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // InternalAlgae.g:3520:5: (lv_lowerBound_9_0= ruleEInt )
                    // InternalAlgae.g:3521:6: lv_lowerBound_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getLowerBoundEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_67);
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

            // InternalAlgae.g:3539:3: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==61) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalAlgae.g:3540:4: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,61,FOLLOW_66); 

                    				newLeafNode(otherlv_10, grammarAccess.getEOperationAccess().getUpperBoundKeyword_7_0());
                    			
                    // InternalAlgae.g:3544:4: ( (lv_upperBound_11_0= ruleEInt ) )
                    // InternalAlgae.g:3545:5: (lv_upperBound_11_0= ruleEInt )
                    {
                    // InternalAlgae.g:3545:5: (lv_upperBound_11_0= ruleEInt )
                    // InternalAlgae.g:3546:6: lv_upperBound_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getUpperBoundEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_68);
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

            // InternalAlgae.g:3564:3: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==62) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalAlgae.g:3565:4: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEOperationAccess().getETypeKeyword_8_0());
                    			
                    // InternalAlgae.g:3569:4: ( ( ruleEString ) )
                    // InternalAlgae.g:3570:5: ( ruleEString )
                    {
                    // InternalAlgae.g:3570:5: ( ruleEString )
                    // InternalAlgae.g:3571:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEOperationAccess().getETypeEClassifierCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_69);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:3586:3: (otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==63) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalAlgae.g:3587:4: otherlv_14= 'eExceptions' otherlv_15= '(' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ')'
                    {
                    otherlv_14=(Token)match(input,63,FOLLOW_50); 

                    				newLeafNode(otherlv_14, grammarAccess.getEOperationAccess().getEExceptionsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getEOperationAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalAlgae.g:3595:4: ( ( ruleEString ) )
                    // InternalAlgae.g:3596:5: ( ruleEString )
                    {
                    // InternalAlgae.g:3596:5: ( ruleEString )
                    // InternalAlgae.g:3597:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_51);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:3611:4: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==13) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalAlgae.g:3612:5: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEOperationAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalAlgae.g:3616:5: ( ( ruleEString ) )
                    	    // InternalAlgae.g:3617:6: ( ruleEString )
                    	    {
                    	    // InternalAlgae.g:3617:6: ( ruleEString )
                    	    // InternalAlgae.g:3618:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEOperationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEExceptionsEClassifierCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_51);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,23,FOLLOW_70); 

                    				newLeafNode(otherlv_19, grammarAccess.getEOperationAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:3638:3: (otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==52) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalAlgae.g:3639:4: otherlv_20= 'eAnnotations' otherlv_21= '{' ( (lv_eAnnotations_22_0= ruleEAnnotation ) ) (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getEOperationAccess().getEAnnotationsKeyword_10_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_53); 

                    				newLeafNode(otherlv_21, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalAlgae.g:3647:4: ( (lv_eAnnotations_22_0= ruleEAnnotation ) )
                    // InternalAlgae.g:3648:5: (lv_eAnnotations_22_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:3648:5: (lv_eAnnotations_22_0= ruleEAnnotation )
                    // InternalAlgae.g:3649:6: lv_eAnnotations_22_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEAnnotationsEAnnotationParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:3666:4: (otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==13) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalAlgae.g:3667:5: otherlv_23= ',' ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,13,FOLLOW_53); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getEOperationAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalAlgae.g:3671:5: ( (lv_eAnnotations_24_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:3672:6: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:3672:6: (lv_eAnnotations_24_0= ruleEAnnotation )
                    	    // InternalAlgae.g:3673:7: lv_eAnnotations_24_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEAnnotationsEAnnotationParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,14,FOLLOW_71); 

                    				newLeafNode(otherlv_25, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:3696:3: (otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==64) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalAlgae.g:3697:4: otherlv_26= 'eGenericType' ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    {
                    otherlv_26=(Token)match(input,64,FOLLOW_61); 

                    				newLeafNode(otherlv_26, grammarAccess.getEOperationAccess().getEGenericTypeKeyword_11_0());
                    			
                    // InternalAlgae.g:3701:4: ( (lv_eGenericType_27_0= ruleEGenericType ) )
                    // InternalAlgae.g:3702:5: (lv_eGenericType_27_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:3702:5: (lv_eGenericType_27_0= ruleEGenericType )
                    // InternalAlgae.g:3703:6: lv_eGenericType_27_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEGenericTypeEGenericTypeParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_72);
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

            // InternalAlgae.g:3721:3: (otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==53) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalAlgae.g:3722:4: otherlv_28= 'eTypeParameters' otherlv_29= '{' ( (lv_eTypeParameters_30_0= ruleETypeParameter ) ) (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_28, grammarAccess.getEOperationAccess().getETypeParametersKeyword_12_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_55); 

                    				newLeafNode(otherlv_29, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalAlgae.g:3730:4: ( (lv_eTypeParameters_30_0= ruleETypeParameter ) )
                    // InternalAlgae.g:3731:5: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    {
                    // InternalAlgae.g:3731:5: (lv_eTypeParameters_30_0= ruleETypeParameter )
                    // InternalAlgae.g:3732:6: lv_eTypeParameters_30_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getETypeParametersETypeParameterParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:3749:4: (otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==13) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalAlgae.g:3750:5: otherlv_31= ',' ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_31=(Token)match(input,13,FOLLOW_55); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getEOperationAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalAlgae.g:3754:5: ( (lv_eTypeParameters_32_0= ruleETypeParameter ) )
                    	    // InternalAlgae.g:3755:6: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    {
                    	    // InternalAlgae.g:3755:6: (lv_eTypeParameters_32_0= ruleETypeParameter )
                    	    // InternalAlgae.g:3756:7: lv_eTypeParameters_32_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getETypeParametersETypeParameterParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop84;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,14,FOLLOW_73); 

                    				newLeafNode(otherlv_33, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:3779:3: (otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==65) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalAlgae.g:3780:4: otherlv_34= 'eParameters' otherlv_35= '{' ( (lv_eParameters_36_0= ruleEParameter ) ) (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,65,FOLLOW_4); 

                    				newLeafNode(otherlv_34, grammarAccess.getEOperationAccess().getEParametersKeyword_13_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_74); 

                    				newLeafNode(otherlv_35, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalAlgae.g:3788:4: ( (lv_eParameters_36_0= ruleEParameter ) )
                    // InternalAlgae.g:3789:5: (lv_eParameters_36_0= ruleEParameter )
                    {
                    // InternalAlgae.g:3789:5: (lv_eParameters_36_0= ruleEParameter )
                    // InternalAlgae.g:3790:6: lv_eParameters_36_0= ruleEParameter
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEParametersEParameterParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:3807:4: (otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==13) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalAlgae.g:3808:5: otherlv_37= ',' ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    {
                    	    otherlv_37=(Token)match(input,13,FOLLOW_74); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getEOperationAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalAlgae.g:3812:5: ( (lv_eParameters_38_0= ruleEParameter ) )
                    	    // InternalAlgae.g:3813:6: (lv_eParameters_38_0= ruleEParameter )
                    	    {
                    	    // InternalAlgae.g:3813:6: (lv_eParameters_38_0= ruleEParameter )
                    	    // InternalAlgae.g:3814:7: lv_eParameters_38_0= ruleEParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEParametersEParameterParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,14,FOLLOW_75); 

                    				newLeafNode(otherlv_39, grammarAccess.getEOperationAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:3837:3: (otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==66) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalAlgae.g:3838:4: otherlv_40= 'eGenericExceptions' otherlv_41= '{' ( (lv_eGenericExceptions_42_0= ruleEGenericType ) ) (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,66,FOLLOW_4); 

                    				newLeafNode(otherlv_40, grammarAccess.getEOperationAccess().getEGenericExceptionsKeyword_14_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_61); 

                    				newLeafNode(otherlv_41, grammarAccess.getEOperationAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalAlgae.g:3846:4: ( (lv_eGenericExceptions_42_0= ruleEGenericType ) )
                    // InternalAlgae.g:3847:5: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:3847:5: (lv_eGenericExceptions_42_0= ruleEGenericType )
                    // InternalAlgae.g:3848:6: lv_eGenericExceptions_42_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getEGenericExceptionsEGenericTypeParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:3865:4: (otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==13) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalAlgae.g:3866:5: otherlv_43= ',' ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_43=(Token)match(input,13,FOLLOW_61); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getEOperationAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalAlgae.g:3870:5: ( (lv_eGenericExceptions_44_0= ruleEGenericType ) )
                    	    // InternalAlgae.g:3871:6: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    {
                    	    // InternalAlgae.g:3871:6: (lv_eGenericExceptions_44_0= ruleEGenericType )
                    	    // InternalAlgae.g:3872:7: lv_eGenericExceptions_44_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getEOperationAccess().getEGenericExceptionsEGenericTypeParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,14,FOLLOW_37); 

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
    // InternalAlgae.g:3903:1: entryRuleEAnnotation returns [EObject current=null] : iv_ruleEAnnotation= ruleEAnnotation EOF ;
    public final EObject entryRuleEAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAnnotation = null;


        try {
            // InternalAlgae.g:3903:52: (iv_ruleEAnnotation= ruleEAnnotation EOF )
            // InternalAlgae.g:3904:2: iv_ruleEAnnotation= ruleEAnnotation EOF
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
    // InternalAlgae.g:3910:1: ruleEAnnotation returns [EObject current=null] : ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
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
            // InternalAlgae.g:3916:2: ( ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // InternalAlgae.g:3917:2: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // InternalAlgae.g:3917:2: ( () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // InternalAlgae.g:3918:3: () otherlv_1= 'EAnnotation' otherlv_2= '{' (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )? (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )? (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )? (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // InternalAlgae.g:3918:3: ()
            // InternalAlgae.g:3919:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAnnotationAccess().getEAnnotationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEAnnotationAccess().getEAnnotationKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_76); 

            			newLeafNode(otherlv_2, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlgae.g:3933:3: (otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==68) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalAlgae.g:3934:4: otherlv_3= 'source' ( (lv_source_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEAnnotationAccess().getSourceKeyword_3_0());
                    			
                    // InternalAlgae.g:3938:4: ( (lv_source_4_0= ruleEString ) )
                    // InternalAlgae.g:3939:5: (lv_source_4_0= ruleEString )
                    {
                    // InternalAlgae.g:3939:5: (lv_source_4_0= ruleEString )
                    // InternalAlgae.g:3940:6: lv_source_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getSourceEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_77);
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

            // InternalAlgae.g:3958:3: (otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==69) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalAlgae.g:3959:4: otherlv_5= 'references' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,69,FOLLOW_50); 

                    				newLeafNode(otherlv_5, grammarAccess.getEAnnotationAccess().getReferencesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEAnnotationAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalAlgae.g:3967:4: ( ( ruleEString ) )
                    // InternalAlgae.g:3968:5: ( ruleEString )
                    {
                    // InternalAlgae.g:3968:5: ( ruleEString )
                    // InternalAlgae.g:3969:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAnnotationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_51);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:3983:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==13) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // InternalAlgae.g:3984:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEAnnotationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalAlgae.g:3988:5: ( ( ruleEString ) )
                    	    // InternalAlgae.g:3989:6: ( ruleEString )
                    	    {
                    	    // InternalAlgae.g:3989:6: ( ruleEString )
                    	    // InternalAlgae.g:3990:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEAnnotationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getReferencesEObjectCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_51);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,23,FOLLOW_78); 

                    				newLeafNode(otherlv_10, grammarAccess.getEAnnotationAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:4010:3: (otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==52) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalAlgae.g:4011:4: otherlv_11= 'eAnnotations' otherlv_12= '{' ( (lv_eAnnotations_13_0= ruleEAnnotation ) ) (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getEAnnotationAccess().getEAnnotationsKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_53); 

                    				newLeafNode(otherlv_12, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalAlgae.g:4019:4: ( (lv_eAnnotations_13_0= ruleEAnnotation ) )
                    // InternalAlgae.g:4020:5: (lv_eAnnotations_13_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:4020:5: (lv_eAnnotations_13_0= ruleEAnnotation )
                    // InternalAlgae.g:4021:6: lv_eAnnotations_13_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getEAnnotationsEAnnotationParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:4038:4: (otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==13) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalAlgae.g:4039:5: otherlv_14= ',' ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,13,FOLLOW_53); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getEAnnotationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalAlgae.g:4043:5: ( (lv_eAnnotations_15_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:4044:6: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:4044:6: (lv_eAnnotations_15_0= ruleEAnnotation )
                    	    // InternalAlgae.g:4045:7: lv_eAnnotations_15_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getEAnnotationsEAnnotationParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop93;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,14,FOLLOW_79); 

                    				newLeafNode(otherlv_16, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:4068:3: (otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==70) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalAlgae.g:4069:4: otherlv_17= 'details' otherlv_18= '{' ( (lv_details_19_0= ruleEStringToStringMapEntry ) ) (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,70,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getEAnnotationAccess().getDetailsKeyword_6_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_80); 

                    				newLeafNode(otherlv_18, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalAlgae.g:4077:4: ( (lv_details_19_0= ruleEStringToStringMapEntry ) )
                    // InternalAlgae.g:4078:5: (lv_details_19_0= ruleEStringToStringMapEntry )
                    {
                    // InternalAlgae.g:4078:5: (lv_details_19_0= ruleEStringToStringMapEntry )
                    // InternalAlgae.g:4079:6: lv_details_19_0= ruleEStringToStringMapEntry
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getDetailsEStringToStringMapEntryParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:4096:4: (otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==13) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // InternalAlgae.g:4097:5: otherlv_20= ',' ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    {
                    	    otherlv_20=(Token)match(input,13,FOLLOW_80); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getEAnnotationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalAlgae.g:4101:5: ( (lv_details_21_0= ruleEStringToStringMapEntry ) )
                    	    // InternalAlgae.g:4102:6: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    {
                    	    // InternalAlgae.g:4102:6: (lv_details_21_0= ruleEStringToStringMapEntry )
                    	    // InternalAlgae.g:4103:7: lv_details_21_0= ruleEStringToStringMapEntry
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getDetailsEStringToStringMapEntryParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop95;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,14,FOLLOW_81); 

                    				newLeafNode(otherlv_22, grammarAccess.getEAnnotationAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:4126:3: (otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==71) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalAlgae.g:4127:4: otherlv_23= 'contents' otherlv_24= '{' ( (lv_contents_25_0= ruleEObject ) ) (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,71,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getEAnnotationAccess().getContentsKeyword_7_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_82); 

                    				newLeafNode(otherlv_24, grammarAccess.getEAnnotationAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalAlgae.g:4135:4: ( (lv_contents_25_0= ruleEObject ) )
                    // InternalAlgae.g:4136:5: (lv_contents_25_0= ruleEObject )
                    {
                    // InternalAlgae.g:4136:5: (lv_contents_25_0= ruleEObject )
                    // InternalAlgae.g:4137:6: lv_contents_25_0= ruleEObject
                    {

                    						newCompositeNode(grammarAccess.getEAnnotationAccess().getContentsEObjectParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:4154:4: (otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==13) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // InternalAlgae.g:4155:5: otherlv_26= ',' ( (lv_contents_27_0= ruleEObject ) )
                    	    {
                    	    otherlv_26=(Token)match(input,13,FOLLOW_82); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEAnnotationAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalAlgae.g:4159:5: ( (lv_contents_27_0= ruleEObject ) )
                    	    // InternalAlgae.g:4160:6: (lv_contents_27_0= ruleEObject )
                    	    {
                    	    // InternalAlgae.g:4160:6: (lv_contents_27_0= ruleEObject )
                    	    // InternalAlgae.g:4161:7: lv_contents_27_0= ruleEObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAnnotationAccess().getContentsEObjectParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop97;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,14,FOLLOW_37); 

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
    // InternalAlgae.g:4192:1: entryRuleETypeParameter returns [EObject current=null] : iv_ruleETypeParameter= ruleETypeParameter EOF ;
    public final EObject entryRuleETypeParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETypeParameter = null;


        try {
            // InternalAlgae.g:4192:55: (iv_ruleETypeParameter= ruleETypeParameter EOF )
            // InternalAlgae.g:4193:2: iv_ruleETypeParameter= ruleETypeParameter EOF
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
    // InternalAlgae.g:4199:1: ruleETypeParameter returns [EObject current=null] : ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // InternalAlgae.g:4205:2: ( ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalAlgae.g:4206:2: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalAlgae.g:4206:2: ( () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalAlgae.g:4207:3: () otherlv_1= 'ETypeParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )? (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalAlgae.g:4207:3: ()
            // InternalAlgae.g:4208:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETypeParameterAccess().getETypeParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getETypeParameterAccess().getETypeParameterKeyword_1());
            		
            // InternalAlgae.g:4218:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAlgae.g:4219:4: (lv_name_2_0= ruleEString )
            {
            // InternalAlgae.g:4219:4: (lv_name_2_0= ruleEString )
            // InternalAlgae.g:4220:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_83); 

            			newLeafNode(otherlv_3, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAlgae.g:4241:3: (otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==52) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalAlgae.g:4242:4: otherlv_4= 'eAnnotations' otherlv_5= '{' ( (lv_eAnnotations_6_0= ruleEAnnotation ) ) (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getETypeParameterAccess().getEAnnotationsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_53); 

                    				newLeafNode(otherlv_5, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalAlgae.g:4250:4: ( (lv_eAnnotations_6_0= ruleEAnnotation ) )
                    // InternalAlgae.g:4251:5: (lv_eAnnotations_6_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:4251:5: (lv_eAnnotations_6_0= ruleEAnnotation )
                    // InternalAlgae.g:4252:6: lv_eAnnotations_6_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getETypeParameterAccess().getEAnnotationsEAnnotationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:4269:4: (otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==13) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // InternalAlgae.g:4270:5: otherlv_7= ',' ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_53); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getETypeParameterAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalAlgae.g:4274:5: ( (lv_eAnnotations_8_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:4275:6: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:4275:6: (lv_eAnnotations_8_0= ruleEAnnotation )
                    	    // InternalAlgae.g:4276:7: lv_eAnnotations_8_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getETypeParameterAccess().getEAnnotationsEAnnotationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop99;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_84); 

                    				newLeafNode(otherlv_9, grammarAccess.getETypeParameterAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:4299:3: (otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}' )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==73) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalAlgae.g:4300:4: otherlv_10= 'eBounds' otherlv_11= '{' ( (lv_eBounds_12_0= ruleEGenericType ) ) (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,73,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getETypeParameterAccess().getEBoundsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_61); 

                    				newLeafNode(otherlv_11, grammarAccess.getETypeParameterAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalAlgae.g:4308:4: ( (lv_eBounds_12_0= ruleEGenericType ) )
                    // InternalAlgae.g:4309:5: (lv_eBounds_12_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:4309:5: (lv_eBounds_12_0= ruleEGenericType )
                    // InternalAlgae.g:4310:6: lv_eBounds_12_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getETypeParameterAccess().getEBoundsEGenericTypeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:4327:4: (otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) ) )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==13) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // InternalAlgae.g:4328:5: otherlv_13= ',' ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_61); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getETypeParameterAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalAlgae.g:4332:5: ( (lv_eBounds_14_0= ruleEGenericType ) )
                    	    // InternalAlgae.g:4333:6: (lv_eBounds_14_0= ruleEGenericType )
                    	    {
                    	    // InternalAlgae.g:4333:6: (lv_eBounds_14_0= ruleEGenericType )
                    	    // InternalAlgae.g:4334:7: lv_eBounds_14_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getETypeParameterAccess().getEBoundsEGenericTypeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop101;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,14,FOLLOW_37); 

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
    // InternalAlgae.g:4365:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalAlgae.g:4365:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalAlgae.g:4366:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalAlgae.g:4372:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAlgae.g:4378:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalAlgae.g:4379:2: (kw= 'true' | kw= 'false' )
            {
            // InternalAlgae.g:4379:2: (kw= 'true' | kw= 'false' )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==74) ) {
                alt103=1;
            }
            else if ( (LA103_0==75) ) {
                alt103=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // InternalAlgae.g:4380:3: kw= 'true'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlgae.g:4386:3: kw= 'false'
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
    // InternalAlgae.g:4395:1: entryRuleEGenericType returns [EObject current=null] : iv_ruleEGenericType= ruleEGenericType EOF ;
    public final EObject entryRuleEGenericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGenericType = null;


        try {
            // InternalAlgae.g:4395:53: (iv_ruleEGenericType= ruleEGenericType EOF )
            // InternalAlgae.g:4396:2: iv_ruleEGenericType= ruleEGenericType EOF
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
    // InternalAlgae.g:4402:1: ruleEGenericType returns [EObject current=null] : ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) ;
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
            // InternalAlgae.g:4408:2: ( ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' ) )
            // InternalAlgae.g:4409:2: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            {
            // InternalAlgae.g:4409:2: ( () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}' )
            // InternalAlgae.g:4410:3: () otherlv_1= 'EGenericType' otherlv_2= '{' (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )? (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )? (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )? (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )? (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )? otherlv_17= '}'
            {
            // InternalAlgae.g:4410:3: ()
            // InternalAlgae.g:4411:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEGenericTypeAccess().getEGenericTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,76,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEGenericTypeAccess().getEGenericTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_85); 

            			newLeafNode(otherlv_2, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlgae.g:4425:3: (otherlv_3= 'eTypeParameter' ( ( ruleEString ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==77) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalAlgae.g:4426:4: otherlv_3= 'eTypeParameter' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,77,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEGenericTypeAccess().getETypeParameterKeyword_3_0());
                    			
                    // InternalAlgae.g:4430:4: ( ( ruleEString ) )
                    // InternalAlgae.g:4431:5: ( ruleEString )
                    {
                    // InternalAlgae.g:4431:5: ( ruleEString )
                    // InternalAlgae.g:4432:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEGenericTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeParameterETypeParameterCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_86);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:4447:3: (otherlv_5= 'eClassifier' ( ( ruleEString ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==78) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalAlgae.g:4448:4: otherlv_5= 'eClassifier' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,78,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEGenericTypeAccess().getEClassifierKeyword_4_0());
                    			
                    // InternalAlgae.g:4452:4: ( ( ruleEString ) )
                    // InternalAlgae.g:4453:5: ( ruleEString )
                    {
                    // InternalAlgae.g:4453:5: ( ruleEString )
                    // InternalAlgae.g:4454:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEGenericTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getEClassifierEClassifierCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_87);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:4469:3: (otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) ) )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==79) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalAlgae.g:4470:4: otherlv_7= 'eUpperBound' ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    {
                    otherlv_7=(Token)match(input,79,FOLLOW_61); 

                    				newLeafNode(otherlv_7, grammarAccess.getEGenericTypeAccess().getEUpperBoundKeyword_5_0());
                    			
                    // InternalAlgae.g:4474:4: ( (lv_eUpperBound_8_0= ruleEGenericType ) )
                    // InternalAlgae.g:4475:5: (lv_eUpperBound_8_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:4475:5: (lv_eUpperBound_8_0= ruleEGenericType )
                    // InternalAlgae.g:4476:6: lv_eUpperBound_8_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getEUpperBoundEGenericTypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_88);
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

            // InternalAlgae.g:4494:3: (otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==80) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalAlgae.g:4495:4: otherlv_9= 'eTypeArguments' otherlv_10= '{' ( (lv_eTypeArguments_11_0= ruleEGenericType ) ) (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,80,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getEGenericTypeAccess().getETypeArgumentsKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_61); 

                    				newLeafNode(otherlv_10, grammarAccess.getEGenericTypeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalAlgae.g:4503:4: ( (lv_eTypeArguments_11_0= ruleEGenericType ) )
                    // InternalAlgae.g:4504:5: (lv_eTypeArguments_11_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:4504:5: (lv_eTypeArguments_11_0= ruleEGenericType )
                    // InternalAlgae.g:4505:6: lv_eTypeArguments_11_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeArgumentsEGenericTypeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:4522:4: (otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) ) )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==13) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // InternalAlgae.g:4523:5: otherlv_12= ',' ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    {
                    	    otherlv_12=(Token)match(input,13,FOLLOW_61); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getEGenericTypeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalAlgae.g:4527:5: ( (lv_eTypeArguments_13_0= ruleEGenericType ) )
                    	    // InternalAlgae.g:4528:6: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    {
                    	    // InternalAlgae.g:4528:6: (lv_eTypeArguments_13_0= ruleEGenericType )
                    	    // InternalAlgae.g:4529:7: lv_eTypeArguments_13_0= ruleEGenericType
                    	    {

                    	    							newCompositeNode(grammarAccess.getEGenericTypeAccess().getETypeArgumentsEGenericTypeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop107;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,14,FOLLOW_89); 

                    				newLeafNode(otherlv_14, grammarAccess.getEGenericTypeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:4552:3: (otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==81) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalAlgae.g:4553:4: otherlv_15= 'eLowerBound' ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    {
                    otherlv_15=(Token)match(input,81,FOLLOW_61); 

                    				newLeafNode(otherlv_15, grammarAccess.getEGenericTypeAccess().getELowerBoundKeyword_7_0());
                    			
                    // InternalAlgae.g:4557:4: ( (lv_eLowerBound_16_0= ruleEGenericType ) )
                    // InternalAlgae.g:4558:5: (lv_eLowerBound_16_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:4558:5: (lv_eLowerBound_16_0= ruleEGenericType )
                    // InternalAlgae.g:4559:6: lv_eLowerBound_16_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEGenericTypeAccess().getELowerBoundEGenericTypeParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_37);
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
    // InternalAlgae.g:4585:1: entryRuleEStringToStringMapEntry returns [EObject current=null] : iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF ;
    public final EObject entryRuleEStringToStringMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStringToStringMapEntry = null;


        try {
            // InternalAlgae.g:4585:64: (iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF )
            // InternalAlgae.g:4586:2: iv_ruleEStringToStringMapEntry= ruleEStringToStringMapEntry EOF
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
    // InternalAlgae.g:4592:1: ruleEStringToStringMapEntry returns [EObject current=null] : ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // InternalAlgae.g:4598:2: ( ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalAlgae.g:4599:2: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalAlgae.g:4599:2: ( () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalAlgae.g:4600:3: () otherlv_1= 'EStringToStringMapEntry' otherlv_2= '{' (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalAlgae.g:4600:3: ()
            // InternalAlgae.g:4601:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,82,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEStringToStringMapEntryAccess().getEStringToStringMapEntryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_90); 

            			newLeafNode(otherlv_2, grammarAccess.getEStringToStringMapEntryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlgae.g:4615:3: (otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==83) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalAlgae.g:4616:4: otherlv_3= 'key' ( (lv_key_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,83,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEStringToStringMapEntryAccess().getKeyKeyword_3_0());
                    			
                    // InternalAlgae.g:4620:4: ( (lv_key_4_0= ruleEString ) )
                    // InternalAlgae.g:4621:5: (lv_key_4_0= ruleEString )
                    {
                    // InternalAlgae.g:4621:5: (lv_key_4_0= ruleEString )
                    // InternalAlgae.g:4622:6: lv_key_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getKeyEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_91);
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

            // InternalAlgae.g:4640:3: (otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==84) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalAlgae.g:4641:4: otherlv_5= 'value' ( (lv_value_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,84,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getEStringToStringMapEntryAccess().getValueKeyword_4_0());
                    			
                    // InternalAlgae.g:4645:4: ( (lv_value_6_0= ruleEString ) )
                    // InternalAlgae.g:4646:5: (lv_value_6_0= ruleEString )
                    {
                    // InternalAlgae.g:4646:5: (lv_value_6_0= ruleEString )
                    // InternalAlgae.g:4647:6: lv_value_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEStringToStringMapEntryAccess().getValueEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_37);
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
    // InternalAlgae.g:4673:1: entryRuleEObject returns [EObject current=null] : iv_ruleEObject= ruleEObject EOF ;
    public final EObject entryRuleEObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEObject = null;


        try {
            // InternalAlgae.g:4673:48: (iv_ruleEObject= ruleEObject EOF )
            // InternalAlgae.g:4674:2: iv_ruleEObject= ruleEObject EOF
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
    // InternalAlgae.g:4680:1: ruleEObject returns [EObject current=null] : ( () otherlv_1= 'EObject' ) ;
    public final EObject ruleEObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlgae.g:4686:2: ( ( () otherlv_1= 'EObject' ) )
            // InternalAlgae.g:4687:2: ( () otherlv_1= 'EObject' )
            {
            // InternalAlgae.g:4687:2: ( () otherlv_1= 'EObject' )
            // InternalAlgae.g:4688:3: () otherlv_1= 'EObject'
            {
            // InternalAlgae.g:4688:3: ()
            // InternalAlgae.g:4689:4: 
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
    // InternalAlgae.g:4703:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalAlgae.g:4703:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalAlgae.g:4704:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalAlgae.g:4710:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalAlgae.g:4716:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalAlgae.g:4717:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalAlgae.g:4717:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalAlgae.g:4718:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalAlgae.g:4718:3: (kw= '-' )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==25) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalAlgae.g:4719:4: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_8); 

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
    // InternalAlgae.g:4736:1: entryRuleEAttribute returns [EObject current=null] : iv_ruleEAttribute= ruleEAttribute EOF ;
    public final EObject entryRuleEAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttribute = null;


        try {
            // InternalAlgae.g:4736:51: (iv_ruleEAttribute= ruleEAttribute EOF )
            // InternalAlgae.g:4737:2: iv_ruleEAttribute= ruleEAttribute EOF
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
    // InternalAlgae.g:4743:1: ruleEAttribute returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) ;
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
            // InternalAlgae.g:4749:2: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' ) )
            // InternalAlgae.g:4750:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            {
            // InternalAlgae.g:4750:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}' )
            // InternalAlgae.g:4751:3: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_iD_5_0= 'iD' ) )? otherlv_6= 'EAttribute' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'eType' ( ( ruleEString ) ) )? (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )? (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )? otherlv_31= '}'
            {
            // InternalAlgae.g:4751:3: ()
            // InternalAlgae.g:4752:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAttributeAccess().getEAttributeAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:4758:3: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==86) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalAlgae.g:4759:4: (lv_volatile_1_0= 'volatile' )
                    {
                    // InternalAlgae.g:4759:4: (lv_volatile_1_0= 'volatile' )
                    // InternalAlgae.g:4760:5: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,86,FOLLOW_92); 

                    					newLeafNode(lv_volatile_1_0, grammarAccess.getEAttributeAccess().getVolatileVolatileKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "volatile", true, "volatile");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:4772:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==87) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalAlgae.g:4773:4: (lv_transient_2_0= 'transient' )
                    {
                    // InternalAlgae.g:4773:4: (lv_transient_2_0= 'transient' )
                    // InternalAlgae.g:4774:5: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,87,FOLLOW_93); 

                    					newLeafNode(lv_transient_2_0, grammarAccess.getEAttributeAccess().getTransientTransientKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "transient", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:4786:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==88) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalAlgae.g:4787:4: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // InternalAlgae.g:4787:4: (lv_unsettable_3_0= 'unsettable' )
                    // InternalAlgae.g:4788:5: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,88,FOLLOW_94); 

                    					newLeafNode(lv_unsettable_3_0, grammarAccess.getEAttributeAccess().getUnsettableUnsettableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "unsettable", true, "unsettable");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:4800:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==89) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalAlgae.g:4801:4: (lv_derived_4_0= 'derived' )
                    {
                    // InternalAlgae.g:4801:4: (lv_derived_4_0= 'derived' )
                    // InternalAlgae.g:4802:5: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,89,FOLLOW_95); 

                    					newLeafNode(lv_derived_4_0, grammarAccess.getEAttributeAccess().getDerivedDerivedKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEAttributeRule());
                    					}
                    					setWithLastConsumed(current, "derived", true, "derived");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:4814:3: ( (lv_iD_5_0= 'iD' ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==90) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalAlgae.g:4815:4: (lv_iD_5_0= 'iD' )
                    {
                    // InternalAlgae.g:4815:4: (lv_iD_5_0= 'iD' )
                    // InternalAlgae.g:4816:5: lv_iD_5_0= 'iD'
                    {
                    lv_iD_5_0=(Token)match(input,90,FOLLOW_96); 

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
            		
            // InternalAlgae.g:4832:3: ( (lv_name_7_0= ruleEString ) )
            // InternalAlgae.g:4833:4: (lv_name_7_0= ruleEString )
            {
            // InternalAlgae.g:4833:4: (lv_name_7_0= ruleEString )
            // InternalAlgae.g:4834:5: lv_name_7_0= ruleEString
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

            otherlv_8=(Token)match(input,12,FOLLOW_97); 

            			newLeafNode(otherlv_8, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalAlgae.g:4855:3: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==58) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalAlgae.g:4856:4: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,58,FOLLOW_63); 

                    				newLeafNode(otherlv_9, grammarAccess.getEAttributeAccess().getOrderedKeyword_9_0());
                    			
                    // InternalAlgae.g:4860:4: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // InternalAlgae.g:4861:5: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:4861:5: (lv_ordered_10_0= ruleEBoolean )
                    // InternalAlgae.g:4862:6: lv_ordered_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getOrderedEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_98);
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

            // InternalAlgae.g:4880:3: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==59) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalAlgae.g:4881:4: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,59,FOLLOW_63); 

                    				newLeafNode(otherlv_11, grammarAccess.getEAttributeAccess().getUniqueKeyword_10_0());
                    			
                    // InternalAlgae.g:4885:4: ( (lv_unique_12_0= ruleEBoolean ) )
                    // InternalAlgae.g:4886:5: (lv_unique_12_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:4886:5: (lv_unique_12_0= ruleEBoolean )
                    // InternalAlgae.g:4887:6: lv_unique_12_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getUniqueEBooleanParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_99);
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

            // InternalAlgae.g:4905:3: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==60) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalAlgae.g:4906:4: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,60,FOLLOW_66); 

                    				newLeafNode(otherlv_13, grammarAccess.getEAttributeAccess().getLowerBoundKeyword_11_0());
                    			
                    // InternalAlgae.g:4910:4: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // InternalAlgae.g:4911:5: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // InternalAlgae.g:4911:5: (lv_lowerBound_14_0= ruleEInt )
                    // InternalAlgae.g:4912:6: lv_lowerBound_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getLowerBoundEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_100);
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

            // InternalAlgae.g:4930:3: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==61) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalAlgae.g:4931:4: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,61,FOLLOW_66); 

                    				newLeafNode(otherlv_15, grammarAccess.getEAttributeAccess().getUpperBoundKeyword_12_0());
                    			
                    // InternalAlgae.g:4935:4: ( (lv_upperBound_16_0= ruleEInt ) )
                    // InternalAlgae.g:4936:5: (lv_upperBound_16_0= ruleEInt )
                    {
                    // InternalAlgae.g:4936:5: (lv_upperBound_16_0= ruleEInt )
                    // InternalAlgae.g:4937:6: lv_upperBound_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getUpperBoundEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_101);
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

            // InternalAlgae.g:4955:3: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==92) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalAlgae.g:4956:4: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,92,FOLLOW_63); 

                    				newLeafNode(otherlv_17, grammarAccess.getEAttributeAccess().getChangeableKeyword_13_0());
                    			
                    // InternalAlgae.g:4960:4: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // InternalAlgae.g:4961:5: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:4961:5: (lv_changeable_18_0= ruleEBoolean )
                    // InternalAlgae.g:4962:6: lv_changeable_18_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getChangeableEBooleanParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_102);
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

            // InternalAlgae.g:4980:3: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==93) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalAlgae.g:4981:4: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,93,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getEAttributeAccess().getDefaultValueLiteralKeyword_14_0());
                    			
                    // InternalAlgae.g:4985:4: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // InternalAlgae.g:4986:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // InternalAlgae.g:4986:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    // InternalAlgae.g:4987:6: lv_defaultValueLiteral_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_103);
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

            // InternalAlgae.g:5005:3: (otherlv_21= 'eType' ( ( ruleEString ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==62) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalAlgae.g:5006:4: otherlv_21= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_21=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getEAttributeAccess().getETypeKeyword_15_0());
                    			
                    // InternalAlgae.g:5010:4: ( ( ruleEString ) )
                    // InternalAlgae.g:5011:5: ( ruleEString )
                    {
                    // InternalAlgae.g:5011:5: ( ruleEString )
                    // InternalAlgae.g:5012:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAttributeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getETypeEClassifierCrossReference_15_1_0());
                    					
                    pushFollow(FOLLOW_104);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:5027:3: (otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}' )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==52) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalAlgae.g:5028:4: otherlv_23= 'eAnnotations' otherlv_24= '{' ( (lv_eAnnotations_25_0= ruleEAnnotation ) ) (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getEAttributeAccess().getEAnnotationsKeyword_16_0());
                    			
                    otherlv_24=(Token)match(input,12,FOLLOW_53); 

                    				newLeafNode(otherlv_24, grammarAccess.getEAttributeAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalAlgae.g:5036:4: ( (lv_eAnnotations_25_0= ruleEAnnotation ) )
                    // InternalAlgae.g:5037:5: (lv_eAnnotations_25_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:5037:5: (lv_eAnnotations_25_0= ruleEAnnotation )
                    // InternalAlgae.g:5038:6: lv_eAnnotations_25_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getEAnnotationsEAnnotationParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:5055:4: (otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) ) )*
                    loop125:
                    do {
                        int alt125=2;
                        int LA125_0 = input.LA(1);

                        if ( (LA125_0==13) ) {
                            alt125=1;
                        }


                        switch (alt125) {
                    	case 1 :
                    	    // InternalAlgae.g:5056:5: otherlv_26= ',' ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_26=(Token)match(input,13,FOLLOW_53); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getEAttributeAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalAlgae.g:5060:5: ( (lv_eAnnotations_27_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:5061:6: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:5061:6: (lv_eAnnotations_27_0= ruleEAnnotation )
                    	    // InternalAlgae.g:5062:7: lv_eAnnotations_27_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEAttributeAccess().getEAnnotationsEAnnotationParserRuleCall_16_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop125;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,14,FOLLOW_105); 

                    				newLeafNode(otherlv_28, grammarAccess.getEAttributeAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:5085:3: (otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==64) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalAlgae.g:5086:4: otherlv_29= 'eGenericType' ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    {
                    otherlv_29=(Token)match(input,64,FOLLOW_61); 

                    				newLeafNode(otherlv_29, grammarAccess.getEAttributeAccess().getEGenericTypeKeyword_17_0());
                    			
                    // InternalAlgae.g:5090:4: ( (lv_eGenericType_30_0= ruleEGenericType ) )
                    // InternalAlgae.g:5091:5: (lv_eGenericType_30_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:5091:5: (lv_eGenericType_30_0= ruleEGenericType )
                    // InternalAlgae.g:5092:6: lv_eGenericType_30_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEAttributeAccess().getEGenericTypeEGenericTypeParserRuleCall_17_1_0());
                    					
                    pushFollow(FOLLOW_37);
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
    // InternalAlgae.g:5118:1: entryRuleEReference returns [EObject current=null] : iv_ruleEReference= ruleEReference EOF ;
    public final EObject entryRuleEReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEReference = null;


        try {
            // InternalAlgae.g:5118:51: (iv_ruleEReference= ruleEReference EOF )
            // InternalAlgae.g:5119:2: iv_ruleEReference= ruleEReference EOF
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
    // InternalAlgae.g:5125:1: ruleEReference returns [EObject current=null] : ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) ;
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
            // InternalAlgae.g:5131:2: ( ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' ) )
            // InternalAlgae.g:5132:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            {
            // InternalAlgae.g:5132:2: ( () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}' )
            // InternalAlgae.g:5133:3: () ( (lv_volatile_1_0= 'volatile' ) )? ( (lv_transient_2_0= 'transient' ) )? ( (lv_unsettable_3_0= 'unsettable' ) )? ( (lv_derived_4_0= 'derived' ) )? ( (lv_containment_5_0= 'containment' ) )? otherlv_6= 'EReference' ( (lv_name_7_0= ruleEString ) ) otherlv_8= '{' (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )? (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )? (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )? (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )? (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )? (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )? (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )? (otherlv_23= 'eType' ( ( ruleEString ) ) )? (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )? (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )? (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )? (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )? otherlv_41= '}'
            {
            // InternalAlgae.g:5133:3: ()
            // InternalAlgae.g:5134:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEReferenceAccess().getEReferenceAction_0(),
            					current);
            			

            }

            // InternalAlgae.g:5140:3: ( (lv_volatile_1_0= 'volatile' ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==86) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalAlgae.g:5141:4: (lv_volatile_1_0= 'volatile' )
                    {
                    // InternalAlgae.g:5141:4: (lv_volatile_1_0= 'volatile' )
                    // InternalAlgae.g:5142:5: lv_volatile_1_0= 'volatile'
                    {
                    lv_volatile_1_0=(Token)match(input,86,FOLLOW_106); 

                    					newLeafNode(lv_volatile_1_0, grammarAccess.getEReferenceAccess().getVolatileVolatileKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "volatile", true, "volatile");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:5154:3: ( (lv_transient_2_0= 'transient' ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==87) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalAlgae.g:5155:4: (lv_transient_2_0= 'transient' )
                    {
                    // InternalAlgae.g:5155:4: (lv_transient_2_0= 'transient' )
                    // InternalAlgae.g:5156:5: lv_transient_2_0= 'transient'
                    {
                    lv_transient_2_0=(Token)match(input,87,FOLLOW_107); 

                    					newLeafNode(lv_transient_2_0, grammarAccess.getEReferenceAccess().getTransientTransientKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "transient", true, "transient");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:5168:3: ( (lv_unsettable_3_0= 'unsettable' ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==88) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalAlgae.g:5169:4: (lv_unsettable_3_0= 'unsettable' )
                    {
                    // InternalAlgae.g:5169:4: (lv_unsettable_3_0= 'unsettable' )
                    // InternalAlgae.g:5170:5: lv_unsettable_3_0= 'unsettable'
                    {
                    lv_unsettable_3_0=(Token)match(input,88,FOLLOW_108); 

                    					newLeafNode(lv_unsettable_3_0, grammarAccess.getEReferenceAccess().getUnsettableUnsettableKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "unsettable", true, "unsettable");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:5182:3: ( (lv_derived_4_0= 'derived' ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==89) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalAlgae.g:5183:4: (lv_derived_4_0= 'derived' )
                    {
                    // InternalAlgae.g:5183:4: (lv_derived_4_0= 'derived' )
                    // InternalAlgae.g:5184:5: lv_derived_4_0= 'derived'
                    {
                    lv_derived_4_0=(Token)match(input,89,FOLLOW_109); 

                    					newLeafNode(lv_derived_4_0, grammarAccess.getEReferenceAccess().getDerivedDerivedKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEReferenceRule());
                    					}
                    					setWithLastConsumed(current, "derived", true, "derived");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgae.g:5196:3: ( (lv_containment_5_0= 'containment' ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==94) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalAlgae.g:5197:4: (lv_containment_5_0= 'containment' )
                    {
                    // InternalAlgae.g:5197:4: (lv_containment_5_0= 'containment' )
                    // InternalAlgae.g:5198:5: lv_containment_5_0= 'containment'
                    {
                    lv_containment_5_0=(Token)match(input,94,FOLLOW_110); 

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
            		
            // InternalAlgae.g:5214:3: ( (lv_name_7_0= ruleEString ) )
            // InternalAlgae.g:5215:4: (lv_name_7_0= ruleEString )
            {
            // InternalAlgae.g:5215:4: (lv_name_7_0= ruleEString )
            // InternalAlgae.g:5216:5: lv_name_7_0= ruleEString
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

            otherlv_8=(Token)match(input,12,FOLLOW_111); 

            			newLeafNode(otherlv_8, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalAlgae.g:5237:3: (otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==58) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalAlgae.g:5238:4: otherlv_9= 'ordered' ( (lv_ordered_10_0= ruleEBoolean ) )
                    {
                    otherlv_9=(Token)match(input,58,FOLLOW_63); 

                    				newLeafNode(otherlv_9, grammarAccess.getEReferenceAccess().getOrderedKeyword_9_0());
                    			
                    // InternalAlgae.g:5242:4: ( (lv_ordered_10_0= ruleEBoolean ) )
                    // InternalAlgae.g:5243:5: (lv_ordered_10_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:5243:5: (lv_ordered_10_0= ruleEBoolean )
                    // InternalAlgae.g:5244:6: lv_ordered_10_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getOrderedEBooleanParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_112);
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

            // InternalAlgae.g:5262:3: (otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==59) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalAlgae.g:5263:4: otherlv_11= 'unique' ( (lv_unique_12_0= ruleEBoolean ) )
                    {
                    otherlv_11=(Token)match(input,59,FOLLOW_63); 

                    				newLeafNode(otherlv_11, grammarAccess.getEReferenceAccess().getUniqueKeyword_10_0());
                    			
                    // InternalAlgae.g:5267:4: ( (lv_unique_12_0= ruleEBoolean ) )
                    // InternalAlgae.g:5268:5: (lv_unique_12_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:5268:5: (lv_unique_12_0= ruleEBoolean )
                    // InternalAlgae.g:5269:6: lv_unique_12_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getUniqueEBooleanParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_113);
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

            // InternalAlgae.g:5287:3: (otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==60) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalAlgae.g:5288:4: otherlv_13= 'lowerBound' ( (lv_lowerBound_14_0= ruleEInt ) )
                    {
                    otherlv_13=(Token)match(input,60,FOLLOW_66); 

                    				newLeafNode(otherlv_13, grammarAccess.getEReferenceAccess().getLowerBoundKeyword_11_0());
                    			
                    // InternalAlgae.g:5292:4: ( (lv_lowerBound_14_0= ruleEInt ) )
                    // InternalAlgae.g:5293:5: (lv_lowerBound_14_0= ruleEInt )
                    {
                    // InternalAlgae.g:5293:5: (lv_lowerBound_14_0= ruleEInt )
                    // InternalAlgae.g:5294:6: lv_lowerBound_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getLowerBoundEIntParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_114);
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

            // InternalAlgae.g:5312:3: (otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==61) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalAlgae.g:5313:4: otherlv_15= 'upperBound' ( (lv_upperBound_16_0= ruleEInt ) )
                    {
                    otherlv_15=(Token)match(input,61,FOLLOW_66); 

                    				newLeafNode(otherlv_15, grammarAccess.getEReferenceAccess().getUpperBoundKeyword_12_0());
                    			
                    // InternalAlgae.g:5317:4: ( (lv_upperBound_16_0= ruleEInt ) )
                    // InternalAlgae.g:5318:5: (lv_upperBound_16_0= ruleEInt )
                    {
                    // InternalAlgae.g:5318:5: (lv_upperBound_16_0= ruleEInt )
                    // InternalAlgae.g:5319:6: lv_upperBound_16_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getUpperBoundEIntParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_115);
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

            // InternalAlgae.g:5337:3: (otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==92) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalAlgae.g:5338:4: otherlv_17= 'changeable' ( (lv_changeable_18_0= ruleEBoolean ) )
                    {
                    otherlv_17=(Token)match(input,92,FOLLOW_63); 

                    				newLeafNode(otherlv_17, grammarAccess.getEReferenceAccess().getChangeableKeyword_13_0());
                    			
                    // InternalAlgae.g:5342:4: ( (lv_changeable_18_0= ruleEBoolean ) )
                    // InternalAlgae.g:5343:5: (lv_changeable_18_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:5343:5: (lv_changeable_18_0= ruleEBoolean )
                    // InternalAlgae.g:5344:6: lv_changeable_18_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getChangeableEBooleanParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_116);
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

            // InternalAlgae.g:5362:3: (otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==93) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalAlgae.g:5363:4: otherlv_19= 'defaultValueLiteral' ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,93,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getEReferenceAccess().getDefaultValueLiteralKeyword_14_0());
                    			
                    // InternalAlgae.g:5367:4: ( (lv_defaultValueLiteral_20_0= ruleEString ) )
                    // InternalAlgae.g:5368:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    {
                    // InternalAlgae.g:5368:5: (lv_defaultValueLiteral_20_0= ruleEString )
                    // InternalAlgae.g:5369:6: lv_defaultValueLiteral_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getDefaultValueLiteralEStringParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_117);
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

            // InternalAlgae.g:5387:3: (otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==96) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalAlgae.g:5388:4: otherlv_21= 'resolveProxies' ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    {
                    otherlv_21=(Token)match(input,96,FOLLOW_63); 

                    				newLeafNode(otherlv_21, grammarAccess.getEReferenceAccess().getResolveProxiesKeyword_15_0());
                    			
                    // InternalAlgae.g:5392:4: ( (lv_resolveProxies_22_0= ruleEBoolean ) )
                    // InternalAlgae.g:5393:5: (lv_resolveProxies_22_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:5393:5: (lv_resolveProxies_22_0= ruleEBoolean )
                    // InternalAlgae.g:5394:6: lv_resolveProxies_22_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getResolveProxiesEBooleanParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_118);
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

            // InternalAlgae.g:5412:3: (otherlv_23= 'eType' ( ( ruleEString ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==62) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalAlgae.g:5413:4: otherlv_23= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_23=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getEReferenceAccess().getETypeKeyword_16_0());
                    			
                    // InternalAlgae.g:5417:4: ( ( ruleEString ) )
                    // InternalAlgae.g:5418:5: ( ruleEString )
                    {
                    // InternalAlgae.g:5418:5: ( ruleEString )
                    // InternalAlgae.g:5419:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getETypeEClassifierCrossReference_16_1_0());
                    					
                    pushFollow(FOLLOW_119);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:5434:3: (otherlv_25= 'eOpposite' ( ( ruleEString ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==97) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalAlgae.g:5435:4: otherlv_25= 'eOpposite' ( ( ruleEString ) )
                    {
                    otherlv_25=(Token)match(input,97,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getEReferenceAccess().getEOppositeKeyword_17_0());
                    			
                    // InternalAlgae.g:5439:4: ( ( ruleEString ) )
                    // InternalAlgae.g:5440:5: ( ruleEString )
                    {
                    // InternalAlgae.g:5440:5: ( ruleEString )
                    // InternalAlgae.g:5441:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEOppositeEReferenceCrossReference_17_1_0());
                    					
                    pushFollow(FOLLOW_120);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:5456:3: (otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')' )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==98) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalAlgae.g:5457:4: otherlv_27= 'eKeys' otherlv_28= '(' ( ( ruleEString ) ) (otherlv_30= ',' ( ( ruleEString ) ) )* otherlv_32= ')'
                    {
                    otherlv_27=(Token)match(input,98,FOLLOW_50); 

                    				newLeafNode(otherlv_27, grammarAccess.getEReferenceAccess().getEKeysKeyword_18_0());
                    			
                    otherlv_28=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getEReferenceAccess().getLeftParenthesisKeyword_18_1());
                    			
                    // InternalAlgae.g:5465:4: ( ( ruleEString ) )
                    // InternalAlgae.g:5466:5: ( ruleEString )
                    {
                    // InternalAlgae.g:5466:5: ( ruleEString )
                    // InternalAlgae.g:5467:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_2_0());
                    					
                    pushFollow(FOLLOW_51);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlgae.g:5481:4: (otherlv_30= ',' ( ( ruleEString ) ) )*
                    loop142:
                    do {
                        int alt142=2;
                        int LA142_0 = input.LA(1);

                        if ( (LA142_0==13) ) {
                            alt142=1;
                        }


                        switch (alt142) {
                    	case 1 :
                    	    // InternalAlgae.g:5482:5: otherlv_30= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_30=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getEReferenceAccess().getCommaKeyword_18_3_0());
                    	    				
                    	    // InternalAlgae.g:5486:5: ( ( ruleEString ) )
                    	    // InternalAlgae.g:5487:6: ( ruleEString )
                    	    {
                    	    // InternalAlgae.g:5487:6: ( ruleEString )
                    	    // InternalAlgae.g:5488:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEReferenceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEReferenceAccess().getEKeysEAttributeCrossReference_18_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_51);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop142;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,23,FOLLOW_104); 

                    				newLeafNode(otherlv_32, grammarAccess.getEReferenceAccess().getRightParenthesisKeyword_18_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:5508:3: (otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}' )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==52) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalAlgae.g:5509:4: otherlv_33= 'eAnnotations' otherlv_34= '{' ( (lv_eAnnotations_35_0= ruleEAnnotation ) ) (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_33, grammarAccess.getEReferenceAccess().getEAnnotationsKeyword_19_0());
                    			
                    otherlv_34=(Token)match(input,12,FOLLOW_53); 

                    				newLeafNode(otherlv_34, grammarAccess.getEReferenceAccess().getLeftCurlyBracketKeyword_19_1());
                    			
                    // InternalAlgae.g:5517:4: ( (lv_eAnnotations_35_0= ruleEAnnotation ) )
                    // InternalAlgae.g:5518:5: (lv_eAnnotations_35_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:5518:5: (lv_eAnnotations_35_0= ruleEAnnotation )
                    // InternalAlgae.g:5519:6: lv_eAnnotations_35_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEAnnotationsEAnnotationParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:5536:4: (otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) ) )*
                    loop144:
                    do {
                        int alt144=2;
                        int LA144_0 = input.LA(1);

                        if ( (LA144_0==13) ) {
                            alt144=1;
                        }


                        switch (alt144) {
                    	case 1 :
                    	    // InternalAlgae.g:5537:5: otherlv_36= ',' ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_36=(Token)match(input,13,FOLLOW_53); 

                    	    					newLeafNode(otherlv_36, grammarAccess.getEReferenceAccess().getCommaKeyword_19_3_0());
                    	    				
                    	    // InternalAlgae.g:5541:5: ( (lv_eAnnotations_37_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:5542:6: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:5542:6: (lv_eAnnotations_37_0= ruleEAnnotation )
                    	    // InternalAlgae.g:5543:7: lv_eAnnotations_37_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEReferenceAccess().getEAnnotationsEAnnotationParserRuleCall_19_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop144;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,14,FOLLOW_105); 

                    				newLeafNode(otherlv_38, grammarAccess.getEReferenceAccess().getRightCurlyBracketKeyword_19_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:5566:3: (otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==64) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalAlgae.g:5567:4: otherlv_39= 'eGenericType' ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    {
                    otherlv_39=(Token)match(input,64,FOLLOW_61); 

                    				newLeafNode(otherlv_39, grammarAccess.getEReferenceAccess().getEGenericTypeKeyword_20_0());
                    			
                    // InternalAlgae.g:5571:4: ( (lv_eGenericType_40_0= ruleEGenericType ) )
                    // InternalAlgae.g:5572:5: (lv_eGenericType_40_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:5572:5: (lv_eGenericType_40_0= ruleEGenericType )
                    // InternalAlgae.g:5573:6: lv_eGenericType_40_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEReferenceAccess().getEGenericTypeEGenericTypeParserRuleCall_20_1_0());
                    					
                    pushFollow(FOLLOW_37);
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
    // InternalAlgae.g:5599:1: entryRuleEDataType_Impl returns [EObject current=null] : iv_ruleEDataType_Impl= ruleEDataType_Impl EOF ;
    public final EObject entryRuleEDataType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataType_Impl = null;


        try {
            // InternalAlgae.g:5599:55: (iv_ruleEDataType_Impl= ruleEDataType_Impl EOF )
            // InternalAlgae.g:5600:2: iv_ruleEDataType_Impl= ruleEDataType_Impl EOF
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
    // InternalAlgae.g:5606:1: ruleEDataType_Impl returns [EObject current=null] : ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
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
            // InternalAlgae.g:5612:2: ( ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalAlgae.g:5613:2: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalAlgae.g:5613:2: ( () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalAlgae.g:5614:3: () otherlv_1= 'EDataType' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalAlgae.g:5614:3: ()
            // InternalAlgae.g:5615:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDataType_ImplAccess().getEDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,99,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEDataType_ImplAccess().getEDataTypeKeyword_1());
            		
            // InternalAlgae.g:5625:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAlgae.g:5626:4: (lv_name_2_0= ruleEString )
            {
            // InternalAlgae.g:5626:4: (lv_name_2_0= ruleEString )
            // InternalAlgae.g:5627:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_121); 

            			newLeafNode(otherlv_3, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAlgae.g:5648:3: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==49) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalAlgae.g:5649:4: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEDataType_ImplAccess().getInstanceClassNameKeyword_4_0());
                    			
                    // InternalAlgae.g:5653:4: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // InternalAlgae.g:5654:5: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // InternalAlgae.g:5654:5: (lv_instanceClassName_5_0= ruleEString )
                    // InternalAlgae.g:5655:6: lv_instanceClassName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceClassNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_122);
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

            // InternalAlgae.g:5673:3: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==50) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalAlgae.g:5674:4: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameKeyword_5_0());
                    			
                    // InternalAlgae.g:5678:4: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // InternalAlgae.g:5679:5: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // InternalAlgae.g:5679:5: (lv_instanceTypeName_7_0= ruleEString )
                    // InternalAlgae.g:5680:6: lv_instanceTypeName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_123);
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

            // InternalAlgae.g:5698:3: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==100) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalAlgae.g:5699:4: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,100,FOLLOW_63); 

                    				newLeafNode(otherlv_8, grammarAccess.getEDataType_ImplAccess().getSerializableKeyword_6_0());
                    			
                    // InternalAlgae.g:5703:4: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // InternalAlgae.g:5704:5: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:5704:5: (lv_serializable_9_0= ruleEBoolean )
                    // InternalAlgae.g:5705:6: lv_serializable_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getSerializableEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_124);
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

            // InternalAlgae.g:5723:3: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==52) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalAlgae.g:5724:4: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEDataType_ImplAccess().getEAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_53); 

                    				newLeafNode(otherlv_11, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalAlgae.g:5732:4: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // InternalAlgae.g:5733:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:5733:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // InternalAlgae.g:5734:6: lv_eAnnotations_12_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getEAnnotationsEAnnotationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:5751:4: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop150:
                    do {
                        int alt150=2;
                        int LA150_0 = input.LA(1);

                        if ( (LA150_0==13) ) {
                            alt150=1;
                        }


                        switch (alt150) {
                    	case 1 :
                    	    // InternalAlgae.g:5752:5: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_53); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalAlgae.g:5756:5: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:5757:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:5757:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // InternalAlgae.g:5758:7: lv_eAnnotations_14_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEDataType_ImplAccess().getEAnnotationsEAnnotationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop150;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,14,FOLLOW_125); 

                    				newLeafNode(otherlv_15, grammarAccess.getEDataType_ImplAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:5781:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==53) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalAlgae.g:5782:4: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEDataType_ImplAccess().getETypeParametersKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_55); 

                    				newLeafNode(otherlv_17, grammarAccess.getEDataType_ImplAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalAlgae.g:5790:4: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // InternalAlgae.g:5791:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // InternalAlgae.g:5791:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // InternalAlgae.g:5792:6: lv_eTypeParameters_18_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEDataType_ImplAccess().getETypeParametersETypeParameterParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:5809:4: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop152:
                    do {
                        int alt152=2;
                        int LA152_0 = input.LA(1);

                        if ( (LA152_0==13) ) {
                            alt152=1;
                        }


                        switch (alt152) {
                    	case 1 :
                    	    // InternalAlgae.g:5810:5: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,13,FOLLOW_55); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEDataType_ImplAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalAlgae.g:5814:5: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // InternalAlgae.g:5815:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // InternalAlgae.g:5815:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // InternalAlgae.g:5816:7: lv_eTypeParameters_20_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEDataType_ImplAccess().getETypeParametersETypeParameterParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop152;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,14,FOLLOW_37); 

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
    // InternalAlgae.g:5847:1: entryRuleEEnum returns [EObject current=null] : iv_ruleEEnum= ruleEEnum EOF ;
    public final EObject entryRuleEEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnum = null;


        try {
            // InternalAlgae.g:5847:46: (iv_ruleEEnum= ruleEEnum EOF )
            // InternalAlgae.g:5848:2: iv_ruleEEnum= ruleEEnum EOF
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
    // InternalAlgae.g:5854:1: ruleEEnum returns [EObject current=null] : ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
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
            // InternalAlgae.g:5860:2: ( ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalAlgae.g:5861:2: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalAlgae.g:5861:2: ( () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalAlgae.g:5862:3: () otherlv_1= 'EEnum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )? (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )? (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )? (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )? (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )? (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // InternalAlgae.g:5862:3: ()
            // InternalAlgae.g:5863:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnumAccess().getEEnumAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,101,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnumAccess().getEEnumKeyword_1());
            		
            // InternalAlgae.g:5873:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAlgae.g:5874:4: (lv_name_2_0= ruleEString )
            {
            // InternalAlgae.g:5874:4: (lv_name_2_0= ruleEString )
            // InternalAlgae.g:5875:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_126); 

            			newLeafNode(otherlv_3, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAlgae.g:5896:3: (otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) ) )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==49) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // InternalAlgae.g:5897:4: otherlv_4= 'instanceClassName' ( (lv_instanceClassName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEEnumAccess().getInstanceClassNameKeyword_4_0());
                    			
                    // InternalAlgae.g:5901:4: ( (lv_instanceClassName_5_0= ruleEString ) )
                    // InternalAlgae.g:5902:5: (lv_instanceClassName_5_0= ruleEString )
                    {
                    // InternalAlgae.g:5902:5: (lv_instanceClassName_5_0= ruleEString )
                    // InternalAlgae.g:5903:6: lv_instanceClassName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getInstanceClassNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_127);
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

            // InternalAlgae.g:5921:3: (otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) ) )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==50) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // InternalAlgae.g:5922:4: otherlv_6= 'instanceTypeName' ( (lv_instanceTypeName_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEEnumAccess().getInstanceTypeNameKeyword_5_0());
                    			
                    // InternalAlgae.g:5926:4: ( (lv_instanceTypeName_7_0= ruleEString ) )
                    // InternalAlgae.g:5927:5: (lv_instanceTypeName_7_0= ruleEString )
                    {
                    // InternalAlgae.g:5927:5: (lv_instanceTypeName_7_0= ruleEString )
                    // InternalAlgae.g:5928:6: lv_instanceTypeName_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getInstanceTypeNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_128);
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

            // InternalAlgae.g:5946:3: (otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) ) )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==100) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // InternalAlgae.g:5947:4: otherlv_8= 'serializable' ( (lv_serializable_9_0= ruleEBoolean ) )
                    {
                    otherlv_8=(Token)match(input,100,FOLLOW_63); 

                    				newLeafNode(otherlv_8, grammarAccess.getEEnumAccess().getSerializableKeyword_6_0());
                    			
                    // InternalAlgae.g:5951:4: ( (lv_serializable_9_0= ruleEBoolean ) )
                    // InternalAlgae.g:5952:5: (lv_serializable_9_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:5952:5: (lv_serializable_9_0= ruleEBoolean )
                    // InternalAlgae.g:5953:6: lv_serializable_9_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getSerializableEBooleanParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_129);
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

            // InternalAlgae.g:5971:3: (otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}' )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==52) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalAlgae.g:5972:4: otherlv_10= 'eAnnotations' otherlv_11= '{' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEEnumAccess().getEAnnotationsKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_53); 

                    				newLeafNode(otherlv_11, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalAlgae.g:5980:4: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    // InternalAlgae.g:5981:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:5981:5: (lv_eAnnotations_12_0= ruleEAnnotation )
                    // InternalAlgae.g:5982:6: lv_eAnnotations_12_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getEAnnotationsEAnnotationParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:5999:4: (otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) ) )*
                    loop157:
                    do {
                        int alt157=2;
                        int LA157_0 = input.LA(1);

                        if ( (LA157_0==13) ) {
                            alt157=1;
                        }


                        switch (alt157) {
                    	case 1 :
                    	    // InternalAlgae.g:6000:5: otherlv_13= ',' ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,13,FOLLOW_53); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEEnumAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalAlgae.g:6004:5: ( (lv_eAnnotations_14_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:6005:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:6005:6: (lv_eAnnotations_14_0= ruleEAnnotation )
                    	    // InternalAlgae.g:6006:7: lv_eAnnotations_14_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumAccess().getEAnnotationsEAnnotationParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop157;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,14,FOLLOW_130); 

                    				newLeafNode(otherlv_15, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:6029:3: (otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}' )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==53) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // InternalAlgae.g:6030:4: otherlv_16= 'eTypeParameters' otherlv_17= '{' ( (lv_eTypeParameters_18_0= ruleETypeParameter ) ) (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,53,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEEnumAccess().getETypeParametersKeyword_8_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_55); 

                    				newLeafNode(otherlv_17, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalAlgae.g:6038:4: ( (lv_eTypeParameters_18_0= ruleETypeParameter ) )
                    // InternalAlgae.g:6039:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    {
                    // InternalAlgae.g:6039:5: (lv_eTypeParameters_18_0= ruleETypeParameter )
                    // InternalAlgae.g:6040:6: lv_eTypeParameters_18_0= ruleETypeParameter
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getETypeParametersETypeParameterParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:6057:4: (otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) ) )*
                    loop159:
                    do {
                        int alt159=2;
                        int LA159_0 = input.LA(1);

                        if ( (LA159_0==13) ) {
                            alt159=1;
                        }


                        switch (alt159) {
                    	case 1 :
                    	    // InternalAlgae.g:6058:5: otherlv_19= ',' ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,13,FOLLOW_55); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEEnumAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalAlgae.g:6062:5: ( (lv_eTypeParameters_20_0= ruleETypeParameter ) )
                    	    // InternalAlgae.g:6063:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    {
                    	    // InternalAlgae.g:6063:6: (lv_eTypeParameters_20_0= ruleETypeParameter )
                    	    // InternalAlgae.g:6064:7: lv_eTypeParameters_20_0= ruleETypeParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumAccess().getETypeParametersETypeParameterParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop159;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,14,FOLLOW_131); 

                    				newLeafNode(otherlv_21, grammarAccess.getEEnumAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:6087:3: (otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}' )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==102) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // InternalAlgae.g:6088:4: otherlv_22= 'eLiterals' otherlv_23= '{' ( (lv_eLiterals_24_0= ruleEEnumLiteral ) ) (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,102,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getEEnumAccess().getELiteralsKeyword_9_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_132); 

                    				newLeafNode(otherlv_23, grammarAccess.getEEnumAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalAlgae.g:6096:4: ( (lv_eLiterals_24_0= ruleEEnumLiteral ) )
                    // InternalAlgae.g:6097:5: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    {
                    // InternalAlgae.g:6097:5: (lv_eLiterals_24_0= ruleEEnumLiteral )
                    // InternalAlgae.g:6098:6: lv_eLiterals_24_0= ruleEEnumLiteral
                    {

                    						newCompositeNode(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:6115:4: (otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) ) )*
                    loop161:
                    do {
                        int alt161=2;
                        int LA161_0 = input.LA(1);

                        if ( (LA161_0==13) ) {
                            alt161=1;
                        }


                        switch (alt161) {
                    	case 1 :
                    	    // InternalAlgae.g:6116:5: otherlv_25= ',' ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    {
                    	    otherlv_25=(Token)match(input,13,FOLLOW_132); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getEEnumAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalAlgae.g:6120:5: ( (lv_eLiterals_26_0= ruleEEnumLiteral ) )
                    	    // InternalAlgae.g:6121:6: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    {
                    	    // InternalAlgae.g:6121:6: (lv_eLiterals_26_0= ruleEEnumLiteral )
                    	    // InternalAlgae.g:6122:7: lv_eLiterals_26_0= ruleEEnumLiteral
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumAccess().getELiteralsEEnumLiteralParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop161;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,14,FOLLOW_37); 

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
    // InternalAlgae.g:6153:1: entryRuleEEnumLiteral returns [EObject current=null] : iv_ruleEEnumLiteral= ruleEEnumLiteral EOF ;
    public final EObject entryRuleEEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEnumLiteral = null;


        try {
            // InternalAlgae.g:6153:53: (iv_ruleEEnumLiteral= ruleEEnumLiteral EOF )
            // InternalAlgae.g:6154:2: iv_ruleEEnumLiteral= ruleEEnumLiteral EOF
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
    // InternalAlgae.g:6160:1: ruleEEnumLiteral returns [EObject current=null] : ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
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
            // InternalAlgae.g:6166:2: ( ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalAlgae.g:6167:2: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalAlgae.g:6167:2: ( () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalAlgae.g:6168:3: () otherlv_1= 'EEnumLiteral' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )? (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )? (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // InternalAlgae.g:6168:3: ()
            // InternalAlgae.g:6169:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEEnumLiteralAccess().getEEnumLiteralAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,103,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEEnumLiteralAccess().getEEnumLiteralKeyword_1());
            		
            // InternalAlgae.g:6179:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAlgae.g:6180:4: (lv_name_2_0= ruleEString )
            {
            // InternalAlgae.g:6180:4: (lv_name_2_0= ruleEString )
            // InternalAlgae.g:6181:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_133); 

            			newLeafNode(otherlv_3, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAlgae.g:6202:3: (otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) ) )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==84) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // InternalAlgae.g:6203:4: otherlv_4= 'value' ( (lv_value_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,84,FOLLOW_66); 

                    				newLeafNode(otherlv_4, grammarAccess.getEEnumLiteralAccess().getValueKeyword_4_0());
                    			
                    // InternalAlgae.g:6207:4: ( (lv_value_5_0= ruleEInt ) )
                    // InternalAlgae.g:6208:5: (lv_value_5_0= ruleEInt )
                    {
                    // InternalAlgae.g:6208:5: (lv_value_5_0= ruleEInt )
                    // InternalAlgae.g:6209:6: lv_value_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getValueEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_134);
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

            // InternalAlgae.g:6227:3: (otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) ) )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==104) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // InternalAlgae.g:6228:4: otherlv_6= 'literal' ( (lv_literal_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,104,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEEnumLiteralAccess().getLiteralKeyword_5_0());
                    			
                    // InternalAlgae.g:6232:4: ( (lv_literal_7_0= ruleEString ) )
                    // InternalAlgae.g:6233:5: (lv_literal_7_0= ruleEString )
                    {
                    // InternalAlgae.g:6233:5: (lv_literal_7_0= ruleEString )
                    // InternalAlgae.g:6234:6: lv_literal_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getLiteralEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_135);
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

            // InternalAlgae.g:6252:3: (otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}' )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==52) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // InternalAlgae.g:6253:4: otherlv_8= 'eAnnotations' otherlv_9= '{' ( (lv_eAnnotations_10_0= ruleEAnnotation ) ) (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEEnumLiteralAccess().getEAnnotationsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_53); 

                    				newLeafNode(otherlv_9, grammarAccess.getEEnumLiteralAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalAlgae.g:6261:4: ( (lv_eAnnotations_10_0= ruleEAnnotation ) )
                    // InternalAlgae.g:6262:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:6262:5: (lv_eAnnotations_10_0= ruleEAnnotation )
                    // InternalAlgae.g:6263:6: lv_eAnnotations_10_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEEnumLiteralAccess().getEAnnotationsEAnnotationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:6280:4: (otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) ) )*
                    loop165:
                    do {
                        int alt165=2;
                        int LA165_0 = input.LA(1);

                        if ( (LA165_0==13) ) {
                            alt165=1;
                        }


                        switch (alt165) {
                    	case 1 :
                    	    // InternalAlgae.g:6281:5: otherlv_11= ',' ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,13,FOLLOW_53); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getEEnumLiteralAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalAlgae.g:6285:5: ( (lv_eAnnotations_12_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:6286:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:6286:6: (lv_eAnnotations_12_0= ruleEAnnotation )
                    	    // InternalAlgae.g:6287:7: lv_eAnnotations_12_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEEnumLiteralAccess().getEAnnotationsEAnnotationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop165;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,14,FOLLOW_37); 

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
    // InternalAlgae.g:6318:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalAlgae.g:6318:51: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalAlgae.g:6319:2: iv_ruleEParameter= ruleEParameter EOF
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
    // InternalAlgae.g:6325:1: ruleEParameter returns [EObject current=null] : ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) ;
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
            // InternalAlgae.g:6331:2: ( ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' ) )
            // InternalAlgae.g:6332:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            {
            // InternalAlgae.g:6332:2: ( () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}' )
            // InternalAlgae.g:6333:3: () otherlv_1= 'EParameter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )? (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )? (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )? (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )? (otherlv_12= 'eType' ( ( ruleEString ) ) )? (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )? (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )? otherlv_22= '}'
            {
            // InternalAlgae.g:6333:3: ()
            // InternalAlgae.g:6334:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEParameterAccess().getEParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,105,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getEParameterKeyword_1());
            		
            // InternalAlgae.g:6344:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAlgae.g:6345:4: (lv_name_2_0= ruleEString )
            {
            // InternalAlgae.g:6345:4: (lv_name_2_0= ruleEString )
            // InternalAlgae.g:6346:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_136); 

            			newLeafNode(otherlv_3, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAlgae.g:6367:3: (otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) ) )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==58) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // InternalAlgae.g:6368:4: otherlv_4= 'ordered' ( (lv_ordered_5_0= ruleEBoolean ) )
                    {
                    otherlv_4=(Token)match(input,58,FOLLOW_63); 

                    				newLeafNode(otherlv_4, grammarAccess.getEParameterAccess().getOrderedKeyword_4_0());
                    			
                    // InternalAlgae.g:6372:4: ( (lv_ordered_5_0= ruleEBoolean ) )
                    // InternalAlgae.g:6373:5: (lv_ordered_5_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:6373:5: (lv_ordered_5_0= ruleEBoolean )
                    // InternalAlgae.g:6374:6: lv_ordered_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getOrderedEBooleanParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_137);
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

            // InternalAlgae.g:6392:3: (otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) ) )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==59) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // InternalAlgae.g:6393:4: otherlv_6= 'unique' ( (lv_unique_7_0= ruleEBoolean ) )
                    {
                    otherlv_6=(Token)match(input,59,FOLLOW_63); 

                    				newLeafNode(otherlv_6, grammarAccess.getEParameterAccess().getUniqueKeyword_5_0());
                    			
                    // InternalAlgae.g:6397:4: ( (lv_unique_7_0= ruleEBoolean ) )
                    // InternalAlgae.g:6398:5: (lv_unique_7_0= ruleEBoolean )
                    {
                    // InternalAlgae.g:6398:5: (lv_unique_7_0= ruleEBoolean )
                    // InternalAlgae.g:6399:6: lv_unique_7_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getUniqueEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_138);
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

            // InternalAlgae.g:6417:3: (otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) ) )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==60) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // InternalAlgae.g:6418:4: otherlv_8= 'lowerBound' ( (lv_lowerBound_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,60,FOLLOW_66); 

                    				newLeafNode(otherlv_8, grammarAccess.getEParameterAccess().getLowerBoundKeyword_6_0());
                    			
                    // InternalAlgae.g:6422:4: ( (lv_lowerBound_9_0= ruleEInt ) )
                    // InternalAlgae.g:6423:5: (lv_lowerBound_9_0= ruleEInt )
                    {
                    // InternalAlgae.g:6423:5: (lv_lowerBound_9_0= ruleEInt )
                    // InternalAlgae.g:6424:6: lv_lowerBound_9_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getLowerBoundEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_139);
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

            // InternalAlgae.g:6442:3: (otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) ) )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==61) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // InternalAlgae.g:6443:4: otherlv_10= 'upperBound' ( (lv_upperBound_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,61,FOLLOW_66); 

                    				newLeafNode(otherlv_10, grammarAccess.getEParameterAccess().getUpperBoundKeyword_7_0());
                    			
                    // InternalAlgae.g:6447:4: ( (lv_upperBound_11_0= ruleEInt ) )
                    // InternalAlgae.g:6448:5: (lv_upperBound_11_0= ruleEInt )
                    {
                    // InternalAlgae.g:6448:5: (lv_upperBound_11_0= ruleEInt )
                    // InternalAlgae.g:6449:6: lv_upperBound_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getUpperBoundEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_103);
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

            // InternalAlgae.g:6467:3: (otherlv_12= 'eType' ( ( ruleEString ) ) )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==62) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // InternalAlgae.g:6468:4: otherlv_12= 'eType' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getEParameterAccess().getETypeKeyword_8_0());
                    			
                    // InternalAlgae.g:6472:4: ( ( ruleEString ) )
                    // InternalAlgae.g:6473:5: ( ruleEString )
                    {
                    // InternalAlgae.g:6473:5: ( ruleEString )
                    // InternalAlgae.g:6474:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEParameterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEParameterAccess().getETypeEClassifierCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_104);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAlgae.g:6489:3: (otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}' )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==52) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // InternalAlgae.g:6490:4: otherlv_14= 'eAnnotations' otherlv_15= '{' ( (lv_eAnnotations_16_0= ruleEAnnotation ) ) (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getEParameterAccess().getEAnnotationsKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_53); 

                    				newLeafNode(otherlv_15, grammarAccess.getEParameterAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalAlgae.g:6498:4: ( (lv_eAnnotations_16_0= ruleEAnnotation ) )
                    // InternalAlgae.g:6499:5: (lv_eAnnotations_16_0= ruleEAnnotation )
                    {
                    // InternalAlgae.g:6499:5: (lv_eAnnotations_16_0= ruleEAnnotation )
                    // InternalAlgae.g:6500:6: lv_eAnnotations_16_0= ruleEAnnotation
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getEAnnotationsEAnnotationParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_41);
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

                    // InternalAlgae.g:6517:4: (otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) ) )*
                    loop172:
                    do {
                        int alt172=2;
                        int LA172_0 = input.LA(1);

                        if ( (LA172_0==13) ) {
                            alt172=1;
                        }


                        switch (alt172) {
                    	case 1 :
                    	    // InternalAlgae.g:6518:5: otherlv_17= ',' ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    {
                    	    otherlv_17=(Token)match(input,13,FOLLOW_53); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getEParameterAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalAlgae.g:6522:5: ( (lv_eAnnotations_18_0= ruleEAnnotation ) )
                    	    // InternalAlgae.g:6523:6: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    {
                    	    // InternalAlgae.g:6523:6: (lv_eAnnotations_18_0= ruleEAnnotation )
                    	    // InternalAlgae.g:6524:7: lv_eAnnotations_18_0= ruleEAnnotation
                    	    {

                    	    							newCompositeNode(grammarAccess.getEParameterAccess().getEAnnotationsEAnnotationParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_41);
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
                    	    break loop172;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,14,FOLLOW_105); 

                    				newLeafNode(otherlv_19, grammarAccess.getEParameterAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalAlgae.g:6547:3: (otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) ) )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( (LA174_0==64) ) {
                alt174=1;
            }
            switch (alt174) {
                case 1 :
                    // InternalAlgae.g:6548:4: otherlv_20= 'eGenericType' ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    {
                    otherlv_20=(Token)match(input,64,FOLLOW_61); 

                    				newLeafNode(otherlv_20, grammarAccess.getEParameterAccess().getEGenericTypeKeyword_10_0());
                    			
                    // InternalAlgae.g:6552:4: ( (lv_eGenericType_21_0= ruleEGenericType ) )
                    // InternalAlgae.g:6553:5: (lv_eGenericType_21_0= ruleEGenericType )
                    {
                    // InternalAlgae.g:6553:5: (lv_eGenericType_21_0= ruleEGenericType )
                    // InternalAlgae.g:6554:6: lv_eGenericType_21_0= ruleEGenericType
                    {

                    						newCompositeNode(grammarAccess.getEParameterAccess().getEGenericTypeEGenericTypeParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_37);
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


    // $ANTLR start "ruleType"
    // InternalAlgae.g:6580:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'duration' ) | (enumLiteral_1= 'frequency' ) | (enumLiteral_2= 'scalar' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalAlgae.g:6586:2: ( ( (enumLiteral_0= 'duration' ) | (enumLiteral_1= 'frequency' ) | (enumLiteral_2= 'scalar' ) ) )
            // InternalAlgae.g:6587:2: ( (enumLiteral_0= 'duration' ) | (enumLiteral_1= 'frequency' ) | (enumLiteral_2= 'scalar' ) )
            {
            // InternalAlgae.g:6587:2: ( (enumLiteral_0= 'duration' ) | (enumLiteral_1= 'frequency' ) | (enumLiteral_2= 'scalar' ) )
            int alt175=3;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt175=1;
                }
                break;
            case 107:
                {
                alt175=2;
                }
                break;
            case 108:
                {
                alt175=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 175, 0, input);

                throw nvae;
            }

            switch (alt175) {
                case 1 :
                    // InternalAlgae.g:6588:3: (enumLiteral_0= 'duration' )
                    {
                    // InternalAlgae.g:6588:3: (enumLiteral_0= 'duration' )
                    // InternalAlgae.g:6589:4: enumLiteral_0= 'duration'
                    {
                    enumLiteral_0=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDurationEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getDurationEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlgae.g:6596:3: (enumLiteral_1= 'frequency' )
                    {
                    // InternalAlgae.g:6596:3: (enumLiteral_1= 'frequency' )
                    // InternalAlgae.g:6597:4: enumLiteral_1= 'frequency'
                    {
                    enumLiteral_1=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFrequencyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getFrequencyEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlgae.g:6604:3: (enumLiteral_2= 'scalar' )
                    {
                    // InternalAlgae.g:6604:3: (enumLiteral_2= 'scalar' )
                    // InternalAlgae.g:6605:4: enumLiteral_2= 'scalar'
                    {
                    enumLiteral_2=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getScalarEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getScalarEnumLiteralDeclaration_2());
                    			

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


    // $ANTLR start "ruleVisibility"
    // InternalAlgae.g:6615:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAlgae.g:6621:2: ( ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) ) )
            // InternalAlgae.g:6622:2: ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) )
            {
            // InternalAlgae.g:6622:2: ( (enumLiteral_0= 'LOCAL' ) | (enumLiteral_1= 'GLOBAL' ) )
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==109) ) {
                alt176=1;
            }
            else if ( (LA176_0==110) ) {
                alt176=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 176, 0, input);

                throw nvae;
            }
            switch (alt176) {
                case 1 :
                    // InternalAlgae.g:6623:3: (enumLiteral_0= 'LOCAL' )
                    {
                    // InternalAlgae.g:6623:3: (enumLiteral_0= 'LOCAL' )
                    // InternalAlgae.g:6624:4: enumLiteral_0= 'LOCAL'
                    {
                    enumLiteral_0=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getLOCALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlgae.g:6631:3: (enumLiteral_1= 'GLOBAL' )
                    {
                    // InternalAlgae.g:6631:3: (enumLiteral_1= 'GLOBAL' )
                    // InternalAlgae.g:6632:4: enumLiteral_1= 'GLOBAL'
                    {
                    enumLiteral_1=(Token)match(input,110,FOLLOW_2); 

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
    static final String dfa_1s = "\61\uffff";
    static final String dfa_2s = "\17\uffff\1\23\1\uffff\1\23\37\uffff";
    static final String dfa_3s = "\2\4\2\17\1\6\1\4\1\uffff\1\17\1\6\2\17\3\21\1\27\4\4\1\uffff\2\17\4\uffff\2\21\4\17\5\uffff\1\4\2\17\3\21\2\4\2\30\2\21";
    static final String dfa_4s = "\2\26\2\25\1\17\1\154\1\uffff\1\17\1\6\2\25\3\21\1\27\1\45\1\154\1\45\1\5\1\uffff\2\33\4\uffff\2\21\2\33\2\17\5\uffff\1\154\5\21\1\5\1\154\2\33\2\21";
    static final String dfa_5s = "\6\uffff\1\11\14\uffff\1\1\2\uffff\1\2\1\3\1\12\1\13\6\uffff\1\6\1\4\1\7\1\10\1\5\14\uffff";
    static final String dfa_6s = "\61\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\12\uffff\1\1\5\uffff\1\4",
            "\1\2\1\3\20\uffff\1\4",
            "\1\5\5\uffff\1\6",
            "\1\5\5\uffff\1\6",
            "\1\7\10\uffff\1\10",
            "\1\11\1\12\144\uffff\1\13\1\14\1\15",
            "",
            "\1\10",
            "\1\16",
            "\1\20\1\uffff\1\17\3\uffff\1\6",
            "\1\20\1\uffff\1\17\3\uffff\1\6",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\22",
            "\1\24\1\25\1\23\6\uffff\4\23\1\uffff\1\26\1\27\2\uffff\1\23\5\uffff\2\30\1\31\6\uffff\1\23",
            "\1\32\1\33\144\uffff\1\13\1\14\1\15",
            "\1\34\1\35\1\23\6\uffff\4\23\1\uffff\1\26\1\27\2\uffff\1\23\5\uffff\2\30\1\31\6\uffff\1\23",
            "\1\36\1\37",
            "",
            "\1\23\4\uffff\1\41\1\23\2\uffff\1\40\1\43\1\44\1\42",
            "\1\23\4\uffff\1\41\1\23\2\uffff\1\40\1\43\1\44\1\42",
            "",
            "",
            "",
            "",
            "\1\17",
            "\1\17",
            "\1\23\5\uffff\1\23\2\uffff\1\40\1\43\1\44\1\42",
            "\1\23\5\uffff\1\23\2\uffff\1\40\1\43\1\44\1\42",
            "\1\45",
            "\1\45",
            "",
            "",
            "",
            "",
            "",
            "\1\46\1\47\144\uffff\1\50\1\51\1\52",
            "\1\54\1\uffff\1\53",
            "\1\54\1\uffff\1\53",
            "\1\53",
            "\1\53",
            "\1\53",
            "\1\55\1\56",
            "\1\57\1\60\144\uffff\1\50\1\51\1\52",
            "\1\40\1\43\1\44\1\42",
            "\1\40\1\43\1\44\1\42",
            "\1\53",
            "\1\53"
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
            return "182:2: (this_MeasureValue_Impl_0= ruleMeasureValue_Impl | this_MeasureOCL_1= ruleMeasureOCL | this_MeasureAttribute_2= ruleMeasureAttribute | this_MeasureCast_3= ruleMeasureCast | this_MeasureUnboundProductOperation_4= ruleMeasureUnboundProductOperation | this_MeasureUnboundSumOperation_5= ruleMeasureUnboundSumOperation | this_MeasureUnboundDivisionOperation_6= ruleMeasureUnboundDivisionOperation | this_MeasureUnboundSubstractOperation_7= ruleMeasureUnboundSubstractOperation | this_RealTimeDuration_8= ruleRealTimeDuration | this_CompositeMeasure_9= ruleCompositeMeasure | this_IntegrationMeasure_10= ruleIntegrationMeasure )";
        }
    }
    static final String dfa_8s = "\20\uffff";
    static final String dfa_9s = "\2\4\2\17\1\4\2\17\3\21\1\4\1\34\2\21\2\uffff";
    static final String dfa_10s = "\1\20\1\5\2\17\1\154\5\21\1\154\1\35\2\21\2\uffff";
    static final String dfa_11s = "\16\uffff\1\2\1\1";
    static final String dfa_12s = "\20\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\1\3\12\uffff\1\1",
            "\1\2\1\3",
            "\1\4",
            "\1\4",
            "\1\5\1\6\144\uffff\1\7\1\10\1\11",
            "\1\12\1\uffff\1\13",
            "\1\12\1\uffff\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\14\1\15\144\uffff\1\7\1\10\1\11",
            "\1\17\1\16",
            "\1\13",
            "\1\13",
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
            return "299:2: (this_ExponentialMeasure_0= ruleExponentialMeasure | this_LogisticMeasure_1= ruleLogisticMeasure )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000410030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000416030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L,0x00001C0000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x00001C0000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000018000004000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000004000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000004000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x01FE000000004000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x01FC000000004000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x01F8000000004000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x01F0000000004000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x01E0000000004000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x01C0000000004000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0180000000004000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x00000000CFC00000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0100000000004000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0xFC30000000004000L,0x0000000000000007L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0xF830000000004000L,0x0000000000000007L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0xF030000000004000L,0x0000000000000007L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0xE030000000004000L,0x0000000000000007L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0xC030000000004000L,0x0000000000000007L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x8030000000004000L,0x0000000000000007L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0030000000004000L,0x0000000000000007L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0020000000004000L,0x0000000000000007L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0020000000004000L,0x0000000000000006L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000006L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000004L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0010000000004000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0010000000004000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0010000000004000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000004000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000080L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0010000000004000L,0x0000000000000200L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000200L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000004000L,0x000000000003E000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000004000L,0x000000000003C000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000004000L,0x0000000000038000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000004000L,0x0000000000030000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000004000L,0x0000000000020000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000004000L,0x0000000000180000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000004000L,0x0000000000100000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x000000000F800000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x000000000F000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x000000000E000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x7C10000000004000L,0x0000000030000001L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x7810000000004000L,0x0000000030000001L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x7010000000004000L,0x0000000030000001L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x6010000000004000L,0x0000000030000001L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x4010000000004000L,0x0000000030000001L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x4010000000004000L,0x0000000020000001L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x4010000000004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0010000000004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x00000000C3800000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x00000000C3000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x00000000C2000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x7C10000000004000L,0x0000000730000001L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x7810000000004000L,0x0000000730000001L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x7010000000004000L,0x0000000730000001L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x6010000000004000L,0x0000000730000001L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x4010000000004000L,0x0000000730000001L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x4010000000004000L,0x0000000720000001L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x4010000000004000L,0x0000000700000001L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x4010000000004000L,0x0000000600000001L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0010000000004000L,0x0000000600000001L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0010000000004000L,0x0000000400000001L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0036000000004000L,0x0000001000000000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0034000000004000L,0x0000001000000000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0030000000004000L,0x0000001000000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0030000000004000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0020000000004000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0036000000004000L,0x0000005000000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0034000000004000L,0x0000005000000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0030000000004000L,0x0000005000000000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0030000000004000L,0x0000004000000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0020000000004000L,0x0000004000000000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000004000L,0x0000004000000000L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0010000000004000L,0x0000010000100000L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0010000000004000L,0x0000010000000000L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0010000000004000L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x7C10000000004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x7810000000004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_138 = new BitSet(new long[]{0x7010000000004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_139 = new BitSet(new long[]{0x6010000000004000L,0x0000000000000001L});

}