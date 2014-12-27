package ua.com.lohika.qa.bsm.publicside;


import org.openqa.selenium.WebElement;
import ua.com.lohika.qa.bsm.Driver;
import ua.com.lohika.qa.bsm.Page;


/**
 * Created by alobunets on 12/26/2014.
 */
public class MainPage extends Page {
    private static String url = "https://bsmqa.wordpress.com/";
    private static String pageTitleExpected = null;
    private static WebElement pageTitle;


//    public MainPage(WebDriver webDriver){
//        webDriver
//    }

    public static void goTo() {
        Driver.getInstance().navigate().to(url);
    }

    public static boolean at() {
        return Driver.getInstance().getTitle().equalsIgnoreCase(pageTitleExpected);
    }







}
