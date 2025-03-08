package StepDefinition;

import BusinessLogic.EWayLoginScreen;
import Utillity.BrowserControl;
import Utillity.HelperFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class LoginUser {


    @Given("the user launches the E-Way Portal URL")
    public void theUserLaunchesTheEWayPortalURL() {
        BrowserControl.openBrowser();

    }

    @When("the user enters a valid username and password")
    public void theUserEntersAValidUsernameAndPassword() throws IOException {
        EWayLoginScreen.loginScreen();

    }

    @Then("the user should be redirected to the landing page")
    public void theUserShouldBeRedirectedToTheLandingPage() {
        EWayLoginScreen.landingPageVerify();

    }

}
