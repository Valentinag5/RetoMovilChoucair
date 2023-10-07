package co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.choucair.ui.PaginaInicio.BOTON_CREAR_CUENTA;

public class NavegarAlRegistro implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CREAR_CUENTA)
        );
    }

    public static NavegarAlRegistro navegarAlRegistro(){
        return new NavegarAlRegistro();
    }
}
