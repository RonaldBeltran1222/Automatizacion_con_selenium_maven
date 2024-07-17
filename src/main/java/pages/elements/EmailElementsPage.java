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
import static utilities.enums.EnumsElements.CORREO;

public class EmailElementsPage {
    private WebDriver driver;
    private Map<String,String> info;
    private PracticeElementsUI practiceElementsUI;

    public EmailElementsPage(WebDriver driver) {
        this.driver = driver;
        this.practiceElementsUI = new PracticeElementsUI(driver);
    }

    public void EmailElements(Map<String, String> info){

        WebElement email = driver.findElement(By.id(CORREO.getXpath()));
        email.click();
        driver.findElement(By.id(CORREO.getXpath())).sendKeys(info.get(CORREO.getValue()));
        // Desplazarse al elemento y realizar swipe usando Actions
        ((JavascriptExecutor) driver).executeScript(ARGUMENTOSCROLL, email);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(email));
        Actions action = new Actions(driver);
        action.dragAndDropBy(email, 200, 0).build().perform();

        practiceElementsUI.getSubmit().click();

        WebElement element = driver.findElement(By.xpath("//p[@id='email']"));
        //Extraer el texto
        String text = element.getText();
        String emailvalue = text.split(":")[1].trim();// Extrae el valor después de "Name:" y elimina espacios en blanco
        System.setProperty(EMAIL, emailvalue);
//        System.out.println(emailvalue);
    }
}
