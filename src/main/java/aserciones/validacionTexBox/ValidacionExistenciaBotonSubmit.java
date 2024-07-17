package aserciones.validacionTexBox;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import userinterface.PracticeElementsUI;

public class ValidacionExistenciaBotonSubmit {
    private WebDriver driver;
    private PracticeElementsUI practiceElementsUI;

    public ValidacionExistenciaBotonSubmit(WebDriver driver ) {
        this.driver = driver;
        this.practiceElementsUI = new PracticeElementsUI(driver);
    }

    public void ValidacionExistenciaBotonSubmit(){
        Assert.assertTrue(practiceElementsUI.getSubmit().isDisplayed());
    }
}
