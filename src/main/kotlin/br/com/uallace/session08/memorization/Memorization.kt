package br.com.uallace.session08.memorization

import org.funktionale.memoization.memoize

fun main() {

    var fibonacci: (Long) -> Long = {it}

    fibonacci = {n: Long ->

        if(n < 2) n else fibonacci(n - 1) + fibonacci(n - 2)

    }

    var m: (Long) -> Long = {it}

    m = {n: Long ->

        if(n < 2) n else m(n - 1) + m(n - 2)

    }.memoize()

    println("Calling fibonacci: ${timeElaspsed {fibonacci (40)}} ms")
    println("Calling memorized fibonacci: ${timeElaspsed { m (40)}} ms")

}

fun timeElaspsed(body: () -> Unit): Long {
    val start = System.currentTimeMillis()
    body()
    val end = System.currentTimeMillis()
    return end - start
}
