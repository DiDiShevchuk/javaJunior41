package lesson6;

import java.util.Scanner;

public class ScannerUtils {
    public static void searchByCountry(String[][] tours){
        Scanner scanner = new Scanner(System.in);
        System.out.println("В какую страну хотите поехать?");
        String country = scanner.next();

        ToursUtils.printToursByCountry(tours, country);
    }
    // поиск туров по бюджету. Пользователь задаёт одно число, и мы печатаем туры +- от этого бюджета

    public static void searchByBudget(String[][] tours){
        Scanner scanner = new Scanner(System.in);
        System.out.println("На какой бюджет располагаете?");
        int budget = scanner.nextInt();
        System.out.println("----- РЕЗУЛЬТАТ----------------");
        ToursUtils.printToursByBudget(tours, budget);
        System.out.println("-------------------------------------");
    }
    public static void searchByDay(String[][] tours){
        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько дней отдыха?");
        int day = scanner.nextInt();
        System.out.println("----- РЕЗУЛЬТАТ----------------");
        ToursUtils.printToursByDay(tours, day);
        System.out.println("-------------------------------------");
    }

    public static void searchByStarsAndTransport(String[][] tours){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько звёзд должно быть у отеля?");
        int stars = scanner.nextInt();
        System.out.println("Какой должен быть транспорт?");
        String transport = scanner.nextLine();
        System.out.println("----- РЕЗУЛЬТАТ----------------");
        ToursUtils.printToursByStarsAndTransport(tours, stars, transport);
        System.out.println("-------------------------------------");
    }

}
