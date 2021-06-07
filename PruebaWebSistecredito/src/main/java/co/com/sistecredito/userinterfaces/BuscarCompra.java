package co.com.sistecredito.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class BuscarCompra extends PageObject {

  public static final Target BTN_VER_COMPRAS =
      Target.the("Ver los elementos en la bolsa de compras").located(By.id("linkButton"));

  public static final Target BTN_IR_COMPRAS =
      Target.the("Realizar la compra")
          .located(By.xpath("//button[contains(text(), 'Ir a comprar')]"));
}
