package intellij.class7.interfaces.tarefa.kotlin

class Subtracao : OperacaoMatematica {

    override fun calcula(a: Int, b: Int): Int {
        val subtracao = a - b
        println("Subtração = $subtracao")
        return subtracao
    }
}