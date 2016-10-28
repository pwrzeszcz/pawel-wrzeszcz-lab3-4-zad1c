package travel;

import java.util.ArrayList;
import java.util.List;

public class TravelAgency
{
    public static void main(String[] args)
    {
        VacationDataProvider provider = new VacationDataProvider();
        VacationDataDisplayer displayer = new VacationDataDisplayer();
        VacationDataWriter writer = new VacationDataWriter();
        List<Vacation> offers = new ArrayList<>();

        try
        {
            offers = provider.getData();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            if (offers.size() > 0)
            {
                displayer.display(offers);
                writer.saveToFile("Offers.txt", offers);
            }
            else
            {
                System.out.println("No offers to show and save");
            }
        }
    }
}
