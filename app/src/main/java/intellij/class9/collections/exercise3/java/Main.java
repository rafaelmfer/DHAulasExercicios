package intellij.class9.collections.exercise3.java;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> conjunto = new HashSet<>();
        conjunto.add(1);
        conjunto.add(5);
        conjunto.add(6);
        conjunto.add(7);
        conjunto.add(8);
        conjunto.add(9);
        conjunto.add(10);
        conjunto.add(4);
        conjunto.add(2);
        conjunto.add(3);

        Prova prova = new Prova();
        prova.somaTotal(conjunto);
    }
}
