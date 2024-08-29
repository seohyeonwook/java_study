package oop.study_3;

//변수 (속성)
//title: 책의 제목을 저장하는 변수. String 타입.
//author: 책의 저자를 저장하는 변수. String 타입.
//year: 책의 출판 연도를 저장하는 변수. int 타입.
//isbn: 책의 ISBN 번호를 저장하는 변수. String 타입.

//메서드
//생성자: 책의 제목, 저자, 출판 연도, ISBN을 초기화하는 메서드. (초기화 할 때 사용하는 메서드)
//getTitle: 책의 제목을 반환하는 메서드.
//setTitle: 책의 제목을 설정하는 메서드.
//getAuthor: 책의 저자를 반환하는 메서드.
//setAuthor: 책의 저자를 설정하는 메서드.
//getYear: 책의 출판 연도를 반환하는 메서드.
//setYear: 책의 출판 연도를 설정하는 메서드.
//getIsbn: 책의 ISBN 번호를 반환하는 메서드.
//setIsbn: 책의 ISBN 번호를 설정하는 메서드.
//toString: 책의 정보를 문자열로 반환하는 메서드
public class Book {
    private String title;
    private String author;
    private int year;
    private String isbn;

    public Book(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
