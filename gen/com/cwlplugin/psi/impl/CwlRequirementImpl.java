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
  public CwlInitialWorkdirListing getInitialWorkdirListing() {
    return findChildByClass(CwlInitialWorkdirListing.class);
  }

  @Override
  @Nullable
  public CwlPackages getPackages() {
    return findChildByClass(CwlPackages.class);
  }

  @Override
  @NotNull
  public List<CwlResourceRequirementField> getResourceRequirementFieldList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CwlResourceRequirementField.class);
  }

}
