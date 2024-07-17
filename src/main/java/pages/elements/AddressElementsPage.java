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

import static utilities.constants.Constants.*;
import static utilities.enums.EnumsElements.DIRECCION;
import static utilities.enums.EnumsElements.NOMBRECOMPLETO;

public class AddressElementsPage {
    private WebDriver driver;
    private Map<String,String> info;
    private PracticeElementsUI practiceElementsUI;

    public AddressElementsPage(WebDriver driver) {
        this.driver = driver;
        this.practiceElementsUI = new PracticeElementsUI(driver);
    }

    public void AddressElements (Map<String,String> info){

        WebElement address = driver.findElement(By.id(DIRECCION.getXpath()));
        address.click();
        driver.findElement(By.id(DIRECCION.getXpath())).sendKeys(info.get(DIRECCION.getValue()));
        // Desplazarse al elemento y realizar swipe usando Actions
        ((JavascriptExecutor) driver).executeScript(ARGUMENTOSCROLL, address);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(address));
        Actions action = new Actions(driver);
        action.dragAndDropBy(address, 200, 0).build().perform();

        practiceElementsUI.getSubmit().click();
        WebElement element = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        //Extraer el texto
        String text = element.getText();
        String addressValue = text.split(":")[1].trim();// Extrae el valor después de "Name:" y elimina espacios en blanco
        System.setProperty(DIRECCIONADD, addressValue);
    }
}
