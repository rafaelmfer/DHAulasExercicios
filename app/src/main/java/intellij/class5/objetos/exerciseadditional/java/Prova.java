package intellij.class5.objetos.exerciseadditional.java;

public class Prova {
    private int dificuldade;
    private int energiaNecessaria;

    public Prova() {
    }

    public Prova(int dificuldade, int energiaNecessaria) {
        this.dificuldade = dificuldade;
        this.energiaNecessaria = energiaNecessaria;
    }

    public boolean podeRealizar(Atleta atleta) {
        if (atleta.getNivel() >= getDificuldade() && atleta.getEnergia() >= getEnergiaNecessaria()) return true;
        else return false;
    }

    public String whoIsTheBest(Prova this, Atleta atleta1, Atleta atleta2) {
        if (this.podeRealizar(atleta1) && this.podeRealizar(atleta2)) {
            if (atleta1.getNivel() > atleta2.getNivel()) return atleta1.getName();
            else return atleta2.getName();
        } else if (this.podeRealizar(atleta1) && !this.podeRealizar(atleta2)) {
            return atleta1.getName();
        } else if (!this.podeRealizar(atleta1) && this.podeRealizar(atleta2)) {
            return atleta2.getName();
        } else
            return null;
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
