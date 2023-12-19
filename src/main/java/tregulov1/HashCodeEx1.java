package tregulov1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Diana", "Senotova", 3);
        Student st3 = new Student("Zaur", "Tregulov", 3);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);
        System.out.println(map);

        Student st4 = new Student("Diana", "Senotova", 3);
        Student st5 = new Student("Petya", "Vorobev", 4);
        //boolean result = map.containsKey(st4);
       // System.out.println("result =" + result);
        System.out.println(st4.hashCode());
        System.out.println(st2.hashCode());

        for(Map.Entry<Student, Double> entry: map.entrySet()){
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
    }

}
class Student{
    String name;
    String surname;
    int course;
    public Student(String name,String surname, int course ){
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        if (!Objects.equals(name, student.name)) return false;
        return Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + course;
        return result;
    }

 /*
@Override
public int hashCode() {
    return name.length() * 7 + surname.length() * 11 + course *53;
}

  */

}