package com.orobator.kotlin.intro.lesson00.solutions

fun main() {
//    Uncomment and fix the compile errors
    var name = "Kendrick"
    name = "Drake"

    var foo: String? = null

    var bar: String? = "foo"
    println("bar's length = ${bar?.length}")
    var barLen: Int = bar?.length ?: 0 // Keep barLen non-nullable
}