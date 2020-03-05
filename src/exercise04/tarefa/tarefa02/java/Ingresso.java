package exercise04.tarefa.tarefa02.java;

public abstract class Ingresso {
    private double value;

    public Ingresso(double value) {
        this.value = value;
    }

    public abstract double imprimeValor();

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
