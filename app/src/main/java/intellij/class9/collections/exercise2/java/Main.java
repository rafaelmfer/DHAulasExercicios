package intellij.class9.collections.exercise2.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        createList();
        createHashSet();
    }

    private static void createList() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("5");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("8");
        list.add("8");

        for (String item : list) {
            System.out.println(item);
        }
    }

    private static void createHashSet() {
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("1");
        conjunto.add("5");
//        conjunto.add("5");    Não permite valores duplicados
        conjunto.add("6");
        conjunto.add("7");
        conjunto.add("8");

        for (String valor : conjunto) {
            System.out.println(valor);
        }
    }
}
