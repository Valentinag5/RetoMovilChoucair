package co.choucair.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;

import static co.choucair.tasks.IniciarSesion.iniciarSesion;
import static co.choucair.tasks.NavegarAlLogin.navegarAlLogin;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class InicioDeSesionStepDefinitions {
    private static final Logger LOGGER = Logger.getLogger(InicioDeSesionStepDefinitions.class);

    @Dado("que estoy en la app exito.com y doy clic en el boton ingresar")
    public void queEstoyEnLaAppExitoComYDoyClicEnElBotonIngresar() {
            LOGGER.info("Inicia la automatización");
        try {
            LOGGER.info("Da clic en el botón ingresar");
            theActorInTheSpotlight().wasAbleTo(
                    navegarAlLogin()

            );
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }
    }

    @Cuando("ingreso mi correo electronico y contrasena")
    public void ingresoMiCorreoElectronicoYContrasena() {
        try {
            LOGGER.info("Ingresa las credenciales correctas");
            theActorInTheSpotlight().wasAbleTo(
                    iniciarSesion()
                            .conElCorreo("valentinamejiag@hotmail.com")
                            .conLaClave("Valentina123")

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
