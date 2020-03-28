package intellij.class7.interfaces.tarefa.java;

public class Soma implements OperacaoMatematica {
    @Override
    public int calcula(int a, int b) {
        int soma = a + b;
        System.out.println("Soma = " + soma);
        return soma;
    }
}
