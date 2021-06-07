package co.com.sistecredito.tasks;

import static co.com.sistecredito.userinterfaces.BuscarProductos.BTN_AGREGAR_BOLSA;
import static co.com.sistecredito.userinterfaces.BuscarProductos.BTN_CERRAR_POPUP;
import static co.com.sistecredito.userinterfaces.BuscarProductos.BTN_CERRAR_PUBLICIDAD_CMR;
import static co.com.sistecredito.userinterfaces.BuscarProductos.LBL_DECLINAR_ALERTA;
import static co.com.sistecredito.userinterfaces.BuscarProductos.LBL_PRODUCTO_SELECCIONADO;
import static co.com.sistecredito.userinterfaces.BuscarProductos.TXT_BUSCAR_PRODUCTO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class BuscarProducto implements Task {

  private String producto;

  protected BuscarProducto(String producto) {
    this.producto = producto;
  }

  public static BuscarProducto buscarProductoFalabella(String producto) {

    return Tasks.instrumented(BuscarProducto.class, producto);
  }

  @Step("{0} Busca y selecciona el producto ingresado")
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        WaitUntil.the(BTN_CERRAR_POPUP, isVisible()).forNoMoreThan(5).seconds(),
        Click.on(BTN_CERRAR_POPUP),
        Click.on(LBL_DECLINAR_ALERTA),
        SendKeys.of(producto).into(TXT_BUSCAR_PRODUCTO),
        SendKeys.of(Keys.ENTER).into(TXT_BUSCAR_PRODUCTO),
        WaitUntil.the(LBL_PRODUCTO_SELECCIONADO, isVisible()).forNoMoreThan(5).seconds(),
        Click.on(LBL_PRODUCTO_SELECCIONADO),
        WaitUntil.the(BTN_CERRAR_PUBLICIDAD_CMR, isVisible()).forNoMoreThan(5).seconds(),
        Click.on(BTN_CERRAR_PUBLICIDAD_CMR),
        Click.on(BTN_AGREGAR_BOLSA));
  }
}
