package class5.objetos.exercise5.kotlin

fun main(args: Array<String>) {
    val concessionaria = Concessionaria()
    val veiculoCarro = Veiculo("Ford", "Fusion Hybrid", 2020, "preto", 0.0)
    val clienteRafael = Cliente("Rafael", "Ferreira", "98765-4312")

    concessionaria.registrarVenda(veiculoCarro, clienteRafael, 150000.0)
}
