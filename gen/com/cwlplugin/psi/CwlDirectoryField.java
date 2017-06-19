// This is a generated file. Not intended for manual editing.
package com.cwlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CwlDirectoryField extends PsiElement {

  @Nullable
  CwlDirectoryArray getDirectoryArray();

  @Nullable
  CwlFileArray getFileArray();

  @Nullable
  PsiElement getBasenameTk();

  @NotNull
  PsiElement getColonTk();

  @Nullable
  PsiElement getListingTk();

  @Nullable
  PsiElement getLocationTk();

  @Nullable
  PsiElement getPathTk();

  @Nullable
  PsiElement getStringTk();

}
