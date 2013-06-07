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
    @Test
    public void testWhenStringIsEmpty(){
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.calSum(""));
    }

}
