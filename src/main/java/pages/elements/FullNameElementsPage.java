package pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import userinterface.PracticeElementsUI;

import java.time.Duration;
import java.util.Map;

import static utilities.constants.Constants.ARGUMENTOSCROLL;
import static utilities.constants.Constants.NOMBRECOMPLETOVAL;
import static utilities.enums.EnumsElements.DIRECCION;
import static utilities.enums.EnumsElements.NOMBRECOMPLETO;

public class FullNameElementsPage {
    private WebDriver driver;
    private Map<String,String> info;
    private PracticeElementsUI practiceElementsUI;

    public FullNameElementsPage(WebDriver driver) {
        this.driver = driver;
        this.practiceElementsUI = new PracticeElementsUI(driver);
    }

    public void FullNameElements (Map<String,String> info){

        WebElement nombre = driver.findElement(By.id(NOMBRECOMPLETO.getXpath()));
        nombre.click();
        driver.findElement(By.id(NOMBRECOMPLETO.getXpath())).sendKeys(info.get(NOMBRECOMPLETO.getValue()));
        // Desplazarse al elemento y realizar swipe usando Actions
        ((JavascriptExecutor) driver).executeScript(ARGUMENTOSCROLL, nombre);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(nombre));
        Actions action = new Actions(driver);
        action.dragAndDropBy(nombre, 200, 0).build().perform();

        practiceElementsUI.getSubmit().click();
        WebElement element = driver.findElement(By.xpath("//p[@id='name']"));
        //Extraer el texto
        String text = element.getText();
        String nameValue = text.split(":")[1].trim();// Extrae el valor después de "Name:" y elimina espacios en blanco
        System.setProperty(NOMBRECOMPLETOVAL, nameValue);
    }

}
