package intellij.class5.objetos.exercise5.java;

public class Concessionaria {
    public void registrarVenda(Veiculo veiculo, Cliente cliente, Double valor) {
        String nomeDoVeiculo = veiculo.getMarca() + " " + veiculo.getModelo() + " " + veiculo.getAnoDeFabricacao();
        String nomeDoCliente = cliente.getNome() + " " + cliente.getSobrenome();

        Venda venda = new Venda(cliente, veiculo, valor);

        System.out.println("Veículo vendido: " + nomeDoVeiculo + "\nPara: " + nomeDoCliente + "\nPelo valor de: R$ " + valor);
    }
}
