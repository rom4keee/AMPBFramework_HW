package runner;

import constants.UserCred;
import org.junit.jupiter.api.Test;
import desktop.fragments.ExampleFragment;
import desktop.pages.ContactUS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ContactUsTest {
    @Test
    public void checkTheContactUsPage() {

        ExampleFragment navigationBar;
        ContactUS contactUsPage;

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bookdepository.com/");


        navigationBar = new ExampleFragment(driver);
        contactUsPage = new ContactUS(driver);
        navigationBar.openContactUsPage();
        contactUsPage.ContactUsInfo(UserCred.FULL_NAME, UserCred.ADDRESS, UserCred.ZIP_CODE, UserCred.ORDER_NUMBER, UserCred.MESSAGE);

        driver.quit();
    }
}
