import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class config
{
    ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    //@Scope("prototype")
    @Bean
    public WebDriver provideChromeDriver()
    {
//        WebDriver chromeDriver = new ChromeDriver();
//        webDriverThreadLocal.set(chromeDriver);
//        return webDriverThreadLocal.get();

        System.setProperty("webdriver.chrome.driver", "/Users/jethro/Downloads/chromedriver");

        return new ChromeDriver();

    }
}
