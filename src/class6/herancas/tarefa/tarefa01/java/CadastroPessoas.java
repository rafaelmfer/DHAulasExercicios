package class6.herancas.tarefa.tarefa01.java;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {
    private int qtdAtual = 0;
    private List<Pessoa> listaDeCadastro = new ArrayList<>();

    public void cadastraPessoa(Pessoa pessoa) {
        listaDeCadastro.add(pessoa);
        qtdAtual++;
    }

    public void imprimeCadastro() {
        System.out.println("Lista de Cadastro:");

        //For each, percorrendo o arrayList pessoa por pessoa
        for (Pessoa pessoa : listaDeCadastro) {
            System.out.println("---------------------------");
            pessoa.imprimeDados();
            System.out.println("---------------------------");
        }
    }

    public int getQtdAtual() {
        System.out.println("Quantidade de Pessoas cadastradas: " + qtdAtual);
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }
}
