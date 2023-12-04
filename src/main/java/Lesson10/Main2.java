package Lesson10;


import lesson12.PrintEdition;

import static Lesson10.PrintedPublications.printBiggestEdition;

public class Main2 {
    public static void main(String[] args) {
        PrintedPublications[] printedPublications = new PrintedPublications[4];

        Book book1 = new Book("Мастер и Маргарита", "2011", "наследники Булгакова М", "Булгаков М.А.", 4);
        Book book2 = new Book("Триумфальная арка", "2017", "Издательство АСТ", "Ремарк Э.Р.", 10);
        Journal journal1 = new Journal("Reader’s Digest", "ежегодно", "Издательство Reader’s Digest", 80, 5);
        Journal journal2 = new Journal("National Geographic", "ежегодно", "Издательство Ясно Паблишинг", 7200, 10);



        printedPublications[0] = book1;
        printedPublications[1] = book2;
        printedPublications[2] = journal1;
        printedPublications[3] = journal2;
        for (PrintedPublications p : printedPublications) {
            System.out.println(p); // мы вызываем один и тот же метод toString
        }


       printBiggestEdition(printedPublications);



        // метод, который должен был искать самую толстую книгу по количеству страниц, но он не видит его,
        // так класс PrintedPublications не видит поля класса Book



    }
}
