package co.com.sistecredito.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import co.com.sistecredito.enums.CabeceraTabla;
import co.com.sistecredito.enums.MensajeError;
import co.com.sistecredito.exceptions.ExcepcionGeneral;
import co.com.sistecredito.models.Despacho;
import co.com.sistecredito.models.Producto;
import co.com.sistecredito.questions.VerificarCompra;
import co.com.sistecredito.tasks.BuscarProducto;
import co.com.sistecredito.tasks.IngresarBolsaCompras;
import co.com.sistecredito.tasks.IngresarDatos;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import java.util.List;
import java.util.Map;

public class FalabellaStepDefinitions {

  @DataTableType
  public Producto datosProducto(Map<String, String> datosProducto) {
    return new Producto(datosProducto.get(CabeceraTabla.PRODUCTO.getValue()));
  }

  @Cuando("busque el producto y añada este producto a la bolsa$")
  public void buscarProducto(List<Producto> productoLista) {
    String producto = productoLista.get(0).getProducto();
    theActorInTheSpotlight().attemptsTo(BuscarProducto.buscarProductoFalabella(producto));
  }

  @Cuando("busque el producto agregado a la bolsa$")
  public void buscarProductoBolsaCompras() {
    theActorInTheSpotlight().attemptsTo(IngresarBolsaCompras.buscarCompra());
  }

  @DataTableType
  public Despacho datosDespacho(Map<String, String> datosDespacho) {
    return new Despacho(
        datosDespacho.get(CabeceraTabla.DEPARTAMENTO.getValue()),
        datosDespacho.get(CabeceraTabla.CIUDAD.getValue()),
        datosDespacho.get(CabeceraTabla.BARRIO.getValue()),
        datosDespacho.get(CabeceraTabla.DIRECCION.getValue()),
        datosDespacho.get(CabeceraTabla.DETALLE_DIRECCION.getValue()));
  }

  @Cuando("realice la compra ingresando los datos de despacho$")
  public void datosEntrega(List<Despacho> despachoLista) {
    String departamento = despachoLista.get(0).getDepartamento();
    String ciudad = despachoLista.get(0).getCiudad();
    String barrio = despachoLista.get(0).getBarrio();
    String direccion = despachoLista.get(0).getDireccion();
    String detalleDireccion = despachoLista.get(0).getDetalleDireccion();
    theActorInTheSpotlight()
        .attemptsTo(
            IngresarDatos.ingresarDatosDespacho(
                departamento, ciudad, barrio, direccion, detalleDireccion));
  }

  @Entonces("realizará la compra, verificando que exista el valor (.*)$")
  public void verificarCompra(String mensaje) {
    theActorInTheSpotlight()
        .should(
            seeThat(VerificarCompra.esCorrecto(), equalTo(mensaje))
                .orComplainWith(
                    ExcepcionGeneral.class, MensajeError.NO_EXISTE_MEDIO_PAGO.getMensajeError()));
  }
}
