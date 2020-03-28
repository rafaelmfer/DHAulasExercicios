package intellij.class10.equalsoverloadingoverridetostring.exercise4.kotlin

fun main(args: Array<String>) {
        val listaDeFuncionarios = createAndSetupList()
        println(listaDeFuncionarios.contains(Funcionario("Robson", 2)))
    }

    private fun createAndSetupList(): List<Funcionario> {
        return mutableListOf(
    Funcionario("Rafael", 32),
    Funcionario("Junior", 11),
    Funcionario("Ivan", 2),
    Funcionario("Larissa", 24)
        )
    }
