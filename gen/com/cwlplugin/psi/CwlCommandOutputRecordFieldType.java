// This is a generated file. Not intended for manual editing.
package com.cwlplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CwlCommandOutputRecordFieldType extends PsiElement {

  @Nullable
  CwlCommandOutputArraySchema getCommandOutputArraySchema();

  @Nullable
  CwlCommandOutputArraySchemaArray getCommandOutputArraySchemaArray();

  @Nullable
  CwlCommandOutputEnumSchema getCommandOutputEnumSchema();

  @Nullable
  CwlCommandOutputEnumSchemaArray getCommandOutputEnumSchemaArray();

  @Nullable
  CwlCommandOutputRecordSchema getCommandOutputRecordSchema();

  @Nullable
  CwlCommandOutputRecordSchemaArray getCommandOutputRecordSchemaArray();

  @Nullable
  CwlCwlType getCwlType();

  @Nullable
  CwlCwlTypeArray getCwlTypeArray();

}
