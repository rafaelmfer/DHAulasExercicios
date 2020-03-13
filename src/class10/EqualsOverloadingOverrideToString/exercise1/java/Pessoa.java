package class10.equalsoverloadingoverridetostring.exercise1.java;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private Integer rg;

    public Pessoa(String nome, Integer rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    //Equals padrão que compara o objeto inteiro
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Pessoa pessoa = (Pessoa) o;
//        return Objects.equals(nome, pessoa.nome) &&
//                Objects.equals(rg, pessoa.rg);
//    }

    //Equals que compara apenas o RG do objeto
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(rg, pessoa.rg);
    }
}
