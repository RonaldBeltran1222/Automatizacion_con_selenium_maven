package userinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeElementsUI {
    public WebDriver driver;

    public PracticeElementsUI(WebDriver driver ) {
        this.driver = driver;
    }

    //    UIElements
    public WebElement getElementsClick(){
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[2]"));
    }

    public WebElement getElementsDivElements(){
        return  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]"));
    }

    public WebElement getElementsTextBox(){
        return driver.findElement(By.xpath("//*[@id=\"item-0\"]//span[text()='Text Box']"));
    }

    public WebElement getidFullName (){
        return driver.findElement(By.id("userName-label"));
    }

    public WebElement getSubmit () {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getTiutloTextBox () {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/h1"));
    }

    public WebElement getId(String id) {
        return driver.findElement(By.id(id));
    }

    public WebElement getDivTextBoxFormularioConfirmacion(){
//        return driver.findElement(By.xpath("//*[@id=\"name\"]/text()['Yesica Martin']"));
        return driver.findElement(By.xpath("//*[@id=\"output\"]/div"));
    }

    public WebElement getCheckText(){
        return driver.findElement(By.xpath("//*[@id='item-1']//span[text()='Check Box']"));
    }

}
