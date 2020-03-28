package intellij.class10.equalsoverloadingoverridetostring.exercise3.kotlin

data class Aluno(var nome: String, var numeroDoAluno: Int) {

    //Equals padrão que compara o objeto inteiro
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//        other as Aluno
//        if (nome != other.nome) return false
//        if (numeroDoAluno != other.numeroDoAluno) return false
//        return true
//    }

    //Equals que compara apenas o Numero do Aluno do objeto
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Aluno
        if (numeroDoAluno != other.numeroDoAluno) return false
        return true
    }
}