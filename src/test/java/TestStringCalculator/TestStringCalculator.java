package TestStringCalculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: All_in_one
 * Date: 6/3/13
 * Time: 1:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestStringCalculator {

    private StringCalculator stringCalculator = new StringCalculator();
    @Test
    public void testStringEmpty(){

        assertEquals(0, stringCalculator.cal(""));
    }
    @Test
    public void testStringHaveANumber(){

        assertEquals(1, stringCalculator.cal("1"));
    }
    @Test
    public void testStringHaveTwoNumber(){
        assertEquals(3, stringCalculator.cal("1,2"));
    }
    @Test
    public void testStringHaveNewLine(){
        assertEquals(6, stringCalculator.cal("1\n2,3"));
    }
    @Test
     public void testDelimiterUserDefine(){
        assertEquals(6, stringCalculator.cal("//;\n1;2;3"));
    }
    @Test
     public void testDelimiterUserDefineHaveKyword(){
        assertEquals(6, stringCalculator.cal("//?\n1?2?3"));
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();
    @Test
    public void testWhenStringHaveANegative(){
        expectedEx.expectMessage("negative not allowed");
        assertEquals(0,stringCalculator.cal("-1"));
    }
    @Test
    public void testWhenStringHaveMultipliNegative(){
        expectedEx.expectMessage("negative not allowed -1 -3");
        assertEquals(2,stringCalculator.cal("-1,2,-3"));
    }
    @Test
    public void testWhenStringHaveANumberLargeThan1000(){
        assertEquals(2, stringCalculator.cal("2,1003"));
    }
}
