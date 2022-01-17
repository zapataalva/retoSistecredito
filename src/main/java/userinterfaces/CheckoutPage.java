package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage extends PageObject {

    public static final Target INPUT_DEPARTAMENTO = Target.the("selecionar el departamento")
            .locatedBy("//select[@id = 'region']//option[@class = 'fbra_selectOption' and contains(text(), '{0}')]");

    public static final Target INPUT_CIUDAD = Target.the("Opcion para selecionar la ciudad")
            .locatedBy("//select[@id = 'ciudad']//option[@class = 'fbra_selectOption' and contains(text(), '{0}')]");

    public static final Target INPUT_BARRIO = Target.the("Opcion para selecionar el barrio")
            .locatedBy("//select[@id = 'comuna']//option[@class = 'fbra_selectOption' and contains(text(), '{0}')]");

    public static final Target BTN_CONTINUAR = Target.the("Boton para continuar el checkout")
            .locatedBy("//button[@class = 'fbra_button fbra_test_button fbra_formItem__field04']");

    public static final Target INPUT_DIRECCION = Target.the("Input para ingresar la direccion")
            .locatedBy("//input[@id = 'address']");

    public static final Target INPUT_DETALLE_DIRECCION = Target.the("Input para ingresar el detalle de la direccion")
            .locatedBy("//input[@id = 'departmentNumber']");

    public static final Target BTN_INGRESAR_DIRECCION = Target.the("Boton para ingresar direccion")
            .locatedBy("//button[@class = 'fbra_button fbra_test_button fbra_formItem__useAddress']");

    public static final Target BTN_PAGAR = Target.the("Boton para ir a pagar")
            .locatedBy("//button[@class = 'fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton']");

}
