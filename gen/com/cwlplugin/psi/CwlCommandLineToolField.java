// This is a generated file. Not intended for manual editing.
package com.cwlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CwlCommandLineToolField extends PsiElement {

  @NotNull
  List<CwlCommandLineBindingField> getCommandLineBindingFieldList();

  @NotNull
  List<CwlCommandOutputParameter> getCommandOutputParameterList();

  @Nullable
  CwlInputs getInputs();

  @Nullable
  CwlIntArray getIntArray();

  @Nullable
  CwlRequirements getRequirements();

}
