package desktop.pages;

import abstractclasses.page.AbstractPage;
import constants.UserCred;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    public class LoginPage extends AbstractPage {
        public LoginPage(WebDriver driver) {
            super(driver);
        }
        public static final String LOGIN_PAGE = "https://www.bookdepository.com/account/login/to/account";
        public static final String SUCCESS_LINK = "https://www.bookdepository.com/?status=welcome";

        @FindBy(xpath = "//input[@placeholder='Email']")
        WebElement emailFieldToSingIn;

        @FindBy(xpath = "//input[@placeholder='Book Depository password']")
        WebElement passWordFieldToSingIn;

        @FindBy(id = "signInSubmit")
        WebElement signInButton;

        @FindBy(xpath = "//*[@class='signin-iframe']")
        WebElement iframe;

        private void setUserEmailToSingIn(String userName) {
            emailFieldToSingIn.sendKeys(userName);
        }

        private void setPasswordToSingIn(String password) {
            passWordFieldToSingIn.sendKeys(password);
        }

        public void clickSingIn() {
            signInButton.click();
        }

        public void singIn(UserCred user) {
            driver.switchTo().frame(iframe);
            setUserEmailToSingIn(user.getEmail());
            setPasswordToSingIn(user.getPassword());
            clickSingIn();
        }
    }

