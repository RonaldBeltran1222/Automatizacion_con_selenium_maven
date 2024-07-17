package pages.elements;

import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import userinterface.PracticeElementsUI;
import userinterface.PracticeFormsUI;

import java.time.Duration;
import java.util.Map;

import static utilities.constants.Constants.ARGUMENTOSCROLL;
import static utilities.constants.Constants.NOMBRECOMPLETOVAL;
import static utilities.enums.EnumsElements.*;

@AllArgsConstructor
public class TextBoxElementsPage {

    private WebDriver driver;
    private Map<String,String> info;
    private PracticeElementsUI practiceElementsUI;

    public TextBoxElementsPage(WebDriver driver) {
        this.driver = driver;
        this.practiceElementsUI = new PracticeElementsUI(driver);
    }

    public void llenarFormularioPage(Map<String, String> info) throws InterruptedException {
        Thread.sleep(5000);

        practiceElementsUI.getId(NOMBRECOMPLETO.getXpath()).click();
        practiceElementsUI.getId(NOMBRECOMPLETO.getXpath()).sendKeys(info.get(NOMBRECOMPLETO.getValue()));

        practiceElementsUI.getId(CORREO.getXpath()).click();
        practiceElementsUI.getId(CORREO.getXpath()).sendKeys(info.get(CORREO.getValue()));

        practiceElementsUI.getId(DIRECCION.getXpath()).click();
        practiceElementsUI.getId(DIRECCION.getXpath()).sendKeys(info.get(DIRECCION.getValue()));

        practiceElementsUI.getId(DIRECCIONPERMANETE.getXpath()).click();
        practiceElementsUI.getId(DIRECCIONPERMANETE.getXpath()).sendKeys(info.get(DIRECCIONPERMANETE.getValue()));

        practiceElementsUI.getSubmit().click();
    }

    public void llenarFormularioValidar(Map<String,String> info) throws InterruptedException {

            Thread.sleep(5000);

            practiceElementsUI.getId(NOMBRECOMPLETO.getXpath()).click();
            practiceElementsUI.getId(NOMBRECOMPLETO.getXpath()).sendKeys(info.get(NOMBRECOMPLETO.getValue()));

            practiceElementsUI.getId(CORREO.getXpath()).click();
            practiceElementsUI.getId(CORREO.getXpath()).sendKeys(info.get(CORREO.getValue()));

            WebElement direccion = driver.findElement(By.id(DIRECCION.getXpath()));
            direccion.click();
            driver.findElement(By.id(DIRECCION.getXpath())).sendKeys(info.get(DIRECCION.getValue()));
            // Desplazarse al elemento y realizar swipe usando Actions
            ((JavascriptExecutor) driver).executeScript(ARGUMENTOSCROLL, direccion);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
            wait.until(ExpectedConditions.elementToBeClickable(direccion));
            Actions action = new Actions(driver);
            action.dragAndDropBy(direccion, 200, 0).build().perform();

            practiceElementsUI.getId(DIRECCIONPERMANETE.getXpath()).click();
            practiceElementsUI.getId(DIRECCIONPERMANETE.getXpath()).sendKeys(info.get(DIRECCIONPERMANETE.getValue()));

            practiceElementsUI.getSubmit().click();

            WebElement element = driver.findElement(By.xpath("//p[@id='name']"));
            //Extraer el texto
            String text = element.getText();
            String nameValue = text.split(":")[1].trim();// Extrae el valor después de "Name:" y elimina espacios en blanco
            System.setProperty(NOMBRECOMPLETOVAL, nameValue);
        }
}

