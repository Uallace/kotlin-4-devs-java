package br.com.uallace.session08.currying

import org.funktionale.currying.curried

fun main() {

    val sum3Ints = { x: Int, y: Int, z: Int -> x + y + z}

    val curried: (Int) -> (Int) -> (Int) -> Int = sum3Ints.curried()
    val curriedResult = curried(2)(4)(6)

    println("curried(2)(4)(6) = $curriedResult")
}