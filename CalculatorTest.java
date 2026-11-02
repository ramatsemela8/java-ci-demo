public class CalculatorTest {
    public static void main(String[] args) {
        int result = Calculator.add(2, 3);

        if (result != 5) {
            throw new AssertionError(
                "Test failed: expected 5, but got " + result
            );
        }

        System.out.println("Test passed: 2 + 3 = 5");
    }
}
