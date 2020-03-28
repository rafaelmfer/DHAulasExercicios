package intellij.class7.interfaces.tarefa.java;

public class Multiplicacao implements OperacaoMatematica {
    @Override
    public int calcula(int a, int b) {
        int multiplicacao = a * b;
        System.out.println("Multiplicação = " + multiplicacao);
        return multiplicacao;
    }
}
