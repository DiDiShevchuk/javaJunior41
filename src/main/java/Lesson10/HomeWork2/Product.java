package Lesson10.HomeWork2;

//создали супер клас продукт с общими переменными для всех подклассов
public class Product {
    private String name;
    private int yearOfPublication;
    private String publisher;


    public Product(String name, int yearOfPublication, String publisher) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.publisher = publisher;
    }

    //недостаточно знаний что бы вывести все данные продукта в зависимости от его подкласса
    public void displayProduct() {
        System.out.printf("Название %s, год %s, издатель %s \n", name, yearOfPublication, publisher);
    }


    public String getName() {
        return name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}


