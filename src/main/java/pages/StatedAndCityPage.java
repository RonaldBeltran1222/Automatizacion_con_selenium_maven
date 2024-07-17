package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class StatedAndCityPage {

    private WebDriver driver;

    public StatedAndCityPage(WebDriver driver) {
        this.driver = driver;
    }

    public void StatedAndCityOpcion()  {
        WebDriver driver = WebDriverSingleton.getDriver();
        Assert.assertTrue(!driver.findElement(By.id("city")).isSelected());
    }

}
