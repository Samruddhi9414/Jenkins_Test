import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void additionTest() {
        int result = 10 + 20;
        Assert.assertEquals(result, 30);
        System.out.println("Addition Test Passed");
    }
}
