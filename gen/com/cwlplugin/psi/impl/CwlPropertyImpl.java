// This is a generated file. Not intended for manual editing.
package com.cwlplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.cwlplugin.psi.CwlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.cwlplugin.psi.*;

public class CwlPropertyImpl extends ASTWrapperPsiElement implements CwlProperty {

  public CwlPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CwlVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CwlVisitor) accept((CwlVisitor)visitor);
    else super.accept(visitor);
  }

  public String getKey() {
    return CwlPsiImplUtil.getKey(this);
  }

  public String getValue() {
    return CwlPsiImplUtil.getValue(this);
  }

}
