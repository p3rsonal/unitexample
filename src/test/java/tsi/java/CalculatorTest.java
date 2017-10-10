package tsi.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void add() throws Exception {
        assertEquals(4, calc.add(3, 1), 0.000001);
        assertEquals(-10, calc.add(-20, 10), 0.000001);
    }

    @Test
    public void sub() throws Exception {
        assertEquals(8, calc.sub(16, 8), 0.000001);
    }

    @Test
    public void mul() throws Exception {
        assertEquals(15, calc.mul(3, 5), 0.000001);
    }

    @Test
    public void div() throws Exception {
        assertEquals(5, calc.div(25, 5), 0.000001);
    }

//    @Test(expected = ArithmeticException.class) - ne prokatilo
    @Test
    public void divByZero() throws Exception {
        assertEquals(Double.POSITIVE_INFINITY, calc.div(5, 0),0.000001);
    }

}