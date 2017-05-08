package com.cwlplugin
import com.intellij.openapi.fileTypes.*
import org.jetbrains.annotations.NotNull


/**
 * Created by aleksandrsl on 06.05.17.
 */
class CwlFileTypeFactory: FileTypeFactory() {

    override fun createFileTypes(fileTypeConsumer: FileTypeConsumer): Unit {
            fileTypeConsumer.consume(CwlFileType, "cwl")
    }
}

