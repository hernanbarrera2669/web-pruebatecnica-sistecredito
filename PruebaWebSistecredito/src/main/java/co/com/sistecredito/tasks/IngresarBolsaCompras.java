package co.com.sistecredito.tasks;

import static co.com.sistecredito.userinterfaces.BuscarCompra.BTN_IR_COMPRAS;
import static co.com.sistecredito.userinterfaces.BuscarCompra.BTN_VER_COMPRAS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class IngresarBolsaCompras implements Task {

  public static IngresarBolsaCompras buscarCompra() {
    return Tasks.instrumented(IngresarBolsaCompras.class);
  }

  @Step("{0} Ingresa a la bolsa y visualiza el producto")
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        WaitUntil.the(BTN_VER_COMPRAS, isClickable()).forNoMoreThan(5).seconds(),
        Click.on(BTN_VER_COMPRAS),
        Click.on(BTN_IR_COMPRAS));
  }
}
