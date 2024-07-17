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
import static utilities.constants.Constants.DIRECCIONPERMANENTED;
import static utilities.enums.EnumsElements.DIRECCIONPERMANETE;

public class PermanentAddressPage {
    private WebDriver driver;
    private Map<String,String> info;
    private PracticeElementsUI practiceElementsUI;

    public PermanentAddressPage(WebDriver driver) {
        this.driver = driver;
        this.practiceElementsUI = new PracticeElementsUI(driver);
    }

    public void PermanentAddressElements (Map<String,String> info){

        WebElement pAddress = driver.findElement(By.id(DIRECCIONPERMANETE.getXpath()));
        pAddress.click();
        driver.findElement(By.id(DIRECCIONPERMANETE.getXpath())).sendKeys(info.get(DIRECCIONPERMANETE.getValue()));
        // Desplazarse al elemento y realizar swipe usando Actions
        ((JavascriptExecutor) driver).executeScript(ARGUMENTOSCROLL, pAddress);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(pAddress));
        Actions action = new Actions(driver);
        action.dragAndDropBy(pAddress, 200, 0).build().perform();

        practiceElementsUI.getSubmit().click();
        WebElement element = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        //Extraer el texto
        String text = element.getText();
        String direccionpValue = text.split(":")[1].trim();// Extrae el valor después de "Name:" y elimina espacios en blanco
        System.setProperty(DIRECCIONPERMANENTED, direccionpValue);
    }
}
