import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilTest {
    StringMethods object=new StringMethods();
    @Test
    public void checkLengthOfAString()
    {
        int length = object.getStringLength("Hello World!!");
        Assert.assertEquals(length,13);
    }


}
