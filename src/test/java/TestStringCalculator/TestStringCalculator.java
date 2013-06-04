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

    private StringCalculator stringCal = new StringCalculator();
    @Test
    public void testStringEmpty(){

        assertEquals(0, stringCal.sum(""));
    }
    @Test
    public void testWhenStringHaveOnlyNumber(){
        assertEquals(1, stringCal.sum("1"));
    }
    @Test
    public void testWhenStringHaveTwoNumber(){
        assertEquals(3, stringCal.sum("1,2"));
    }
    @Test
    public void testWhenStringHaveMultipliNumber(){
        assertEquals(6, stringCal.sum("1,2,3"));
    }
}
