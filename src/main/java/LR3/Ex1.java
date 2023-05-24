package LR3;

import java.util.Scanner;

public class Ex1
{
    public static void main(String[] args)
    {
        System.out.println("Write number of day week: ");
        Scanner in = new Scanner(System.in);

        int numDay = in.nextInt();
        if((numDay < 1) || (numDay > 7))
        {
            System.out.println("Invalid value");
            return;
        }

        switch (numDay)
        {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;
        }

        in.close();
    }
}
