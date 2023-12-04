package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private int maxSpeed;
    public SportCar(){

    }

    public SportCar(String carBrand, String carClass, int weight, Driver driver, Engine engine, int maxSpeed) {
        super(carBrand, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SportCar sportCar = (SportCar) o;

        return maxSpeed == sportCar.maxSpeed;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + maxSpeed;
        return result;
    }

    @Override
    public String toString() {
        return "Спортивный автомобиль следующие данные - " +
                "максимальная скорость: " + maxSpeed + " км/ч " +
                " марка автомобиля: '" + getCarBrand() + '\'' +
                ", класс автомобиля: '" + getCarClass() + '\'' +
                ", вес: " + getWeight() + " кг " + "\n" +
                getDriver() + "\n" +
                getEngine() +
                '.';
    }
}
