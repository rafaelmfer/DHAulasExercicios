package class11.exceptions.exercise3.kotlin

fun main(args: Array<String>) {
    //Teste 1
    CalculoMatematico().divisao(4, 0)
    //Teste 2
    try {
        CalculoMatematico().divisao2(4, 0)
    } catch (exception: ArithmeticException) {
        println(exception.message)
    }
}