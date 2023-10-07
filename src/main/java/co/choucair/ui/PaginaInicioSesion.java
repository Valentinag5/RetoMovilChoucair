package co.choucair.ui;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class PaginaInicioSesion {

    public static final Locator CORREO_LOCATOR = locator()
            .withAndroidId("com.exito.appcompania:id/TextInputEditText_email");
    public static final Target CORREO = Target.the("Campo correo")
            .located(theElementBy(CORREO_LOCATOR));

    public static final Locator CLAVE_LOCATOR = locator()
            .withAndroidId("com.exito.appcompania:id/CustomEditText_password");
    public static final Target CLAVE = Target.the("Campo clave")
            .located(theElementBy(CLAVE_LOCATOR));

}
