package travel.exception;

public class TermTypeException
{
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
