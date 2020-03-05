package exercise04.tarefa.tarefa02.java;

public class CamaroteSuperior extends VIP {
    private double additionalValue;

    public CamaroteSuperior(double value, double additionalValueVIP, double additionalValue) {
        super(value, additionalValueVIP);
        this.additionalValue = additionalValue;
    }

    @Override
    public double imprimeValor() {
        double finalPrice = getValue() + getAdditionalValueVIP() + this.additionalValue;
        System.out.println("Ingresso VIP Camarote Superior = R$ " + finalPrice);
        return finalPrice;
        }
}
