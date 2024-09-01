package oop.study_6;

import java.util.HashMap;
import java.util.Map;

//변수:
//
//books: HashMap<String, Book> 타입의 도서 목록, 키는 ISBN.
//메서드:
//
//addBook(Book book): 책을 추가.
//removeBookByIsbn(String isbn): ISBN으로 책을 삭제.
//findBookByIsbn(String isbn): ISBN으로 책을 조회.
//printAllBooks(): 모든 책의 정보를 출력.
public class LibraryManager {
    private Map<String, Book> books; // 키는 isbn
                                    // Map은 for-each문 순회 못함

    public LibraryManager() {
        this.books = new HashMap<>();
    }
    public void addBook( Book book) {
        books.put(book.getIsbn(), book);
    }

    public boolean removeBookByIsbn (String isbn) {
        if(books.containsKey(isbn)) {
            books.remove(isbn);
            return true;
        }
        return false;
    }
    public Book findBookByIsbn(String isbn) {
        return books.get(isbn);
    }

    public void printAllBooks() {
        for( Book book : books.values()){
            System.out.println(book);
        }
    }

}
