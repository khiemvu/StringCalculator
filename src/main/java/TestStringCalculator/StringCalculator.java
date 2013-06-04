package TestStringCalculator;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 6/4/13
 * Time: 1:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    private String DELIMITER = ",";
    public int sum(String numbers) {
        return calSum(allNumber(numbers));
    }
    public int convertToInt(String number){
        int num = Integer.parseInt(number);
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
        for (String num : number){
            sum += convertToInt(num);
        }
        return sum;
    }
}
