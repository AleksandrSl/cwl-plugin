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

public class CwlDirectoryFieldImpl extends ASTWrapperPsiElement implements CwlDirectoryField {

  public CwlDirectoryFieldImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitDirectoryField(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CwlVisitor) accept((CwlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CwlDirectoryArray getDirectoryArray() {
    return findChildByClass(CwlDirectoryArray.class);
  }

  @Override
  @Nullable
  public CwlFileArray getFileArray() {
    return findChildByClass(CwlFileArray.class);
  }

  @Override
  @Nullable
  public PsiElement getBasenameTk() {
    return findChildByType(BASENAME_TK);
  }

  @Override
  @NotNull
  public PsiElement getColonTk() {
    return findNotNullChildByType(COLON_TK);
  }

  @Override
  @Nullable
  public PsiElement getListingTk() {
    return findChildByType(LISTING_TK);
  }

  @Override
  @Nullable
  public PsiElement getLocationTk() {
    return findChildByType(LOCATION_TK);
  }

  @Override
  @Nullable
  public PsiElement getPathTk() {
    return findChildByType(PATH_TK);
  }

  @Override
  @Nullable
  public PsiElement getStringTk() {
    return findChildByType(STRING_TK);
  }

}
