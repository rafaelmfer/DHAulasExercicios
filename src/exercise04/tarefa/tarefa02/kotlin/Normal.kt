package exercise04.tarefa.tarefa02.kotlin

class Normal(value: Double) : Ingresso(value) {

    override fun imprimeValor(): Double {
        val finalPrice = value
        println("Ingresso Normal")
        return finalPrice
    }
}