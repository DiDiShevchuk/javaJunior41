package lesson8;

public class Circle {
    private int circleRadius;

    // конструкторы
    public Circle(){

    }
    public Circle(int circleRadius){
        this.circleRadius = circleRadius;
    }
    // get и set
    public int getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(int circleRadius) {
        this.circleRadius = circleRadius;
    }
    // метод считает площадь круга
    public double areaOfTheCircle(int circleRadius){

        return (Math.PI * (circleRadius * circleRadius));
    }
    // метод считает окружность(периметр) круга
    public double circleСircumference(int circleRadius){

        return (Math.PI * circleRadius * 2);
    }
}
