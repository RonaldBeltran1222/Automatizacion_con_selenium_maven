package stepsdefinitions;

import aserciones.Validaciones;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LlenarFormularioPage;
import pages.StatedAndCityPage;
import pages.VisuaizarFormularioPage;
import pages.WebDriverSingleton;

import java.util.Map;

public class PracticeFormsDefinitions {


    private Map<String, String> info;
    private VisuaizarFormularioPage visuaizarFormularioPage;
    private WebDriver driver;
    private StatedAndCityPage statedAndCityPage;
    private Validaciones validaciones;
    private LlenarFormularioPage lLenarFormularioPage;

    public PracticeFormsDefinitions() {
        driver = WebDriverSingleton.getDriver();
        visuaizarFormularioPage = new VisuaizarFormularioPage(driver);
        statedAndCityPage = new StatedAndCityPage(driver);
        validaciones = new Validaciones(driver);
        lLenarFormularioPage = new LlenarFormularioPage(driver);
    }

//    Visualizar el formulario
    @Then("deberia visualizarce el formulario")
    public void deberia_visualizarce_el_formulario() {
        visuaizarFormularioPage.visualizarFormulario();
    }

    //CP016
    @Then("no deberia poder seleccionar la opcion city")
    public void no_deberia_visualizarce() {
        statedAndCityPage.StatedAndCityOpcion();
    }

    //CP023
    @Then("deberia visualizarce el titulo del formulario")
    public void deberia_visualizarce_el_titulo_del_formulario() {
        validaciones.validacionTitulo();
    }

    //CP035
    @When("llena el formulario")
    public void llena_el_formulario(Map<String,String> info) throws InterruptedException {
        lLenarFormularioPage.llenarFormulario(info);
    }

    @Then("deberia visualizarce la ventana modal")
    public void deberia_visualizarce_la_ventana_modal_con_los_datos_del_formulario() {
        validaciones.validacionSubmit();
    }

    //@CP036
    @Then("deberia visualizarce la ventana modal con el check box de genero especificado")
    public void deberia_visualizarce_la_ventana_modal_con_el_check_box_de_genero_especicado() {
        validaciones.validarGeneroCheckBox();
    }

    //@CP037
    @Then("deberia visualizarce la ventana modal con el check box de hobbie especificado")
    public void deberia_visualizarce_la_ventana_modal_con_el_check_box_de_hobbie_especificado() {
        validaciones.validacionHobbiesCheckBox();
        validaciones.validarGeneroCheckBox();
    }

//    @CP038
    @When("llena el formulario y cierra la ventana modal")
    public void llena_el_formulario_y_cierra_la_ventana_modal(Map<String, String> info) throws InterruptedException {
        lLenarFormularioPage.llenarFormulario(info);
        lLenarFormularioPage.cerraFormulario();
    }



}
