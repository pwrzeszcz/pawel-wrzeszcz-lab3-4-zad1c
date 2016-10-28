package travel;

import travel.exception.RoomTypeException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VacationDataProvider
{
    private Scanner scanner = new Scanner(System.in);
    private List<Vacation> offers = new ArrayList<>();

    public List<Vacation> getData() throws RoomTypeException
    {
        String userAnswer;

        while(true)
        {
            Vacation offer = new Vacation();

            System.out.println("Type country name:");
            offer.setCountry(scanner.nextLine());

            System.out.println("Type city name:");
            offer.setCity(scanner.nextLine());

            System.out.println("Type hotel name:");
            offer.setHotelName(scanner.nextLine());

            System.out.println("Type room type (Standard, Exclusive):");
            try
            {
                offer.setRoom(Room.valueOf(scanner.nextLine().toLowerCase()));
            }
            catch (IllegalArgumentException e)
            {
                throw new RoomTypeException("Unknown room type provided");
            }

            System.out.println("Type base room price:");
            offer.setBaseRoomPrice(Double.parseDouble(scanner.nextLine()));

            System.out.println("Type term (winter, autumn, spring, summer):");
            try
            {
                offer.setTerm(Term.valueOf(scanner.nextLine().toLowerCase()));
            }
            catch (IllegalArgumentException e)
            {
                throw new RoomTypeException("Unknown term type provided");
            }

            offers.add(offer);

            System.out.println("Would you like to add next offer? (y/n)");
            userAnswer = scanner.nextLine();

            if (!userAnswer.equals("y"))
            {
               break;
            }
        }

        return offers;
    }
}
