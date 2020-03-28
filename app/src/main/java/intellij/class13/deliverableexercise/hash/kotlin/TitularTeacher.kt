package intellij.class13.deliverableexercise.hash.kotlin

import class13.deliverableexercise.hash.kotlin.Teacher

class TitularTeacher(
    name: String,
    lastName: String,
    houseTime: Int,
    teacherCode: Int,
    var specialty: String
) :
    Teacher(name, lastName, houseTime, teacherCode)