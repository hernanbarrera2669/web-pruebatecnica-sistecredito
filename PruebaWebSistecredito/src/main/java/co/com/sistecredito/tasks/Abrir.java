package co.com.sistecredito.tasks;

import co.com.sistecredito.userinterfaces.IngresoFalabella;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class Abrir implements Task {

  public static Abrir paginaWeb() {
    return Tasks.instrumented(Abrir.class);
  }

  @Step("{0} Abrir página principal de Falabella")
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.browserOn().the(IngresoFalabella.class));
  }
}
