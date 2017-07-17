package com.cwlplugin.psi

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
interface CwlDefault : CwlElement

interface CwlFormat : CwlElement
interface CwlInputBinding : CwlElement
interface CwlSecondaryFiles : CwlElement
interface CwlStreamable : CwlElement
interface CwlType : CwlElement

// InputBindingFields
interface CwlLoadContents : CwlElement

interface CwlValueFrom : CwlElement
interface CwlPosition : CwlElement
interface CwlSeparate : CwlElement
interface CwlItemSeparator : CwlElement
interface CwlPrefix : CwlElement
interface CwlShellQuote : CwlElement