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

public class CwlCommandInputRecordFieldImpl extends ASTWrapperPsiElement implements CwlCommandInputRecordField {

  public CwlCommandInputRecordFieldImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitCommandInputRecordField(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CwlVisitor) accept((CwlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CwlCommandInputRecordFieldType getCommandInputRecordFieldType() {
    return findChildByClass(CwlCommandInputRecordFieldType.class);
  }

  @Override
  @Nullable
  public CwlInputBinding getInputBinding() {
    return findChildByClass(CwlInputBinding.class);
  }

  @Override
  @Nullable
  public CwlLabel getLabel() {
    return findChildByClass(CwlLabel.class);
  }

  @Override
  @Nullable
  public PsiElement getColonTk() {
    return findChildByType(COLON_TK);
  }

  @Override
  @Nullable
  public PsiElement getDocTk() {
    return findChildByType(DOC_TK);
  }

  @Override
  @Nullable
  public PsiElement getLbracketTk() {
    return findChildByType(LBRACKET_TK);
  }

  @Override
  @Nullable
  public PsiElement getNameTk() {
    return findChildByType(NAME_TK);
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
