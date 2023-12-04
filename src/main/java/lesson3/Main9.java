package lesson3;

public class Main9 {
    public static void main(String[] args) {
        // напечатать на консоль каждое слово в отдельной строке
        String text = "Я буду учиться лучше";

        char[] simbols = text.toCharArray();
        for (int i = 0; i < simbols.length; i++) {
            if (Character.isSpaceChar(text.charAt(i))) {
                System.out.println();

            }
            System.out.print(simbols[i]);

        }
    }
}
