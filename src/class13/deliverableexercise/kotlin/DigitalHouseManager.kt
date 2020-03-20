package class13.deliverableexercise.kotlin

class DigitalHouseManager {
    private var studentList = mutableListOf<Student>()
    private var teacherList = mutableListOf<Teacher>()
    private var courseList = mutableListOf<Course>()
    private var enrollmentList = mutableListOf<Enrollment>()

    fun registerCourse(name: String, courseCode: Int, maxQuantityStudents: Int) {
        courseList.add(Course(name, courseCode, maxQuantityStudents))
        println("Curso $name registrado na Digital House.")
    }

    fun removeCourse(courseCode: Int) {
        for (course in courseList) {
            if (course.courseCode == courseCode) {
                println("Curso " + course.name + " removido.")
                courseList.remove(course)
            }
        }
    }

    fun registerAssistantTeacher(name: String, lastName: String, teacherCode: Int, quantityMonitoringHours: Int) {
        teacherList.add(AssistantTeacher(name, lastName, 0, teacherCode, quantityMonitoringHours))
        println("Professor Adjunto '$name $lastName' registrado na Digital House.")
    }

    fun registerTitularTeacher(name: String, lastName: String, teacherCode: Int, specialty: String) {
        teacherList.add(TitularTeacher(name, lastName, 0, teacherCode, specialty))
        println("Professor Titular '$name $lastName' registrado na Digital House.")
    }

    fun removeTeacher(teacherCode: Int?) {
        for (teacher in teacherList) {
            if (teacher.teacherCode == teacherCode) {
                teacherList.remove(teacher)
            }
        }
    }

    fun enrollingStudent(name: String, lastName: String, studentCode: Int) {
        studentList.add(Student(name, lastName, studentCode))
    }

    fun enrollingStudent(studentCode: Int, courseCode: Int) {
        val course = getCourseInList(courseCode, courseList)
        val student = getStudentInList(studentCode, studentList)
        if (course.addStudent(student)) {
            enrollmentList.add(Enrollment(student, course))
            println("Matrícula realizada. Aluno " + student.toString() + " adicionado no Curso " + course.name)
        } else {
            println("Não foi possível realizar a matrícula. Curso " + course.name + " lotado.")
        }
    }

    fun allocateTeachers(courseCode: Int, titularTeacherCode: Int, assistantTeacherCode: Int) {
        var titularTeacher = getTeacherInList(titularTeacherCode, teacherList)
        var assistantTeacher = getTeacherInList(assistantTeacherCode, teacherList)
        val course = getCourseInList(courseCode, courseList)
        course.apply {
            titularTeacher = (titularTeacher as TitularTeacher)
            assistantTeacher = (assistantTeacher as AssistantTeacher)
        }
        println("Professor Titular " + titularTeacher.toString() + " e Professor Adjunto " + assistantTeacher.toString() + " alocado no Curso " + course.name)
    }

    private fun getCourseInList(courseCode: Int, courseList: List<Course>): Course {
        lateinit var course: Course
        for (c in courseList) {
            if (c.courseCode == courseCode) {
                course = c
                break
            }
        }
        return course
    }

    private fun getStudentInList(studentCode: Int, studentList: List<Student>): Student {
        lateinit var student: Student
        for (s in studentList) {
            if (s.studentCode == studentCode) {
                student = s
                break
            }
        }
        return student
    }

    private fun getTeacherInList(teacherCode: Int, teacherList: List<Teacher>): Teacher {
        lateinit var teacher: Teacher
        for (t in teacherList) {
            if (t.teacherCode.equals(teacherCode)) {
                teacher = t
                break
            }
        }
        return teacher
    }
}