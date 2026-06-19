import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {

    @Test
    public void testAddition() {
        int sum = 2 + 3;
        Assert.assertEquals(sum, 5);
        System.out.println("Test Passed");
    }
}
