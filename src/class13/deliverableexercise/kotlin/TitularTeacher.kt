package class13.deliverableexercise.kotlin

class TitularTeacher(
    name: String,
    lastName: String,
    houseTime: Int,
    teacherCode: Int,
    var specialty: String
) :
    Teacher(name, lastName, houseTime, teacherCode)