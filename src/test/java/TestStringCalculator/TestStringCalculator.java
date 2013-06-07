package TestStringCalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 6/7/13
 * Time: 8:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestStringCalculator {

    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void testWhenStringIsEmpty(){
        assertEquals(0, stringCalculator.calSum(""));
    }
    @Test
    public void testWhenStringHaveANumber(){
        assertEquals(1, stringCalculator.calSum("1"));
    }
    @Test
    public void testWhenStringHaveTwoNumber(){
        assertEquals(3, stringCalculator.calSum("1,2"));
        assertEquals(6, stringCalculator.calSum("1,5"));
    }
    @Test
    public void testWhenStringHaveMultipliNumber(){
        assertEquals(6, stringCalculator.calSum("1,2,3"));
        assertEquals(10, stringCalculator.calSum("1,5,4"));
    }

}
