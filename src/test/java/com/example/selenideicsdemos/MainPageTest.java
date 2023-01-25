package com.example.selenideicsdemos;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class MainPageTest {

    private final LoginIcsPage loginIcsPage = new LoginIcsPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
        Configuration.timeout = 6000;
    }

    @BeforeEach
    public void setUp() {
        open("https://ics.lps.go.id/#/login");
    }

    @Test
    void login() {
        loginIcsPage.loginIcs("admin.ics", "P@ssw0rd");
    }

}
