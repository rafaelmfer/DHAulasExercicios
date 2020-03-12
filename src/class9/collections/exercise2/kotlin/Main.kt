package class9.collections.exercise2.kotlin

import java.util.HashSet

fun main(args: Array<String>) {
    createList()
    createHashSet()
}

private fun createList() {
    val list = mutableListOf("1", "5", "5", "6", "7", "8", "8", "8")
    for (item in list) {
        println(item)
    }
}

private fun createHashSet() {
    HashSet<String>().apply {
        add("1")
        add("5")
        add("6")
        add("7")
        add("8")
        for (valor in this) {
            println(valor)
        }
    }
}