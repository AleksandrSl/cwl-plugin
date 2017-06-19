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

public class CwlCommandLineToolFieldImpl extends ASTWrapperPsiElement implements CwlCommandLineToolField {

  public CwlCommandLineToolFieldImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitCommandLineToolField(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CwlVisitor) accept((CwlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CwlArguments getArguments() {
    return findChildByClass(CwlArguments.class);
  }

  @Override
  @Nullable
  public CwlBaseCommand getBaseCommand() {
    return findChildByClass(CwlBaseCommand.class);
  }

  @Override
  @Nullable
  public CwlCommandLineToolClass getCommandLineToolClass() {
    return findChildByClass(CwlCommandLineToolClass.class);
  }

  @Override
  @Nullable
  public CwlHints getHints() {
    return findChildByClass(CwlHints.class);
  }

  @Override
  @Nullable
  public CwlInputs getInputs() {
    return findChildByClass(CwlInputs.class);
  }

  @Override
  @Nullable
  public CwlLabel getLabel() {
    return findChildByClass(CwlLabel.class);
  }

  @Override
  @Nullable
  public CwlOutputs getOutputs() {
    return findChildByClass(CwlOutputs.class);
  }

  @Override
  @Nullable
  public CwlPermanentFailCodes getPermanentFailCodes() {
    return findChildByClass(CwlPermanentFailCodes.class);
  }

  @Override
  @Nullable
  public CwlRequirements getRequirements() {
    return findChildByClass(CwlRequirements.class);
  }

  @Override
  @Nullable
  public CwlStderr getStderr() {
    return findChildByClass(CwlStderr.class);
  }

  @Override
  @Nullable
  public CwlStdin getStdin() {
    return findChildByClass(CwlStdin.class);
  }

  @Override
  @Nullable
  public CwlStdout getStdout() {
    return findChildByClass(CwlStdout.class);
  }

  @Override
  @Nullable
  public CwlSuccessCodes getSuccessCodes() {
    return findChildByClass(CwlSuccessCodes.class);
  }

  @Override
  @Nullable
  public CwlTemporaryFailCodes getTemporaryFailCodes() {
    return findChildByClass(CwlTemporaryFailCodes.class);
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
  public PsiElement getIdTk() {
    return findChildByType(ID_TK);
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
