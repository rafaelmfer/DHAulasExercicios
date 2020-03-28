package intellij.class11.exceptions.exercise3.java;

public class Main {
    public static void main(String[] args) {
        CalculoMatematico calculoMatematico = new CalculoMatematico();
        //Teste 1
        calculoMatematico.divisao(4,0);
        //Teste 2
        try {
            calculoMatematico.divisao2(4,0);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
    }
}