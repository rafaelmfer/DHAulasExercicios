package class13.deliverableexercise.kotlin

class AssistantTeacher(
    name: String,
    lastName: String,
    houseTime: Int,
    teacherCode: Int,
    var quantityMonitoringHours: Int
) :
    Teacher(name, lastName, houseTime, teacherCode)