package lesson12;

public class Main {
    public static void main(String[] args) {
        PrintEdition[] editions = new PrintEdition[7];
        editions[0] = new Book("Война и мир", 1950, 450, "АСТ", "Толстой Л.Н.");
        editions[1] = new Book("Грозовой перевал", 1972, 45, "АСТ", "Ремарк");
        editions[2] = new Book("Кукушка", 1742, 220, "АСТ", "есенин");
        editions[3] = new Book("Мастер и маргарита", 1670, 450, "АСТ", "Булгаков");
        editions[4] = new Jurnal("National Geografic", 2023, 45, "Колобок", 4);
        editions[5] = new Jurnal("Базар", 2004, 12, "Мося", 11);
        editions[6] = new Jurnal("Собака", 1998, 20, "Изба", 8);
        for (PrintEdition currentedition : editions) {
            System.out.println(currentedition); // мы вызываем один и тот же метод toString
        }

        // printBiggestEdition(editions); // ошибка не может найти метод с аргументами нужного типа


        /**
         * Полиморфизм - это св-во java, работать с РАЗНЫМИ типами данных
         * как с ОДИНАКОВЫМ типом(в коде). Но то же самое время в момент выполнения программы
         * программа будет роботать как с РАЗНЫМИ типами(хотя работает с разными типами).
         * Пример, есть общий класс печатное изд, в кот. есть метод toString внутри которого бла-бла, от этого есть
         */

/*
        public static void printBiggestEdition(PrintEdition[] editions){
            int maxNumber = 0;

            for (int i = 0; i < editions.length - 1; i++) {
                if (editions[i] == null) {
                    break;
                }
                if (editions[i].getPages() < editions[maxNumber].getPages()) {
                    maxNumber = i;
                }
            }
            System.out.println();
            System.out.println("Самое толстое издание: ");
            editions[maxNumber].toString();
        }


    }

 */
    }
}
