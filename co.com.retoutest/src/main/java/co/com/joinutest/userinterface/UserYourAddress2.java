package co.com.joinutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class UserYourAddress2 {

        public static final Target LIST_CITY=Target.the("Boton de Ciudad").locatedBy("//*[@id='city' and @name='city']");
        public static final Target BOX_COD_POSTAL=Target.the("Boton de Código Postal").locatedBy("//*[@id='zip']");
        public static final Target BTN_NEXT2=Target.the("Boton de SIGUIENTE").locatedBy("//*[contains(text(),'Next: Devices')]");


}
