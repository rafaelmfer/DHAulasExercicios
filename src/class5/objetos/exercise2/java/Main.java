package class5.objetos.exercise2.java;

public class Main {
    public static void main(String[] args) {
        JogadorDeFutebol jogadorRonaldinho = new JogadorDeFutebol("Ronaldinho", 200, 100, 20, 300);
        JogadorDeFutebol jogadorCleber = new JogadorDeFutebol("Cleber", 100, 100, 2, 100);

        SessaoDeTreinamento sessaoDeTreinamento = new SessaoDeTreinamento();

        sessaoDeTreinamento.treinarA(jogadorRonaldinho);
        sessaoDeTreinamento.treinarA(jogadorCleber);

    }
}
