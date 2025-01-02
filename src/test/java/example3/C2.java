package example3;

import org.testng.annotations.*;

public class C2 {

    @Test
    void xyz(){
        System.out.println("This is test xyz from C2...");
    }

    @AfterTest
    void at(){
        System.out.println("This is AfterTest from C2");
    }

    @BeforeTest
    void bt(){
        System.out.println("This is BeforeTest from C2");
    }
}
