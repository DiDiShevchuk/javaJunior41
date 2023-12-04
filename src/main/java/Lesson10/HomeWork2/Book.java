package Lesson10.HomeWork2;

//создали подклас книги с добавлением в нем индивидуальных переменных
public class Book extends Product {
    private String author;
    private int pageCount;

    public Book(String name, int yearOfPublication, String publisher, String author, int pageCount) {
        super(name, yearOfPublication, publisher);
        this.author = author;
        this.pageCount = pageCount;
    }

    public void displayProduct() {
        System.out.printf("Название %s, год %s, издатель %s, автор %s, страниц %s \n", getName(), getYearOfPublication(), getPublisher(), author, pageCount);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
