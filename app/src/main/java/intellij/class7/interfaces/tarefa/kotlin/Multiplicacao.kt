package intellij.class7.interfaces.tarefa.kotlin

class Multiplicacao : OperacaoMatematica {

    override fun calcula(a: Int, b: Int): Int {
        val multiplicacao = a * b
        println("Multiplicação = $multiplicacao")
        return multiplicacao
    }
}