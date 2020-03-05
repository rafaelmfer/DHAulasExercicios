package exercise04.tarefa.tarefa02.kotlin

class CamaroteInferior(
    value: Double,
    additionalValue: Double,
    var location: String
) :
    VIP(value, additionalValue) {

    override fun imprimeValor(): Double {
        val finalPrice = value + additionalValueVIP
        println("Ingresso VIP Camarote Inferior = R$ $finalPrice")
        return finalPrice
    }

    fun imprimeLocalizacao() {
        println("Localização: $location")
    }
}