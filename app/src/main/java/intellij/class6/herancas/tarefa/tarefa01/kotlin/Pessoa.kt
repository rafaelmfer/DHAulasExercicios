package intellij.class6.herancas.tarefa.tarefa01.kotlin

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