@JsExport
fun start(): String {
    return DateArithmetic.month(Date())
}

@JsExport
fun revAndCap(s: String): String {
    return s.reversed().capitalize()
}

@JsExport
data class Foo(val s: String) {
    fun revS(): String {
        return s.reversed()
    }
}

@JsModule("date-arithmetic")
@JsNonModule
external object DateArithmetic {
    fun month(date: Date): String
}

external class Date()