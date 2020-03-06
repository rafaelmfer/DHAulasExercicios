package class5.objetos.exercise1.kotlin

fun main(args: Array<String>) {
    //Usando o Segundo Construtor criado na data class Conta
    val santanderRafael = _root_ide_package_.class5.objetos.exercise1.kotlin.Conta(
        "45867798-6",
        _root_ide_package_.class5.objetos.exercise1.kotlin.Cliente("Rafael", "de Mello Ferreira")
    )

    //Sem usar o construtor, apenas a definicao do saldo na data class e named arguments
    val santanderRafael2 = _root_ide_package_.class5.objetos.exercise1.kotlin.Conta(
        numeroDaConta = "45867798-6",
        titular = _root_ide_package_.class5.objetos.exercise1.kotlin.Cliente("Rafael", "de Mello Ferreira")
    )

    val itauDanny = _root_ide_package_.class5.objetos.exercise1.kotlin.Conta(
        "98876-2",
        _root_ide_package_.class5.objetos.exercise1.kotlin.Cliente("Danny", "Phantom")
    )

    santanderRafael.saldo = 5000.0
    itauDanny.saldo = 21000.0

    santanderRafael.makeDeposit(45.6)
    itauDanny.makeDeposit(489.5)

    santanderRafael.makeWithdraw(496.6)
    itauDanny.makeWithdraw(4815.0)
}