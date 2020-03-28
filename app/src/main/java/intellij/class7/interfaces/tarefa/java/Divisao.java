package intellij.class7.interfaces.tarefa.java;

public class Divisao implements OperacaoMatematica {
    @Override
    public int calcula(int a, int b) {
        int divisao = a / b;
        System.out.println("Divisão = " + divisao);
        return divisao;
    }
}
