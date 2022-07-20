package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.MainPage;
import page.MenuSection;
import page.SignUpPage;
import session.Session;

public class AccountSteps {
    MainPage mainPage = new MainPage();
    SignUpPage signUpPage = new SignUpPage();
    MenuSection menuSection = new MenuSection();

    @Given("the page {string} is open")
    public void thePageIsOpen(String url) {
        Session.getInstance().getBrowser().get(url);
    }

    @When("I click on (Sign Up Free)")
    public void iClickOnSignUpFree() {
        mainPage.signUpButton.click();
    }

    @Then("^I fill the (name|email|password|timezone): (.*)$")
    public void iFillTheData(String option, String value) {
        switch (option){
            case "name":
                signUpPage.fullNameTxtBox.writeText(value);
                break;
            case "email":
                if (value.equals("random"))
                    signUpPage.emailTxtBox.writeText("testEmail"+System.currentTimeMillis()+"@test.com");
                else
                    signUpPage.emailTxtBox.writeText(value);
                break;
            case "password":
                signUpPage.passwordTxtBox.writeText(value);
                break;
            case "timezone":
                signUpPage.timezoneDropDown.selectOption(value);
                break;
        }
    }

    @And("I click on the terms&service checkbox")
    public void iClickOnTheTermsServiceCheckbox() {
        if (!signUpPage.termsConditionsCheckBox.isSelected())
            signUpPage.termsConditionsCheckBox.click();
    }

    @And("I click on Signup")
    public void iClickOnSignup() {
        signUpPage.signUpButton.click();
    }

    @And("^I am able to see the (.*) label$")
    public void iAmAbleToSeeTheWorkLabel(String value) {
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed() && menuSection.workLabel.isControlDisplayed(),
                "Error while registering the user");
    }
}
