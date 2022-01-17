package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidarTexto;
import tasks.RealizarCompra;
import tasks.SeleccionarProducto;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static userinterfaces.PaymentPage.TITLE_ORDEN;

public class CompraProductoStepDefinitions {
    @Before
    public void setUp(){setTheStage(new OnlineCast());}

    @Given("{string} desea navegar a la pagina {string}")
    public void deseaNavegarALaPagina(String actorName, String url) {
        theActorCalled(actorName).attemptsTo(Open.url(url));
    }

    @When("Ingresa el producto a comprar {string}")
    public void ingresaElProductoAComprar(String producto) {
        theActorInTheSpotlight().attemptsTo(SeleccionarProducto.con(producto));
    }

    @When("Ingresa la información de despacho")
    public void ingresaLaInformaciónDeDespacho(DataTable informacionDespacho) {
        theActorInTheSpotlight().attemptsTo(RealizarCompra.conInfo(informacionDespacho));
    }

    @Then("Valida que la pagina contenga {string}")
    public void validaQueLaPaginaContenga(String texto) {
        theActorInTheSpotlight().should(seeThat(ValidarTexto.con(texto, TITLE_ORDEN),equalTo(texto)));
    }
}
