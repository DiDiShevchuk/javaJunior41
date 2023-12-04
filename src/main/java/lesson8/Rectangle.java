package lesson8;

class Rectangle {
    private int a;
    private int b;

    // конструкторы

    public Rectangle() {

    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }


    // get и set
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getBb() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    // метод возвращает результат вычисления площадь прямоугольника

    public int rectangleArea(int a, int b) {

        return a * b;
    }

    // метод возвращает результат вычисления периметр прямоугольника
    public int perimetrRectangle(int a, int b) {
        return 2 / (a + b);
    }
}
