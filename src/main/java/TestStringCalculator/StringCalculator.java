package TestStringCalculator;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 6/7/13
 * Time: 8:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    public int calSum(String numbers) {
        if(numbers.isEmpty()){
            return 0;
        }else
            return Integer.parseInt(numbers);
    }
}
