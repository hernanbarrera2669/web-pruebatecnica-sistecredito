package co.com.sistecredito.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Despacho {
  private String departamento;
  private String ciudad;
  private String barrio;
  private String direccion;
  private String detalleDireccion;
}
