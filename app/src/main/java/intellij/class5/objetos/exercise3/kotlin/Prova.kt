package intellij.class5.objetos.exercise3.kotlin

data class Prova(
    var dificuldade: Int,
    var energiaNecessaria: Int
) {
    fun podeRealizar(atleta: Atleta): Boolean {
        return atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria
    }
}