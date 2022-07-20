package runner;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.*;
import session.Session;

public class SettingSteps {
    MainPage mainPage = new MainPage();
    SignUpPage signUpPage = new SignUpPage();
    MenuSection menuSection = new MenuSection();
    SettingsPage settingsPage = new SettingsPage();
    LoginModal loginModal = new LoginModal();
    Registro userData = new Registro();

    @When("I create a new user")
    public void iCreateANewUser() {
        String user = "testUser"+System.currentTimeMillis();
        mainPage.signUpButton.click();
        signUpPage.fullNameTxtBox.writeText(user);
        signUpPage.emailTxtBox.writeText(user+"@test.com");
        signUpPage.passwordTxtBox.writeText("test123");
        signUpPage.timezoneDropDown.selectOption("Atlantic Standard Time");
        signUpPage.termsConditionsCheckBox.click();
        signUpPage.signUpButton.click();
        userData.setName(user).setEmail(user+"@test.com").setPassword("test123");
    }

    @Then("I go to Settings")
    public void iGoToSettings() {
        menuSection.settingsButton.click();
    }

    @And("I fill the new password: {word}")
    public void iFillTheNewPassword(String newPass) {
        settingsPage.oldPasswordTxtBox.writeText(userData.getPassword());
        settingsPage.newPasswordTxtBox.writeText(newPass);
        userData.setPassword(newPass);
    }

    @And("I click on OK button")
    public void iClickOnOKButton() {
        settingsPage.okButton.click();
    }

    @And("I logout")
    public void iLogout() {
        menuSection.logoutButton.click();
    }

    @And("I login with the new credentials")
    public void iLoginWithTheNewCredentials() {
        mainPage.loginButton.click();
        loginModal.emailTxtBox.writeText(userData.getEmail());
        loginModal.pwdTxtBox.writeText(userData.getPassword());
        loginModal.loginButton.click();
    }
}
