package class6.herancas.tarefa.tarefa01.kotlin

class Cliente(var codigo: Int, nome: String, nascimento: Data) : Pessoa(nome, nascimento) {

    override fun imprimeDados() {
        println("Código do Cliente: $codigo")
        super.imprimeDados()
    }

}