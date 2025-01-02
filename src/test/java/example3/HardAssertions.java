package example3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

    @Test
    void test(){
        Assert.assertEquals("a","a","Failed");
        Assert.assertNotEquals("a","b","The 2 values Do Not Match");
    }
}
