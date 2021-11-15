import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilTest {
    @Test
    public void checkLengthOfAString()
    {
        String text="Hello World!";
        Assert.assertEquals(text.length(),12);
    }
}
