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

public class CwlCommandOutputRecordSchemaImpl extends ASTWrapperPsiElement implements CwlCommandOutputRecordSchema {

  public CwlCommandOutputRecordSchemaImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitCommandOutputRecordSchema(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CwlVisitor) accept((CwlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CwlCommandOutputRecordFields getCommandOutputRecordFields() {
    return findChildByClass(CwlCommandOutputRecordFields.class);
  }

  @Override
  @Nullable
  public CwlRecordType getRecordType() {
    return findChildByClass(CwlRecordType.class);
  }

}
