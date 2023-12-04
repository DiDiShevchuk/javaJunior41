package lesson5;

import java.util.Scanner;

public class Main2 {
    /**
     * Программа будет просить ввести с консоли фигуру
     * (треугольник, квадрат, овал, круг, трапеция)
     * потом мы пользователя просим вввести нужные данные о фигуре (сторона, высота и т.д.)
     * И на основании введенных данных печатаем на консоль площадь и периметр
     */
    public static void main(String[] args) {
        System.out.println("Выберите фигуру: ");
        System.out.println("1 - треугольник ");
        System.out.println("2 - квадрат ");
        System.out.println("3 - овал");
        System.out.println("4 - круг");
        System.out.println("5 - трапеция");

        Scanner scanner = new Scanner(System.in);
        String inputFigura = scanner.next(); // число или слово

        if (inputFigura.equals("1") || inputFigura.equalsIgnoreCase("треугольник")) {
            System.out.println("Введите сторону a: ");
            int a = scanner.nextInt();
            System.out.println("Введите сторону b: ");
            int b = scanner.nextInt();
            System.out.println("Введите сторону c: ");
            int c = scanner.nextInt();

            System.out.println("Площадь треугольника: ");
            MathUtils.squareTriangle(a, b, c);
            System.out.println("Периметр треугольника: " + MathUtils.perimetrTriangle(a, b, c));
        }
        if (inputFigura.equals("2") || inputFigura.equalsIgnoreCase("квадрат")) {
            System.out.println("Введите сторону a: ");
            int a = scanner.nextInt();

            System.out.println("Площадь квадрата: " + MathUtils.sguareArea(a));
            System.out.println("Периметр квадрата: " + MathUtils.perimetrSquare(a));
        }
        if (inputFigura.equals("3") || inputFigura.equalsIgnoreCase("овал")) {
            System.out.println("Введите длину большей полуоси a: ");
            int a = scanner.nextInt();
            System.out.println("Введите длину меньшей полуоси b: ");
            int b = scanner.nextInt();

            System.out.println("Площадь овала: " + MathUtils.ovalArea(a, b));
            System.out.println("Периметр овала: " + MathUtils.perimetrOval(a, b));
        }
        if (inputFigura.equals("4") || inputFigura.equalsIgnoreCase("круг")) {
            System.out.println("Введите радиус r: ");
            int r = scanner.nextInt();

            System.out.println("Площадь круга: " + MathUtils.areaOfTheCircle(r));
            System.out.println("Длина окружности круга: " + MathUtils.circleСircumference(r));
        }
        if (inputFigura.equals("5") || inputFigura.equalsIgnoreCase("трапеция")) {
            System.out.println("Введите сторону a: ");
            double a = scanner.nextInt();
            System.out.println("Введите сторону b: ");
            double b = scanner.nextInt();
            System.out.println("Введите сторону c: ");
            double c = scanner.nextInt();
            System.out.println("Введите сторону d: ");
            double d = scanner.nextInt();
            System.out.println("Введите высоту h: ");
            double h = scanner.nextInt();

            System.out.println("Площадь трапеции: " + MathUtils.trapezoidArea(a, b, h));
            System.out.println("Периметр трапеции: " + MathUtils.perimetrTrapezoid(a, b, c, d));

        }
    }
}
