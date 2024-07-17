package pages.elements.check_box_elements;

import org.openqa.selenium.WebDriver;
import userinterface.PracticeElementsUI;

import java.util.Map;

public class CheckBoxElementsPage {
    private WebDriver driver;
    private Map<String,String> info;
    private PracticeElementsUI practiceElementsUI;

    public CheckBoxElementsPage(WebDriver driver) {
        this.driver = driver;
        this.practiceElementsUI = new PracticeElementsUI(driver);
    }

    public void checkBoxElements(){
        practiceElementsUI.getCheckText().click();
    }
}
