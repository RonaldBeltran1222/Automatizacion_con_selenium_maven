package aserciones.validacionTexBox;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import userinterface.PracticeElementsUI;

import static utilities.constants.Constants.*;

public class ValidacionAddressElements {
    private WebDriver driver;
    private PracticeElementsUI practiceElementsUI;

    public ValidacionAddressElements(WebDriver driver ) {
        this.driver = driver;
        this.practiceElementsUI = new PracticeElementsUI(driver);
    }

    public void validacionAddressElements (){
        String text = practiceElementsUI.getDivTextBoxFormularioConfirmacion().getText();
        String address = System.getProperty(DIRECCIONADD);
        Assert.assertTrue(text.contains(address));
    }
}
