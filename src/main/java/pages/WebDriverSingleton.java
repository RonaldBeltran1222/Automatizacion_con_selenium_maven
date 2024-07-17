package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverSingleton {
    private static WebDriver driver;

    private WebDriverSingleton() {
        driver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            new WebDriverSingleton();
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
