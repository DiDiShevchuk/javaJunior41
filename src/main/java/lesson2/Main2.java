package lesson2;

public class Main2 {
    public static void main(String[] args) {
        // есть 3 стороны треугольника, и нужно вывести: разносторонний, равносторонний или равнобедренный

        // управляющая конструкция if else

        int a = 5;
        int b = 5;
        int c = 5;

        if (a == b && b == c && a == c) {
            System.out.println("Это равносторонний треугольник");
        } else if (a != a && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");
        }
    }
}
