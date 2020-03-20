package class13.deliverableexercise.hash.kotlin

class DigitalHouseManager {
    private var studentsHashMap = hashMapOf<Int, Student>()
    private var teachersHashMap = hashMapOf<Int, Teacher>()
    private var coursesHashMap = hashMapOf<Int, Course>()
    private var enrollmentsHashSet = hashSetOf<Enrollment>()

    fun registerCourse(name: String, courseCode: Int, maxQuantityStudents: Int) {
        coursesHashMap[courseCode] = Course(name, courseCode, maxQuantityStudents)
        println("Curso $name registrado na Digital House.")
    }

    fun removeCourse(courseCode: Int) {
        for (course in coursesHashMap) {
            if (course.key == courseCode) {
                println("Curso " + course.value + " removido.")
                coursesHashMap.remove(courseCode)
            }
        }

    }

    fun registerAssistantTeacher(name: String, lastName: String, teacherCode: Int, quantityMonitoringHours: Int) {
        teachersHashMap[teacherCode] = AssistantTeacher(name, lastName, 0, teacherCode, quantityMonitoringHours)
        println("Professor Adjunto '$name $lastName' registrado na Digital House.")
    }

    fun registerTitularTeacher(name: String, lastName: String, teacherCode: Int, specialty: String) {
        teachersHashMap[teacherCode] = TitularTeacher(name, lastName, 0, teacherCode, specialty)
        println("Professor Titular '$name $lastName' registrado na Digital House.")
    }

    fun removeTeacher(teacherCode: Int) {
        for (teacher in teachersHashMap) {
            if (teacher.key == teacherCode) {
                teachersHashMap.remove(teacherCode)
            }
        }
    }

    fun enrollingStudent(name: String, lastName: String, studentCode: Int) {
        studentsHashMap[studentCode] = Student(name, lastName, studentCode)
    }

    fun enrollingStudent(studentCode: Int, courseCode: Int) {
        val course = coursesHashMap[courseCode]
        val student = studentsHashMap[studentCode]

        if (course != null && student != null) {
            if (course.addStudent(student)) {
                enrollmentsHashSet.add(Enrollment(student, course))
                println("Matrícula realizada. Aluno " + student.toString() + " adicionado no Curso " + course.name)
            } else {
                println("Não foi possível realizar a matrícula. Curso " + course.name + " lotado.")
            }
        }
    }

    fun allocateTeachers(courseCode: Int, titularTeacherCode: Int, assistantTeacherCode: Int) {
        var titularTeacher = teachersHashMap[titularTeacherCode]
        var assistantTeacher = teachersHashMap[assistantTeacherCode]
        val course = coursesHashMap[courseCode]
        course.apply {
            titularTeacher = (titularTeacher as TitularTeacher)
            assistantTeacher = (assistantTeacher as AssistantTeacher)
        }
        println("Professor Titular " + titularTeacher.toString() + " e Professor Adjunto " + assistantTeacher.toString() + " alocado no Curso " + course?.name)
    }
}