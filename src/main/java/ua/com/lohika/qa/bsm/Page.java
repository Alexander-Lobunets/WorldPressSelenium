package ua.com.lohika.qa.bsm;

import org.openqa.selenium.WebDriver;

/**
 * Created by alobunets on 12/26/2014.
 */
public abstract class Page {

    public void tearDown(WebDriver webdriver){
        webdriver.quit();
    }
}
