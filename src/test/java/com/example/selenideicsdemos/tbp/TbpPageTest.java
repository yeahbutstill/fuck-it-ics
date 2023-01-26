package com.example.selenideicsdemos.tbp;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.selenideicsdemos.login.LoginIcsPage;
import io.qameta.allure.Feature;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class TbpPageTest {

    private final LoginIcsPage loginIcsPage = new LoginIcsPage();
    private final TbpPage tbpPage = new TbpPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1900x1900";
        SelenideLogger.addListener("allure", new AllureSelenide());
        Configuration.timeout = 9000;
    }

    @BeforeEach
    public void setUp() {
        open("https://ics.lps.go.id/#/login");
    }

    @Test
    @Feature("tbp")
    void masterIndikator() {
        loginIcsPage.loginIcs("admin.ics", "P@ssw0rd");
        sleep(10000L);
        tbpPage.masterIndikator();
        sleep(10000L);
    }

}
