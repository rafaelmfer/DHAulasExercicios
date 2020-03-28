package intellij.class5.objetos.exercise5.java;

public class Cliente {
    private String nome;
    private String sobrenome = "";
    private String contatoTel;

    public Cliente(String nome, String sobrenome, String contatoTel) {
        setNome(nome);
        setSobrenome(sobrenome);
        setContatoTel(contatoTel);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getContatoTel() {
        return contatoTel;
    }

    public void setContatoTel(String contatoTel) {
        this.contatoTel = contatoTel;
    }
}