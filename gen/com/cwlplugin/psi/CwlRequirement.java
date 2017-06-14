// This is a generated file. Not intended for manual editing.
package com.cwlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CwlRequirement extends PsiElement {

  @Nullable
  CwlInitialWorkdirListing getInitialWorkdirListing();

  @Nullable
  CwlPackages getPackages();

  @NotNull
  List<CwlResourceRequirementField> getResourceRequirementFieldList();

}
