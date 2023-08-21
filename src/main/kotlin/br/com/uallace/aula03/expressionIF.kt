package br.com.uallace.aula03


fun main(){

    val myInt = 199
    val aInt: Int = 7

    // é obrigatorio ter a clausula else
    val lowest = if (myInt < aInt) myInt else aInt

    val temp = 26

    val isAirConditionOn = if (temp >= 26) {
        println("It is a warm")
        true
    }else {
        println("It is not warm")
        false
    }

    println("Is the air conditioner on: $isAirConditionOn")

}
