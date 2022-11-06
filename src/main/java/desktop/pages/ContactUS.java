package desktop.pages;

import abstractclasses.page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUS extends AbstractPage {

    public ContactUS(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='fullName']")
    WebElement FullNameField;

    public void FullName(String fullName){
        FullNameField.sendKeys(fullName);
    }

    @FindBy(xpath = "//*[@id='emailAddress']")
    WebElement EmailAddressField;


    public void emailAddress(String eMailAddress){
        EmailAddressField.sendKeys(eMailAddress);
    }

    @FindBy(xpath = "//*[@id='postcode']")
    WebElement ZipCodeField;

    public void zipCode(String ZipPostalCode){
        ZipCodeField.sendKeys(ZipPostalCode);
    }

    @FindBy(xpath = "//*[@id='orderReference']")
    WebElement OrderNumberField;

    public void OrderNumber(String orderNumer){
        OrderNumberField.sendKeys(orderNumer);
    }

    @FindBy(xpath = "//*[@id='queryType']")
    WebElement ReasonField;

    public void reason(String reasonField){
        ReasonField.sendKeys(reasonField);
    }

    @FindBy(xpath = "//*[@id='contactMessage']")
    WebElement YourMessage;

    public void yourMessage(String message){
        YourMessage.sendKeys(message);
    }

    @FindBy(xpath = "/html/body/div[2]/div[5]/div[2]/div/div/form/div[7]/div/button")
    WebElement SubmitButton;

    public static void clickSubmitButton(WebElement webElement){
        webElement.click();
    }


    public void ContactUsInfo(String fullName, String eMailAddress, String ZipPostalCode, String orderNumer, String message
    ) {
        FullNameField.sendKeys(fullName);
        EmailAddressField.sendKeys(eMailAddress);
        ZipCodeField.sendKeys(ZipPostalCode);
        OrderNumberField.sendKeys(orderNumer);
        YourMessage.sendKeys(message);
    }
}

