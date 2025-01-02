import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example_1 {

    @BeforeMethod
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

    @AfterMethod
    public void logout(){
        System.out.println("Logout from the application...");
    }
}
