package aserciones;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import userinterface.PracticeElementsUI;

public class ValidacionElementsTituloTexBox {
    private WebDriver driver;
    private PracticeElementsUI practiceElementsUI;

    public ValidacionElementsTituloTexBox(WebDriver driver ) {
        this.driver = driver;
        this.practiceElementsUI = new PracticeElementsUI(driver);
    }

    public void ValdarTiutloTextBox () throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(practiceElementsUI.getTiutloTextBox().isDisplayed());
    }

}
