public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        add(calculator);
        subtract(calculator);
        muliply(calculator);
        divide(calculator);
    }

    public static void add(Calculator cal) {
        System.out.println(cal.add(3,9));
    }

    public static void subtract(Calculator cal) {
        System.out.println(cal.subtract(3,9));
    }

    public static void muliply(Calculator cal) {
        System.out.println(cal.multiply(3,9));
    }

    public static void divide(Calculator cal) {
        System.out.println(cal.divide(3,9));
    }
}
