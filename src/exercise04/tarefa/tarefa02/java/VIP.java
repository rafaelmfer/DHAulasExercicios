package exercise04.tarefa.tarefa02.java;

public abstract class VIP extends Ingresso {
    private double additionalValueVIP;

    public VIP(double value, double additionalValueVIP) {
        super(value);
        this.additionalValueVIP = additionalValueVIP;
    }

    public double getAdditionalValueVIP() {
        return additionalValueVIP;
    }

    public void setAdditionalValueVIP(double additionalValueVIP) {
        this.additionalValueVIP = additionalValueVIP;
    }
}
