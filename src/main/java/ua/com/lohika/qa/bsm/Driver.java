package ua.com.lohika.qa.bsm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private static WebDriver webdriver;

    private Driver(){
        webdriver = new FirefoxDriver();
        }


    public WebDriver getDriver(){
        return webdriver;
    }
}




