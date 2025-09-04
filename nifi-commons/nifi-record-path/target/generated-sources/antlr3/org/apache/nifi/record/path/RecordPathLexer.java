// $ANTLR 3.5.3 org/apache/nifi/record/path/RecordPathLexer.g

	package org.apache.nifi.record.path;
	import org.apache.nifi.record.path.exception.RecordPathException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class RecordPathLexer extends Lexer {
	public static final int EOF=-1;
	public static final int CHILD_SEPARATOR=4;
	public static final int COMMA=5;
	public static final int CONTAINS=6;
	public static final int CONTAINS_REGEX=7;
	public static final int CURRENT_FIELD=8;
	public static final int DESCENDANT_SEPARATOR=9;
	public static final int ENDS_WITH=10;
	public static final int EQUAL=11;
	public static final int ESC=12;
	public static final int GREATER_THAN=13;
	public static final int GREATER_THAN_EQUAL=14;
	public static final int IDENTIFIER=15;
	public static final int IS_BLANK=16;
	public static final int IS_EMPTY=17;
	public static final int LBRACKET=18;
	public static final int LESS_THAN=19;
	public static final int LESS_THAN_EQUAL=20;
	public static final int LPAREN=21;
	public static final int MATCHES_REGEX=22;
	public static final int NOT=23;
	public static final int NOT_EQUAL=24;
	public static final int NUMBER=25;
	public static final int QUOTE=26;
	public static final int RANGE=27;
	public static final int RBRACKET=28;
	public static final int RPAREN=29;
	public static final int SPACE=30;
	public static final int STARTS_WITH=31;
	public static final int STRING_LITERAL=32;
	public static final int WHITESPACE=33;
	public static final int WILDCARD=34;

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

	    throw new RecordPathException(sb.toString());
	  }

	  public void recover(RecognitionException e) {
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

	    throw new RecordPathException(sb.toString());
	  }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public RecordPathLexer() {} 
	public RecordPathLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public RecordPathLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "org/apache/nifi/record/path/RecordPathLexer.g"; }

	// $ANTLR start "CHILD_SEPARATOR"
	public final void mCHILD_SEPARATOR() throws RecognitionException {
		try {
			int _type = CHILD_SEPARATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:68:17: ( '/' )
			// org/apache/nifi/record/path/RecordPathLexer.g:68:19: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHILD_SEPARATOR"

	// $ANTLR start "DESCENDANT_SEPARATOR"
	public final void mDESCENDANT_SEPARATOR() throws RecognitionException {
		try {
			int _type = DESCENDANT_SEPARATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:69:22: ( '//' )
			// org/apache/nifi/record/path/RecordPathLexer.g:69:24: '//'
			{
			match("//"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DESCENDANT_SEPARATOR"

	// $ANTLR start "LBRACKET"
	public final void mLBRACKET() throws RecognitionException {
		try {
			int _type = LBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:70:10: ( '[' )
			// org/apache/nifi/record/path/RecordPathLexer.g:70:12: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACKET"

	// $ANTLR start "RBRACKET"
	public final void mRBRACKET() throws RecognitionException {
		try {
			int _type = RBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:71:10: ( ']' )
			// org/apache/nifi/record/path/RecordPathLexer.g:71:12: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACKET"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:72:8: ( '(' )
			// org/apache/nifi/record/path/RecordPathLexer.g:72:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:73:8: ( ')' )
			// org/apache/nifi/record/path/RecordPathLexer.g:73:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:74:8: ( ( '-' )? ( '0' .. '9' )+ )
			// org/apache/nifi/record/path/RecordPathLexer.g:74:10: ( '-' )? ( '0' .. '9' )+
			{
			// org/apache/nifi/record/path/RecordPathLexer.g:74:10: ( '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// org/apache/nifi/record/path/RecordPathLexer.g:74:10: '-'
					{
					match('-'); 
					}
					break;

			}

			// org/apache/nifi/record/path/RecordPathLexer.g:74:15: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// org/apache/nifi/record/path/RecordPathLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "QUOTE"
	public final void mQUOTE() throws RecognitionException {
		try {
			int _type = QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:75:7: ( '\\'' )
			// org/apache/nifi/record/path/RecordPathLexer.g:75:9: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTE"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:76:7: ( ',' )
			// org/apache/nifi/record/path/RecordPathLexer.g:76:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "RANGE"
	public final void mRANGE() throws RecognitionException {
		try {
			int _type = RANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:77:7: ( '..' )
			// org/apache/nifi/record/path/RecordPathLexer.g:77:9: '..'
			{
			match(".."); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RANGE"

	// $ANTLR start "CURRENT_FIELD"
	public final void mCURRENT_FIELD() throws RecognitionException {
		try {
			int _type = CURRENT_FIELD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:78:15: ( '.' )
			// org/apache/nifi/record/path/RecordPathLexer.g:78:17: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CURRENT_FIELD"

	// $ANTLR start "WILDCARD"
	public final void mWILDCARD() throws RecognitionException {
		try {
			int _type = WILDCARD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:80:10: ( '*' )
			// org/apache/nifi/record/path/RecordPathLexer.g:80:12: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WILDCARD"

	// $ANTLR start "LESS_THAN"
	public final void mLESS_THAN() throws RecognitionException {
		try {
			int _type = LESS_THAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:85:11: ( '<' )
			// org/apache/nifi/record/path/RecordPathLexer.g:85:13: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS_THAN"

	// $ANTLR start "LESS_THAN_EQUAL"
	public final void mLESS_THAN_EQUAL() throws RecognitionException {
		try {
			int _type = LESS_THAN_EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:86:17: ( '<=' )
			// org/apache/nifi/record/path/RecordPathLexer.g:86:19: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS_THAN_EQUAL"

	// $ANTLR start "GREATER_THAN"
	public final void mGREATER_THAN() throws RecognitionException {
		try {
			int _type = GREATER_THAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:87:14: ( '>' )
			// org/apache/nifi/record/path/RecordPathLexer.g:87:16: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER_THAN"

	// $ANTLR start "GREATER_THAN_EQUAL"
	public final void mGREATER_THAN_EQUAL() throws RecognitionException {
		try {
			int _type = GREATER_THAN_EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:88:20: ( '>=' )
			// org/apache/nifi/record/path/RecordPathLexer.g:88:22: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATER_THAN_EQUAL"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:89:7: ( '=' )
			// org/apache/nifi/record/path/RecordPathLexer.g:89:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "NOT_EQUAL"
	public final void mNOT_EQUAL() throws RecognitionException {
		try {
			int _type = NOT_EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:90:11: ( '!=' )
			// org/apache/nifi/record/path/RecordPathLexer.g:90:13: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT_EQUAL"

	// $ANTLR start "WHITESPACE"
	public final void mWHITESPACE() throws RecognitionException {
		try {
			int _type = WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:93:12: ( ( SPACE )+ )
			// org/apache/nifi/record/path/RecordPathLexer.g:93:14: ( SPACE )+
			{
			// org/apache/nifi/record/path/RecordPathLexer.g:93:14: ( SPACE )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||(LA3_0 >= '\f' && LA3_0 <= '\r')||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// org/apache/nifi/record/path/RecordPathLexer.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITESPACE"

	// $ANTLR start "SPACE"
	public final void mSPACE() throws RecognitionException {
		try {
			// org/apache/nifi/record/path/RecordPathLexer.g:94:16: ( ' ' | '\\t' | '\\n' | '\\r' | '\\u000C' )
			// org/apache/nifi/record/path/RecordPathLexer.g:
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPACE"

	// $ANTLR start "CONTAINS"
	public final void mCONTAINS() throws RecognitionException {
		try {
			int _type = CONTAINS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:98:10: ( 'contains' )
			// org/apache/nifi/record/path/RecordPathLexer.g:98:12: 'contains'
			{
			match("contains"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTAINS"

	// $ANTLR start "CONTAINS_REGEX"
	public final void mCONTAINS_REGEX() throws RecognitionException {
		try {
			int _type = CONTAINS_REGEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:99:16: ( 'containsRegex' )
			// org/apache/nifi/record/path/RecordPathLexer.g:99:18: 'containsRegex'
			{
			match("containsRegex"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTAINS_REGEX"

	// $ANTLR start "ENDS_WITH"
	public final void mENDS_WITH() throws RecognitionException {
		try {
			int _type = ENDS_WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:100:11: ( 'endsWith' )
			// org/apache/nifi/record/path/RecordPathLexer.g:100:13: 'endsWith'
			{
			match("endsWith"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDS_WITH"

	// $ANTLR start "STARTS_WITH"
	public final void mSTARTS_WITH() throws RecognitionException {
		try {
			int _type = STARTS_WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:101:13: ( 'startsWith' )
			// org/apache/nifi/record/path/RecordPathLexer.g:101:15: 'startsWith'
			{
			match("startsWith"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STARTS_WITH"

	// $ANTLR start "IS_BLANK"
	public final void mIS_BLANK() throws RecognitionException {
		try {
			int _type = IS_BLANK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:102:10: ( 'isBlank' )
			// org/apache/nifi/record/path/RecordPathLexer.g:102:12: 'isBlank'
			{
			match("isBlank"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IS_BLANK"

	// $ANTLR start "IS_EMPTY"
	public final void mIS_EMPTY() throws RecognitionException {
		try {
			int _type = IS_EMPTY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:103:10: ( 'isEmpty' )
			// org/apache/nifi/record/path/RecordPathLexer.g:103:12: 'isEmpty'
			{
			match("isEmpty"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IS_EMPTY"

	// $ANTLR start "MATCHES_REGEX"
	public final void mMATCHES_REGEX() throws RecognitionException {
		try {
			int _type = MATCHES_REGEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:104:15: ( 'matchesRegex' )
			// org/apache/nifi/record/path/RecordPathLexer.g:104:17: 'matchesRegex'
			{
			match("matchesRegex"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MATCHES_REGEX"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:105:5: ( 'not' )
			// org/apache/nifi/record/path/RecordPathLexer.g:105:7: 'not'
			{
			match("not"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/nifi/record/path/RecordPathLexer.g:108:12: ( (~ ( '/' | '[' | ']' | '*' | '\"' | '\\'' | ',' | '\\t' | '\\r' | '\\n' | '0' .. '9' | ' ' | '.' | '-' | '=' | '?' | '<' | '>' | '(' | ')' ) (~ ( '/' | '[' | ']' | '*' | '\"' | '\\'' | ',' | '\\t' | '\\r' | '\\n' | '=' | '?' | '<' | '>' | ' ' | '(' | ')' ) )* ) )
			// org/apache/nifi/record/path/RecordPathLexer.g:108:14: (~ ( '/' | '[' | ']' | '*' | '\"' | '\\'' | ',' | '\\t' | '\\r' | '\\n' | '0' .. '9' | ' ' | '.' | '-' | '=' | '?' | '<' | '>' | '(' | ')' ) (~ ( '/' | '[' | ']' | '*' | '\"' | '\\'' | ',' | '\\t' | '\\r' | '\\n' | '=' | '?' | '<' | '>' | ' ' | '(' | ')' ) )* )
			{
			// org/apache/nifi/record/path/RecordPathLexer.g:108:14: (~ ( '/' | '[' | ']' | '*' | '\"' | '\\'' | ',' | '\\t' | '\\r' | '\\n' | '0' .. '9' | ' ' | '.' | '-' | '=' | '?' | '<' | '>' | '(' | ')' ) (~ ( '/' | '[' | ']' | '*' | '\"' | '\\'' | ',' | '\\t' | '\\r' | '\\n' | '=' | '?' | '<' | '>' | ' ' | '(' | ')' ) )* )
			// org/apache/nifi/record/path/RecordPathLexer.g:109:2: ~ ( '/' | '[' | ']' | '*' | '\"' | '\\'' | ',' | '\\t' | '\\r' | '\\n' | '0' .. '9' | ' ' | '.' | '-' | '=' | '?' | '<' | '>' | '(' | ')' ) (~ ( '/' | '[' | ']' | '*' | '\"' | '\\'' | ',' | '\\t' | '\\r' | '\\n' | '=' | '?' | '<' | '>' | ' ' | '(' | ')' ) )*
			{
			if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F')||input.LA(1)=='!'||(input.LA(1) >= '#' && input.LA(1) <= '&')||input.LA(1)=='+'||(input.LA(1) >= ':' && input.LA(1) <= ';')||(input.LA(1) >= '@' && input.LA(1) <= 'Z')||input.LA(1)=='\\'||(input.LA(1) >= '^' && input.LA(1) <= '\uFFFF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// org/apache/nifi/record/path/RecordPathLexer.g:110:2: (~ ( '/' | '[' | ']' | '*' | '\"' | '\\'' | ',' | '\\t' | '\\r' | '\\n' | '=' | '?' | '<' | '>' | ' ' | '(' | ')' ) )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\b')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\u001F')||LA4_0=='!'||(LA4_0 >= '#' && LA4_0 <= '&')||LA4_0=='+'||(LA4_0 >= '-' && LA4_0 <= '.')||(LA4_0 >= '0' && LA4_0 <= ';')||(LA4_0 >= '@' && LA4_0 <= 'Z')||LA4_0=='\\'||(LA4_0 >= '^' && LA4_0 <= '\uFFFF')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// org/apache/nifi/record/path/RecordPathLexer.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F')||input.LA(1)=='!'||(input.LA(1) >= '#' && input.LA(1) <= '&')||input.LA(1)=='+'||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= ';')||(input.LA(1) >= '@' && input.LA(1) <= 'Z')||input.LA(1)=='\\'||(input.LA(1) >= '^' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			CommonToken escaped=null;
			int normal;

			StringBuilder lBuf = new StringBuilder();
			// org/apache/nifi/record/path/RecordPathLexer.g:116:2: ( ( '\"' (escaped= ESC |normal=~ ( '\"' | '\\\\' | '\\n' | '\\r' | '\\t' ) )* '\"' ) | ( '\\'' (escaped= ESC |normal=~ ( '\\'' | '\\\\' | '\\n' | '\\r' | '\\t' ) )* '\\'' ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\"') ) {
				alt7=1;
			}
			else if ( (LA7_0=='\'') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// org/apache/nifi/record/path/RecordPathLexer.g:117:3: ( '\"' (escaped= ESC |normal=~ ( '\"' | '\\\\' | '\\n' | '\\r' | '\\t' ) )* '\"' )
					{
					// org/apache/nifi/record/path/RecordPathLexer.g:117:3: ( '\"' (escaped= ESC |normal=~ ( '\"' | '\\\\' | '\\n' | '\\r' | '\\t' ) )* '\"' )
					// org/apache/nifi/record/path/RecordPathLexer.g:118:4: '\"' (escaped= ESC |normal=~ ( '\"' | '\\\\' | '\\n' | '\\r' | '\\t' ) )* '\"'
					{
					match('\"'); 
					// org/apache/nifi/record/path/RecordPathLexer.g:119:5: (escaped= ESC |normal=~ ( '\"' | '\\\\' | '\\n' | '\\r' | '\\t' ) )*
					loop5:
					while (true) {
						int alt5=3;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='\\') ) {
							alt5=1;
						}
						else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\b')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '[')||(LA5_0 >= ']' && LA5_0 <= '\uFFFF')) ) {
							alt5=2;
						}

						switch (alt5) {
						case 1 :
							// org/apache/nifi/record/path/RecordPathLexer.g:120:6: escaped= ESC
							{
							int escapedStart466 = getCharIndex();
							int escapedStartLine466 = getLine();
							int escapedStartCharPos466 = getCharPositionInLine();
							mESC(); 
							escaped = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, escapedStart466, getCharIndex()-1);
							escaped.setLine(escapedStartLine466);
							escaped.setCharPositionInLine(escapedStartCharPos466);

							lBuf.append(getText());
							}
							break;
						case 2 :
							// org/apache/nifi/record/path/RecordPathLexer.g:121:8: normal=~ ( '\"' | '\\\\' | '\\n' | '\\r' | '\\t' )
							{
							normal= input.LA(1);
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							 lBuf.appendCodePoint(normal);
							}
							break;

						default :
							break loop5;
						}
					}

					match('\"'); 
					}


								setText(lBuf.toString());
							
					}
					break;
				case 2 :
					// org/apache/nifi/record/path/RecordPathLexer.g:129:3: ( '\\'' (escaped= ESC |normal=~ ( '\\'' | '\\\\' | '\\n' | '\\r' | '\\t' ) )* '\\'' )
					{
					// org/apache/nifi/record/path/RecordPathLexer.g:129:3: ( '\\'' (escaped= ESC |normal=~ ( '\\'' | '\\\\' | '\\n' | '\\r' | '\\t' ) )* '\\'' )
					// org/apache/nifi/record/path/RecordPathLexer.g:130:4: '\\'' (escaped= ESC |normal=~ ( '\\'' | '\\\\' | '\\n' | '\\r' | '\\t' ) )* '\\''
					{
					match('\''); 
					// org/apache/nifi/record/path/RecordPathLexer.g:131:5: (escaped= ESC |normal=~ ( '\\'' | '\\\\' | '\\n' | '\\r' | '\\t' ) )*
					loop6:
					while (true) {
						int alt6=3;
						int LA6_0 = input.LA(1);
						if ( (LA6_0=='\\') ) {
							alt6=1;
						}
						else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\b')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '&')||(LA6_0 >= '(' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
							alt6=2;
						}

						switch (alt6) {
						case 1 :
							// org/apache/nifi/record/path/RecordPathLexer.g:132:6: escaped= ESC
							{
							int escapedStart554 = getCharIndex();
							int escapedStartLine554 = getLine();
							int escapedStartCharPos554 = getCharPositionInLine();
							mESC(); 
							escaped = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, escapedStart554, getCharIndex()-1);
							escaped.setLine(escapedStartLine554);
							escaped.setCharPositionInLine(escapedStartCharPos554);

							lBuf.append(getText());
							}
							break;
						case 2 :
							// org/apache/nifi/record/path/RecordPathLexer.g:133:8: normal=~ ( '\\'' | '\\\\' | '\\n' | '\\r' | '\\t' )
							{
							normal= input.LA(1);
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							 lBuf.appendCodePoint(normal);
							}
							break;

						default :
							break loop6;
						}
					}

					match('\''); 
					}


								setText(lBuf.toString());
							
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "ESC"
	public final void mESC() throws RecognitionException {
		try {
			int nextChar;

			// org/apache/nifi/record/path/RecordPathLexer.g:145:2: ( '\\\\' ( '\"' | '\\'' | 'r' | 'n' | 't' | '\\\\' |nextChar=~ ( '\"' | '\\'' | 'r' | 'n' | 't' | '\\\\' ) ) )
			// org/apache/nifi/record/path/RecordPathLexer.g:145:4: '\\\\' ( '\"' | '\\'' | 'r' | 'n' | 't' | '\\\\' |nextChar=~ ( '\"' | '\\'' | 'r' | 'n' | 't' | '\\\\' ) )
			{
			match('\\'); 
			// org/apache/nifi/record/path/RecordPathLexer.g:146:3: ( '\"' | '\\'' | 'r' | 'n' | 't' | '\\\\' |nextChar=~ ( '\"' | '\\'' | 'r' | 'n' | 't' | '\\\\' ) )
			int alt8=7;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='\"') ) {
				alt8=1;
			}
			else if ( (LA8_0=='\'') ) {
				alt8=2;
			}
			else if ( (LA8_0=='r') ) {
				alt8=3;
			}
			else if ( (LA8_0=='n') ) {
				alt8=4;
			}
			else if ( (LA8_0=='t') ) {
				alt8=5;
			}
			else if ( (LA8_0=='\\') ) {
				alt8=6;
			}
			else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '&')||(LA8_0 >= '(' && LA8_0 <= '[')||(LA8_0 >= ']' && LA8_0 <= 'm')||(LA8_0 >= 'o' && LA8_0 <= 'q')||LA8_0=='s'||(LA8_0 >= 'u' && LA8_0 <= '\uFFFF')) ) {
				alt8=7;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// org/apache/nifi/record/path/RecordPathLexer.g:147:5: '\"'
					{
					match('\"'); 
					 setText("\""); 
					}
					break;
				case 2 :
					// org/apache/nifi/record/path/RecordPathLexer.g:148:6: '\\''
					{
					match('\''); 
					 setText("\'"); 
					}
					break;
				case 3 :
					// org/apache/nifi/record/path/RecordPathLexer.g:149:6: 'r'
					{
					match('r'); 
					 setText("\r"); 
					}
					break;
				case 4 :
					// org/apache/nifi/record/path/RecordPathLexer.g:150:6: 'n'
					{
					match('n'); 
					 setText("\n"); 
					}
					break;
				case 5 :
					// org/apache/nifi/record/path/RecordPathLexer.g:151:6: 't'
					{
					match('t'); 
					 setText("\t"); 
					}
					break;
				case 6 :
					// org/apache/nifi/record/path/RecordPathLexer.g:152:6: '\\\\'
					{
					match('\\'); 
					 setText("\\\\"); 
					}
					break;
				case 7 :
					// org/apache/nifi/record/path/RecordPathLexer.g:153:6: nextChar=~ ( '\"' | '\\'' | 'r' | 'n' | 't' | '\\\\' )
					{
					nextChar= input.LA(1);
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= 'm')||(input.LA(1) >= 'o' && input.LA(1) <= 'q')||input.LA(1)=='s'||(input.LA(1) >= 'u' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}

										StringBuilder lBuf = new StringBuilder(); lBuf.append("\\").appendCodePoint(nextChar); setText(lBuf.toString());
									
					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// org/apache/nifi/record/path/RecordPathLexer.g:1:8: ( CHILD_SEPARATOR | DESCENDANT_SEPARATOR | LBRACKET | RBRACKET | LPAREN | RPAREN | NUMBER | QUOTE | COMMA | RANGE | CURRENT_FIELD | WILDCARD | LESS_THAN | LESS_THAN_EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | EQUAL | NOT_EQUAL | WHITESPACE | CONTAINS | CONTAINS_REGEX | ENDS_WITH | STARTS_WITH | IS_BLANK | IS_EMPTY | MATCHES_REGEX | NOT | IDENTIFIER | STRING_LITERAL )
		int alt9=29;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:10: CHILD_SEPARATOR
				{
				mCHILD_SEPARATOR(); 

				}
				break;
			case 2 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:26: DESCENDANT_SEPARATOR
				{
				mDESCENDANT_SEPARATOR(); 

				}
				break;
			case 3 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:47: LBRACKET
				{
				mLBRACKET(); 

				}
				break;
			case 4 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:56: RBRACKET
				{
				mRBRACKET(); 

				}
				break;
			case 5 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:65: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 6 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:72: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 7 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:79: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 8 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:86: QUOTE
				{
				mQUOTE(); 

				}
				break;
			case 9 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:92: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 10 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:98: RANGE
				{
				mRANGE(); 

				}
				break;
			case 11 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:104: CURRENT_FIELD
				{
				mCURRENT_FIELD(); 

				}
				break;
			case 12 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:118: WILDCARD
				{
				mWILDCARD(); 

				}
				break;
			case 13 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:127: LESS_THAN
				{
				mLESS_THAN(); 

				}
				break;
			case 14 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:137: LESS_THAN_EQUAL
				{
				mLESS_THAN_EQUAL(); 

				}
				break;
			case 15 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:153: GREATER_THAN
				{
				mGREATER_THAN(); 

				}
				break;
			case 16 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:166: GREATER_THAN_EQUAL
				{
				mGREATER_THAN_EQUAL(); 

				}
				break;
			case 17 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:185: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 18 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:191: NOT_EQUAL
				{
				mNOT_EQUAL(); 

				}
				break;
			case 19 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:201: WHITESPACE
				{
				mWHITESPACE(); 

				}
				break;
			case 20 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:212: CONTAINS
				{
				mCONTAINS(); 

				}
				break;
			case 21 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:221: CONTAINS_REGEX
				{
				mCONTAINS_REGEX(); 

				}
				break;
			case 22 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:236: ENDS_WITH
				{
				mENDS_WITH(); 

				}
				break;
			case 23 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:246: STARTS_WITH
				{
				mSTARTS_WITH(); 

				}
				break;
			case 24 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:258: IS_BLANK
				{
				mIS_BLANK(); 

				}
				break;
			case 25 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:267: IS_EMPTY
				{
				mIS_EMPTY(); 

				}
				break;
			case 26 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:276: MATCHES_REGEX
				{
				mMATCHES_REGEX(); 

				}
				break;
			case 27 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:290: NOT
				{
				mNOT(); 

				}
				break;
			case 28 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:294: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 29 :
				// org/apache/nifi/record/path/RecordPathLexer.g:1:305: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\1\uffff\1\32\5\uffff\1\33\1\uffff\1\35\1\uffff\1\37\1\41\1\uffff\1\27"+
		"\1\26\6\27\15\uffff\1\26\14\27\1\67\6\27\1\uffff\17\27\1\115\1\116\1\27"+
		"\1\121\1\122\1\27\2\uffff\2\27\2\uffff\3\27\1\131\2\27\1\uffff\2\27\1"+
		"\136\1\137\2\uffff";
	static final String DFA9_eofS =
		"\140\uffff";
	static final String DFA9_minS =
		"\1\0\1\57\5\uffff\1\0\1\uffff\1\56\1\uffff\2\75\1\uffff\1\75\1\0\1\157"+
		"\1\156\1\164\1\163\1\141\1\157\15\uffff\1\0\1\156\1\144\1\141\1\102\3"+
		"\164\1\163\1\162\1\154\1\155\1\143\1\0\1\141\1\127\1\164\1\141\1\160\1"+
		"\150\1\uffff\2\151\1\163\1\156\1\164\1\145\1\156\1\164\1\127\1\153\1\171"+
		"\2\163\1\150\1\151\2\0\1\122\2\0\1\164\2\uffff\2\145\2\uffff\1\150\2\147"+
		"\1\0\2\145\1\uffff\2\170\2\0\2\uffff";
	static final String DFA9_maxS =
		"\1\uffff\1\57\5\uffff\1\uffff\1\uffff\1\56\1\uffff\2\75\1\uffff\1\75\1"+
		"\uffff\1\157\1\156\1\164\1\163\1\141\1\157\15\uffff\1\uffff\1\156\1\144"+
		"\1\141\1\105\3\164\1\163\1\162\1\154\1\155\1\143\1\uffff\1\141\1\127\1"+
		"\164\1\141\1\160\1\150\1\uffff\2\151\1\163\1\156\1\164\1\145\1\156\1\164"+
		"\1\127\1\153\1\171\2\163\1\150\1\151\2\uffff\1\122\2\uffff\1\164\2\uffff"+
		"\2\145\2\uffff\1\150\2\147\1\uffff\2\145\1\uffff\2\170\2\uffff\2\uffff";
	static final String DFA9_acceptS =
		"\2\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\uffff\1\14\2\uffff\1\21\10"+
		"\uffff\1\23\1\34\1\35\1\2\1\1\1\10\1\12\1\13\1\16\1\15\1\20\1\17\1\22"+
		"\24\uffff\1\33\25\uffff\1\30\1\31\2\uffff\1\24\1\26\6\uffff\1\27\4\uffff"+
		"\1\32\1\25";
	static final String DFA9_specialS =
		"\1\3\6\uffff\1\1\7\uffff\1\7\23\uffff\1\6\14\uffff\1\13\26\uffff\1\10"+
		"\1\11\1\uffff\1\0\1\4\12\uffff\1\5\5\uffff\1\12\1\2\2\uffff}>";
	static final String[] DFA9_transitionS = {
			"\11\27\2\26\1\27\1\17\1\26\22\27\1\26\1\16\1\30\4\27\1\7\1\4\1\5\1\12"+
			"\1\27\1\10\1\6\1\11\1\1\12\6\2\27\1\13\1\15\1\14\1\uffff\33\27\1\2\1"+
			"\27\1\3\5\27\1\20\1\27\1\21\3\27\1\23\3\27\1\24\1\25\4\27\1\22\uff8c"+
			"\27",
			"\1\31",
			"",
			"",
			"",
			"",
			"",
			"\11\30\2\uffff\2\30\1\uffff\ufff2\30",
			"",
			"\1\34",
			"",
			"\1\36",
			"\1\40",
			"",
			"\1\42",
			"\11\27\2\uffff\1\27\1\43\1\uffff\22\27\1\uffff\1\27\1\uffff\4\27\4\uffff"+
			"\1\27\1\uffff\2\27\1\uffff\14\27\4\uffff\33\27\1\uffff\1\27\1\uffff\uffa2"+
			"\27",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\11\27\2\uffff\1\27\1\43\1\uffff\22\27\1\uffff\1\27\1\uffff\4\27\4\uffff"+
			"\1\27\1\uffff\2\27\1\uffff\14\27\4\uffff\33\27\1\uffff\1\27\1\uffff\uffa2"+
			"\27",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55\2\uffff\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\11\27\2\uffff\2\27\1\uffff\22\27\1\uffff\1\27\1\uffff\4\27\4\uffff"+
			"\1\27\1\uffff\2\27\1\uffff\14\27\4\uffff\33\27\1\uffff\1\27\1\uffff\uffa2"+
			"\27",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\11\27\2\uffff\2\27\1\uffff\22\27\1\uffff\1\27\1\uffff\4\27\4\uffff"+
			"\1\27\1\uffff\2\27\1\uffff\14\27\4\uffff\33\27\1\uffff\1\27\1\uffff\uffa2"+
			"\27",
			"\11\27\2\uffff\2\27\1\uffff\22\27\1\uffff\1\27\1\uffff\4\27\4\uffff"+
			"\1\27\1\uffff\2\27\1\uffff\14\27\4\uffff\33\27\1\uffff\1\27\1\uffff\uffa2"+
			"\27",
			"\1\117",
			"\11\27\2\uffff\2\27\1\uffff\22\27\1\uffff\1\27\1\uffff\4\27\4\uffff"+
			"\1\27\1\uffff\2\27\1\uffff\14\27\4\uffff\22\27\1\120\10\27\1\uffff\1"+
			"\27\1\uffff\uffa2\27",
			"\11\27\2\uffff\2\27\1\uffff\22\27\1\uffff\1\27\1\uffff\4\27\4\uffff"+
			"\1\27\1\uffff\2\27\1\uffff\14\27\4\uffff\33\27\1\uffff\1\27\1\uffff\uffa2"+
			"\27",
			"\1\123",
			"",
			"",
			"\1\124",
			"\1\125",
			"",
			"",
			"\1\126",
			"\1\127",
			"\1\130",
			"\11\27\2\uffff\2\27\1\uffff\22\27\1\uffff\1\27\1\uffff\4\27\4\uffff"+
			"\1\27\1\uffff\2\27\1\uffff\14\27\4\uffff\33\27\1\uffff\1\27\1\uffff\uffa2"+
			"\27",
			"\1\132",
			"\1\133",
			"",
			"\1\134",
			"\1\135",
			"\11\27\2\uffff\2\27\1\uffff\22\27\1\uffff\1\27\1\uffff\4\27\4\uffff"+
			"\1\27\1\uffff\2\27\1\uffff\14\27\4\uffff\33\27\1\uffff\1\27\1\uffff\uffa2"+
			"\27",
			"\11\27\2\uffff\2\27\1\uffff\22\27\1\uffff\1\27\1\uffff\4\27\4\uffff"+
			"\1\27\1\uffff\2\27\1\uffff\14\27\4\uffff\33\27\1\uffff\1\27\1\uffff\uffa2"+
			"\27",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( CHILD_SEPARATOR | DESCENDANT_SEPARATOR | LBRACKET | RBRACKET | LPAREN | RPAREN | NUMBER | QUOTE | COMMA | RANGE | CURRENT_FIELD | WILDCARD | LESS_THAN | LESS_THAN_EQUAL | GREATER_THAN | GREATER_THAN_EQUAL | EQUAL | NOT_EQUAL | WHITESPACE | CONTAINS | CONTAINS_REGEX | ENDS_WITH | STARTS_WITH | IS_BLANK | IS_EMPTY | MATCHES_REGEX | NOT | IDENTIFIER | STRING_LITERAL );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA9_74 = input.LA(1);
						s = -1;
						if ( (LA9_74=='R') ) {s = 80;}
						else if ( ((LA9_74 >= '\u0000' && LA9_74 <= '\b')||(LA9_74 >= '\u000B' && LA9_74 <= '\f')||(LA9_74 >= '\u000E' && LA9_74 <= '\u001F')||LA9_74=='!'||(LA9_74 >= '#' && LA9_74 <= '&')||LA9_74=='+'||(LA9_74 >= '-' && LA9_74 <= '.')||(LA9_74 >= '0' && LA9_74 <= ';')||(LA9_74 >= '@' && LA9_74 <= 'Q')||(LA9_74 >= 'S' && LA9_74 <= 'Z')||LA9_74=='\\'||(LA9_74 >= '^' && LA9_74 <= '\uFFFF')) ) {s = 23;}
						else s = 81;
						if ( s>=0 ) return s;
						break;
					case 1 : 
						int LA9_7 = input.LA(1);
						s = -1;
						if ( ((LA9_7 >= '\u0000' && LA9_7 <= '\b')||(LA9_7 >= '\u000B' && LA9_7 <= '\f')||(LA9_7 >= '\u000E' && LA9_7 <= '\uFFFF')) ) {s = 24;}
						else s = 27;
						if ( s>=0 ) return s;
						break;
					case 2 : 
						int LA9_93 = input.LA(1);
						s = -1;
						if ( ((LA9_93 >= '\u0000' && LA9_93 <= '\b')||(LA9_93 >= '\u000B' && LA9_93 <= '\f')||(LA9_93 >= '\u000E' && LA9_93 <= '\u001F')||LA9_93=='!'||(LA9_93 >= '#' && LA9_93 <= '&')||LA9_93=='+'||(LA9_93 >= '-' && LA9_93 <= '.')||(LA9_93 >= '0' && LA9_93 <= ';')||(LA9_93 >= '@' && LA9_93 <= 'Z')||LA9_93=='\\'||(LA9_93 >= '^' && LA9_93 <= '\uFFFF')) ) {s = 23;}
						else s = 95;
						if ( s>=0 ) return s;
						break;
					case 3 : 
						int LA9_0 = input.LA(1);
						s = -1;
						if ( (LA9_0=='/') ) {s = 1;}
						else if ( (LA9_0=='[') ) {s = 2;}
						else if ( (LA9_0==']') ) {s = 3;}
						else if ( (LA9_0=='(') ) {s = 4;}
						else if ( (LA9_0==')') ) {s = 5;}
						else if ( (LA9_0=='-'||(LA9_0 >= '0' && LA9_0 <= '9')) ) {s = 6;}
						else if ( (LA9_0=='\'') ) {s = 7;}
						else if ( (LA9_0==',') ) {s = 8;}
						else if ( (LA9_0=='.') ) {s = 9;}
						else if ( (LA9_0=='*') ) {s = 10;}
						else if ( (LA9_0=='<') ) {s = 11;}
						else if ( (LA9_0=='>') ) {s = 12;}
						else if ( (LA9_0=='=') ) {s = 13;}
						else if ( (LA9_0=='!') ) {s = 14;}
						else if ( (LA9_0=='\f') ) {s = 15;}
						else if ( (LA9_0=='c') ) {s = 16;}
						else if ( (LA9_0=='e') ) {s = 17;}
						else if ( (LA9_0=='s') ) {s = 18;}
						else if ( (LA9_0=='i') ) {s = 19;}
						else if ( (LA9_0=='m') ) {s = 20;}
						else if ( (LA9_0=='n') ) {s = 21;}
						else if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||LA9_0=='\r'||LA9_0==' ') ) {s = 22;}
						else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\b')||LA9_0=='\u000B'||(LA9_0 >= '\u000E' && LA9_0 <= '\u001F')||(LA9_0 >= '#' && LA9_0 <= '&')||LA9_0=='+'||(LA9_0 >= ':' && LA9_0 <= ';')||(LA9_0 >= '@' && LA9_0 <= 'Z')||LA9_0=='\\'||(LA9_0 >= '^' && LA9_0 <= 'b')||LA9_0=='d'||(LA9_0 >= 'f' && LA9_0 <= 'h')||(LA9_0 >= 'j' && LA9_0 <= 'l')||(LA9_0 >= 'o' && LA9_0 <= 'r')||(LA9_0 >= 't' && LA9_0 <= '\uFFFF')) ) {s = 23;}
						else if ( (LA9_0=='\"') ) {s = 24;}
						if ( s>=0 ) return s;
						break;
					case 4 : 
						int LA9_75 = input.LA(1);
						s = -1;
						if ( ((LA9_75 >= '\u0000' && LA9_75 <= '\b')||(LA9_75 >= '\u000B' && LA9_75 <= '\f')||(LA9_75 >= '\u000E' && LA9_75 <= '\u001F')||LA9_75=='!'||(LA9_75 >= '#' && LA9_75 <= '&')||LA9_75=='+'||(LA9_75 >= '-' && LA9_75 <= '.')||(LA9_75 >= '0' && LA9_75 <= ';')||(LA9_75 >= '@' && LA9_75 <= 'Z')||LA9_75=='\\'||(LA9_75 >= '^' && LA9_75 <= '\uFFFF')) ) {s = 23;}
						else s = 82;
						if ( s>=0 ) return s;
						break;
					case 5 : 
						int LA9_86 = input.LA(1);
						s = -1;
						if ( ((LA9_86 >= '\u0000' && LA9_86 <= '\b')||(LA9_86 >= '\u000B' && LA9_86 <= '\f')||(LA9_86 >= '\u000E' && LA9_86 <= '\u001F')||LA9_86=='!'||(LA9_86 >= '#' && LA9_86 <= '&')||LA9_86=='+'||(LA9_86 >= '-' && LA9_86 <= '.')||(LA9_86 >= '0' && LA9_86 <= ';')||(LA9_86 >= '@' && LA9_86 <= 'Z')||LA9_86=='\\'||(LA9_86 >= '^' && LA9_86 <= '\uFFFF')) ) {s = 23;}
						else s = 89;
						if ( s>=0 ) return s;
						break;
					case 6 : 
						int LA9_35 = input.LA(1);
						s = -1;
						if ( (LA9_35=='\f') ) {s = 35;}
						else if ( ((LA9_35 >= '\u0000' && LA9_35 <= '\b')||LA9_35=='\u000B'||(LA9_35 >= '\u000E' && LA9_35 <= '\u001F')||LA9_35=='!'||(LA9_35 >= '#' && LA9_35 <= '&')||LA9_35=='+'||(LA9_35 >= '-' && LA9_35 <= '.')||(LA9_35 >= '0' && LA9_35 <= ';')||(LA9_35 >= '@' && LA9_35 <= 'Z')||LA9_35=='\\'||(LA9_35 >= '^' && LA9_35 <= '\uFFFF')) ) {s = 23;}
						else s = 22;
						if ( s>=0 ) return s;
						break;
					case 7 : 
						int LA9_15 = input.LA(1);
						s = -1;
						if ( (LA9_15=='\f') ) {s = 35;}
						else if ( ((LA9_15 >= '\u0000' && LA9_15 <= '\b')||LA9_15=='\u000B'||(LA9_15 >= '\u000E' && LA9_15 <= '\u001F')||LA9_15=='!'||(LA9_15 >= '#' && LA9_15 <= '&')||LA9_15=='+'||(LA9_15 >= '-' && LA9_15 <= '.')||(LA9_15 >= '0' && LA9_15 <= ';')||(LA9_15 >= '@' && LA9_15 <= 'Z')||LA9_15=='\\'||(LA9_15 >= '^' && LA9_15 <= '\uFFFF')) ) {s = 23;}
						else s = 22;
						if ( s>=0 ) return s;
						break;
					case 8 : 
						int LA9_71 = input.LA(1);
						s = -1;
						if ( ((LA9_71 >= '\u0000' && LA9_71 <= '\b')||(LA9_71 >= '\u000B' && LA9_71 <= '\f')||(LA9_71 >= '\u000E' && LA9_71 <= '\u001F')||LA9_71=='!'||(LA9_71 >= '#' && LA9_71 <= '&')||LA9_71=='+'||(LA9_71 >= '-' && LA9_71 <= '.')||(LA9_71 >= '0' && LA9_71 <= ';')||(LA9_71 >= '@' && LA9_71 <= 'Z')||LA9_71=='\\'||(LA9_71 >= '^' && LA9_71 <= '\uFFFF')) ) {s = 23;}
						else s = 77;
						if ( s>=0 ) return s;
						break;
					case 9 : 
						int LA9_72 = input.LA(1);
						s = -1;
						if ( ((LA9_72 >= '\u0000' && LA9_72 <= '\b')||(LA9_72 >= '\u000B' && LA9_72 <= '\f')||(LA9_72 >= '\u000E' && LA9_72 <= '\u001F')||LA9_72=='!'||(LA9_72 >= '#' && LA9_72 <= '&')||LA9_72=='+'||(LA9_72 >= '-' && LA9_72 <= '.')||(LA9_72 >= '0' && LA9_72 <= ';')||(LA9_72 >= '@' && LA9_72 <= 'Z')||LA9_72=='\\'||(LA9_72 >= '^' && LA9_72 <= '\uFFFF')) ) {s = 23;}
						else s = 78;
						if ( s>=0 ) return s;
						break;
					case 10 : 
						int LA9_92 = input.LA(1);
						s = -1;
						if ( ((LA9_92 >= '\u0000' && LA9_92 <= '\b')||(LA9_92 >= '\u000B' && LA9_92 <= '\f')||(LA9_92 >= '\u000E' && LA9_92 <= '\u001F')||LA9_92=='!'||(LA9_92 >= '#' && LA9_92 <= '&')||LA9_92=='+'||(LA9_92 >= '-' && LA9_92 <= '.')||(LA9_92 >= '0' && LA9_92 <= ';')||(LA9_92 >= '@' && LA9_92 <= 'Z')||LA9_92=='\\'||(LA9_92 >= '^' && LA9_92 <= '\uFFFF')) ) {s = 23;}
						else s = 94;
						if ( s>=0 ) return s;
						break;
					case 11 : 
						int LA9_48 = input.LA(1);
						s = -1;
						if ( ((LA9_48 >= '\u0000' && LA9_48 <= '\b')||(LA9_48 >= '\u000B' && LA9_48 <= '\f')||(LA9_48 >= '\u000E' && LA9_48 <= '\u001F')||LA9_48=='!'||(LA9_48 >= '#' && LA9_48 <= '&')||LA9_48=='+'||(LA9_48 >= '-' && LA9_48 <= '.')||(LA9_48 >= '0' && LA9_48 <= ';')||(LA9_48 >= '@' && LA9_48 <= 'Z')||LA9_48=='\\'||(LA9_48 >= '^' && LA9_48 <= '\uFFFF')) ) {s = 23;}
						else s = 55;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 9, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
