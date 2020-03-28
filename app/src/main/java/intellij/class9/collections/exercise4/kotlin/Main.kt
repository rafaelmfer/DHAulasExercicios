package intellij.class9.collections.exercise4.kotlin

fun main(args: Array<String>) {
    val pecaNike: Peca = object : Peca("Nike", "Camiseta P") {
        override fun retirada() {}
    }
    val pecaAdidas: Peca = object : Peca("Adidas", "Calça P") {
        override fun retirada() {}
    }
    val pecaPuma: Peca = object : Peca("Puma", "Tênis 37/38") {
        override fun retirada() {}
    }

    GuardaVolumes().apply {
        guardarPecas(listOf(pecaNike, pecaAdidas))
        guardarPecas(listOf(pecaPuma))
        mostrarPecas()
        mostrarPecas(0)
        devolverPecas(0)
    }
}
