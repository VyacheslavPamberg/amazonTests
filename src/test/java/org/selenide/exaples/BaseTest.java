package org.selenide.exaples;

import org.junit.Assert;
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

    protected void openPage(String url){
        open(url);
    }


}
