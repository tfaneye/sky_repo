package com.sky.step_def;

import com.sky.page_objects.DealPage;
import com.sky.page_objects.HomePage;
import com.sky.page_objects.SignInPage;
import com.sky.support.WorldHelper;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class TestSteps {

    private final WorldHelper helper;
    private HomePage homePage;
    private DealPage dealPage;
    private SignInPage signInPage;

    public TestSteps(WorldHelper helper){
        this.helper = helper;
    }

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        homePage = helper.getBasePage().loadHomePage();

    }

    @When("I navigate to Deals page")
    public void iNavigateToDealsPage() {
        dealPage = homePage.navigateToDealPage();

    }

    @Then("^the user should be on the deal page$")
    public void theUserShouldBeOnTheDealPage(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        String expected = data.get(1).get(0);

        String actual = dealPage.validatePage();

        Assert.assertEquals(expected, actual);
    }

    //Scenario 2 Steps
    @When("^I try to sign in with invalid credentials \"([^\"]*)\", \"([^\"]*)\"$")
    public void iTryToSignInWithInvalidCredentialsSomethingSomething(String username, String password) throws Throwable {
        signInPage = homePage
                .goToSignInPage()
                .enterSignInDetails(username, password);
    }

    @Then("^I should see a text saying the error message$")
    public void iShouldSeeATextSayingTheErrorMessage(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        String expected = data.get(1).get(0);

        String actual = signInPage.validateSignIn();

        Assert.assertEquals(expected, actual);
    }

    //Scenario 3 Step
    @Then("^I see a list of deals with a price to it$")
    public void iSeeAListOfDealsWithAPriceToIt(DataTable table) throws Throwable {

        List<List<String>> data = table.raw();
        String dealOnePrice = data.get(1).get(0);
        String dealTwoPrice = data.get(1).get(1);
        String dealThreePrice = data.get(1).get(2);

        Map<String, String> dealPrice =  dealPage.getDealsPrice();

        if(dealPrice.get("PriceOne").contains(dealOnePrice) && dealPrice.get("PriceTwo").contains(dealTwoPrice) && dealPrice.get("PriceThree").contains(dealThreePrice)){
            Assert.assertTrue(true);
        }else{
            Assert.assertFalse(false);
        }
    }

    //Scenario 4, Editorial Search
    @When("^I search \"([^\"]*)\" in the search bar$")
    public void iSearchSomethingInTheSearchBar(String item) throws Throwable {
        homePage = homePage.searchForItem(item);

    }

    @Then("^I should see an editorial section with below title$")
    public void iShouldSeeAnEditorialSection(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        String expectedTitle = data.get(1).get(0);
        Assert.assertEquals(expectedTitle, homePage.validateSearch());

    }


}
