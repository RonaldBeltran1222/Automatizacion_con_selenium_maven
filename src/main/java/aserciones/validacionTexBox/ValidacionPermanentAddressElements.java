package aserciones.validacionTexBox;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import userinterface.PracticeElementsUI;

import static utilities.constants.Constants.DIRECCIONPERMANENTED;

public class ValidacionPermanentAddressElements {
    private WebDriver driver;
    private PracticeElementsUI practiceElementsUI;

    public ValidacionPermanentAddressElements(WebDriver driver ) {
        this.driver = driver;
        this.practiceElementsUI = new PracticeElementsUI(driver);
    }

    public void validacionPermanentAddressElements (){
        String text = practiceElementsUI.getDivTextBoxFormularioConfirmacion().getText();
        String perma = System.getProperty(DIRECCIONPERMANENTED);
        Assert.assertTrue(text.contains(perma));
    }
}
