package intellij.class13.deliverableexercise.list.kotlin

abstract class Teacher(var name: String, var lastName: String, var houseTime: Int, var teacherCode: Int) {

    //Equals padrão que compara o objeto inteiro
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//        other as Teacher
//        if (name != other.name) return false
//        if (lastName != other.lastName) return false
//        if (houseTime != other.houseTime) return false
//        if (teacherCode != other.teacherCode) return false
//        return true
//    }

    //Equals que compara apenas o Código do Professor do objeto
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        val teacher = other as Teacher
        return teacherCode == teacher.teacherCode
    }

    override fun toString(): String {
        return "'$name $lastName'"
    }
}