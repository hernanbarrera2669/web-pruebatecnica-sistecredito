package co.com.sistecredito.questions;

import static co.com.sistecredito.userinterfaces.VerificarCompra.LBL_VERIFICAR_COMPRA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarCompra implements Question<String> {

  @Override
  public String answeredBy(Actor actor) {
    return LBL_VERIFICAR_COMPRA.resolveFor(actor).getText();
  }

  public static VerificarCompra esCorrecto() {
    return new VerificarCompra();
  }
}
