// This is a generated file. Not intended for manual editing.
package com.cwlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CwlInitialWorkdirListing extends PsiElement {

  @Nullable
  CwlDirectoryArray getDirectoryArray();

  @Nullable
  CwlDirentArray getDirentArray();

  @Nullable
  CwlFileArray getFileArray();

  @Nullable
  PsiElement getLbracketTk();

  @Nullable
  PsiElement getRbracketTk();

}
