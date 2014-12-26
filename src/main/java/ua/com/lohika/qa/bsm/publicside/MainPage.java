package ua.com.lohika.qa.bsm.publicside;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ua.com.lohika.qa.bsm.Driver;
import ua.com.lohika.qa.bsm.Page;


/**
 * Created by alobunets on 12/26/2014.
 */
public class MainPage extends Page {
    private WebDriver webDriver;
    private static String url = "https://bsmqa.wordpress.com/";

    @FindBy(id = "title")
    private WebElement pageTitle;


    public MainPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = Driver.setWebDriver();
    }


    public static void goTo() {
        Driver.getDriver().navigate().to(url);
    }

    public static boolean at() {
        return Driver.getInstance().findElement(By.id("login")).isDisplayed();
    }







}
