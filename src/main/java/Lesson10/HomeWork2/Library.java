package Lesson10.HomeWork2;

//создали класс библиотеку содержащую массив продуктов
public class Library {
    public Product[] products = new Product[15];

    //заполняем библиотеку продуктами
    public void addProduct(Product product) {
        for (int i = 0; i < 15; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
        }
    }

    //вывод библиотки на консоль
    public void displayLibrary() {
        for (int i = 0; i < 15; i++) {
            if (products[i] != null) {
                products[i].displayProduct();
            } else break;
        }
    }


    //нет доступа к данным кол-ва страниц продуктов (Они только у подкласса Книга),
    //есть к годам, сделаю поиск самого старого издания
    public void displayOldProduct() {
        int oldProductIndex = 0;
        for (int i = 0; i < 15; i++) {
            if (products[i] == null) {
                break;
            }
            if (products[i].getYearOfPublication() < products[oldProductIndex].getYearOfPublication()) {
                oldProductIndex = i;
            }
        }
        System.out.println();
        System.out.println("Самое старое издание: ");
        products[oldProductIndex].displayProduct();
    }

    public Product[] getProducts() {
        return products;
    }
}

