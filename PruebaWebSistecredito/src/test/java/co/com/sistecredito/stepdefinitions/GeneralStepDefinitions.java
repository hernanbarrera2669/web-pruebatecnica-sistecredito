package co.com.sistecredito.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import co.com.sistecredito.tasks.Abrir;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class GeneralStepDefinitions {

  @Managed(driver = "chrome")
  WebDriver hisBrowser;

  @Before
  public void setTheStage() {
    OnStage.setTheStage(OnlineCast.whereEveryoneCan(BrowseTheWeb.with(hisBrowser)));
  }

  @Dado("^que el (.*) ingresa al portal web de Falabella$")
  public void ingresarPortalWeb(String actor) {
    theActorCalled(actor).wasAbleTo(Abrir.paginaWeb());
  }
}
