package TestStringCalculator;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 6/7/13
 * Time: 8:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    private String REGEX = ",";
    public int calSum(String numbers) {
        if(numbers.isEmpty()){
            return 0;
        }else if(numbers.contains(REGEX)){
            String []allNum = numbers.split(REGEX);
            int sum = 0;
            for(String num : allNum)
                sum += convertInt(num);
            return sum;
        }else
            return convertInt(numbers);
    }
    public int convertInt(String num){
        int number = Integer.parseInt(num);
        return number;
    }
}
