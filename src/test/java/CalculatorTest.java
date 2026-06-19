import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void additionTest() {
        Assert.assertEquals(10 + 20, 30);
        System.out.println("Addition Test Passed");
    }
}
