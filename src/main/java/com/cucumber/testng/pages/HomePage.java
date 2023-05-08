package com.cucumber.testng.pages;


import static com.codeborne.selenide.Selenide.open;

public class HomePage extends BasePage {
    private static final String HOME_URL = "https://www.onliner.by/";

    public void openOnlinerWebsite() {
        open(HOME_URL);
    }
}
