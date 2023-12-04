package lesson12.animals;

public class Main {
    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();
        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();
        Elephant elephant = new Elephant();

        Animal[] animals = new Animal[5];
        animals[0] = monkey1;
        animals[1] = tiger1;
        animals[2] = monkey2;
        animals[3] = tiger2;
        animals[4] = elephant;


        for(Animal a: animals){
            a.voice();  // проявление полиморфизма !!!!!!
        }

    }
}
