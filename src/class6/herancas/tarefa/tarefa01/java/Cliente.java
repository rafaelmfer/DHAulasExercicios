package class6.herancas.tarefa.tarefa01.java;

public class Cliente extends Pessoa {
    private int codigo;

    public Cliente(int codigo, String nome, Data nascimento) {
        super(nome, nascimento);
        this.codigo = codigo;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Código do Cliente: " + codigo);
        super.imprimeDados();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
