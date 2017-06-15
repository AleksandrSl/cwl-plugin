// This is a generated file. Not intended for manual editing.
package com.cwlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CwlInputBinding extends PsiElement {

  @NotNull
  List<CwlCommandLineBindingField> getCommandLineBindingFieldList();

  @NotNull
  PsiElement getColonTk();

  @NotNull
  PsiElement getInputBindingTk();

}
