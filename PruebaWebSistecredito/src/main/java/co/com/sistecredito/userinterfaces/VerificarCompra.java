package co.com.sistecredito.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class VerificarCompra extends PageObject {

  public static final Target LBL_VERIFICAR_COMPRA =
      Target.the("Permite verificar la opción de Pago")
          .located(By.xpath("//span[contains(text(), 'CMR Falabella')]"));
}
