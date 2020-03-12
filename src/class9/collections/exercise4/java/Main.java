package class9.collections.exercise4.java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Peca pecaNike = new Peca("Nike", "Camiseta P") {
            @Override
            public void retirada() {

            }
        };
        Peca pecaAdidas = new Peca("Adidas", "Calça P") {
            @Override
            public void retirada() {

            }
        };
        Peca pecaPuma = new Peca("Puma", "Tênis 37/38") {
            @Override
            public void retirada() {

            }
        };

        List<Peca> listaDePecas1 = new ArrayList<>();
        listaDePecas1.add(pecaNike);
        listaDePecas1.add(pecaAdidas);

        List<Peca> listaDePecas2 = new ArrayList<>();
        listaDePecas2.add(pecaPuma);

        GuardaVolumes guardaVolumes = new GuardaVolumes();
        guardaVolumes.guardarPecas(listaDePecas1);
        guardaVolumes.guardarPecas(listaDePecas2);

        guardaVolumes.mostrarPecas();
        guardaVolumes.mostrarPecas(0);
        guardaVolumes.devolverPecas(0);



    }
}

