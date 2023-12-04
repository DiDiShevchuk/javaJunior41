package Lesson10.HomeWork2;

//создали подкласс журналы с добавлением в нем индивидуальных переменных
public class Journal extends Product {
     private int volumeOfTheJournal;

     public Journal(String name, int yearOfPublication, String publisher, int volumeOfTheJournal) {
          super(name, yearOfPublication, publisher);
          this.volumeOfTheJournal = volumeOfTheJournal;
     }

     public void displayProduct() {
          System.out.printf("Название %s, год %s, издатель %s, номер %s \n", getName(), getYearOfPublication(), getPublisher(),volumeOfTheJournal);
     }

     public int getVolumeOfTheJournal() {
          return volumeOfTheJournal;
     }

     public void setVolumeOfTheJournal(int volumeOfTheJournal) {
          this.volumeOfTheJournal = volumeOfTheJournal;
     }
}
