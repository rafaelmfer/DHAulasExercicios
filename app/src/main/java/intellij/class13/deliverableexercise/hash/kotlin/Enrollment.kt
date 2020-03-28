package class13.deliverableexercise.hash.kotlin

import java.util.Date

data class Enrollment(
    var student: Student,
    var course: Course
) {
    private var dateOfTheDay: Date = Date()
}