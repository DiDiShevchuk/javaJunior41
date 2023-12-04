package lesson7;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Рыжиков Олег Викторович", 38);
        person1.setFullNane("Ложкина Оксана Дмитриевна");
        person1.move();
        person1.talk();
        person2.move();
        person2.talk();

    }
}
