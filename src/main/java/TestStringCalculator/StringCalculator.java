package TestStringCalculator;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 6/4/13
 * Time: 1:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    public int sum(String numbers) {
        if(numbers.isEmpty()) {
            return 0;
        }else if(numbers.contains(",")){
            String [] number = numbers.split(",");
            return convertToInt(number[0]) + convertToInt(number[1]);
        }
        else
            return convertToInt(numbers);
    }
    public int convertToInt(String number){
        int num = Integer.parseInt(number);
        return num;
    }
}
