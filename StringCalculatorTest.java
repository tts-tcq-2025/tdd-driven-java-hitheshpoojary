import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    private final StringCalculator calculator = new StringCalculator();

    @Test
    void testEmptyString() {
        assertEquals(0, calculator.add(""));
    }
    @Test
    void testSingleNumber() {
        assertEquals(1, calculator.add("1"));
    }
    @Test
    void testTwoNumbers() {
        assertEquals(3, calculator.add("1,2"));
    }


}
