package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class VisuaizarFormularioPage {
    private WebDriver driver;

    public VisuaizarFormularioPage(WebDriver driver) {
        this.driver = driver;
    }

    public void visualizarFormulario() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
        Assert.assertTrue(firstName.isDisplayed());
//        otra forma de hacerlo
        Assert.assertTrue(driver.findElement(By.id("lastName")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("genterWrapper")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("userNumber")).isDisplayed());

        //    WebElement element = driver.findElement(By.id("someElementId"));
//    Assert.assertTrue(element.isDisplayed());
    }
}
