package intellij.class5.objetos.exercise5.java;

public class Venda {
    private Cliente cliente;
    private Veiculo veiculo;
    private double valorDaVenda;

    public Venda(Cliente cliente, Veiculo veiculo, double valorDaVenda) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.valorDaVenda = valorDaVenda;
    }
}
