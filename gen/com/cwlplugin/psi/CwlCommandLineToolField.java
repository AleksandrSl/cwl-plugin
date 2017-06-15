// This is a generated file. Not intended for manual editing.
package com.cwlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CwlCommandLineToolField extends PsiElement {

  @Nullable
  CwlArguments getArguments();

  @Nullable
  CwlBaseCommand getBaseCommand();

  @Nullable
  CwlCommandLineToolClass getCommandLineToolClass();

  @Nullable
  CwlHints getHints();

  @Nullable
  CwlInputs getInputs();

  @Nullable
  CwlLabel getLabel();

  @Nullable
  CwlOutputs getOutputs();

  @Nullable
  CwlPermanentFailCodes getPermanentFailCodes();

  @Nullable
  CwlRequirements getRequirements();

  @Nullable
  CwlStderr getStderr();

  @Nullable
  CwlStdin getStdin();

  @Nullable
  CwlStdout getStdout();

  @Nullable
  CwlSuccessCodes getSuccessCodes();

  @Nullable
  CwlTemporaryFailCodes getTemporaryFailCodes();

  @Nullable
  PsiElement getColonTk();

  @Nullable
  PsiElement getDocTk();

  @Nullable
  PsiElement getIdTk();

  @Nullable
  PsiElement getLbracketTk();

  @Nullable
  PsiElement getRbracketTk();

  @Nullable
  PsiElement getStringTk();

}
