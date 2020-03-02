package exercise02.exercise2.kotlin

fun main(args: Array<String>) {
    val jogadorRonaldinho = JogadorDeFutebol("Ronaldinho", 200, 100, 20, 300)
    val jogadorCleber = JogadorDeFutebol("Cleber", 100, 100, 2, 100)

    val sessaoDeTreinamento = SessaoDeTreinamento()

    sessaoDeTreinamento.treinarA(jogadorRonaldinho)
    sessaoDeTreinamento.treinarA(jogadorCleber)
}