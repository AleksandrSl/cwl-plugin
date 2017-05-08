package com.cwlplugin.highlighter;

import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by aleksandrsl on 07.05.17.
 */
public class CwlSyntaxHighlighterFactory extends SyntaxHighlighterFactory {

    @NotNull
    @Override
    public SyntaxHighlighter getSyntaxHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile) {
        return new CwlSyntaxHighlighter();
    }
}

//package com.cwlplugin.highlighter
//
//class CwlSyntaxHighlighterFactory : com.intellij.openapi.fileTypes.SyntaxHighlighterFactory() {
//
//    override fun getSyntaxHighlighter(project: com.intellij.openapi.project.Project?, virtualFile: com.intellij.openapi.vfs.VirtualFile?): com.intellij.openapi.fileTypes.SyntaxHighlighter {
//        return CwlSyntaxHighlighter()
//    }
//}