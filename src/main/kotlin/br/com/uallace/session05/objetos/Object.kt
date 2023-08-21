package br.com.uallace.session05.objetos

// declaracao de objetos em kotlin
fun main(){

//
//    var location1 = object {
//        var xCoordinate = 200
//        var yCoordinate = 400
//    }
//
//    println("Coordinate = (${location1.xCoordinate},${location1.yCoordinate})")


    // com funcao
    var location = object {
        var xCoordinate = 200
        var yCoordinate = 400

        fun printIt(){
            println("Coordinate = ($xCoordinate,$yCoordinate)")
        }
    }

    location.printIt()

    // alterando os valores
    location.xCoordinate = 3000
    location.yCoordinate = 6000

    location.printIt()

    var temperature = mySingleton.getLastTemperature()
    println("Last temperature measured = $temperature degress!")
}

// pega ultima temperatura atraves da funcao getlastTemperature
object mySingleton {
    var temperatures = arrayOf(18, 22, 26)
    fun getLastTemperature() = temperatures.last()
}