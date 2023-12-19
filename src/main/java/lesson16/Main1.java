package lesson16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("9");
        set.add("6");
        set.add("8");
        set.add("7");
        set.add("7");
         // проход по коллекции (for each)

        for(String s : set){
            System.out.println(s);

        }
        System.out.println("----------");
        // с помощью итератора
        for (Iterator<String>  iterator = set.iterator(); iterator.hasNext(); ){
            System.out.println(iterator.next());
        }

    }
}
