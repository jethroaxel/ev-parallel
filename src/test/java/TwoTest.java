import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value = config.class)
public class TwoTest
{
    @Autowired
    WebDriver driver;


    @Test
    void shouldTakeScreenshotAtFailure()
    {
        try{
            Thread.sleep(1500);
        }
        catch(InterruptedException e)
        {
            System.out.println("Waiting on this tread");
        }
        driver.get("http://www.google.com");
    }

    @Test
    void shouldVisitUnified()
    {
        driver.get("https://www.experticity.com/sign-in");
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Waiting on this tread");
        }
    }

    @Test
    void shouldVisitMarketerWeb()
    {
        driver.get("https://advocacy.experticity.com/sign-in");
    }


}
