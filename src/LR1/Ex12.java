package LR1;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ex12
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Write your age: ");
        int age = in.nextInt();

        System.out.printf("Year of birth is %d", getYearByAge(age));

        in.close();
    }

    public static int getYearByAge(int age)
    {
        GregorianCalendar now = new GregorianCalendar();
        return now.getTime().getYear() + 1900 - age;
    }
}
