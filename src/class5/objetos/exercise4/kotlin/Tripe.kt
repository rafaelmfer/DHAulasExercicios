package class5.objetos.exercise4.kotlin

data class Tripe(
    var isDobrado: Boolean,
    var alturaMaxima: Int,
    var alturaMinima: Int,
    var alturaAtual: Int
) {

    fun definirAltura(novaAltura: Int) {
        if (alturaAtual in alturaMinima..alturaMaxima) {
            this.alturaAtual = novaAltura
            println(alturaAtual)
        } else println("Escolha uma altura entre Altura Maxima e Minima do tripé")
    }

    fun dobrar() {
        if (!isDobrado) {
            isDobrado = true
            println("Tripé dobrado")
        } else println("Tripé já está dobrado")
    }

    fun desdobrar() {
        if (isDobrado) {
            isDobrado = false
            println("Tripé desdobrado")
        } else println("Tripé já está desdobrado")
    }

    fun guardar() {
        dobrar()
        alturaAtual = alturaMinima
    }

    fun prontoParaGuardar(): Boolean {
        return isDobrado && alturaAtual == alturaMinima
    }

    fun usar() {
        desdobrar()
        alturaAtual = alturaMaxima / 2
    }

    fun prontoParaUsar(): Boolean {
        return !isDobrado && alturaAtual >= alturaMaxima / 2
    }
}