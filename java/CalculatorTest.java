import calc.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {



    //red, green refactor

    @Test
    public void addTest(){
        //Given
        Calculator calculator = new Calculator();
        int val1 = 7;
        int val2 = 10;
        int expected = val1 + val2;
        //When
        int actual = calculator.add(val1, val2);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subtractTest(){

        Calculator calculator = new Calculator();
        int val1 = 7;
        int val2 = 10;
        int expected = val2 - val1;
        //When
        int actual = calculator.subtract(val1, val2);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplyTest(){
        Calculator calculator = new Calculator();
        int val1 = 5;
        int val2 = 6;
        int expected = val1 * val2;
        int actual = calculator.multiply(val1, val2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divideTest(){
        Calculator calculator = new Calculator();
        int val1 = 12;
        int val2 = 6;
        int expected = val1 / val2;
        int actual = calculator.divide(val1, val2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void squareTest(){
        Calculator calculator = new Calculator();
        int val1 = 2;
        int expected = val1 * val1;
        int actual = calculator.square(val1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void squareRootTest(){
        Calculator calculator = new Calculator();
        int val1 = 14;
        int expected = (int )Math.sqrt(val1);
        int actual = calculator.squareRoot(val1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void exponentTest(){
        Calculator calculator = new Calculator();
        int val1 = 14;
        int val2 = 12;
        int expected = (int )Math.pow(val1, val2);
        int actual = calculator.exponent(val1, val2);
        Assert.assertEquals(expected, actual);
    }



}

