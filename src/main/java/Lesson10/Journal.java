package Lesson10;

import java.util.Objects;

public class Journal extends PrintedPublications {
    private int numberOfYear;

    // конструктор
    public Journal(String name, String yearOfPublication, String publisher, int numberOfPages, int numberOfYear){
        super(name, yearOfPublication, publisher, numberOfPages);
        this.numberOfYear = numberOfYear;
    }
    // get и set

    public int getNumberOfYear() {
        return numberOfYear;
    }

    public void setNumberOfYear(int numberOfYear) {
        this.numberOfYear = numberOfYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Journal journal = (Journal) o;

        return numberOfYear == journal.numberOfYear;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfYear;
        return result;
    }

    @Override
    public String toString() {
        return "Журнал " +
                " название - " + getName() +
                ", год издания - " + getYearOfPublication() +
                ", издательство - " + getPublisher() +
                ", количество страниц - " + getNumberOfPages() +
                ", номер выпуска: " + numberOfYear +
                '.';
    }
}