package notation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {
    ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        Assertions.assertEquals(3, calculator.calculatePolishNotation("1 2 +"));
    }

    @Test
    public void shouldCalculateSubtraction() {
        Assertions.assertEquals(1, calculator.calculatePolishNotation("2 1 -"));
    }

    @Test
    public void shouldCalculateMultiplication() {
        Assertions.assertEquals(6, calculator.calculatePolishNotation("2 3 *"));
    }

    @Test
    public void shouldIgnoreBlanks() {
        Assertions.assertEquals(5, calculator.calculatePolishNotation("2   3   +"));
    }

    @Test
    public void shouldCalculateNegative() {
        Assertions.assertEquals(1, calculator.calculatePolishNotation("-2   3   +"));
    }
}