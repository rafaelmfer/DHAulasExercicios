package intellij.class11.exceptions.exercise3.java;

public class CalculoMatematico {
    public int divisao(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException exception) {
            System.out.println("Não se pode realizar este tipo de operação: " + exception.getMessage());
            return 0;
        }
    }

    public int divisao2(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Não se pode realizar divisão por zero");
        } else return a / b;
    }
}