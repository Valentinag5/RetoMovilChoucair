package co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.choucair.ui.PaginaRegistro.*;

public class Registrarse implements Task {

    private String nombres;
    private String apellidos;
    private String numeroDoc;
    private String celular;
    private String correo;


    public Registrarse conNombres(String nombres) {
        this.nombres = nombres;
        return this;
    }


    public Registrarse conApellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public Registrarse conNumeroDoc(String numeroDoc) {
        this.numeroDoc = numeroDoc;
        return this;
    }

    public Registrarse conCelular(String celular) {
        this.celular = celular;
        return this;
    }

    public Registrarse conCorreo(String correo) {
        this.correo = correo;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(nombres).into(NOMBRES),
                Enter.theValue(apellidos).into(APELLIDOS),
                SelectFromOptions.byVisibleText("CC").from(TIPO_DOCUMENTO),
                Enter.theValue(numeroDoc).into(NUMERO_DOCUMENTO),
                SelectFromOptions.byVisibleText("1998").from(YEAR_NAC),
                SelectFromOptions.byVisibleText("April").from(MES_NAC),
                SelectFromOptions.byVisibleText("19").from(DIA_NAC),
                Enter.theValue(celular).into(CEL),
                Enter.theValue(correo).into(CORREO)

        );
    }

    public static Registrarse registrarse() {
        return new Registrarse();
    }
}




