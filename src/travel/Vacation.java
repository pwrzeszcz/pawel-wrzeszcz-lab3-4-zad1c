package travel;

public class Vacation
{
    private String country;
    private String city;
    private String hotelName;
    private double baseRoomPrice;
    private Room room;
    private Term term;

    public double getPrice()
    {
        double priceFactor = getPriceFactor();

        return baseRoomPrice + baseRoomPrice * priceFactor;
    }

    private double getPriceFactor()
    {
        double priceFactor = 0.0;

        if (isRoomStandard() && isSeasonTerm())
        {
            priceFactor = 0.1;
        }
        else if(isRoomExclusive() && isSeasonTerm())
        {
            priceFactor = 0.2;
        }

        return priceFactor;
    }

    private boolean isRoomStandard()
    {
        return room == Room.Standard;
    }

    private boolean isRoomExclusive()
    {
        return room == Room.Exclusive;
    }

    private boolean isSeasonTerm()
    {
        return term == Term.Spring || term == Term.Summer;
    }
}
