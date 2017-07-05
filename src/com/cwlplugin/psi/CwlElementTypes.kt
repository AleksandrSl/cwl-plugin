package com.cwlplugin.psi

import com.cwlplugin.CwlFileType
import com.cwlplugin.psi.impl.*
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import com.intellij.psi.StubBasedPsiElement
import com.intellij.psi.stubs.*

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
object CwlElementTypes {

    val REQUIREMENTS_BLOCK = CwlElementType("REQUIREMENTS_BLOCK", CwlRequirementsBlockImpl::class.java)
    val TARGET_REQUIREMENTS_BLOCK: CwlStubElementType<CwlTargetRequirementsBlockStub, CwlTargetRequirementsBlock> = CwlTargetRequirementsBlockElementType()
    val REQUIREMENT_LIST = CwlElementType("REQUIREMENT_LIST", CwlRequirementListImpl::class.java)

    // Requirements
    val INLINE_JAVASCRIPT_REQUIREMENT = CwlElementType("INLINE_JAVASCRIPT_REQUIREMENT", CwlInlineJavascriptRequirementImpl::class.java)
    val DOCKER_REQUIREMENT = CwlElementType("DOCKER_REQUIREMENT", CwlDockerRequirementImpl::class.java)
    val SCHEMA_DEF_REQUIREMENT = CwlElementType("SCHEMA_DEF_REQUIREMENT", CwlSchemaDefRequirementImpl::class.java)
    val INITIAL_WORKDIR_REQUIREMENT = CwlElementType("INITIAL_WORKDIR_REQUIREMENT", CwlInitialWorkDirRequirementImpl::class.java)
    val RESOURCE_REQUIREMENT = CwlElementType("RESOURCE_REQUIREMENT", CwlResourceRequirementImpl::class.java)
    val ENV_VAR_REQUIREMENT = CwlElementType("ENV_VAR_REQUIREMENT", CwlEnvVarRequirementImpl::class.java)
    val SHELL_COMMAND_REQUIREMENT = CwlElementType("SHELL_COMMAND_REQUIREMENT", CwlShellCommandRequirementImpl::class.java)
    val SOFTWARE_REQUIREMENT = CwlElementType("SOFTWARE_REQUIREMENT", CwlSoftwareRequirementImpl::class.java)

    val VERSION = CwlElementType("VERSION", CwlVersionImpl::class.java)
    val INPUTS = CwlElementType("INPUTS", CwlInputsImpl::class.java)
    val OUTPUTS = CwlElementType("OUTPUTS", CwlOutputsImpl::class.java)
    val COMMAND_LINE_TOOL_CLASS = CwlElementType("COMMAND_LINE_TOOL_CLASS", CwlCommandLineToolClassImpl::class.java)
    val BASE_COMMAND = CwlElementType("BASE_COMMAND", CwlBaseCommandImpl::class.java)
    val ID = CwlElementType("ID", CwlIdImpl::class.java)
    val LABEL = CwlElementType("LABEL", CwlLabelImpl::class.java)
    val DOC = CwlElementType("DOC",CwlDocImpl::class.java)
    val HINTS = CwlElementType("HINTS",CwlHintsImpl::class.java)
    val ARGUMENTS = CwlElementType("ARGUMENTS", CwlArgumentsImpl::class.java)
    val STDERR = CwlElementType("STDERR", CwlStderrImpl::class.java)
    val STDIN = CwlElementType("STDIN", CwlStdinImpl::class.java)
    val STDOUT = CwlElementType("STDOUT", CwlStdoutImpl::class.java)
    val SUCCESS_CODES = CwlElementType("SUCCESS_CODES", CwlSuccessCodesImpl::class.java)
    val TEMPORARY_FAIL_CODES = CwlElementType("TEMPORARY_FAIL_CODES", CwlTemporaryFailCodesImpl::class.java)
    val PERMANENT_FAIL_CODES = CwlElementType("PERMANENT_FAIL_CODES", CwlPermanentFailCodesImpl::class.java)
    val COMMAND_INPUT_PARAMETER  = CwlElementType("COMMAND_INPUT_PARAMETER", CwlCommandInputParameterImpl::class.java)


    val DEFAULT = CwlElementType("DEFAULT", CwlDefaultImpl::class.java)
    val FORMAT = CwlElementType("FORMAT", CwlFormatImpl::class.java)
    val INPUT_BINDING = CwlElementType("INPUT_BINDING", CwlInputBindingImpl::class.java)
    val SECONDARY_FILES = CwlElementType("SECONDARY_FILES", CwlSecondaryFilesImpl::class.java)
    val STREAMABLE = CwlElementType("STREAMABLE", CwlStreamableImpl::class.java)
    val TYPE = CwlElementType("TYPE", CwlTypeImpl::class.java)

    // InputBindingFields
    val LOAD_CONTENTS = CwlElementType("LOAD_CONTENTS", CwlLoadContentsImpl::class.java)
    val VALUE_FROM = CwlElementType("VALUE_FROM", CwlValueFromImpl::class.java)
    val POSITION = CwlElementType("POSITION", CwlPositionImpl::class.java)
    val SEPARATE = CwlElementType("SEPARATE", CwlSeparateImpl::class.java)
    val ITEM_SEPARATOR = CwlElementType("ITEM_SEPARATOR", CwlItemSeparator::class.java)
    val PREFIX = CwlElementType("PREFIX", CwlPrefixImpl::class.java)
    val SHELL_QUOTE = CwlElementType("SHELL_QUOTE", CwlShellQuoteImpl::class.java)

    val MULTI_LINE_STRING = CwlElementType("MULTI_LINE_STRING", CwlMultiLineStringImpl::class.java)

}

class CwlTargetRequirementsBlockElementType
    : CwlStubElementType<CwlTargetRequirementsBlockStub,
        CwlTargetRequirementsBlock>("TARGET_REQUIREMENTS_BLOCK") {

    override fun serialize(stub: CwlTargetRequirementsBlockStub, stream: StubOutputStream) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createPsi(stub: CwlTargetRequirementsBlockStub): CwlTargetRequirementsBlock {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createStub(psi: CwlTargetRequirementsBlock, parentStub: StubElement<*>?): CwlTargetRequirementsBlockStub {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createElement(node: com.intellij.lang.ASTNode): PsiElement {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deserialize(stream: StubInputStream, stub: StubElement<*>?): CwlTargetRequirementsBlockStub {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

interface CwlTargetRequirementsBlockStub : NamedStub<CwlTargetRequirementsBlock>

interface CwlTargetRequirementsBlock : PsiNamedElement, StubBasedPsiElement<CwlTargetRequirementsBlockStub>, CwlElement {
    companion object {
        val EMPTY_ARRAY = arrayOfNulls<CwlTargetRequirementsBlock>(0)
    }
}

abstract class CwlStubElementType<StubT : StubElement<*>, PsiT : CwlElement>(debugName: String)
    : IStubElementType<StubT, PsiT>(debugName, CwlFileType.language) {

    override fun toString(): String = "CWL:${super.toString()}"

    abstract fun createElement(node: com.intellij.lang.ASTNode): PsiElement

    override fun indexStub(stub: StubT, sink: IndexSink): Unit {
    }

    override fun getExternalId(): String = "CWL.${super.toString()}"
}
