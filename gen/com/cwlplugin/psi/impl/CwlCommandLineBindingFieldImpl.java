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

public class CwlCommandLineBindingFieldImpl extends ASTWrapperPsiElement implements CwlCommandLineBindingField {

  public CwlCommandLineBindingFieldImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitCommandLineBindingField(this);
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
  public PsiElement getIntTk() {
    return findChildByType(INT_TK);
  }

  @Override
  @Nullable
  public PsiElement getItemSeparatorTk() {
    return findChildByType(ITEM_SEPARATOR_TK);
  }

  @Override
  @Nullable
  public PsiElement getLoadContentsTk() {
    return findChildByType(LOAD_CONTENTS_TK);
  }

  @Override
  @Nullable
  public PsiElement getPositionTk() {
    return findChildByType(POSITION_TK);
  }

  @Override
  @Nullable
  public PsiElement getPrefixTk() {
    return findChildByType(PREFIX_TK);
  }

  @Override
  @Nullable
  public PsiElement getSeparateTk() {
    return findChildByType(SEPARATE_TK);
  }

  @Override
  @Nullable
  public PsiElement getShellQuoteTk() {
    return findChildByType(SHELL_QUOTE_TK);
  }

  @Override
  @Nullable
  public PsiElement getStringTk() {
    return findChildByType(STRING_TK);
  }

  @Override
  @Nullable
  public PsiElement getValueFromTk() {
    return findChildByType(VALUE_FROM_TK);
  }

}
