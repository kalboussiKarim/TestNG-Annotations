package example3;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {

    @BeforeSuite
    void as(){
        System.out.println("This is BeforeSuite From C3");
    }

    @Test
    void mno(){
        System.out.println("This is test mno from C3...");
    }
}
