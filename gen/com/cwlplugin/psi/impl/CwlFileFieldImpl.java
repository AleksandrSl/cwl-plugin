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

public class CwlFileFieldImpl extends ASTWrapperPsiElement implements CwlFileField {

  public CwlFileFieldImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitFileField(this);
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
  @Nullable
  public PsiElement getChecksumTk() {
    return findChildByType(CHECKSUM_TK);
  }

  @Override
  @NotNull
  public PsiElement getColonTk() {
    return findNotNullChildByType(COLON_TK);
  }

  @Override
  @Nullable
  public PsiElement getContentsTk() {
    return findChildByType(CONTENTS_TK);
  }

  @Override
  @Nullable
  public PsiElement getDirnameTk() {
    return findChildByType(DIRNAME_TK);
  }

  @Override
  @Nullable
  public PsiElement getExpressionTk() {
    return findChildByType(EXPRESSION_TK);
  }

  @Override
  @Nullable
  public PsiElement getFormatTk() {
    return findChildByType(FORMAT_TK);
  }

  @Override
  @Nullable
  public PsiElement getLbracketTk() {
    return findChildByType(LBRACKET_TK);
  }

  @Override
  @Nullable
  public PsiElement getLocationTk() {
    return findChildByType(LOCATION_TK);
  }

  @Override
  @Nullable
  public PsiElement getNameextTk() {
    return findChildByType(NAMEEXT_TK);
  }

  @Override
  @Nullable
  public PsiElement getNamerootTk() {
    return findChildByType(NAMEROOT_TK);
  }

  @Override
  @Nullable
  public PsiElement getNumberTk() {
    return findChildByType(NUMBER_TK);
  }

  @Override
  @Nullable
  public PsiElement getPathTk() {
    return findChildByType(PATH_TK);
  }

  @Override
  @Nullable
  public PsiElement getRbracketTk() {
    return findChildByType(RBRACKET_TK);
  }

  @Override
  @Nullable
  public PsiElement getSecondaryFilesTk() {
    return findChildByType(SECONDARY_FILES_TK);
  }

  @Override
  @Nullable
  public PsiElement getSizeTk() {
    return findChildByType(SIZE_TK);
  }

  @Override
  @Nullable
  public PsiElement getStringTk() {
    return findChildByType(STRING_TK);
  }

}
