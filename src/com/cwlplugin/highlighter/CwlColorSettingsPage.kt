package com.cwlplugin.highlighter

import com.cwlplugin.icons.CwlIcons
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon

/**
 * Created by aleksandrsl on 08.05.17.
 */
class CwlColorSettingsPage: ColorSettingsPage {

    companion object {

        private val DESCRIPTORS: Array<AttributesDescriptor> = arrayOf(
                AttributesDescriptor("Doc", CwlSyntaxHighlighter.DOC),
                AttributesDescriptor("Separator", CwlSyntaxHighlighter.SEPARATOR),
                AttributesDescriptor("Inputs", CwlSyntaxHighlighter.INPUTS),
                AttributesDescriptor("Outputs", CwlSyntaxHighlighter.OUTPUTS),
                AttributesDescriptor("Requirements", CwlSyntaxHighlighter.REQUIREMENTS),
                AttributesDescriptor("Value", CwlSyntaxHighlighter.VALUE),
                AttributesDescriptor("Key", CwlSyntaxHighlighter.KEY)
        )
    }

    override fun getHighlighter(): SyntaxHighlighter = CwlSyntaxHighlighter()

    override fun getAdditionalHighlightingTagToDescriptorMap(): MutableMap<String, TextAttributesKey> =
            mutableMapOf()

    override fun getIcon(): Icon? = CwlIcons.FILE

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> = DESCRIPTORS

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName(): String = "CWL"

    override fun getDemoText(): String =
            """cwlVersion: v1.0
class: CommandLineTool
label: Matadata Injector strings wrapper
doc: |
  Insert metadata strings into vcf file

requirements:
  - class: InlineJavascriptRequirement
  - class: DockerRequirement
    dockerPull: dockerhub.corp.parseq.pro/metadata_injector:latest

baseCommand: [metadata_injector.py, str]

inputs:
  input_vcf:
    type: File
    inputBinding:
      position: 1
      prefix: -i
  strings:
    type: string[]?
    inputBinding:
      position: 1
      prefix: -s
  strings_file:
    type: File?
    inputBinding:
      position: 1
      prefix: -f
  output_file_name:
    type: string
    inputBinding:
      position: 1
      prefix: -o
      valueFrom: |
        $( self ? self : inputs.input_vcf.basename)
    default: ""

outputs:
  extended_vcf:
    type: File
    outputBinding:
      glob: |
        $( self ? self : inputs.input_vcf.basename)"""
}