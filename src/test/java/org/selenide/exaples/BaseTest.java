package org.selenide.exaples;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.selenide.exaples.page.MainPage;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BaseTest {

    protected final MainPage mainPage = new MainPage();
    protected void CheckSearch(String productName, String brand) {

        $(mainPage.getFildSearch()).setValue(productName).pressEnter();

        int foundElements = $$(mainPage.getSizeItemForPage()).size();
        Assert.assertTrue(foundElements > 40);

        $(mainPage.getTextResult()).shouldHave(text("RESULTS"));
        $$(mainPage.getNameProduct()).findBy(attribute("alt", brand));
    }
}
