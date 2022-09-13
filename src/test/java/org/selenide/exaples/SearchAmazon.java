package org.selenide.exaples;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.selenide.exaples.constants.BaseUrl.HOST_AMAZON;
import static org.selenide.exaples.constants.NameBrends.*;

public class SearchAmazon extends BaseTest {

    @Test
    public void searchFoodAmazonTest() {
        open(HOST_AMAZON);
        // Find food
        CheckSearch("coffe", NAME_COFFE);
    }

    @Test
    public void searchTechnicAmazonTest() {
        open(HOST_AMAZON);
        // Find technic
        CheckSearch("coffee machine", NAME_MACHINE);
    }

    @Test
    public void searchHousesholdGoods() {
        open(HOST_AMAZON);
        // Find houseshold goods
        CheckSearch("household chemicals", NAME_HOUSEHOLD_СHEMICALS);
    }
}
