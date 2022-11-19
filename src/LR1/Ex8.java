package LR1;

import java.util.Scanner;

public class Ex8
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Write day of the week: ");
        String dayWeek = in.nextLine();

        System.out.println("Write mounth: ");
        String month = in.nextLine();

        System.out.println("Write number of day in month:");
        int numDay = in.nextInt();

        System.out.printf("Today is %d %s, %s", numDay, month, dayWeek);

        in.close();
    }
}
