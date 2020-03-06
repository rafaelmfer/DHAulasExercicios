package class6.herancas.tarefa.tarefa01.java;

public class Funcionario extends Pessoa {
    private float salario;

    public Funcionario(String nome, Data nascimento, float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Salario: " + salario);
    }

    public float calculaImposto() {
        float taxaImposto = 0.03f;
        float imposto = taxaImposto * this.salario;
        System.out.println("Imposto = R$ " + imposto);
        return imposto;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
