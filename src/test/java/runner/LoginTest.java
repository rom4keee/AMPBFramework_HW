package runner;

import constants.UserCred;
import desktop.pages.LoginPage;
import driver.SingletonDriver;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;


public class LoginTest {
    static WebDriver driver = SingletonDriver.getInstance();
    static LoginPage loginPage;

    @BeforeAll
    public static void openLoginPage() {
        driver.get(LoginPage.LOGIN_PAGE);
        loginPage = new LoginPage(driver);
    }
    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Test
    void SingInCorrectCredentials() {
        loginPage.singIn(UserCred.UserCredentials());
        Assertions.assertEquals(LoginPage.SUCCESS_LINK, driver.getCurrentUrl());
        driver.quit();
    }
}