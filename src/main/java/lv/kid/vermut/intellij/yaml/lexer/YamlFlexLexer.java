/* The following code was generated by JFlex 1.4.3 on 1/3/16 1:57 AM */

package lv.kid.vermut.intellij.yaml.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import java.util.Stack;

import static lv.kid.vermut.intellij.yaml.lexer.YamlTokenTypes.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 1/3/16 1:57 AM from the specification file
 * <tt>C:/Users/VermutMac/IdeaProjects/intellij-ansible/src/main/java/lv/kid/vermut/intellij/yaml/lexer/yaml.flex</tt>
 */
public class YamlFlexLexer implements FlexLexer {
  /**
   * initial size of the lookahead buffer
   */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int IN_BLOCK_SCALAR = 8;
  public static final int YYINITIAL = 0;
  public static final int IN_DOUBLE_QUOTE_SCALAR = 4;
  public static final int IN_SINGLE_QUOTE_SCALAR = 2;
  public static final int IN_PLAIN_SCALAR = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
          0, 1, 2, 2, 3, 3, 4,  5,  6, 7
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED =
          "\1\15\10\0\1\6\1\2\2\11\1\10\22\0\1\6\1\27\1\32" +
                  "\1\1\1\0\1\5\1\26\1\31\2\0\1\25\1\13\1\22\1\3" +
                  "\1\4\1\0\12\12\1\24\3\0\1\30\1\23\1\7\32\0\1\16" +
                  "\1\33\1\17\2\0\1\7\32\0\1\20\1\30\1\21\7\0\1\14" +
                  "\u05da\0\12\12\206\0\12\12\306\0\12\12\u019c\0\12\12\166\0\12\12" +
                  "\166\0\12\12\166\0\12\12\166\0\12\12\166\0\12\12\166\0\12\12" +
                  "\166\0\12\12\166\0\12\12\340\0\12\12\166\0\12\12\106\0\12\12" +
                  "\u0116\0\12\12\106\0\12\12\u0746\0\12\12\46\0\12\12\u012c\0\12\12" +
                  "\200\0\12\12\246\0\12\12\6\0\12\12\266\0\12\12\126\0\12\12" +
                  "\206\0\12\12\6\0\12\12\u03ce\0\2\14\u85f6\0\12\12\u02a6\0\12\12" +
                  "\46\0\12\12\306\0\12\12\166\0\12\12\u0196\0\12\12\u5316\0\12\12" +
                  "\346\0";

  /** 
   * Translates characters to character classes
   */
  private static final char[] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int[] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
          "\2\1\3\0\1\2\1\0\1\3\1\4\1\5\1\1" +
                  "\1\5\1\4\1\5\1\6\1\7\1\10\1\11\1\12" +
                  "\1\13\1\14\1\15\4\5\1\16\1\17\1\5\2\20" +
                  "\2\21\1\20\3\22\1\23\1\22\1\24\1\2\1\24" +
                  "\1\25\1\3\1\25\1\0\2\26\2\27\1\30\1\0" +
                  "\1\14\1\15\1\31\1\32\2\0\1\33\1\0\1\33" +
                  "\2\0\2\34\1\35\1\0\1\36\1\37\1\40\2\0" +
                  "\2\33";

  private static int[] zzUnpackAction() {
    int[] result = new int[74];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int[] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int[] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
          "\0\0\0\34\0\70\0\124\0\160\0\214\0\250\0\304" +
                  "\0\340\0\374\0\u0118\0\u0134\0\u0150\0\340\0\u016c\0\u0188" +
                  "\0\u01a4\0\u01c0\0\u01dc\0\u01f8\0\u0214\0\u0230\0\u024c\0\u0268" +
                  "\0\u0284\0\u02a0\0\340\0\340\0\u02bc\0\340\0\u02d8\0\u02f4" +
                  "\0\340\0\u0310\0\340\0\u032c\0\u0348\0\340\0\u0364\0\340" +
                  "\0\u0380\0\u039c\0\340\0\u03b8\0\u03d4\0\374\0\340\0\374" +
                  "\0\340\0\u03f0\0\u040c\0\u0428\0\u0444\0\u0460\0\u024c\0\u0268" +
                  "\0\u047c\0\u0498\0\340\0\u04b4\0\u04d0\0\u04ec\0\u02bc\0\340" +
                  "\0\u02bc\0\340\0\u032c\0\u0364\0\340\0\u047c\0\u0508\0\u0524" +
                  "\0\u0508\0\u0524";

  private static int[] zzUnpackRowMap() {
    int[] result = new int[74];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int[] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int[] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
          "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\16" +
                  "\6\11\1\20\1\21\1\22\1\23\1\24\1\25\1\26" +
                  "\1\27\1\30\1\31\1\32\1\33\1\34\2\11\1\12" +
                  "\1\13\1\14\1\15\1\35\1\17\1\16\6\11\1\20" +
                  "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30" +
                  "\1\31\1\32\1\33\1\34\1\11\10\36\1\37\20\36" +
                  "\1\40\12\36\1\37\21\36\1\41\1\42\6\43\1\44" +
                  "\1\43\1\45\5\43\5\46\1\43\1\47\11\43\1\50" +
                  "\3\43\1\51\1\43\1\52\1\50\2\43\1\50\1\43" +
                  "\5\46\1\43\1\47\7\43\10\36\1\37\25\36\1\53" +
                  "\3\36\1\54\1\36\1\55\1\53\2\36\1\53\17\36" +
                  "\34\0\2\56\1\57\5\56\2\60\2\56\1\60\17\56" +
                  "\6\0\1\13\25\0\3\61\1\62\2\61\1\63\25\61" +
                  "\4\0\1\64\35\0\1\17\33\0\1\20\33\0\1\21" +
                  "\33\0\1\22\33\0\1\23\33\0\1\24\25\0\2\61" +
                  "\1\65\3\61\1\65\1\61\1\65\3\61\2\65\20\61" +
                  "\1\66\3\61\1\66\1\61\1\66\3\61\2\66\16\61" +
                  "\2\67\1\0\3\67\1\0\1\67\1\0\23\67\2\70" +
                  "\1\0\3\70\1\0\1\70\1\0\23\70\27\0\1\71" +
                  "\5\0\1\72\1\73\1\74\2\0\1\74\1\0\1\75" +
                  "\1\73\1\76\1\74\1\73\17\0\2\77\1\100\5\77" +
                  "\2\101\2\77\1\101\17\77\2\0\1\36\62\0\1\36" +
                  "\34\0\1\36\2\0\1\102\4\0\1\103\27\0\1\43" +
                  "\37\0\1\104\26\0\1\102\1\50\3\0\1\51\1\0" +
                  "\1\52\1\50\2\0\1\50\21\0\1\50\33\0\1\53" +
                  "\3\0\1\54\1\0\1\55\1\53\2\0\1\53\21\0" +
                  "\1\53\34\0\1\105\36\0\1\63\31\0\1\105\31\0" +
                  "\1\65\3\0\1\65\1\0\1\65\3\0\2\65\20\0" +
                  "\1\66\3\0\1\66\1\0\1\66\3\0\2\66\16\0" +
                  "\2\106\1\0\3\106\1\0\1\106\1\0\23\106\2\72" +
                  "\1\107\5\72\2\110\2\72\1\110\17\72\1\0\1\72" +
                  "\1\73\3\0\1\74\1\0\1\75\1\73\2\0\1\73" +
                  "\21\0\1\73\32\0\1\72\1\73\1\74\2\0\1\74" +
                  "\1\0\1\75\1\73\1\0\1\74\1\73\21\0\1\73" +
                  "\5\0\1\75\1\73\2\0\1\73\17\0\2\72\1\111" +
                  "\5\72\2\112\2\72\1\112\17\72";

  private static int[] zzUnpackTrans() {
    int[] result = new int[1344];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int[] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
          "Unkown internal scanner error",
          "Error: could not match input",
          "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
          "\2\1\3\0\1\1\1\0\1\1\1\11\4\1\1\11" +
                  "\14\1\2\11\1\1\1\11\2\1\1\11\1\1\1\11" +
                  "\2\1\1\11\1\1\1\11\2\1\1\11\2\1\1\0" +
                  "\1\11\1\1\1\11\2\1\1\0\4\1\2\0\1\11" +
                  "\1\0\1\1\2\0\1\11\1\1\1\11\1\0\1\1" +
                  "\1\11\1\1\2\0\2\1";

  private static int[] zzUnpackAttribute() {
    int[] result = new int[74];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int[] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
   the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
   from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
    private int yycolumn = 0;
    private int a = 0;
  private Stack<Integer> stack = new Stack<Integer>();

	private void retryInState(int newState) {
        yybegin(newState);
      yypushback(yylength());
    }

  // TODO stack is not needed
  private void yypushState(int newState) {
    stack.push(yystate());
    yybegin(newState);
  }

  private void yypopState() {
    yybegin(stack.pop());
  }

  private void yypopBackState() {
    yybegin(stack.pop());
      yypushback(yylength());
    }

    // The current indentation level.
    private int indent = -1;

  // The number of unclosed '{' and '['. `flow_level == 0` means block
  // context.
  private int flowLevel = 0;

  // Past indentation levels.
  private Stack<Integer> indents = new Stack<Integer>();

    private boolean addIndent(int column) {
        if (this.indent < column) {
            this.indents.push(this.indent);
            this.indent = column;
          return true;
        }
      return false;
    }

  private void unwindIndent(int col) {
    // In the flow context, indentation is ignored. We make the scanner less
    // restrictive then specification requires.
    if (this.flowLevel != 0) {
      return;
    }

    while (this.indent > col) {
      this.indent = this.indents.pop();
        }
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public YamlFlexLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return the unpacked character translation table
   */
  private static char[] zzUnpackCMap(String packed) {
    char[] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 222) {
      int count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead + pos] : zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos -zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number) {
    if (number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return the next token
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char[] zzCMapL = ZZ_CMAP;

    int[] zzTransL = ZZ_TRANS;
    int[] zzRowMapL = ZZ_ROWMAP;
    int[] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
           zzCurrentPosL++) {
        switch ((zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL] : zzBufferL.charAt(zzCurrentPosL))) {
          case '\u000B':
          case '\u000C':
          case '\u0085':
          case '\u2028':
          case '\u2029':
            yycolumn = 0;
            zzR = false;
            break;
          case '\r':
            yycolumn = 0;
            zzR = true;
            break;
          case '\n':
            if (zzR)
            zzR = false;
            else {
            yycolumn = 0;
            }
            break;
          default:
            zzR = false;
            yycolumn++;
        }
      }

      if (zzMarkedPosL > zzStartRead) {
        switch ((zzBufferArrayL != null ? zzBufferArrayL[zzMarkedPosL - 1] : zzBufferL.charAt(zzMarkedPosL - 1))) {
          case '\n':
          case '\u000B':
          case '\u000C':
          case '\u0085':
          case '\u2028':
          case '\u2029':
            zzAtBOL = true;
            break;
          case '\r':
            if (zzMarkedPosL < zzEndReadL)
              zzAtBOL = (zzBufferArrayL != null ? zzBufferArrayL[zzMarkedPosL] : zzBufferL.charAt(zzMarkedPosL)) != '\n';
            else if (zzAtEOF)
            zzAtBOL = false;
            else {
              boolean eof = zzRefill();
              zzMarkedPosL = zzMarkedPos;
              zzEndReadL = zzEndRead;
              zzBufferL = zzBuffer;
              if (eof)
                zzAtBOL = false;
              else
                zzAtBOL = (zzBufferArrayL != null ? zzBufferArrayL[zzMarkedPosL] : zzBufferL.charAt(zzMarkedPosL)) != '\n';
            }
            break;
          default:
            zzAtBOL = false;
        }
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      if (zzAtBOL)
        zzState = ZZ_LEXSTATE[zzLexicalState+1];
      else
        zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          } else {
            // store back cached positions
            zzCurrentPos = zzCurrentPosL;
            zzMarkedPos = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL = zzCurrentPos;
            zzMarkedPosL = zzMarkedPos;
            zzBufferL = zzBuffer;
            zzEndReadL = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            } else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ((zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ((zzAttributes & 8) == 8) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 20: { a=301;
        }
        case 33:
          break;
        case 32: {
          return YAML_Tag;
        }
        case 34:
          break;
        case 12: { // KEY(flow context): '?'
          if (this.flowLevel != 0) {
            return YAML_Key;
          } else {
            // KEY(block context): '?' (' '|'\n')
            if (yylength() > 1) {
              yypushback(yylength() - 1); // Keep whitespace
              return YAML_Key;
            }
          }
        }
        case 35:
          break;
        case 14: {
          yypushState(IN_SINGLE_QUOTE_SCALAR);
        }
        case 36:
          break;
        case 21: {
          a = 401;
        }
        case 37:
          break;
        case 24: {
          addIndent(yycolumn);
          return YAML_BlockEntry;
        }
        case 38:
          break;
        case 23: {
          a = 102;
          yypushState(IN_PLAIN_SCALAR);
        }
        case 39:
          break;
        case 22: {
          return YAML_Comment;
        }
        case 40:
          break;
        case 27: {
          if (this.flowLevel == 0)
          {
            // Hacky hold the current indent to compare inside IN_BLOCK
            this.indents.push(yycolumn - yylength());
            yypushState(IN_BLOCK_SCALAR);
            return YAML_Scalar;
          }
        }
        case 41:
          break;
        case 8: {
          this.flowLevel--;
          return YAML_FlowSequenceEnd;
        }
        case 42:
          break;
        case 17: {
          yypopState();
          return YAML_Scalar;
        }
        case 43:
          break;
        case 25: {
          return YAML_Alias;
        }
        case 44:
          break;
        case 19: {
          if (this.flowLevel > 0) {
            yypopBackState();
            return YAML_Scalar;
          }
        }
        case 45:
          break;
        case 9: {
          this.flowLevel++;
          return YAML_FlowMappingStart;
        }
        case 46:
          break;
        case 29: {
          a = 308;
          yypopBackState();
          return YAML_Scalar;
        }
        case 47:
          break;
        case 18: {
          a = 303;
          if (yycolumn == 0) { // End of multiline scalar
            yypopBackState();
            return YAML_Scalar;
          }
        }
        case 48:
          break;
        case 7: {
          this.flowLevel++;
          return YAML_FlowSequenceStart;
        }
        case 49:
          break;
        case 1: {
          a = 101;
          unwindIndent(yycolumn);
          return YAML_Whitespace;
        }
        case 50:
          break;
        case 30: {
          a = 306;
          yypopBackState();
          return YAML_Scalar;
        }
        case 51:
          break;
        case 10: {
          this.flowLevel--;
          return YAML_FlowMappingEnd;
        }
        case 52:
          break;
        case 2: {
          a = 302;
          if (yylength() < this.indent || yylength() == 0) { // End of multiline scalar
            yypopBackState();
            return YAML_Scalar;
          }
        }
        case 53:
          break;
        case 3: {
          a = 402;
          if (yylength() < this.indents.peek() || yylength() == 0) { // End of block scalar
            a = 403;
            yypopBackState();
            this.indents.pop();
            return YAML_Scalar;
          }
        }
        case 54:
          break;
        case 11: {
          return YAML_FlowEntry;
        }
        case 55:
          break;
        case 13: { // VALUE(flow context): ':'
          if (this.flowLevel != 0) {
            return YAML_Value;
          } else {
            // VALUE(block context): '?' (' '|'\n')
            if (yylength() > 1) {
              yypushback(yylength() - 1); // Keep whitespace
              return YAML_Value;
            }
          }
        }
        case 56:
          break;
        case 28: {
          unwindIndent(-1);
          return YAML_Directive;
        }
        case 57:
          break;
        case 15: {
          yypushState(IN_DOUBLE_QUOTE_SCALAR);
        }
        case 58:
          break;
        case 5: {
          return YAML_Error;
        }
        case 59:
          break;
        case 31: {
          unwindIndent(-1);
          return YAML_DocumentStart;
        }
        case 60:
          break;
        case 6: {
          a = 100;
          return YAML_Whitespace;
        }
        case 61:
          break;
        case 26: {
          return YAML_Anchor;
        }
        case 62:
          break;
        case 4: {
          a = 101;
          yypushState(IN_PLAIN_SCALAR);
        }
        case 63:
          break;
        case 16: {
        }
        case 64: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            switch (zzLexicalState) {
              case IN_BLOCK_SCALAR: {
                a = 407;
                yypopBackState();
                this.indents.pop();
                return YAML_Scalar;
              }
              case 75:
                break;
              case IN_PLAIN_SCALAR: {
                a = 307;
                yypopBackState();
                return YAML_Scalar;
              }
              case 76:
                break;
              default:
                return null;
            }
          } else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
