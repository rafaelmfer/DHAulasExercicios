package exercise04.tarefa.tarefa02.kotlin

class CamaroteSuperior(
    value: Double,
    additionalValueVIP: Double,
    private val additionalValue: Double
) :
    VIP(value, additionalValueVIP) {

    override fun imprimeValor(): Double {
        val finalPrice = value + additionalValueVIP + additionalValue
        println("Ingresso VIP Camarote Superior = R$ $finalPrice")
        return finalPrice
    }
}