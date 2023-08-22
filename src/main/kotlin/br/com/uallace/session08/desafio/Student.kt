package br.com.uallace.session08.desafio

data class Student(val name: String, var age: Int)

fun findTheShortestStudentName(students: List<Student>): Student? {
    return students.minByOrNull { it.name.length }
}