package class10.equalsoverloadingoverridetostring.exercise3.kotlin

fun main(args: Array<String>) {
    val listaDeAlunos = createAndSetupList()
    println(listaDeAlunos.contains(Aluno("Robson", 2)))
}

private fun createAndSetupList(): List<Aluno> {

    return mutableListOf(
        Aluno("Rafael", 32),
        Aluno("Junior", 11),
        Aluno("Ivan", 2),
        Aluno("Larissa", 24)
    )
}