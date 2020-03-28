package intellij.class9.collections.exercise4.kotlin

import java.util.HashMap

class GuardaVolumes {
    private var contador = 0
    private var lockers = HashMap<Int, List<Peca>>()

    fun guardarPecas(listaDePeca: List<Peca>): Int {
        lockers.put(contador, listaDePeca)
        println("Identificador número: $contador")
        contador++
        return contador
    }

    fun mostrarPecas() {
        for (chave in lockers.keys) {
            val lista = lockers[chave]
            println("Guarda Volume $chave tem:")
            lista?.let {
                for (itemList in lista) {
                    println("Peça: " + itemList.marca + ", " + itemList.modelo)
                }
            }
        }
    }

    fun mostrarPecas(numero: Int) {
        val lista = lockers[numero]
        println("No Guarda Volume $numero tem: ")
        lista?.let {
            for (itemList in it) {
                println("Peça: " + itemList.marca + ", " + itemList.modelo)
            }
        }
    }

    fun devolverPecas(numero: Int) {
        val lista = lockers.remove(numero)
        println("Guarda Volume $numero")
        lista?.let {
            for (itemList in it) {
                println("Peça: " + itemList.marca + ", " + itemList.modelo + " devolvida")
            }
        }

    }
}