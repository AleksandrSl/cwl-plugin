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

public class CwlCommandInputRecordFieldTypeImpl extends ASTWrapperPsiElement implements CwlCommandInputRecordFieldType {

  public CwlCommandInputRecordFieldTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitCommandInputRecordFieldType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CwlVisitor) accept((CwlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CwlCommandInputArraySchema getCommandInputArraySchema() {
    return findChildByClass(CwlCommandInputArraySchema.class);
  }

  @Override
  @Nullable
  public CwlCommandInputArraySchemaArray getCommandInputArraySchemaArray() {
    return findChildByClass(CwlCommandInputArraySchemaArray.class);
  }

  @Override
  @Nullable
  public CwlCommandInputEnumSchema getCommandInputEnumSchema() {
    return findChildByClass(CwlCommandInputEnumSchema.class);
  }

  @Override
  @Nullable
  public CwlCommandInputEnumSchemaArray getCommandInputEnumSchemaArray() {
    return findChildByClass(CwlCommandInputEnumSchemaArray.class);
  }

  @Override
  @Nullable
  public CwlCommandInputRecordSchemaArray getCommandInputRecordSchemaArray() {
    return findChildByClass(CwlCommandInputRecordSchemaArray.class);
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

  @Override
  @Nullable
  public PsiElement getLbracketTk() {
    return findChildByType(LBRACKET_TK);
  }

  @Override
  @Nullable
  public PsiElement getRbracketTk() {
    return findChildByType(RBRACKET_TK);
  }

  @Override
  @Nullable
  public PsiElement getStringTk() {
    return findChildByType(STRING_TK);
  }

}
