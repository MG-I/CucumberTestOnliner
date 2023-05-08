package com.cucumber.testng.pages;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;
import static java.time.Duration.ofSeconds;

public class CartPage extends BasePage {
    public static final String TITLE_PRODUCTS = "//div[contains(@class, 'cart-form__description cart-form__description_primary')]//a[contains(text(), '%s')]";

    @Step("Open window check")
    public String getUrlForCurrentPage() {
        return WebDriverRunner.url();
    }

    @Step("Verify product")
    public void verifyTitleProduct(String product) {
        $x(format(TITLE_PRODUCTS, product))
                .shouldBe(visible, ofSeconds(30)).click();
    }
}
