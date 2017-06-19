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

public class CwlCwlTypeImpl extends ASTWrapperPsiElement implements CwlCwlType {

  public CwlCwlTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitCwlType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CwlVisitor) accept((CwlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getBooleanTypeTk() {
    return findChildByType(BOOLEAN_TYPE_TK);
  }

  @Override
  @Nullable
  public PsiElement getDirectoryTypeTk() {
    return findChildByType(DIRECTORY_TYPE_TK);
  }

  @Override
  @Nullable
  public PsiElement getDoubleTypeTk() {
    return findChildByType(DOUBLE_TYPE_TK);
  }

  @Override
  @Nullable
  public PsiElement getFileTypeTk() {
    return findChildByType(FILE_TYPE_TK);
  }

  @Override
  @Nullable
  public PsiElement getFloatTypeTk() {
    return findChildByType(FLOAT_TYPE_TK);
  }

  @Override
  @Nullable
  public PsiElement getIntTypeTk() {
    return findChildByType(INT_TYPE_TK);
  }

  @Override
  @Nullable
  public PsiElement getLongTypeTk() {
    return findChildByType(LONG_TYPE_TK);
  }

  @Override
  @Nullable
  public PsiElement getNullTypeTk() {
    return findChildByType(NULL_TYPE_TK);
  }

  @Override
  @Nullable
  public PsiElement getStringTypeTk() {
    return findChildByType(STRING_TYPE_TK);
  }

}
