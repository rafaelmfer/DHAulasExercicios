package class9.collections.exercise4.java;

public abstract class Peca {
    private String marca;
    private String modelo;

    public Peca(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void retirada();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
