package class6.herancas.exercise.java;

public class ContaCorrente extends Conta {
    private double specialCheck = 0.0;

    public ContaCorrente(Cliente titular) {
        super(titular);
    }

    public ContaCorrente(Cliente titular, double specialCheck) {
        super(titular);
        this.specialCheck = specialCheck;
    }

    public ContaCorrente(double saldo, Cliente titular) {
        super(saldo, titular);
    }

    public ContaCorrente(double saldo, Cliente titular, double specialCheck) {
        super(saldo, titular);
        this.specialCheck = specialCheck;
    }

    public double depositCheck(Cheque cheque) {
        setSaldo(consultarSaldo() + cheque.getValue());
        System.out.println("Deposito Cheque. Saldo: R$ " + consultarSaldo());
        return consultarSaldo();
    }

    @Override
    public double withdrawMoney(double value) {
        double saldo = consultarSaldo();
        if (value < (saldo + getSpecialCheck())) {
            if (value - saldo > 0) {
                setSaldo(0);
                setSpecialCheck(getSpecialCheck() - (value - saldo));
                System.out.println("Saque usando Cheque Especial. Saldo: R$ " + consultarSaldo() + "\nCheque Especial: R$ " + getSpecialCheck());
                return getSpecialCheck();
            } else {
                setSaldo(saldo - value);
                System.out.println("Saque. Saldo: R$ " + saldo + "\nCheque Especial: R$ " + getSpecialCheck());
                return saldo;
            }
        } else {
            System.out.println("Saldo Insuficiente.");
            return 0.0;
        }
    }

    public double getSpecialCheck() {
        return specialCheck;
    }

    public void setSpecialCheck(double specialCheck) {
        this.specialCheck = specialCheck;
    }
}
