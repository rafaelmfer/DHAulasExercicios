package class12.integratingexercise.kotlin

import java.util.ArrayList

class BookManager {
    private val bookList: MutableList<Book> = ArrayList()

    init {
        setupBookSystem()
    }

    fun registerBook(book: Book) {
        bookList.add(book)
        println("Livro Cadastrado")
    }

    fun consultBook(id: Int) {
        for (b in bookList) {
            if (b.id == id) {
                println(b.toString())
                return
            }
        }
        println("Livro não encontrado")
    }

    fun makeSale(id: Int) {
        for (l in bookList) {
            if (l.id == id) {
                if (l.stockQuantity > 0) {
                    l.stockQuantity = l.stockQuantity - 1
                    println("Venda realizada!")
                } else {
                    println("Estoque Esgotado")
                }
                return
            }
        }
        println("Livro não encontrado")
    }

    private fun setupBookSystem() {
        val book1 = Book(1, "Vidas Secas", "Fulano", 1994, 78859, 5, 50.0)
        val book2 = Book(2, "Qualquer Um", "Siclano", 2016, 81316, 3, 100.0)
        val book3 = Book(3, "H.P. e a Pedra Filosofal", "J.K. Rowling", 1987, 56815, 1, 125.0)
        val book4 = Book(4, "Dom Casmurro", "Machado de Assis", 2019, 12345, 0, 75.0)
        bookList.add(book1)
        bookList.add(book2)
        bookList.add(book3)
        bookList.add(book4)
    }
}