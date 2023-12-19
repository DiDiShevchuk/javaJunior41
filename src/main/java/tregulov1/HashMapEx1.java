package tregulov1;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String > map1 = new HashMap<>();
        map1.put(1000,"Zaur Tregulov");
        map1.put(21561,"Oleg Mituev");
        map1.put(26671,"Diana Filatova");
        map1.put(6598,"Oxana Diduva");
        map1.putIfAbsent(1000 ,"Oleg Ifrov"); // метод "Добавь, если такого ещё нет"

        System.out.println(map1);
        //System.out.println(map1.get(2));
        map1.remove(21561);
      //  System.out.println(map1);
      //  System.out.println(map1.containsValue("Oleg Mituev")); // проверяет есть ли такое значение в коллекции
       // System.out.println(map1.containsKey(6598)); // проверяет есть ли такой ключ
      //  System.out.println(map1.keySet()); // множество ключей
        System.out.println(map1.values()); // множество значений


        Map<String, String> map2 = new HashMap<>();
        map2.put("Sasha", "dobrui");
        map2.put("Vasy", "ymnui");
        System.out.println(map2);

        }
}
