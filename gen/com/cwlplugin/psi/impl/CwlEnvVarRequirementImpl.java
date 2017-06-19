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

public class CwlEnvVarRequirementImpl extends ASTWrapperPsiElement implements CwlEnvVarRequirement {

  public CwlEnvVarRequirementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitEnvVarRequirement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CwlVisitor) accept((CwlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getClassTk() {
    return findNotNullChildByType(CLASS_TK);
  }

  @Override
  @NotNull
  public PsiElement getEnvDefTk() {
    return findNotNullChildByType(ENV_DEF_TK);
  }

  @Override
  @NotNull
  public PsiElement getEnvNameTk() {
    return findNotNullChildByType(ENV_NAME_TK);
  }

  @Override
  @NotNull
  public PsiElement getEnvValueTk() {
    return findNotNullChildByType(ENV_VALUE_TK);
  }

  @Override
  @NotNull
  public PsiElement getEnvVarRequirementTk() {
    return findNotNullChildByType(ENV_VAR_REQUIREMENT_TK);
  }

  @Override
  @Nullable
  public PsiElement getExpressionTk() {
    return findChildByType(EXPRESSION_TK);
  }

}
