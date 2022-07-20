package control;

import org.openqa.selenium.By;

public class CheckBox extends Control{
    public CheckBox(By locator) {
        super(locator);
    }

    public boolean isSelected(){
        findControl();
        return control.isSelected();
    }
}
