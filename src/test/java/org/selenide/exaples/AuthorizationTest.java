package org.selenide.exaples;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.selenide.exaples.constants.BaseUrl.HOST_AMAZON;
import static org.selenide.exaples.constants.NameBrends.WELCOME_TEXT;
import static org.selenide.exaples.constants.NameBrends.YOU_ACCOUNT;
import static org.selenide.exaples.constants.PrivateData.PASSWORD_FOR_AUTHORIZATION;
import static org.selenide.exaples.constants.PrivateData.PHONE_NUMBER_FOR_AUTHORIZATION;

public class AuthorizationTest extends BaseTest {

    @Test
    public void authorizationInAmazon() {
        openPage(HOST_AMAZON);
        $(mainPage.getPopUpSign()).hover();
        $(mainPage.getButtonAuthorization()).click();

        // Authorization
        $(signInPage.getInputNumberOrEmail()).setValue(PHONE_NUMBER_FOR_AUTHORIZATION);
        $(signInPage.getButtonContinue()).click();
        $(signInPage.getPassword()).setValue(PASSWORD_FOR_AUTHORIZATION);
        $(signInPage.getSignInSubmit()).click();

        // return on main page
        $(mainPage.getWelcomeText()).shouldHave(text(WELCOME_TEXT));
        $(mainPage.getWelcomeText()).click();

        // go to setting page
        $(settingPage.getLabel()).shouldHave(text(YOU_ACCOUNT));
        List<String> nameOption = $$(settingPage.getListSettingItems()).texts();

        List<String> expectedList = new ArrayList<>(Arrays.asList(
                "Archived orders\n" + "View and manage your archived orders",
                "Digital Services and Device Support\n" + "Troubleshoot device issues",
                "Gift cards\n" + "View balance, redeem, or reload cards",
                "Login & security\n" + "Edit login, name, and mobile number",
                "Prime\n" + "View benefits and payment settings",
                "Your Lists\n" + "View, modify, and share your lists, or create new ones",
                "Your Messages\n" + "View messages to and from Amazon, sellers, and buyers",
                "Your Orders\n" + "Track, return, or buy things again",
                "Your Payments\n" + "View all transactions, manage payment methods and settings",
                "Your Profiles\n" + "Manage, add, or remove user profiles for personalized experiences",
                "Customer Service"
        ));

        Collections.sort(nameOption);
        Collections.sort(expectedList);
        Assert.assertTrue(nameOption.equals(expectedList));
    }
}
