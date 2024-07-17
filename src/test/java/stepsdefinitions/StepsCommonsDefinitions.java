package stepsdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AbrirNavegadorPage;
import pages.IngresarOpcionesPage;
import pages.WebDriverSingleton;

public class StepsCommonsDefinitions {

    private AbrirNavegadorPage abrirNavegadorChrome;
    private IngresarOpcionesPage opcionesPage;
    private WebDriver driver;

    public StepsCommonsDefinitions() {
        driver = WebDriverSingleton.getDriver();
        abrirNavegadorChrome = new AbrirNavegadorPage();
        opcionesPage = new IngresarOpcionesPage(driver);

    }

    @Given("ingresar a la pagina demoqa")
    public void que_ella_ingresa_al_navegador() {
        abrirNavegadorChrome.abrirNavegadorChrome();
    }

    @When("ingreso a la opcion {string} de la opcion {word}")
    public void ingreso_a_la_opcion_practice_forms_de_la_opcion_form(String opcion1, String subOpcion) {
        opcionesPage.opcionPage();
    }

    @After
    public void cerrar_navegador() {
        WebDriverSingleton.closeDriver();
    }

}
