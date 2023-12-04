package lesson8;

public class Main3 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Circle circle = new Circle();
        Oval oval = new Oval();


        System.out.println("Площадь треугольника равна: " + triangle.perimetrTriangle(5,8,9));
        System.out.println("Периметр треугольника равен: " + triangle.perimetrTriangle(75,82,65));
        System.out.println("------------------------------------");
        System.out.println("Площадь прямоугольника равен: " + rectangle.rectangleArea(2,6));
        System.out.println("Периметр прямоугольника равен: " + rectangle.perimetrRectangle(2,6));
        System.out.println("------------------------------------");
        System.out.println("Площадь квадрата равен: " + square.sguareArea(9));
        System.out.println("Периметр квадрата равен: " + square.perimetrSquare(9));
        System.out.println("------------------------------------");
        System.out.println("Площадь круга равна: " + circle.areaOfTheCircle(10));
        System.out.println("Периметр круга равен: " + circle.circleСircumference(10));
        System.out.println("------------------------------------");
        System.out.println("Площадь овала равна: " + oval.ovalArea(5, 6));
        System.out.println("Периметр овала равен: " + oval.perimetrOval(5,6));



    }
}
