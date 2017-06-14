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

public class CwlCommandOutputArraySchemaImpl extends ASTWrapperPsiElement implements CwlCommandOutputArraySchema {

  public CwlCommandOutputArraySchemaImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitCommandOutputArraySchema(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CwlVisitor) accept((CwlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CwlCommandOutputArrayItems getCommandOutputArrayItems() {
    return findChildByClass(CwlCommandOutputArrayItems.class);
  }

  @Override
  @Nullable
  public CwlOutputBinding getOutputBinding() {
    return findChildByClass(CwlOutputBinding.class);
  }

}
