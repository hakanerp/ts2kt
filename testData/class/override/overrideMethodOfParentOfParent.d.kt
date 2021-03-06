@file:JsQualifier("TypeScript.Syntax")
package overrideMethodOfParentOfParent.TypeScript.Syntax

external open class EmptySyntaxList : ISyntaxList {
    override fun kind(): SyntaxKind = definedExternally
}

// ------------------------------------------------------------------------------------------
@file:JsQualifier("TypeScript")
package overrideMethodOfParentOfParent.TypeScript

external interface ISyntaxElement {
    fun kind(): SyntaxKind
}
external interface ISyntaxList : ISyntaxElement {
    fun childAt(index: Number): ISyntaxNodeOrToken
    fun toArray(): Array<ISyntaxNodeOrToken>
    fun insertChildrenInto(array: Array<ISyntaxElement>, index: Number)
}
