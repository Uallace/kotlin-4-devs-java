package br.com.uallace.session08.composition

import org.funktionale.composition.compose
import org.funktionale.composition.forwardCompose

fun main() {

    val add5 = {i: Int -> i + 5}
    val multiplyBy2 = {i: Int -> i * 2}
    val multiplyBy2andAdd5 = add5 compose multiplyBy2

    val composeResult = multiplyBy2andAdd5(10)
    println("multiplyBy2andAdd5(10) = $composeResult")

    val add5andMultiplyBy2 = add5 forwardCompose multiplyBy2
    val forwardComposeResult = add5andMultiplyBy2(10)
    println("add5andMultiplyBy2 = $forwardComposeResult")

}