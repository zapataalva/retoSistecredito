package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.HomePageFalabella;

import static userinterfaces.HomePageFalabella.*;

public class SeleccionarProducto implements Task {

    private String producto;

    public SeleccionarProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(producto).into(BUSCAR_PRODUCTO),
                Click.on(BTN_BUSCAR),
                Click.on(PRODUCTO), Click.on(BTN_AGREGAR_PRODUCTO),
                Click.on(BTN_VER_BOLSA), Click.on(BTN_COMPRA)
        );
    }

    public static SeleccionarProducto con(String producto){
        return Tasks.instrumented(SeleccionarProducto.class, producto);
    }
}
