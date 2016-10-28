package travel;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class VacationDataWriter
{
    public void saveToFile(String filename, List<Vacation> offers)
    {
        try
        {
            PrintWriter writer = new PrintWriter("Offers.txt");

            for (Vacation offer: offers)
            {
                writer.println("Country: " + offer.getCountry());
                writer.println("City: " + offer.getCity());
                writer.println("Hotel: " + offer.getHotelName());
                writer.println("Price: " + offer.getPrice());
                writer.println("Term: " + offer.getTerm());
                writer.println();
            }

            writer.close();
        }
        catch(FileNotFoundException e)
        {
            e.getMessage();
        }
    }
}
