package co.com.joinutest.stepdefinitions.joinutest;

import co.com.joinutest.interactions.Esperar;
import co.com.joinutest.interactions.HomePage;
import co.com.joinutest.model.datospersonales.DatosPersonalesBuilder;
import co.com.joinutest.questions.ValidacionRegistro;
import co.com.joinutest.tasks.AboutYourself1;
import co.com.joinutest.tasks.AboutYourself2;
import co.com.joinutest.tasks.AboutYourself3;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

import static co.com.joinutest.userinterface.UserAboutYourself1.*;


public class JoinStep {






    @Given("^que (.*) abre la pagina$")
    public void queDavidAbreLaPagina(String actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.enPagina()
        );
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(BTN_JOIN_TODAY),
                Esperar.unTiempo(3000)
        );
    }


    @When("^el registra los datos personales y crea nuevo usuario con los siguiente datos$")
    public void elRegistraLosSiguienteDatos(List<Map< String, String>>datos) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                AboutYourself1.enPagina(DatosPersonalesBuilder.con()
                        .firstName(datos)
                        .lastName(datos)
                        .email(datos)));

        OnStage.theActorInTheSpotlight().attemptsTo(
                AboutYourself2.enPagina(DatosPersonalesBuilder.con()
                        .city(datos)
                        .codPostal(datos)));

        OnStage.theActorInTheSpotlight().attemptsTo(
                AboutYourself3.enPagina(DatosPersonalesBuilder.con()
                        .pass(datos))
        );



    }



    @Then("^se vera mensaje de login Exitoso$")
    public void seVeraLoginExitoso() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidacionRegistro.exitosa()));


    }



}
