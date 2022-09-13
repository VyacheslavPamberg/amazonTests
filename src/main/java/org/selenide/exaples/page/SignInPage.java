package org.selenide.exaples.page;

import org.openqa.selenium.By;

public class SignInPage {

    public SignInPage() {
    }

    By inputNumberOrEmail = By.name("email");
    By password = By.id("ap_password");

    By buttonContinue = By.id("continue");

    By signInSubmit = By.id("signInSubmit");

    public By getInputNumberOrEmail() {
        return inputNumberOrEmail;
    }

    public By getPassword() {
        return password;
    }

    public By getButtonContinue(){
        return buttonContinue;
    }

    public By getSignInSubmit() {
        return signInSubmit;
    }
}
