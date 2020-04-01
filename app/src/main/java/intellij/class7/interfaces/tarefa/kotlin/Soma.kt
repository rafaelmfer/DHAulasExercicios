package intellij.class7.interfaces.tarefa.kotlin

class Soma : OperacaoMatematica {

    override fun calcula(a: Int, b: Int): Int {
        val soma = a + b
        println("Soma = $soma")
        return soma
    }
}