package br.com.uallace.aula01

fun main(args: Array<String>) {

    val name = if(args.isNotEmpty()) args[0] else "Kotlin world"
    println("Hello, $name!!!")

}