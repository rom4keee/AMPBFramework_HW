package abstractclasses.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public abstract class AbstractPage {
    public static WebDriver driver;

    public AbstractPage(WebDriver driver) {
        AbstractPage.driver = driver;
        PageFactory.initElements(driver, this);
    }
}