package userinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormsUI {
    public WebDriver driver;

    public PracticeFormsUI(WebDriver driver ) {
        this.driver = driver;
    }

    public WebElement getPRACTICE_FORM_TITULO() {
        return driver.findElement(By.xpath("//*[@id='app']/div/div/div/div[2]/div[2]/h1"));
    }

    public WebElement getSUBMIT_BOTON() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getClose_Boton(){
        return driver.findElement(By.id("closeLargeModal"));
    }

    public WebElement getId(String id) {
        return driver.findElement(By.id(id));
    }

    public WebElement getESTADO_INPUT() {
        return driver.findElement(By.xpath("//input[@id='react-select-3-input']/preceding::div[1]"));
    }

    public WebElement getCIUDAD_INPUT() {
        return driver.findElement(By.xpath("//input[@id='react-select-4-input']/preceding::div[1]"));
    }

    public WebElement getMODAL_SUBMIT_TABLE() {
        return driver.findElement(By.xpath("//*[@class='table table-dark table-striped table-bordered table-hover']"));
    }

    public WebElement getGENERO_CHECKBOX() {
        return driver.findElement(By.xpath("//tbody/tr[td[contains(text(),'Gender')]]/td[2]"));
    }

    public WebElement getHOBBIES_CHECKBOX() {
        return driver.findElement(By.xpath("//tbody/tr[td[contains(text(),'Hobbies')]]/td[2]"));
    }

    public WebElement getCheckBox(String check){
        return driver.findElement(By.xpath("//tbody/tr[td[contains(text(),'"+check +"')]]/td[2]"));
    }

    public WebElement getCheck(String check){
        return driver.findElement(By.xpath("//label[contains(text(),'" + check + "')]"));
    }

    public WebElement getOpcionPageForms(){
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[3]/h5"));
    }

    public WebElement getOpcionPagePracticForms(){
        return driver.findElement(By.xpath("//div[@class='element-list collapse show']"));
    }



}
