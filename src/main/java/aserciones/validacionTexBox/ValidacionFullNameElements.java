package aserciones.validacionTexBox;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import userinterface.PracticeElementsUI;

import static utilities.constants.Constants.NOMBRECOMPLETOVAL;

public class ValidacionFullNameElements {
    private WebDriver driver;
    private PracticeElementsUI practiceElementsUI;

    public ValidacionFullNameElements(WebDriver driver ) {
        this.driver = driver;
        this.practiceElementsUI = new PracticeElementsUI(driver);
    }

    public void validacionFullNameElements (){
        String text = practiceElementsUI.getDivTextBoxFormularioConfirmacion().getText();
        String name = System.getProperty(NOMBRECOMPLETOVAL);
        Assert.assertTrue(text.contains(name));
    }
}
