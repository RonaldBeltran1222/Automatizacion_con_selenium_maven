package aserciones;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import userinterface.PracticeFormsUI;

import java.time.Duration;
import java.util.Map;

import static utilities.constants.Constants.GENEROINGRESADO;
import static utilities.constants.Constants.HOBBIEINGRESADO;
import static utilities.constants.ConstantsError.GENERO_ERROR;
import static utilities.constants.ConstantsError.HOBBIE_ERROR;


public class Validaciones {
    private WebDriver driver;
    private  Map<String,String> info;
    private PracticeFormsUI practiceFormsUI;

    public Validaciones(WebDriver driver ) {
        this.driver = driver;
        this.practiceFormsUI = new PracticeFormsUI(driver);
    }

    public void validacionTitulo(){
        String strng = practiceFormsUI.getPRACTICE_FORM_TITULO().getText();
        Assert.assertEquals("Practice Form", strng);
    }

    public void validacionSubmit(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Assert.assertTrue(practiceFormsUI.getMODAL_SUBMIT_TABLE().isDisplayed());
    }

    public void validarGeneroCheckBox() {

        String labelText = practiceFormsUI.getGENERO_CHECKBOX().getText();
        String generoIngresado = System.getProperty(GENEROINGRESADO);
        Assert.assertEquals(generoIngresado, labelText, GENERO_ERROR);
    }

    public void validacionHobbiesCheckBox() {

        String labelText = practiceFormsUI.getHOBBIES_CHECKBOX().getText();
        String hobbieIngresado = System.getProperty(HOBBIEINGRESADO);
        Assert.assertEquals(hobbieIngresado, labelText, HOBBIE_ERROR);
    }


}
