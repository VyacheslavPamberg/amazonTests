package org.selenide.exaples.page;

import org.openqa.selenium.By;

public class SettingPage {

    public SettingPage() {
    }

    By label = By.cssSelector("div.a-spacing-base");

    By listSettingItems = By.cssSelector("div.a-span-last");

    public By getLabel() {
        return label;
    }

    public By getListSettingItems() {
        return listSettingItems;
    }
}
