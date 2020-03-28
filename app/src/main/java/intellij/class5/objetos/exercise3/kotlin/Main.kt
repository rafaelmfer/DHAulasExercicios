package intellij.class5.objetos.exercise3.kotlin

fun main(args: Array<String>) {
    val atletaMichael = Atleta("Michael", 10, 300)
    val atletaTroy = Atleta("Troy", 5, 135)

    val provaHabilidade = Prova(5, 125)
    val provaCorrida = Prova(10, 250)
    val provaLideranca = Prova(15, 500)
    val provaPuloAlto = Prova(3, 75)
    val provaLanceLivre = Prova(5, 135)
    val provaJogoEmEquipe = Prova(10, 200)

    println(provaHabilidade.podeRealizar(atletaMichael))
    println(provaCorrida.podeRealizar(atletaMichael))
    println(provaLideranca.podeRealizar(atletaMichael))

    println(provaPuloAlto.podeRealizar(atletaTroy))
    println(provaLanceLivre.podeRealizar(atletaTroy))
    println(provaJogoEmEquipe.podeRealizar(atletaTroy))
}