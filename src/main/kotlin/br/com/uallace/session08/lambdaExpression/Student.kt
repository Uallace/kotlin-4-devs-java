package br.com.uallace.session08.lambdaExpression

data class Student(val name: String, val age: Int)

fun getStudents(): List<Student> {
    return listOf(
        Student("Flavio", 19),
        Student("Rebeca", 20),
        Student("Maria", 23),
        Student("Walter", 18),
        Student("Sergio", 21)
    )
}