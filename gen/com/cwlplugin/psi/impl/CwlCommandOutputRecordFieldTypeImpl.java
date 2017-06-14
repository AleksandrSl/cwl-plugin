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

public class CwlCommandOutputRecordFieldTypeImpl extends ASTWrapperPsiElement implements CwlCommandOutputRecordFieldType {

  public CwlCommandOutputRecordFieldTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitCommandOutputRecordFieldType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CwlVisitor) accept((CwlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CwlCommandOutputArraySchema getCommandOutputArraySchema() {
    return findChildByClass(CwlCommandOutputArraySchema.class);
  }

  @Override
  @Nullable
  public CwlCommandOutputArraySchemaArray getCommandOutputArraySchemaArray() {
    return findChildByClass(CwlCommandOutputArraySchemaArray.class);
  }

  @Override
  @Nullable
  public CwlCommandOutputEnumSchema getCommandOutputEnumSchema() {
    return findChildByClass(CwlCommandOutputEnumSchema.class);
  }

  @Override
  @Nullable
  public CwlCommandOutputEnumSchemaArray getCommandOutputEnumSchemaArray() {
    return findChildByClass(CwlCommandOutputEnumSchemaArray.class);
  }

  @Override
  @Nullable
  public CwlCommandOutputRecordSchema getCommandOutputRecordSchema() {
    return findChildByClass(CwlCommandOutputRecordSchema.class);
  }

  @Override
  @Nullable
  public CwlCommandOutputRecordSchemaArray getCommandOutputRecordSchemaArray() {
    return findChildByClass(CwlCommandOutputRecordSchemaArray.class);
  }

  @Override
  @Nullable
  public CwlCwlType getCwlType() {
    return findChildByClass(CwlCwlType.class);
  }

  @Override
  @Nullable
  public CwlCwlTypeArray getCwlTypeArray() {
    return findChildByClass(CwlCwlTypeArray.class);
  }

}
