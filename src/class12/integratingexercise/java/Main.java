package class12.integratingexercise.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Scanner scannerInput = new Scanner(System.in);

        initSystemOperations(bookManager, scannerInput);
    }

    protected static void initSystemOperations(BookManager bookManager, Scanner scannerInput) {
        System.out.print("Escolha uma das operações abaixo:\n" +
                "1 - Cadastrar Livro\n" +
                "2 - Consultar Livro\n" +
                "3 - Efetuar Venda\n" +
                "4 - Sair\n" +
                "Qual operação deseja fazer: ");
        int operation = scannerInput.nextInt();
        bookSystemOperations(bookManager, scannerInput, operation);
    }

    private static void bookSystemOperations(BookManager bookManager, Scanner scannerInput, int operation) {
        switch (operation) {
            case 1: {
                registeringBookWithUserInput(bookManager, scannerInput);
                break;
            }
            case 2: {
                consultingBookWithUserInput(bookManager, scannerInput);
                break;
            }
            case 3: {
                makingSaleWithUserInput(bookManager, scannerInput);
                break;
            }
            default: {
                System.exit(0);
            }
        }
    }

    private static void registeringBookWithUserInput(BookManager bookManager, Scanner scannerInput) {
        System.out.print("Digite um Código para o livro: ");
        int id = scannerInput.nextInt();
        System.out.print("Digite o Titulo do livro: ");
        String title = scannerInput.next();
        System.out.print("Digite o Autor do livro: ");
        String author = scannerInput.next();
        System.out.print("Digite o Ano de Lançamento do livro: ");
        int releaseYear = scannerInput.nextInt();
        System.out.print("Digite o Código ISBN do livro: ");
        int codeISBN = scannerInput.nextInt();
        System.out.print("Digite a Quantidade de Estoque disponível para este livro: ");
        int stock = scannerInput.nextInt();
        System.out.print("Digite o Preço do livro: ");
        double price = scannerInput.nextDouble();

        Book book = new Book(id, title, author, releaseYear, codeISBN, stock, price);
        bookManager.registerBook(book);

        hasAnotherOperationToDo(bookManager, scannerInput);
    }

    private static void consultingBookWithUserInput(BookManager bookManager, Scanner scannerInput) {
        System.out.print("Digite o código do livro/coleção que deseja consultar: ");
        int id = scannerInput.nextInt();
        bookManager.consultBook(id);

        hasAnotherOperationToDo(bookManager, scannerInput);
    }

    private static void makingSaleWithUserInput(BookManager bookManager, Scanner scannerInput) {
        System.out.print("Digite o código do livro/coleção que deseja efetuar a venda: ");
        int id = scannerInput.nextInt();
        bookManager.makeSale(id);

        hasAnotherOperationToDo(bookManager, scannerInput);
    }

    private static void hasAnotherOperationToDo(BookManager bookManager, Scanner scannerInput) {
        System.out.print("Quer realizar outra operação (1 - SIM, 2 - NÃO): ");
        int tryAgain = scannerInput.nextInt();
        if (tryAgain == 1) initSystemOperations(bookManager, scannerInput);
        else System.exit(0);
    }
}
