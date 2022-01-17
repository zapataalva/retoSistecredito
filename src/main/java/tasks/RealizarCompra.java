package tasks;

import io.cucumber.datatable.DataTable;
import models.Despacho;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static userinterfaces.CheckoutPage.*;

public class RealizarCompra implements Task {

    private DataTable data;
    private Map<String, String> info;
    private Despacho despacho;

    public RealizarCompra(DataTable data) {
        this.data = data;
        info = this.data.asMap(String.class, String.class);
        despacho = new Despacho(info.get("departamento"), info.get("ciudad"), info.get("barrio"), info.get("direccion"),
                info.get("detalle"));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_DEPARTAMENTO.of(despacho.getDepartamento())),
                Click.on(INPUT_CIUDAD.of(despacho.getCiudad())),
                Click.on(INPUT_BARRIO.of(despacho.getBarrio())),
                Click.on(BTN_CONTINUAR),
                Enter.theValue(despacho.getDireccion()).into(INPUT_DIRECCION),
                Enter.theValue(despacho.getDetalle()).into(INPUT_DETALLE_DIRECCION),
                Click.on(BTN_INGRESAR_DIRECCION), Click.on(BTN_PAGAR)
        );
    }

    public static RealizarCompra conInfo(DataTable data){
        return Tasks.instrumented(RealizarCompra.class, data);
    }
}
