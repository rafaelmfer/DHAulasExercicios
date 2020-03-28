package class13.deliverableexercise.hash.kotlin

class AssistantTeacher(
    name: String,
    lastName: String,
    houseTime: Int,
    teacherCode: Int,
    var quantityMonitoringHours: Int
) :
    Teacher(name, lastName, houseTime, teacherCode)