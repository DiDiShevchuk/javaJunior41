package lesson13;

public abstract class Hen extends HenFactory{


    public abstract int getCountOfEggsPerMonth();

    public String getDescription() {
        return "Я курица. ";
    }
}
