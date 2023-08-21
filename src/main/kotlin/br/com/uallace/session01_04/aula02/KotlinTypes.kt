package br.com.uallace.session01_04.aula02

fun main(){

    //nesse caso nao precisamos definir o tipo, ele assume o tipo de acordo com o que recebe

    val myPhase = "Sou uma string"
    val myPi = 3.14
    val myAnswer = 36

    //nesse caso definimos o tipo das variaveis, por elas nao recebem nada

    val aString: String
    val aDouble: Double
    val aInt: Int

    val myDouble = 1.999
    val myFloat = 1.9F
    val myLong = 99879999007L
    val myInt = 120
    val myShort: Short = 12
    val myByte: Byte = -127

    //nesse caso precisamos forcar a conversao

    val anInt:Int = 7
    val anLong:Long = anInt.toLong()
}