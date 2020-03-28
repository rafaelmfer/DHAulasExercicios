package intellij.class5.objetos.exercise5.kotlin

class Concessionaria {
    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: Double) {
        val nomeDoVeiculo = veiculo.marca + " " + veiculo.modelo + " " + veiculo.anoDeFabricacao
        val nomeDoCliente = cliente.nome + " " + cliente.sobrenome

        val venda = Venda(cliente, veiculo, valor)

        println("Veículo vendido: $nomeDoVeiculo\nPara: $nomeDoCliente\nPelo valor de: R$ $valor.")
    }
}