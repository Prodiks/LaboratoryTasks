package LR1;

import java.util.Scanner;

public class Ex9
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Write name of month: ");
        String nameMonth = in.nextLine();

        System.out.println("Write count of days in month");
        int countDays = in.nextInt();

        System.out.printf("%s contains %d days", nameMonth, countDays);

        in.close();
    }
}
