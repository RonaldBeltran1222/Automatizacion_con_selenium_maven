package stepsdefinitions;

import aserciones.ValidacionElements;
import aserciones.ValidacionElementsTextBox;
import aserciones.ValidacionElementsTituloTexBox;
import aserciones.Validaciones;
import aserciones.validacionCheckTextElements.Validacion;
import aserciones.validacionTexBox.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.openqa.selenium.WebDriver;
import pages.OpcionesElementsPage;
import pages.WebDriverSingleton;
import pages.elements.*;
import pages.elements.check_box_elements.CheckBoxElementsPage;

import java.util.Map;

public class PracticeElementsDefinition {

    private WebDriver driver;
    private OpcionesElementsPage opcionesElementsPage;
    private ValidacionElements validacionClickElements;
    private ValidacionElementsTextBox validacionElementsTextBox;
    private ValidacionElementsTituloTexBox validacionElementsTituloTexBox;
    private TextBoxElementsPage textBoxElementsPage;
    private ValidacionFormTextBoxElements validacionFormTextBoxElements;
    private ValidacionExistenciaBotonSubmit validacionExistenciaBotonSubmit;
    private FullNameElementsPage fullNameElementsPage;
    private ValidacionFullNameElements validacionFullNameElements;
    private ValidacionEmailElements validacionEmailElements;
    private EmailElementsPage emailElementsPage;
    private AddressElementsPage addressElementsPage;
    private ValidacionAddressElements validacionAddressElements;
    private PermanentAddressPage permanentAddressPage;
    private ValidacionPermanentAddressElements validacionPermanentAddressElements;
    private CheckBoxElementsPage checkBoxElementsPage;
    private Validacion validacion;

    public PracticeElementsDefinition() {
        driver = WebDriverSingleton.getDriver();
        opcionesElementsPage = new OpcionesElementsPage(driver);
        validacionClickElements = new ValidacionElements(driver);
        validacionElementsTextBox = new ValidacionElementsTextBox(driver);
        validacionElementsTituloTexBox = new ValidacionElementsTituloTexBox(driver);
        textBoxElementsPage = new TextBoxElementsPage(driver);
        validacionFormTextBoxElements = new ValidacionFormTextBoxElements(driver);
        validacionExistenciaBotonSubmit = new ValidacionExistenciaBotonSubmit(driver);
        fullNameElementsPage = new FullNameElementsPage(driver);
        validacionFullNameElements = new ValidacionFullNameElements(driver);
        validacionEmailElements = new ValidacionEmailElements(driver);
        emailElementsPage = new EmailElementsPage(driver);
        addressElementsPage = new AddressElementsPage(driver);
        validacionAddressElements = new ValidacionAddressElements(driver);
        permanentAddressPage = new PermanentAddressPage(driver);
        validacionPermanentAddressElements = new ValidacionPermanentAddressElements(driver);
        checkBoxElementsPage = new CheckBoxElementsPage(driver);
        validacion = new Validacion(driver);
    }

    //    @CP001_Elements
    @When("ingreso a la opcion {string}")
    public void ingreso_a_la_opcion(String opcion1) {
        opcionesElementsPage.opcionPage();
    }

    @Then("deberia visualizarce las opciones de Elements")
    public void deberia_visualizarce_las_opciones_de_elements() {
        validacionClickElements.validacionClickElements();
    }

    //CP002_Elements
    @When("ingreso a la opcion {string} de la opcion {string} de la pagina")
    public void ingreso_a_la_opcion_de_la_opcion_de_la_pagina(String string, String string2) {
        opcionesElementsPage.opcionPageTextBox();
    }

    @Then("deberia visualizarce el formulario de Text Box")
    public void deberia_visualizarce_el_formulario_de_text_box() throws InterruptedException {
        validacionElementsTextBox.validacionTextBox();
    }

    //CP0003_Elements
    @Then("deberia visualizarce el titulo de Text Box")
    public void deberia_visualizarce_el_titulo_de_text_box() throws InterruptedException {
        validacionElementsTituloTexBox.ValdarTiutloTextBox();
    }

    //CP004_Elements
    @When("llenar el formulario")
    public void llenar_el_formulario(Map<String, String> info) throws InterruptedException {
        textBoxElementsPage.llenarFormularioValidar(info);
    }

    @Then("visualisar el formulario lleno")
    public void visualisar_el_formulario_lleno() {
        validacionFormTextBoxElements.validacionFormularioTextBox();
    }

    //CP005_Elements
    @Then("validar la existencia del boton submit")
    public void validar_la_existencia_del_boton_submit() {
        validacionExistenciaBotonSubmit.ValidacionExistenciaBotonSubmit();
    }

    //CP006_Elements
    @When("llenar campo full name")
    public void llenar_campo_full_name(Map<String, String> info) {
        fullNameElementsPage.FullNameElements(info);
    }
    @Then("deberia visualizarce el nombre")
    public void deberia_visualizarce_el_nombre() {
        validacionFullNameElements.validacionFullNameElements();
    }

    //CP007_Elements
    @When("llenar campo Email")
    public void llenar_campo_email(Map<String, String> info) {
        emailElementsPage.EmailElements(info);
    }

    @Then("deberia visualizarce el correo")
    public void deberia_visualizarce_el_correo() {
        validacionEmailElements.validacionEmailElements();
    }

    //CP008_Elements
    @When("llenar campo Address")
    public void llenar_campo_address(Map<String, String> info) {
        addressElementsPage.AddressElements(info);
    }
    @Then("deberia visualizarce la direccion")
    public void deberia_visualizarce_la_direccion() {
        validacionAddressElements.validacionAddressElements();
    }

    //CP009_Elements
    @When("llenar campo Permanent Address")
    public void llenar_campo_permanent_address(Map<String, String> info) {
        permanentAddressPage.PermanentAddressElements(info);
    }
    @Then("deberia visualizarce la direccion permanente")
    public void deberia_visualizarce_la_direccion_permanente() {
        validacionPermanentAddressElements.validacionPermanentAddressElements();
    }

    //CP010_Elements
    @When("ingresar a la opcion CheckBox")
    public void ingresar_a_la_opcion_check_box() {
        checkBoxElementsPage.checkBoxElements();
    }
    @Then("deberia visualizarce la opcion de Check Box")
    public void deberia_visualizarce_la_opcion_de_check_box() {
        validacion.validacionCheckTexElements();
    }





}
