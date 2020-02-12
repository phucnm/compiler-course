import java.lang.RuntimeException;

public class SemanticException
  extends RuntimeException {
    /**
   *
   */
  private static final long serialVersionUID = 1L;

  public SemanticException(String errorMessage) {
      super(errorMessage);
  }

  public SemanticException(String format, Object... args) {
    super(String.format(format, args));
  }
}