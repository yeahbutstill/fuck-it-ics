package com.example.selenideicsdemos.tbp;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TbpPage {

    public SelenideElement spanSurveilans = $x("//span[@class='mat-tooltip-trigger item-label ng-tns-c75-11']");
    public SelenideElement spanBungaPenjaminan = $x("//span[@class='mat-tooltip-trigger item-label ng-tns-c75-142']");
    public SelenideElement spanMasterIndikator = $x("//span[@class='mat-tooltip-trigger item-label ng-tns-c75-150']");
    
    void masterIndikator() {
        spanSurveilans.click();
        spanBungaPenjaminan.click();
        spanMasterIndikator.click();
    }

}
