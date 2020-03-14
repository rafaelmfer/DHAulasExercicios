package class12.integratingexercise.kotlin

import java.util.Scanner
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val bookManager = BookManager()
    val scannerInput = Scanner(System.`in`)
    initSystemOperations(bookManager, scannerInput)
}

private fun initSystemOperations(bookManager: BookManager, scannerInput: Scanner) {
    print("""                Escolha uma das operações abaixo:
                1 - Cadastrar Livro
                2 - Consultar Livro
                3 - Efetuar Venda
                4 - Sair
                Qual operação deseja fazer: 
                """.trimIndent())
    bookSystemOperations(bookManager, scannerInput, operation = scannerInput.nextInt())
}

private fun bookSystemOperations(bookManager: BookManager, scannerInput: Scanner, operation: Int) {
    when (operation) {
        1 -> registeringBookWithUserInput(bookManager, scannerInput)
        2 -> consultingBookWithUserInput(bookManager, scannerInput)
        3 -> makingSaleWithUserInput(bookManager, scannerInput)
        else -> exitProcess(0)
    }
}

private fun registeringBookWithUserInput(bookManager: BookManager, scannerInput: Scanner) {
    print("Digite um Código para o livro: ")
    val id = scannerInput.nextInt()
    print("Digite o Titulo do livro: ")
    val title = scannerInput.next()
    print("Digite o Autor do livro: ")
    val author = scannerInput.next()
    print("Digite o Ano de Lançamento do livro: ")
    val releaseYear = scannerInput.nextInt()
    print("Digite o Código ISBN do livro: ")
    val codeISBN = scannerInput.nextInt()
    print("Digite a Quantidade de Estoque disponível para este livro: ")
    val stock = scannerInput.nextInt()
    print("Digite o Preço do livro: ")
    val price = scannerInput.nextDouble()
    bookManager.registerBook(book = Book(id, title, author, releaseYear, codeISBN, stock, price))
    hasAnotherOperationToDo(bookManager, scannerInput)
}

private fun consultingBookWithUserInput(bookManager: BookManager, scannerInput: Scanner) {
    print("Digite o código do livro/coleção que deseja consultar: ")
    bookManager.consultBook(id = scannerInput.nextInt())
    hasAnotherOperationToDo(bookManager, scannerInput)
}

private fun makingSaleWithUserInput(bookManager: BookManager, scannerInput: Scanner) {
    print("Digite o código do livro/coleção que deseja efetuar a venda: ")
    bookManager.makeSale(id = scannerInput.nextInt())
    hasAnotherOperationToDo(bookManager, scannerInput)
}

private fun hasAnotherOperationToDo(bookManager: BookManager, scannerInput: Scanner) {
    print("Quer realizar outra operação (1 - SIM, 2 - NÃO): ")
    if (scannerInput.nextInt() == 1) initSystemOperations(bookManager, scannerInput) else exitProcess(0)
}