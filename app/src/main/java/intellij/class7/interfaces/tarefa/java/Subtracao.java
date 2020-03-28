package intellij.class7.interfaces.tarefa.java;

public class Subtracao implements OperacaoMatematica {
    @Override
    public int calcula(int a, int b) {
        int subtracao = a - b;
        System.out.println("Subtração = " + subtracao);
        return subtracao;
    }
}
