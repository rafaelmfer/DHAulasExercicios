package intellij.class6.herancas.exercise.java;

public class Main {
    public static void main(String[] args) {
        Cliente clienteRafael = new Cliente(7, "Rafael de Mello Ferreira", "78.594.265-3", "778.998.999-89");
        Cliente clienteDannyPhantom = new Cliente(5, "Danny Phantom", "78.454.745-78", "755.135.546-85");

        ContaPoupanca santander = new ContaPoupanca(16500.0, clienteRafael, 0.02);
        ContaCorrente itau = new ContaCorrente(55000.0, clienteDannyPhantom, 5000.0);

        santander.recolherJurosMensal();
        santander.cashDeposit(12000.0);
        santander.withdrawMoney(11000.0);

        System.out.println("----------------------------");

        Cheque cheque = new Cheque(12000.0, "Santander", "10/03/2020");
        itau.depositCheck(cheque);
        itau.cashDeposit(1000.0);
        itau.withdrawMoney(69000.0);
    }
}