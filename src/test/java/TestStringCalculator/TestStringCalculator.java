package TestStringCalculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
    @Test
    public void testWhenStringHaveNewLine(){
        assertEquals(3, stringCalculator.calSum("1\n2"));
        assertEquals(10, stringCalculator.calSum("1\n5,4"));
    }
    @Test
    public void testUserDefineDelimiter(){
        assertEquals(3, stringCalculator.calSum("//;\n1;2"));
        assertEquals(10, stringCalculator.calSum("//;\n1;5;4"));
    }
    @Test
    public void testUserDefineDelimiterHaveKeyword(){
        assertEquals(3, stringCalculator.calSum("//#\n1#2"));
        assertEquals(10, stringCalculator.calSum("//?\n1?5?4"));
    }
    @Rule
    public ExpectedException expectedEx = ExpectedException.none();
    @Test public void testNegativeNumber(){
        expectedEx.expectMessage("negative not allowed -1");
        assertEquals(2, stringCalculator.calSum("-1,2"));

    }
    @Test public void testWhenStringHaveMultipliNegativeNumber(){
        expectedEx.expectMessage("negative not allowed -1 -3");
        assertEquals(2, stringCalculator.calSum("-1,2,-3"));

    }
    @Test
    public void testWhenStringHaveNumberLagerThan1000(){
        assertEquals(2, stringCalculator.calSum("10001,2,1000"));
    }
    @Test
    public void userDifineMultipliSameDelimiter(){
        assertEquals(6, stringCalculator.calSum("//[;;;]\n1;;;2;;;3"));
    }
    @Test
    public void userDifineMultipliDelimiter(){
        assertEquals(6, stringCalculator.calSum("//[;][%]\n1;2%3"));
    }
    @Test
    public void userDifineMultipliDelimiterWithLegthLagerThan1(){
        assertEquals(6, stringCalculator.calSum("//[;;;][%%]\n1;;;2%%3"));
    }
}
