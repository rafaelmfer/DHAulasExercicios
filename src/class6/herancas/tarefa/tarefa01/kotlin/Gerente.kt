package class6.herancas.tarefa.tarefa01.kotlin

class Gerente(nome: String, nascimento: Data, salario: Float, var area: String) : Funcionario(nome, nascimento, salario) {

    override fun imprimeDados() {
        super.imprimeDados()
        println("Area: $area")
    }

    override fun calculaImposto(): Float {
        val taxaImposto = 0.05f
        val imposto = taxaImposto * salario
        println("Imposto = R$ $imposto")
        return imposto
    }

}