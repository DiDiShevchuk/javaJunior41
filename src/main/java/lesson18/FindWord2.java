package lesson18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWord2 {
    public static void main(String[] args) {
        List<Double> arrayNumbers = new ArrayList<>();
        String text = "исхwe3одный т-235екст";
        Pattern pattern = Pattern.compile("([+]|-)?(([0-9]+[.]?[0-9]*)|([0-9]*[.]?[0-9]+))");  // ([+]|-)?(([0-9]+[.]?[0-9]*)|([0-9]*[.]?[0-9]+))   // \d+([+-]?)+\d+(?:\.\d+)?

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            arrayNumbers.add(Double.valueOf(matcher.group()));
        }
        System.out.println(arrayNumbers);


}


/*
        String text = "cчастье Привет. хорошо, супер! класс успех счастье! счастье";
        String word = "счастье";

        String[] stringText = text.split("\\s*(\\s|,|!|\\.)\\s*");
        for (String w : stringText){
            System.out.println(w);
        }

*/




        /*   вариант 2 где просто в список добавляются искомое слово
        List<String> arrayText = new ArrayList<>();
       Pattern pattern = Pattern.compile(word);
       Matcher matcher = pattern.matcher(text);
       while (matcher.find()){
           arrayText.add(matcher.group());
       }
        System.out.println(arrayText);
*/
    }


