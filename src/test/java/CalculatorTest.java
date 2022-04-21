import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculate calculator = new Calculate();

    @Test
    @DisplayName("Test add 10+15 = 25")

    void tenPlusFifteen(){assertEquals(25,25);}

    @Test
    @DisplayName("Test add 45+10 = 5")

    void fortyFivePlusTen(){assertEquals(55,5);}

    @Test
    @DisplayName("Test subtract 13 -5 = 8")

    void thirteenMinusFive(){assertEquals(8,8);}

    @Test
    @DisplayName("Test divide 50 / 2 = 25")

    void fiftyDividedByTwo(){assertEquals(25,25);}

    }












