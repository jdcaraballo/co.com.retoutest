package co.com.joinutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserAboutYourPass4 {

        public static final Target TEXT_ACCEPT1=Target.the("Boton de ACCEPT1").located(By.xpath("//*[@class='input-check-box signup-consent' and contains(.,'and the')]"));
        public static final Target TEXT_ACCEPT2=Target.the("Boton de ACCEPT2").locatedBy("//*[@class='input-check-box signup-consent']//*[@ng-class='{error: userForm.privacySetting.$error.required}']");
        public static final Target BTN_ACCEPT_FINAL=Target.the("Boton de ACCEPT FINAL").locatedBy("//*[@id='laddaBtn']");



}
