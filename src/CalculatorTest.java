import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator cal = new Calculator();
        assertEquals("더하기 결과 오류",9,cal.add(6,3));
    }

    @Test
    public void subtract() {
        Calculator cal = new Calculator();
        assertEquals("뺄샘 결과 오류 ",3,cal.subtract(6,3));
    }

    @Test
    public void multiply() {
        Calculator cal = new Calculator();
        assertEquals("곱셉 결과 오류 ",18 ,cal.multiply(6,3));
    }

    @Test
    public void devide() {
        Calculator cal = new Calculator();
        assertEquals("나눗셈 결과 오류 ",2, cal.divide(6,3));
    }

}
