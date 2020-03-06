package exercise04.tarefa.tarefa01.kotlin

open class Funcionario(nome: String, nascimento: Data, var salario: Float) : Pessoa(nome, nascimento) {

    override fun imprimeDados() {
        super.imprimeDados()
        println("Salario: $salario")
    }

    open fun calculaImposto(): Float {
        val taxaImposto = 0.03f
        val imposto = taxaImposto * salario
        println("Imposto = R$ $imposto")
        return imposto
    }

}