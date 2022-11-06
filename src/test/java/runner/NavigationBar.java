package runner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationBar {

    @Test
    public void navigationBarTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bookdepository.com/");

        WebElement home = driver.findElement(By.xpath("//div[@class='user-nav-wrap ']//i[@class='icon-home']"));
        Assertions.assertTrue(home.isDisplayed(), "Home icon not displayed");

        WebElement contactUs = driver.findElement(By.xpath("//div[@class='user-nav-wrap ']//i[@class='icon-em']"));
        Assertions.assertTrue(contactUs.isDisplayed(), "ContactUs icon not displayed");

        WebElement help = driver.findElement(By.xpath("//div[@class='user-nav-wrap ']//i[@class='icon-info']"));
        Assertions.assertTrue(help.isDisplayed(), "Help icon not displayed");

        WebElement orderStatus = driver.findElement(By.xpath("//div[@class='user-nav-wrap ']//i[@class='icon-order-status']"));
        Assertions.assertTrue(orderStatus.isDisplayed(), "OrderStatus icon not displayed");

        WebElement wishList = driver.findElement(By.xpath("//div[@class='user-nav-wrap ']//i[@class='icon-order-status']"));
        Assertions.assertTrue(wishList.isDisplayed(), "WishList icon not displayed");

        WebElement login = driver.findElement(By.xpath("//div[@class='user-nav-wrap ']//i[@class='icon-user']"));
        Assertions.assertTrue(login.isDisplayed(), "Login icon not displayed");
    }
}
