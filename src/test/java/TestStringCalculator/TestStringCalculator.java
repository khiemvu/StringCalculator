package TestStringCalculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
    @Test
    public void testWhenStringHaveNewLine(){
        assertEquals(6, stringCal.sum("1\n2,3"));
    }
    @Test
    public void testDelimiterUserDefine(){
        assertEquals(6, stringCal.sum("//;\n1;2;3"));
    }
    @Test
     public void testDelimiterUserDefineHaveKeyword(){
        assertEquals(6, stringCal.sum("//a\n1a2a3"));
    }
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test
    public void testWhenStringHaveANegative(){
        expectedException.expectMessage("negative not allowed -1");
        assertEquals(0, stringCal.sum("-1"));
    }
}
