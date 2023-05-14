import java.util.Scanner;

class Library {
    private int MAX_BOOKS = 100;
    private String[] bookNames = new String[100];
    private String[] authorNames = new String[100];
    private int numBooks = 0;

    public void addBook(String bookName, String authorName) {
        if (numBooks < MAX_BOOKS) {
            bookNames[numBooks] = bookName;
            authorNames[numBooks] = authorName;
            numBooks++;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Maximum limit reached. Cannot add more books.");
        }
    }

    public void printBooks() {
        if (numBooks == 0) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Available books:");
            for (int i = 0; i < numBooks; i++) {
                System.out.println("Book Name: " + bookNames[i] + ", Author Name: " + authorNames[i]);
            }
        }
    }
//}

//public class LibraryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        System.out.println("**********WELCOME TO LIBRARY************");
        System.out.println("\n===== Library Management System =====");
        System.out.println("1. Add a book");
        System.out.println("2. Print available books");
        System.out.println("3. Quit");
        System.out.print("Enter your choice (1,2,3): ");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter book name: ");
                String bookName = scanner.next();
                System.out.print("Enter author name: ");
                String authorName = scanner.next();
                library.addBook(bookName, authorName);
                break;
            case 2:
                library.printBooks();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid entry.");
                break;
        }
    }
}
