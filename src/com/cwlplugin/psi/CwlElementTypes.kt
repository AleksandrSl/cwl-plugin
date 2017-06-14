//package com.cwlplugin.psi
//
//import com.cwlplugin.CwlLanguage
//import com.cwlplugin.parser.CwlParser
//import com.intellij.lang.ASTNode
//import com.intellij.lang.LanguageParserDefinitions
//import com.intellij.lang.LighterASTNode
//import com.intellij.lang.ParserDefinition
//import com.intellij.lang.PsiBuilder
//import com.intellij.lang.PsiBuilderFactory
//import com.intellij.openapi.project.Project
//import com.intellij.psi.PsiElement
//import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider.getLanguage
//import com.intellij.psi.stubs.IStubElementType
//import com.intellij.psi.tree.ILightStubFileElementType
//import com.intellij.util.diff.FlyweightCapableTreeStructure
//
///**
// * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
// */
//object CwlElementTypes {
//
//    val LANG: CwlLanguage = CwlLanguage
//
//    val FILE: ILightStubFileElementType<*> = ILightStubFileElementType(CwlLanguage.id) {
//        fun parseContentsLight(chameleon: ASTNode) : FlyweightCapableTreeStructure<LighterASTNode> {
//            val psi: PsiElement? = chameleon.psi
//            assert(psi != null){"Bad chameleon: $chameleon"}
//
//            val project: Project = psi.project
//            val factory: PsiBuilderFactory = PsiBuilderFactory.getInstance()
//            val builder: PsiBuilder = factory.createBuilder(project, chameleon)
//            val parserDefenition: ParserDefinition? = LanguageParserDefinitions.INSTANCE.forLanguage(getLanguage())
//            assert( parserDefenition != null){this}
//            val parser : CwlParser = CwlParser()
//            return parser.parseLight(this, builder)
//        }
//    }
//    val REQUIREMENTS: IStubElementType<*, *> = CwlStubElementType()
//
//
//}