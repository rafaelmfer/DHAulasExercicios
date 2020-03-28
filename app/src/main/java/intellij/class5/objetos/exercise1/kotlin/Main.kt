package intellij.class5.objetos.exercise1.kotlin

fun main(args: Array<String>) {

    //Usando o Segundo Construtor criado na data class Conta
    val santanderRafael = Conta("45867798-6", Cliente("Rafael", "de Mello Ferreira"))

    //Sem usar o construtor, apenas a definicao do saldo na data class e named arguments
    val santanderRafael2 = Conta(numeroDaConta = "45867798-6", titular = Cliente("Rafael", "de Mello Ferreira"))

    val itauDanny = Conta("98876-2", Cliente("Danny", "Phantom"))

    santanderRafael.saldo = 5000.0
    itauDanny.saldo = 21000.0

    santanderRafael.makeDeposit(45.6)
    itauDanny.makeDeposit(489.5)

    santanderRafael.makeWithdraw(496.6)
    itauDanny.makeWithdraw(4815.0)
}