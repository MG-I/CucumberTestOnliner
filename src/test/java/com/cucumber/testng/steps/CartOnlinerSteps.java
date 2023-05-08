package com.cucumber.testng.steps;

import com.cucumber.testng.pages.CartPage;
import com.cucumber.testng.pages.CatalogPage;
import com.cucumber.testng.pages.FrameSearch;
import com.cucumber.testng.pages.Header;
import com.cucumber.testng.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class CartOnlinerSteps {
    private HomePage homePage = new HomePage();
    private Header header = new Header();
    private FrameSearch frameSearch = new FrameSearch();
    private CartPage cartPage = new CartPage();
    private CatalogPage catalogPage = new CatalogPage();

    @Given("the user opens Onliner website")
    public void userOpensOnlinerWebsite() {
        homePage.openOnlinerWebsite();
    }

    @When("the user clicks on the search field")
    public void userClicksOnTheSearchField() {
        header.clickOnSearchField();
    }

    @When("the user adds {string} on the search field")
    public void userAddsOnTheSearchField(String product) {
        header.addTextInSearch(product);
        frameSearch.transitionToFrame();
    }

    @When("the user clicks on the {string} in list")
    public void userClicksOnTheLinkProduct(String product) {
        frameSearch.clickOnTitleProductSearched(product);
    }

    @When("the user clicks Cart button")
    public void userClicksButton() {
        catalogPage.clickOnCartButton();
    }

    @When("the user clicks Cart icon on header page")
    public void theUserClicksOnHeaderPage() {
        header.clickOnCartIcon();
    }

    @Then("page Cart is opened")
    public void pageIsOpened() {
        assertThat(cartPage.getUrlForCurrentPage().contains("https://cart.onliner.by/"));
    }

    @And("page Cart contains product with {string}")
    public void pageContainsProductWith(String product) {
        cartPage.verifyTitleProduct(product);
    }
}
