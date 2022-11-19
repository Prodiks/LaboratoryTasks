package LR1;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ex10
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        GregorianCalendar now = new GregorianCalendar();

        System.out.println("Write year of bith: ");
        int yearBirth = in.nextInt();

        System.out.printf("Age is %d", now.getTime().getYear() + 1900 - yearBirth);

        in.close();
    }
}
