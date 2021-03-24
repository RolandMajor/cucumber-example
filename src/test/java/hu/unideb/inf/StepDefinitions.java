package hu.unideb.inf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class StepDefinitions {

    private static final int WAIT_TIME = 10;

    private static HomePage homePage;

    private static WebDriver driver;

    static {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
    }

    @Given("The AutomationPractice site is open")
    public void theAutomationPracticeSiteIsOpen() {
        homePage = new HomePage(driver);
    }

    @And("The Sign In link is clicked")
    public void theSignInLinkIsClicked() {
        homePage.clickOnSignInLink();
    }

    @When("The Sign In button is clicked")
    public void theSignInButtonIsClicked() {
        homePage.clickOnSignInButton();
    }

    @Given("The {string} is filled with {string}")
    public void theFieldIsFilledWithParameter(String field, String parameter) {
        homePage.fillField(field, parameter);
    }

    @Then("The {string} message is shown")
    public void theMsgMessageIsShown(String msg) {
    }
}
