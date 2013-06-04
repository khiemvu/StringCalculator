package TestStringCalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 6/4/13
 * Time: 1:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestStringCalculator {
    @Test
    public void testStringEmpty(){
        StringCalculator stringCal = new StringCalculator();
        assertEquals(0, stringCal.sum(""));
    }
    @Test
    public void testWhenStringHaveOnlyNumber(){
        StringCalculator stringCal = new StringCalculator();
        assertEquals(1, stringCal.sum("1"));
    }
}
