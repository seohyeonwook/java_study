package oop.study_6;

//변수:
//
//isbn: 책의 고유 식별자 (ISBN).
//title: 책의 제목.
//author: 책의 저자.
//publicationYear: 출판 연도.
//메서드:
//
//getIsbn(): 책의 ISBN을 반환.
//getTitle(): 책의 제목을 반환.
//setTitle(String title): 책의 제목을 설정.
//getAuthor(): 책의 저자를 반환.
//setAuthor(String author): 책의 저자를 설정.
//getPublicationYear(): 책의 출판 연도를 반환.
//setPublicationYear(int publicationYear): 책의 출판 연도를 설정.
public class Book {
    private String isbn;
    private String title;
    private String author;
    private int publicationYear;

    public Book(String isbn, String title, String author, int publicationYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getIsbn() {
        return isbn;
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

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
