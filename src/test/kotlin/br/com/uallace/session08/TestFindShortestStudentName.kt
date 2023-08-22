package br.com.uallace.session08

import br.com.uallace.session08.desafio.Student
import br.com.uallace.session08.desafio.findTheShortestStudentName
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class TestFindShortestStudentName {

        @Test
        fun `Find shortest student name should be equal 'Ada'`() {

            val students = listOf(
                Student("Ada", 19),
                Student("Manoel", 23),
                Student("Maria", 20),
                Student("João", 39),
                Student("José", 16)
            )
            findTheShortestStudentName(students)?.name shouldBeEqualTo "Ada"
        }

}