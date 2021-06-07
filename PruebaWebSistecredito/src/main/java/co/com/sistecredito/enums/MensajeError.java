package co.com.sistecredito.enums;

public enum MensajeError {
  NO_EXISTE_MEDIO_PAGO("No existe el medio de pago seleccionado");

  private final String mensajeError;

  MensajeError(String mensajeError) {
    this.mensajeError = mensajeError;
  }

  public String getMensajeError() {
    return mensajeError;
  }
}
