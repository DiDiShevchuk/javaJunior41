package com.company.professions;

import java.util.Objects;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;

    public Person() {
    }

    public Person(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!Objects.equals(lastName, person.lastName)) return false;
        if (!Objects.equals(firstName, person.firstName)) return false;
        return Objects.equals(patronymic, person.patronymic);
    }

    @Override
    public int hashCode() {
        int result = lastName != null ? lastName.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Данный человек имеет следующие данные: " +
                "фамилия = '" + lastName + '\'' +
                ", имя = '" + firstName + '\'' +
                ", отчество = '" + patronymic + '\'' +
                '.';
    }
}
