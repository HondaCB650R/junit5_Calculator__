import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculate calculator = new Calculate();


    @Test
    @DisplayName("add 45+10 = 55")

    void addTwoNumbers() {assertEquals(55, calculator.add(45,10),"45 + 10 should be 55");

    }

    @Test
    @DisplayName("subtract 13 -5 = 8")

    void subtractTwoNumbers() {assertEquals(8, calculator.subtract(13,5),"13 - 5 should be 8");

    }

    @Test
    @DisplayName("divide 50 / 2 = 25")

    void divideTwoNumbers() {assertEquals(25, calculator.divide(50,2),"50 / 2 should be 25");

    }

    @Test
    @DisplayName("multiply 6 * 8 = 48")

    void multiplyTwoNumbers() { assertEquals(48, calculator.multiply(6,8),"6 * 8 should be 48");

    }

    }












