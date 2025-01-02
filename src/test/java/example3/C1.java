package example3;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {

    @Test
    void abc(){
        System.out.println("This is test abc from C1...");
    }

    @BeforeTest
    void bt(){
        System.out.println("This is BeforeTest from C1");
    }
}
