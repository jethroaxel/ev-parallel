import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value = config.class)
public class OneTest
{
    @Autowired
    WebDriver driver;

    @Test
    void shouldTakeScreenshotAtFailure()
    {
        driver.get("http://www.google.com");
        try{
            Thread.sleep(4000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Waiting on this tread");
        }
    }

    @Test
    void shouldVisitTwitch()
    {
        driver.get("https://www.twitch.com");
    }

    @Test
    void shouldVisitMarketerWeb()
    {
        driver.get("https://advocacy.experticity.com/sign-in");
    }
}
