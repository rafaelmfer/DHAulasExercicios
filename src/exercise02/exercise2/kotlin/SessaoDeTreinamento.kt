package exercise02.exercise2.kotlin

class SessaoDeTreinamento {
    private var experience = 0

    fun treinarA(jogador: JogadorDeFutebol): Int {
        experience = jogador.experiencia
        println(experience)
        jogador.run {
            correr()
            fazerGol()
            correr()
            atualizaExperiencia(this)
        }
        println(experience)
        return experience
    }

    private fun atualizaExperiencia(jogador: JogadorDeFutebol) {
        experience++
        jogador.experiencia = experience
    }
}