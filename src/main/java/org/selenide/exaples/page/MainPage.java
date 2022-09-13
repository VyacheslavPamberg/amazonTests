package org.selenide.exaples.page;

import org.openqa.selenium.By;

public class MainPage {

    public MainPage() {
    }

    By fildSearch = By.name("field-keywords");
    By sizeItemForPage = By.className("s-product-image-container");

    By textResult = By.cssSelector("div.s-no-outline");

    By nameProduct = By.cssSelector("img.s-image");

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

}
