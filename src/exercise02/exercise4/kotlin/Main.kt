package exercise02.exercise4.kotlin

fun main(args: Array<String>) {
    val tripePrincipal = Tripe(false, 60, 10, 10)

    tripePrincipal.definirAltura(50)

    tripePrincipal.dobrar()
    tripePrincipal.desdobrar()
    println(tripePrincipal.isDobrado)

    println(tripePrincipal.prontoParaGuardar())
    tripePrincipal.guardar()
    println(tripePrincipal.prontoParaGuardar())

    println(tripePrincipal.prontoParaUsar())
    tripePrincipal.usar()
}
