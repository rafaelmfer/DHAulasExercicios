package exercise01

import java.util.ArrayList

object MainKotlin {
    @JvmStatic
    fun main(args: Array<String>) {
        exercise1(10, 5.2, "First Code Class Finally")
        println(analyzeTwoNumbersExercise02(5, 7))
        println(analyzeOneNumberExercise03(13))
        println(sumArrayAllNumbersExercise04())
        println(sumArrayPairNumbersExercise05())
        println(arrayPairNumbersExercise06())
    }

    private fun exercise1(numeroA: Int, numeroB: Double, umaCadeiaDeTexto: String) {
        //criando variavel inteira
//        int numeroA = 10;
        //criando uma variavel double
//        double numeroB = 5.0;
        //criando uma variavel string
//        String umaCadeiaDeTexto = "First Code Class Finally";

        //printando no console as variaveis
        println(numeroA)
        println(numeroB)
        println(umaCadeiaDeTexto)
        println("soma = " + (numeroA + numeroB))
        println("subtracao = " + (numeroA - numeroB))
    }

    private fun analyzeTwoNumbersExercise02(number01: Int, number02: Int): Boolean {
        return number01 < number02
    }

    private fun analyzeOneNumberExercise03(number: Int): Boolean {
        return number % 2 != 0 && number > 10
    }

    private fun sumArrayAllNumbersExercise04(): Int {
        val arrayTestExercise4: MutableList<Int> = ArrayList()
        arrayTestExercise4.add(1)
        arrayTestExercise4.add(2)
        arrayTestExercise4.add(3)
        arrayTestExercise4.add(4)
        arrayTestExercise4.add(5)
        arrayTestExercise4.add(6)
        var sum4 = 0
        for (index in arrayTestExercise4.indices) {
            sum4 += arrayTestExercise4[index]
        }
        return sum4
    }

    private fun sumArrayPairNumbersExercise05(): Int {
        val arrayTestExercise5: MutableList<Int> = ArrayList()
        arrayTestExercise5.add(1)
        arrayTestExercise5.add(2)
        arrayTestExercise5.add(3)
        arrayTestExercise5.add(4)
        arrayTestExercise5.add(5)
        arrayTestExercise5.add(6)
        var sum5 = 0
        for (index in arrayTestExercise5.indices) {
            if (arrayTestExercise5[index] % 2 == 0) {
                sum5 += arrayTestExercise5[index]
            }
        }
        return sum5
    }

    private fun arrayPairNumbersExercise06(): ArrayList<Int> {
        val arrayTestExercise6: MutableList<Int> = ArrayList()
        arrayTestExercise6.add(1)
        arrayTestExercise6.add(2)
        arrayTestExercise6.add(3)
        arrayTestExercise6.add(4)
        arrayTestExercise6.add(5)
        arrayTestExercise6.add(6)
        val arrayResult = ArrayList<Int>()
        for (index in arrayTestExercise6.indices) {
            if (arrayTestExercise6[index] % 2 == 0) {
                arrayResult.add(arrayTestExercise6[index])
            }
        }
        return arrayResult
    }
}