package lesson15.ColUtils;

import java.util.ArrayList;

import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 22, 5, 8, 7, 66, 105, 1035);
        System.out.println(list);
        // метод binarySearch, перед поиском нужного элемента, нужно отсортировать коллекцию
        Collections.sort(list);
        int index = Collections.binarySearch(list, 105);
        System.out.println("Искомый элемент 105 находится под индексом: " + index);
        int maxValue = Collections.max(list);
        System.out.println("Максимальное значение элемента в коллекции list: " + maxValue);
        System.out.println("-------------------------");

        ArrayList<String> text = new ArrayList<>();
        Collections.addAll(text, "Здравствуйте","Спасибо", "До свидания", "Будьте так любезны", "Конь в пальто");
        System.out.println("Заполнили коллекцию элементами: "+ text);
        Collections.replaceAll(text, "Конь в пальто","Пожалуйста");
        System.out.println("Теперь тут внесена замена (коня нет): " + text);
        Collections.reverse(text);
        System.out.println("Обратный порядок: " + text);


    }
}
