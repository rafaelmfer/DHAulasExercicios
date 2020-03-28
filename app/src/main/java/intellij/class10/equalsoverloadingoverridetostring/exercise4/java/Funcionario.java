package intellij.class10.equalsoverloadingoverridetostring.exercise4.java;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private Integer numeroDeRegistro;

    public Funcionario(String nome, Integer numeroDeRegistro) {
        this.nome = nome;
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(Integer numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
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

    //Equals que compara apenas o Numero de Registro do objeto
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario funcionario = (Funcionario) o;
        return Objects.equals(numeroDeRegistro, funcionario.numeroDeRegistro);
    }
}
