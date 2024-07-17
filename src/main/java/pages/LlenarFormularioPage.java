package pages;

import lombok.AllArgsConstructor;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import userinterface.PracticeFormsUI;
import utilities.enums.EnumsFormulario;

import java.time.Duration;
import java.util.Map;

import static utilities.constants.Constants.*;
import static utilities.enums.EnumsFormulario.*;


@AllArgsConstructor
public class LlenarFormularioPage {

    private WebDriver driver;
    private  Map<String,String> info;
    private PracticeFormsUI practiceFormsUI;

    public LlenarFormularioPage(WebDriver driver) {
        this.driver = driver;
        this.practiceFormsUI = new PracticeFormsUI(driver);
    }

    public void llenarFormulario(Map<String, String> info) throws InterruptedException {
        Thread.sleep(5000);

        practiceFormsUI.getId(NAME.getXpath()).click();
        practiceFormsUI.getId(NAME.getXpath()).sendKeys(info.get(NAME.getValue()));

        practiceFormsUI.getId(LASTNAME.getXpath()).click();
        practiceFormsUI.getId(LASTNAME.getXpath()).sendKeys(info.get(LASTNAME.getValue()));

        practiceFormsUI.getId(CORREO.getXpath()).click();
        practiceFormsUI.getId(CORREO.getXpath()).sendKeys(info.get(CORREO.getValue()));

        String genero = info.get(EnumsFormulario.GENERO.getValue());;
        practiceFormsUI.getCheck(genero).click();
        System.setProperty(GENEROINGRESADO, genero);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//      se separa el id del elemento en una varibale de tipo WebElement para poder usarla en el action
        WebElement telefonoElement = driver.findElement(By.id(TELEFONO.getXpath()));
        telefonoElement.click();
        driver.findElement(By.id(TELEFONO.getXpath())).sendKeys(info.get(TELEFONO.getValue()));

        // Desplazarse al elemento y realizar swipe usando Actions
        ((JavascriptExecutor) driver).executeScript(ARGUMENTOSCROLL, telefonoElement);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(telefonoElement));
        Actions action = new Actions(driver);
        action.dragAndDropBy(telefonoElement, 200, 0).build().perform();
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        practiceFormsUI.getId(ASIGNATURAS.getXpath()).click();
        String asignatura = info.get(EnumsFormulario.ASIGNATURAS.getValue());
        practiceFormsUI.getId(ASIGNATURAS.getXpath()).sendKeys(asignatura);
        practiceFormsUI.getId(ASIGNATURAS.getXpath()).sendKeys(Keys.ENTER);
        System.setProperty(ASIGNATURAINGRESADA, asignatura);

        String hobbie = info.get(EnumsFormulario.HOBBIES.getValue());
        practiceFormsUI.getCheck(hobbie).click();
        System.setProperty(HOBBIEINGRESADO, hobbie);

        practiceFormsUI.getId(DIRECCION.getXpath()).click();
        practiceFormsUI.getId(DIRECCION.getXpath()).sendKeys(info.get(DIRECCION.getValue()));

        practiceFormsUI.getESTADO_INPUT().click();
        practiceFormsUI.getId(ESTADO.getXpath()).sendKeys(info.get(ESTADO.getValue()));
        practiceFormsUI.getId(ESTADO.getXpath()).sendKeys(Keys.ENTER);

        practiceFormsUI.getCIUDAD_INPUT().click();
        practiceFormsUI.getId(CIUDAD.getXpath()).sendKeys(info.get(CIUDAD.getValue()));
        practiceFormsUI.getId(CIUDAD.getXpath()).sendKeys(Keys.ENTER);

        practiceFormsUI.getSUBMIT_BOTON().click();
        Thread.sleep(6000);

    }

    public void cerraFormulario(){
        practiceFormsUI.getClose_Boton().click();;
    }

}
