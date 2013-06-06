package TestStringCalculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;


/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 6/6/13
 * Time: 1:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestStringCalculator {
    private  StringCalculator stringCalculator = new StringCalculator();
    @Test
    public void testStringEmpty(){
        assertEquals(0, stringCalculator.sum(""));
    }
    @Test
     public void testStringHaveANumber(){
        assertEquals(1, stringCalculator.sum("1"));
    }
    @Test
    public void testStringHaveTwoNumber(){
        assertEquals(3, stringCalculator.sum("1,2"));
    }
    @Test
    public void testStringHaveMultipliNumber(){
        assertEquals(6, stringCalculator.sum("1,2,3"));
    }
    @Test
    public void testStringHaveNewLine(){
        assertEquals(6, stringCalculator.sum("1\n2,3"));
    }
    @Test
    public void testUserDefineDelimiter(){
        assertEquals(6, stringCalculator.sum("//;\n1;2;3"));
        assertEquals(6, stringCalculator.sum("//;\n1,2;3"));
    }
    @Test
    public void testUserDefineDelimiterHaveKeyword(){
        assertEquals(6, stringCalculator.sum("//#\n1#2#3"));
        assertEquals(6, stringCalculator.sum("//#\n1#2,3"));
    }
    @Rule
    public ExpectedException ex = ExpectedException.none();
    @Test
    public void testWhenStringHaveANegativeNumber(){
        ex.expectMessage("negative not allowed -1");
        assertEquals(0, stringCalculator.sum("-1"));
    }
    @Test
    public void testWhenStringHaveMultipliNegativeNumber(){
        ex.expectMessage("negative not allowed -1 -2");
        assertEquals(3, stringCalculator.sum("-1,-2,3"));
    }
    @Test
     public void testWhenStringHaveANumberLargeThan1000(){
        assertEquals(3, stringCalculator.sum("3,1001"));
    }
    @Test
     public void testUserDefineMultipleSingleDelimiter(){
        assertEquals(5, stringCalculator.sum("//[***]\n3***2"));
    }
    @Test
    public void testUserDefineMultipleDelimiter(){
        assertEquals(6, stringCalculator.sum("//[*][%]\n1*2%3"));
    }
    @Test
    public void testUserDefineMultipleDelimiterWithLengthLargeThanOne(){
        assertEquals(6, stringCalculator.sum("//[***][%%%]\n1***2%%%3"));
    }
}
