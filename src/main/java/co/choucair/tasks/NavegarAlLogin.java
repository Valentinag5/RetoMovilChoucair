package co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.choucair.ui.PaginaInicio.BOTON_LOGIN;

public class NavegarAlLogin implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_LOGIN)
        );
    }

    public static NavegarAlLogin navegarAlLogin(){
        return new NavegarAlLogin();
    }
}
