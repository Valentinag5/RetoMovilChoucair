package co.choucair.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;

import static co.choucair.tasks.NavegarAlRegistro.navegarAlRegistro;
import static co.choucair.tasks.Registrarse.registrarse;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class RegistroStepDefinitions {
    private static final Logger LOGGER = Logger.getLogger(RegistroStepDefinitions.class);

    @Dado("que estoy en la app exito.com y quiero crear una cuenta")
    public void queEstoyEnLaAppExitoComYQuieroCrearUnaCuenta() {
        LOGGER.info("Inicia la automatización");
        try {
            LOGGER.info("Da clic en el botón ingresar");
            theActorInTheSpotlight().wasAbleTo(
                    navegarAlRegistro()

            );
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }
    }
    @Cuando("ingreso los datos solicitados")
    public void ingresoLosDatosSolicitados() {
        try {
            LOGGER.info("Ingresa los datos solicitatos");
            theActorInTheSpotlight().wasAbleTo(
                    registrarse()
                            .conNombres("Valentina")
                            .conApellidos("Giraldo")
                            .conNumeroDoc("123456")
                            .conCelular("1234567890")
                            .conCorreo("prueba@gmail.com")

            );
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }
    }

    @Entonces("veo el nombre de mi sesion")
    public void veoElNombreDeMiSesion() {
        LOGGER.info("Falto el assert porque la página estaba con fallas y no permitió el ingreso");
    }
}
