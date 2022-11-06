package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.After;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class SingletonDriver {

    private static ChromeDriver driver;
    private static final long WAIT_TIMEOUT = 10;
    private static final long PAGE_TIMEOUT = 15;


    private SingletonDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(WAIT_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_TIMEOUT, TimeUnit.SECONDS);
    }


    public static ChromeDriver getInstance() {
        if (driver == null) {
            new SingletonDriver();
        }
        return driver;
    }
}