package pl.kfrak;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-04-24.
 */
public class MathOperationsTest {

    @Test
    public void divide_simpleCase() throws MyException {
        //given
        double x = 3;
        double y = 1;

        //when
        double result = MathOperations.divide(x, y);

        //then
        assertEquals(result, 3, 0.00000001);
        //deprecated - przestarzała i przekreślona, niezalecane jest jej uzycie
        //dlatgo dodalismy trzeci parametr - dokładność!
//        assertTrue(result > 2.5);
//        assertFalse(result < 3.1);
//        assertNotEquals();
    }

        @Test
        public void divide_largeNumbers() throws MyException {
            //given
            double x = 100000000;
            double y = 50000000;

            //when
            double result = MathOperations.divide(x, y);

            //then
            assertEquals(result, 2, 0.00000001);
            //deprecated - przestarzała i przekreślona, niezalecane jest jej uzycie
            //dlatgo dodalismy trzeci parametr - dokładność!
//        assertTrue(result > 2.5);
//        assertFalse(result < 3.1);
//        assertNotEquals();
        }
        @Test (expected = MyException.class)
    public void divide_byZero() throws MyException{
            //given
            double x = 10;
            double y = 0;
            //when
            double result = MathOperations.divide(x, y);
            //then
            assertEquals(result, 2, 0.0000001);
        }

        @Test
    public void factorial_shouldReturnCorrectResultFor1(){
            //given
            int x = 1;
            //when
            int result = MathOperations.factorial(x);
            //then
            assertEquals(result, 1);
        }

    @Test
    public void factorial_shouldReturnCorrectResultFor0(){
        //given
        //dane wejściowe
        int x = 0;
        //when
        //co testuję
        int result = MathOperations.factorial(x);
        //then
        assertEquals(result, 1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void factorial_shouldThrowExceptionForNegative(){
        //given
        //dane wejściowe
        int x = -1;
        //when
        //co testuję
        MathOperations.factorial(x);
    }

    @Test
    public void factorial_shouldReturnCorrectResultFor4(){
        //given
        int x = 4;
        //when
        int result = MathOperations.factorial(x);
        //then
        assertEquals(result, 24);
    }

    @Test
    public void factorial_shouldReturnCorrectResultFor12(){
        //given
        int x = 12;
        //when
        int result = MathOperations.factorial(x);
        //then
        assertEquals(result, 479001600);
    }

    @Test (expected = IllegalArgumentException.class)
    public void factorial_shouldThrowExceptionFor13(){
        //given
        int x = 13;
        //when
        MathOperations.factorial(x);
    }


    }
