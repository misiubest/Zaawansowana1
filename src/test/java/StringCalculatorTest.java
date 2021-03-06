import basics.StringCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringCalculatorTest {

    StringCalculator calculator;

    @BeforeEach
    void setup() {
        calculator = new StringCalculator();
    }
    @Test
    void testEmptyStringPassed() {
        String value = "";
        int result = calculator.add(value);
        assertThat(result).isEqualTo(0);
    }
    @Test
    void testOneNumber(){
        String value = "1";
        int result = calculator.add(value);
        assertThat(result).isEqualTo(1);
    }
    @Test
    void testTwoNumber(){
        String value = "1,2";
        int result = calculator.add(value);
        assertThat(result).isEqualTo(3);
    }
}