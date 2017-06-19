// This is a generated file. Not intended for manual editing.
package com.cwlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CwlCommandInputParameterField extends PsiElement {

  @Nullable
  CwlInputBinding getInputBinding();

  @Nullable
  CwlLabel getLabel();

  @Nullable
  CwlSecondaryFiles getSecondaryFiles();

  @Nullable
  CwlStreamable getStreamable();

  @Nullable
  CwlType getType();

  @Nullable
  PsiElement getColonTk();

  @Nullable
  PsiElement getDefaultTk();

  @Nullable
  PsiElement getDocTk();

  @Nullable
  PsiElement getExpressionTk();

  @Nullable
  PsiElement getFormatTk();

  @Nullable
  PsiElement getIdTk();

  @Nullable
  PsiElement getLbracketTk();

  @Nullable
  PsiElement getRbracketTk();

  @Nullable
  PsiElement getStringTk();

}
