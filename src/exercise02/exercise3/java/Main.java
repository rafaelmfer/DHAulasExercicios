package exercise02.exercise3.java;

public class Main {
    public static void main(String[] args) {
        Atleta atletaMichael = new Atleta("Michael",10, 300);
        Atleta atletaTroy = new Atleta("Troy",5, 135);

        Prova provaHabilidade = new Prova(5, 125);
        Prova provaCorrida = new Prova(10, 250);
        Prova provaLideranca = new Prova(15, 500);

        Prova provaPuloAlto = new Prova(3, 75);
        Prova provaLanceLivre = new Prova(5, 135);
        Prova provaJogoEmEquipe = new Prova(10, 200);

        System.out.println(provaHabilidade.podeRealizar(atletaMichael));
        System.out.println(provaCorrida.podeRealizar(atletaMichael));
        System.out.println(provaLideranca.podeRealizar(atletaMichael));

        System.out.println(provaPuloAlto.podeRealizar(atletaTroy));
        System.out.println(provaLanceLivre.podeRealizar(atletaTroy));
        System.out.println(provaJogoEmEquipe.podeRealizar(atletaTroy));
    }
}
