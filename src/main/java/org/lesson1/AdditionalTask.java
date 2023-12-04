package org.lesson1;

public class AdditionalTask {
    public static void main(String[] args) {
        int numberOfDaysInYear = 366;
        int numberOfDaysInWeek = 7;
        int saveMoney = 10_000;
        int saveMoneyEveryTuesday = 2;


        int numberOfTuesdaysPerYear = numberOfDaysInYear / numberOfDaysInWeek;
        int savedUpMoneyForYear = numberOfTuesdaysPerYear * saveMoneyEveryTuesday;


        int howManyYearsToSave = saveMoney / savedUpMoneyForYear;
        int numberOfTuesdayForTheFullAmount = saveMoney % howManyYearsToSave / saveMoneyEveryTuesday;
        System.out.println("Понадобится " + howManyYearsToSave + " лет и ещё " + numberOfTuesdayForTheFullAmount + " вторников, чтобы собрать ровно 10 000 рублей.");


        /*
        // по условию задачи, нужно найти кол-во лет, но ровное кол-во у меня не вышло, поэтому я сделала второй вариант. Где результат округляется в бОльшую сторону.
        int numberOfDaysInYear = 366;
        int numberOfDaysInWeek = 7;
        double saveMoney = 10_000;
        int saveMoneyEveryTuesday = 2;

        int numberOfTuesdaysPerYear = numberOfDaysInYear / numberOfDaysInWeek;
        int savedUpMoneyForYear = numberOfTuesdaysPerYear * saveMoneyEveryTuesday;
        int howManyYearsToSave = (int)Math.ceil(saveMoney / savedUpMoneyForYear);
        System.out.println("Понадобится " + howManyYearsToSave + " лет, чтобы собрать 10 000 рублей.");
        */

    }
}



