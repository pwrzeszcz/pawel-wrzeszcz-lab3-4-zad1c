package travel;

import travel.exception.RoomTypeException;
import travel.exception.TermTypeException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VacationDataProvider
{
    private Scanner scanner = new Scanner(System.in);
    private List<Vacation> offers = new ArrayList<>();

    public List<Vacation> getData() throws RoomTypeException, TermTypeException
    {
        String userAnswer;

        while(true)
        {
            String country;
            String city;
            String hotelName;
            double baseRoomPrice;
            Room room;
            Term term;

            System.out.println("Type country name:");
            country = scanner.nextLine();

            System.out.println("Type city name:");
            city = scanner.nextLine();

            System.out.println("Type hotel name:");
            hotelName = scanner.nextLine();

            System.out.println("Type room type (Standard, Exclusive):");
            try
            {
                room = Room.valueOf(scanner.nextLine().toLowerCase());
            }
            catch (IllegalArgumentException e)
            {
                throw new RoomTypeException("Unknown room type provided");
            }

            System.out.println("Type base room price:");
            baseRoomPrice = Double.parseDouble(scanner.nextLine());

            System.out.println("Type term (winter, autumn, spring, summer):");
            try
            {
                term = Term.valueOf(scanner.nextLine().toLowerCase());
            }
            catch (IllegalArgumentException e)
            {
                throw new TermTypeException("Unknown term type provided");
            }

            Vacation offer = new Vacation(country, city, hotelName, baseRoomPrice, room, term);

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
