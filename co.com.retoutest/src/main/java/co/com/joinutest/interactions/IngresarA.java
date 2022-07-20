package co.com.joinutest.interactions;

import co.com.joinutest.model.datospersonales.DatosPersonalesBuilder;
import co.com.joinutest.tasks.AboutYourself1;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarA {

//    public static Login iniciarSesion(LoginBuilder createLogin) {
//        return instrumented(Login.class, createLogin.build());
//    }

        public static AboutYourself1 datosPerso(DatosPersonalesBuilder createDatosPersonales){
            return instrumented(AboutYourself1.class, createDatosPersonales.build());
            //OJO con el build, redactarlo de nuevo en caso que falle
        }

//
//    public static Logout CerrarSesion(LogoutBuilder createLogout) {
//        return instrumented(Logout.class, createLogout.build());
//    }

//    public static Compra compra(LoginBuilder createLogin) {
//        return instrumented(Compra.class, createLogin.build());
//    }

}
