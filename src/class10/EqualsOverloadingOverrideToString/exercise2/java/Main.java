package class10.equalsoverloadingoverridetostring.exercise2.java;

public class Main {
    public static void main(String[] args) {
        Coca coca600 = new Coca(600, 3.89);
        Coca cocaLata = new Coca(350, 2.00);

        System.out.println(coca600.equals(cocaLata));

    }
}
