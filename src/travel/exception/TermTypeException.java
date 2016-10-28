package travel.exception;

public class TermTypeException extends Throwable {
    private String message;

    public TermTypeException(String message)
    {
        this.message = message;
    }

    public String getMessage()
    {
        return message;
    }
}
