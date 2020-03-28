package intellij.class5.objetos.exerciseadditional.java;

import java.util.ArrayList;
import java.util.List;

public class Estadio {
    private List<Prova> provaList;

    private Prova provaHabilidade = new Prova();
    private Prova provaCorrida = new Prova();
    private Prova provaLideranca = new Prova();
    private Prova provaPuloAlto = new Prova();
    private Prova provaLanceLivre = new Prova();
    private Prova provaJogoEmEquipe = new Prova();

    public Estadio() {
    }

    public Estadio(List<Prova> provaList) {
        this.provaList = provaList;
    }

    public List<Boolean> saberDesempenho(Atleta atleta) {
        List<Boolean> provasRealizadas = new ArrayList<>();
        for (int index = 0; index < getProvaList().size(); index++) {
            provasRealizadas.add(getProvaList().get(index).podeRealizar(atleta));
        }
        return provasRealizadas;
    }

    public String whoWinsTheGoldMedal(Estadio this, Atleta atleta1, Atleta atleta2) {
        if (this.saberDesempenho(atleta1).size() == this.saberDesempenho(atleta2).size()) {
            if (atleta1.getNivel() > atleta2.getNivel()) return atleta1.getName();
            else return atleta2.getName();
        } else if (this.saberDesempenho(atleta1).size() > this.saberDesempenho(atleta2).size()) {
            return atleta1.getName();
        } else
            return atleta2.getName();
    }

    private List<Prova> createProvasSerie1() {
        provaHabilidade.setDificuldade(3);
        provaHabilidade.setEnergiaNecessaria(75);
        provaCorrida.setDificuldade(5);
        provaCorrida.setEnergiaNecessaria(135);
        provaLideranca.setDificuldade(10);
        provaLideranca.setEnergiaNecessaria(200);
        provaPuloAlto.setDificuldade(4);
        provaPuloAlto.setEnergiaNecessaria(95);

        List<Prova> provaList = new ArrayList<>();
        provaList.add(provaHabilidade);
        provaList.add(provaCorrida);
        provaList.add(provaLideranca);
        provaList.add(provaPuloAlto);
        return provaList;
    }

    private List<Prova> createProvasSerie2() {
        provaCorrida.setDificuldade(9);
        provaCorrida.setEnergiaNecessaria(200);
        provaPuloAlto.setDificuldade(6);
        provaPuloAlto.setEnergiaNecessaria(145);
        provaLanceLivre.setDificuldade(8);
        provaLanceLivre.setEnergiaNecessaria(156);
        provaJogoEmEquipe.setDificuldade(3);
        provaJogoEmEquipe.setEnergiaNecessaria(75);

        List<Prova> provaList = new ArrayList<>();
        provaList.add(provaCorrida);
        provaList.add(provaPuloAlto);
        provaList.add(provaLanceLivre);
        provaList.add(provaJogoEmEquipe);
        return provaList;
    }

    public List<Prova> getProvaList() {
        return provaList;
    }

    public void setProvaList(int number) {
        switch (number) {
            case 0:
                this.provaList = createProvasSerie1();
            case 1:
                this.provaList = createProvasSerie2();
        }
    }
}
