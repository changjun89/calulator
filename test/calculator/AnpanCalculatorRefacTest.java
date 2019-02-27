package calculator;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnpanCalculatorRefacTest {
    AnpanCalculatorRefac cal;

    @Before
    public void setup() {
        cal = new AnpanCalculatorRefac();
    }

    @Test
    public void add() throws Exception {
        String[] argNum = {"3", "5", "7"};
        assertEquals("더하기 오류", 15, cal.add(argNum));
    }

    @Test
    public void calculato콜론콤마복함() throws Exception {
        String arg = "1:2,3";
        assertEquals(6, cal.calculator(arg));
    }

    @Test
    public void calculato콜론() throws Exception {
        String arg = "1:2:3";
        assertEquals(6, cal.calculator(arg));
    }

    @Test
    public void calculato콤마() throws Exception {
        String arg = "1,2,3";
        assertEquals(6, cal.calculator(arg));
    }

    @Test
    public void calculator커스텀() throws Exception {
        String arg = "//;\n1;2;3";
        assertEquals(6, cal.calculator(arg));
    }

    @Test
    public void calculator마이너스() throws Exception {
        String arg = "//;\n-11;2;3";
        try {
            cal.calculator(arg);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "음수가 들어옴");
        }
    }

    @Test
    public void calculatorMinusTest() {
        String arg = "-11";
        try {
            cal.checkMinus(arg);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "음수가 들어옴");
        }
    }


}
