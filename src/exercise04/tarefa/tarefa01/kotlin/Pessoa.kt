package exercise04.tarefa.tarefa01.kotlin

abstract class Pessoa(var nome: String, var nascimento: Data) {

    open fun imprimeDados() {
        println(
            """
    Nome: $nome
    Nascimento: ${nascimento.dia}/${nascimento.mes}/${nascimento.ano}
    """.trimIndent()
        )
    }

}