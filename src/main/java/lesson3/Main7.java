package lesson3;

public class Main7 {
    public static void main(String[] args) {
        // вывести на консоль массив с обратной стороны
        int[] numbers = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};
        for(int i = numbers.length - 1; i >=0; i--){
            System.out.println(numbers[i]);
        }
    }
}
