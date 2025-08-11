import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    private LinkedHashMap<String, String> borrowedBooks = new LinkedHashMap<>();

    public void borrowBook(String studentName, String bookTitle) {
        borrowedBooks.put(studentName, bookTitle);
        System.out.println(studentName + " borrowed " + bookTitle);
    }

    public void returnBook(String studentName) {
        if (borrowedBooks.containsKey(studentName)) {
            borrowedBooks.remove(studentName);
            System.out.println(studentName + " returned their book.");
        } else {
            System.out.println(studentName + " has not borrowed any books.");
        }
    }

    public void checkBorrowedBook(String studentName) {
        if (borrowedBooks.containsKey(studentName)) {
            String bookTitle = borrowedBooks.get(studentName);
            System.out.println(studentName + " has borrowed " + bookTitle);
        } else {
            System.out.println(studentName + " has not borrowed any books.");
        }
    }

    public void displayAllBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books are currently borrowed.");
        } else {
            System.out.println("List of borrowed books:");
            for (Map.Entry<String, String> entry : borrowedBooks.entrySet()) {
                System.out.println(entry.getKey() + " borrowed " + entry.getValue());
            }
        }
    }

    public void borrowBookIfNotBorrowed(String bookTitle, String studentName) {
        if (!borrowedBooks.containsValue(bookTitle)) {
            borrowedBooks.putIfAbsent(studentName, bookTitle);
            System.out.println(studentName + " successfully borrowed " + bookTitle);
        } else {
            System.out.println(bookTitle + " is already borrowed by another student.");
        }
    }

    public static void main(String[] args) {
        Main library = new Main();

        // Borrowing books
        library.borrowBook("Alice", "Java Programming");
        library.borrowBook("Bob", "Data Structures");

        // Display all borrowed books
        library.displayAllBorrowedBooks();

        // Check if Charlie has borrowed a book
        library.checkBorrowedBook("Charlie");

        // Borrow a book only if it's not already borrowed
        library.borrowBookIfNotBorrowed("Java Programming", "Charlie");

        // Borrow another book
        library.borrowBookIfNotBorrowed("Operating Systems", "Charlie");

        // Return a book
        library.returnBook("Alice");

        // Display all borrowed books after return
        library.displayAllBorrowedBooks();
    }
}
