package lesson17;

import java.util.*;


public class Xolodilnik {
    private HashMap<String, Integer> products = new HashMap<>(); // наша коллекция, массив по ассоциациям

Integer valueForComparator;

    public Integer getValueForComparator() {
        return valueForComparator;
    }

    public void valueForComparatorMethod(){
    for(Integer val : products.values()){
        valueForComparator = products.get(val);
    }
}
        public void addProduct(String nameOfProduct, int value) {
        nameOfProduct = nameOfProduct.toLowerCase(Locale.ROOT);
        if (products.containsKey(nameOfProduct)) { // если продукт в холодильнике
            int currentValue = products.get(nameOfProduct); // сохранился вес продукта
            products.put(nameOfProduct, value + currentValue);
        } else { // если такого продукта не было в холодильнике
            products.put(nameOfProduct, value);

        }
    }

    public void printAllProducts() {
        // проход по Map
        for (Map.Entry<String, Integer> pr : products.entrySet()) {
            System.out.println(pr.getKey() + " - " + pr.getValue());
        }
    }

    public void printAllProducts2() {
        //2й способ по Map
        for (String productName : products.keySet()) {
            System.out.println(productName + " - " + products.get(productName));
        }
    }



    public void getProduct(String nameOfProduct, int value) {

        if (products.containsKey(nameOfProduct)) {
            int current = products.get(nameOfProduct);
            if (current > value) {
                products.put(nameOfProduct, current - value);
            } else {
                System.out.println(nameOfProduct + " в холодильнике не достаточно");
                products.remove(nameOfProduct);
            }

        } else {
            System.out.println("данного продукта в холодильнике нет");
        }
    }



    public void printWeightProducts() {
        int sum = 0;
        for (String productName : products.keySet()) {
            sum += products.get(productName);
        }
        System.out.println("общий вес продуктов = " + sum);
    }

    public void printProductWillFirstEnd() {
        TreeMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.putAll(products);
        TreeMap<Xolodilnik,Xolodilnik> s = new TreeMap<>(new SortByValueComparator());


        System.out.println(s.lastEntry() + " -  закончится самым первым");
        System.out.println(s.values() + "  значение");
    }

    public void printProductSortName() {
        TreeMap<String, Integer> sortedMap = new TreeMap<>();

        sortedMap.putAll(products);
        System.out.println(sortedMap.entrySet() + " : отсортировано по названию");
    }
/*

    public void printProductSortOfTheWeight() {
        sortedMap.putAll(products);

    }

 */
}



    // 1 - взять продукт с холодильника
    // содержит название и ключ
    // 2 - вывести на терминал какой продукт закончится самым первым
    // 3 - вывести вес всех продуктов в холодильнике
    // 4 - *** вывести продукты и вес в отсортированном формате по Названию
    // 5 - *** вывести продукты и вес в отсортированном формате по Весу (от большего к меньшему)


