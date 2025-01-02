import org.testng.annotations.*;

public class Example_2 {

    @BeforeClass
    public void login(){
        System.out.println("Login to the application...");
    }

    @Test(priority = 1)
    public void search(){
        System.out.println("Searching...");
    }

    @Test(priority = 2)
    public void advancedSearch(){
        System.out.println("Advanced search...");
    }

    @AfterClass
    public void logout(){
        System.out.println("Logout from the application...");
    }
}
