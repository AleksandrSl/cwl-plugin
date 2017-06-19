// This is a generated file. Not intended for manual editing.
package com.cwlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CwlDirentArray extends PsiElement {

  @NotNull
  List<CwlDirent> getDirentList();

  @NotNull
  PsiElement getLbracketTk();

  @NotNull
  PsiElement getRbracketTk();

}
