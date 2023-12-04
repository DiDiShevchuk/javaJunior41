package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private int loadCapacity;

 public Lorry(){

 }

    public Lorry(String carBrand, String carClass, int weight, Driver driver, Engine engine, int loadCapacity) {
        super(carBrand, carClass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Lorry lorry = (Lorry) o;

        return loadCapacity == lorry.loadCapacity;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + loadCapacity;
        return result;
    }

    @Override
    public String toString() {
        return "Грузовик имеет следующие данные  - " +
                "грузоподъёмность: " + loadCapacity +
                " марку автомобиля: '" + getCarBrand() + '\'' +
                ", класс автомобиля: '" + getCarClass() + '\'' +
                ", вес: " + getWeight() +
                "\n"+ getDriver() +
                "\n" + getEngine() +
                '.';
    }
}
