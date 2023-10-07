package co.choucair.tasks;

import co.choucair.interactions.Espera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.choucair.ui.PaginaInicio.BOTON_LOGIN;
import static co.choucair.ui.PaginaInicioSesion.CLAVE;
import static co.choucair.ui.PaginaInicioSesion.CORREO;


public class IniciarSesion implements Task {

    private String correo;
    private String clave;

    public IniciarSesion conElCorreo(String correo){
        this.correo=correo;
        return this;
    }

    public IniciarSesion conLaClave(String clave){
        this.clave=clave;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Espera.seconds(5),
                Enter.theValue(correo).into(CORREO),
                Enter.theValue(clave).into(CLAVE),
                Click.on(BOTON_LOGIN)
        );
    }

    public static IniciarSesion iniciarSesion(){
        return new IniciarSesion();
    }
}
