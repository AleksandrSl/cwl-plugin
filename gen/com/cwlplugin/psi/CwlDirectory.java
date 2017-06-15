// This is a generated file. Not intended for manual editing.
package com.cwlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CwlDirectory extends PsiElement {

  @NotNull
  List<CwlDirectoryField> getDirectoryFieldList();

  @NotNull
  PsiElement getClassTk();

  @NotNull
  PsiElement getColonTk();

  @NotNull
  PsiElement getDirectoryTypeTk();

}
