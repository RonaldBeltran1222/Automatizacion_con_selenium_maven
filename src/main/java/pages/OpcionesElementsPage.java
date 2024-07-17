package pages;

import org.openqa.selenium.WebDriver;
import userinterface.PracticeElementsUI;


public class OpcionesElementsPage {

    private WebDriver driver;
    private PracticeElementsUI practiceElementsUI;

    public OpcionesElementsPage(WebDriver driver) {
        this.driver = driver;
        this.practiceElementsUI = new PracticeElementsUI(driver);
    }

    public void opcionPage() {
        practiceElementsUI.getElementsClick().click();
    }

    public void  opcionPageTextBox(){
        practiceElementsUI.getElementsClick().click();
        practiceElementsUI.getElementsTextBox().click();

    }
}
