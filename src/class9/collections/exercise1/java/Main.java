package class9.collections.exercise1.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        createCollection1();
        createCollection2();
    }

    private static void createCollection1() {
        HashMap<Integer,String> loteriaDosSonhos = new HashMap<>();
        loteriaDosSonhos.put(0, "Ovos");
        loteriaDosSonhos.put(1, "Água");
        loteriaDosSonhos.put(2, "Escopeta");
        loteriaDosSonhos.put(3, "Cavalo");
        loteriaDosSonhos.put(4, "Dentista");
        loteriaDosSonhos.put(5, "Fogos");

        for (Integer chave : loteriaDosSonhos.keySet()){
            String item = loteriaDosSonhos.get(chave);
            System.out.println(chave + " -> " + item);
        }
    }

    private static void createCollection2() {
        HashMap<String, List<String>> apelidos = new HashMap<>();
        List<String> apelidosJoao = new ArrayList<>();
        apelidosJoao.add("Juan");
        apelidosJoao.add("Fissura");
        apelidosJoao.add("Maromba");

        List<String> apelidosMiguel = new ArrayList<>();
        apelidosMiguel.add("Night Watch");
        apelidosMiguel.add("Bruce Wayne");
        apelidosMiguel.add("Tampinha");

        List<String> apelidosMaria = new ArrayList<>();
        apelidosMaria.add("Wonder Woman");
        apelidosMaria.add("Mary");
        apelidosMaria.add("Marilene");

        List<String> apelidosLucas = new ArrayList<>();
        apelidosLucas.add("Lukinha");
        apelidosLucas.add("Jorge");
        apelidosLucas.add("George");

        apelidos.put("João", apelidosJoao);
        apelidos.put("Miguel", apelidosMiguel);
        apelidos.put("Maria", apelidosMaria);
        apelidos.put("Lucas", apelidosLucas);

        for (String chave2 : apelidos.keySet()){
            List<String> item = apelidos.get(chave2);
            System.out.println(chave2 + " -> " + item);
        }
    }
}
