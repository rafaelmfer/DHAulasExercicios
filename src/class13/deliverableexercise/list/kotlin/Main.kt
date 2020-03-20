package class13.deliverableexercise.list.kotlin

fun main() {
        DigitalHouseManager().run {
            
        registerTitularTeacher("Yuri", "Kayel", 1001, "Android")
        registerTitularTeacher("Jessica", "Corrêa", 1002, "Android")
        println()
        registerAssistantTeacher("Ivan", "Alineri", 2001, 150)
        registerAssistantTeacher("João", "Felipe", 2002, 100)
        println()
        registerCourse("Full Stack", 20001, 3)
        registerCourse("Android", 20002, 2)
        println()
        allocateTeachers(20001, 1002, 2002)
        allocateTeachers(20002, 1001, 2001)
        println()
        enrollingStudent("Robson", "Hamilton", 105)
        enrollingStudent(105, 20001)
        enrollingStudent("Alex", "Graciano", 102)
        enrollingStudent(102, 20001)
        println()
        enrollingStudent("Rafael", "Ferreira", 101)
        enrollingStudent(101, 20002)
        enrollingStudent("Raquel", "Campos", 103)
        enrollingStudent(103, 20002)
        println()
        enrollingStudent("Danny", "Phantom", 104)
        enrollingStudent(104, 20002)
    }
}