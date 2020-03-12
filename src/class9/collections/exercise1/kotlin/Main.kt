package class9.collections.exercise1.kotlin

import java.util.HashMap

fun main(args: Array<String>) {
    createCollection1()
    createCollection2()
}

private fun createCollection1() {
    val loteriaDosSonhos = HashMap<Int, String>().apply {
        put(0, "Ovos")
        put(1, "Água")
        put(2, "Escopeta")
        put(3, "Cavalo")
        put(4, "Dentista")
        put(5, "Fogos")
    }

    for (chave in loteriaDosSonhos.keys) {
        val item = loteriaDosSonhos[chave]
        println("$chave -> $item")
    }
}

private fun createCollection2() {
    HashMap<String, List<String>>().run {
        put("João", mutableListOf("Juan", "Fissura", "Maromba"))
        put("Miguel", mutableListOf("Night Watch", "Bruce Wayne", "Tampinha"))
        put("Maria", mutableListOf("Wonder Woman", "Mary", "Marilene"))
        put("Lucas", mutableListOf("Lukinha", "Jorge", "George"))

        for (chave2 in this.keys) {
            val item = this[chave2]
            println("$chave2 -> $item")
        }
    }
}