package intellij.class9.collections.exercise3.kotlin

import java.util.HashSet

fun main(args: Array<String>) {
    Prova().somaTotal(HashSet<Int>().apply {
        add(1)
        add(5)
        add(6)
        add(7)
        add(8)
        add(9)
        add(10)
        add(4)
        add(2)
        add(3)
    })
}