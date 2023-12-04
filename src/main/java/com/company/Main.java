package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {


        Engine engine = new Engine(159, "Wilson");
        Driver driver = new Driver("Карпов", "Валерий", "Астахович", 15);
        Car car = new Car("BMW", "E", 2525, driver, engine);
        SportCar sportCar = new SportCar("Ferrari 250 GTO", "гран туризмо", 1100, driver, engine, 280);

        Lorry lorry = new Lorry("Scania", "грузовой", 8190, driver, engine, 19000);


        System.out.println(car.toString());
        System.out.println("-------------------");
        System.out.println(sportCar.toString());
        System.out.println("-------------------");
        System.out.println(lorry.toString());


        System.out.println("-------------------");
        car.start();
        car.turnRight();
        car.stop();
        car.turnLeft();

    }
}