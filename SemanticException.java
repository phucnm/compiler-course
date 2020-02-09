import java.lang.RuntimeException;

public class SemanticException
  extends RuntimeException {
    public SemanticException(String errorMessage) {
        super(errorMessage);
    }
}