package oop.study_3;

//변수 (속성)
//books: Book 객체를 저장하는 리스트. 여러 책을 관리할 수 있도록 List<Book> 타입.

import java.util.ArrayList;
import java.util.List;

//메서드
//생성자: 빈 books 리스트를 초기화하는 메서드.
//addBook: Book 객체를 리스트에 추가하는 메서드.
//findBookByIsbn: 특정 ISBN으로 책을 찾는 메서드. 해당 ISBN을 가진 Book 객체를 반환하거나, 없으면 null을 반환.
//printLibraryDetails: 도서관에 있는 모든 책의 정보를 출력하는 메서드.
public class Library {
    List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookByIsbn(String isbn) {
        for(Book book : books) {
            if(book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public void printLibraryDetails() {
        for(Book book : books) {
            System.out.println(book);
        }
    }
}
