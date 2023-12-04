package lesson13;

public class HenFactory {

    public static Hen getHen(String country) {
        Hen hen = null;
        if (country.equalsIgnoreCase("Молдавия")) {
            return hen = new MoldovanHen();
        }
        if (country.equalsIgnoreCase("Россия")) {
            return hen = new RussianHen();
        }
        if (country.equalsIgnoreCase("Украина")) {
            return hen = new UkrainianHen();
        }
        if (country.equalsIgnoreCase("Беларусь")) {
            return hen = new BelarusianHen();
        } else
            return null;
    }

    public String getDescription() {
        return null;
    }

}
