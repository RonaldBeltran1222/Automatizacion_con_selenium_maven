package aserciones;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import userinterface.PracticeElementsUI;

public class ValidacionElementsTextBox {
    private WebDriver driver;
    private PracticeElementsUI practiceElementsUI;

    public ValidacionElementsTextBox(WebDriver driver ) {
        this.driver = driver;
        this.practiceElementsUI = new PracticeElementsUI(driver);
    }

    //Validacion TEX BOX
    public void validacionTextBox () throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(practiceElementsUI.getidFullName().isDisplayed());
        Assert.assertTrue(practiceElementsUI.getSubmit().isDisplayed());
    }
}
