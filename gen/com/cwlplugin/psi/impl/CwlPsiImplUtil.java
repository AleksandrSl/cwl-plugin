//package com.cwlplugin.psi.impl;
//
//import com.intellij.lang.ASTNode;
//import com.intellij.psi.*;
//import com.cwlplugin.psi.*;
//
//public class CwlPsiImplUtil {
//    public static String getKey(CwlProperty element) {
//        ASTNode keyNode = element.getNode().findChildByType(CwlTypes.INPUTS);
//        if (keyNode != null) {
//            // IMPORTANT: Convert embedded escaped spaces to cwl spaces
//            return keyNode.getText().replaceAll("\\\\ ", " ");
//        } else {
//            return null;
//        }
//    }
//
//    public static String getValue(CwlProperty element) {
//        ASTNode valueNode = element.getNode().findChildByType(CwlTypes.IDENTIFIER);
//        if (valueNode != null) {
//            return valueNode.getText();
//        } else {
//            return null;
//        }
//    }
//
//    public static String getName(CwlProperty element) {
//        return getKey(element);
//    }
//
////    public static PsiElement setName(CwlProperty element, String newName) {
////        ASTNode keyNode = element.getNode().findChildByType(CwlTypes.INPUTS);
////        if (keyNode != null) {
////            CwlProperty property = CwlElementFactory.createProperty(element.getProject(), newName);
////            ASTNode newKeyNode = property.getFirstChild().getNode();
////            element.getNode().replaceChild(keyNode, newKeyNode);
////        }
////        return element;
////    }
//
//    public static PsiElement getNameIdentifier(CwlProperty element) {
//        ASTNode keyNode = element.getNode().findChildByType(CwlTypes.INPUTS);
//        if (keyNode != null) {
//            return keyNode.getPsi();
//        } else {
//            return null;
//        }
//    }
//
////    public static ItemPresentation getPresentation(final CwlProperty element) {
////        return new ItemPresentation() {
////            @Nullable
////            @Override
////            public String getPresentableText() {
////                return element.getKey();
////            }
////
////            @Nullable
////            @Override
////            public String getLocationString() {
////                PsiFile containingFile = element.getContainingFile();
////                return containingFile == null ? null : containingFile.getName();
////            }
////
////            @Nullable
////            @Override
////            public Icon getIcon(boolean unused) {
////                return CwlIcons.FILE;
////            }
////        };
////    }
//}