package exercise04.tarefa.tarefa02.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        int ingressoNumber;         //tipo de ingresso 1(normal), 2 (VIP)
        int ingressoVIPNumber;      //tipo de ingressoVIP 1(Camarote Superior), 2 (Camarote Inferior)

        System.out.print("Qual ingresso deseja, digite 1 para NORMAL, 2 para VIP: "); //prompt
        ingressoNumber = input.nextInt();

        switch (ingressoNumber){
            case 1: {
                Normal ingressoNormal = new Normal(20.0);
                ingressoNormal.imprimeValor();
                return;
            }
            case 2: {
                System.out.print("Ingresso VIP escolhido, qual camarote deseja, digite 1 para CAMAROTE SUPERIOR, 2 para CAMAROTE INFERIOR: "); //prompt
                ingressoVIPNumber = input.nextInt();

                if (ingressoVIPNumber == 1) {
                    CamaroteSuperior ingressoVIPCamaroteSuperior = new CamaroteSuperior(20.0, 15.0, 5.0);
                    ingressoVIPCamaroteSuperior.imprimeValor();
                    return;
                }
                if (ingressoVIPNumber == 2) {
                    CamaroteInferior ingressoVIPCamaroteInferior = new CamaroteInferior(20.0, 15.0, "Esquerda Baixo - 6D");
                    ingressoVIPCamaroteInferior.imprimeLocalizacao();
                    ingressoVIPCamaroteInferior.imprimeValor();
                }
            }
        }
    }
}
