package lesson12.part1;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("Колобков", "Олег", 2203, 4.4);
        Student student2 = new Student("Шляпкина", "Шапокляк", 4508, 3.2);
        Aspirant aspirant1 = new Aspirant("Сусликов", "Константин", 5482, 5, "Методы сжатия цифрового сигнала без потери информации для телевизионных систем воздушной тактической разведки");
        Aspirant aspirant2 = new Aspirant("Рогов", "Антип", 4503, 4.0, "Применение технологий искусственного интеллекта в системе корпоративного управления");

        Student[] students = new Student[10];

        students[0] = student1;
        students[1] = student2;
        students[2] = aspirant1;
        students[3] = aspirant2;


        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) { // сделала проверку, так как не все ячейки заполнены, чтобы не кидал ошибку
                students[i].getScholarship();
            }
        }

    }
}
