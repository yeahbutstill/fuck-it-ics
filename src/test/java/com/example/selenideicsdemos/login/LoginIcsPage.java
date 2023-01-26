package com.example.selenideicsdemos.login;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginIcsPage {

    public SelenideElement inputMatUsername = $("input.mat-input-element");
    public SelenideElement buttonIndicatorBaseLanjutkan = $("button.mat-focus-indicator");
    public SelenideElement inputMatPassword = $("input.mat-input-element");
    public SelenideElement spanSign = $("button[class*='mat-primary'] span[class='mat-button-wrapper']");

    public void loginIcs(String textUsername, String textPassword) {
        if (!textUsername.isEmpty() && !textPassword.isEmpty()) {
            inputMatUsername.sendKeys(textUsername);
            buttonIndicatorBaseLanjutkan.click();
            inputMatPassword.sendKeys(textPassword);
            spanSign.click();

        } else if (textUsername.isEmpty() && textUsername.isBlank() && textPassword.isEmpty() && textPassword.isBlank()){
            buttonIndicatorBaseLanjutkan.pressEnter();
        }

    }

}
