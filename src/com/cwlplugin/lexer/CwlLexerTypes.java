package com.cwlplugin.lexer;

import com.cwlplugin.psi.CwlElementType;
import com.cwlplugin.psi.CwlTypes;
import com.intellij.psi.tree.IElementType;

/**
 * Created by aleksandrsl on 11.06.17.
 */
public interface CwlLexerTypes extends CwlTypes {

    IElementType COMMENT = new CwlElementType("COMMENT");
}