package class11.exceptions.exercise1.kotlin

fun main(args: Array<String>) {
    val arrayStrings = arrayOf("Pato", "Cachorro", "Gato")
    try {
        println(arrayStrings[3])
    } catch (exception: IndexOutOfBoundsException) {
        println(exception.message)
    }
}
