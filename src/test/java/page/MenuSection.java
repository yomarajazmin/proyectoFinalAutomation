package page;


import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MenuSection {
    public Button logoutButton = new Button(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));
    public Button settingsButton = new Button(By.xpath("//a[contains(.,'Settings')]"));
    public Label workLabel = new Label(By.id("CurrentProjectTitle"));
}
