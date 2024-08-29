package oop.study_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 책과 도서관 관리
public class BookMain {
    public static void main(String[] args) {
        Library library = new Library();
        List<Book> books = Arrays.asList( //
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "9780743273565"),
                new Book("1984", "George Orwell", 1949, "9780451524935"),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960, "9780060935467")
        );

        for(Book book : books) {
            library.addBook(book);
        }
        library.printLibraryDetails();

        Book foundBook = library.findBookByIsbn("9780060935467");
        if(foundBook != null) {
            System.out.println("책 :" + foundBook);
        } else {
            System.out.println("책 없음");
        }


    }
}
