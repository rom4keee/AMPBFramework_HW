package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.After;

import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class SingletonDriver {

    private static ChromeDriver driver;
    private static final long WAIT_TIMEOUT = 10;
    private static final long PAGE_TIMEOUT = 15;


    private SingletonDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_TIMEOUT));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_TIMEOUT));
    }


    public static ChromeDriver getInstance() {
        if (driver == null) {
            new SingletonDriver();
        }
        return driver;
    }
}