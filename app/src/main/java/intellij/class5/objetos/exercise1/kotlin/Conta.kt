package intellij.class5.objetos.exercise1.kotlin

data class Conta(
    var numeroDaConta: String,
    var saldo: Double = 0.0,
    var titular: Cliente
) {

    //Segundo Construtor (opcional)
    constructor(numeroDaConta: String, titular: Cliente) : this(numeroDaConta, 0.0, titular)

    fun makeDeposit(value: Double): Double {
        saldo += value
        println("Depósito.\nSaldo: $saldo")
        return saldo
    }

    fun makeWithdraw(value: Double): Double {
        if (value > saldo) {
            println("Saldo Insuficiente")
        } else {
            saldo -= value
            println("Saque.\nSaldo: $saldo")
        }
        return saldo
    }
}