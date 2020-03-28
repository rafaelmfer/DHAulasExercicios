package intellij.class6.herancas.exercise.java;

public abstract class Conta {
    private double saldo = 0.0;
    private Cliente titular;

    public Conta() {
    }

    public Conta(Cliente titular) {
        setSaldo(saldo);
        setTitular(titular);
    }

    public Conta(double saldo, Cliente titular) {
        setSaldo(saldo);
        setTitular(titular);
    }

    public double cashDeposit(double value) {
        setSaldo(consultarSaldo() + value);
        System.out.println("Depósito Dinheiro. Saldo: " + consultarSaldo());
        return consultarSaldo();
    }

    public double withdrawMoney(double value) {
        if (value <= consultarSaldo()) {
            setSaldo(consultarSaldo() - value);
            System.out.println("Saque. Saldo: " + consultarSaldo());
            return consultarSaldo();
        }
        System.out.println("Saldo Insuficiente.");
        return 0.0;
    }

    public double consultarSaldo() {
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

