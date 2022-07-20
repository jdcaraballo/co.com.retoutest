package co.com.joinutest.tasks;


import co.com.joinutest.interactions.Esperar;
import co.com.joinutest.interactions.EsperarElemento;
import co.com.joinutest.model.datospersonales.CreateDatosPersonales;
import co.com.joinutest.model.datospersonales.DatosPersonalesBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

import static co.com.joinutest.userinterface.UserYourAddress2.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ARROW_DOWN;
import static org.openqa.selenium.Keys.ENTER;


public class AboutYourself2 implements Task {

    public final CreateDatosPersonales createDatosPersonales;

    public AboutYourself2(CreateDatosPersonales createDatosPersonales) {
        this.createDatosPersonales = createDatosPersonales;
    }
        public static AboutYourself2 enPagina (DatosPersonalesBuilder createDatosPersonales){
            return instrumented(AboutYourself2.class, createDatosPersonales.build());
        }

        @Override
        public <T extends Actor > void performAs (T actor){
            actor.attemptsTo(
                    EsperarElemento.esClickable(LIST_CITY),
                    Click.on(LIST_CITY),
                    Enter.theValue(createDatosPersonales.getCity()).into(LIST_CITY),
                    Hit.the(ARROW_DOWN).into(LIST_CITY),
                    Hit.the(ENTER).into(LIST_CITY),
                    Click.on(BOX_COD_POSTAL),
                    Enter.theValue(createDatosPersonales.getCodPostal()).into(BOX_COD_POSTAL),
                    Click.on(BTN_NEXT2),
                    Esperar.unTiempo(5000)
            );
        }

    }

