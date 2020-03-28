package intellij.class6.herancas.tarefa.tarefa01.java;

public class Gerente extends Funcionario {
    private String area;

    public Gerente(String nome, Data nascimento, float salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Area: " + area);
    }

    @Override
    public float calculaImposto() {
        float taxaImposto = 0.05f;
        float imposto = taxaImposto * getSalario();
        System.out.println("Imposto = R$ " + imposto);
        return imposto;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
