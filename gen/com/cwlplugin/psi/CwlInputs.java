// This is a generated file. Not intended for manual editing.
package com.cwlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CwlInputs extends PsiElement {

  @NotNull
  List<CwlCommandInputParameter> getCommandInputParameterList();

  @NotNull
  PsiElement getColonTk();

  @NotNull
  PsiElement getInputsTk();

}
