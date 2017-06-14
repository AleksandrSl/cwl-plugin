package com.cwlplugin.psi

import com.cwlplugin.icons.CwlIcons
import com.cwlplugin.junk.CwlElementFactory
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import javax.swing.Icon


/**
 * Created by aleksandrsl on 12.06.17.
 */
fun getRequirement(element: CwlRequirement): String? {

    val requirementNode: ASTNode?  = element.node.findChildByType(CwlTypes.REQUIREMENT)
    if (requirementNode != null) {
      // IMPORTANT: Convert embedded escaped spaces to simple spaces
      return requirementNode.text.replace("\\\\ ", " ")
    } else {
      return null
    }
  }




//fun getName(element: CwlRequirement): String? = getRequirement(element)
//
//  fun setName(element: CwlRequirement, newName: String): PsiElement {
//    val keyNode: ASTNode? = element.node.findChildByType(CwlTypes.REQUIREMENT)
//    if (keyNode != null) {
//        val requirement: CwlRequirement = createRequirement(element.project, newName)
//        val newKeyNode: ASTNode = requirement.firstChild.node
//      element.node.replaceChild(keyNode, newKeyNode)
//    }
//    return element
//}

fun getNameIdentifier(element: CwlRequirement): PsiElement? {
    val keyNode: ASTNode?  = element.node.findChildByType(CwlTypes.REQUIREMENT)
    if (keyNode != null) {
      return keyNode.psi
    } else {
      return null
    }
}

 fun getPresentation(element: CwlRequirement): ItemPresentation {
    return object : ItemPresentation {

      override fun getPresentableText(): String{
        return element.text
      }

      override fun getLocationString() : String?{
          return element.containingFile?.name
      }

      override fun getIcon(unused: Boolean): Icon {
        return CwlIcons.FILE
      }
    }
}


fun getName(element: CwlCommandInputParameter): String? {
    return getIdentifier(element)
}


fun setName(element: CwlCommandInputParameter, newName: String): PsiElement {
    val identifierNode: ASTNode? = element.node.findChildByType(CwlTypes.IDENTIFIER)
    if (identifierNode != null) {
        val commandInputParameter: CwlCommandInputParameter = CwlElementFactory.createCommandInputParameter(element.project, newName)
        val newIdentifierNode: ASTNode = commandInputParameter.firstChild.node
        element.node.replaceChild(identifierNode, newIdentifierNode)
    }
    return element
}

fun getNameIdentifier(element: CwlCommandInputParameter): PsiElement? {
    val identifierNode: ASTNode? = element.node.findChildByType(CwlTypes.IDENTIFIER)
    return identifierNode?.psi
}

fun getIdentifier(element: CwlCommandInputParameter): String? {
    return element.node.findChildByType(CwlTypes.IDENTIFIER)?.text?.replace("\\\\ ", " ")
}