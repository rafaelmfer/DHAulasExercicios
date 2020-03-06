package class6.herancas.exercise.kotlin

fun main(args: Array<String>) {
    val clienteRafael = Cliente(7, "Rafael de Mello Ferreira", "78.594.265-3", "778.998.999-89")
    val clienteDannyPhantom = Cliente(5, "Danny Phantom", "78.454.745-78", "755.135.546-85")

    val santanderRafael = ContaPoupanca(16500.0, clienteRafael, 0.02)
    val itauDanny = ContaCorrente(55000.0, clienteDannyPhantom, 5000.0)

    santanderRafael.recolherJurosMensal()
    santanderRafael.cashDeposit(12000.0)
    santanderRafael.withdrawMoney(11000.0)

    println("----------------------------")

    val cheque = Cheque(12000.0, "Santander", "10/03/2020")
    itauDanny.depositCheck(cheque)
    itauDanny.cashDeposit(1000.0)
    itauDanny.withdrawMoney(69000.0)
}