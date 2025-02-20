import org.junit.Test;
// @Test is telling the JUnit to treat it as a test and at first the @Test wasnt working
//until I used this import.
import static org.junit.jupiter.api.Assertions.*;
public class TipCalculatorTest {
//inside the test methods I re-learned what the assertEquals means
// It verifies the correctness of the code being tested.
    @Test
    public void testScenario_one() { // testing the first scenario

        TipCalculator tipCalculator = new TipCalculator();
        assertEquals(20.00, tipCalculator.calculateTip(100.00, 20), 0.01);
    }
    @Test
    public void testScenario_two() { // testing the second scenario
        TipCalculator tipCalculator = new TipCalculator();
        assertEquals(7.50, tipCalculator.calculateTip(50.00, 15), 0.01);  // 15% of 50.00 is 7.50
    }

}
