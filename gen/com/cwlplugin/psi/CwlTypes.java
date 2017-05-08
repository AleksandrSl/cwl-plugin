// This is a generated file. Not intended for manual editing.
package com.cwlplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.cwlplugin.psi.impl.*;

public interface CwlTypes {

  IElementType PROPERTY = new CwlElementType("PROPERTY");

  IElementType COMMENT = new CwlTokenType("COMMENT");
  IElementType CRLF = new CwlTokenType("CRLF");
  IElementType KEY = new CwlTokenType("KEY");
  IElementType SEPARATOR = new CwlTokenType("SEPARATOR");
  IElementType VALUE = new CwlTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new CwlPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
