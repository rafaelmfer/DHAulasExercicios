//package androidstudio.orderby.kotlin
//
//import android.os.Parcelable
//import kotlinx.android.parcel.Parcelize
//
//inline fun <reified Type : Parcelable> Collection<Type>.orderBy(field: String) =
//    LinkedHashSet<Type>(sortedBy { Type::class.java.getDeclaredField(field).name })
//
//@Parcelize
//data class Pessoa(
//    val name: String = "",
//    val lastName: String = "",
//    val idade: Int = 0
//) : Parcelable
//
//val lista: MutableSet<Pessoa> = mutableSetOf(
//    Pessoa("Cleber", "Araujo", 13),
//    Pessoa("Junior", "Rubens", 21),
//    Pessoa("Zacarias", "Clara", 10),
//    Pessoa("Maria", "Joaquina", 15)
//)
//
//fun main() {
//
//    println(lista.orderBy("name"))
//}