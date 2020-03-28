package intellij.class5.objetos.exercise2.kotlin

class JogadorDeFutebol(var nome: String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int) {

    fun fazerGol() {
        energia -= 5
        alegria += 10
        gols++
        println("GOOOOL!")
    }

    fun correr() {
        energia -= 10
        println("Cansei")
    }

}