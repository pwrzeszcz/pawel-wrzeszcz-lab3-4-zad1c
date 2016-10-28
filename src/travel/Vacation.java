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

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getHotelName()
    {
        return hotelName;
    }

    public void setHotelName(String hotelName)
    {
        this.hotelName = hotelName;
    }

    public double getBaseRoomPrice()
    {
        return baseRoomPrice;
    }

    public void setBaseRoomPrice(double baseRoomPrice)
    {
        this.baseRoomPrice = baseRoomPrice;
    }

    public Room getRoom()
    {
        return room;
    }

    public void setRoom(Room room)
    {
        this.room = room;
    }

    public Term getTerm()
    {
        return term;
    }

    public void setTerm(Term term)
    {
        this.term = term;
    }
}
