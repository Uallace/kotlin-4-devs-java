package br.com.uallace.session06

fun main(){
    val cat = Animal("Frajola","cat", 5)
    println(cat.show())
    val dog = Animal("Thor","dog", 10)
    println(dog.show())

    cat.weight = 6
    println(cat.show())

}