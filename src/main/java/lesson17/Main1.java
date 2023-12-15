package lesson17;

public class Main1 {
    public static void main(String[] args) {

        Xolodilnik xolodilnik = new Xolodilnik();
        xolodilnik.addProduct("Яблоко", 200);
        xolodilnik.addProduct("Груша", 100);
        xolodilnik.addProduct("Яблоко", 200);
        xolodilnik.addProduct("Слива", 500);
        xolodilnik.addProduct("Виноград", 2000);
        xolodilnik.addProduct("Груша", 39);

        xolodilnik.printAllProducts();
        System.out.println("-------------");
        xolodilnik.printAllProducts2();
        System.out.println("-------------");

        xolodilnik.printProductWillFirstEnd();
        xolodilnik.printWeightProducts();
        xolodilnik.printProductSortName();
        System.out.println("-------------");


        xolodilnik.printAllProducts();
        System.out.println("столько сейчас продуктов");
        xolodilnik.getProduct("яблоко", 1000);
        System.out.println();
        xolodilnik.printAllProducts();
        System.out.println("столько сейчас продуктов");
        xolodilnik.getProduct("слива", 20000);
        xolodilnik.printAllProducts();

        xolodilnik.valueForComparatorMethod();
    }
}
