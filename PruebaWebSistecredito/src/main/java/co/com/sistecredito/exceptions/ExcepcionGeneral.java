package co.com.sistecredito.exceptions;

public class ExcepcionGeneral extends AssertionError {

  public ExcepcionGeneral(String message, Throwable cause) {
    super(message, cause);
  }
}
