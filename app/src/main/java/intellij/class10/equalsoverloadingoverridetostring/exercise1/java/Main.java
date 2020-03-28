package intellij.class10.equalsoverloadingoverridetostring.exercise1.java;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoaRafael = new Pessoa("Rafael", 456578952);
        Pessoa pessoaDanny = new Pessoa("Danny", 456578952);

        System.out.println(pessoaRafael.equals(pessoaDanny));
    }
}
