package intellij.class5.objetos.exercise1.java;

public class Conta {
    private String numeroDaConta;
    private double saldo = 0.0;
    private Cliente titular;

    public Conta() {
    }

    public Conta(String numeroDaConta, Cliente titular) {
        setNumeroDaConta(numeroDaConta);
        setSaldo(saldo);
        setTitular(titular);
    }

    public Conta(String numeroDaConta, double saldo, Cliente titular) {
        setNumeroDaConta(numeroDaConta);
        setSaldo(saldo);
        setTitular(titular);
    }

    public double makeDeposit(double value) {
        setSaldo(getSaldo() + value);
        System.out.println("Depósito. \nSaldo: " + getSaldo());
        return getSaldo();
    }

    public double makeWithdraw(double value) {
        if (value > getSaldo()) {
            System.out.println("Saldo Insuficiente.");
        } else {
            setSaldo(getSaldo() - value);
            System.out.println("Saque. \nSaldo: " + getSaldo());
        }
        return getSaldo();
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}

