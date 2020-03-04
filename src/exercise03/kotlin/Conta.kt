package exercise03.kotlin

abstract class Conta {
    private var saldo = 0.0
    var titular: Cliente? = null

    constructor() {}
    constructor(titular: Cliente) {
        setSaldo(saldo)
        this.titular = titular
    }

    constructor(saldo: Double, titular: Cliente) {
        setSaldo(saldo)
        this.titular = titular
    }

    fun cashDeposit(value: Double): Double {
        setSaldo(consultarSaldo() + value)
        println("Depósito Dinheiro. Saldo: " + consultarSaldo())
        return consultarSaldo()
    }

    open fun withdrawMoney(value: Double): Double {
        if (value <= consultarSaldo()) {
            setSaldo(consultarSaldo() - value)
            println("Saque. Saldo: " + consultarSaldo())
            return consultarSaldo()
        }
        println("Saldo Insuficiente.")
        return 0.0
    }

    fun consultarSaldo(): Double {
        return saldo
    }

    fun setSaldo(saldo: Double) {
        this.saldo = saldo
    }

}