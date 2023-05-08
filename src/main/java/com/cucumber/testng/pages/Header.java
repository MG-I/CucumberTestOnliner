package com.cucumber.testng.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static java.time.Duration.ofSeconds;

public class Header extends BasePage {
    private final SelenideElement fastSearch = $x("//div[@id='fast-search']//input[contains(@class, 'fast-search__input')]");
    private final SelenideElement cartIcon = $x("//div[contains(@class, 'auth-bar auth-bar--top')]//a[@title ='Корзина']");

    @Step("Click on search field")
    public Header clickOnSearchField() {
        fastSearch.shouldBe(visible, ofSeconds(10))
                .click();
        return this;
    }

    @Step("Add {text} in search field")
    public FrameSearch addTextInSearch(String text) {
        fastSearch.clear();
        fastSearch.sendKeys(text);
        return new FrameSearch();
    }

    @Step("Click on cart icon")
    public void clickOnCartIcon() {
        cartIcon.shouldBe(visible, ofSeconds(30))
                .click();
    }
}
