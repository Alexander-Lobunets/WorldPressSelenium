package ua.com.lohika.qa.bsm.publicside;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ua.com.lohika.qa.bsm.Page;

/**
 * Created by alobunets on 12/26/2014.
 */
public class MainPage extends Page {
    private WebDriver webDriver;

    @FindBy(id = "title")
    private WebElement pageTitle;


    public MainPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }



}
