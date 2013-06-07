package TestStringCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 6/7/13
 * Time: 8:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    private String REGEX = ",|\n";
    public int calSum(String numbers) {
        Matcher matcher = Pattern.compile("^//(.)\n(.*)").matcher(numbers);
        String number = numbers;
        if(matcher.find()){
            REGEX = Pattern.quote(matcher.group(1));
            number = matcher.group(2);
        }
        return Sum(getNumber(number));
    }
    public int convertInt(String num){
        int number = Integer.parseInt(num);
        return number;
    }
    public String[] getNumber(String number){
        if(number.isEmpty()){
            return new String[0];
        }
        else{
            return number.split(REGEX);
        }
    }
    public int Sum(String[] numbers){
        int sum = 0;
        for(String temp : numbers){
            sum += convertInt(temp);
        }
        return sum;
    }
}
