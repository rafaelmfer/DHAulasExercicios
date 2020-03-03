package exercise02.exerciseAdditional.kotlin

data class Prova(
    var dificuldade: Int = 0,
    var energiaNecessaria: Int = 0
) {
    fun podeRealizar(atleta: Atleta): Boolean {
        return atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria
    }

    fun whoIsTheBest(atleta1: Atleta, atleta2: Atleta): String? {
        return if (podeRealizar(atleta1) && podeRealizar(atleta2)) {
            if (atleta1.nivel > atleta2.nivel) atleta1.name else atleta2.name
        } else if (podeRealizar(atleta1) && !podeRealizar(atleta2)) {
            atleta1.name
        } else if (!podeRealizar(atleta1) && podeRealizar(atleta2)) {
            atleta2.name
        } else null
    }

}