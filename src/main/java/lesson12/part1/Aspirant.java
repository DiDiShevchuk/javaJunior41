package lesson12.part1;

import java.util.Objects;

public class Aspirant extends Student{
    private String scientifiWork;

    public Aspirant(String firstName, String lastName, int group, double averageMark, String scientifiWork) {
        super(firstName, lastName, group, averageMark);
        this.scientifiWork = scientifiWork;
    }

    public String getScientifiWork() {
        return scientifiWork;
    }

    public void setScientifiWork(String scientifiWork) {
        this.scientifiWork = scientifiWork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aspirant aspirant = (Aspirant) o;

        return Objects.equals(scientifiWork, aspirant.scientifiWork);
    }

    @Override
    public int hashCode() {
        return scientifiWork != null ? scientifiWork.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Аспирант {" +
                "Фамилия = '" + super.getFirstName() + '\'' +
                ", Имя = '" + super.getLastName() + '\'' +
                ", группа = " + super.getGroup() +
                ", средняя оценка = " + super.getAverageMark() +
                "научная работа = '" + scientifiWork + '\'' +
                '}';
    }
    public void getScholarship() {
        String sumScholarship = (getAverageMark() == 5) ? "Сумма стипендии 2500 рублей. " : "Сумма стипендии 2000 рублей. ";
        System.out.println(sumScholarship);
    }
}
