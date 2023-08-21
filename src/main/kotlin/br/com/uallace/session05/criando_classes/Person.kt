package br.com.uallace.session05.criando_classes

// podemos criar o construtor dessas duas formas
//class Person constructor (firstName:  String, lastName:  String){
//}


// o padrao é nao declarar nada dentro do construtor, se necessario podemos usar init
//class Person (firstName:  String, lastName:  String){
//
//    init {
//        println("create a person named $firstName $lastName")
//    }
//}

// quando precisar de um modificar de visibilidade, nesse caso o constructor tem mais parametro e acessa atributos do primeiro construtor
class Person internal constructor (firstName:  String, lastName:  String){

    init {
        println("Created a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String) :
        this(firstName, lastName)

}