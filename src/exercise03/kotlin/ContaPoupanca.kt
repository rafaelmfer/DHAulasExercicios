package exercise03.kotlin

class ContaPoupanca : Conta {
    private var taxaDeRendimentoMensal = 1.05

    constructor(titular: Cliente) : super(titular) {}
    constructor(saldo: Double, titular: Cliente) : super(saldo, titular) {}
    constructor(saldo: Double, titular: Cliente, taxaDeRendimentoMensal: Double) : super(saldo, titular) {
        this.taxaDeRendimentoMensal = 1.0 + taxaDeRendimentoMensal
    }

    fun recolherJurosMensal(): Double {
        val saldoFinal = consultarSaldo() * taxaDeRendimentoMensal
        val redimento = saldoFinal - consultarSaldo()
        println("Recolhendo Juros. Saldo: $redimento")
        return redimento
    }
}