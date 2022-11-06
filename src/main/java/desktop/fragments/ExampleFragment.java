package desktop.fragments;

import abstractclasses.fragment.AbstractFragment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExampleFragment extends AbstractFragment {

    public ExampleFragment(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='user-nav-wrap ']//i[@class='icon-home']")
    WebElement home;
    @FindBy(xpath = "//div[@class='user-nav-wrap ']//i[@class='icon-em']")
    WebElement contactUs;

    @FindBy(xpath = "//div[@class='user-nav-wrap ']//i[@class='icon-info']")
    WebElement help;

    @FindBy(xpath = "//div[@class='user-nav-wrap ']//i[@class='icon-order-status']")
    WebElement orderStatus;

    @FindBy(xpath = "//div[@class='user-nav-wrap ']//i[@class='icon-order-status']")
    WebElement wishList;

    @FindBy(xpath = "//div[@class='user-nav-wrap ']//i[@class='icon-user']")
    WebElement signIn;

    public void openContactUsPage(){
        contactUs.click();
    }
    public void openLoginPage(){
        signIn.click();
    }
}
