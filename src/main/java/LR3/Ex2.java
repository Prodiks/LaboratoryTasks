package LR3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2
{
    public static void main(String[] args)
    {
        Scanner id = new Scanner(System.in);
        System.out.println("Write name of day week: ");
        String input = id.next();

        dayWeek day;
        try
        {
            day = dayWeek.valueOf(input);
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("Invalid value");
            return;
        }

        System.out.printf("Number of day is: %d", day.ordinal()+1);
        id.close();
    }

    enum dayWeek
    {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday;
    }
}
