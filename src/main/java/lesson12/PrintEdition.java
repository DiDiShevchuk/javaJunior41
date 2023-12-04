package lesson12;

import java.util.Objects;

public class PrintEdition {
    private String name;
    private int year;
    private int pages;
    private String izdatelstvo;

    public PrintEdition(){
        super(); //он не пустой , а пишется слово super()
    }
    public PrintEdition(String name, int year, int pages, String izdatelstvo) {
        super(); // всегда стоит первой строкой
        this.name = name;
        this.year = year;
        this.pages = pages;
        this.izdatelstvo = izdatelstvo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIzdatelstvo() {
        return izdatelstvo;
    }

    public void setIzdatelstvo(String izdatelstvo) {
        this.izdatelstvo = izdatelstvo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrintEdition that = (PrintEdition) o;

        if (year != that.year) return false;
        if (pages != that.pages) return false;
        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(izdatelstvo, that.izdatelstvo);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + year;
        result = 31 * result + pages;
        result = 31 * result + (izdatelstvo != null ? izdatelstvo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PrintEdition{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                ", izdatelstvo='" + izdatelstvo + '\'' +
                '}';
    }

}
