package intellij.class6.herancas.tarefa.tarefa01.java;

public abstract class Pessoa {
    private String nome;
    private Data nascimento;

    public Pessoa(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + nome + "\nNascimento: " + nascimento.getDia() + "/" + nascimento.getMes() + "/" + nascimento.getAno());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }
}
