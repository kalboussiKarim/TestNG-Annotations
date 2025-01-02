package example3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AsssertionsExample {

    @Test
    void testTitle(){
        String expectedTitle = "Opencart";
        String actualTitle = "Opencartµp";
        Assert.assertEquals(expectedTitle,actualTitle,"Expected & Actual title Do Not Match");
    }
}
