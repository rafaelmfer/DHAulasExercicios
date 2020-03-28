package intellij.class10.equalsoverloadingoverridetostring.exercise2.kotlin

data class Coca(var tamanho: Int, var preco: Double) {

    //Equals padrão que compara o objeto inteiro
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//        other as Coca
//        if (tamanho != other.tamanho) return false
//        if (preco != other.preco) return false
//        return true
//    }

    //Equals que compara apenas o Tamanho do objeto
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Coca
        if (tamanho != other.tamanho) return false
        return true
    }
}