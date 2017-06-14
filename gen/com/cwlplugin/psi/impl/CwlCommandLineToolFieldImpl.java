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

public class CwlCommandLineToolFieldImpl extends ASTWrapperPsiElement implements CwlCommandLineToolField {

  public CwlCommandLineToolFieldImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitCommandLineToolField(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CwlVisitor) accept((CwlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CwlCommandLineBindingField> getCommandLineBindingFieldList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CwlCommandLineBindingField.class);
  }

  @Override
  @NotNull
  public List<CwlCommandOutputParameter> getCommandOutputParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CwlCommandOutputParameter.class);
  }

  @Override
  @Nullable
  public CwlInputs getInputs() {
    return findChildByClass(CwlInputs.class);
  }

  @Override
  @Nullable
  public CwlIntArray getIntArray() {
    return findChildByClass(CwlIntArray.class);
  }

  @Override
  @Nullable
  public CwlRequirements getRequirements() {
    return findChildByClass(CwlRequirements.class);
  }

}
