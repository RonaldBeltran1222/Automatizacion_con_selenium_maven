package aserciones.validacionCheckTextElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import userinterface.PracticeElementsUI;

import java.time.Duration;

public class Validacion {
    private WebDriver driver;
    private PracticeElementsUI practiceElementsUI;

    public Validacion(WebDriver driver ) {
        this.driver = driver;
        this.practiceElementsUI = new PracticeElementsUI(driver);
    }

    public void validacionCheckTexElements(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Assert.assertTrue(practiceElementsUI.getCheckText().isDisplayed());
    }
}
