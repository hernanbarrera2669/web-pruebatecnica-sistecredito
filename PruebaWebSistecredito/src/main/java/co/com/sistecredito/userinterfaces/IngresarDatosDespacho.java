package co.com.sistecredito.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class IngresarDatosDespacho extends PageObject {

  public static final Target LST_DEPARTAMENTO =
      Target.the("Agregar el departamento de despacho").located(By.id("region"));

  public static final Target LST_CIUDAD =
      Target.the("Agregar la Ciudad de despacho").located(By.id("ciudad"));

  public static final Target LST_BARRIO =
      Target.the("Agregar la Dirección de entrega").located(By.id("comuna"));

  public static final Target BTN_CONTINUAR =
      Target.the("Botón para continuar la compra")
          .located(By.xpath("//button[contains(text(), 'Continuar') and @name='field04']"));

  public static final Target TXT_DIRECCION =
      Target.the("Texto de dirección para recibir la compra").located(By.id("address"));

  public static final Target TXT_DETALLE_DIRECCION =
      Target.the("Texto de detalle dirección para especificar la compra")
          .located(By.id("departmentNumber"));

  public static final Target BTN_INGRESAR_DIRECCION =
      Target.the("Botón para finalizar los datos de envío")
          .located(By.xpath("//button[contains(text(), 'Ingresar dirección')]"));

  public static final Target BTN_PAGAR_CONTINUAR =
      Target.the("Botón para continuar con la opción de pago")
          .located(
              By.xpath(
                  "//button[@class='fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton'] "));
}
