package intellij.class10.equalsoverloadingoverridetostring.exercise2.java;

import java.util.Objects;

public class Coca {
    private Integer tamanho;
    private Double preco;

    public Coca(Integer tamanho, Double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
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

    //Equals que compara apenas o Tamanho do objeto
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coca coca = (Coca) o;
        return Objects.equals(tamanho, coca.tamanho);
    }
}
