package class12.integratingexercise.kotlin

data class Book(
    var id: Int,
    var title: String,
    var author: String,
    var releaseYear: Int,
    var codeISBN: Int,
    var stockQuantity: Int,
    var price: Double
) {
    override fun toString(): String {
        return "Livro {codigo = " + id +
                ", titulo = '" + title +
                '\'' + ", autor = '" + author +
                '\'' + ", anoDeLancamento = " + releaseYear +
                ", Estoque = " + stockQuantity +
                ", preco = " + price + '}'
    }
}