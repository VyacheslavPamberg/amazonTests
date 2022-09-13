package org.selenide.exaples.page;

import org.openqa.selenium.By;

public class MainPage {

    public MainPage() {
    }

    By fildSearch = By.name("field-keywords");
    By sizeItemForPage = By.className("s-product-image-container");

    By textResult = By.cssSelector("div.s-no-outline");

    By nameProduct = By.cssSelector("img.s-image");

    By popUpSign = By.cssSelector("div.nav-line-1-container");

    By buttonAuthorization = By.cssSelector("span.nav-action-inner");

    By welcomeText = By.id("nav-link-accountList-nav-line-1");



    public By getFildSearch() {
        return fildSearch;
    }

    public By getSizeItemForPage() {
        return sizeItemForPage;
    }

    public By getTextResult() {
        return textResult;
    }

    public By getNameProduct() {
        return nameProduct;
    }

    public By getPopUpSign() {
        return popUpSign;
    }

    public By getButtonAuthorization() {
        return buttonAuthorization;
    }

    public By getWelcomeText() {
        return welcomeText;
    }
}
