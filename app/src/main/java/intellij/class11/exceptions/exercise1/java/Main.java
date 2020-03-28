package intellij.class11.exceptions.exercise1.java;

public class Main {
    public static void main(String[] args) {
        String[] arrayStrings = new String[]{ "Pato", "Cachorro", "Gato"};
        try {
            System.out.println(arrayStrings[3]);
        } catch (IndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
        }
    }
}
