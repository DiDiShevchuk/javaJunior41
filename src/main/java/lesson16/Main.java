package lesson16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>  a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);


        LinkedList<Integer> linked = new LinkedList<>();
        linked.add(4);
        linked.add(5);
        linked.add(6);
        linked.add(7);

        CollectionUtils utils = new CollectionUtilsImpl();
        Collection<Integer> unionResult = utils.union(a, linked);
        System.out.println("Объединение двух коллекций с дубликатами " + unionResult);

        Collection<Integer> intersectionResult = utils.intersection(a, linked);
        System.out.println("Пересечение двух коллекций с дубликатами " + intersectionResult);

        Collection<Integer> unionWithoutDuplicateResult = utils.unionWithoutDuplicate(a, linked);
        System.out.println("Объединение двух коллекций без дубликатов " + unionWithoutDuplicateResult);


        Collection<Integer> intersectionWithoutDuplicate = utils.intersectionWithoutDuplicate(a,linked);
        System.out.println("Пересечение двух коллекций без дубликатов " + intersectionWithoutDuplicate);

        Collection<Integer> differenceResult = utils.difference(a,linked);
        System.out.println("Разность двух коллекций " + differenceResult);

    }
}
