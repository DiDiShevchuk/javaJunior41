package Lesson10;


import java.util.Arrays;
import java.util.Objects;

public class PrintedPublications {
    private String name;
    private String yearOfPublication;
    private String publisher;
    private int numberOfPages;

    public PrintedPublications() {
    }

    public PrintedPublications(String name, String yearOfPublication, String publisher, int numberOfPages) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrintedPublications that = (PrintedPublications) o;

        if (numberOfPages != that.numberOfPages) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(yearOfPublication, that.yearOfPublication))
            return false;
        return Objects.equals(publisher, that.publisher);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (yearOfPublication != null ? yearOfPublication.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        result = 31 * result + numberOfPages;
        return result;
    }

    @Override
    public String toString() {
        return "Печатное издание: " +
                "название - '" + name + '\'' +
                ", год издания - '" + yearOfPublication + '\'' +
                ", издательство - '" + publisher + '\'' +
                ", количество страниц - " + numberOfPages +
                '.';
    }

    public static void printBiggestEdition(PrintedPublications[] printedPublications) {

        int maxPages = 0;
        for (int i = 0; i < printedPublications.length; i++) {

            if (printedPublications[i] == null) {
                break;
            }
            if (printedPublications[i].getNumberOfPages() > maxPages) {
                maxPages = printedPublications[i].getNumberOfPages();

            }

            System.out.println(maxPages);


        }


    }
}

