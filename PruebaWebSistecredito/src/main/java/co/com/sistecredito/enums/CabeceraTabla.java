package co.com.sistecredito.enums;

public enum CabeceraTabla {
  PRODUCTO("producto"),
  DEPARTAMENTO("departamento"),
  CIUDAD("ciudad"),
  BARRIO("barrio"),
  DIRECCION("direccion"),
  DETALLE_DIRECCION("detalleDireccion");

  private String value;

  CabeceraTabla(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
