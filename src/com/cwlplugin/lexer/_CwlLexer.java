/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package com.cwlplugin.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>Cwl.flex</tt>
 */
class _CwlLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;
  public static final int WAITING_VALUE = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [12, 6, 3]
   * Total runtime size is 14768 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>9]<<6)|((ch>>3)&0x3f)]<<3)|(ch&0x7)];
  }

  /* The ZZ_CMAP_Z table has 2176 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
    "\20\5\21\1\22\1\23\1\24\1\21\14\25\1\26\50\25\1\27\2\25\1\30\1\31\1\32\1\33"+
    "\25\25\1\34\20\21\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\21\1\44\1\45\1\46\1"+
    "\21\1\47\2\21\1\50\4\21\1\25\1\51\1\52\5\21\2\25\1\53\31\21\1\25\1\54\1\21"+
    "\1\55\40\21\1\56\17\21\1\57\1\60\1\61\1\62\13\21\1\63\10\21\123\25\1\64\7"+
    "\25\1\65\1\66\37\21\1\25\1\66\u0582\21\1\67\u017f\21");

  /* The ZZ_CMAP_Y table has 3584 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\0\1\2\1\3\1\4\1\0\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\4\0"+
    "\1\16\1\17\1\20\1\21\2\7\1\22\3\7\1\22\71\7\1\23\1\7\1\24\1\4\1\25\1\26\2"+
    "\4\16\0\1\27\1\16\1\30\1\31\2\7\1\32\11\7\1\33\21\7\1\34\1\35\23\7\1\4\1\6"+
    "\3\7\1\22\1\36\1\6\4\7\1\37\1\40\4\0\1\41\1\42\1\4\3\7\2\43\1\4\1\44\1\45"+
    "\1\0\1\46\5\7\1\47\3\0\1\50\1\51\13\7\1\52\1\41\1\53\1\54\1\0\1\55\1\4\1\56"+
    "\1\57\3\7\3\0\1\60\12\7\1\61\1\0\1\62\1\4\1\0\1\63\3\7\1\47\1\64\1\21\2\7"+
    "\1\61\1\65\1\66\1\67\2\4\3\7\1\70\10\4\1\71\1\25\6\4\1\72\2\0\1\73\1\74\6"+
    "\7\1\75\2\0\1\76\1\7\1\77\1\0\2\6\1\100\1\101\1\102\2\7\1\71\1\103\1\104\1"+
    "\105\1\106\1\56\1\107\1\77\1\0\1\110\1\45\1\100\1\11\1\102\2\7\1\71\1\111"+
    "\1\112\1\113\1\114\1\115\1\116\1\117\1\0\1\120\1\4\1\100\1\33\1\32\2\7\1\71"+
    "\1\121\1\104\1\41\1\122\1\123\1\4\1\77\1\0\1\36\1\4\1\100\1\101\1\102\2\7"+
    "\1\71\1\121\1\104\1\105\1\114\1\117\1\107\1\77\1\0\1\36\1\4\1\124\1\125\1"+
    "\126\1\127\1\130\1\125\1\7\1\131\1\132\1\133\1\134\1\4\1\117\1\0\1\4\1\36"+
    "\1\100\1\27\1\71\2\7\1\71\1\135\1\136\1\137\1\133\1\140\1\24\1\77\1\0\2\4"+
    "\1\141\1\27\1\71\2\7\1\71\1\135\1\104\1\137\1\133\1\140\1\30\1\77\1\0\1\142"+
    "\1\4\1\141\1\27\1\71\4\7\1\143\1\137\1\144\1\56\1\4\1\77\1\0\1\4\1\35\1\141"+
    "\1\7\1\22\1\35\2\7\1\32\1\145\1\22\1\146\1\147\1\0\2\4\1\150\1\4\1\6\5\7\1"+
    "\151\1\152\1\153\1\73\1\0\1\154\4\4\1\155\1\156\1\157\1\6\1\160\1\161\1\151"+
    "\1\162\1\163\1\164\1\0\1\165\4\4\1\123\2\4\1\154\1\0\1\154\1\166\1\167\1\7"+
    "\1\6\3\7\1\25\1\40\1\0\1\137\1\170\1\0\1\40\3\0\1\44\1\171\7\4\5\7\1\47\1"+
    "\0\1\172\1\0\1\154\1\61\1\173\1\174\1\175\1\176\1\7\1\177\1\200\1\0\1\164"+
    "\4\7\1\33\1\20\5\7\1\201\51\7\1\126\1\22\1\126\5\7\1\126\4\7\1\126\1\22\1"+
    "\126\1\7\1\22\7\7\1\126\10\7\1\202\4\4\2\7\2\4\12\7\1\25\1\4\1\6\114\7\1\101"+
    "\2\7\1\6\2\7\1\43\11\7\1\125\1\123\1\4\1\7\1\27\1\203\1\4\2\7\1\203\1\4\2"+
    "\7\1\204\1\4\1\7\1\27\1\205\1\4\6\7\1\206\3\0\1\207\1\210\1\0\1\154\3\4\1"+
    "\211\1\0\1\154\13\7\1\4\5\7\1\212\10\7\1\213\1\4\3\7\1\25\1\0\1\2\1\0\1\2"+
    "\1\117\1\0\3\7\1\213\1\25\1\4\5\7\1\110\2\0\1\51\1\154\1\0\1\154\4\4\2\7\1"+
    "\153\1\2\6\7\1\170\1\73\3\0\1\105\1\0\1\154\1\0\1\154\1\37\13\4\1\214\5\7"+
    "\1\206\1\0\1\214\1\110\1\0\1\154\1\4\1\215\1\2\1\4\1\216\3\7\1\76\1\175\1"+
    "\0\1\63\4\7\1\61\1\0\1\2\1\4\4\7\1\206\2\0\1\4\1\0\1\217\1\0\1\63\3\7\1\213"+
    "\12\4\1\220\2\0\1\221\1\222\1\4\30\7\4\0\1\73\2\4\1\72\42\7\2\213\4\7\2\213"+
    "\1\7\1\223\3\7\1\213\6\7\1\27\1\163\1\224\1\25\1\225\1\110\1\7\1\25\1\224"+
    "\1\25\1\4\1\215\3\4\1\226\1\4\1\37\1\123\1\4\1\227\1\4\1\44\1\230\1\36\1\37"+
    "\2\4\1\7\1\25\3\7\1\43\2\4\1\0\1\44\1\231\1\0\1\232\1\4\1\233\1\35\1\145\1"+
    "\234\1\26\1\235\1\7\1\236\1\237\1\240\2\4\5\7\1\123\116\4\5\7\1\22\5\7\1\22"+
    "\20\7\1\25\1\241\1\242\1\4\4\7\1\33\1\20\7\7\1\37\1\4\1\56\2\7\1\22\1\4\10"+
    "\22\4\0\5\4\1\37\72\4\1\237\3\4\1\6\1\177\1\234\1\25\1\6\11\7\1\22\1\243\1"+
    "\6\12\7\1\201\1\237\4\7\1\213\1\6\12\7\1\22\2\4\3\7\1\43\6\4\170\7\1\213\11"+
    "\4\71\7\1\25\6\4\21\7\1\25\10\4\5\7\1\213\41\7\1\25\2\7\1\0\1\242\2\4\5\7"+
    "\1\153\1\72\1\244\3\7\1\56\12\7\1\154\3\4\1\37\1\7\1\35\14\7\1\245\1\110\1"+
    "\4\1\7\1\43\11\4\1\7\1\246\1\247\2\7\1\47\2\4\1\123\6\7\1\110\1\4\1\63\5\7"+
    "\1\206\1\0\1\44\1\4\1\0\1\154\2\0\1\63\1\45\1\0\1\63\2\7\1\61\1\164\2\7\1"+
    "\153\1\0\1\2\1\4\3\7\1\25\1\74\5\7\1\47\1\0\1\232\1\37\1\0\1\154\4\4\5\7\1"+
    "\76\1\73\1\4\1\247\1\250\1\0\1\154\2\7\1\22\1\251\6\7\1\174\1\252\1\212\2"+
    "\4\1\253\1\7\1\47\1\254\1\4\3\255\1\4\2\22\22\4\4\7\1\47\1\256\1\0\1\154\64"+
    "\7\1\110\1\4\2\7\1\22\1\257\5\7\1\110\40\4\55\7\1\213\15\7\1\24\4\4\1\22\1"+
    "\4\1\257\1\260\1\7\1\71\1\22\1\163\1\261\15\7\1\24\3\4\1\257\54\7\1\213\2"+
    "\4\10\7\1\35\6\7\5\4\1\7\1\25\2\0\2\4\1\73\1\4\1\130\2\4\1\237\3\4\1\36\1"+
    "\27\20\7\1\262\1\227\1\4\1\0\1\154\1\6\2\7\1\11\1\6\2\7\1\43\1\263\12\7\1"+
    "\22\3\35\1\264\1\265\2\4\1\266\1\7\1\135\2\7\1\22\2\7\1\267\1\7\1\213\1\7"+
    "\1\213\4\4\17\7\1\43\10\4\6\7\1\25\20\4\1\270\20\4\3\7\1\25\6\7\1\123\5\4"+
    "\3\7\1\22\2\4\3\7\1\43\6\4\3\7\1\213\4\7\1\110\1\7\1\234\5\4\23\7\1\213\1"+
    "\0\1\154\52\4\1\213\1\71\4\7\1\33\1\271\2\7\1\213\25\4\2\7\1\213\1\4\3\7\1"+
    "\24\10\4\7\7\1\263\10\4\1\272\1\72\1\135\1\6\2\7\1\110\1\113\4\4\3\7\1\25"+
    "\20\4\6\7\1\213\1\4\2\7\1\213\1\4\2\7\1\43\21\4\11\7\1\123\66\4\1\216\6\7"+
    "\1\0\1\73\3\4\1\117\1\0\2\4\1\216\5\7\1\0\1\273\2\4\3\7\1\123\1\0\1\154\1"+
    "\216\3\7\1\153\1\0\1\137\1\0\10\4\1\216\5\7\1\47\1\0\1\274\1\4\1\0\1\154\24"+
    "\4\5\7\1\47\1\0\1\4\1\0\1\154\46\4\55\7\1\22\22\4\14\7\1\43\63\4\5\7\1\22"+
    "\72\4\7\7\1\123\130\4\10\7\1\25\1\4\1\76\4\0\1\73\1\4\1\56\1\216\1\7\14\4"+
    "\1\24\153\4\1\275\1\276\2\0\1\277\1\2\3\4\1\300\22\4\1\301\67\4\12\7\1\27"+
    "\10\7\1\27\1\302\1\303\1\7\1\304\1\135\7\7\1\33\1\305\2\27\3\7\1\306\1\163"+
    "\1\35\1\71\51\7\1\213\3\7\1\71\2\7\1\201\3\7\1\201\2\7\1\27\3\7\1\27\2\7\1"+
    "\22\3\7\1\22\3\7\1\71\3\7\1\71\2\7\1\201\1\307\6\0\1\135\3\7\1\155\1\6\1\201"+
    "\1\310\1\233\1\311\1\155\1\223\1\155\2\201\1\116\1\7\1\32\1\7\1\110\1\312"+
    "\1\32\1\7\1\110\50\4\32\7\1\22\5\4\106\7\1\25\1\4\33\7\1\213\74\4\1\115\3"+
    "\4\14\0\20\4\36\0\2\4");

  /* The ZZ_CMAP_A table has 1624 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\5\1\0\1\2\2\0\1\1\6\5\7\0\1\3\1\4\13\0\2\5\1\26\6\0\25\4\1\22\4\4\4\0"+
    "\1\4\1\0\1\24\1\4\1\17\1\4\1\7\3\4\1\12\2\4\1\21\1\13\1\14\1\23\1\25\1\10"+
    "\1\6\1\16\1\15\1\11\1\4\1\20\3\4\4\0\1\5\2\0\4\4\4\0\1\4\2\0\1\5\7\0\1\4\4"+
    "\0\1\4\5\0\7\4\1\0\2\4\4\0\4\4\6\0\5\4\7\0\1\4\1\0\1\4\1\0\5\4\1\0\2\4\6\0"+
    "\1\4\1\0\3\4\1\0\1\4\1\0\4\4\1\0\13\4\1\0\3\4\1\0\5\5\2\0\6\4\1\0\1\4\15\0"+
    "\1\4\1\0\15\5\1\0\1\5\1\0\2\5\1\0\2\5\1\0\1\5\3\4\5\0\5\5\6\0\1\4\4\0\3\5"+
    "\5\0\3\4\7\5\4\0\2\4\1\5\13\4\1\0\1\4\7\5\2\4\2\5\1\0\4\5\2\4\2\5\3\4\2\0"+
    "\1\4\7\0\1\5\1\4\1\5\6\4\3\5\2\0\11\4\3\5\1\4\6\0\2\5\6\4\4\5\2\4\2\0\2\5"+
    "\1\4\11\5\1\4\3\5\1\4\5\5\2\0\1\4\3\5\4\0\1\4\1\0\6\4\4\0\13\5\1\0\4\5\6\4"+
    "\3\5\1\4\2\5\1\4\7\5\2\4\2\5\2\0\2\5\1\0\3\5\1\0\10\4\2\0\2\4\2\0\6\4\1\0"+
    "\1\4\3\0\4\4\2\0\1\5\1\4\7\5\2\0\2\5\2\0\3\5\1\4\5\0\2\4\1\0\5\4\4\0\1\4\1"+
    "\0\2\4\1\0\2\4\1\0\2\4\2\0\1\5\1\0\5\5\4\0\2\5\2\0\3\5\3\0\1\5\7\0\4\4\1\0"+
    "\1\4\7\0\4\5\3\4\1\5\2\0\1\4\1\0\2\4\1\0\3\4\2\5\1\0\3\5\2\0\1\4\11\0\1\5"+
    "\1\4\1\0\6\4\3\0\3\4\1\0\4\4\3\0\2\4\1\0\1\4\1\0\2\4\3\0\2\4\3\0\2\4\4\0\5"+
    "\5\3\0\3\5\1\0\4\5\2\0\1\4\6\0\1\5\4\4\1\0\5\4\3\0\1\4\7\5\1\0\2\5\5\0\2\5"+
    "\3\0\2\5\1\0\3\4\1\0\2\4\5\0\3\4\2\0\1\4\3\5\1\0\4\5\1\4\1\0\4\4\1\0\1\4\4"+
    "\0\1\5\4\0\6\5\1\0\1\5\3\0\2\5\4\0\1\4\1\5\2\4\7\5\4\0\10\4\3\5\7\0\2\4\1"+
    "\0\1\4\2\0\2\4\1\0\1\4\2\0\1\4\6\0\4\4\1\0\3\4\1\0\1\4\1\0\1\4\2\0\2\4\1\0"+
    "\3\4\2\5\1\0\2\5\1\4\2\0\5\4\1\0\1\4\1\0\6\5\2\0\2\5\2\0\4\4\5\0\1\5\1\0\1"+
    "\5\1\0\1\5\4\0\2\5\5\4\3\5\6\0\1\5\1\0\7\5\1\4\2\5\4\4\3\5\1\4\3\5\2\4\7\5"+
    "\3\4\4\5\5\4\14\5\1\4\1\5\3\4\1\0\7\4\2\0\3\5\2\4\3\5\3\0\2\4\2\5\4\0\1\4"+
    "\1\0\2\5\4\0\4\4\10\5\3\0\1\4\3\0\2\4\1\5\5\0\3\5\2\0\1\4\1\5\1\4\5\0\6\4"+
    "\2\0\5\5\3\4\3\0\10\5\5\4\2\5\3\0\3\4\3\5\1\0\5\5\4\4\1\5\4\4\3\5\2\4\2\0"+
    "\1\4\1\0\1\4\1\0\1\4\1\0\1\4\2\0\3\4\1\0\6\4\2\0\2\4\2\0\5\5\5\0\1\4\5\0\6"+
    "\5\1\0\1\5\3\0\4\5\11\0\1\4\4\0\1\4\1\0\5\4\2\0\1\4\1\0\4\4\1\0\3\4\2\0\4"+
    "\4\5\0\5\4\4\0\1\4\4\0\4\4\3\5\2\4\5\0\2\5\2\0\3\4\6\5\1\0\2\4\2\0\4\4\1\0"+
    "\2\4\1\5\3\4\1\5\4\4\1\5\10\4\2\5\4\0\1\4\1\5\4\0\1\5\5\4\2\5\3\0\3\4\4\0"+
    "\3\4\2\5\2\0\6\4\1\0\3\5\1\0\2\5\5\0\5\4\5\0\1\4\1\5\3\4\1\0\2\4\1\0\7\4\2"+
    "\0\1\5\6\0\2\4\2\0\3\4\3\0\2\4\3\0\2\4\2\0\3\5\4\0\3\4\1\0\2\4\1\0\1\4\5\0"+
    "\1\5\2\0\1\4\3\0\1\4\2\0\2\4\3\5\1\0\2\5\1\0\3\5\2\0\1\5\2\0\1\5\4\4\10\0"+
    "\5\5\3\0\6\5\2\0\3\5\2\0\4\5\4\0\3\5\5\0\1\4\2\0\2\4\2\0\4\4\1\0\4\4\1\0\1"+
    "\4\1\0\6\4\2\0\5\4\1\0\4\4\1\0\4\4\2\0\2\5\1\0\1\4\1\0\1\4\5\0\1\4\1\0\1\4"+
    "\1\0\3\4\1\0\3\4\1\0\3\4");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\4\1\1\3\1\4\2\2\22\0"+
    "\1\5\2\0\1\6\4\0\1\7\5\0\1\10\1\0"+
    "\1\11";

  private static int [] zzUnpackAction() {
    int [] result = new int[48];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
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
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\27\0\56\0\105\0\134\0\163\0\212\0\241"+
    "\0\270\0\105\0\317\0\346\0\105\0\375\0\u0114\0\u012b"+
    "\0\u0142\0\u0159\0\u0170\0\u0187\0\u019e\0\u01b5\0\u01cc\0\u01e3"+
    "\0\u01fa\0\u0211\0\u0228\0\u023f\0\u0256\0\u026d\0\u0284\0\105"+
    "\0\u029b\0\u02b2\0\105\0\u02c9\0\u02e0\0\u02f7\0\u030e\0\105"+
    "\0\u0325\0\u033c\0\u0353\0\u036a\0\u0381\0\105\0\u0398\0\105";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[48];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
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
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\3\4\1\5\2\4\1\6\3\4\1\7\4\4\1\10"+
    "\3\4\1\11\2\4\1\12\33\4\1\13\1\4\20\13"+
    "\1\4\27\0\1\5\1\14\1\15\24\5\7\0\1\16"+
    "\33\0\1\17\32\0\1\20\1\21\16\0\1\22\21\0"+
    "\22\13\3\0\1\15\34\0\1\23\43\0\1\24\22\0"+
    "\1\25\31\0\1\26\17\0\1\27\22\0\1\30\26\0"+
    "\1\31\37\0\1\32\22\0\1\33\35\0\1\34\13\0"+
    "\1\35\31\0\1\36\20\0\1\37\35\0\1\40\21\0"+
    "\1\41\23\0\1\42\36\0\1\43\16\0\1\44\35\0"+
    "\1\45\20\0\1\46\35\0\1\47\26\0\1\50\23\0"+
    "\1\51\25\0\1\52\23\0\1\53\42\0\1\54\17\0"+
    "\1\55\26\0\1\56\27\0\1\57\27\0\1\60\10\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[943];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
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

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\5\1\1\11\2\1\1\11\22\0\1\11"+
    "\2\0\1\11\4\0\1\11\5\0\1\11\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[48];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

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

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _CwlLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  _CwlLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
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
   * @exception   java.io.IOException  if any I/O-Error occurs
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
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
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
    }
    catch (ArrayIndexOutOfBoundsException e) {
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
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            }
          case 10: break;
          case 2: 
            { return CwlLexerTokens.COMMENT;
            }
          case 11: break;
          case 3: 
            { yybegin(WAITING_VALUE); return CwlLexerTokens.COLON;
            }
          case 12: break;
          case 4: 
            { yybegin(YYINITIAL); return CwlLexerTokens.IDENTIFIER;
            }
          case 13: break;
          case 5: 
            { return CwlLexerTokens.CLASS;
            }
          case 14: break;
          case 6: 
            { return CwlLexerTokens.INPUTS;
            }
          case 15: break;
          case 7: 
            { return CwlLexerTokens.OUTPUTS;
            }
          case 16: break;
          case 8: 
            { return CwlLexerTokens.CWLVERSION;
            }
          case 17: break;
          case 9: 
            { return CwlLexerTokens.REQUIREMENTS;
            }
          case 18: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
