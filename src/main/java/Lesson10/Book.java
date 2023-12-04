package Lesson10;

import java.util.Objects;

public class Book extends PrintedPublications{

    private String author;

    // конструктор
    public Book(){

    }

    public Book(String name, String yearOfPublication, String publisher, String author, int numberOfPages) {
        super(name, yearOfPublication, publisher, numberOfPages);
        this.author = author;

    }

// get и set


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }







    @Override
    public String toString() {
        return "Книга: " +
                "название - " + getName() +
                ", год издания - " + getYearOfPublication() +
                ", издательство -" + getPublisher() +
                ", автор - " + author + '\'' +
                ", количество страниц - " + getNumberOfPages() +
                '.';
    }

}
