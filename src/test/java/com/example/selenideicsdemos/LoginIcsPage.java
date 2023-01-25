package com.example.selenideicsdemos;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class LoginIcsPage {

    public SelenideElement inputMatUsername = Selenide.$("input.mat-input-element");

    public SelenideElement buttonIndicatorBaseLanjutkan = Selenide.$("button.mat-focus-indicator");

    public SelenideElement inputMatPassword = Selenide.$("input.mat-input-element");

    public SelenideElement buttonSign = Selenide.$("button.mat-focus-indicator");

    void loginIcs(String textUsername, String textPassword) {
        inputMatUsername.sendKeys(textUsername);
        buttonIndicatorBaseLanjutkan.pressEnter();
        inputMatPassword.sendKeys(textPassword);
        buttonSign.pressEnter();
    }

}
