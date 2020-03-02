package exercise02.exercise2.java;

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
        jogador.setExperiencia(getExperience() + 1);
        setExperience(getExperience() + 1);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
