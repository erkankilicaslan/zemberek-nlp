// Generated from /home/ahmetaa/projects/zemberek-nlp/tokenization/src/main/resources/tokenizer/TurkishLexer.g4 by ANTLR 4.5.3
package zemberek.tokenizer.antlr;

import com.google.common.base.Charsets;
import com.google.common.collect.Sets;
import com.google.common.io.Resources;

import java.io.IOException;
import java.util.Set;
import java.util.Locale;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TurkishLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Abbreviation=1, SpaceTab=2, NewLine=3, PercentNumeral=4, Number=5, TimeHours=6, 
		RomanNumeral=7, AbbreviationWithDots=8, TurkishWord=9, TurkishWordWithApos=10, 
		Punctuation=11, UnknownWord=12, Unknown=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Digit", "TurkishLetters", "TurkishLettersCapital", "TurkishLettersAll", 
		"AllTurkishAlphanumerical", "AposAndSuffix", "SpaceTab", "NewLine", "PercentNumeral", 
		"Number", "Integer", "Exp", "TimeHours", "RomanNumeral", "AbbreviationWithDots", 
		"TurkishWord", "TurkishWordWithApos", "Punctuation", "UnknownWord", "Unknown"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Abbreviation", "SpaceTab", "NewLine", "PercentNumeral", "Number", 
		"TimeHours", "RomanNumeral", "AbbreviationWithDots", "TurkishWord", "TurkishWordWithApos", 
		"Punctuation", "UnknownWord", "Unknown"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	private static Set<String> abbreviations = Sets.newHashSet();
	private java.util.Queue<Token> queue = new java.util.LinkedList<Token>();
	private static Locale localeTr = new Locale("tr");

	static {
	    try {
	        for(String line: Resources.readLines(Resources.getResource("tokenizer/abbreviations.txt"),Charsets.UTF_8)) {
	            final int abbrEndIndex = line.indexOf(":");
	            if (abbrEndIndex > 0) {
	                final String abbr = line.substring(0, abbrEndIndex);
	                if (abbr.endsWith(".")) {
	                    abbreviations.add(abbr);
	                    abbreviations.add(abbr.toLowerCase(Locale.ENGLISH));
	                    abbreviations.add(abbr.toLowerCase(localeTr));
	                }
	            }
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public Token nextToken() {

	    if(!queue.isEmpty()) {
	      return queue.poll();
	    }

	    Token next = super.nextToken();

	    if(next.getType() != TurkishWord) {
	      return next;
	    }

	    StringBuilder builder = new StringBuilder(next.getText());

	    Token next2 = super.nextToken();
	    if (next2.getType() == Punctuation && next2.getText().equals(".")) {
	      builder.append('.');
	      String abbrev = builder.toString();
	      if (abbreviations!= null && abbreviations.contains(abbrev)) {
			  CommonToken commonToken = new CommonToken(Abbreviation, abbrev);
			  commonToken.setStartIndex(next.getStartIndex());
			  commonToken.setStopIndex(next2.getStopIndex());
			  commonToken.setTokenIndex(next.getTokenIndex());
			  commonToken.setCharPositionInLine(next.getCharPositionInLine());
			  commonToken.setLine(next.getLine());
			  return commonToken;
	      }
	    }
	    queue.offer(next2);
	    return next;
	}



	public TurkishLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TurkishLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17\u00e1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\6\78\n\7\r\7\16\79\3\b\6\b=\n\b\r\b\16\b>\3\t\6\tB\n\t"+
		"\r\t\16\tC\3\n\3\n\3\n\3\13\5\13J\n\13\3\13\3\13\3\13\3\13\5\13P\n\13"+
		"\3\13\5\13S\n\13\3\13\5\13V\n\13\3\13\3\13\3\13\5\13[\n\13\3\13\5\13^"+
		"\n\13\3\13\3\13\5\13b\n\13\3\13\3\13\3\13\6\13g\n\13\r\13\16\13h\3\13"+
		"\3\13\5\13m\n\13\3\13\3\13\3\13\6\13r\n\13\r\13\16\13s\3\13\3\13\5\13"+
		"x\n\13\3\13\3\13\5\13|\n\13\3\13\5\13\177\n\13\5\13\u0081\n\13\3\f\6\f"+
		"\u0084\n\f\r\f\16\f\u0085\3\r\3\r\5\r\u008a\n\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0094\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00aa"+
		"\n\17\3\17\5\17\u00ad\n\17\3\17\5\17\u00b0\n\17\3\20\3\20\3\20\6\20\u00b5"+
		"\n\20\r\20\16\20\u00b6\3\20\5\20\u00ba\n\20\3\20\5\20\u00bd\n\20\3\21"+
		"\6\21\u00c0\n\21\r\21\16\21\u00c1\3\22\6\22\u00c5\n\22\r\22\16\22\u00c6"+
		"\3\22\5\22\u00ca\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00d6\n\23\3\24\6\24\u00d9\n\24\r\24\16\24\u00da\3\25\6\25\u00de"+
		"\n\25\r\25\16\25\u00df\3\u00df\2\26\3\2\5\2\7\2\t\2\13\2\r\2\17\4\21\5"+
		"\23\6\25\7\27\2\31\2\33\b\35\t\37\n!\13#\f%\r\'\16)\17\3\2\20\3\2\62;"+
		"\13\2c|\u00e4\u00e4\u00e9\u00e9\u00f0\u00f0\u00f8\u00f8\u00fd\u00fe\u0121"+
		"\u0121\u0133\u0133\u0161\u0161\13\2C\\\u00c4\u00c4\u00c9\u00c9\u00d0\u00d0"+
		"\u00d8\u00d8\u00dd\u00de\u0120\u0120\u0132\u0132\u0160\u0160\21\2C\\c"+
		"|\u00c4\u00c4\u00c9\u00c9\u00d0\u00d0\u00d8\u00d8\u00dd\u00de\u00e4\u00e4"+
		"\u00e9\u00e9\u00f0\u00f0\u00f8\u00f8\u00fd\u00fe\u0120\u0121\u0132\u0133"+
		"\u0160\u0161\23\2//\62;C\\c|\u00c4\u00c4\u00c9\u00c9\u00d0\u00d0\u00d8"+
		"\u00d8\u00dd\u00de\u00e4\u00e4\u00e9\u00e9\u00f0\u00f0\u00f8\u00f8\u00fd"+
		"\u00fe\u0120\u0121\u0132\u0133\u0160\u0161\4\2\13\13\"\"\4\2\f\f\17\17"+
		"\4\2--//\5\2..\60\60^^\4\2GGgg\3\2\62\64\3\2\62\67\t\2#$&\60<=AB]_}}\177"+
		"\177\13\2\13\13\"$&(*\60<=AB]_}}\177\177\u0105\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3"+
		"\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17<\3\2\2\2"+
		"\21A\3\2\2\2\23E\3\2\2\2\25\u0080\3\2\2\2\27\u0083\3\2\2\2\31\u0087\3"+
		"\2\2\2\33\u008d\3\2\2\2\35\u00a9\3\2\2\2\37\u00b4\3\2\2\2!\u00bf\3\2\2"+
		"\2#\u00c4\3\2\2\2%\u00d5\3\2\2\2\'\u00d8\3\2\2\2)\u00dd\3\2\2\2+,\t\2"+
		"\2\2,\4\3\2\2\2-.\t\3\2\2.\6\3\2\2\2/\60\t\4\2\2\60\b\3\2\2\2\61\62\t"+
		"\5\2\2\62\n\3\2\2\2\63\64\t\6\2\2\64\f\3\2\2\2\65\67\7)\2\2\668\5\t\5"+
		"\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\16\3\2\2\2;=\t\7\2\2"+
		"<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\20\3\2\2\2@B\t\b\2\2A@\3\2\2"+
		"\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\22\3\2\2\2EF\7\'\2\2FG\5\25\13\2G\24"+
		"\3\2\2\2HJ\t\t\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\5\27\f\2LM\t\n\2\2"+
		"MO\5\27\f\2NP\5\31\r\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2QS\5\r\7\2RQ\3\2\2"+
		"\2RS\3\2\2\2S\u0081\3\2\2\2TV\t\t\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX"+
		"\5\27\f\2XZ\5\31\r\2Y[\5\r\7\2ZY\3\2\2\2Z[\3\2\2\2[\u0081\3\2\2\2\\^\t"+
		"\t\2\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_a\5\27\f\2`b\5\r\7\2a`\3\2\2\2a"+
		"b\3\2\2\2b\u0081\3\2\2\2cd\5\27\f\2de\7\60\2\2eg\3\2\2\2fc\3\2\2\2gh\3"+
		"\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jl\5\27\f\2km\5\r\7\2lk\3\2\2\2lm"+
		"\3\2\2\2m\u0081\3\2\2\2no\5\27\f\2op\7.\2\2pr\3\2\2\2qn\3\2\2\2rs\3\2"+
		"\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uw\5\27\f\2vx\5\r\7\2wv\3\2\2\2wx\3"+
		"\2\2\2x\u0081\3\2\2\2y{\5\27\f\2z|\7\60\2\2{z\3\2\2\2{|\3\2\2\2|~\3\2"+
		"\2\2}\177\5\r\7\2~}\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080I\3\2"+
		"\2\2\u0080U\3\2\2\2\u0080]\3\2\2\2\u0080f\3\2\2\2\u0080q\3\2\2\2\u0080"+
		"y\3\2\2\2\u0081\26\3\2\2\2\u0082\u0084\5\3\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\30\3\2\2"+
		"\2\u0087\u0089\t\13\2\2\u0088\u008a\t\t\2\2\u0089\u0088\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\5\27\f\2\u008c\32\3\2\2"+
		"\2\u008d\u008e\t\f\2\2\u008e\u008f\t\2\2\2\u008f\u0090\7<\2\2\u0090\u0091"+
		"\t\r\2\2\u0091\u0093\t\2\2\2\u0092\u0094\5\r\7\2\u0093\u0092\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\34\3\2\2\2\u0095\u00aa\7K\2\2\u0096\u0097\7K\2\2"+
		"\u0097\u00aa\7K\2\2\u0098\u0099\7K\2\2\u0099\u009a\7K\2\2\u009a\u00aa"+
		"\7K\2\2\u009b\u009c\7K\2\2\u009c\u00aa\7X\2\2\u009d\u00aa\7X\2\2\u009e"+
		"\u009f\7X\2\2\u009f\u00aa\7K\2\2\u00a0\u00a1\7X\2\2\u00a1\u00a2\7K\2\2"+
		"\u00a2\u00aa\7K\2\2\u00a3\u00a4\7X\2\2\u00a4\u00a5\7K\2\2\u00a5\u00a6"+
		"\7K\2\2\u00a6\u00aa\7K\2\2\u00a7\u00a8\7K\2\2\u00a8\u00aa\7Z\2\2\u00a9"+
		"\u0095\3\2\2\2\u00a9\u0096\3\2\2\2\u00a9\u0098\3\2\2\2\u00a9\u009b\3\2"+
		"\2\2\u00a9\u009d\3\2\2\2\u00a9\u009e\3\2\2\2\u00a9\u00a0\3\2\2\2\u00a9"+
		"\u00a3\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00ad\7\60"+
		"\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00b0\5\r\7\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\36\3\2\2"+
		"\2\u00b1\u00b2\5\7\4\2\u00b2\u00b3\7\60\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b1\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00ba\5\7\4\2\u00b9\u00b8\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00bd\5\r\7\2\u00bc\u00bb\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd \3\2\2\2\u00be\u00c0\5\t\5\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\"\3\2\2\2\u00c3\u00c5\5\13\6\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2"+
		"\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00ca"+
		"\5\r\7\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca$\3\2\2\2\u00cb"+
		"\u00cc\7\60\2\2\u00cc\u00cd\7\60\2\2\u00cd\u00d6\7\60\2\2\u00ce\u00cf"+
		"\7*\2\2\u00cf\u00d0\7#\2\2\u00d0\u00d6\7+\2\2\u00d1\u00d2\7*\2\2\u00d2"+
		"\u00d3\7A\2\2\u00d3\u00d6\7+\2\2\u00d4\u00d6\t\16\2\2\u00d5\u00cb\3\2"+
		"\2\2\u00d5\u00ce\3\2\2\2\u00d5\u00d1\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"&\3\2\2\2\u00d7\u00d9\n\17\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2"+
		"\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db(\3\2\2\2\u00dc\u00de\13"+
		"\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0*\3\2\2\2#\29>CIORUZ]ahlsw{~\u0080\u0085\u0089\u0093"+
		"\u00a9\u00ac\u00af\u00b6\u00b9\u00bc\u00c1\u00c6\u00c9\u00d5\u00da\u00df"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}