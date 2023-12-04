package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][]  tours = new String[100][8];
        ToursUtils.addTour("Италия","Рим","Самолет","6 дней", "14000 руб","5 звезд","Завтрак", tours);
        ToursUtils.addTour("Италия","Флоренция","Самолет","5 дней", "18000 руб","5 звезд","Все включено", tours);
        ToursUtils.addTour("Франция","Париж","Самолет","6 дней", "14000 руб","4 звезды","Все включено", tours);
        ToursUtils.addTour("Ливан","Бейрут","Автобус","4 дня", "50000 руб","4 звезды","Завтрак + Ужин", tours);
        ToursUtils.addTour("Германия","Мюнхен","Самолет","6 дней", "21000 руб","5 звезд","Завтрак + Ужин", tours);
        ToursUtils.addTour("Германия","Берлин","Самолет","5 дней", "22000 руб","5 звезд","Завтрак", tours);
        ToursUtils.addTour("США","Нью-Йорк","Самолет","6 дней", "25000 руб","5 звезд","Завтрак + Ужин", tours);

        ScannerUtils.searchByCountry(tours);
        ScannerUtils.searchByBudget(tours);
        ScannerUtils.searchByDay(tours);
        ScannerUtils.searchByStarsAndTransport(tours);
        /**
         * 1 - вывести на консоль туры, которые на .... дней
         * 2 - вывести на консоль туры на ,,,,,, звезд и --------- транспорт
         * 3 - Вывести на консол туры, ----- страны и на ----- бюджет
         */
    }

}
