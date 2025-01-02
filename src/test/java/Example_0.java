import org.testng.annotations.Test;

public class Example_0 {

    @Test(priority = 1)
    public void login(){
        System.out.println("Login to the application...");
    }

    @Test(priority = 2)
    public void search(){
        System.out.println("Searching...");
    }

    @Test(priority = 3)
    public void logout(){
        System.out.println("Logout from the application...");
    }
}
