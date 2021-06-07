package co.com.sistecredito.tasks;

import static co.com.sistecredito.userinterfaces.IngresarDatosDespacho.BTN_CONTINUAR;
import static co.com.sistecredito.userinterfaces.IngresarDatosDespacho.BTN_INGRESAR_DIRECCION;
import static co.com.sistecredito.userinterfaces.IngresarDatosDespacho.BTN_PAGAR_CONTINUAR;
import static co.com.sistecredito.userinterfaces.IngresarDatosDespacho.LST_BARRIO;
import static co.com.sistecredito.userinterfaces.IngresarDatosDespacho.LST_CIUDAD;
import static co.com.sistecredito.userinterfaces.IngresarDatosDespacho.LST_DEPARTAMENTO;
import static co.com.sistecredito.userinterfaces.IngresarDatosDespacho.TXT_DETALLE_DIRECCION;
import static co.com.sistecredito.userinterfaces.IngresarDatosDespacho.TXT_DIRECCION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class IngresarDatos implements Task {

  private String departamento;
  private String ciudad;
  private String barrio;
  private String direccion;
  private String detalleDireccion;

  protected IngresarDatos(
      String departamento,
      String ciudad,
      String barrio,
      String direccion,
      String detalleDireccion) {
    this.departamento = departamento;
    this.ciudad = ciudad;
    this.barrio = barrio;
    this.direccion = direccion;
    this.detalleDireccion = detalleDireccion;
  }

  public static IngresarDatos ingresarDatosDespacho(
      String departamento,
      String ciudad,
      String barrio,
      String direccion,
      String detalleDireccion) {
    return Tasks.instrumented(
        IngresarDatos.class, departamento, ciudad, barrio, direccion, detalleDireccion);
  }

  @Step("{0} Se ingresan los datos de envío")
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        SelectFromOptions.byVisibleText(departamento).from(LST_DEPARTAMENTO),
        SelectFromOptions.byVisibleText(ciudad).from(LST_CIUDAD),
        SelectFromOptions.byVisibleText(barrio).from(LST_BARRIO),
        Click.on(BTN_CONTINUAR),
        WaitUntil.the(TXT_DIRECCION, isVisible()).forNoMoreThan(5).seconds(),
        Enter.theValue(direccion).into(TXT_DIRECCION),
        Enter.theValue(detalleDireccion).into(TXT_DETALLE_DIRECCION),
        Click.on(BTN_INGRESAR_DIRECCION),
        Click.on(BTN_PAGAR_CONTINUAR));
  }
}
