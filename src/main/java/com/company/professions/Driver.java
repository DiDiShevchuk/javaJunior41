package com.company.professions;

import java.util.Objects;

public class Driver extends Person{
    private int drivingExperience;

    public Driver(){

    }
    public Driver(String lastName, String firstName, String patronymic, int drivingExperience){
        super(lastName, firstName, patronymic);
        this.drivingExperience = drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience){
        this.drivingExperience = drivingExperience;
    }

    public int getDrivingExperience(){
        return drivingExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Driver driver = (Driver) o;

        return drivingExperience == driver.drivingExperience;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + drivingExperience;
        return result;
    }

    @Override
    public String toString() {
        return "Данный водитель имеет следующие данные: " +
                "фамилия = '" + getLastName() + '\'' +
                ", имя = '" + getFirstName() + '\'' +
                ", отчество = '" + getPatronymic() + '\'' +
                "стаж вождения = '" + drivingExperience + '\'' +
                '.';
    }
}
