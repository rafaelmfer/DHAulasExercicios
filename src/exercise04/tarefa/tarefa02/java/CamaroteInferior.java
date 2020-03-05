package exercise04.tarefa.tarefa02.java;

public class CamaroteInferior extends VIP {
    private String location;

    public CamaroteInferior(double value, double additionalValue, String location) {
        super(value, additionalValue);
        this.location = location;
    }

    @Override
    public double imprimeValor() {
        double finalPrice = getValue() + getAdditionalValueVIP();
        System.out.println("Ingresso VIP Camarote Inferior = R$ " + finalPrice);
        return finalPrice;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localização: " + location);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
