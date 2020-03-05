package exercise04.tarefa.tarefa02.kotlin

import java.util.Scanner

fun main(args: Array<String>) {
    //cria Scanner para obter entrada a partir da janela de comando
    val input = Scanner(System.`in`)
    val ingressoNumber: Int //tipo de ingresso 1(normal), 2 (VIP)
    val ingressoVIPNumber: Int //tipo de ingressoVIP 1(Camarote Superior), 2 (Camarote Inferior)

    print("Qual ingresso deseja, digite 1 para NORMAL, 2 para VIP: ") //prompt
    ingressoNumber = input.nextInt()

    when (ingressoNumber) {
        1 -> {
            val ingressoNormal = Normal(20.0)
            ingressoNormal.imprimeValor()
            return
        }
        2 -> {
            print("Ingresso VIP escolhido, qual camarote deseja, digite 1 para CAMAROTE SUPERIOR, 2 para CAMAROTE INFERIOR: ") //prompt
            ingressoVIPNumber = input.nextInt()
            if (ingressoVIPNumber == 1) {
                val ingressoVIPCamaroteSuperior =
                    CamaroteSuperior(20.0, 15.0, 5.0)
                ingressoVIPCamaroteSuperior.imprimeValor()
                return
            }
            if (ingressoVIPNumber == 2) {
                val ingressoVIPCamaroteInferior =
                    CamaroteInferior(20.0, 15.0, "Esquerda Baixo - 6D")
                ingressoVIPCamaroteInferior.imprimeLocalizacao()
                ingressoVIPCamaroteInferior.imprimeValor()
            }
        }
    }
}
