package lesson18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Double.parseDouble;

public class StringUtilImpl implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == null || number2 == null");
        }
        int num1 = Integer.parseInt(number1); // метод может выбросить NumberFormatException если это не число
        int num2 = Integer.parseInt(number2);
        if (num2 == 0) {
            throw new ArithmeticException("На 0 делить нельзя");
        }
        return num1 / num2;
    }


    @Override
    public int[] findWord(String text, String word) throws NullPointerException {

        /*
        List<String> arrayText = new ArrayList<>();
        List<Integer> arrayInd = new ArrayList<>();
        if (text == null || word == word) {
            throw new NullPointerException("text == null || word == null");
        }
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        int count = text.indexOf(word);
        while ((matcher.find())) {
            arrayText.add(matcher.group());
            count++;
        }
        if (arrayInd.size() == 0) {
            throw new NullPointerException("список пуст");
        }
        for(String integer: arrayText){
            arrayInd.add(integer.indexOf(word));
        }
        int[] index = new int[arrayText.size()];
        for(int i = 0; i < index.length; i++){
            index[i] = arrayInd.get(i);
        }
        return index;
    }
*/
        String textString = text.toLowerCase();
        String wordString = word.toLowerCase();
        if (text == null || word == null) {
            throw new NullPointerException("text == null || word == null");
        }
        List<Integer> indexesArray = new ArrayList<>();

        int index = textString.indexOf(wordString);
        while (index >= 0) {
            index = textString.indexOf(wordString, index + 1);
            if (index >= 0) {
                indexesArray.add(index);
                index++;
            }
        }
            return indexesArray.stream().mapToInt(i -> i).toArray();

        /* вариант 2 где просто в список добавляются искомое слово и выводим на консоль
        List<String> arrayText = new ArrayList<>();
       Pattern pattern = Pattern.compile(word);
       Matcher matcher = pattern.matcher(text);
       while (matcher.find()){
           arrayText.add(matcher.group());
       }
        System.out.println(arrayText);
*/
    }









    @Override
    public double[] findNumbers(String text) throws CustomException {
        List<Double> arrayNumbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("([+]|-)?(([0-9]+[.]?[0-9]*)|([0-9]*[.]?[0-9]+))");  // ([+]|-)?(([0-9]+[.]?[0-9]*)|([0-9]*[.]?[0-9]+))   // \d+([+-]?)+\d+(?:\.\d+)?
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            arrayNumbers.add(Double.valueOf(matcher.group()));
        }
        if(arrayNumbers.isEmpty()){
            throw new CustomException("чисел нет");
        }
        System.out.println(arrayNumbers);
        return arrayNumbers.stream().mapToDouble(i -> i).toArray();

        /* // это мой старый вариант
        String[] array = (text.replaceAll("\\D+", " ").trim()).split(" ");
        double[] a = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = Double.valueOf(array[i]);
        }
        System.out.println(Arrays.toString(a));
        return a;
        */

    }
}
