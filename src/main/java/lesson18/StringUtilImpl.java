package lesson18;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public List<String> findWord(String text, String word) throws NullPointerException {
        return null;
    }
/*
    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
       return int[0];
       /* List<String> arrayText = null;
        if (text == null || word == null) {
            throw new NullPointerException("number1 == null || number2 == null");
        }
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while ((matcher.find())) {
            arrayText.add(matcher.group());
        }
        int[] index = new int[arrayText.size()];
        for(int i = 0; i < index.length; i++){
            index[i] = arrayText.get(i);
        }
        return index;
    }
*/
       /*
        List<Integer> indexesArray = new ArrayList<>();
        String textString = text.toLowerCase();
        String wordString = word.toLowerCase();
        int index = 0;
        while (index != -1) {
            index = textString.indexOf(wordString, index);
            if (index != -1) {
                indexesArray.add(index);
                index++;
            }
        }
        return indexesArray.stream().mapToInt(i -> i).toArray();
*/



    @Override
    public double[] findNumbers(String text) throws CustomException {

        String[] array = (text.replaceAll("\\D+", " ").trim()).split(" ");
        double[] a = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = Double.valueOf(array[i]);
        }
        System.out.println(Arrays.toString(a));
        return a;
    }
}
