package page;

import control.Button;
import control.CheckBox;
import control.DropDown;
import control.TextBox;
import org.openqa.selenium.By;

public class SignUpPage {
    public TextBox fullNameTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox emailTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox passwordTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public DropDown timezoneDropDown = new DropDown(By.id("ctl00_MainContent_SignupControl1_DropDownTimezone"));
    public CheckBox termsConditionsCheckBox = new CheckBox(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    public Button signUpButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));
}
