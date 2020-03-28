package intellij.class9.collections.exercise4.java;

import java.util.HashMap;
import java.util.List;

public class GuardaVolumes {
    private int contador = 0;
    private HashMap<Integer, List<Peca>> lockers = new HashMap<>();

    public Integer guardarPecas(List<Peca> listaDePeca) {
        lockers.put(contador, listaDePeca);
        System.out.println("Identificador número: " + contador);
        contador++;
        return getContador();
    }

    public void mostrarPecas() {
        for (int chave : lockers.keySet()) {
            List<Peca> lista = lockers.get(chave);
            System.out.println("Guarda Volume " + chave + " tem:");
            for (Peca itemList : lista) {
                System.out.println("Peça: " + itemList.getMarca() + ", " + itemList.getModelo());
            }
        }
    }

    public void mostrarPecas(Integer numero) {
        List<Peca> lista = lockers.get(numero);
        System.out.println("No Guarda Volume " + numero + " tem: ");
        for (Peca itemList : lista) {
            System.out.println("Peça: " + itemList.getMarca() + ", " + itemList.getModelo());
        }
    }

    public void devolverPecas(Integer numero) {
        List<Peca> lista = lockers.remove(numero);
        System.out.println("Guarda Volume " + numero);
        for (Peca itemList : lista) {
            System.out.println("Peça: " + itemList.getMarca() + ", " + itemList.getModelo() + " devolvida");
        }
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public HashMap<Integer, List<Peca>> getLockers() {
        return lockers;
    }

    public void setLockers(HashMap<Integer, List<Peca>> lockers) {
        this.lockers = lockers;
    }
}
