package lesson8;

public class Square {
    private int a;

    // конструкторы
    public Square(){

    }
    public Square(int a){
        this.a = a;
    }


    // get и set
    public int getA(){

        return a;
    }
    public void setA(int a){

        this.a = a;
    }

    //  метод возвращает площадь квадрата
    public int sguareArea(int a){

        return a * a;
    }
    // метод возвращает периметр квадрата
    public int perimetrSquare(int a){

        return a * 4;
    }
}
