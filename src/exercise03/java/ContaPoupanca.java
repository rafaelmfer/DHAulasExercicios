package exercise03.java;

public class ContaPoupanca extends Conta {
    private double taxaDeRendimentoMensal = 1.05;

    public ContaPoupanca(Cliente titular) {
        super(titular);
    }

    public ContaPoupanca(double saldo, Cliente titular) {
        super(saldo, titular);
    }

    public ContaPoupanca(double saldo, Cliente titular, double taxaDeRendimentoMensal) {
        super(saldo, titular);
        this.taxaDeRendimentoMensal = 1.0 + taxaDeRendimentoMensal;
    }

    public double recolherJurosMensal(){
        double saldoFinal = (consultarSaldo() * taxaDeRendimentoMensal);
        double redimento = (saldoFinal - consultarSaldo());
        System.out.println("Recolhendo Juros. Saldo: " + redimento);
        return redimento;
    }
}
