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
    @Test
    void testMultipleNumbers() {
        assertEquals(10, calculator.add("1,2,3,4"));
    }
    @Test
    void testNewlineDelimiter() {
        assertEquals(6, calculator.add("1\n2,3"));
    }

    @Test
    void testBadFormatting() {
        assertThrows(NumberFormatException.class, () -> calculator.add("1,\n2"));
    }

    
}
