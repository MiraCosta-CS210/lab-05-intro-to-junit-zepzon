import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumNumbersTest {
    //1=true, 0=false
    @Test
    public void testScenario_one() {
        SumNumbers sumNumbers = new SumNumbers();
        assertEquals(1, sumNumbers.sumIsEven(1, 1));
    }
    @Test
    public void testScenario_two() {
        SumNumbers sumNumbers = new SumNumbers();
        assertEquals(0, sumNumbers.sumIsEven(1, 2));
    }
}
