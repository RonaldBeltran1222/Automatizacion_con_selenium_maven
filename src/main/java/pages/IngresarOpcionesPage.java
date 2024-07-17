package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import userinterface.PracticeFormsUI;

public class IngresarOpcionesPage {
    private WebDriver driver;
    private PracticeFormsUI practiceFormsUI;

    public IngresarOpcionesPage(WebDriver driver) {
        this.driver = driver;
        this.practiceFormsUI = new PracticeFormsUI(driver);
    }

    public void opcionPage() {
        practiceFormsUI.getOpcionPageForms().click();
        practiceFormsUI.getOpcionPagePracticForms().click();

    }
}




