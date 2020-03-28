package class13.deliverableexercise.hash.kotlin

import class13.deliverableexercise.list.kotlin.Course
import intellij.class13.deliverableexercise.hash.kotlin.TitularTeacher

class Course(var name: String, var courseCode: Int, var maxQuantityStudents: Int) {
    lateinit var titularTeacher: TitularTeacher
    lateinit var assistantTeacher: AssistantTeacher
    private var studentsHashMap = hashMapOf<Int, Student>()

    fun addStudent(student: Student): Boolean {
        return if (studentsHashMap.size < maxQuantityStudents) {
            studentsHashMap[student.studentCode] = student
            true
        } else {
            false
        }
    }

    fun removeStudent(student: Student) {
        studentsHashMap.remove(student.studentCode)
        println("Aluno Removido do Curso $name")
    }

    //Equals padrão que compara o objeto inteiro
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//        other as Course
//        if (name != other.name) return false
//        if (courseCode != other.courseCode) return false
//        if (maxQuantityStudents != other.maxQuantityStudents) return false
//        return true
//    }

    //Equals que compara apenas o Código do Curso do objeto
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        val course = other as Course
        return courseCode == course.courseCode
    }

}