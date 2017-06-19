package com.cwlplugin.psi.impl

import com.cwlplugin.psi.CwlDefault
import com.cwlplugin.psi.CwlElement
import com.cwlplugin.psi.CwlFormat
import com.cwlplugin.psi.CwlInputBinding
import com.cwlplugin.psi.CwlItemSeparator
import com.cwlplugin.psi.CwlLoadContents
import com.cwlplugin.psi.CwlPosition
import com.cwlplugin.psi.CwlPrefix
import com.cwlplugin.psi.CwlSecondaryFiles
import com.cwlplugin.psi.CwlSeparate
import com.cwlplugin.psi.CwlShellQuote
import com.cwlplugin.psi.CwlStreamable
import com.cwlplugin.psi.CwlType
import com.cwlplugin.psi.CwlValueFrom
import com.intellij.lang.ASTNode

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class CwlDefaultImpl(node : ASTNode): CwlElementImpl(node), CwlDefault
class CwlFormatImpl(node : ASTNode): CwlElementImpl(node), CwlFormat
class CwlInputBindingImpl(node : ASTNode): CwlElementImpl(node), CwlInputBinding
class CwlSecondaryFilesImpl(node : ASTNode): CwlElementImpl(node), CwlSecondaryFiles
class CwlStreamableImpl(node : ASTNode): CwlElementImpl(node), CwlStreamable
class CwlTypeImpl(node : ASTNode): CwlElementImpl(node), CwlType

// InputBindingFields
class CwlLoadContentsImpl(node : ASTNode): CwlElementImpl(node), CwlLoadContents
class CwlValueFromImpl(node : ASTNode): CwlElementImpl(node), CwlValueFrom
class CwlPositionImpl(node : ASTNode): CwlElementImpl(node), CwlPosition
class CwlSeparateImpl(node : ASTNode): CwlElementImpl(node), CwlSeparate
class CwlItemSeparatorImpl(node : ASTNode): CwlElementImpl(node), CwlItemSeparator
class CwlPrefixImpl(node : ASTNode): CwlElementImpl(node), CwlPrefix
class CwlShellQuoteImpl(node : ASTNode): CwlElementImpl(node), CwlShellQuote