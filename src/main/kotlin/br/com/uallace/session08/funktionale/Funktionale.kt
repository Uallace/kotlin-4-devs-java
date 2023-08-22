package br.com.uallace.session08.funktionale

import org.funktionale.collections.destructured

fun main() {

    val (head, tail) = listOf(1, 2, 3).destructured()
    println("Head = $head and tail = $tail")

}