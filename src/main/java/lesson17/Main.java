package lesson17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>();
        texts.add("fdf");
        texts.add("sdf");
        texts.add("555");
        texts.add("eee");
        texts.add("hhh");

        Collections.sort(texts, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(texts);
    }
}
