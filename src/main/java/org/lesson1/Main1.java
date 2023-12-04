package org.lesson1;

public class Main1 {

    public static void main(String[] args) {


        int money = 1000;
        int priceOfSnickers = 35;
        double priceOfCandy = 3.5;

        int countSnikersCanBuy = money / priceOfSnickers; //  1000 / 35 = 28 шт сникерсов купили
        int restOfMoneyAfterSnikersBuy = money % priceOfSnickers; // 1000 % 35
        int countCandyCanBuy = (int)(restOfMoneyAfterSnikersBuy / priceOfCandy);

        double restOfMoney = restOfMoneyAfterSnikersBuy % priceOfCandy; // 20 % 3.5

        System.out.println(countSnikersCanBuy);
        System.out.println(countCandyCanBuy);
        System.out.println(restOfMoney);
    }
}
