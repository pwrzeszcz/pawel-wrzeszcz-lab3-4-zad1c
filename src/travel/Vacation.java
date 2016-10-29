package travel;

public class Vacation
{
    private String country;
    private String city;
    private String hotelName;
    private double baseRoomPrice;
    private Room room;
    private Term term;

    public Vacation(String country, String city, String hotelName, double baseRoomPrice, Room room, Term term)
    {
        this.country = country;
        this.city = city;
        this.hotelName = hotelName;
        this.baseRoomPrice = baseRoomPrice;
        this.room = room;
        this.term = term;
    }

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
        return room == Room.standard;
    }

    private boolean isRoomExclusive()
    {
        return room == Room.exclusive;
    }

    private boolean isSeasonTerm()
    {
        return term == Term.spring || term == Term.summer;
    }

    public String getCountry()
    {
        return country;
    }

    public String getCity()
    {
        return city;
    }

    public String getHotelName()
    {
        return hotelName;
    }

    public double getBaseRoomPrice()
    {
        return baseRoomPrice;
    }

    public Room getRoom()
    {
        return room;
    }

    public Term getTerm()
    {
        return term;
    }
}
