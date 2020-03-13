package class10.equalsoverloadingoverridetostring.exercise3.java;

import java.util.Objects;

public class Aluno {
    private String nome;
    private Integer numeroDoAluno;

    public Aluno(String nome, Integer numeroDoAluno) {
        this.nome = nome;
        this.numeroDoAluno = numeroDoAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroDoAluno() {
        return numeroDoAluno;
    }

    public void setNumeroDoAluno(Integer numeroDoAluno) {
        this.numeroDoAluno = numeroDoAluno;
    }

    //Equals padrão que compara o objeto inteiro
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Coca coca = (Coca) o;
//        return Objects.equals(tamanho, coca.tamanho) &&
//                Objects.equals(preco, coca.preco);
//    }

    //Equals que compara apenas o Numero do Aluno do objeto
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(numeroDoAluno, aluno.numeroDoAluno);
    }
}
