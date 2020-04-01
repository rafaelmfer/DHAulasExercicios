package intellij.class7.interfaces.tarefa.kotlin

class Divisao : OperacaoMatematica {

    override fun calcula(a: Int, b: Int): Int {
        val divisao = a / b
        println("Divisão = $divisao")
        return divisao
    }
}