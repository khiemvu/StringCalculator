package TestStringCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 6/3/13
 * Time: 1:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    private String DELIMITER = ",|\n";
    public int cal(String numbers) {
        Matcher match = Pattern.compile("^//(.)\n(.*)").matcher(numbers);
        String number = numbers;
        if(match.find()){
            DELIMITER = Pattern.quote(match.group(1));
            number = match.group(2);
        }
        return calSum(getAllNumber(number));
    }
    public int convertToInt(String number, StringBuffer error){
        int num = Integer.parseInt(number);
        if (num > 1000) num = 0;
        if (num < 0) error.append(" " + num);
        return num;
    }
    public String[] getAllNumber(String numbers){
        if (numbers.isEmpty()){
            return new String[0];
        }
        else
            return numbers.split(DELIMITER);
    }
    public int calSum(String[]number){
        int sum = 0;
        StringBuffer error = new StringBuffer();
        for(String num:number)
            sum += convertToInt(num, error);
        if(error.length() > 0) throw new RuntimeException("negative not allowed" + error);
        return sum;
    }
}
