package lesson8;

public class Tour {
    // создали поля класса
    private String country;
    private int numberOfDays;
    private String transport;
    private int price;


    // создали конструкторы
    public Tour() {

    }

    public Tour(String country, int numberOfDays) {
        this.country = country;
        this.numberOfDays = numberOfDays;
    }

    public Tour(String country, String transport, int numberOfDays, int price) {
        this.country = country;
        this.transport = transport;
        this.numberOfDays = numberOfDays;
        this.price = price;

    }

    // создали get и set методы для переменных класса
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // метод для вывода инф-ции о туре
    void tourInformation() {
        System.out.println("Информация о туре:\n" + "страна отдыха - " + country + "\nвид транспорта - "
                + transport + "\nколичество дней - " + numberOfDays + "\nполная стоимость составит - " + price + " рублей");
    }
}
