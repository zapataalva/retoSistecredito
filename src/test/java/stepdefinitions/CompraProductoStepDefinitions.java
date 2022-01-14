package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CompraProductoStepDefinitions {
    @Before
    public void setUp(){setTheStage(new OnlineCast());}

    @Given("{string} desea navegar a la pagina {string}")
    public void deseaNavegarALaPagina(String actorName, String url) {
        theActorCalled(actorName).attemptsTo(Open.url(url));
    }

    @When("Ingresa el producto a comprar {string}")
    public void ingresaElProductoAComprar(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Ingresa la información de despacho")
    public void ingresaLaInformaciónDeDespacho(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

    @Then("Valida que la pagina contenga {string}")
    public void validaQueLaPaginaContenga(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
