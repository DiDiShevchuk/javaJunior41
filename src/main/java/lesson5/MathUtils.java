package lesson5;

public class MathUtils {
    /** Создание метода:
     * 1- модификатор доступа (слово определящее область видимости)
     * public -доступен внутри всего проекта
     * protected - доступен только внутри текущей папки, и наследникам текущего класса
     * --------- - доступен только внутри текущей папки
     * private - доступ только в этом классе
     *
     * Где можно ставить модификатор доступа:
     * - перед классом
     * - перед методом(там где создаю метод)
     *
     * - static (пишем или не пишем)
     * - указываем возвращаемый тип (или слово void, если оно отсутсвует)
     */
    // создать метод, который посчитает площадь треугольника по 3м сторонам
    // и выведет её на консоль

    public static void squareTriangle(int a, int b, int c){
        double p = (a + b + c) / 2.0;
        System.out.println(Math.sqrt((p * (p -a) * (p - b) * (p - c))));

    }
    // метод возвращает результат вычисления периметра треугольника
    public static int perimetrTriangle(int a, int b, int c){

        return a + b + c;
    }

    // метод считает площадь квадрата
   public static int sguareArea(int a){
        return a * a;
   }
    // метод считает периметр квадрата
    public static int perimetrSquare(int a){
        return a * 4;
    }


    // метод считает площадь овала
    public static int ovalArea(int a, int b){
        return (int) (Math.PI * a * b);
    }
    // метод считает периметр овала
    public static int perimetrOval(int a, int b){
        return (int) ((Math.sqrt((a * a) + (b * b)/ 2)) * (Math.PI * 2));
    }

    // метод считает площадь круга
    public static int areaOfTheCircle(int r){
        return (int) (Math.PI * (r * r));
    }
    // метод считает окружность(периметр) круга
public static int circleСircumference(int r){
    return (int) (Math.PI * r * 2);
}
    // метод считает площадь трапеции
    public static double trapezoidArea(double a, double b, double h){
        return (0.5 * (a + b) * h);
    }
    // метод считает периметр трапеции
    public static double perimetrTrapezoid(double a, double b, double c, double d){
        return a + b + c + d;
    }



}
