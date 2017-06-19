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

public class CwlCommandInputEnumSchemaImpl extends ASTWrapperPsiElement implements CwlCommandInputEnumSchema {

  public CwlCommandInputEnumSchemaImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitCommandInputEnumSchema(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CwlVisitor) accept((CwlVisitor)visitor);
    else super.accept(visitor);
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
  public CwlSymbols getSymbols() {
    return findChildByClass(CwlSymbols.class);
  }

  @Override
  @Nullable
  public PsiElement getColonTk() {
    return findChildByType(COLON_TK);
  }

  @Override
  @Nullable
  public PsiElement getEnumType() {
    return findChildByType(ENUM_TYPE);
  }

  @Override
  @Nullable
  public PsiElement getTypeTk() {
    return findChildByType(TYPE_TK);
  }

}
