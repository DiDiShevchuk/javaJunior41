package lesson8;

public class Triangle {
    private int a;
    private int b;
    private int c;

    // конструктор

    public Triangle(){

    }
    public Triangle( int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }



    // get и set

    public int getA() {

        return a;
    }

    public void setA(int a) {

        this.a = a;
    }

    public int getB(){
        return b;
    }
    public void setB( int b){

        this.b = b;
    }
    public int getC(){
        return c;
    }
    public void setC(int c){
        this.c = c;
    }
    // метод возвращает результат вычисления площади треугольника
    public double squareTriangle(int a, int b, int c){
        double p = (a + b + c) / 2.0;
        return  Math.ceil(Math.sqrt((p * (p -a) * (p - b) * (p - c))));


    }
    // метод возвращает результат вычисления периметра треугольника
    public int perimetrTriangle(int a, int b, int c) {

        return a + b + c;
    }
}
