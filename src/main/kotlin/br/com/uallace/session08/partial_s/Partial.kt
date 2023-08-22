package br.com.uallace.session08.partial_s

import org.funktionale.partials.partially1
import org.funktionale.partials.partially3

fun main() {

    // _x_
    val prefixAndPosFix: (String, String, String) -> String =
        {prefix: String, x: String, posfix: String -> "${prefix}${x}${posfix}"}

    val prefixAndAlert: (String, String) -> String = prefixAndPosFix.partially3("!")

    val hello: (String) -> String = prefixAndAlert.partially1("Hello, ")

    println(hello("FunkTionale"))
}