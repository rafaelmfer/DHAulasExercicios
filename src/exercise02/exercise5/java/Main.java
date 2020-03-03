package exercise02.exercise5.java;

public class Main {
    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria();
        Veiculo veiculoCarro = new Veiculo("Ford", "Fusion Hybrid", 2020, "preto", 0.0);
        Cliente clienteRafael = new Cliente("Rafael", "Ferreira", "98765-4312");

        concessionaria.registrarVenda(veiculoCarro, clienteRafael, 150000.0);
    }
}
