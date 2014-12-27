package ua.com.lohika.qa.bsm.test;


import org.testng.Assert;
import org.testng.annotations.Test;
import ua.com.lohika.qa.bsm.publicside.MainPage;

public class TestPublic {

    @Test

    public void checkMainPageTitle(){
        MainPage.goTo();
        Assert.assertEquals(MainPage.at(), true);

    }




}
