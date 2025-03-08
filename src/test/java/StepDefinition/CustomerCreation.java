package StepDefinition;

import BusinessLogic.EWayLoginScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerCreation {




    @And("the user clicks {string} in the left-side menu")
    public void theUserClicksInTheLeftSideMenu(String customer) {
        EWayLoginScreen.verifyCustomer(customer);
    }

    @And("the user clicks the {string} button")
    public void theUserClicksTheButton(String arg0) {
        EWayLoginScreen.customerOnboardcreate();
    }

    @And("the Customer Onboarding page should open")
    public void theCustomerOnboardingPageShouldOpen() {
    }

    @And("the user enters customer information {string}, {string}, {string}, {string}, {string}")
    public void theUserEntersCustomerInformation(String isGst, String leagalName, String tradeName, String gstNo, String panNo) {

EWayLoginScreen.addCutomInfo(isGst,leagalName,tradeName,gstNo,panNo);
    }
    @And("the user click {string} button")
    public void theUserClickButton(String next) {
        EWayLoginScreen.next(next);
    }
    @And("the user provides the customer address {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void theUserProvidesTheCustomerAddress(String name, String addL1, String addL2, String country, String state, String city, String pincode) {
    EWayLoginScreen.addcustomerAddress(name,addL1,addL2,country,state,city,pincode);
    }

    @And("the user adds the address information")
    public void theUserAddsTheAddressInformation() {
    }

    @And("the user fills in the contact details {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void theUserFillsInTheContactDetails(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
    }

    @And("the user saves the customer information")
    public void theUserSavesTheCustomerInformation() {
    }

    @Then("the user verifies the created information in the customer dashboard")
    public void theUserVerifiesTheCreatedInformationInTheCustomerDashboard() {
    }


}
