package co.com.joinutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class UserAboutYourself1 {

        public static final Target BTN_JOIN_TODAY=Target.the("Boton de JOIN TODAY").locatedBy("//*[@class='unauthenticated-nav-bar__sign-up' and contains(.,'Join Today')]");
        public static final Target BOX_FIRSTNAME=Target.the("Boton de CAja mnombre").locatedBy("//*[@id='firstName']");
        public static final Target BOX_LASTNAME=Target.the("Boton de Apellido").locatedBy("//*[@id='lastName']");
        public static final Target BOX_EMAIL=Target.the("Boton de Email").locatedBy("//*[@id='email']");


        public static final Target LIST_MONTH=Target.the("LIST MEs de nacimiento").locatedBy("//*[@id='birthMonth']");
        public static final Target LIST_DAY=Target.the("LIST Dia de nacimiento").locatedBy("//*[@name='birthDay' and (@id='birthDay')]");
        public static final Target LIST_YEAR=Target.the("LIST AÑO de nacimiento").locatedBy("//*[@name='birthYear' and (@id='birthYear')]");
        public static final Target BTN_NEXT=Target.the("BOTON SIGUIENTE").locatedBy("//*[contains(text(),'Next: Location')]");


}
