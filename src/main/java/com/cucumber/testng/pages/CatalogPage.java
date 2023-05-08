package com.cucumber.testng.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static java.time.Duration.ofSeconds;

public class CatalogPage extends BasePage {
    private final SelenideElement cartButton = $x("//div[contains(@class, 'product-aside__control product-aside__control_condensed-additional')]" +
            "/a[text()= 'В корзину']");

    @Step("Click on cart button")
    public void clickOnCartButton() {
        cartButton.shouldBe(visible, ofSeconds(10))
                .click();
    }
}
