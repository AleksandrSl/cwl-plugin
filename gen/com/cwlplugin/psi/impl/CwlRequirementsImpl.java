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

public class CwlRequirementsImpl extends ASTWrapperPsiElement implements CwlRequirements {

  public CwlRequirementsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitRequirements(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CwlVisitor) accept((CwlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CwlRequirement> getRequirementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CwlRequirement.class);
  }

  @Override
  @NotNull
  public PsiElement getColonTk() {
    return findNotNullChildByType(COLON_TK);
  }

  @Override
  @NotNull
  public PsiElement getRequirementsTk() {
    return findNotNullChildByType(REQUIREMENTS_TK);
  }

}
