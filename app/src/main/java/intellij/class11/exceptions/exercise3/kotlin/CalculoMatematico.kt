package intellij.class11.exceptions.exercise3.kotlin

class CalculoMatematico {
    fun divisao(a: Int, b: Int): Int {
        return try {
            a / b
        } catch (exception: ArithmeticException) {
            println("Não se pode realizar este tipo de operação: " + exception.message)
            0
        }
    }

    @Throws(ArithmeticException::class)
    fun divisao2(a: Int, b: Int): Int {
        return if (b == 0) {
            throw ArithmeticException("Não se pode realizar divisão por zero")
        } else a / b
    }
}