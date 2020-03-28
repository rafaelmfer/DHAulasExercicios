package intellij.class12.integratingexercise.java;

public class Book {
    private int id;
    private String title;
    private String author;
    private int releaseYear;
    private int codeISBN;
    private int stockQuantity;
    private Double price;

    public Book(int id, String title, String author, int releaseYear, int codeISBN, int stockQuantity, Double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.codeISBN = codeISBN;
        this.stockQuantity = stockQuantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getCodeISBN() {
        return codeISBN;
    }

    public void setCodeISBN(int codeISBN) {
        this.codeISBN = codeISBN;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Livro {codigo = " + id +
                ", titulo = '" + title +
                '\'' + ", autor = '" + author +
                '\'' + ", anoDeLancamento = " + releaseYear +
                ", Estoque = " + stockQuantity +
                ", preco = " + price + '}';
    }
}
