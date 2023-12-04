package lesson8;

public class Oval {
    private int largeA;
    private int smallB;
// конструкторы
    public Oval(){

    }
    public Oval(int largeA, int smallB){
        this.largeA = largeA;
        this.smallB = smallB;
    }

        // get и set

    public int getLargeA() {

        return largeA;
    }

    public void setLargeA(int largeA) {

        this.largeA = largeA;
    }

    public int getSmallB() {

        return smallB;
    }

    public void setSmallB(int smallB) {

        this.smallB = smallB;
    }

    // метод возвращает площадь овала
    public double ovalArea(int largeA, int smallB){
        return (Math.PI * largeA * smallB);
    }
    // метод возвращает периметр овала
    public double perimetrOval(int largeA, int smallB){
        return ((Math.sqrt((largeA * largeA) + (smallB * smallB)/ 2)) * (Math.PI * 2));
    }
}
