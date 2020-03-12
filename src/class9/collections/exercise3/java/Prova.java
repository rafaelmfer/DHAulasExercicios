package class9.collections.exercise3.java;

import java.util.Set;

public class Prova {

    public void somaTotal(Set<Integer> conjuntoDeInteiros) {
        int soma = 0;
        for (int item : conjuntoDeInteiros) {
            soma += item;
        }
        System.out.println("Valor total da soma = " + soma);
    }
}
