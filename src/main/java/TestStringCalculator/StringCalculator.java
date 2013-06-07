package TestStringCalculator;

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
        return Sum(getNumber(numbers));
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
