package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaymentPage extends PageObject {
    public static final Target TITLE_ORDEN = Target.the("Titulo del pedido")
            .locatedBy("//*[contains(text(), '{0}')]");
}
