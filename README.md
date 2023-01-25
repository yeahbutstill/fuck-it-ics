```java
//REFACTOR THIS - MainPageTest
loginIcsPage.inputMatUsername.sendKeys("admin.ics");
loginIcsPage.buttonIndicatorBaseLanjutkan.pressEnter();
loginIcsPage.inputMatPassword.sendKeys("P@ssw0rd");
loginIcsPage.buttonSign.pressEnter();
```

```java
//OLD - MainPageTest
Selenide.open("https://ics.lps.go.id/#/login");
$("input.mat-input-element").sendKeys("admin.ics");
$("input.mat-input-element").pressEnter();
$("input.mat-input-element").sendKeys("P@ssw0rd");
$("input.mat-input-element").pressEnter();
$(Selectors.withText("P@ssw0rd")).shouldBe(Condition.visible);
```# fuck-it-ics
