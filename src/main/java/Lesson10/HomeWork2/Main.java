package Lesson10.HomeWork2;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book product0 = new Book("Капитанская дочка", 1970, "СССР", "А.С. Пушкин", 235);
        Book product1 = new Book("Капитанская дочка", 2010, "Просвещение", "А.С. Пушкин", 265);
        Book product2 = new Book("Руслан и Людмила", 1985, "СССР", "А.С. Пушкин", 215);
        Book product3 = new Book("Руслан и Людмила", 2015, "Просвещение", "А.С. Пушкин", 225);
        Book product4 = new Book("Война и Мир", 1970, "СССР", "Л.Н. Толстой", 1235);
        Book product5 = new Book("Анна Каренина", 2010, "Литрес", "Л.Н. Толстой", 365);
        Book product6 = new Book("Герой нашего времени", 2005, "Просвещение", "М.Ю. Лермонтов", 415);
        Book product7 = new Book("Мцыри", 2015, "Литрес", "М.Ю. Лермонтов", 225);
        Journal product8 = new Journal("За рулем", 2010, "За рулем", 1);
        Journal product9 = new Journal("За рулем", 2010, "За рулем", 2);
        Journal product10 = new Journal("За рулем", 2010, "За рулем", 3);
        Journal product11 = new Journal("GQ", 2015, "GQ", 5);
        Journal product12 = new Journal("GQ", 2015, "GQ", 6);
        Journal product13 = new Journal("GQ", 2015, "GQ", 7);

        library.addProduct(product0);
        library.addProduct(product1);
        library.addProduct(product2);
        library.addProduct(product3);
        library.addProduct(product4);
        library.addProduct(product5);
        library.addProduct(product6);
        library.addProduct(product7);
        library.addProduct(product8);
        library.addProduct(product9);
        library.addProduct(product10);
        library.addProduct(product11);
        library.addProduct(product12);
        library.addProduct(product13);


        library.displayLibrary();
        library.displayOldProduct();

    }
}
