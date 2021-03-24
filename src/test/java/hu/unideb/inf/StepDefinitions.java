package hu.unideb.inf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {

    @Given("The AutomationPractice site is open")
    public void theAutomationPracticeSiteIsOpen() {
    }

    @And("The Sign In link is clicked")
    public void theSignInLinkIsClicked() {
    }

    @When("The Sign In button is clicked")
    public void theSignInButtonIsClicked() {
    }

    @Then("An email address required error is shown")
    public void anEmailAddressRequiredErrorIsShown() {
    }

    @Given("The {string} is filled with {string}")
    public void theFieldIsFilledWithParameter(String field, String parameter) {

    }

    @Then("The {string} message is shown")
    public void theMsgMessageIsShown(String msg) {
    }
}
