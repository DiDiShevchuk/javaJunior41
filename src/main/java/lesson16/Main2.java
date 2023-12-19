package lesson16;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5,1999,"Zoloto",2.5);
        Coin coin2 = new Coin(5,1999,"Zoloto",2.5);
        Coin coin3 = new Coin(10,2003,"Zoloto",2.5);
        Coin coin4 = new Coin(2,1995,"Zoloto",2.3);
        Coin coin5 = new Coin(1,1991,"Serebro",2.0);

        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin4);
        coins.add(coin3);
        coins.add(coin5);

        System.out.println("------ Сортировка по номиналу --------");
        for (Coin c : coins){
            System.out.println(c);
        }
        System.out.println("------ Сортировка по году --------");
        TreeSet<Coin> sortingByYear = new TreeSet<>(new SortByYearComparator());
        sortingByYear.addAll(coins);

        for(Coin c: sortingByYear){
            System.out.println(c);
        }
        System.out.println("----------- Сортировка в обратном порядке ---------");
        TreeSet<Coin> reverse = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) { // сортировка наоборот
                if(o1.getYear() != o2.getYear()){
                    return o2.getYear() - o1.getYear(); // 1800-1900  = -100// получили либо минус, либо плюс
                }
                if(o1.getMetall().equals(o2.getMetall())){
                    return o2.getMetall().compareTo(o1.getMetall());

                }
                if(o1.getNominal() != o2.getNominal()){
                    return o2.getNominal() - o1.getNominal(); // 5 - 10 = -5 // возвращаем либо минус, либо плюс
                }

                return Double.compare(o2.getDiametr(), o1.getDiametr());
            }
        });

        reverse.addAll(coins);
        for (Coin c: reverse){
            System.out.println(c);
        }
    }
}
