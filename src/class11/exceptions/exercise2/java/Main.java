package class11.exceptions.exercise2.java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayStrings = null;

        try {
            arrayStrings.add("Pato");
            arrayStrings.add("Cachorro");
            arrayStrings.add("Gato");
            System.out.println(arrayStrings.get(2));
        } catch (NullPointerException exception) {
            System.out.println("ArrayList não criado corretamente, por isso o " + exception.getMessage());
        }

        List<String> arrayStrings2 = new ArrayList<>();
        arrayStrings2.add("Pato");
        arrayStrings2.add("Cachorro");
        arrayStrings2.add("Gato");

        try {
            System.out.println(arrayStrings2.get(5));
        } catch (IndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
