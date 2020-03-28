package intellij.class9.collections.exercise3.kotlin

class Prova {
    fun somaTotal(conjuntoDeInteiros: Set<Int>) {
        var soma = 0
        for (item in conjuntoDeInteiros) {
            soma += item
        }
        println("Valor total da soma = $soma")
    }
}