// This is a generated file. Not intended for manual editing.
package com.cwlplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.cwlplugin.psi.CwlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.cwlplugin.psi.*;

public class CwlDirectoryArrayImpl extends ASTWrapperPsiElement implements CwlDirectoryArray {

  public CwlDirectoryArrayImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitDirectoryArray(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CwlVisitor) accept((CwlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CwlDirectory> getDirectoryList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CwlDirectory.class);
  }

  @Override
  @NotNull
  public PsiElement getLbracketTk() {
    return findNotNullChildByType(LBRACKET_TK);
  }

  @Override
  @NotNull
  public PsiElement getRbracketTk() {
    return findNotNullChildByType(RBRACKET_TK);
  }

}
