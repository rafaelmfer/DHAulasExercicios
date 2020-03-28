package intellij.class10.equalsoverloadingoverridetostring.exercise4.kotlin

class Funcionario(var nome: String, var numeroDeRegistro: Int) {

    //Equals padrão que compara o objeto inteiro
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//        other as Funcionario
//        if (nome != other.nome) return false
//        if (numeroDeRegistro != other.numeroDeRegistro) return false
//        return true
//    }

    //Equals que compara apenas o Numero de Registro do objeto
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Funcionario
        if (numeroDeRegistro != other.numeroDeRegistro) return false
        return true
    }
}