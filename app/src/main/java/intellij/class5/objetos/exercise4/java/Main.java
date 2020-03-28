package intellij.class5.objetos.exercise4.java;

public class Main {
    public static void main(String[] args) {
        Tripe tripePrincipal = new Tripe(false, 60, 10, 10);

        tripePrincipal.definirAltura(50);

        tripePrincipal.dobrar();
        tripePrincipal.desdobrar();
        System.out.println(tripePrincipal.isDobrado());

        System.out.println(tripePrincipal.prontoParaGuardar());
        tripePrincipal.guardar();
        System.out.println(tripePrincipal.prontoParaGuardar());

        System.out.println(tripePrincipal.prontoParaUsar());
        tripePrincipal.usar();

    }
}
