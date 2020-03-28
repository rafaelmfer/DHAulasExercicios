package intellij.class4.semobjetos;
//EXERCÍCIOS
//
// 1. Escrever um programa que faça o seguinte: Declarar uma variável “umNumeroA” do tipo Integer:
// - Declarar uma variável “umNumeroB” do tipo Double;
// - Declarar uma variável “umaCadeiaDeTexto” do tipo String;
// - Atribuir um valor a cada variável e, em seguida, imprimir na tela: O valor de cada variável;
// - A soma de “numeroA” + “numeroB”;
// - A diferença entre “numeroA” - “numeroB”.
//
// 2. Escrever um programa, que deve analisar dois números inteiros e, se o primeiro número for menor que o segundo número, retornar true, caso contrário, retorna false.
//
// 3. Escrever um programa que deve analisar um número inteiro e, caso ele seja ímpar e maior que dez, retornar true, caso contrário, retornar false.
//
// 4. Escrever um programa, que pegue um Array de números e retorne a soma de todos os elementos dele.
//
// 5. Escrever um programa que receba um Array e retorne a soma de todos os elementos pares do Array.
//
// 6. Escreva um programa que receba um Array de números e retorne um Array com todos os elementos pares dele.

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        exercise1(10, 5.2, "First Code Class Finally");

        System.out.println(analyzeTwoNumbers_Exercise02(5, 7));

        System.out.println(analyzeOneNumber_Exercise03(13));

        System.out.println(sumArrayAllNumbers_Exercise04());

        System.out.println(sumArrayPairNumbers_Exercise05());

        System.out.println(arrayPairNumbers_Exercise06());
    }

    private static void exercise1(int numeroA, double numeroB, String umaCadeiaDeTexto) {
        //criando variavel inteira
//        int numeroA = 10;

        //criando uma variavel double
//        double numeroB = 5.0;

        //criando uma variavel string
//        String umaCadeiaDeTexto = "First Code Class Finally";

        //printando no console as variaveis
        System.out.println(numeroA);
        System.out.println(numeroB);
        System.out.println(umaCadeiaDeTexto);

        System.out.println("soma = " + (numeroA + numeroB));
        System.out.println("subtracao = " + (numeroA - numeroB));
    }

    private static boolean analyzeTwoNumbers_Exercise02(int number01, int number02) {
        if (number01 < number02) return true;
        else return false;
    }

    private static boolean analyzeOneNumber_Exercise03(int number) {
        if ((number % 2 != 0) && (number > 10)) return true;
        else return false;
    }

    private static int sumArrayAllNumbers_Exercise04() {
        List<Integer> arrayTestExercise4 = new ArrayList<>();
        arrayTestExercise4.add(1);
        arrayTestExercise4.add(2);
        arrayTestExercise4.add(3);
        arrayTestExercise4.add(4);
        arrayTestExercise4.add(5);
        arrayTestExercise4.add(6);
        int sum4 = 0;
        for (int index = 0; index < arrayTestExercise4.size(); index++) {
            sum4 = sum4 + arrayTestExercise4.get(index);
        }
        return sum4;
    }

    private static int sumArrayPairNumbers_Exercise05() {
        List<Integer> arrayTestExercise5 = new ArrayList<>();
        arrayTestExercise5.add(1);
        arrayTestExercise5.add(2);
        arrayTestExercise5.add(3);
        arrayTestExercise5.add(4);
        arrayTestExercise5.add(5);
        arrayTestExercise5.add(6);
        int sum5 = 0;
        for (int index = 0; index < arrayTestExercise5.size(); index++) {
            if (arrayTestExercise5.get(index) % 2 == 0) {
                sum5 = sum5 + arrayTestExercise5.get(index);
            }
        }
        return sum5;
    }

    private static ArrayList<Integer> arrayPairNumbers_Exercise06() {
        List<Integer> arrayTestExercise6 = new ArrayList<>();
        arrayTestExercise6.add(1);
        arrayTestExercise6.add(2);
        arrayTestExercise6.add(3);
        arrayTestExercise6.add(4);
        arrayTestExercise6.add(5);
        arrayTestExercise6.add(6);

        ArrayList<Integer> arrayResult = new ArrayList<Integer>();

        for (int index = 0; index < arrayTestExercise6.size(); index++) {
            if (arrayTestExercise6.get(index) % 2 == 0) {
                arrayResult.add(arrayTestExercise6.get(index));
            }
        }
        return arrayResult;
    }
}



