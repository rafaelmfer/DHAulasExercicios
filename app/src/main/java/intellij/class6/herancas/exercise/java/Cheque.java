package intellij.class6.herancas.exercise.java;

public class Cheque {
    private double value;
    private String bancoEmissor;
    private String dataDoPagamento;

    public Cheque(double value, String bancoEmissor, String dataDoPagamento) {
        this.value = value;
        this.bancoEmissor = bancoEmissor;
        this.dataDoPagamento = dataDoPagamento;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getBancoEmissor() {
        return bancoEmissor;
    }

    public void setBancoEmissor(String bancoEmissor) {
        this.bancoEmissor = bancoEmissor;
    }

    public String getDataDoPagamento() {
        return dataDoPagamento;
    }

    public void setDataDoPagamento(String dataDoPagamento) {
        this.dataDoPagamento = dataDoPagamento;
    }
}
