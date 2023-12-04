package lesson2;

public class Main10 {
    public static void main(String[] args) {
        // посчитать сколько нужно лет, чтобы собрать сумму в 200 тысяч рублей, если откладывать ежемесячно по 9 500 рублей

        int postponePerMonth = 9500;
        int money = 200_000;
        int year = 0;

        for (int i = 0; i <= money / postponePerMonth; i++) {
            year = (int)Math.ceil(i / 12.0);

        }
        System.out.println(year);

    }
}
