// This is a generated file. Not intended for manual editing.
package com.cwlplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.cwlplugin.psi.impl.*;

public interface CwlTypes {

  IElementType ITEM = new CwlElementType("ITEM");

  IElementType COLON = new CwlTokenType("COLON");
  IElementType COMMENT = new CwlTokenType("COMMENT");
  IElementType IDENTIFIER = new CwlTokenType("IDENTIFIER");
  IElementType INPUTS = new CwlTokenType("INPUTS");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ITEM) {
        return new CwlItemImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
