package lesson3;

public class Main10 {
    public static void main(String[] args) {
        // напечатать на консоль каждое слово в обратном порядке
        String text = "Я буду учиться лучше";
        char[] simbols = text.toCharArray();
        for (int i = simbols.length - 1; i >= 0; i--) {
            if (Character.isSpaceChar(text.charAt(i))) {
                System.out.println();
            }
            System.out.print(simbols[i]);
        }
    }
}