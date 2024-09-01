package oop.study_6;

public class BookMain {
    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();

        // 책 추가
        Book book1 = new Book("9780743273565", "The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("9780451524935", "1984", "George Orwell", 1949);
        Book book3 = new Book("9780060935467", "To Kill a Mockingbird", "Harper Lee", 1960);

        libraryManager.addBook(book1);
        libraryManager.addBook(book2);
        libraryManager.addBook(book3);

        libraryManager.printAllBooks();

        Book foundBook = libraryManager.findBookByIsbn("9780743273565");
            if (foundBook != null) {
                System.out.println("Found Book: " + foundBook);
            } else {
                System.out.println("Book not found.");
            }

        libraryManager.removeBookByIsbn("9780060935467");

        // 삭제 후 전체 책 목록 출력
        System.out.println("\nAfter deletion:");
        libraryManager.printAllBooks();
    }
}
