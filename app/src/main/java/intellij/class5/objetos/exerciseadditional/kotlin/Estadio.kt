package intellij.class5.objetos.exerciseadditional.kotlin

import java.util.ArrayList

class Estadio {
    var provaList: List<Prova> = listOf()
    private val provaHabilidade = Prova()
    private val provaCorrida = Prova()
    private val provaLideranca = Prova()
    private val provaPuloAlto = Prova()
    private val provaLanceLivre = Prova()
    private val provaJogoEmEquipe = Prova()

    constructor()
    constructor(provaList: List<Prova>) {
        this.provaList = provaList
    }

    fun saberDesempenho(atleta: Atleta): List<Boolean> {
//        List<Prova> provasRealizadas = new ArrayList<>();
        val provasRealizadas: MutableList<Boolean> = ArrayList()
        for (index in provaList.indices) {
//            if (getProvaList().get(index).podeRealizar(atleta)) {
//                provasRealizadas.add(getProvaList().get(index));
//            }
            provasRealizadas.add(provaList[index].podeRealizar(atleta))
        }
        return provasRealizadas
    }

    fun whoWinsTheGoldMedal(atleta1: Atleta, atleta2: Atleta): String {
        return if (saberDesempenho(atleta1).size == saberDesempenho(atleta2).size) {
            if (atleta1.nivel > atleta2.nivel) atleta1.name else atleta2.name
        } else if (saberDesempenho(atleta1).size > saberDesempenho(atleta2).size) {
            atleta1.name
        } else atleta2.name
    }

    private fun createProvasSerie1(): List<Prova> {
        provaHabilidade.apply {
            dificuldade = 3
            energiaNecessaria = 75
        }
        provaCorrida.apply {
            dificuldade = 5
            energiaNecessaria = 135
        }
        provaLideranca.apply {
            dificuldade = 10
            energiaNecessaria = 200
        }
        provaPuloAlto.apply {
            dificuldade = 4
            energiaNecessaria = 95
        }
        val provaList: MutableList<Prova> = mutableListOf()
        provaList.add(provaHabilidade)
        provaList.add(provaCorrida)
        provaList.add(provaLideranca)
        provaList.add(provaPuloAlto)
        return provaList
    }

    private fun createProvasSerie2(): List<Prova> {
        provaCorrida.apply {
            dificuldade = 9
            energiaNecessaria = 200
        }
        provaPuloAlto.apply {
            dificuldade = 6
            energiaNecessaria = 145
        }
        provaLanceLivre.apply {
            dificuldade = 8
            energiaNecessaria = 156
        }
        provaJogoEmEquipe.apply {
            dificuldade = 3
            energiaNecessaria = 75
        }
        val provaList: MutableList<Prova> = ArrayList()
        provaList.add(provaCorrida)
        provaList.add(provaPuloAlto)
        provaList.add(provaLanceLivre)
        provaList.add(provaJogoEmEquipe)
        return provaList
    }

    fun setProvaList(number: Int) {
        when (number) {
            0 -> provaList = createProvasSerie1()
            1 -> provaList = createProvasSerie2()
        }
    }
}