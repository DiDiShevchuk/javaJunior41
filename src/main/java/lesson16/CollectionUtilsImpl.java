package lesson16;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionUtilsImpl implements CollectionUtils {

    //  Объединение двух коллекций с дубликатами

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    // Пересечение двух коллекций с дубликатами
    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer numFromA : a) {
            if (b.contains(numFromA)) {
                result.add(numFromA);
            }
        }
        for (Integer numFromB : b) {
            if (a.contains((numFromB))) {
                result.add(numFromB);
            }
        }
        return result;
    }

    // Объединение двух коллекций без дубликатов // значит ArrayList или LinkedList. Не Set
    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new HashSet<>();

        for (Integer numForA : a) {
            result.add(numForA);
        }
        for (Integer numForB : b) {
            if (!a.contains(numForB)) {
                result.add(numForB);
            }
        }
        return result;
    }

    // Пересечение двух коллекций без дубликатов
    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result = new HashSet<>();

        for (Integer numForA : a) {
            if (b.contains(numForA)) {
                result.add(numForA);
            }
        }
        for (Integer numForB : b) {
            if (a.contains(numForB)) {
                return result;
            }
        }

        return result;
    }

    // Разность двух коллекций
    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer numForA : a) {
            if (!b.contains(numForA)) {
                result.add(numForA);
            }

        }
        for (Integer numForB : b) {
            if (!a.contains(numForB)) {
                result.add(numForB);
            }
        }

        return result;
    }
}
