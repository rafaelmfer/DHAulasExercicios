package intellij.class6.herancas.tarefa.tarefa01.java;

public class TestaCadastroMain {
    public static void main(String[] args) {

        CadastroPessoas cadastro1 = new CadastroPessoas();

        Cliente clienteRobson = new Cliente(1, "Robson", new Data(12,12,1995));
        Funcionario funcionarioRobson = new Funcionario("Robson", new Data(10,5,1989), 3000.0f);
        Gerente gerenteRobson = new Gerente("Robson", new Data(27,7,1973), 9000.0f, "TI");

        cadastro1.cadastraPessoa(clienteRobson);
        cadastro1.cadastraPessoa(funcionarioRobson);
        cadastro1.cadastraPessoa(gerenteRobson);
        cadastro1.getQtdAtual();
        cadastro1.imprimeCadastro();
    }
}
