package lesson8;

public class Main {
    public static void main(String[] args) {
        Tour tour = new Tour("Италия", "самолёт", 8, 350_000);
        Tour tour1 = new Tour("Грузия", "самолёт", 7, 155_000);
        Tour tour2 = new Tour("ОАЭ", "самолёт", 5, 350_000);
        Tour tour3 = new Tour("Турция", "самолёт", 6, 266_000);
        tour.tourInformation();
        TravelAgency travelAgency = new TravelAgency(); // массив по заданному методу , т.е. количестиво
        travelAgency.addTour(tour);
        travelAgency.displayTours();
        travelAgency.displayLowPriceTour();


    }
}
