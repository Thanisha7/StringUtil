import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilTest {
    @Test
    public void checkLengthOfAString()
    {
        String textString="Hello World!!";
        Assert.assertEquals(textString.length(),13);
    }
}
