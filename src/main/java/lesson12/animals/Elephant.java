package lesson12.animals;

public class Elephant extends Animal{
    @Override
    public void voice() { // имплементирует метод от абстрактного класса-
        System.out.println("Я слон - фууууу");// вам от Animal пришел метод voice, который обязательно нужно реализовать

    }
}
