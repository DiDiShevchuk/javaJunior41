package lesson2;

public class Main9 {
    public static void main(String[] args) {
        // кол-во чётных чисел в диапазоне от 30 до 61

        int count = 0;
        for(int i = 30; i <= 61; i += 2){
            count++;
        }
        System.out.println(count);
    }
}
