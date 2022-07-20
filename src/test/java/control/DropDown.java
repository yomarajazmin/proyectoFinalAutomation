package control;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import session.Session;

public class DropDown extends Control{
    public DropDown(By locator) {
        super(locator);
    }

    public void selectOption(String value){
        findControl();
        Select select = new Select(Session.getInstance().getBrowser().findElement(getLocator()));
        select.selectByValue(value);
    }
}
