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
            Thread.sleep(10000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Waiting on this tread");
        }
        driver.get("http://www.facebook.com");
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
    void shouldVisitCnn()
    {
        driver.get("https://cnn.com");
        try{
            Thread.sleep(8000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Waiting on this tread");
        }
    }


}
