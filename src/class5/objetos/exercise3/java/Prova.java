package class5.objetos.exercise3.java;

public class Prova {
    private int dificuldade;
    private int energiaNecessaria;

    public Prova(int dificuldade, int energiaNecessaria) {
        this.dificuldade = dificuldade;
        this.energiaNecessaria = energiaNecessaria;
    }

    public boolean podeRealizar(Atleta atleta){
        if (atleta.getNivel() >= getDificuldade() && atleta.getEnergia() >= getEnergiaNecessaria()) return true;
        else return false;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getEnergiaNecessaria() {
        return energiaNecessaria;
    }

    public void setEnergiaNecessaria(int energiaNecessaria) {
        this.energiaNecessaria = energiaNecessaria;
    }
}
