package aserciones;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import userinterface.PracticeElementsUI;

import java.time.Duration;

public class ValidacionElements {
    private WebDriver driver;
    private PracticeElementsUI practiceElementsUI;

    public ValidacionElements(WebDriver driver ) {
        this.driver = driver;
        this.practiceElementsUI = new PracticeElementsUI(driver);
    }

    //Automatizacion de la opcion Elements
    public  void validacionClickElements (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Assert.assertTrue(practiceElementsUI.getElementsDivElements().isDisplayed());
    }

}
