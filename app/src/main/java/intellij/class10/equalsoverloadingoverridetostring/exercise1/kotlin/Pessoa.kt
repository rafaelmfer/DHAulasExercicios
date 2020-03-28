package intellij.class10.equalsoverloadingoverridetostring.exercise1.kotlin

data class Pessoa(var nome: String, var rg: Int) {

    //Equals padrão que compara o objeto inteiro
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//        other as Pessoa
//        if (nome != other.nome) return false
//        if (rg != other.rg) return false
//        return true
//    }

    //Equals que compara apenas o RG do objeto
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Pessoa
        if (rg != other.rg) return false
        return true
    }
}