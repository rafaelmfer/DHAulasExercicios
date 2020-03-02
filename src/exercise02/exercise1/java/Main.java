package exercise02.exercise1.java;

public class Main {
    public static void main(String[] args) {
        Cliente clienteRafael = new Cliente("Rafael", "de Mello Ferreira");
        Cliente clienteDannyPhantom = new Cliente("Danny", "Phantom");

        Conta santander = new Conta("45867798-6", clienteRafael);
        Conta itau = new Conta("98876-2", clienteDannyPhantom);

        santander.setSaldo(5000.0);
        itau.setSaldo(21000.0);

        santander.makeDeposit(45.6);
        itau.makeDeposit(489.5);

        santander.makeWithdraw(496.6);
        itau.makeWithdraw(4815.0);
    }
}