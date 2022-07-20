package page;

import control.Button;
import control.CheckBox;
import control.DropDown;
import control.TextBox;
import org.openqa.selenium.By;

public class SettingsPage {
    public TextBox oldPasswordTxtBox = new TextBox(By.id("TextPwOld"));
    public TextBox newPasswordTxtBox = new TextBox(By.id("TextPwNew"));
    public Button okButton = new Button(By.xpath("//button[contains(.,'Ok')]"));
}
