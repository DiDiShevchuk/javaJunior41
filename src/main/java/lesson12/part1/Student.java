package lesson12.part1;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private double averageMark;
 // создали конструкторы
    public Student() {
    }

    public Student(String firstName, String lastName, int group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

// set и get

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (group != student.group) return false;
        if (Double.compare(student.averageMark, averageMark) != 0) return false;
        if (!Objects.equals(firstName, student.firstName)) return false;
        return Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + group;
        temp = Double.doubleToLongBits(averageMark);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Студент { " +
                "Фамилия = '" + firstName + '\'' +
                ", Имя = '" + lastName + '\'' +
                ", группа = " + group +
                ", средняя оценка = " + averageMark +
                '}';
    }

    public void getScholarship() {
       String sumScholarship = (getAverageMark() == 5) ? "Сумма стипендии 2000 рублей. " : "Сумма стипендии 1900 рублей. ";
        System.out.println(sumScholarship);
    }


}
