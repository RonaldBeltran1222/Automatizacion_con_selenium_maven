package pages;

import org.openqa.selenium.WebDriver;

import static utilities.constants.Constants.PAGINASQA;

public class AbrirNavegadorPage {

    private WebDriver driver;

    public AbrirNavegadorPage() {
        this.driver = WebDriverSingleton.getDriver();
    }

    public void abrirNavegadorChrome() {
        driver.get(PAGINASQA);
        driver.manage().window().maximize();
    }
}
