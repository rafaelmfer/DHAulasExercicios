package class10.EqualsOverloadingOverrideToString.exercise4.java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> listaDeFuncionarios = createAndSetupList();
        Funcionario funcionarioRobson = new Funcionario("Robson", 2);

        System.out.println(listaDeFuncionarios.contains(funcionarioRobson));
    }

    private static List<Funcionario> createAndSetupList() {
        List<Funcionario> listaDeFuncionarios = new ArrayList<>();
        Funcionario funcionarioRafael = new Funcionario("Rafael", 32);
        Funcionario funcionarioJunior = new Funcionario("Junior", 11);
        Funcionario funcionarioIvan = new Funcionario("Ivan", 2);
        Funcionario funcionarioLarissa = new Funcionario("Larissa", 24);

        listaDeFuncionarios.add(funcionarioRafael);
        listaDeFuncionarios.add(funcionarioJunior);
        listaDeFuncionarios.add(funcionarioIvan);
        listaDeFuncionarios.add(funcionarioLarissa);
        return listaDeFuncionarios;
    }
}
