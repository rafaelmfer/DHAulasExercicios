package intellij.class7.interfaces.tarefa.kotlin

import java.util.Scanner
import kotlin.system.exitProcess

fun main() {
    //cria Scanner para obter entrada a partir da janela de comando
    val scannerInput = Scanner(System.`in`)
    val operacaoMatematica: Int //tipo de operação matemática

    println("Escolha uma das operações abaixo:")
    println("1 - Soma")
    println("2 - Subtração")
    println("3 - Divisão")
    println("4 - Multiplicação")
    println("5 - Sair")
    print("Qual operação matemática deseja fazer: ")

    operacaoMatematica = scannerInput.nextInt()
    print("Digite o primeiro numero: ")
    val a = scannerInput.nextInt()
    print("Digite o segundo numero: ")
    val b = scannerInput.nextInt()

    when (operacaoMatematica) {
        1 -> {
            val soma = Soma()
            soma.calcula(a, b)
            return
        }
        2 -> {
            val subtracao = Subtracao()
            subtracao.calcula(a, b)
            return
        }
        3 -> {
            val divisao = Divisao()
            divisao.calcula(a, b)
            return
        }
        4 -> {
            val multiplicacao = Multiplicacao()
            multiplicacao.calcula(a, b)
            return
        }
        5 -> {
            exitProcess(0)
        }
    }
}