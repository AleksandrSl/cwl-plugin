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

public class CwlRequirementImpl extends ASTWrapperPsiElement implements CwlRequirement {

  public CwlRequirementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitRequirement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CwlVisitor) accept((CwlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CwlDockerRequirement getDockerRequirement() {
    return findChildByClass(CwlDockerRequirement.class);
  }

  @Override
  @Nullable
  public CwlEnvVarRequirement getEnvVarRequirement() {
    return findChildByClass(CwlEnvVarRequirement.class);
  }

  @Override
  @Nullable
  public CwlInitialWorkdirRequirement getInitialWorkdirRequirement() {
    return findChildByClass(CwlInitialWorkdirRequirement.class);
  }

  @Override
  @Nullable
  public CwlResourceRequirement getResourceRequirement() {
    return findChildByClass(CwlResourceRequirement.class);
  }

  @Override
  @Nullable
  public CwlSchemaDefRequirement getSchemaDefRequirement() {
    return findChildByClass(CwlSchemaDefRequirement.class);
  }

  @Override
  @Nullable
  public CwlShellCommandRequirement getShellCommandRequirement() {
    return findChildByClass(CwlShellCommandRequirement.class);
  }

  @Override
  @Nullable
  public CwlSoftwareRequirement getSoftwareRequirement() {
    return findChildByClass(CwlSoftwareRequirement.class);
  }

  @Override
  @Nullable
  public PsiElement getClassTk() {
    return findChildByType(CLASS_TK);
  }

  @Override
  @Nullable
  public PsiElement getColonTk() {
    return findChildByType(COLON_TK);
  }

  @Override
  @Nullable
  public PsiElement getInlineJavascriptRequirementTk() {
    return findChildByType(INLINE_JAVASCRIPT_REQUIREMENT_TK);
  }

}
