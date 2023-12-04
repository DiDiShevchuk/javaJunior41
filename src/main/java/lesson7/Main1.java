package lesson7;

public class Main1 {
    public static void main(String[] args) {
        Phone apple = new Phone();
        Phone samsung = new Phone();
        Phone xiaomi = new Phone();


        apple.setModel("XR");
        apple.setNumber("8919-546-38-15");
        apple.setWeight(138);

        samsung.setModel("Galaxy A54");
        samsung.setNumber("8905-358-11-58");
        samsung.setWeight(179);

        xiaomi.setModel("Redmi 10C");
        xiaomi.setNumber("8927-364-78-25");
        xiaomi.setWeight(127);

        apple.receiveCall("Аркадий");
        samsung.receiveCall("Василий");
        xiaomi.receiveCall("Антип");
        System.out.println("отработал метод receiveCall \n");

        System.out.println(apple.getNumber());
        System.out.println(samsung.getNumber());
        System.out.println(xiaomi.getNumber());
        System.out.println("отработал метод getNumber \n");

        System.out.println("выводим на консоль значение:" + "модель телефона "+ apple.getModel() + " номер "+ apple.getNumber() + " вес " + apple.getWeight());
        System.out.println("выводим на консоль значение:" + "модель телефона "+ samsung.getModel() + " номер "+ samsung.getNumber() + " вес " + samsung.getWeight());
        System.out.println("выводим на консоль значение:" + "модель телефона "+ xiaomi.getModel() + " номер "+ xiaomi.getNumber() + " вес " + xiaomi.getWeight());


    }
}
