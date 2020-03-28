package intellij.class13.deliverableexercise.list.kotlin

import class13.deliverableexercise.list.kotlin.Course
import java.util.Date

data class Enrollment(
    var student: Student,
    var course: Course
) {
    private var dateOfTheDay: Date = Date()
}