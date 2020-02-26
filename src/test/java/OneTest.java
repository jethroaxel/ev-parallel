
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
    }

    @Test
    void shouldVisitUnified()
    {
        driver.get("https://www.experticity.com/sign-in");
    }

    @Test
    void shouldVisitMarketerWeb()
    {
        driver.get("https://advocacy.experticity.com/sign-in");
    }
}
