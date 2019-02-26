import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator cal;

    @Before
    public void setup() {
        cal = new Calculator();
    }

    @Test
    public void add() {
        assertEquals("더하기 결과 오류",9,cal.add(6,3));
    }

    @Test
    public void subtract() {
        assertEquals("뺄샘 결과 오류 ",3,cal.subtract(6,3));
    }

    @Test
    public void multiply() {
        assertEquals("곱셉 결과 오류 ",18 ,cal.multiply(6,3));
    }

    @Test
    public void devide() {
        assertEquals("나눗셈 결과 오류 ",2, cal.divide(6,3));
    }

    @After
    public void teardown() {

    }

}
