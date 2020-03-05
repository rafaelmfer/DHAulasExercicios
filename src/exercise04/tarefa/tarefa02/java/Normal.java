package exercise04.tarefa.tarefa02.java;

public class Normal extends Ingresso {

    public Normal(double value) {
        super(value);
    }

    @Override
    public double imprimeValor() {
        double finalPrice = getValue();
        System.out.println("Ingresso Normal");
        return finalPrice;
    }
}
