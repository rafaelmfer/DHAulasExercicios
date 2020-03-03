package exercise02.exerciseAdditional.kotlin

fun main(args: Array<String>) {
    val maracana = Estadio()
    val gavea = Estadio()
    maracana.setProvaList(1)
    gavea.setProvaList(0)

    val atletaMichael = Atleta("Michael", 10, 300)
    val atletaTroy = Atleta("Troy", 7, 400)

    println(maracana.saberDesempenho(atletaMichael))
    println(maracana.saberDesempenho(atletaTroy))

    println(maracana.provaList[0].whoIsTheBest(atletaMichael, atletaTroy))
    println(gavea.provaList[3].whoIsTheBest(atletaMichael, atletaTroy))

    println(maracana.whoWinsTheGoldMedal(atletaMichael, atletaTroy))
    println(gavea.whoWinsTheGoldMedal(atletaMichael, atletaTroy))
}