// This is a generated file. Not intended for manual editing.
package com.cwlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CwlOutputs extends PsiElement {

  @NotNull
  List<CwlCommandOutputParameter> getCommandOutputParameterList();

  @NotNull
  PsiElement getColonTk();

  @NotNull
  PsiElement getOutputsTk();

}
