package intellij.class5.objetos.exercise2.java;

public class SessaoDeTreinamento {
    private int experience;

    public int treinarA(JogadorDeFutebol jogador) {
        setExperience(jogador.getExperiencia());
        System.out.println(getExperience());
        jogador.correr();
        jogador.fazerGol();
        jogador.correr();
        atualizaExperiencia(jogador);
        System.out.println(getExperience());
        return getExperience();
    }

    private void atualizaExperiencia(JogadorDeFutebol jogador) {
        setExperience(getExperience() + 1);
        jogador.setExperiencia(getExperience());
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
