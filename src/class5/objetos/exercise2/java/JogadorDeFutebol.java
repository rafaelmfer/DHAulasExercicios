package class5.objetos.exercise2.java;

public class JogadorDeFutebol {
    private String nome;
    private int energia;
    private int alegria;
    private int gols;
    private int experiencia;

    private int contadorGolsFeitos = 0;
    private int contadorCorrer = 0;

    public JogadorDeFutebol(String nome, int energia, int alegria, int gols, int experiencia) {
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.gols = gols;
        this.experiencia = experiencia;
    }

    public void fazerGol() {
        setEnergia(getEnergia() - 5);
        setAlegria(getAlegria() + 10);
        setGols(getGols() + 1);
        System.out.println("GOOOOL!");
    }

    public void correr() {
        setEnergia(getEnergia() - 10);
        System.out.println("Cansei");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

//    public int getContadorCorrer() {
//        return contadorCorrer;
//    }
//
//    public int getContadorGolsFeitos() {
//        return contadorGolsFeitos;
//    }
//
//    public void setContadorGolsFeitos(int contadorGolsFeitos) {
//        this.contadorGolsFeitos = contadorGolsFeitos;
//    }
//
//    public void setContadorCorrer(int contadorCorrer) {
//        this.contadorCorrer = contadorCorrer;
//    }
}
