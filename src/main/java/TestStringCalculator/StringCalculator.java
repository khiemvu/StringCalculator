package TestStringCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 6/6/13
 * Time: 1:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    private String REGEX = ",|\n";
    public int sum(String numbers) {
        Matcher matcher = Pattern.compile("^//((.)|(\\[(.+)]))\n(.*)").matcher(numbers);
        String num = numbers;
        if(matcher.find()){
            if(matcher.group(2) != null){
                REGEX = Pattern.quote(matcher.group(2)) + "|,";
            }else{
                String delimiter = matcher.group(1);
                Matcher delimiterMatcher = Pattern.compile("\\[(.+?)]").matcher(delimiter);
                StringBuffer allDelimiter = new StringBuffer();
                while (delimiterMatcher.find()){
                    if(allDelimiter.length() == 0){
                        allDelimiter.append(Pattern.quote(delimiterMatcher.group(1)));
                    }
                    else{
                        allDelimiter.append("|" + Pattern.quote(delimiterMatcher.group(1)));
                    }
                }
                REGEX = allDelimiter.toString()+"|,";
            }
            num = matcher.group(5);
        }
        return calSum(allNumber(num));
    }
    public int convertInt(String number, StringBuffer negative){
        int num = Integer.parseInt(number);
        if (num < 0) negative.append(" "+num);
        if(num >=1000) num = 0;
        return num;
    }
    public String[] allNumber(String number){
        if(number.isEmpty()){
            return new String [0];
        }
        else
            return number.split(REGEX);
    }
    public int calSum(String[]number){
        int sum = 0;
        StringBuffer negative = new StringBuffer();
        for(String num : number){
            sum += convertInt(num, negative);
        }
        if(negative.length()>0) throw new RuntimeException("negative not allowed"+negative);
        return sum;
    }
}
