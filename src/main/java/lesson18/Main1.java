package lesson18;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person();
        StringUtilImpl stringUtil = new StringUtilImpl();
        try {
            person.setAge(-20); // программная генерация исключения
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hello!");

        try {
            System.out.println(stringUtil.div("10", "2"));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        System.out.println("*********************************");
        try {
            System.out.println(stringUtil.findWord("привет мир небо мир", "мир"));
        } catch (NullPointerException e) {
            System.out.println("ошибка");
        }
        System.out.println("*********************************");
        try {
            System.out.println(stringUtil.findNumbers("исхwe3одный т-235екст"));
        } catch (CustomException e) {
            System.out.println("Not fou234.9nd");
        }
    }
}
