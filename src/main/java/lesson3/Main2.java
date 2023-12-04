package lesson3;

public class Main2 {
    public static void main(String[] args) {
        // есть массив чисел, нужно напечатать на консоль только четные числа в обратном порядке

        int[] numbers = {3, 5, 8, 9, 8, 1, 6, 8, 1, 8, 0, 10, 65};
        for(int i = numbers.length - 1; i >= 0; i--){
            if(numbers[i] % 2 == 0) { // проверяем именно остаток в самой ячейке число на чётность
                System.out.println(i);
            }
        }
    }
}
