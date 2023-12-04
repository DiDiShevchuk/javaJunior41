package lesson3;

import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        // вывести в консоль массив через ячейку
        int[] numbers = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};
        for (int i = 0; i < numbers.length; i++) {
            if(i % 2 == 0){
                System.out.println(numbers[i]);

            }
        }
    }
}
