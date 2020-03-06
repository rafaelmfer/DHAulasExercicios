package class6.herancas.exercise.kotlin

class ContaCorrente : Conta {
    private var specialCheck = 0.0

    constructor(titular: Cliente) : super(titular) {}
    constructor(titular: Cliente, specialCheck: Double) : super(titular) {
        this.specialCheck = specialCheck
    }

    constructor(saldo: Double, titular: Cliente) : super(saldo, titular) {}
    constructor(saldo: Double, titular: Cliente, specialCheck: Double) : super(saldo, titular) {
        this.specialCheck = specialCheck
    }

    fun depositCheck(cheque: Cheque): Double {
        setSaldo(consultarSaldo() + cheque.value)
        println("Deposito Cheque. Saldo: R$ " + consultarSaldo())
        return consultarSaldo()
    }

    override fun withdrawMoney(value: Double): Double {
        val saldo = consultarSaldo()
        return if (value < saldo + specialCheck) {
            if (value - saldo > 0) {
                setSaldo(0.0)
                specialCheck -= (value - saldo)
                println("Saque usando Cheque Especial. Saldo: R$ " + consultarSaldo() + "\nCheque Especial: R$ " + specialCheck)
                specialCheck
            } else {
                setSaldo(saldo - value)
                println("Saque. Saldo: R$ $saldo\nCheque Especial: R$ $specialCheck")
                saldo
            }
        } else {
            println("Saldo Insuficiente.")
            0.0
        }
    }

}