package br.com.uallace.session07.OpOverloading

data class Coordinates(var x: Int, var y: Int){

    operator fun plus(other: Coordinates) : Coordinates {
        return Coordinates(x + other.x, y + other.y)
    }

}
