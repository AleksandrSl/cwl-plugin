// This is a generated file. Not intended for manual editing.
package com.cwlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CwlRequirement extends PsiElement {

  @Nullable
  CwlDockerRequirement getDockerRequirement();

  @Nullable
  CwlEnvVarRequirement getEnvVarRequirement();

  @Nullable
  CwlInitialWorkdirRequirement getInitialWorkdirRequirement();

  @Nullable
  CwlResourceRequirement getResourceRequirement();

  @Nullable
  CwlSchemaDefRequirement getSchemaDefRequirement();

  @Nullable
  CwlShellCommandRequirement getShellCommandRequirement();

  @Nullable
  CwlSoftwareRequirement getSoftwareRequirement();

  @Nullable
  PsiElement getClassTk();

  @Nullable
  PsiElement getColonTk();

  @Nullable
  PsiElement getInlineJavascriptRequirementTk();

}
