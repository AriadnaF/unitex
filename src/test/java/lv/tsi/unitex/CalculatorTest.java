package lv.tsi.unitex;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    public void add() throws Exception {
        assertEquals(4,calc.add(3,1),0.00001);
        assertEquals(40,calc.add(35,5),0.00001);
    }

    @Test
    public void sub() throws Exception {
        assertEquals(5,calc.sub(9,4),0.00001);
        assertEquals(10,calc.sub(40,30),0.00001);
    }

    @Test
    public void mul() throws Exception {
        assertEquals(10,calc.mul(5,2),0.00001);
    }

    @Test
    public void div() throws Exception {
        assertEquals(2,calc.div(8,4),0.00001);
    }

   // @Test(expected = ArithmeticException.class)  // ssylka na klass
   // public void divByZero() throws Exception {
   //    calc.div(5,0);
   // }

   @Test
   public void divByZero() throws Exception {
        assertEquals(Double.POSITIVE_INFINITY, calc.div(5,0),0.00001);
   }

}