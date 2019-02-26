package pactice1;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class AnpanCalculatorTest {
    AnpanCalculator anpanCalculator ;

    @Before
    public void setup() {
        anpanCalculator = new AnpanCalculator();
    }

    @Test
    public void add() throws Exception {
        String[] argNum = {"3","5","7"};
        assertEquals("더하기 오류",15,anpanCalculator.add(argNum));
    }

    @Test
    public void getcustomDivider() {
        String arg = "//;\n";
        int idx = arg.indexOf("\n");
        assertEquals(";",anpanCalculator.getcustomDivider(arg,idx-1,idx));
    }

    @Test
    public void getSubStringResult() {
        String arg = "//;\n11;2;3";
        int idx = arg.indexOf("\n");
        assertEquals("11;2;3",anpanCalculator.getSubStringResult(arg,idx));
    }

    @Test
    public void calculator() throws Exception {
        String arg = "//;\n1;2;3";
        assertEquals(6,anpanCalculator.calculator(arg));
    }

    @Test
    public void calculatorMinusTest() {
        String arg = "//;\n-11;2;3";
        try {
            anpanCalculator.calculator(arg);
        } catch (Exception e) {
            assertEquals(e.getMessage(),"음수가 들어옴");
        }
    }


}
