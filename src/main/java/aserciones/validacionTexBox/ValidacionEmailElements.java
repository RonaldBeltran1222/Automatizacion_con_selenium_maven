package aserciones.validacionTexBox;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import userinterface.PracticeElementsUI;

import static utilities.constants.Constants.EMAIL;

public class ValidacionEmailElements {
    private WebDriver driver;
    private PracticeElementsUI practiceElementsUI;

    public ValidacionEmailElements(WebDriver driver ) {
        this.driver = driver;
        this.practiceElementsUI = new PracticeElementsUI(driver);
    }

    public void validacionEmailElements (){
        String text = practiceElementsUI.getDivTextBoxFormularioConfirmacion().getText();
        String email = System.getProperty(EMAIL);
        Assert.assertTrue(text.contains(email));
    }
}
