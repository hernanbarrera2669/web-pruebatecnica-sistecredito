package co.com.sistecredito.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class BuscarProductos extends PageObject {

  public static final Target BTN_CERRAR_POPUP =
      Target.the("Botón para cerrar el PopUp aviso importante")
          .located(
              By.xpath(
                  "//section[@class='modal-newsletter modal-500 nochesprueba usertests-btn-modal']//span[@id='lightbox-close']"));

  public static final Target TXT_BUSCAR_PRODUCTO =
      Target.the("Botón para cerrar el popup de suscripción")
          .located(By.id("testId-SearchBar-Input"));

  public static final Target LBL_DECLINAR_ALERTA =
      Target.the("Opción para denegar el envío de alertas").located(By.id("acc-alert-deny"));

  public static final Target LBL_PRODUCTO_SELECCIONADO =
      Target.the("Seleccionar un producto de la lista").located(By.id("testId-pod-image-9712300"));

  public static final Target BTN_AGREGAR_BOLSA =
      Target.the("Agregar producto a la bolsa de compras")
          .located(By.xpath("//button[contains(text(), 'Agregar a la Bolsa')]"));

  public static final Target BTN_CERRAR_PUBLICIDAD_CMR =
      Target.the("Cerrar la publicidad que aparece en el PopUP")
          .located(By.className("dy-lb-close"));
}
