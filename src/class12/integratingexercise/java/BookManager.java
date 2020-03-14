package class12.integratingexercise.java;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> bookList = new ArrayList<>();
//    private Map<Integer, List<Book>> bookHash = new HashMap<>();

    public BookManager() {
        setupBookSystem();
    }

    public void registerBook(Book book) {
        bookList.add(book);
        System.out.println("Livro Cadastrado");
    }

    public void consultBook(int id) {
        for (Book b : bookList) {
            if (b.getId() == id) {
                System.out.println(b.toString());
                return;
            }
        }
        System.out.println("Livro não encontrado");
    }

    public void makeSale(int id) {
        for (Book l : bookList) {
            if (l.getId() == id) {
                if (l.getStockQuantity() > 0) {
                    l.setStockQuantity(l.getStockQuantity() - 1);
                    System.out.println("Venda realizada!");
                } else {
                    System.out.println("Estoque Esgotado");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado");
    }

    private void setupBookSystem() {
        Book book1 = new Book(1, "Vidas Secas", "Fulano", 1994, 78859, 5, 50.0);
        Book book2 = new Book(2, "Qualquer Um", "Siclano", 2016, 81316, 3, 100.0);
        Book book3 = new Book(3, "H.P. e a Pedra Filosofal", "J.K. Rowling", 1987, 56815, 1, 125.0);
        Book book4 = new Book(4, "Dom Casmurro", "Machado de Assis", 2019, 12345, 0, 75.0);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
    }
}
