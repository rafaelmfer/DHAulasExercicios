package class10.equalsoverloadingoverridetostring.exercise3.java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aluno> listaDeAlunos = createAndSetupList();
        Aluno alunoRobson = new Aluno("Robson", 2);

        System.out.println(listaDeAlunos.contains(alunoRobson));
    }

    private static List<Aluno> createAndSetupList() {
        List<Aluno> listaDeAlunos = new ArrayList<>();
        Aluno alunoRafael = new Aluno("Rafael", 32);
        Aluno alunoJunior = new Aluno("Junior", 11);
        Aluno alunoIvan = new Aluno("Ivan", 2);
        Aluno alunoLarissa = new Aluno("Larissa", 24);

        listaDeAlunos.add(alunoRafael);
        listaDeAlunos.add(alunoJunior);
        listaDeAlunos.add(alunoIvan);
        listaDeAlunos.add(alunoLarissa);
        return listaDeAlunos;
    }
}
