import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config
{
    ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();
    @Bean
    public WebDriver provideChromeDriver()
    {
//        WebDriver chromeDriver = new ChromeDriver();
//        webDriverThreadLocal.set(chromeDriver);
//        return webDriverThreadLocal.get();

        return new ChromeDriver();

    }
}
