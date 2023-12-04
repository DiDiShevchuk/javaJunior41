package lesson12;

import java.util.Objects;

public class Book extends PrintEdition{
    private String author;

    public Book() {
    }

    public Book(String name, int year, int pages, String izdatelstvo, String author) {
        super(name, year, pages, izdatelstvo);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Книга { Название " + getName() + ", кол-во страниц: " + getPages() + // переопределение метода toString через getName
                " автор = " + author + " Издательство: " + getIzdatelstvo() + " Год выпуска: " + getYear() + "}";

    }
}
