package com.example.selenideicsdemos.login;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Feature;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginPageTest {

    private final LoginIcsPage loginIcsPage = new LoginIcsPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
        Configuration.timeout = 8000;

        // Selenoid
//        Configuration.remote = "http://localhost:4444/wd/hub";
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("enableVNC", true);
//        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    public void setUp() {
        open("https://ics.lps.go.id/#/login");
    }

    @Test
    @Feature("login")
    void loginSuccess() {
        loginIcsPage.loginIcs("admin.ics", "P@ssw0rd");
    }

    @Test
    @Feature("login")
    void loginFailed() {
        loginIcsPage.loginIcs("", "");
    }

}
