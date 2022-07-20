package co.com.joinutest.tasks;


import co.com.joinutest.interactions.Esperar;
import co.com.joinutest.interactions.EsperarElemento;
import co.com.joinutest.model.datospersonales.CreateDatosPersonales;

import co.com.joinutest.model.datospersonales.DatosPersonalesBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static co.com.joinutest.userinterface.UserAboutYourself1.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ARROW_DOWN;
import static org.openqa.selenium.Keys.ENTER;


public class AboutYourself1 implements Task {

    public final CreateDatosPersonales createDatosPersonales;

    public AboutYourself1 (CreateDatosPersonales createDatosPersonales) {
        this.createDatosPersonales = createDatosPersonales;
    }

        public static AboutYourself1 enPagina(DatosPersonalesBuilder createDatosPersonales){
        return instrumented(AboutYourself1.class, createDatosPersonales.build());

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EsperarElemento.esClickable(BOX_FIRSTNAME),
                Click.on(BOX_FIRSTNAME),
                Enter.theValue(createDatosPersonales.getFirstName()).into(BOX_FIRSTNAME),
                Click.on(BOX_LASTNAME),
                Enter.theValue(createDatosPersonales.getLastName()).into(BOX_LASTNAME),
                Click.on(BOX_EMAIL),
                Enter.theValue(createDatosPersonales.getEmail()).into(BOX_EMAIL),
                Esperar.unTiempo(1000),

                SelectFromOptions.byVisibleText("March").from(LIST_MONTH),

                Click.on(LIST_DAY),
                Hit.the(ARROW_DOWN).into(LIST_DAY),
                Hit.the(ARROW_DOWN).into(LIST_DAY),
                Hit.the(ENTER).into(LIST_DAY),

                SelectFromOptions.byVisibleText("1988").from(LIST_YEAR),
                Click.on(BTN_NEXT),
                Esperar.unTiempo(3000)

//
//                EsperarElemento.esClickable(LIST_CITY),
//                Click.on(LIST_CITY),
//                Enter.theValue("Medellín").into(LIST_CITY),
//                Hit.the(ARROW_DOWN).into(LIST_CITY),
//                Hit.the(ENTER).into(LIST_CITY),
//                Click.on(BOX_COD_POSTAL),
//                Enter.theValue("057050").into(BOX_COD_POSTAL),
//                Click.on(BTN_NEXT2),
//                Esperar.unTiempo(3000),
//
//
//                Click.on(BTN_STEP3),
//                Esperar.unTiempo(3000),
//
//
//
//                Click.on(BOX_PASS1),
//                Enter.theValue("David-123456789").into(BOX_PASS1),
//                Click.on(BOX_PASS2),
//                Enter.theValue("David-123456789").into(BOX_PASS2),
//                Esperar.unTiempo(3000),
//
//
//                Scroll.to(TEXT_ACCEPT1),
//                Click.on(TEXT_ACCEPT1),
//                Esperar.unTiempo(10000),
//
//                Click.on(TEXT_ACCEPT2),
//                Esperar.unTiempo(10000),
//
//                Click.on(BTN_ACCEPT_FINAL),
//
//                Esperar.unTiempo(10000)
        );
    }
//    public static AboutYourself1 enPagina() {
//        return instrumented(AboutYourself1.class);}
}
