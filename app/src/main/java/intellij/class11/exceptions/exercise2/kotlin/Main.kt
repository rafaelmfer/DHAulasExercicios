package intellij.class11.exceptions.exercise2.kotlin

import java.util.ArrayList

fun main(args: Array<String>) {
    val arrayStrings: ArrayList<String>? = null
    try {
        arrayStrings!!.add("Pato")
        arrayStrings.add("Cachorro")
        arrayStrings.add("Gato")
        println(arrayStrings[2])
    } catch (exception: NullPointerException) {
        println("ArrayList não criado corretamente, por isso o " + exception.message)
    }

    val arrayStrings2: MutableList<String> = ArrayList()
    arrayStrings2.add("Pato")
    arrayStrings2.add("Cachorro")
    arrayStrings2.add("Gato")
    try {
        println(arrayStrings2[5])
    } catch (exception: IndexOutOfBoundsException) {
        println(exception.message)
    }
}
