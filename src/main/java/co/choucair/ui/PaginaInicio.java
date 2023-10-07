package co.choucair.ui;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class PaginaInicio {

    public static final Locator BOTON_CREAR_CUENTA_LOCATOR = locator()
            .withAndroidId("com.exito.appcompania:id/AppCompatTextView_titulo_crear_cuenta");
    public static final Target BOTON_CREAR_CUENTA = Target.the("Boton Login")
            .located(theElementBy(BOTON_CREAR_CUENTA_LOCATOR));
    public static final Locator BOTON_LOGIN_LOCATOR = locator()
            .withAndroidId("com.exito.appcompania:id/AppCompatButton_ingresar");
    public static final Target BOTON_LOGIN = Target.the("Boton Login")
            .located(theElementBy(BOTON_LOGIN_LOCATOR));
}
