package exercise04.tarefa.tarefa01.kotlin

import java.util.ArrayList

class CadastroPessoas {
    private var qtdAtual = 0
    private val listaDeCadastro: MutableList<Pessoa> = ArrayList()

    fun cadastraPessoa(pessoa: Pessoa) {
        listaDeCadastro.add(pessoa)
        qtdAtual++
    }

    fun imprimeCadastro() {
        println("Lista de Cadastro:")

        //For each, percorrendo o arrayList pessoa por pessoa
        for (pessoa in listaDeCadastro) {
            println("---------------------------")
            pessoa.imprimeDados()
            println("---------------------------")
        }
    }

    fun getQtdAtual(): Int {
        println("Quantidade de Pessoas cadastradas: $qtdAtual")
        return qtdAtual
    }
}