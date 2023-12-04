package lesson8;

import java.util.Arrays;

public class TravelAgency {
       public Tour[] arrayOfTours = new Tour[50];

        // добавляет один тур в массив туров
void addTour(Tour tour){
   for(int i = 0; i < arrayOfTours.length; i++){
           if(arrayOfTours[i] == null){
               arrayOfTours[i] = tour;
               break;
           }
   }

}
public void displayTours(){
    for (int i = 0; i < arrayOfTours.length; i++){
        if(arrayOfTours[i] != null){
            arrayOfTours[i].tourInformation();
        } else break;
    }
}

public void displayLowPriceTour() {

        int lowPriceIndex = 0;
        for(int i = 0; i < arrayOfTours.length; i++){
            if(arrayOfTours[i] == null){
                break;
            }
            if(arrayOfTours[i].getPrice() < arrayOfTours[lowPriceIndex].getPrice()){
                lowPriceIndex = i;

            }
        }
    System.out.println();
    System.out.println("Cамая низкая цена тура: ");
        arrayOfTours[lowPriceIndex].tourInformation();

}
}
