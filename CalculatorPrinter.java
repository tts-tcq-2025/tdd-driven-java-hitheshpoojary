public class CalculatorPrinter {

    private final StringCalculator calculator;

    public CalculatorPrinter(StringCalculator calculator) {
        this.calculator = calculator;
    }

    public void printAddResult(String input) {
        try {
            int result = calculator.add(input);
            System.out.println("Sum of \"" + input + "\" = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error for input \"" + input + "\": " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format: \"" + input + "\"");
        }
    }
}
