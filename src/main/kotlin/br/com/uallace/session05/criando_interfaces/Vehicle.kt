package br.com.uallace.session05.criando_interfaces

interface Vehicle {

    val automakeName: String

    fun start(){
        println("Vruuummmm")
    }

    fun stop(){
        println("Brake noise")
    }

    fun getKmPerLiter(): Int {
        return 17
    }

    fun getDoors(): Int

}