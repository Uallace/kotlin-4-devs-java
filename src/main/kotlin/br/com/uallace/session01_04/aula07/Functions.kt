package br.com.uallace.session01_04.aula07


fun main(){
    println("10 + 20 = ${myMathFunction(10 , 20)}")
    println("15 + 25 = ${myExpressionBodyFunction(15 , 25)}")
    println("10 + 10 = ${myExpressionBodyFunctionWithReference(10 , 10)}")
    println("10 + 10 = ${myFuctionWithDefaults(10 , 10)}")
    println("10 + 10 = ${myFuctionWithDefaults(10 , 10, "Hello")}")
    println("Default SUM = ${myFuctionWithDefaults( message = "Hello")}")

}

fun myMathFunction(number1: Int, number2: Int): Int{
    return number1 + number2
}

// pode ser feito dessa maneira tambem
fun myExpressionBodyFunction(number1: Int, number2: Int): Int = number1 + number2

// dessa maneira tambem funciona, ele reconhece os tipos da funcão
fun myExpressionBodyFunctionWithReference(number1: Int, number2: Int) = number1 + number2

// pode ser feito com valores por default
fun myFuctionWithDefaults(number1: Int = 1, number2: Int = 5, message: String = "Hi") : Int {
    val result = number1 + number2
    println(message)
    return result
}