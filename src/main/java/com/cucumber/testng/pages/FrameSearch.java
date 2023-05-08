package com.cucumber.testng.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;
import static java.lang.String.format;
import static java.time.Duration.ofSeconds;

public class FrameSearch extends BasePage {
    private final SelenideElement frame = $x("//iframe[@class = 'modal-iframe']");
    public static final String TITLE_SEARCHED_ELEMENTS_PATTERN = "//div[contains(@class, 'product__title')]//a[contains(text(), '%s')]/parent::*";

    public FrameSearch transitionToFrame() {
        switchTo().frame(frame);
        return this;
    }

    public void clickOnTitleProductSearched(String product) {
        $x(format(TITLE_SEARCHED_ELEMENTS_PATTERN, product))
                .shouldBe(visible, ofSeconds(30)).click();
    }
}
