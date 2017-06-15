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

public class CwlDockerRequirementFieldImpl extends ASTWrapperPsiElement implements CwlDockerRequirementField {

  public CwlDockerRequirementFieldImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitDockerRequirementField(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CwlVisitor) accept((CwlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CwlDockerPull getDockerPull() {
    return findChildByClass(CwlDockerPull.class);
  }

  @Override
  @Nullable
  public PsiElement getColonTk() {
    return findChildByType(COLON_TK);
  }

  @Override
  @Nullable
  public PsiElement getDockerFileTk() {
    return findChildByType(DOCKER_FILE_TK);
  }

  @Override
  @Nullable
  public PsiElement getDockerImageIdTk() {
    return findChildByType(DOCKER_IMAGE_ID_TK);
  }

  @Override
  @Nullable
  public PsiElement getDockerImportTk() {
    return findChildByType(DOCKER_IMPORT_TK);
  }

  @Override
  @Nullable
  public PsiElement getDockerLoadTk() {
    return findChildByType(DOCKER_LOAD_TK);
  }

  @Override
  @Nullable
  public PsiElement getDockerOutputDirectoryTk() {
    return findChildByType(DOCKER_OUTPUT_DIRECTORY_TK);
  }

  @Override
  @Nullable
  public PsiElement getStringTk() {
    return findChildByType(STRING_TK);
  }

}
