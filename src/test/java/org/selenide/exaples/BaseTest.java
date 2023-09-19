package org.selenide.exaples;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.selenide.exaples.page.MainPage;
import org.selenide.exaples.page.SettingPage;
import org.selenide.exaples.page.SignInPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    protected final MainPage mainPage = new MainPage();
    protected final SignInPage signInPage = new SignInPage();
    protected final SettingPage settingPage = new SettingPage();

    protected void CheckSearch(String productName, String brand) {

        $(mainPage.getFildSearch()).setValue(productName).pressEnter();

        int foundElements = $$(mainPage.getSizeItemForPage()).size();
        Assert.assertTrue(foundElements > 40);

        $(mainPage.getTextResult()).shouldHave(text("RESULTS"));
        $$(mainPage.getNameProduct()).findBy(attribute("alt", brand));
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
    }

    protected void openPage(String url){
        open(url);
    }


}
