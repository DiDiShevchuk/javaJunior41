package lesson3;

public class Main4 {
    public static void main(String[] args) {
        // Есть массив чисел, напечатать на консоль
        // соседа справа, если ячейка кратная 3м

        int[] numbers = {45, 45, 54, 1, 5, 8, 6, 2, 7, 3};

        for (int i = 0; i < numbers.length; i++) {
            if(i != numbers.length - 1) { // когда есть сосед справа
                if( numbers[i] % 3 == 0){ // проверка на кратность 3м
                    System.out.println(numbers[i +1]);
                }
            }
        }
    }
}
