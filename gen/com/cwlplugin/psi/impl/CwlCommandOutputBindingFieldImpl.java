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

public class CwlCommandOutputBindingFieldImpl extends ASTWrapperPsiElement implements CwlCommandOutputBindingField {

  public CwlCommandOutputBindingFieldImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitCommandOutputBindingField(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CwlVisitor) accept((CwlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getBooleanTk() {
    return findChildByType(BOOLEAN_TK);
  }

  @Override
  @NotNull
  public PsiElement getColonTk() {
    return findNotNullChildByType(COLON_TK);
  }

  @Override
  @Nullable
  public PsiElement getExpressionTk() {
    return findChildByType(EXPRESSION_TK);
  }

  @Override
  @Nullable
  public PsiElement getGlobTk() {
    return findChildByType(GLOB_TK);
  }

  @Override
  @Nullable
  public PsiElement getLbracketTk() {
    return findChildByType(LBRACKET_TK);
  }

  @Override
  @Nullable
  public PsiElement getLoadContentsTk() {
    return findChildByType(LOAD_CONTENTS_TK);
  }

  @Override
  @Nullable
  public PsiElement getOutputEvalTk() {
    return findChildByType(OUTPUT_EVAL_TK);
  }

  @Override
  @Nullable
  public PsiElement getRbracketTk() {
    return findChildByType(RBRACKET_TK);
  }

  @Override
  @Nullable
  public PsiElement getStringTk() {
    return findChildByType(STRING_TK);
  }

}
