package co.choucair.ui;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class PaginaRegistro {

    public static final Locator NOMBRES_LOCATOR = locator()
            .withAndroidId("com.exito.appcompania:id/CustomEditText_nombres");
    public static final Target NOMBRES = Target.the("Campo nombres")
            .located(theElementBy(NOMBRES_LOCATOR));

    public static final Locator APELLIDOS_LOCATOR = locator()
            .withAndroidId("com.exito.appcompania:id/CustomEditText_apellidos");
    public static final Target APELLIDOS = Target.the("Campo apellidos")
            .located(theElementBy(APELLIDOS_LOCATOR));

    public static final Locator TIPO_DOC_LOCATOR = locator()
            .withAndroidId("com.exito.appcompania:id/tipo_documento");
    public static final Target TIPO_DOCUMENTO = Target.the("Campo tipo documento")
            .located(theElementBy(TIPO_DOC_LOCATOR));

    public static final Locator NUMERO_DOC_LOCATOR = locator()
            .withAndroidId("com.exito.appcompania:id/CustomEditText_numero_doc");
    public static final Target NUMERO_DOCUMENTO = Target.the("Campo numero documento")
            .located(theElementBy(NUMERO_DOC_LOCATOR));

    public static final Locator YEAR_NAC_LOCATOR = locator()
            .withAndroidId("com.exito.appcompania:id/filled_exposed_dropdown_anio_registro");
    public static final Target YEAR_NAC = Target.the("Campo año nacimiento")
            .located(theElementBy(YEAR_NAC_LOCATOR));

    public static final Locator MES_NAC_LOCATOR = locator()
            .withAndroidId("com.exito.appcompania:id/CustomEditText_mes");
    public static final Target MES_NAC = Target.the("Campo mes nacimiento")
            .located(theElementBy(MES_NAC_LOCATOR));

    public static final Locator DIA_NAC_LOCATOR = locator()
            .withAndroidId("com.exito.appcompania:id/CustomEditText_dia");
    public static final Target DIA_NAC = Target.the("Campo dia nacimiento")
            .located(theElementBy(DIA_NAC_LOCATOR));

    public static final Locator CEL_LOCATOR = locator()
            .withAndroidId("com.exito.appcompania:id/CustomEditText_numero_tel");
    public static final Target CEL = Target.the("Campo celular")
            .located(theElementBy(CEL_LOCATOR));

    public static final Locator CORREO_LOCATOR = locator()
            .withAndroidId("com.exito.appcompania:id/CustomEditText_email_registe");
    public static final Target CORREO = Target.the("Campo correo")
            .located(theElementBy(CORREO_LOCATOR));

    public static final Locator CHECK_TERM_LOCATOR = locator()
            .withAndroidId("com.exito.appcompania:id/AppCompatTextView_terminos_y_condiciones");
    public static final Target CHECK_TERM = Target.the("Check terminos y condiciones")
            .located(theElementBy(CHECK_TERM_LOCATOR));

    public static final Locator CHECK_POLI_LOCATOR = locator()
            .withAndroidId("com.exito.appcompania:id/AppCompatTextView_politicas_tratamiento");
    public static final Target CHECK_POLI = Target.the("Check politicas")
            .located(theElementBy(CHECK_POLI_LOCATOR));


}
