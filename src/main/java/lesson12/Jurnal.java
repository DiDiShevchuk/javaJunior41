package lesson12;

public class Jurnal extends PrintEdition{

    private int numberofYear;

    public Jurnal() {
    }

    public Jurnal(String name, int year, int pages, String izdatelstvo, int numberofYear) {
        super(name, year, pages, izdatelstvo);
        this.numberofYear = numberofYear;
    }

    public int getNumberofYear() {
        return numberofYear;
    }

    public void setNumberofYear(int numberofYear) {
        this.numberofYear = numberofYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Jurnal jurnal = (Jurnal) o;

        return numberofYear == jurnal.numberofYear;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberofYear;
        return result;
    }

    @Override
    public String toString() {
        return "Журнал { Название " + getName() + ", кол-во страниц: " + getPages() + // переопределение метода toString через getName
                " номер выпуска = " + numberofYear + "Издательство: " + getIzdatelstvo() + " Год выпуска: " + getYear() + "}";
    }
}
