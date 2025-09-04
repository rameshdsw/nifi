// $ANTLR 3.5.3 org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g

	package org.apache.nifi.attribute.expression.language.antlr;
	import org.apache.nifi.attribute.expression.language.exception.AttributeExpressionLanguageParsingException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class AttributeExpressionParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALL_ATTRIBUTES", "ALL_DELINEATED_VALUES", 
		"ALL_MATCHING_ATTRIBUTES", "AND", "ANY_ATTRIBUTE", "ANY_DELINEATED_VALUE", 
		"ANY_MATCHING_ATTRIBUTE", "APPEND", "ATTRIBUTE_NAME", "BASE64_DECODE", 
		"BASE64_ENCODE", "COLON", "COMMA", "COMMENT", "CONTAINS", "COUNT", "DECIMAL", 
		"DIVIDE", "DOLLAR", "DOT", "ENDS_WITH", "EQUALS", "EQUALS_IGNORE_CASE", 
		"ESC", "ESCAPE_CSV", "ESCAPE_HTML3", "ESCAPE_HTML4", "ESCAPE_JSON", "ESCAPE_XML", 
		"EVALUATE_EL_STRING", "EXP", "FALSE", "FIND", "FORMAT", "FORMAT_INSTANT", 
		"FROM_RADIX", "GET_DELIMITED_FIELD", "GET_STATE_VALUE", "GET_URI", "GREATER_THAN", 
		"GREATER_THAN_OR_EQUAL", "HASH", "HOSTNAME", "IF_ELSE", "IN", "INDEX_OF", 
		"IP", "IS_EMPTY", "IS_JSON", "IS_NULL", "JOIN", "JSON_PATH", "JSON_PATH_ADD", 
		"JSON_PATH_DELETE", "JSON_PATH_PUT", "JSON_PATH_SET", "LAST_INDEX_OF", 
		"LBRACE", "LENGTH", "LESS_THAN", "LESS_THAN_OR_EQUAL", "LPAREN", "MATCHES", 
		"MATH", "MINUS", "MOD", "MULTIPLY", "NEXT_INT", "NOT", "NOT_NULL", "NOW", 
		"NULL", "OP", "OR", "PAD_LEFT", "PAD_RIGHT", "PARAMETER_REFERENCE_START", 
		"PLUS", "PREPEND", "RANDOM", "RBRACE", "REPEAT", "REPLACE", "REPLACE_ALL", 
		"REPLACE_BY_PATTERN", "REPLACE_EMPTY", "REPLACE_FIRST", "REPLACE_NULL", 
		"RPAREN", "SEMICOLON", "STARTS_WITH", "STRING_LITERAL", "SUBSTRING", "SUBSTRING_AFTER", 
		"SUBSTRING_AFTER_LAST", "SUBSTRING_BEFORE", "SUBSTRING_BEFORE_LAST", "THREAD", 
		"TO_DATE", "TO_DECIMAL", "TO_INSTANT", "TO_LITERAL", "TO_LOWER", "TO_MICROS", 
		"TO_NANOS", "TO_NUMBER", "TO_RADIX", "TO_STRING", "TO_UPPER", "TRIM", 
		"TRUE", "UNESCAPE_CSV", "UNESCAPE_HTML3", "UNESCAPE_HTML4", "UNESCAPE_JSON", 
		"UNESCAPE_XML", "URL_DECODE", "URL_ENCODE", "UUID", "UUID3", "UUID5", 
		"WHITESPACE", "WHOLE_NUMBER", "ATTRIBUTE_REFERENCE", "ATTR_NAME", "EXPRESSION", 
		"FUNCTION_CALL", "MULTI_ATTRIBUTE_REFERENCE", "PARAMETER_REFERENCE", "QUERY", 
		"QUOTED_ATTR_NAME"
	};
	public static final int EOF=-1;
	public static final int ALL_ATTRIBUTES=4;
	public static final int ALL_DELINEATED_VALUES=5;
	public static final int ALL_MATCHING_ATTRIBUTES=6;
	public static final int AND=7;
	public static final int ANY_ATTRIBUTE=8;
	public static final int ANY_DELINEATED_VALUE=9;
	public static final int ANY_MATCHING_ATTRIBUTE=10;
	public static final int APPEND=11;
	public static final int ATTRIBUTE_NAME=12;
	public static final int BASE64_DECODE=13;
	public static final int BASE64_ENCODE=14;
	public static final int COLON=15;
	public static final int COMMA=16;
	public static final int COMMENT=17;
	public static final int CONTAINS=18;
	public static final int COUNT=19;
	public static final int DECIMAL=20;
	public static final int DIVIDE=21;
	public static final int DOLLAR=22;
	public static final int DOT=23;
	public static final int ENDS_WITH=24;
	public static final int EQUALS=25;
	public static final int EQUALS_IGNORE_CASE=26;
	public static final int ESC=27;
	public static final int ESCAPE_CSV=28;
	public static final int ESCAPE_HTML3=29;
	public static final int ESCAPE_HTML4=30;
	public static final int ESCAPE_JSON=31;
	public static final int ESCAPE_XML=32;
	public static final int EVALUATE_EL_STRING=33;
	public static final int EXP=34;
	public static final int FALSE=35;
	public static final int FIND=36;
	public static final int FORMAT=37;
	public static final int FORMAT_INSTANT=38;
	public static final int FROM_RADIX=39;
	public static final int GET_DELIMITED_FIELD=40;
	public static final int GET_STATE_VALUE=41;
	public static final int GET_URI=42;
	public static final int GREATER_THAN=43;
	public static final int GREATER_THAN_OR_EQUAL=44;
	public static final int HASH=45;
	public static final int HOSTNAME=46;
	public static final int IF_ELSE=47;
	public static final int IN=48;
	public static final int INDEX_OF=49;
	public static final int IP=50;
	public static final int IS_EMPTY=51;
	public static final int IS_JSON=52;
	public static final int IS_NULL=53;
	public static final int JOIN=54;
	public static final int JSON_PATH=55;
	public static final int JSON_PATH_ADD=56;
	public static final int JSON_PATH_DELETE=57;
	public static final int JSON_PATH_PUT=58;
	public static final int JSON_PATH_SET=59;
	public static final int LAST_INDEX_OF=60;
	public static final int LBRACE=61;
	public static final int LENGTH=62;
	public static final int LESS_THAN=63;
	public static final int LESS_THAN_OR_EQUAL=64;
	public static final int LPAREN=65;
	public static final int MATCHES=66;
	public static final int MATH=67;
	public static final int MINUS=68;
	public static final int MOD=69;
	public static final int MULTIPLY=70;
	public static final int NEXT_INT=71;
	public static final int NOT=72;
	public static final int NOT_NULL=73;
	public static final int NOW=74;
	public static final int NULL=75;
	public static final int OP=76;
	public static final int OR=77;
	public static final int PAD_LEFT=78;
	public static final int PAD_RIGHT=79;
	public static final int PARAMETER_REFERENCE_START=80;
	public static final int PLUS=81;
	public static final int PREPEND=82;
	public static final int RANDOM=83;
	public static final int RBRACE=84;
	public static final int REPEAT=85;
	public static final int REPLACE=86;
	public static final int REPLACE_ALL=87;
	public static final int REPLACE_BY_PATTERN=88;
	public static final int REPLACE_EMPTY=89;
	public static final int REPLACE_FIRST=90;
	public static final int REPLACE_NULL=91;
	public static final int RPAREN=92;
	public static final int SEMICOLON=93;
	public static final int STARTS_WITH=94;
	public static final int STRING_LITERAL=95;
	public static final int SUBSTRING=96;
	public static final int SUBSTRING_AFTER=97;
	public static final int SUBSTRING_AFTER_LAST=98;
	public static final int SUBSTRING_BEFORE=99;
	public static final int SUBSTRING_BEFORE_LAST=100;
	public static final int THREAD=101;
	public static final int TO_DATE=102;
	public static final int TO_DECIMAL=103;
	public static final int TO_INSTANT=104;
	public static final int TO_LITERAL=105;
	public static final int TO_LOWER=106;
	public static final int TO_MICROS=107;
	public static final int TO_NANOS=108;
	public static final int TO_NUMBER=109;
	public static final int TO_RADIX=110;
	public static final int TO_STRING=111;
	public static final int TO_UPPER=112;
	public static final int TRIM=113;
	public static final int TRUE=114;
	public static final int UNESCAPE_CSV=115;
	public static final int UNESCAPE_HTML3=116;
	public static final int UNESCAPE_HTML4=117;
	public static final int UNESCAPE_JSON=118;
	public static final int UNESCAPE_XML=119;
	public static final int URL_DECODE=120;
	public static final int URL_ENCODE=121;
	public static final int UUID=122;
	public static final int UUID3=123;
	public static final int UUID5=124;
	public static final int WHITESPACE=125;
	public static final int WHOLE_NUMBER=126;
	public static final int ATTRIBUTE_REFERENCE=127;
	public static final int ATTR_NAME=128;
	public static final int EXPRESSION=129;
	public static final int FUNCTION_CALL=130;
	public static final int MULTI_ATTRIBUTE_REFERENCE=131;
	public static final int PARAMETER_REFERENCE=132;
	public static final int QUERY=133;
	public static final int QUOTED_ATTR_NAME=134;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public AttributeExpressionParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public AttributeExpressionParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return AttributeExpressionParser.tokenNames; }
	@Override public String getGrammarFileName() { return "org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g"; }


	  public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
	  	final StringBuilder sb = new StringBuilder();
	    if ( e.token == null ) {
	    	sb.append("Unrecognized token ");
	    } else {
	    	sb.append("Unexpected token '").append(e.token.getText()).append("' ");
	    }
	    sb.append("at line ").append(e.line);
	    if ( e.approximateLineInfo ) {
	    	sb.append(" (approximately)");
	    }
	    sb.append(", column ").append(e.charPositionInLine);
	    sb.append(". Query: ").append(e.input.toString());

	    throw new AttributeExpressionLanguageParsingException(sb.toString());
	  }

	  public void recover(final RecognitionException e) {
	  	final StringBuilder sb = new StringBuilder();
	    if ( e.token == null ) {
	    	sb.append("Unrecognized token ");
	    } else {
	    	sb.append("Unexpected token '").append(e.token.getText()).append("' ");
	    }
	    sb.append("at line ").append(e.line);
	    if ( e.approximateLineInfo ) {
	    	sb.append(" (approximately)");
	    }
	    sb.append(", column ").append(e.charPositionInLine);
	    sb.append(". Query: ").append(e.input.toString());

	    throw new AttributeExpressionLanguageParsingException(sb.toString());
	  }


	public static class zeroArgString_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "zeroArgString"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:78:1: zeroArgString : ( TO_UPPER | TO_LOWER | TRIM | TO_STRING | URL_ENCODE | URL_DECODE | BASE64_ENCODE | BASE64_DECODE | ESCAPE_JSON | ESCAPE_XML | ESCAPE_CSV | ESCAPE_HTML3 | ESCAPE_HTML4 | UNESCAPE_JSON | UNESCAPE_XML | UNESCAPE_CSV | UNESCAPE_HTML3 | UNESCAPE_HTML4 | EVALUATE_EL_STRING ) LPAREN ! RPAREN !;
	public final AttributeExpressionParser.zeroArgString_return zeroArgString() throws RecognitionException {
		AttributeExpressionParser.zeroArgString_return retval = new AttributeExpressionParser.zeroArgString_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set1=null;
		Token LPAREN2=null;
		Token RPAREN3=null;

		Object set1_tree=null;
		Object LPAREN2_tree=null;
		Object RPAREN3_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:78:15: ( ( TO_UPPER | TO_LOWER | TRIM | TO_STRING | URL_ENCODE | URL_DECODE | BASE64_ENCODE | BASE64_DECODE | ESCAPE_JSON | ESCAPE_XML | ESCAPE_CSV | ESCAPE_HTML3 | ESCAPE_HTML4 | UNESCAPE_JSON | UNESCAPE_XML | UNESCAPE_CSV | UNESCAPE_HTML3 | UNESCAPE_HTML4 | EVALUATE_EL_STRING ) LPAREN ! RPAREN !)
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:78:17: ( TO_UPPER | TO_LOWER | TRIM | TO_STRING | URL_ENCODE | URL_DECODE | BASE64_ENCODE | BASE64_DECODE | ESCAPE_JSON | ESCAPE_XML | ESCAPE_CSV | ESCAPE_HTML3 | ESCAPE_HTML4 | UNESCAPE_JSON | UNESCAPE_XML | UNESCAPE_CSV | UNESCAPE_HTML3 | UNESCAPE_HTML4 | EVALUATE_EL_STRING ) LPAREN ! RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			set1=input.LT(1);
			if ( (input.LA(1) >= BASE64_DECODE && input.LA(1) <= BASE64_ENCODE)||(input.LA(1) >= ESCAPE_CSV && input.LA(1) <= EVALUATE_EL_STRING)||input.LA(1)==TO_LOWER||(input.LA(1) >= TO_STRING && input.LA(1) <= TRIM)||(input.LA(1) >= UNESCAPE_CSV && input.LA(1) <= URL_ENCODE) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set1));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			LPAREN2=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_zeroArgString158); 
			RPAREN3=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_zeroArgString161); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "zeroArgString"


	public static class oneArgString_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "oneArgString"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:79:1: oneArgString : ( ( ( SUBSTRING_BEFORE | SUBSTRING_BEFORE_LAST | SUBSTRING_AFTER | SUBSTRING_AFTER_LAST | REPLACE_NULL | REPLACE_EMPTY | REPLACE_BY_PATTERN | PREPEND | APPEND | STARTS_WITH | ENDS_WITH | CONTAINS | JOIN | JSON_PATH | JSON_PATH_DELETE | FROM_RADIX | UUID3 | UUID5 | HASH ) LPAREN ! anyArg RPAREN !) | ( TO_RADIX LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !) );
	public final AttributeExpressionParser.oneArgString_return oneArgString() throws RecognitionException {
		AttributeExpressionParser.oneArgString_return retval = new AttributeExpressionParser.oneArgString_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set4=null;
		Token LPAREN5=null;
		Token RPAREN7=null;
		Token TO_RADIX8=null;
		Token LPAREN9=null;
		Token COMMA11=null;
		Token RPAREN13=null;
		ParserRuleReturnScope anyArg6 =null;
		ParserRuleReturnScope anyArg10 =null;
		ParserRuleReturnScope anyArg12 =null;

		Object set4_tree=null;
		Object LPAREN5_tree=null;
		Object RPAREN7_tree=null;
		Object TO_RADIX8_tree=null;
		Object LPAREN9_tree=null;
		Object COMMA11_tree=null;
		Object RPAREN13_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:79:14: ( ( ( SUBSTRING_BEFORE | SUBSTRING_BEFORE_LAST | SUBSTRING_AFTER | SUBSTRING_AFTER_LAST | REPLACE_NULL | REPLACE_EMPTY | REPLACE_BY_PATTERN | PREPEND | APPEND | STARTS_WITH | ENDS_WITH | CONTAINS | JOIN | JSON_PATH | JSON_PATH_DELETE | FROM_RADIX | UUID3 | UUID5 | HASH ) LPAREN ! anyArg RPAREN !) | ( TO_RADIX LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==APPEND||LA2_0==CONTAINS||LA2_0==ENDS_WITH||LA2_0==FROM_RADIX||LA2_0==HASH||(LA2_0 >= JOIN && LA2_0 <= JSON_PATH)||LA2_0==JSON_PATH_DELETE||LA2_0==PREPEND||(LA2_0 >= REPLACE_BY_PATTERN && LA2_0 <= REPLACE_EMPTY)||LA2_0==REPLACE_NULL||LA2_0==STARTS_WITH||(LA2_0 >= SUBSTRING_AFTER && LA2_0 <= SUBSTRING_BEFORE_LAST)||(LA2_0 >= UUID3 && LA2_0 <= UUID5)) ) {
				alt2=1;
			}
			else if ( (LA2_0==TO_RADIX) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:79:16: ( ( SUBSTRING_BEFORE | SUBSTRING_BEFORE_LAST | SUBSTRING_AFTER | SUBSTRING_AFTER_LAST | REPLACE_NULL | REPLACE_EMPTY | REPLACE_BY_PATTERN | PREPEND | APPEND | STARTS_WITH | ENDS_WITH | CONTAINS | JOIN | JSON_PATH | JSON_PATH_DELETE | FROM_RADIX | UUID3 | UUID5 | HASH ) LPAREN ! anyArg RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:79:16: ( ( SUBSTRING_BEFORE | SUBSTRING_BEFORE_LAST | SUBSTRING_AFTER | SUBSTRING_AFTER_LAST | REPLACE_NULL | REPLACE_EMPTY | REPLACE_BY_PATTERN | PREPEND | APPEND | STARTS_WITH | ENDS_WITH | CONTAINS | JOIN | JSON_PATH | JSON_PATH_DELETE | FROM_RADIX | UUID3 | UUID5 | HASH ) LPAREN ! anyArg RPAREN !)
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:79:17: ( SUBSTRING_BEFORE | SUBSTRING_BEFORE_LAST | SUBSTRING_AFTER | SUBSTRING_AFTER_LAST | REPLACE_NULL | REPLACE_EMPTY | REPLACE_BY_PATTERN | PREPEND | APPEND | STARTS_WITH | ENDS_WITH | CONTAINS | JOIN | JSON_PATH | JSON_PATH_DELETE | FROM_RADIX | UUID3 | UUID5 | HASH ) LPAREN ! anyArg RPAREN !
					{
					set4=input.LT(1);
					if ( input.LA(1)==APPEND||input.LA(1)==CONTAINS||input.LA(1)==ENDS_WITH||input.LA(1)==FROM_RADIX||input.LA(1)==HASH||(input.LA(1) >= JOIN && input.LA(1) <= JSON_PATH)||input.LA(1)==JSON_PATH_DELETE||input.LA(1)==PREPEND||(input.LA(1) >= REPLACE_BY_PATTERN && input.LA(1) <= REPLACE_EMPTY)||input.LA(1)==REPLACE_NULL||input.LA(1)==STARTS_WITH||(input.LA(1) >= SUBSTRING_AFTER && input.LA(1) <= SUBSTRING_BEFORE_LAST)||(input.LA(1) >= UUID3 && input.LA(1) <= UUID5) ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set4));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN5=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgString250); 
					pushFollow(FOLLOW_anyArg_in_oneArgString253);
					anyArg6=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg6.getTree());

					RPAREN7=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgString255); 
					}

					}
					break;
				case 2 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:81:7: ( TO_RADIX LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:81:7: ( TO_RADIX LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !)
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:81:8: TO_RADIX LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !
					{
					TO_RADIX8=(Token)match(input,TO_RADIX,FOLLOW_TO_RADIX_in_oneArgString268); 
					TO_RADIX8_tree = (Object)adaptor.create(TO_RADIX8);
					adaptor.addChild(root_0, TO_RADIX8_tree);

					LPAREN9=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgString270); 
					pushFollow(FOLLOW_anyArg_in_oneArgString273);
					anyArg10=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg10.getTree());

					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:81:32: ( COMMA ! anyArg )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==COMMA) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:81:33: COMMA ! anyArg
							{
							COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_oneArgString276); 
							pushFollow(FOLLOW_anyArg_in_oneArgString279);
							anyArg12=anyArg();
							state._fsp--;

							adaptor.addChild(root_0, anyArg12.getTree());

							}
							break;

					}

					RPAREN13=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgString283); 
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "oneArgString"


	public static class twoArgString_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "twoArgString"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:82:1: twoArgString : ( ( ( REPLACE | REPLACE_FIRST | REPLACE_ALL | IF_ELSE | JSON_PATH_SET | JSON_PATH_ADD ) LPAREN ! anyArg COMMA ! anyArg RPAREN !) | ( ( SUBSTRING | FORMAT | FORMAT_INSTANT | PAD_LEFT | PAD_RIGHT | REPEAT ) LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !) );
	public final AttributeExpressionParser.twoArgString_return twoArgString() throws RecognitionException {
		AttributeExpressionParser.twoArgString_return retval = new AttributeExpressionParser.twoArgString_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set14=null;
		Token LPAREN15=null;
		Token COMMA17=null;
		Token RPAREN19=null;
		Token set20=null;
		Token LPAREN21=null;
		Token COMMA23=null;
		Token RPAREN25=null;
		ParserRuleReturnScope anyArg16 =null;
		ParserRuleReturnScope anyArg18 =null;
		ParserRuleReturnScope anyArg22 =null;
		ParserRuleReturnScope anyArg24 =null;

		Object set14_tree=null;
		Object LPAREN15_tree=null;
		Object COMMA17_tree=null;
		Object RPAREN19_tree=null;
		Object set20_tree=null;
		Object LPAREN21_tree=null;
		Object COMMA23_tree=null;
		Object RPAREN25_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:82:14: ( ( ( REPLACE | REPLACE_FIRST | REPLACE_ALL | IF_ELSE | JSON_PATH_SET | JSON_PATH_ADD ) LPAREN ! anyArg COMMA ! anyArg RPAREN !) | ( ( SUBSTRING | FORMAT | FORMAT_INSTANT | PAD_LEFT | PAD_RIGHT | REPEAT ) LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==IF_ELSE||LA4_0==JSON_PATH_ADD||LA4_0==JSON_PATH_SET||(LA4_0 >= REPLACE && LA4_0 <= REPLACE_ALL)||LA4_0==REPLACE_FIRST) ) {
				alt4=1;
			}
			else if ( ((LA4_0 >= FORMAT && LA4_0 <= FORMAT_INSTANT)||(LA4_0 >= PAD_LEFT && LA4_0 <= PAD_RIGHT)||LA4_0==REPEAT||LA4_0==SUBSTRING) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:82:16: ( ( REPLACE | REPLACE_FIRST | REPLACE_ALL | IF_ELSE | JSON_PATH_SET | JSON_PATH_ADD ) LPAREN ! anyArg COMMA ! anyArg RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:82:16: ( ( REPLACE | REPLACE_FIRST | REPLACE_ALL | IF_ELSE | JSON_PATH_SET | JSON_PATH_ADD ) LPAREN ! anyArg COMMA ! anyArg RPAREN !)
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:82:17: ( REPLACE | REPLACE_FIRST | REPLACE_ALL | IF_ELSE | JSON_PATH_SET | JSON_PATH_ADD ) LPAREN ! anyArg COMMA ! anyArg RPAREN !
					{
					set14=input.LT(1);
					if ( input.LA(1)==IF_ELSE||input.LA(1)==JSON_PATH_ADD||input.LA(1)==JSON_PATH_SET||(input.LA(1) >= REPLACE && input.LA(1) <= REPLACE_ALL)||input.LA(1)==REPLACE_FIRST ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set14));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN15=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_twoArgString317); 
					pushFollow(FOLLOW_anyArg_in_twoArgString320);
					anyArg16=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg16.getTree());

					COMMA17=(Token)match(input,COMMA,FOLLOW_COMMA_in_twoArgString322); 
					pushFollow(FOLLOW_anyArg_in_twoArgString325);
					anyArg18=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg18.getTree());

					RPAREN19=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_twoArgString327); 
					}

					}
					break;
				case 2 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:83:7: ( ( SUBSTRING | FORMAT | FORMAT_INSTANT | PAD_LEFT | PAD_RIGHT | REPEAT ) LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:83:7: ( ( SUBSTRING | FORMAT | FORMAT_INSTANT | PAD_LEFT | PAD_RIGHT | REPEAT ) LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !)
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:83:8: ( SUBSTRING | FORMAT | FORMAT_INSTANT | PAD_LEFT | PAD_RIGHT | REPEAT ) LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !
					{
					set20=input.LT(1);
					if ( (input.LA(1) >= FORMAT && input.LA(1) <= FORMAT_INSTANT)||(input.LA(1) >= PAD_LEFT && input.LA(1) <= PAD_RIGHT)||input.LA(1)==REPEAT||input.LA(1)==SUBSTRING ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set20));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN21=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_twoArgString364); 
					pushFollow(FOLLOW_anyArg_in_twoArgString367);
					anyArg22=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg22.getTree());

					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:83:93: ( COMMA ! anyArg )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==COMMA) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:83:94: COMMA ! anyArg
							{
							COMMA23=(Token)match(input,COMMA,FOLLOW_COMMA_in_twoArgString370); 
							pushFollow(FOLLOW_anyArg_in_twoArgString373);
							anyArg24=anyArg();
							state._fsp--;

							adaptor.addChild(root_0, anyArg24.getTree());

							}
							break;

					}

					RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_twoArgString377); 
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "twoArgString"


	public static class threeArgString_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "threeArgString"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:84:1: threeArgString : ( ( JSON_PATH_PUT ) LPAREN ! anyArg COMMA ! anyArg COMMA ! anyArg RPAREN !) ;
	public final AttributeExpressionParser.threeArgString_return threeArgString() throws RecognitionException {
		AttributeExpressionParser.threeArgString_return retval = new AttributeExpressionParser.threeArgString_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token JSON_PATH_PUT26=null;
		Token LPAREN27=null;
		Token COMMA29=null;
		Token COMMA31=null;
		Token RPAREN33=null;
		ParserRuleReturnScope anyArg28 =null;
		ParserRuleReturnScope anyArg30 =null;
		ParserRuleReturnScope anyArg32 =null;

		Object JSON_PATH_PUT26_tree=null;
		Object LPAREN27_tree=null;
		Object COMMA29_tree=null;
		Object COMMA31_tree=null;
		Object RPAREN33_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:84:15: ( ( ( JSON_PATH_PUT ) LPAREN ! anyArg COMMA ! anyArg COMMA ! anyArg RPAREN !) )
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:84:17: ( ( JSON_PATH_PUT ) LPAREN ! anyArg COMMA ! anyArg COMMA ! anyArg RPAREN !)
			{
			root_0 = (Object)adaptor.nil();


			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:84:17: ( ( JSON_PATH_PUT ) LPAREN ! anyArg COMMA ! anyArg COMMA ! anyArg RPAREN !)
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:84:18: ( JSON_PATH_PUT ) LPAREN ! anyArg COMMA ! anyArg COMMA ! anyArg RPAREN !
			{
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:84:18: ( JSON_PATH_PUT )
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:84:19: JSON_PATH_PUT
			{
			JSON_PATH_PUT26=(Token)match(input,JSON_PATH_PUT,FOLLOW_JSON_PATH_PUT_in_threeArgString387); 
			JSON_PATH_PUT26_tree = (Object)adaptor.create(JSON_PATH_PUT26);
			adaptor.addChild(root_0, JSON_PATH_PUT26_tree);

			}

			LPAREN27=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_threeArgString390); 
			pushFollow(FOLLOW_anyArg_in_threeArgString393);
			anyArg28=anyArg();
			state._fsp--;

			adaptor.addChild(root_0, anyArg28.getTree());

			COMMA29=(Token)match(input,COMMA,FOLLOW_COMMA_in_threeArgString395); 
			pushFollow(FOLLOW_anyArg_in_threeArgString398);
			anyArg30=anyArg();
			state._fsp--;

			adaptor.addChild(root_0, anyArg30.getTree());

			COMMA31=(Token)match(input,COMMA,FOLLOW_COMMA_in_threeArgString400); 
			pushFollow(FOLLOW_anyArg_in_threeArgString403);
			anyArg32=anyArg();
			state._fsp--;

			adaptor.addChild(root_0, anyArg32.getTree());

			RPAREN33=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_threeArgString405); 
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "threeArgString"


	public static class fiveArgString_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fiveArgString"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:85:1: fiveArgString : GET_DELIMITED_FIELD LPAREN ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg )? )? )? )? RPAREN !;
	public final AttributeExpressionParser.fiveArgString_return fiveArgString() throws RecognitionException {
		AttributeExpressionParser.fiveArgString_return retval = new AttributeExpressionParser.fiveArgString_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GET_DELIMITED_FIELD34=null;
		Token LPAREN35=null;
		Token COMMA37=null;
		Token COMMA39=null;
		Token COMMA41=null;
		Token COMMA43=null;
		Token RPAREN45=null;
		ParserRuleReturnScope anyArg36 =null;
		ParserRuleReturnScope anyArg38 =null;
		ParserRuleReturnScope anyArg40 =null;
		ParserRuleReturnScope anyArg42 =null;
		ParserRuleReturnScope anyArg44 =null;

		Object GET_DELIMITED_FIELD34_tree=null;
		Object LPAREN35_tree=null;
		Object COMMA37_tree=null;
		Object COMMA39_tree=null;
		Object COMMA41_tree=null;
		Object COMMA43_tree=null;
		Object RPAREN45_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:85:15: ( GET_DELIMITED_FIELD LPAREN ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg )? )? )? )? RPAREN !)
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:85:17: GET_DELIMITED_FIELD LPAREN ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg )? )? )? )? RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			GET_DELIMITED_FIELD34=(Token)match(input,GET_DELIMITED_FIELD,FOLLOW_GET_DELIMITED_FIELD_in_fiveArgString414); 
			GET_DELIMITED_FIELD34_tree = (Object)adaptor.create(GET_DELIMITED_FIELD34);
			adaptor.addChild(root_0, GET_DELIMITED_FIELD34_tree);

			LPAREN35=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fiveArgString416); 
			pushFollow(FOLLOW_anyArg_in_fiveArgString419);
			anyArg36=anyArg();
			state._fsp--;

			adaptor.addChild(root_0, anyArg36.getTree());

			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:85:52: ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg )? )? )? )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==COMMA) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:85:53: COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg )? )? )?
					{
					COMMA37=(Token)match(input,COMMA,FOLLOW_COMMA_in_fiveArgString422); 
					pushFollow(FOLLOW_anyArg_in_fiveArgString425);
					anyArg38=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg38.getTree());

					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:85:67: ( COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg )? )? )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==COMMA) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:85:68: COMMA ! anyArg ( COMMA ! anyArg ( COMMA ! anyArg )? )?
							{
							COMMA39=(Token)match(input,COMMA,FOLLOW_COMMA_in_fiveArgString428); 
							pushFollow(FOLLOW_anyArg_in_fiveArgString431);
							anyArg40=anyArg();
							state._fsp--;

							adaptor.addChild(root_0, anyArg40.getTree());

							// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:85:82: ( COMMA ! anyArg ( COMMA ! anyArg )? )?
							int alt6=2;
							int LA6_0 = input.LA(1);
							if ( (LA6_0==COMMA) ) {
								alt6=1;
							}
							switch (alt6) {
								case 1 :
									// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:85:83: COMMA ! anyArg ( COMMA ! anyArg )?
									{
									COMMA41=(Token)match(input,COMMA,FOLLOW_COMMA_in_fiveArgString434); 
									pushFollow(FOLLOW_anyArg_in_fiveArgString437);
									anyArg42=anyArg();
									state._fsp--;

									adaptor.addChild(root_0, anyArg42.getTree());

									// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:85:97: ( COMMA ! anyArg )?
									int alt5=2;
									int LA5_0 = input.LA(1);
									if ( (LA5_0==COMMA) ) {
										alt5=1;
									}
									switch (alt5) {
										case 1 :
											// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:85:98: COMMA ! anyArg
											{
											COMMA43=(Token)match(input,COMMA,FOLLOW_COMMA_in_fiveArgString440); 
											pushFollow(FOLLOW_anyArg_in_fiveArgString443);
											anyArg44=anyArg();
											state._fsp--;

											adaptor.addChild(root_0, anyArg44.getTree());

											}
											break;

									}

									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			RPAREN45=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fiveArgString453); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fiveArgString"


	public static class zeroArgBool_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "zeroArgBool"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:88:1: zeroArgBool : ( IS_NULL | NOT_NULL | IS_EMPTY | NOT | IS_JSON ) LPAREN ! RPAREN !;
	public final AttributeExpressionParser.zeroArgBool_return zeroArgBool() throws RecognitionException {
		AttributeExpressionParser.zeroArgBool_return retval = new AttributeExpressionParser.zeroArgBool_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set46=null;
		Token LPAREN47=null;
		Token RPAREN48=null;

		Object set46_tree=null;
		Object LPAREN47_tree=null;
		Object RPAREN48_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:88:13: ( ( IS_NULL | NOT_NULL | IS_EMPTY | NOT | IS_JSON ) LPAREN ! RPAREN !)
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:88:15: ( IS_NULL | NOT_NULL | IS_EMPTY | NOT | IS_JSON ) LPAREN ! RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			set46=input.LT(1);
			if ( (input.LA(1) >= IS_EMPTY && input.LA(1) <= IS_NULL)||(input.LA(1) >= NOT && input.LA(1) <= NOT_NULL) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set46));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			LPAREN47=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_zeroArgBool483); 
			RPAREN48=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_zeroArgBool486); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "zeroArgBool"


	public static class oneArgBool_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "oneArgBool"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:89:1: oneArgBool : ( ( ( FIND | MATCHES | EQUALS_IGNORE_CASE ) LPAREN ! anyArg RPAREN !) | ( GREATER_THAN | LESS_THAN | GREATER_THAN_OR_EQUAL | LESS_THAN_OR_EQUAL ) LPAREN ! anyArg RPAREN !| ( EQUALS ) LPAREN ! anyArg RPAREN !| ( AND | OR ) LPAREN ! anyArg RPAREN !);
	public final AttributeExpressionParser.oneArgBool_return oneArgBool() throws RecognitionException {
		AttributeExpressionParser.oneArgBool_return retval = new AttributeExpressionParser.oneArgBool_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set49=null;
		Token LPAREN50=null;
		Token RPAREN52=null;
		Token set53=null;
		Token LPAREN54=null;
		Token RPAREN56=null;
		Token EQUALS57=null;
		Token LPAREN58=null;
		Token RPAREN60=null;
		Token set61=null;
		Token LPAREN62=null;
		Token RPAREN64=null;
		ParserRuleReturnScope anyArg51 =null;
		ParserRuleReturnScope anyArg55 =null;
		ParserRuleReturnScope anyArg59 =null;
		ParserRuleReturnScope anyArg63 =null;

		Object set49_tree=null;
		Object LPAREN50_tree=null;
		Object RPAREN52_tree=null;
		Object set53_tree=null;
		Object LPAREN54_tree=null;
		Object RPAREN56_tree=null;
		Object EQUALS57_tree=null;
		Object LPAREN58_tree=null;
		Object RPAREN60_tree=null;
		Object set61_tree=null;
		Object LPAREN62_tree=null;
		Object RPAREN64_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:89:12: ( ( ( FIND | MATCHES | EQUALS_IGNORE_CASE ) LPAREN ! anyArg RPAREN !) | ( GREATER_THAN | LESS_THAN | GREATER_THAN_OR_EQUAL | LESS_THAN_OR_EQUAL ) LPAREN ! anyArg RPAREN !| ( EQUALS ) LPAREN ! anyArg RPAREN !| ( AND | OR ) LPAREN ! anyArg RPAREN !)
			int alt9=4;
			switch ( input.LA(1) ) {
			case EQUALS_IGNORE_CASE:
			case FIND:
			case MATCHES:
				{
				alt9=1;
				}
				break;
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUAL:
			case LESS_THAN:
			case LESS_THAN_OR_EQUAL:
				{
				alt9=2;
				}
				break;
			case EQUALS:
				{
				alt9=3;
				}
				break;
			case AND:
			case OR:
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
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:89:14: ( ( FIND | MATCHES | EQUALS_IGNORE_CASE ) LPAREN ! anyArg RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:89:14: ( ( FIND | MATCHES | EQUALS_IGNORE_CASE ) LPAREN ! anyArg RPAREN !)
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:89:15: ( FIND | MATCHES | EQUALS_IGNORE_CASE ) LPAREN ! anyArg RPAREN !
					{
					set49=input.LT(1);
					if ( input.LA(1)==EQUALS_IGNORE_CASE||input.LA(1)==FIND||input.LA(1)==MATCHES ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set49));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN50=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgBool507); 
					pushFollow(FOLLOW_anyArg_in_oneArgBool510);
					anyArg51=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg51.getTree());

					RPAREN52=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgBool512); 
					}

					}
					break;
				case 2 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:90:6: ( GREATER_THAN | LESS_THAN | GREATER_THAN_OR_EQUAL | LESS_THAN_OR_EQUAL ) LPAREN ! anyArg RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					set53=input.LT(1);
					if ( (input.LA(1) >= GREATER_THAN && input.LA(1) <= GREATER_THAN_OR_EQUAL)||(input.LA(1) >= LESS_THAN && input.LA(1) <= LESS_THAN_OR_EQUAL) ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set53));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN54=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgBool539); 
					pushFollow(FOLLOW_anyArg_in_oneArgBool542);
					anyArg55=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg55.getTree());

					RPAREN56=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgBool544); 
					}
					break;
				case 3 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:91:6: ( EQUALS ) LPAREN ! anyArg RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:91:6: ( EQUALS )
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:91:7: EQUALS
					{
					EQUALS57=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_oneArgBool555); 
					EQUALS57_tree = (Object)adaptor.create(EQUALS57);
					adaptor.addChild(root_0, EQUALS57_tree);

					}

					LPAREN58=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgBool558); 
					pushFollow(FOLLOW_anyArg_in_oneArgBool561);
					anyArg59=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg59.getTree());

					RPAREN60=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgBool563); 
					}
					break;
				case 4 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:92:6: ( AND | OR ) LPAREN ! anyArg RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					set61=input.LT(1);
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set61));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN62=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgBool581); 
					pushFollow(FOLLOW_anyArg_in_oneArgBool584);
					anyArg63=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg63.getTree());

					RPAREN64=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgBool586); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "oneArgBool"


	public static class multiArgBool_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multiArgBool"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:93:1: multiArgBool : ( IN ) LPAREN ! anyArg ( COMMA ! anyArg )* RPAREN !;
	public final AttributeExpressionParser.multiArgBool_return multiArgBool() throws RecognitionException {
		AttributeExpressionParser.multiArgBool_return retval = new AttributeExpressionParser.multiArgBool_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IN65=null;
		Token LPAREN66=null;
		Token COMMA68=null;
		Token RPAREN70=null;
		ParserRuleReturnScope anyArg67 =null;
		ParserRuleReturnScope anyArg69 =null;

		Object IN65_tree=null;
		Object LPAREN66_tree=null;
		Object COMMA68_tree=null;
		Object RPAREN70_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:93:14: ( ( IN ) LPAREN ! anyArg ( COMMA ! anyArg )* RPAREN !)
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:93:16: ( IN ) LPAREN ! anyArg ( COMMA ! anyArg )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:93:16: ( IN )
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:93:17: IN
			{
			IN65=(Token)match(input,IN,FOLLOW_IN_in_multiArgBool595); 
			IN65_tree = (Object)adaptor.create(IN65);
			adaptor.addChild(root_0, IN65_tree);

			}

			LPAREN66=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_multiArgBool598); 
			pushFollow(FOLLOW_anyArg_in_multiArgBool601);
			anyArg67=anyArg();
			state._fsp--;

			adaptor.addChild(root_0, anyArg67.getTree());

			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:93:36: ( COMMA ! anyArg )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==COMMA) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:93:37: COMMA ! anyArg
					{
					COMMA68=(Token)match(input,COMMA,FOLLOW_COMMA_in_multiArgBool604); 
					pushFollow(FOLLOW_anyArg_in_multiArgBool607);
					anyArg69=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg69.getTree());

					}
					break;

				default :
					break loop10;
				}
			}

			RPAREN70=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_multiArgBool611); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiArgBool"


	public static class zeroArgNum_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "zeroArgNum"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:97:1: zeroArgNum : ( LENGTH | TO_NUMBER | TO_DECIMAL | TO_MICROS | TO_NANOS | COUNT ) LPAREN ! RPAREN !;
	public final AttributeExpressionParser.zeroArgNum_return zeroArgNum() throws RecognitionException {
		AttributeExpressionParser.zeroArgNum_return retval = new AttributeExpressionParser.zeroArgNum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set71=null;
		Token LPAREN72=null;
		Token RPAREN73=null;

		Object set71_tree=null;
		Object LPAREN72_tree=null;
		Object RPAREN73_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:97:12: ( ( LENGTH | TO_NUMBER | TO_DECIMAL | TO_MICROS | TO_NANOS | COUNT ) LPAREN ! RPAREN !)
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:97:14: ( LENGTH | TO_NUMBER | TO_DECIMAL | TO_MICROS | TO_NANOS | COUNT ) LPAREN ! RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			set71=input.LT(1);
			if ( input.LA(1)==COUNT||input.LA(1)==LENGTH||input.LA(1)==TO_DECIMAL||(input.LA(1) >= TO_MICROS && input.LA(1) <= TO_NUMBER) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set71));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			LPAREN72=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_zeroArgNum646); 
			RPAREN73=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_zeroArgNum649); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "zeroArgNum"


	public static class oneArgNum_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "oneArgNum"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:98:1: oneArgNum : ( ( ( INDEX_OF | LAST_INDEX_OF ) LPAREN ! anyArg RPAREN !) | ( ( MOD | PLUS | MINUS | MULTIPLY | DIVIDE ) LPAREN ! anyArg RPAREN !) );
	public final AttributeExpressionParser.oneArgNum_return oneArgNum() throws RecognitionException {
		AttributeExpressionParser.oneArgNum_return retval = new AttributeExpressionParser.oneArgNum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set74=null;
		Token LPAREN75=null;
		Token RPAREN77=null;
		Token set78=null;
		Token LPAREN79=null;
		Token RPAREN81=null;
		ParserRuleReturnScope anyArg76 =null;
		ParserRuleReturnScope anyArg80 =null;

		Object set74_tree=null;
		Object LPAREN75_tree=null;
		Object RPAREN77_tree=null;
		Object set78_tree=null;
		Object LPAREN79_tree=null;
		Object RPAREN81_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:98:11: ( ( ( INDEX_OF | LAST_INDEX_OF ) LPAREN ! anyArg RPAREN !) | ( ( MOD | PLUS | MINUS | MULTIPLY | DIVIDE ) LPAREN ! anyArg RPAREN !) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==INDEX_OF||LA11_0==LAST_INDEX_OF) ) {
				alt11=1;
			}
			else if ( (LA11_0==DIVIDE||(LA11_0 >= MINUS && LA11_0 <= MULTIPLY)||LA11_0==PLUS) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:98:13: ( ( INDEX_OF | LAST_INDEX_OF ) LPAREN ! anyArg RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:98:13: ( ( INDEX_OF | LAST_INDEX_OF ) LPAREN ! anyArg RPAREN !)
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:98:14: ( INDEX_OF | LAST_INDEX_OF ) LPAREN ! anyArg RPAREN !
					{
					set74=input.LT(1);
					if ( input.LA(1)==INDEX_OF||input.LA(1)==LAST_INDEX_OF ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set74));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN75=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgNum666); 
					pushFollow(FOLLOW_anyArg_in_oneArgNum669);
					anyArg76=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg76.getTree());

					RPAREN77=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgNum671); 
					}

					}
					break;
				case 2 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:99:6: ( ( MOD | PLUS | MINUS | MULTIPLY | DIVIDE ) LPAREN ! anyArg RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:99:6: ( ( MOD | PLUS | MINUS | MULTIPLY | DIVIDE ) LPAREN ! anyArg RPAREN !)
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:99:7: ( MOD | PLUS | MINUS | MULTIPLY | DIVIDE ) LPAREN ! anyArg RPAREN !
					{
					set78=input.LT(1);
					if ( input.LA(1)==DIVIDE||(input.LA(1) >= MINUS && input.LA(1) <= MULTIPLY)||input.LA(1)==PLUS ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set78));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN79=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgNum703); 
					pushFollow(FOLLOW_anyArg_in_oneArgNum706);
					anyArg80=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg80.getTree());

					RPAREN81=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgNum708); 
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "oneArgNum"


	public static class oneOrTwoArgNum_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "oneOrTwoArgNum"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:100:1: oneOrTwoArgNum : MATH LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !;
	public final AttributeExpressionParser.oneOrTwoArgNum_return oneOrTwoArgNum() throws RecognitionException {
		AttributeExpressionParser.oneOrTwoArgNum_return retval = new AttributeExpressionParser.oneOrTwoArgNum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MATH82=null;
		Token LPAREN83=null;
		Token COMMA85=null;
		Token RPAREN87=null;
		ParserRuleReturnScope anyArg84 =null;
		ParserRuleReturnScope anyArg86 =null;

		Object MATH82_tree=null;
		Object LPAREN83_tree=null;
		Object COMMA85_tree=null;
		Object RPAREN87_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:100:16: ( MATH LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !)
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:100:18: MATH LPAREN ! anyArg ( COMMA ! anyArg )? RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			MATH82=(Token)match(input,MATH,FOLLOW_MATH_in_oneOrTwoArgNum717); 
			MATH82_tree = (Object)adaptor.create(MATH82);
			adaptor.addChild(root_0, MATH82_tree);

			LPAREN83=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneOrTwoArgNum719); 
			pushFollow(FOLLOW_anyArg_in_oneOrTwoArgNum722);
			anyArg84=anyArg();
			state._fsp--;

			adaptor.addChild(root_0, anyArg84.getTree());

			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:100:38: ( COMMA ! anyArg )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==COMMA) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:100:39: COMMA ! anyArg
					{
					COMMA85=(Token)match(input,COMMA,FOLLOW_COMMA_in_oneOrTwoArgNum725); 
					pushFollow(FOLLOW_anyArg_in_oneOrTwoArgNum728);
					anyArg86=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg86.getTree());

					}
					break;

			}

			RPAREN87=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneOrTwoArgNum732); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "oneOrTwoArgNum"


	public static class zeroOrOneOrTwoArgNum_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "zeroOrOneOrTwoArgNum"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:101:1: zeroOrOneOrTwoArgNum : TO_DATE LPAREN ! ( anyArg )? ( COMMA ! anyArg )? RPAREN !;
	public final AttributeExpressionParser.zeroOrOneOrTwoArgNum_return zeroOrOneOrTwoArgNum() throws RecognitionException {
		AttributeExpressionParser.zeroOrOneOrTwoArgNum_return retval = new AttributeExpressionParser.zeroOrOneOrTwoArgNum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TO_DATE88=null;
		Token LPAREN89=null;
		Token COMMA91=null;
		Token RPAREN93=null;
		ParserRuleReturnScope anyArg90 =null;
		ParserRuleReturnScope anyArg92 =null;

		Object TO_DATE88_tree=null;
		Object LPAREN89_tree=null;
		Object COMMA91_tree=null;
		Object RPAREN93_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:101:22: ( TO_DATE LPAREN ! ( anyArg )? ( COMMA ! anyArg )? RPAREN !)
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:101:24: TO_DATE LPAREN ! ( anyArg )? ( COMMA ! anyArg )? RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			TO_DATE88=(Token)match(input,TO_DATE,FOLLOW_TO_DATE_in_zeroOrOneOrTwoArgNum740); 
			TO_DATE88_tree = (Object)adaptor.create(TO_DATE88);
			adaptor.addChild(root_0, TO_DATE88_tree);

			LPAREN89=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_zeroOrOneOrTwoArgNum742); 
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:101:40: ( anyArg )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==AND||LA13_0==APPEND||(LA13_0 >= BASE64_DECODE && LA13_0 <= BASE64_ENCODE)||(LA13_0 >= CONTAINS && LA13_0 <= DOLLAR)||(LA13_0 >= ENDS_WITH && LA13_0 <= EQUALS_IGNORE_CASE)||(LA13_0 >= ESCAPE_CSV && LA13_0 <= EVALUATE_EL_STRING)||(LA13_0 >= FALSE && LA13_0 <= GET_DELIMITED_FIELD)||(LA13_0 >= GREATER_THAN && LA13_0 <= HASH)||(LA13_0 >= IF_ELSE && LA13_0 <= INDEX_OF)||(LA13_0 >= IS_EMPTY && LA13_0 <= JSON_PATH_DELETE)||(LA13_0 >= JSON_PATH_SET && LA13_0 <= LAST_INDEX_OF)||(LA13_0 >= LENGTH && LA13_0 <= LESS_THAN_OR_EQUAL)||(LA13_0 >= MATCHES && LA13_0 <= MULTIPLY)||(LA13_0 >= NOT && LA13_0 <= NOT_NULL)||LA13_0==NULL||(LA13_0 >= OR && LA13_0 <= PREPEND)||(LA13_0 >= REPEAT && LA13_0 <= REPLACE_NULL)||(LA13_0 >= STARTS_WITH && LA13_0 <= SUBSTRING_BEFORE_LAST)||(LA13_0 >= TO_DATE && LA13_0 <= TO_INSTANT)||(LA13_0 >= TO_LOWER && LA13_0 <= URL_ENCODE)||(LA13_0 >= UUID3 && LA13_0 <= UUID5)||LA13_0==WHOLE_NUMBER) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:101:40: anyArg
					{
					pushFollow(FOLLOW_anyArg_in_zeroOrOneOrTwoArgNum745);
					anyArg90=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg90.getTree());

					}
					break;

			}

			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:101:48: ( COMMA ! anyArg )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==COMMA) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:101:49: COMMA ! anyArg
					{
					COMMA91=(Token)match(input,COMMA,FOLLOW_COMMA_in_zeroOrOneOrTwoArgNum749); 
					pushFollow(FOLLOW_anyArg_in_zeroOrOneOrTwoArgNum752);
					anyArg92=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg92.getTree());

					}
					break;

			}

			RPAREN93=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_zeroOrOneOrTwoArgNum756); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "zeroOrOneOrTwoArgNum"


	public static class zeroOrTwoArgNum_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "zeroOrTwoArgNum"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:102:1: zeroOrTwoArgNum : TO_INSTANT LPAREN ! ( anyArg COMMA ! anyArg )? RPAREN !;
	public final AttributeExpressionParser.zeroOrTwoArgNum_return zeroOrTwoArgNum() throws RecognitionException {
		AttributeExpressionParser.zeroOrTwoArgNum_return retval = new AttributeExpressionParser.zeroOrTwoArgNum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TO_INSTANT94=null;
		Token LPAREN95=null;
		Token COMMA97=null;
		Token RPAREN99=null;
		ParserRuleReturnScope anyArg96 =null;
		ParserRuleReturnScope anyArg98 =null;

		Object TO_INSTANT94_tree=null;
		Object LPAREN95_tree=null;
		Object COMMA97_tree=null;
		Object RPAREN99_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:102:16: ( TO_INSTANT LPAREN ! ( anyArg COMMA ! anyArg )? RPAREN !)
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:102:18: TO_INSTANT LPAREN ! ( anyArg COMMA ! anyArg )? RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			TO_INSTANT94=(Token)match(input,TO_INSTANT,FOLLOW_TO_INSTANT_in_zeroOrTwoArgNum763); 
			TO_INSTANT94_tree = (Object)adaptor.create(TO_INSTANT94);
			adaptor.addChild(root_0, TO_INSTANT94_tree);

			LPAREN95=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_zeroOrTwoArgNum765); 
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:102:37: ( anyArg COMMA ! anyArg )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==AND||LA15_0==APPEND||(LA15_0 >= BASE64_DECODE && LA15_0 <= BASE64_ENCODE)||(LA15_0 >= CONTAINS && LA15_0 <= DOLLAR)||(LA15_0 >= ENDS_WITH && LA15_0 <= EQUALS_IGNORE_CASE)||(LA15_0 >= ESCAPE_CSV && LA15_0 <= EVALUATE_EL_STRING)||(LA15_0 >= FALSE && LA15_0 <= GET_DELIMITED_FIELD)||(LA15_0 >= GREATER_THAN && LA15_0 <= HASH)||(LA15_0 >= IF_ELSE && LA15_0 <= INDEX_OF)||(LA15_0 >= IS_EMPTY && LA15_0 <= JSON_PATH_DELETE)||(LA15_0 >= JSON_PATH_SET && LA15_0 <= LAST_INDEX_OF)||(LA15_0 >= LENGTH && LA15_0 <= LESS_THAN_OR_EQUAL)||(LA15_0 >= MATCHES && LA15_0 <= MULTIPLY)||(LA15_0 >= NOT && LA15_0 <= NOT_NULL)||LA15_0==NULL||(LA15_0 >= OR && LA15_0 <= PREPEND)||(LA15_0 >= REPEAT && LA15_0 <= REPLACE_NULL)||(LA15_0 >= STARTS_WITH && LA15_0 <= SUBSTRING_BEFORE_LAST)||(LA15_0 >= TO_DATE && LA15_0 <= TO_INSTANT)||(LA15_0 >= TO_LOWER && LA15_0 <= URL_ENCODE)||(LA15_0 >= UUID3 && LA15_0 <= UUID5)||LA15_0==WHOLE_NUMBER) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:102:38: anyArg COMMA ! anyArg
					{
					pushFollow(FOLLOW_anyArg_in_zeroOrTwoArgNum769);
					anyArg96=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg96.getTree());

					COMMA97=(Token)match(input,COMMA,FOLLOW_COMMA_in_zeroOrTwoArgNum771); 
					pushFollow(FOLLOW_anyArg_in_zeroOrTwoArgNum774);
					anyArg98=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg98.getTree());

					}
					break;

			}

			RPAREN99=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_zeroOrTwoArgNum778); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "zeroOrTwoArgNum"


	public static class stringFunctionRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stringFunctionRef"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:104:1: stringFunctionRef : ( zeroArgString | oneArgString | twoArgString | threeArgString | fiveArgString );
	public final AttributeExpressionParser.stringFunctionRef_return stringFunctionRef() throws RecognitionException {
		AttributeExpressionParser.stringFunctionRef_return retval = new AttributeExpressionParser.stringFunctionRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope zeroArgString100 =null;
		ParserRuleReturnScope oneArgString101 =null;
		ParserRuleReturnScope twoArgString102 =null;
		ParserRuleReturnScope threeArgString103 =null;
		ParserRuleReturnScope fiveArgString104 =null;


		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:104:19: ( zeroArgString | oneArgString | twoArgString | threeArgString | fiveArgString )
			int alt16=5;
			switch ( input.LA(1) ) {
			case BASE64_DECODE:
			case BASE64_ENCODE:
			case ESCAPE_CSV:
			case ESCAPE_HTML3:
			case ESCAPE_HTML4:
			case ESCAPE_JSON:
			case ESCAPE_XML:
			case EVALUATE_EL_STRING:
			case TO_LOWER:
			case TO_STRING:
			case TO_UPPER:
			case TRIM:
			case UNESCAPE_CSV:
			case UNESCAPE_HTML3:
			case UNESCAPE_HTML4:
			case UNESCAPE_JSON:
			case UNESCAPE_XML:
			case URL_DECODE:
			case URL_ENCODE:
				{
				alt16=1;
				}
				break;
			case APPEND:
			case CONTAINS:
			case ENDS_WITH:
			case FROM_RADIX:
			case HASH:
			case JOIN:
			case JSON_PATH:
			case JSON_PATH_DELETE:
			case PREPEND:
			case REPLACE_BY_PATTERN:
			case REPLACE_EMPTY:
			case REPLACE_NULL:
			case STARTS_WITH:
			case SUBSTRING_AFTER:
			case SUBSTRING_AFTER_LAST:
			case SUBSTRING_BEFORE:
			case SUBSTRING_BEFORE_LAST:
			case TO_RADIX:
			case UUID3:
			case UUID5:
				{
				alt16=2;
				}
				break;
			case FORMAT:
			case FORMAT_INSTANT:
			case IF_ELSE:
			case JSON_PATH_ADD:
			case JSON_PATH_SET:
			case PAD_LEFT:
			case PAD_RIGHT:
			case REPEAT:
			case REPLACE:
			case REPLACE_ALL:
			case REPLACE_FIRST:
			case SUBSTRING:
				{
				alt16=3;
				}
				break;
			case JSON_PATH_PUT:
				{
				alt16=4;
				}
				break;
			case GET_DELIMITED_FIELD:
				{
				alt16=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:104:21: zeroArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgString_in_stringFunctionRef787);
					zeroArgString100=zeroArgString();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgString100.getTree());

					}
					break;
				case 2 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:104:37: oneArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgString_in_stringFunctionRef791);
					oneArgString101=oneArgString();
					state._fsp--;

					adaptor.addChild(root_0, oneArgString101.getTree());

					}
					break;
				case 3 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:104:52: twoArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_twoArgString_in_stringFunctionRef795);
					twoArgString102=twoArgString();
					state._fsp--;

					adaptor.addChild(root_0, twoArgString102.getTree());

					}
					break;
				case 4 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:104:67: threeArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_threeArgString_in_stringFunctionRef799);
					threeArgString103=threeArgString();
					state._fsp--;

					adaptor.addChild(root_0, threeArgString103.getTree());

					}
					break;
				case 5 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:104:84: fiveArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fiveArgString_in_stringFunctionRef803);
					fiveArgString104=fiveArgString();
					state._fsp--;

					adaptor.addChild(root_0, fiveArgString104.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stringFunctionRef"


	public static class booleanFunctionRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "booleanFunctionRef"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:105:1: booleanFunctionRef : ( zeroArgBool | oneArgBool | multiArgBool );
	public final AttributeExpressionParser.booleanFunctionRef_return booleanFunctionRef() throws RecognitionException {
		AttributeExpressionParser.booleanFunctionRef_return retval = new AttributeExpressionParser.booleanFunctionRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope zeroArgBool105 =null;
		ParserRuleReturnScope oneArgBool106 =null;
		ParserRuleReturnScope multiArgBool107 =null;


		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:105:20: ( zeroArgBool | oneArgBool | multiArgBool )
			int alt17=3;
			switch ( input.LA(1) ) {
			case IS_EMPTY:
			case IS_JSON:
			case IS_NULL:
			case NOT:
			case NOT_NULL:
				{
				alt17=1;
				}
				break;
			case AND:
			case EQUALS:
			case EQUALS_IGNORE_CASE:
			case FIND:
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUAL:
			case LESS_THAN:
			case LESS_THAN_OR_EQUAL:
			case MATCHES:
			case OR:
				{
				alt17=2;
				}
				break;
			case IN:
				{
				alt17=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:105:22: zeroArgBool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgBool_in_booleanFunctionRef810);
					zeroArgBool105=zeroArgBool();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgBool105.getTree());

					}
					break;
				case 2 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:105:36: oneArgBool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgBool_in_booleanFunctionRef814);
					oneArgBool106=oneArgBool();
					state._fsp--;

					adaptor.addChild(root_0, oneArgBool106.getTree());

					}
					break;
				case 3 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:105:49: multiArgBool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_multiArgBool_in_booleanFunctionRef818);
					multiArgBool107=multiArgBool();
					state._fsp--;

					adaptor.addChild(root_0, multiArgBool107.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanFunctionRef"


	public static class numberFunctionRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "numberFunctionRef"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:106:1: numberFunctionRef : ( zeroArgNum | oneArgNum | zeroOrTwoArgNum | oneOrTwoArgNum | zeroOrOneOrTwoArgNum );
	public final AttributeExpressionParser.numberFunctionRef_return numberFunctionRef() throws RecognitionException {
		AttributeExpressionParser.numberFunctionRef_return retval = new AttributeExpressionParser.numberFunctionRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope zeroArgNum108 =null;
		ParserRuleReturnScope oneArgNum109 =null;
		ParserRuleReturnScope zeroOrTwoArgNum110 =null;
		ParserRuleReturnScope oneOrTwoArgNum111 =null;
		ParserRuleReturnScope zeroOrOneOrTwoArgNum112 =null;


		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:106:19: ( zeroArgNum | oneArgNum | zeroOrTwoArgNum | oneOrTwoArgNum | zeroOrOneOrTwoArgNum )
			int alt18=5;
			switch ( input.LA(1) ) {
			case COUNT:
			case LENGTH:
			case TO_DECIMAL:
			case TO_MICROS:
			case TO_NANOS:
			case TO_NUMBER:
				{
				alt18=1;
				}
				break;
			case DIVIDE:
			case INDEX_OF:
			case LAST_INDEX_OF:
			case MINUS:
			case MOD:
			case MULTIPLY:
			case PLUS:
				{
				alt18=2;
				}
				break;
			case TO_INSTANT:
				{
				alt18=3;
				}
				break;
			case MATH:
				{
				alt18=4;
				}
				break;
			case TO_DATE:
				{
				alt18=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:106:21: zeroArgNum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgNum_in_numberFunctionRef825);
					zeroArgNum108=zeroArgNum();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgNum108.getTree());

					}
					break;
				case 2 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:106:34: oneArgNum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgNum_in_numberFunctionRef829);
					oneArgNum109=oneArgNum();
					state._fsp--;

					adaptor.addChild(root_0, oneArgNum109.getTree());

					}
					break;
				case 3 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:106:46: zeroOrTwoArgNum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroOrTwoArgNum_in_numberFunctionRef833);
					zeroOrTwoArgNum110=zeroOrTwoArgNum();
					state._fsp--;

					adaptor.addChild(root_0, zeroOrTwoArgNum110.getTree());

					}
					break;
				case 4 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:106:64: oneOrTwoArgNum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneOrTwoArgNum_in_numberFunctionRef837);
					oneOrTwoArgNum111=oneOrTwoArgNum();
					state._fsp--;

					adaptor.addChild(root_0, oneOrTwoArgNum111.getTree());

					}
					break;
				case 5 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:106:81: zeroOrOneOrTwoArgNum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroOrOneOrTwoArgNum_in_numberFunctionRef841);
					zeroOrOneOrTwoArgNum112=zeroOrOneOrTwoArgNum();
					state._fsp--;

					adaptor.addChild(root_0, zeroOrOneOrTwoArgNum112.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "numberFunctionRef"


	public static class anyArg_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "anyArg"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:108:1: anyArg : ( WHOLE_NUMBER | DECIMAL | numberFunctionRef | STRING_LITERAL | zeroArgString | oneArgString | twoArgString | fiveArgString | booleanLiteral | zeroArgBool | oneArgBool | multiArgBool | expression | parameterReference | NULL );
	public final AttributeExpressionParser.anyArg_return anyArg() throws RecognitionException {
		AttributeExpressionParser.anyArg_return retval = new AttributeExpressionParser.anyArg_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHOLE_NUMBER113=null;
		Token DECIMAL114=null;
		Token STRING_LITERAL116=null;
		Token NULL127=null;
		ParserRuleReturnScope numberFunctionRef115 =null;
		ParserRuleReturnScope zeroArgString117 =null;
		ParserRuleReturnScope oneArgString118 =null;
		ParserRuleReturnScope twoArgString119 =null;
		ParserRuleReturnScope fiveArgString120 =null;
		ParserRuleReturnScope booleanLiteral121 =null;
		ParserRuleReturnScope zeroArgBool122 =null;
		ParserRuleReturnScope oneArgBool123 =null;
		ParserRuleReturnScope multiArgBool124 =null;
		ParserRuleReturnScope expression125 =null;
		ParserRuleReturnScope parameterReference126 =null;

		Object WHOLE_NUMBER113_tree=null;
		Object DECIMAL114_tree=null;
		Object STRING_LITERAL116_tree=null;
		Object NULL127_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:108:8: ( WHOLE_NUMBER | DECIMAL | numberFunctionRef | STRING_LITERAL | zeroArgString | oneArgString | twoArgString | fiveArgString | booleanLiteral | zeroArgBool | oneArgBool | multiArgBool | expression | parameterReference | NULL )
			int alt19=15;
			switch ( input.LA(1) ) {
			case WHOLE_NUMBER:
				{
				alt19=1;
				}
				break;
			case DECIMAL:
				{
				alt19=2;
				}
				break;
			case COUNT:
			case DIVIDE:
			case INDEX_OF:
			case LAST_INDEX_OF:
			case LENGTH:
			case MATH:
			case MINUS:
			case MOD:
			case MULTIPLY:
			case PLUS:
			case TO_DATE:
			case TO_DECIMAL:
			case TO_INSTANT:
			case TO_MICROS:
			case TO_NANOS:
			case TO_NUMBER:
				{
				alt19=3;
				}
				break;
			case STRING_LITERAL:
				{
				alt19=4;
				}
				break;
			case BASE64_DECODE:
			case BASE64_ENCODE:
			case ESCAPE_CSV:
			case ESCAPE_HTML3:
			case ESCAPE_HTML4:
			case ESCAPE_JSON:
			case ESCAPE_XML:
			case EVALUATE_EL_STRING:
			case TO_LOWER:
			case TO_STRING:
			case TO_UPPER:
			case TRIM:
			case UNESCAPE_CSV:
			case UNESCAPE_HTML3:
			case UNESCAPE_HTML4:
			case UNESCAPE_JSON:
			case UNESCAPE_XML:
			case URL_DECODE:
			case URL_ENCODE:
				{
				alt19=5;
				}
				break;
			case APPEND:
			case CONTAINS:
			case ENDS_WITH:
			case FROM_RADIX:
			case HASH:
			case JOIN:
			case JSON_PATH:
			case JSON_PATH_DELETE:
			case PREPEND:
			case REPLACE_BY_PATTERN:
			case REPLACE_EMPTY:
			case REPLACE_NULL:
			case STARTS_WITH:
			case SUBSTRING_AFTER:
			case SUBSTRING_AFTER_LAST:
			case SUBSTRING_BEFORE:
			case SUBSTRING_BEFORE_LAST:
			case TO_RADIX:
			case UUID3:
			case UUID5:
				{
				alt19=6;
				}
				break;
			case FORMAT:
			case FORMAT_INSTANT:
			case IF_ELSE:
			case JSON_PATH_ADD:
			case JSON_PATH_SET:
			case PAD_LEFT:
			case PAD_RIGHT:
			case REPEAT:
			case REPLACE:
			case REPLACE_ALL:
			case REPLACE_FIRST:
			case SUBSTRING:
				{
				alt19=7;
				}
				break;
			case GET_DELIMITED_FIELD:
				{
				alt19=8;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt19=9;
				}
				break;
			case IS_EMPTY:
			case IS_JSON:
			case IS_NULL:
			case NOT:
			case NOT_NULL:
				{
				alt19=10;
				}
				break;
			case AND:
			case EQUALS:
			case EQUALS_IGNORE_CASE:
			case FIND:
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUAL:
			case LESS_THAN:
			case LESS_THAN_OR_EQUAL:
			case MATCHES:
			case OR:
				{
				alt19=11;
				}
				break;
			case IN:
				{
				alt19=12;
				}
				break;
			case DOLLAR:
				{
				alt19=13;
				}
				break;
			case PARAMETER_REFERENCE_START:
				{
				alt19=14;
				}
				break;
			case NULL:
				{
				alt19=15;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:108:10: WHOLE_NUMBER
					{
					root_0 = (Object)adaptor.nil();


					WHOLE_NUMBER113=(Token)match(input,WHOLE_NUMBER,FOLLOW_WHOLE_NUMBER_in_anyArg849); 
					WHOLE_NUMBER113_tree = (Object)adaptor.create(WHOLE_NUMBER113);
					adaptor.addChild(root_0, WHOLE_NUMBER113_tree);

					}
					break;
				case 2 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:108:25: DECIMAL
					{
					root_0 = (Object)adaptor.nil();


					DECIMAL114=(Token)match(input,DECIMAL,FOLLOW_DECIMAL_in_anyArg853); 
					DECIMAL114_tree = (Object)adaptor.create(DECIMAL114);
					adaptor.addChild(root_0, DECIMAL114_tree);

					}
					break;
				case 3 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:108:35: numberFunctionRef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_numberFunctionRef_in_anyArg857);
					numberFunctionRef115=numberFunctionRef();
					state._fsp--;

					adaptor.addChild(root_0, numberFunctionRef115.getTree());

					}
					break;
				case 4 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:108:55: STRING_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRING_LITERAL116=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_anyArg861); 
					STRING_LITERAL116_tree = (Object)adaptor.create(STRING_LITERAL116);
					adaptor.addChild(root_0, STRING_LITERAL116_tree);

					}
					break;
				case 5 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:108:72: zeroArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgString_in_anyArg865);
					zeroArgString117=zeroArgString();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgString117.getTree());

					}
					break;
				case 6 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:108:88: oneArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgString_in_anyArg869);
					oneArgString118=oneArgString();
					state._fsp--;

					adaptor.addChild(root_0, oneArgString118.getTree());

					}
					break;
				case 7 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:108:103: twoArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_twoArgString_in_anyArg873);
					twoArgString119=twoArgString();
					state._fsp--;

					adaptor.addChild(root_0, twoArgString119.getTree());

					}
					break;
				case 8 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:108:118: fiveArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_fiveArgString_in_anyArg877);
					fiveArgString120=fiveArgString();
					state._fsp--;

					adaptor.addChild(root_0, fiveArgString120.getTree());

					}
					break;
				case 9 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:108:134: booleanLiteral
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_booleanLiteral_in_anyArg881);
					booleanLiteral121=booleanLiteral();
					state._fsp--;

					adaptor.addChild(root_0, booleanLiteral121.getTree());

					}
					break;
				case 10 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:108:151: zeroArgBool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgBool_in_anyArg885);
					zeroArgBool122=zeroArgBool();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgBool122.getTree());

					}
					break;
				case 11 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:108:165: oneArgBool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgBool_in_anyArg889);
					oneArgBool123=oneArgBool();
					state._fsp--;

					adaptor.addChild(root_0, oneArgBool123.getTree());

					}
					break;
				case 12 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:108:178: multiArgBool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_multiArgBool_in_anyArg893);
					multiArgBool124=multiArgBool();
					state._fsp--;

					adaptor.addChild(root_0, multiArgBool124.getTree());

					}
					break;
				case 13 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:109:19: expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_anyArg913);
					expression125=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression125.getTree());

					}
					break;
				case 14 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:109:32: parameterReference
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_parameterReference_in_anyArg917);
					parameterReference126=parameterReference();
					state._fsp--;

					adaptor.addChild(root_0, parameterReference126.getTree());

					}
					break;
				case 15 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:109:53: NULL
					{
					root_0 = (Object)adaptor.nil();


					NULL127=(Token)match(input,NULL,FOLLOW_NULL_in_anyArg921); 
					NULL127_tree = (Object)adaptor.create(NULL127);
					adaptor.addChild(root_0, NULL127_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "anyArg"


	public static class stringArg_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "stringArg"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:111:1: stringArg : ( STRING_LITERAL | zeroArgString | oneArgString | twoArgString | expression );
	public final AttributeExpressionParser.stringArg_return stringArg() throws RecognitionException {
		AttributeExpressionParser.stringArg_return retval = new AttributeExpressionParser.stringArg_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STRING_LITERAL128=null;
		ParserRuleReturnScope zeroArgString129 =null;
		ParserRuleReturnScope oneArgString130 =null;
		ParserRuleReturnScope twoArgString131 =null;
		ParserRuleReturnScope expression132 =null;

		Object STRING_LITERAL128_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:111:11: ( STRING_LITERAL | zeroArgString | oneArgString | twoArgString | expression )
			int alt20=5;
			switch ( input.LA(1) ) {
			case STRING_LITERAL:
				{
				alt20=1;
				}
				break;
			case BASE64_DECODE:
			case BASE64_ENCODE:
			case ESCAPE_CSV:
			case ESCAPE_HTML3:
			case ESCAPE_HTML4:
			case ESCAPE_JSON:
			case ESCAPE_XML:
			case EVALUATE_EL_STRING:
			case TO_LOWER:
			case TO_STRING:
			case TO_UPPER:
			case TRIM:
			case UNESCAPE_CSV:
			case UNESCAPE_HTML3:
			case UNESCAPE_HTML4:
			case UNESCAPE_JSON:
			case UNESCAPE_XML:
			case URL_DECODE:
			case URL_ENCODE:
				{
				alt20=2;
				}
				break;
			case APPEND:
			case CONTAINS:
			case ENDS_WITH:
			case FROM_RADIX:
			case HASH:
			case JOIN:
			case JSON_PATH:
			case JSON_PATH_DELETE:
			case PREPEND:
			case REPLACE_BY_PATTERN:
			case REPLACE_EMPTY:
			case REPLACE_NULL:
			case STARTS_WITH:
			case SUBSTRING_AFTER:
			case SUBSTRING_AFTER_LAST:
			case SUBSTRING_BEFORE:
			case SUBSTRING_BEFORE_LAST:
			case TO_RADIX:
			case UUID3:
			case UUID5:
				{
				alt20=3;
				}
				break;
			case FORMAT:
			case FORMAT_INSTANT:
			case IF_ELSE:
			case JSON_PATH_ADD:
			case JSON_PATH_SET:
			case PAD_LEFT:
			case PAD_RIGHT:
			case REPEAT:
			case REPLACE:
			case REPLACE_ALL:
			case REPLACE_FIRST:
			case SUBSTRING:
				{
				alt20=4;
				}
				break;
			case DOLLAR:
				{
				alt20=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:111:13: STRING_LITERAL
					{
					root_0 = (Object)adaptor.nil();


					STRING_LITERAL128=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringArg929); 
					STRING_LITERAL128_tree = (Object)adaptor.create(STRING_LITERAL128);
					adaptor.addChild(root_0, STRING_LITERAL128_tree);

					}
					break;
				case 2 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:111:30: zeroArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgString_in_stringArg933);
					zeroArgString129=zeroArgString();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgString129.getTree());

					}
					break;
				case 3 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:111:46: oneArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgString_in_stringArg937);
					oneArgString130=oneArgString();
					state._fsp--;

					adaptor.addChild(root_0, oneArgString130.getTree());

					}
					break;
				case 4 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:111:61: twoArgString
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_twoArgString_in_stringArg941);
					twoArgString131=twoArgString();
					state._fsp--;

					adaptor.addChild(root_0, twoArgString131.getTree());

					}
					break;
				case 5 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:111:76: expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_stringArg945);
					expression132=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression132.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stringArg"


	public static class functionRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionRef"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:112:1: functionRef : ( stringFunctionRef | booleanFunctionRef | numberFunctionRef );
	public final AttributeExpressionParser.functionRef_return functionRef() throws RecognitionException {
		AttributeExpressionParser.functionRef_return retval = new AttributeExpressionParser.functionRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope stringFunctionRef133 =null;
		ParserRuleReturnScope booleanFunctionRef134 =null;
		ParserRuleReturnScope numberFunctionRef135 =null;


		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:112:13: ( stringFunctionRef | booleanFunctionRef | numberFunctionRef )
			int alt21=3;
			switch ( input.LA(1) ) {
			case APPEND:
			case BASE64_DECODE:
			case BASE64_ENCODE:
			case CONTAINS:
			case ENDS_WITH:
			case ESCAPE_CSV:
			case ESCAPE_HTML3:
			case ESCAPE_HTML4:
			case ESCAPE_JSON:
			case ESCAPE_XML:
			case EVALUATE_EL_STRING:
			case FORMAT:
			case FORMAT_INSTANT:
			case FROM_RADIX:
			case GET_DELIMITED_FIELD:
			case HASH:
			case IF_ELSE:
			case JOIN:
			case JSON_PATH:
			case JSON_PATH_ADD:
			case JSON_PATH_DELETE:
			case JSON_PATH_PUT:
			case JSON_PATH_SET:
			case PAD_LEFT:
			case PAD_RIGHT:
			case PREPEND:
			case REPEAT:
			case REPLACE:
			case REPLACE_ALL:
			case REPLACE_BY_PATTERN:
			case REPLACE_EMPTY:
			case REPLACE_FIRST:
			case REPLACE_NULL:
			case STARTS_WITH:
			case SUBSTRING:
			case SUBSTRING_AFTER:
			case SUBSTRING_AFTER_LAST:
			case SUBSTRING_BEFORE:
			case SUBSTRING_BEFORE_LAST:
			case TO_LOWER:
			case TO_RADIX:
			case TO_STRING:
			case TO_UPPER:
			case TRIM:
			case UNESCAPE_CSV:
			case UNESCAPE_HTML3:
			case UNESCAPE_HTML4:
			case UNESCAPE_JSON:
			case UNESCAPE_XML:
			case URL_DECODE:
			case URL_ENCODE:
			case UUID3:
			case UUID5:
				{
				alt21=1;
				}
				break;
			case AND:
			case EQUALS:
			case EQUALS_IGNORE_CASE:
			case FIND:
			case GREATER_THAN:
			case GREATER_THAN_OR_EQUAL:
			case IN:
			case IS_EMPTY:
			case IS_JSON:
			case IS_NULL:
			case LESS_THAN:
			case LESS_THAN_OR_EQUAL:
			case MATCHES:
			case NOT:
			case NOT_NULL:
			case OR:
				{
				alt21=2;
				}
				break;
			case COUNT:
			case DIVIDE:
			case INDEX_OF:
			case LAST_INDEX_OF:
			case LENGTH:
			case MATH:
			case MINUS:
			case MOD:
			case MULTIPLY:
			case PLUS:
			case TO_DATE:
			case TO_DECIMAL:
			case TO_INSTANT:
			case TO_MICROS:
			case TO_NANOS:
			case TO_NUMBER:
				{
				alt21=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:112:15: stringFunctionRef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_stringFunctionRef_in_functionRef952);
					stringFunctionRef133=stringFunctionRef();
					state._fsp--;

					adaptor.addChild(root_0, stringFunctionRef133.getTree());

					}
					break;
				case 2 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:112:35: booleanFunctionRef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_booleanFunctionRef_in_functionRef956);
					booleanFunctionRef134=booleanFunctionRef();
					state._fsp--;

					adaptor.addChild(root_0, booleanFunctionRef134.getTree());

					}
					break;
				case 3 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:112:56: numberFunctionRef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_numberFunctionRef_in_functionRef960);
					numberFunctionRef135=numberFunctionRef();
					state._fsp--;

					adaptor.addChild(root_0, numberFunctionRef135.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionRef"


	public static class subject_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "subject"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:117:1: subject : ( attrName | expression );
	public final AttributeExpressionParser.subject_return subject() throws RecognitionException {
		AttributeExpressionParser.subject_return retval = new AttributeExpressionParser.subject_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope attrName136 =null;
		ParserRuleReturnScope expression137 =null;


		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:117:9: ( attrName | expression )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( ((LA22_0 >= ALL_ATTRIBUTES && LA22_0 <= ALL_MATCHING_ATTRIBUTES)||(LA22_0 >= ANY_ATTRIBUTE && LA22_0 <= ANY_MATCHING_ATTRIBUTE)||LA22_0==ATTRIBUTE_NAME||LA22_0==STRING_LITERAL) ) {
				alt22=1;
			}
			else if ( (LA22_0==DOLLAR) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:117:11: attrName
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_attrName_in_subject971);
					attrName136=attrName();
					state._fsp--;

					adaptor.addChild(root_0, attrName136.getTree());

					}
					break;
				case 2 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:117:22: expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_subject975);
					expression137=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression137.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subject"


	public static class attrName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attrName"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:118:1: attrName : ( singleAttrName | multiAttrName );
	public final AttributeExpressionParser.attrName_return attrName() throws RecognitionException {
		AttributeExpressionParser.attrName_return retval = new AttributeExpressionParser.attrName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope singleAttrName138 =null;
		ParserRuleReturnScope multiAttrName139 =null;


		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:118:10: ( singleAttrName | multiAttrName )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==ATTRIBUTE_NAME||LA23_0==STRING_LITERAL) ) {
				alt23=1;
			}
			else if ( ((LA23_0 >= ALL_ATTRIBUTES && LA23_0 <= ALL_MATCHING_ATTRIBUTES)||(LA23_0 >= ANY_ATTRIBUTE && LA23_0 <= ANY_MATCHING_ATTRIBUTE)) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:118:12: singleAttrName
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_singleAttrName_in_attrName982);
					singleAttrName138=singleAttrName();
					state._fsp--;

					adaptor.addChild(root_0, singleAttrName138.getTree());

					}
					break;
				case 2 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:118:29: multiAttrName
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_multiAttrName_in_attrName986);
					multiAttrName139=multiAttrName();
					state._fsp--;

					adaptor.addChild(root_0, multiAttrName139.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attrName"


	public static class singleAttrRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "singleAttrRef"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:120:1: singleAttrRef : ( ATTRIBUTE_NAME | STRING_LITERAL );
	public final AttributeExpressionParser.singleAttrRef_return singleAttrRef() throws RecognitionException {
		AttributeExpressionParser.singleAttrRef_return retval = new AttributeExpressionParser.singleAttrRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set140=null;

		Object set140_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:120:15: ( ATTRIBUTE_NAME | STRING_LITERAL )
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set140=input.LT(1);
			if ( input.LA(1)==ATTRIBUTE_NAME||input.LA(1)==STRING_LITERAL ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set140));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "singleAttrRef"


	public static class singleAttrName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "singleAttrName"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:121:1: singleAttrName : singleAttrRef -> ^( ATTR_NAME singleAttrRef ) ;
	public final AttributeExpressionParser.singleAttrName_return singleAttrName() throws RecognitionException {
		AttributeExpressionParser.singleAttrName_return retval = new AttributeExpressionParser.singleAttrName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope singleAttrRef141 =null;

		RewriteRuleSubtreeStream stream_singleAttrRef=new RewriteRuleSubtreeStream(adaptor,"rule singleAttrRef");

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:121:16: ( singleAttrRef -> ^( ATTR_NAME singleAttrRef ) )
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:121:18: singleAttrRef
			{
			pushFollow(FOLLOW_singleAttrRef_in_singleAttrName1005);
			singleAttrRef141=singleAttrRef();
			state._fsp--;

			stream_singleAttrRef.add(singleAttrRef141.getTree());

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 121:32: -> ^( ATTR_NAME singleAttrRef )
			{
				// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:122:2: ^( ATTR_NAME singleAttrRef )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTR_NAME, "ATTR_NAME"), root_1);
				adaptor.addChild(root_1, stream_singleAttrRef.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "singleAttrName"


	public static class multiAttrFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multiAttrFunction"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:125:1: multiAttrFunction : ( ANY_ATTRIBUTE | ANY_MATCHING_ATTRIBUTE | ALL_ATTRIBUTES | ALL_MATCHING_ATTRIBUTES | ANY_DELINEATED_VALUE | ALL_DELINEATED_VALUES );
	public final AttributeExpressionParser.multiAttrFunction_return multiAttrFunction() throws RecognitionException {
		AttributeExpressionParser.multiAttrFunction_return retval = new AttributeExpressionParser.multiAttrFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set142=null;

		Object set142_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:125:19: ( ANY_ATTRIBUTE | ANY_MATCHING_ATTRIBUTE | ALL_ATTRIBUTES | ALL_MATCHING_ATTRIBUTES | ANY_DELINEATED_VALUE | ALL_DELINEATED_VALUES )
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set142=input.LT(1);
			if ( (input.LA(1) >= ALL_ATTRIBUTES && input.LA(1) <= ALL_MATCHING_ATTRIBUTES)||(input.LA(1) >= ANY_ATTRIBUTE && input.LA(1) <= ANY_MATCHING_ATTRIBUTE) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set142));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiAttrFunction"


	public static class multiAttrName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multiAttrName"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:126:1: multiAttrName : multiAttrFunction LPAREN stringArg ( COMMA stringArg )* RPAREN -> ^( MULTI_ATTRIBUTE_REFERENCE multiAttrFunction ( stringArg )* ) ;
	public final AttributeExpressionParser.multiAttrName_return multiAttrName() throws RecognitionException {
		AttributeExpressionParser.multiAttrName_return retval = new AttributeExpressionParser.multiAttrName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN144=null;
		Token COMMA146=null;
		Token RPAREN148=null;
		ParserRuleReturnScope multiAttrFunction143 =null;
		ParserRuleReturnScope stringArg145 =null;
		ParserRuleReturnScope stringArg147 =null;

		Object LPAREN144_tree=null;
		Object COMMA146_tree=null;
		Object RPAREN148_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_multiAttrFunction=new RewriteRuleSubtreeStream(adaptor,"rule multiAttrFunction");
		RewriteRuleSubtreeStream stream_stringArg=new RewriteRuleSubtreeStream(adaptor,"rule stringArg");

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:126:15: ( multiAttrFunction LPAREN stringArg ( COMMA stringArg )* RPAREN -> ^( MULTI_ATTRIBUTE_REFERENCE multiAttrFunction ( stringArg )* ) )
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:126:17: multiAttrFunction LPAREN stringArg ( COMMA stringArg )* RPAREN
			{
			pushFollow(FOLLOW_multiAttrFunction_in_multiAttrName1050);
			multiAttrFunction143=multiAttrFunction();
			state._fsp--;

			stream_multiAttrFunction.add(multiAttrFunction143.getTree());
			LPAREN144=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_multiAttrName1052);  
			stream_LPAREN.add(LPAREN144);

			pushFollow(FOLLOW_stringArg_in_multiAttrName1054);
			stringArg145=stringArg();
			state._fsp--;

			stream_stringArg.add(stringArg145.getTree());
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:126:52: ( COMMA stringArg )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==COMMA) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:126:53: COMMA stringArg
					{
					COMMA146=(Token)match(input,COMMA,FOLLOW_COMMA_in_multiAttrName1057);  
					stream_COMMA.add(COMMA146);

					pushFollow(FOLLOW_stringArg_in_multiAttrName1059);
					stringArg147=stringArg();
					state._fsp--;

					stream_stringArg.add(stringArg147.getTree());
					}
					break;

				default :
					break loop24;
				}
			}

			RPAREN148=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_multiAttrName1063);  
			stream_RPAREN.add(RPAREN148);


			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 126:78: -> ^( MULTI_ATTRIBUTE_REFERENCE multiAttrFunction ( stringArg )* )
			{
				// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:127:2: ^( MULTI_ATTRIBUTE_REFERENCE multiAttrFunction ( stringArg )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MULTI_ATTRIBUTE_REFERENCE, "MULTI_ATTRIBUTE_REFERENCE"), root_1);
				adaptor.addChild(root_1, stream_multiAttrFunction.nextTree());
				// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:127:48: ( stringArg )*
				while ( stream_stringArg.hasNext() ) {
					adaptor.addChild(root_1, stream_stringArg.nextTree());
				}
				stream_stringArg.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiAttrName"


	public static class attributeRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attributeRef"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:129:1: attributeRef : subject -> ^( ATTRIBUTE_REFERENCE subject ) ;
	public final AttributeExpressionParser.attributeRef_return attributeRef() throws RecognitionException {
		AttributeExpressionParser.attributeRef_return retval = new AttributeExpressionParser.attributeRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope subject149 =null;

		RewriteRuleSubtreeStream stream_subject=new RewriteRuleSubtreeStream(adaptor,"rule subject");

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:129:14: ( subject -> ^( ATTRIBUTE_REFERENCE subject ) )
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:129:16: subject
			{
			pushFollow(FOLLOW_subject_in_attributeRef1083);
			subject149=subject();
			state._fsp--;

			stream_subject.add(subject149.getTree());

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 129:24: -> ^( ATTRIBUTE_REFERENCE subject )
			{
				// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:130:2: ^( ATTRIBUTE_REFERENCE subject )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATTRIBUTE_REFERENCE, "ATTRIBUTE_REFERENCE"), root_1);
				adaptor.addChild(root_1, stream_subject.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attributeRef"


	public static class functionCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:133:1: functionCall : functionRef -> ^( FUNCTION_CALL functionRef ) ;
	public final AttributeExpressionParser.functionCall_return functionCall() throws RecognitionException {
		AttributeExpressionParser.functionCall_return retval = new AttributeExpressionParser.functionCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope functionRef150 =null;

		RewriteRuleSubtreeStream stream_functionRef=new RewriteRuleSubtreeStream(adaptor,"rule functionRef");

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:133:14: ( functionRef -> ^( FUNCTION_CALL functionRef ) )
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:133:16: functionRef
			{
			pushFollow(FOLLOW_functionRef_in_functionCall1101);
			functionRef150=functionRef();
			state._fsp--;

			stream_functionRef.add(functionRef150.getTree());

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 133:28: -> ^( FUNCTION_CALL functionRef )
			{
				// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:134:2: ^( FUNCTION_CALL functionRef )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);
				adaptor.addChild(root_1, stream_functionRef.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class booleanLiteral_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "booleanLiteral"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:136:1: booleanLiteral : ( TRUE | FALSE );
	public final AttributeExpressionParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
		AttributeExpressionParser.booleanLiteral_return retval = new AttributeExpressionParser.booleanLiteral_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set151=null;

		Object set151_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:136:16: ( TRUE | FALSE )
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set151=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set151));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanLiteral"


	public static class zeroArgStandaloneFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "zeroArgStandaloneFunction"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:137:1: zeroArgStandaloneFunction : ( IP | UUID | NOW | NEXT_INT | HOSTNAME | THREAD | RANDOM ) LPAREN ! RPAREN !;
	public final AttributeExpressionParser.zeroArgStandaloneFunction_return zeroArgStandaloneFunction() throws RecognitionException {
		AttributeExpressionParser.zeroArgStandaloneFunction_return retval = new AttributeExpressionParser.zeroArgStandaloneFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set152=null;
		Token LPAREN153=null;
		Token RPAREN154=null;

		Object set152_tree=null;
		Object LPAREN153_tree=null;
		Object RPAREN154_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:137:27: ( ( IP | UUID | NOW | NEXT_INT | HOSTNAME | THREAD | RANDOM ) LPAREN ! RPAREN !)
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:137:29: ( IP | UUID | NOW | NEXT_INT | HOSTNAME | THREAD | RANDOM ) LPAREN ! RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			set152=input.LT(1);
			if ( input.LA(1)==HOSTNAME||input.LA(1)==IP||input.LA(1)==NEXT_INT||input.LA(1)==NOW||input.LA(1)==RANDOM||input.LA(1)==THREAD||input.LA(1)==UUID ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set152));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			LPAREN153=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_zeroArgStandaloneFunction1157); 
			RPAREN154=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_zeroArgStandaloneFunction1160); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "zeroArgStandaloneFunction"


	public static class oneArgStandaloneFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "oneArgStandaloneFunction"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:138:1: oneArgStandaloneFunction : ( ( ( TO_LITERAL | MATH | GET_STATE_VALUE ) ^ LPAREN ! anyArg RPAREN !) | ( HOSTNAME ^ LPAREN ! booleanLiteral RPAREN !) );
	public final AttributeExpressionParser.oneArgStandaloneFunction_return oneArgStandaloneFunction() throws RecognitionException {
		AttributeExpressionParser.oneArgStandaloneFunction_return retval = new AttributeExpressionParser.oneArgStandaloneFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set155=null;
		Token LPAREN156=null;
		Token RPAREN158=null;
		Token HOSTNAME159=null;
		Token LPAREN160=null;
		Token RPAREN162=null;
		ParserRuleReturnScope anyArg157 =null;
		ParserRuleReturnScope booleanLiteral161 =null;

		Object set155_tree=null;
		Object LPAREN156_tree=null;
		Object RPAREN158_tree=null;
		Object HOSTNAME159_tree=null;
		Object LPAREN160_tree=null;
		Object RPAREN162_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:138:26: ( ( ( TO_LITERAL | MATH | GET_STATE_VALUE ) ^ LPAREN ! anyArg RPAREN !) | ( HOSTNAME ^ LPAREN ! booleanLiteral RPAREN !) )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==GET_STATE_VALUE||LA25_0==MATH||LA25_0==TO_LITERAL) ) {
				alt25=1;
			}
			else if ( (LA25_0==HOSTNAME) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:138:28: ( ( TO_LITERAL | MATH | GET_STATE_VALUE ) ^ LPAREN ! anyArg RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:138:28: ( ( TO_LITERAL | MATH | GET_STATE_VALUE ) ^ LPAREN ! anyArg RPAREN !)
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:138:29: ( TO_LITERAL | MATH | GET_STATE_VALUE ) ^ LPAREN ! anyArg RPAREN !
					{
					set155=input.LT(1);
					set155=input.LT(1);
					if ( input.LA(1)==GET_STATE_VALUE||input.LA(1)==MATH||input.LA(1)==TO_LITERAL ) {
						input.consume();
						root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set155), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					LPAREN156=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgStandaloneFunction1182); 
					pushFollow(FOLLOW_anyArg_in_oneArgStandaloneFunction1185);
					anyArg157=anyArg();
					state._fsp--;

					adaptor.addChild(root_0, anyArg157.getTree());

					RPAREN158=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgStandaloneFunction1187); 
					}

					}
					break;
				case 2 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:139:28: ( HOSTNAME ^ LPAREN ! booleanLiteral RPAREN !)
					{
					root_0 = (Object)adaptor.nil();


					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:139:28: ( HOSTNAME ^ LPAREN ! booleanLiteral RPAREN !)
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:139:29: HOSTNAME ^ LPAREN ! booleanLiteral RPAREN !
					{
					HOSTNAME159=(Token)match(input,HOSTNAME,FOLLOW_HOSTNAME_in_oneArgStandaloneFunction1221); 
					HOSTNAME159_tree = (Object)adaptor.create(HOSTNAME159);
					root_0 = (Object)adaptor.becomeRoot(HOSTNAME159_tree, root_0);

					LPAREN160=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_oneArgStandaloneFunction1224); 
					pushFollow(FOLLOW_booleanLiteral_in_oneArgStandaloneFunction1227);
					booleanLiteral161=booleanLiteral();
					state._fsp--;

					adaptor.addChild(root_0, booleanLiteral161.getTree());

					RPAREN162=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_oneArgStandaloneFunction1229); 
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "oneArgStandaloneFunction"


	public static class sevenArgStandaloneFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "sevenArgStandaloneFunction"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:140:1: sevenArgStandaloneFunction : GET_URI ^ LPAREN ! anyArg COMMA ! anyArg COMMA ! anyArg COMMA ! anyArg COMMA ! anyArg COMMA ! anyArg COMMA ! anyArg RPAREN !;
	public final AttributeExpressionParser.sevenArgStandaloneFunction_return sevenArgStandaloneFunction() throws RecognitionException {
		AttributeExpressionParser.sevenArgStandaloneFunction_return retval = new AttributeExpressionParser.sevenArgStandaloneFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GET_URI163=null;
		Token LPAREN164=null;
		Token COMMA166=null;
		Token COMMA168=null;
		Token COMMA170=null;
		Token COMMA172=null;
		Token COMMA174=null;
		Token COMMA176=null;
		Token RPAREN178=null;
		ParserRuleReturnScope anyArg165 =null;
		ParserRuleReturnScope anyArg167 =null;
		ParserRuleReturnScope anyArg169 =null;
		ParserRuleReturnScope anyArg171 =null;
		ParserRuleReturnScope anyArg173 =null;
		ParserRuleReturnScope anyArg175 =null;
		ParserRuleReturnScope anyArg177 =null;

		Object GET_URI163_tree=null;
		Object LPAREN164_tree=null;
		Object COMMA166_tree=null;
		Object COMMA168_tree=null;
		Object COMMA170_tree=null;
		Object COMMA172_tree=null;
		Object COMMA174_tree=null;
		Object COMMA176_tree=null;
		Object RPAREN178_tree=null;

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:140:28: ( GET_URI ^ LPAREN ! anyArg COMMA ! anyArg COMMA ! anyArg COMMA ! anyArg COMMA ! anyArg COMMA ! anyArg COMMA ! anyArg RPAREN !)
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:140:30: GET_URI ^ LPAREN ! anyArg COMMA ! anyArg COMMA ! anyArg COMMA ! anyArg COMMA ! anyArg COMMA ! anyArg COMMA ! anyArg RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			GET_URI163=(Token)match(input,GET_URI,FOLLOW_GET_URI_in_sevenArgStandaloneFunction1238); 
			GET_URI163_tree = (Object)adaptor.create(GET_URI163);
			root_0 = (Object)adaptor.becomeRoot(GET_URI163_tree, root_0);

			LPAREN164=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_sevenArgStandaloneFunction1241); 
			pushFollow(FOLLOW_anyArg_in_sevenArgStandaloneFunction1244);
			anyArg165=anyArg();
			state._fsp--;

			adaptor.addChild(root_0, anyArg165.getTree());

			COMMA166=(Token)match(input,COMMA,FOLLOW_COMMA_in_sevenArgStandaloneFunction1246); 
			pushFollow(FOLLOW_anyArg_in_sevenArgStandaloneFunction1249);
			anyArg167=anyArg();
			state._fsp--;

			adaptor.addChild(root_0, anyArg167.getTree());

			COMMA168=(Token)match(input,COMMA,FOLLOW_COMMA_in_sevenArgStandaloneFunction1251); 
			pushFollow(FOLLOW_anyArg_in_sevenArgStandaloneFunction1254);
			anyArg169=anyArg();
			state._fsp--;

			adaptor.addChild(root_0, anyArg169.getTree());

			COMMA170=(Token)match(input,COMMA,FOLLOW_COMMA_in_sevenArgStandaloneFunction1256); 
			pushFollow(FOLLOW_anyArg_in_sevenArgStandaloneFunction1259);
			anyArg171=anyArg();
			state._fsp--;

			adaptor.addChild(root_0, anyArg171.getTree());

			COMMA172=(Token)match(input,COMMA,FOLLOW_COMMA_in_sevenArgStandaloneFunction1261); 
			pushFollow(FOLLOW_anyArg_in_sevenArgStandaloneFunction1264);
			anyArg173=anyArg();
			state._fsp--;

			adaptor.addChild(root_0, anyArg173.getTree());

			COMMA174=(Token)match(input,COMMA,FOLLOW_COMMA_in_sevenArgStandaloneFunction1266); 
			pushFollow(FOLLOW_anyArg_in_sevenArgStandaloneFunction1269);
			anyArg175=anyArg();
			state._fsp--;

			adaptor.addChild(root_0, anyArg175.getTree());

			COMMA176=(Token)match(input,COMMA,FOLLOW_COMMA_in_sevenArgStandaloneFunction1271); 
			pushFollow(FOLLOW_anyArg_in_sevenArgStandaloneFunction1274);
			anyArg177=anyArg();
			state._fsp--;

			adaptor.addChild(root_0, anyArg177.getTree());

			RPAREN178=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_sevenArgStandaloneFunction1276); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sevenArgStandaloneFunction"


	public static class standaloneFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "standaloneFunction"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:141:1: standaloneFunction : ( zeroArgStandaloneFunction | oneArgStandaloneFunction | sevenArgStandaloneFunction );
	public final AttributeExpressionParser.standaloneFunction_return standaloneFunction() throws RecognitionException {
		AttributeExpressionParser.standaloneFunction_return retval = new AttributeExpressionParser.standaloneFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope zeroArgStandaloneFunction179 =null;
		ParserRuleReturnScope oneArgStandaloneFunction180 =null;
		ParserRuleReturnScope sevenArgStandaloneFunction181 =null;


		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:141:20: ( zeroArgStandaloneFunction | oneArgStandaloneFunction | sevenArgStandaloneFunction )
			int alt26=3;
			switch ( input.LA(1) ) {
			case HOSTNAME:
				{
				int LA26_1 = input.LA(2);
				if ( (LA26_1==LPAREN) ) {
					int LA26_5 = input.LA(3);
					if ( (LA26_5==RPAREN) ) {
						alt26=1;
					}
					else if ( (LA26_5==FALSE||LA26_5==TRUE) ) {
						alt26=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 26, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 26, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case GET_STATE_VALUE:
			case MATH:
			case TO_LITERAL:
				{
				alt26=2;
				}
				break;
			case IP:
			case NEXT_INT:
			case NOW:
			case RANDOM:
			case THREAD:
			case UUID:
				{
				alt26=1;
				}
				break;
			case GET_URI:
				{
				alt26=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:141:22: zeroArgStandaloneFunction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_zeroArgStandaloneFunction_in_standaloneFunction1284);
					zeroArgStandaloneFunction179=zeroArgStandaloneFunction();
					state._fsp--;

					adaptor.addChild(root_0, zeroArgStandaloneFunction179.getTree());

					}
					break;
				case 2 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:141:50: oneArgStandaloneFunction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_oneArgStandaloneFunction_in_standaloneFunction1288);
					oneArgStandaloneFunction180=oneArgStandaloneFunction();
					state._fsp--;

					adaptor.addChild(root_0, oneArgStandaloneFunction180.getTree());

					}
					break;
				case 3 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:141:77: sevenArgStandaloneFunction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_sevenArgStandaloneFunction_in_standaloneFunction1292);
					sevenArgStandaloneFunction181=sevenArgStandaloneFunction();
					state._fsp--;

					adaptor.addChild(root_0, sevenArgStandaloneFunction181.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "standaloneFunction"


	public static class attributeRefOrFunctionCall_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attributeRefOrFunctionCall"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:143:1: attributeRefOrFunctionCall : ( attributeRef | standaloneFunction | parameterReference ) ;
	public final AttributeExpressionParser.attributeRefOrFunctionCall_return attributeRefOrFunctionCall() throws RecognitionException {
		AttributeExpressionParser.attributeRefOrFunctionCall_return retval = new AttributeExpressionParser.attributeRefOrFunctionCall_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope attributeRef182 =null;
		ParserRuleReturnScope standaloneFunction183 =null;
		ParserRuleReturnScope parameterReference184 =null;


		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:143:28: ( ( attributeRef | standaloneFunction | parameterReference ) )
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:143:30: ( attributeRef | standaloneFunction | parameterReference )
			{
			root_0 = (Object)adaptor.nil();


			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:143:30: ( attributeRef | standaloneFunction | parameterReference )
			int alt27=3;
			switch ( input.LA(1) ) {
			case ALL_ATTRIBUTES:
			case ALL_DELINEATED_VALUES:
			case ALL_MATCHING_ATTRIBUTES:
			case ANY_ATTRIBUTE:
			case ANY_DELINEATED_VALUE:
			case ANY_MATCHING_ATTRIBUTE:
			case ATTRIBUTE_NAME:
			case DOLLAR:
			case STRING_LITERAL:
				{
				alt27=1;
				}
				break;
			case GET_STATE_VALUE:
			case GET_URI:
			case HOSTNAME:
			case IP:
			case MATH:
			case NEXT_INT:
			case NOW:
			case RANDOM:
			case THREAD:
			case TO_LITERAL:
			case UUID:
				{
				alt27=2;
				}
				break;
			case PARAMETER_REFERENCE_START:
				{
				alt27=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:143:31: attributeRef
					{
					pushFollow(FOLLOW_attributeRef_in_attributeRefOrFunctionCall1301);
					attributeRef182=attributeRef();
					state._fsp--;

					adaptor.addChild(root_0, attributeRef182.getTree());

					}
					break;
				case 2 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:143:46: standaloneFunction
					{
					pushFollow(FOLLOW_standaloneFunction_in_attributeRefOrFunctionCall1305);
					standaloneFunction183=standaloneFunction();
					state._fsp--;

					adaptor.addChild(root_0, standaloneFunction183.getTree());

					}
					break;
				case 3 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:143:67: parameterReference
					{
					pushFollow(FOLLOW_parameterReference_in_attributeRefOrFunctionCall1309);
					parameterReference184=parameterReference();
					state._fsp--;

					adaptor.addChild(root_0, parameterReference184.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attributeRefOrFunctionCall"


	public static class referenceOrFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "referenceOrFunction"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:145:1: referenceOrFunction : DOLLAR LBRACE attributeRefOrFunctionCall ( COLON functionCall )* RBRACE -> ^( EXPRESSION attributeRefOrFunctionCall ( functionCall )* ) ;
	public final AttributeExpressionParser.referenceOrFunction_return referenceOrFunction() throws RecognitionException {
		AttributeExpressionParser.referenceOrFunction_return retval = new AttributeExpressionParser.referenceOrFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DOLLAR185=null;
		Token LBRACE186=null;
		Token COLON188=null;
		Token RBRACE190=null;
		ParserRuleReturnScope attributeRefOrFunctionCall187 =null;
		ParserRuleReturnScope functionCall189 =null;

		Object DOLLAR185_tree=null;
		Object LBRACE186_tree=null;
		Object COLON188_tree=null;
		Object RBRACE190_tree=null;
		RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
		RewriteRuleTokenStream stream_DOLLAR=new RewriteRuleTokenStream(adaptor,"token DOLLAR");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
		RewriteRuleSubtreeStream stream_attributeRefOrFunctionCall=new RewriteRuleSubtreeStream(adaptor,"rule attributeRefOrFunctionCall");
		RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:145:21: ( DOLLAR LBRACE attributeRefOrFunctionCall ( COLON functionCall )* RBRACE -> ^( EXPRESSION attributeRefOrFunctionCall ( functionCall )* ) )
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:145:23: DOLLAR LBRACE attributeRefOrFunctionCall ( COLON functionCall )* RBRACE
			{
			DOLLAR185=(Token)match(input,DOLLAR,FOLLOW_DOLLAR_in_referenceOrFunction1318);  
			stream_DOLLAR.add(DOLLAR185);

			LBRACE186=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_referenceOrFunction1320);  
			stream_LBRACE.add(LBRACE186);

			pushFollow(FOLLOW_attributeRefOrFunctionCall_in_referenceOrFunction1322);
			attributeRefOrFunctionCall187=attributeRefOrFunctionCall();
			state._fsp--;

			stream_attributeRefOrFunctionCall.add(attributeRefOrFunctionCall187.getTree());
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:145:64: ( COLON functionCall )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==COLON) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:145:65: COLON functionCall
					{
					COLON188=(Token)match(input,COLON,FOLLOW_COLON_in_referenceOrFunction1325);  
					stream_COLON.add(COLON188);

					pushFollow(FOLLOW_functionCall_in_referenceOrFunction1327);
					functionCall189=functionCall();
					state._fsp--;

					stream_functionCall.add(functionCall189.getTree());
					}
					break;

				default :
					break loop28;
				}
			}

			RBRACE190=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_referenceOrFunction1331);  
			stream_RBRACE.add(RBRACE190);


			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 145:93: -> ^( EXPRESSION attributeRefOrFunctionCall ( functionCall )* )
			{
				// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:146:24: ^( EXPRESSION attributeRefOrFunctionCall ( functionCall )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSION, "EXPRESSION"), root_1);
				adaptor.addChild(root_1, stream_attributeRefOrFunctionCall.nextTree());
				// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:146:64: ( functionCall )*
				while ( stream_functionCall.hasNext() ) {
					adaptor.addChild(root_1, stream_functionCall.nextTree());
				}
				stream_functionCall.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "referenceOrFunction"


	public static class parameterReference_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parameterReference"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:148:1: parameterReference : PARAMETER_REFERENCE_START singleAttrRef RBRACE -> ^( PARAMETER_REFERENCE singleAttrRef ) ;
	public final AttributeExpressionParser.parameterReference_return parameterReference() throws RecognitionException {
		AttributeExpressionParser.parameterReference_return retval = new AttributeExpressionParser.parameterReference_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PARAMETER_REFERENCE_START191=null;
		Token RBRACE193=null;
		ParserRuleReturnScope singleAttrRef192 =null;

		Object PARAMETER_REFERENCE_START191_tree=null;
		Object RBRACE193_tree=null;
		RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
		RewriteRuleTokenStream stream_PARAMETER_REFERENCE_START=new RewriteRuleTokenStream(adaptor,"token PARAMETER_REFERENCE_START");
		RewriteRuleSubtreeStream stream_singleAttrRef=new RewriteRuleSubtreeStream(adaptor,"rule singleAttrRef");

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:148:20: ( PARAMETER_REFERENCE_START singleAttrRef RBRACE -> ^( PARAMETER_REFERENCE singleAttrRef ) )
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:148:22: PARAMETER_REFERENCE_START singleAttrRef RBRACE
			{
			PARAMETER_REFERENCE_START191=(Token)match(input,PARAMETER_REFERENCE_START,FOLLOW_PARAMETER_REFERENCE_START_in_parameterReference1373);  
			stream_PARAMETER_REFERENCE_START.add(PARAMETER_REFERENCE_START191);

			pushFollow(FOLLOW_singleAttrRef_in_parameterReference1375);
			singleAttrRef192=singleAttrRef();
			state._fsp--;

			stream_singleAttrRef.add(singleAttrRef192.getTree());
			RBRACE193=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_parameterReference1377);  
			stream_RBRACE.add(RBRACE193);


			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 148:69: -> ^( PARAMETER_REFERENCE singleAttrRef )
			{
				// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:149:5: ^( PARAMETER_REFERENCE singleAttrRef )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMETER_REFERENCE, "PARAMETER_REFERENCE"), root_1);
				adaptor.addChild(root_1, stream_singleAttrRef.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameterReference"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:151:1: expression : referenceOrFunction ;
	public final AttributeExpressionParser.expression_return expression() throws RecognitionException {
		AttributeExpressionParser.expression_return retval = new AttributeExpressionParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope referenceOrFunction194 =null;


		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:151:12: ( referenceOrFunction )
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:151:14: referenceOrFunction
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_referenceOrFunction_in_expression1397);
			referenceOrFunction194=referenceOrFunction();
			state._fsp--;

			adaptor.addChild(root_0, referenceOrFunction194.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class query_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "query"
	// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:153:1: query : expression EOF -> ^( QUERY expression ) ;
	public final AttributeExpressionParser.query_return query() throws RecognitionException {
		AttributeExpressionParser.query_return retval = new AttributeExpressionParser.query_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF196=null;
		ParserRuleReturnScope expression195 =null;

		Object EOF196_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:153:7: ( expression EOF -> ^( QUERY expression ) )
			// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:153:9: expression EOF
			{
			pushFollow(FOLLOW_expression_in_query1405);
			expression195=expression();
			state._fsp--;

			stream_expression.add(expression195.getTree());
			EOF196=(Token)match(input,EOF,FOLLOW_EOF_in_query1407);  
			stream_EOF.add(EOF196);


			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 153:24: -> ^( QUERY expression )
			{
				// org/apache/nifi/attribute/expression/language/antlr/AttributeExpressionParser.g:154:2: ^( QUERY expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUERY, "QUERY"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "query"

	// Delegated rules



	public static final BitSet FOLLOW_set_in_zeroArgString82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_zeroArgString158 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_zeroArgString161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgString170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgString250 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_oneArgString253 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgString255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TO_RADIX_in_oneArgString268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgString270 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_oneArgString273 = new BitSet(new long[]{0x0000000000010000L,0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_oneArgString276 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_oneArgString279 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgString283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_twoArgString293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_twoArgString317 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_twoArgString320 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_COMMA_in_twoArgString322 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_twoArgString325 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_twoArgString327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_twoArgString340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_twoArgString364 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_twoArgString367 = new BitSet(new long[]{0x0000000000010000L,0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_twoArgString370 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_twoArgString373 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_twoArgString377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JSON_PATH_PUT_in_threeArgString387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_threeArgString390 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_threeArgString393 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_COMMA_in_threeArgString395 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_threeArgString398 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_COMMA_in_threeArgString400 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_threeArgString403 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_threeArgString405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_DELIMITED_FIELD_in_fiveArgString414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_fiveArgString416 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_fiveArgString419 = new BitSet(new long[]{0x0000000000010000L,0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_fiveArgString422 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_fiveArgString425 = new BitSet(new long[]{0x0000000000010000L,0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_fiveArgString428 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_fiveArgString431 = new BitSet(new long[]{0x0000000000010000L,0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_fiveArgString434 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_fiveArgString437 = new BitSet(new long[]{0x0000000000010000L,0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_fiveArgString440 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_fiveArgString443 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_fiveArgString453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_zeroArgBool463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_zeroArgBool483 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_zeroArgBool486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgBool495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgBool507 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_oneArgBool510 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgBool512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgBool523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgBool539 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_oneArgBool542 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgBool544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_oneArgBool555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgBool558 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_oneArgBool561 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgBool563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgBool573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgBool581 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_oneArgBool584 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgBool586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_in_multiArgBool595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_multiArgBool598 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_multiArgBool601 = new BitSet(new long[]{0x0000000000010000L,0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_multiArgBool604 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_multiArgBool607 = new BitSet(new long[]{0x0000000000010000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_multiArgBool611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_zeroArgNum622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_zeroArgNum646 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_zeroArgNum649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgNum658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgNum666 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_oneArgNum669 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgNum671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgNum683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgNum703 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_oneArgNum706 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgNum708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MATH_in_oneOrTwoArgNum717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_oneOrTwoArgNum719 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_oneOrTwoArgNum722 = new BitSet(new long[]{0x0000000000010000L,0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_oneOrTwoArgNum725 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_oneOrTwoArgNum728 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneOrTwoArgNum732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TO_DATE_in_zeroOrOneOrTwoArgNum740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_zeroOrOneOrTwoArgNum742 = new BitSet(new long[]{0xDBFBB9FBF77D6880L,0x5BFFFDDFDFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_zeroOrOneOrTwoArgNum745 = new BitSet(new long[]{0x0000000000010000L,0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_zeroOrOneOrTwoArgNum749 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_zeroOrOneOrTwoArgNum752 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_zeroOrOneOrTwoArgNum756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TO_INSTANT_in_zeroOrTwoArgNum763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_zeroOrTwoArgNum765 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFDFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_zeroOrTwoArgNum769 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_COMMA_in_zeroOrTwoArgNum771 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_zeroOrTwoArgNum774 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_zeroOrTwoArgNum778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgString_in_stringFunctionRef787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgString_in_stringFunctionRef791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_twoArgString_in_stringFunctionRef795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_threeArgString_in_stringFunctionRef799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fiveArgString_in_stringFunctionRef803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgBool_in_booleanFunctionRef810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgBool_in_booleanFunctionRef814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiArgBool_in_booleanFunctionRef818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgNum_in_numberFunctionRef825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgNum_in_numberFunctionRef829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroOrTwoArgNum_in_numberFunctionRef833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneOrTwoArgNum_in_numberFunctionRef837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroOrOneOrTwoArgNum_in_numberFunctionRef841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHOLE_NUMBER_in_anyArg849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_in_anyArg853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numberFunctionRef_in_anyArg857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_anyArg861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgString_in_anyArg865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgString_in_anyArg869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_twoArgString_in_anyArg873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fiveArgString_in_anyArg877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanLiteral_in_anyArg881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgBool_in_anyArg885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgBool_in_anyArg889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiArgBool_in_anyArg893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_anyArg913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameterReference_in_anyArg917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_anyArg921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_stringArg929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgString_in_stringArg933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgString_in_stringArg937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_twoArgString_in_stringArg941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_stringArg945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringFunctionRef_in_functionRef952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanFunctionRef_in_functionRef956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_numberFunctionRef_in_functionRef960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attrName_in_subject971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_subject975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_singleAttrName_in_attrName982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiAttrName_in_attrName986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_singleAttrRef_in_singleAttrName1005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiAttrFunction_in_multiAttrName1050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_multiAttrName1052 = new BitSet(new long[]{0x0BC0A0E3F1446800L,0x1BFBC41FCFE4C000L});
	public static final BitSet FOLLOW_stringArg_in_multiAttrName1054 = new BitSet(new long[]{0x0000000000010000L,0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_multiAttrName1057 = new BitSet(new long[]{0x0BC0A0E3F1446800L,0x1BFBC41FCFE4C000L});
	public static final BitSet FOLLOW_stringArg_in_multiAttrName1059 = new BitSet(new long[]{0x0000000000010000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_multiAttrName1063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subject_in_attributeRef1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionRef_in_functionCall1101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_zeroArgStandaloneFunction1129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_zeroArgStandaloneFunction1157 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_zeroArgStandaloneFunction1160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_oneArgStandaloneFunction1169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgStandaloneFunction1182 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_oneArgStandaloneFunction1185 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgStandaloneFunction1187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HOSTNAME_in_oneArgStandaloneFunction1221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_oneArgStandaloneFunction1224 = new BitSet(new long[]{0x0000000800000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_booleanLiteral_in_oneArgStandaloneFunction1227 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_oneArgStandaloneFunction1229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_URI_in_sevenArgStandaloneFunction1238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_sevenArgStandaloneFunction1241 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_sevenArgStandaloneFunction1244 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_COMMA_in_sevenArgStandaloneFunction1246 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_sevenArgStandaloneFunction1249 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_COMMA_in_sevenArgStandaloneFunction1251 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_sevenArgStandaloneFunction1254 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_COMMA_in_sevenArgStandaloneFunction1256 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_sevenArgStandaloneFunction1259 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_COMMA_in_sevenArgStandaloneFunction1261 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_sevenArgStandaloneFunction1264 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_COMMA_in_sevenArgStandaloneFunction1266 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_sevenArgStandaloneFunction1269 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_COMMA_in_sevenArgStandaloneFunction1271 = new BitSet(new long[]{0xDBFBB9FBF77C6880L,0x5BFFFDDFCFE7EB7DL});
	public static final BitSet FOLLOW_anyArg_in_sevenArgStandaloneFunction1274 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_sevenArgStandaloneFunction1276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_zeroArgStandaloneFunction_in_standaloneFunction1284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgStandaloneFunction_in_standaloneFunction1288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sevenArgStandaloneFunction_in_standaloneFunction1292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attributeRef_in_attributeRefOrFunctionCall1301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_standaloneFunction_in_attributeRefOrFunctionCall1305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameterReference_in_attributeRefOrFunctionCall1309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOLLAR_in_referenceOrFunction1318 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_LBRACE_in_referenceOrFunction1320 = new BitSet(new long[]{0x0004460000401770L,0x0400022080090488L});
	public static final BitSet FOLLOW_attributeRefOrFunctionCall_in_referenceOrFunction1322 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_COLON_in_referenceOrFunction1325 = new BitSet(new long[]{0xDFFBB9F3F72C6880L,0x1BFBFDDF4FE6E37DL});
	public static final BitSet FOLLOW_functionCall_in_referenceOrFunction1327 = new BitSet(new long[]{0x0000000000008000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RBRACE_in_referenceOrFunction1331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETER_REFERENCE_START_in_parameterReference1373 = new BitSet(new long[]{0x0000000000001000L,0x0000000080000000L});
	public static final BitSet FOLLOW_singleAttrRef_in_parameterReference1375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_RBRACE_in_parameterReference1377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_referenceOrFunction_in_expression1397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_query1405 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_query1407 = new BitSet(new long[]{0x0000000000000002L});
}
