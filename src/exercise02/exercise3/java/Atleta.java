package exercise02.exercise3.java;

public class Atleta {
    private String name;
    private int nivel;
    private int energia;

    public Atleta(String name, int nivel, int energia) {
        this.name = name;
        this.nivel = nivel;
        this.energia = energia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}
