package br.com.uallace.session07.destructuring

import br.com.uallace.session07.OpOverloading.Coordinates

fun main(){

    showComponets()


    val c1 = Coordinates(200, 100)
    val c2 = Coordinates(1000, 2000)
    val c3 = c1 + c2

    println(c3)

    val (xCoordinate,yCoordinate) = c3

    //println("xCoordinate = $xCoordinate, yCoordinate = $yCoordinate")
    println("xCoordinate = $xCoordinate = ${c3.component1()}")

}

fun showComponets(){

    val myPoint = Point(5000, 500,60000)
    val (myX, myY, myZ) = myPoint

    println("myX = $myX , myY = $myY , myZ = $myZ")

}