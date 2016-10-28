package travel.exception;

public class RoomTypeException extends Exception
{
    private String message;

    public RoomTypeException(String message)
    {
        this.message = message;
    }

    public String getMessage()
    {
        return message;
    }
}
