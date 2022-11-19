package LR1;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ex11
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Write name: ");
        String name = in.nextLine();

        System.out.println("Write year of birth: ");
        int year = in.nextInt();

        System.out.printf("Your name is %s, your age is %d", name, getAge(year));

        in.close();
    }

    public static int getAge(int year)
    {
        GregorianCalendar now = new GregorianCalendar();
        return now.getTime().getYear() + 1900 - year;
    }
}
