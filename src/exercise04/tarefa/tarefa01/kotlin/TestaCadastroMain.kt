package exercise04.tarefa.tarefa01.kotlin

    fun main(args: Array<String>) {
        val cadastro1 = CadastroPessoas()

        val clienteRobson = Cliente(1, "Robson", Data(12, 12, 1995))
        val funcionarioRobson = Funcionario("Robson", Data(10, 5, 1989), 3000.0f)
        val gerenteRobson = Gerente("Robson", Data(27, 7, 1973), 9000.0f, "TI")

        cadastro1.cadastraPessoa(clienteRobson)
        cadastro1.cadastraPessoa(funcionarioRobson)
        cadastro1.cadastraPessoa(gerenteRobson)

        cadastro1.getQtdAtual()
        cadastro1.imprimeCadastro()
    }
