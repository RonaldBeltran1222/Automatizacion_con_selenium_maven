package aserciones.validacionTexBox;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import userinterface.PracticeElementsUI;

import static utilities.constants.Constants.NOMBRECOMPLETOVAL;


public class ValidacionFormTextBoxElements {
    private WebDriver driver;
    private PracticeElementsUI practiceElementsUI;

    public ValidacionFormTextBoxElements(WebDriver driver ) {
        this.driver = driver;
        this.practiceElementsUI = new PracticeElementsUI(driver);
    }

    public void validacionFormularioTextBox(){
        String text = practiceElementsUI.getDivTextBoxFormularioConfirmacion().getText();
        String name = System.getProperty(NOMBRECOMPLETOVAL);
        Assert.assertTrue(text.contains(name));
    }


}
