package intellij.class7.interfaces.tarefa.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //cria Scanner para obter entrada a partir da janela de comando
        Scanner scannerInput = new Scanner(System.in);

        int operacaoMatematica;     //tipo de operação matemática
        System.out.println("Escolha uma das operações abaixo:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        System.out.println("5 - Sair");
        System.out.print("Qual operação matemática deseja fazer: ");
        operacaoMatematica = scannerInput.nextInt();

        System.out.print("Digite o primeiro numero: ");
        int a = scannerInput.nextInt();
        System.out.print("Digite o segundo numero: ");
        int b = scannerInput.nextInt();

        switch (operacaoMatematica) {
            case 1: {
                Soma soma = new Soma();
                soma.calcula(a, b);
                return;
            }
            case 2: {
                Subtracao subtracao = new Subtracao();
                subtracao.calcula(a, b);
                return;
            }
            case 3: {
                Divisao divisao = new Divisao();
                divisao.calcula(a, b);
                return;
            }
            case 4: {
                Multiplicacao multiplicacao = new Multiplicacao();
                multiplicacao.calcula(a, b);
                return;
            }
            case 5: {
                System.exit(0);
                return;
            }
        }
    }
}
