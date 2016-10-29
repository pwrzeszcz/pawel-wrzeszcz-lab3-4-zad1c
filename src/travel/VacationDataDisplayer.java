package travel;

import java.util.List;

public class VacationDataDisplayer
{
    public void display(List<Vacation> offers)
    {
        System.out.println("\nProvided offers details:\n");

        for (Vacation offer: offers)
        {
            System.out.println("Country: " + offer.getCountry());
            System.out.println("City: " + offer.getCity());
            System.out.println("Hotel: " + offer.getHotelName());
            System.out.println("Price: " + offer.getPrice());
            System.out.println("Term: " + offer.getTerm());
            System.out.println();
        }
    }
}
