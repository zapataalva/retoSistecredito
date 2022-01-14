package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePageFalabella extends PageObject {

    public static final Target BUSCAR_PRODUCTO = Target.the("Campo para buscar el producto deseado")
            .locatedBy("//*[@class='SearchBar-module_searchBar__Input__1VvhT']");

    public static final Target BTN_BUSCAR = Target.the("Boton para buscar el producto deseado")
            .locatedBy("//*[@class = 'SearchBar-module_searchBtnIcon__6KVum']");

    public static final Target PRODUCTO = Target.the("Campo para seleccionar el producto deseado")
            .locatedBy("//*[contains(text(),'iPhone 12 Mini 64GB')]");

    public static final Target BTN_AGREGAR_PRODUCTO = Target.the("Boton para agregar el producto a la bolsa")
            .locatedBy("//*[@class = 'jsx-3657936619 product-specifications']//*[contains(text(),'Agregar a la Bolsa')]");

    public static final Target BTN_VER_BOLSA = Target.the("Boton para ver la bolsa")
            .locatedBy("//*[@id = 'linkButton']");

    public static final Target BTN_COMPRA = Target.the("Boton para ir a comprar")
            .locatedBy("//*[@class = 'fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase']");


}
