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

public class CwlResourceRequirementFieldImpl extends ASTWrapperPsiElement implements CwlResourceRequirementField {

  public CwlResourceRequirementFieldImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitResourceRequirementField(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CwlVisitor) accept((CwlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getColonTk() {
    return findNotNullChildByType(COLON_TK);
  }

  @Override
  @Nullable
  public PsiElement getCoresMaxTk() {
    return findChildByType(CORES_MAX_TK);
  }

  @Override
  @Nullable
  public PsiElement getCoresMinTk() {
    return findChildByType(CORES_MIN_TK);
  }

  @Override
  @Nullable
  public PsiElement getExpressionTk() {
    return findChildByType(EXPRESSION_TK);
  }

  @Override
  @Nullable
  public PsiElement getNumberTk() {
    return findChildByType(NUMBER_TK);
  }

  @Override
  @Nullable
  public PsiElement getOutdirMaxTk() {
    return findChildByType(OUTDIR_MAX_TK);
  }

  @Override
  @Nullable
  public PsiElement getOutdirMinTk() {
    return findChildByType(OUTDIR_MIN_TK);
  }

  @Override
  @Nullable
  public PsiElement getRamMaxTk() {
    return findChildByType(RAM_MAX_TK);
  }

  @Override
  @Nullable
  public PsiElement getRamMinTk() {
    return findChildByType(RAM_MIN_TK);
  }

  @Override
  @Nullable
  public PsiElement getStringTk() {
    return findChildByType(STRING_TK);
  }

  @Override
  @Nullable
  public PsiElement getTmpdirMaxTk() {
    return findChildByType(TMPDIR_MAX_TK);
  }

  @Override
  @Nullable
  public PsiElement getTmpdirMinTk() {
    return findChildByType(TMPDIR_MIN_TK);
  }

}
