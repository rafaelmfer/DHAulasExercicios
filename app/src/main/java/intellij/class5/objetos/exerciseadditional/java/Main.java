package intellij.class5.objetos.exerciseadditional.java;

public class Main {
    public static void main(String[] args) {
        Estadio maracana = new Estadio();
        Estadio gavea = new Estadio();
        maracana.setProvaList(1);
        gavea.setProvaList(0);

        Atleta atletaMichael = new Atleta("Michael", 10, 300);
        Atleta atletaTroy = new Atleta("Troy", 7, 400);

        System.out.println(maracana.saberDesempenho(atletaMichael));
        System.out.println(maracana.saberDesempenho(atletaTroy));

        System.out.println(maracana.getProvaList().get(0).whoIsTheBest(atletaMichael, atletaTroy));
        System.out.println(gavea.getProvaList().get(3).whoIsTheBest(atletaMichael, atletaTroy));

        System.out.println(maracana.whoWinsTheGoldMedal(atletaMichael, atletaTroy));
        System.out.println(gavea.whoWinsTheGoldMedal(atletaMichael, atletaTroy));
    }
}

