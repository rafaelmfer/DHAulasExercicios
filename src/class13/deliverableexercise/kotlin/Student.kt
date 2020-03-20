package class13.deliverableexercise.kotlin

data class Student(
    var name: String,
    var lastName: String,
    var studentCode: Int
) {

    //Equals padrão que compara o objeto inteiro
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//        other as Student
//        if (name != other.name) return false
//        if (lastName != other.lastName) return false
//        if (studentCode != other.studentCode) return false
//        return true
//    }

    //Equals que compara apenas o Código do Aluno do objeto
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        val student = other as Student
        return studentCode == student.studentCode
    }

    override fun toString(): String {
        return "'$name $lastName'"
    }
}