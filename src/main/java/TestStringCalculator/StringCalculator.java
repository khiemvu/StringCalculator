package TestStringCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 6/4/13
 * Time: 1:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    private String DELIMITER = ",|\n";
    public int sum(String numbers) {
        Matcher matcher = Pattern.compile("^//(.)\n(.*)").matcher(numbers);
        String temp = numbers;
        if(matcher.find()){
            DELIMITER = Pattern.quote(matcher.group(1));
            temp = matcher.group(2);
        }
        return calSum(allNumber(temp));
    }
    public int convertToInt(String number, StringBuffer negative){
        int num = Integer.parseInt(number);
        if(num < 0) negative.append(" " + num);
        if(num>=1000) num = 0;
        return num;
    }
    public String[] allNumber(String numbers){
        if(numbers.isEmpty())
            return new String[0];
        else
            return numbers.split(DELIMITER);
    }
    public int calSum(String[] number){
        int sum = 0;
        StringBuffer negative = new StringBuffer();
        for (String num : number){
            sum += convertToInt(num, negative);
        }
        if(negative.length() > 0) throw new RuntimeException("negative not allowed"+ negative);
        return sum;
    }
}
